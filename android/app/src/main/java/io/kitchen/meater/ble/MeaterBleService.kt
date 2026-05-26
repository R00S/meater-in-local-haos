package io.kitchen.meater.ble

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCallback
import android.bluetooth.BluetoothGattCharacteristic
import android.bluetooth.BluetoothGattDescriptor
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Handler
import android.os.Looper
import androidx.core.content.ContextCompat
import java.util.ArrayDeque
import java.util.UUID
import kotlin.math.max
import kotlin.math.min

/**
 * BLE GATT client for the MEATER+ Block.
 *
 * Connects to the Block (not directly to the probe). The Block relays probe data
 * through its GATT services. Callbacks include a probeIndex (0-based) to support
 * multi-probe monitoring once Block multi-probe GATT enumeration is implemented.
 *
 * References:
 *  - halted-ble-server-dev/MEATER_BLE_PROTOCOL.md
 *  - docs/ANDROID_APP_TOR.md §4.1
 */
class MeaterBleService(
    private val onStatus: (String) -> Unit,
    private val onConnected: () -> Unit,
    private val onTemperature: (probeIndex: Int, tipCelsius: Float, ambientCelsius: Float) -> Unit,
    private val onBattery: (probeIndex: Int, percent: Int) -> Unit,
    private val onDisconnected: () -> Unit,
    private val onError: (String) -> Unit
) {
    private var gatt: BluetoothGatt? = null
    private val mainHandler = Handler(Looper.getMainLooper())

    // ── GATT operation queue ─────────────────────────────────────────────────
    // Android BLE only processes one GATT operation at a time.  Queue them here
    // and call runNextGattOp() from each completion callback.
    private val gattOpQueue = ArrayDeque<(BluetoothGatt) -> Unit>()
    private var gattOpRunning = false

    private fun enqueueGattOp(op: (BluetoothGatt) -> Unit) {
        gattOpQueue.add(op)
        if (!gattOpRunning) runNextGattOp()
    }

    private fun runNextGattOp() {
        val g = gatt ?: run { gattOpRunning = false; return }
        val op = gattOpQueue.pollFirst() ?: run { gattOpRunning = false; return }
        gattOpRunning = true
        op(g)
    }

    // ── BLE keepalive ────────────────────────────────────────────────────────
    // The MEATER probe sends no GATT notifications while idle (not in meat).
    // Without periodic GATT traffic the link supervision timeout (~1 minute on
    // most devices) fires and Android drops the connection.  A battery read
    // every KEEPALIVE_INTERVAL_MS is cheap and keeps the link alive.
    private val keepaliveRunnable = object : Runnable {
        override fun run() {
            pingKeepalive()
            mainHandler.postDelayed(this, KEEPALIVE_INTERVAL_MS)
        }
    }

    @SuppressLint("MissingPermission")
    private fun pingKeepalive() {
        val g = gatt ?: return
        val service = g.services.firstOrNull { it.uuid == MEATER_SERVICE_UUID } ?: return
        val battChar = service.getCharacteristic(BATTERY_CHARACTERISTIC_UUID) ?: return
        enqueueGattOp { it.readCharacteristic(battChar) }
    }


    @SuppressLint("MissingPermission")
    fun connect(context: Context, deviceAddress: String) {
        val appContext = context.applicationContext

        if (!hasBluetoothConnectPermission(appContext)) {
            mainHandler.post { onError("BLUETOOTH_CONNECT permission not granted") }
            return
        }

        val manager = appContext.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        val adapter: BluetoothAdapter = manager.adapter ?: run {
            mainHandler.post { onError("Bluetooth adapter unavailable") }
            return
        }

        val device = runCatching { adapter.getRemoteDevice(deviceAddress) }.getOrNull()
        if (device == null) {
            mainHandler.post { onError("Invalid BLE device address") }
            return
        }

        disconnect()
        mainHandler.post { onStatus("Connecting to $deviceAddress …") }
        gatt = device.connectGatt(appContext, false, callback, BluetoothDeviceTransport.LE)
    }

    @SuppressLint("MissingPermission")
    fun disconnect() {
        mainHandler.removeCallbacks(keepaliveRunnable)
        gattOpQueue.clear()
        gattOpRunning = false
        gatt?.disconnect()
        gatt?.close()
        gatt = null
    }

    private val callback = object : BluetoothGattCallback() {
        @SuppressLint("MissingPermission")
        override fun onConnectionStateChange(gatt: BluetoothGatt, status: Int, newState: Int) {
            if (status != BluetoothGatt.GATT_SUCCESS) {
                mainHandler.post {
                    onError("GATT connection error: $status")
                    gatt.close()
                    this@MeaterBleService.gatt = null
                    onDisconnected()
                }
                return
            }

            when (newState) {
                BluetoothGatt.STATE_CONNECTED -> {
                    mainHandler.post { onStatus("Connected. Discovering services …") }
                    gatt.discoverServices()
                }
                BluetoothGatt.STATE_DISCONNECTED -> {
                    mainHandler.post {
                        onStatus("Disconnected")
                        gatt.close()
                        this@MeaterBleService.gatt = null
                        onDisconnected()
                    }
                }
            }
        }

        @SuppressLint("MissingPermission")
        override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
            if (status != BluetoothGatt.GATT_SUCCESS) {
                mainHandler.post { onError("Service discovery failed: $status") }
                return
            }

            // The Block may expose the same service multiple times (once per probe slot).
            // We enumerate all instances and register for each.
            val meaterServices = gatt.services.filter { it.uuid == MEATER_SERVICE_UUID }

            if (meaterServices.isEmpty()) {
                mainHandler.post { onError("MEATER service not found") }
                return
            }

            // Queue all GATT operations sequentially (Android only handles one at a time).
            meaterServices.forEachIndexed { _, service ->
                val tempChar = service.getCharacteristic(TEMPERATURE_CHARACTERISTIC_UUID)
                val battChar = service.getCharacteristic(BATTERY_CHARACTERISTIC_UUID)

                // 1. Enable temp notifications
                tempChar?.let { c -> enqueueGattOp { g -> enableNotifications(g, c) } }
                // 2. Enable battery notifications
                battChar?.let { c -> enqueueGattOp { g -> enableNotifications(g, c) } }
                // 3. Read battery immediately (one initial value before notifications arrive)
                battChar?.let { c -> enqueueGattOp { g -> g.readCharacteristic(c) } }
            }

            val count = meaterServices.size
            mainHandler.post {
                onStatus("Connected ($count probe slot${if (count != 1) "s" else ""})")
                onConnected()
            }
            // Start keepalive pings so the link stays up while the probe is idle.
            mainHandler.postDelayed(keepaliveRunnable, KEEPALIVE_INTERVAL_MS)
        }

        // Advance the queue after each descriptor write completes.
        override fun onDescriptorWrite(
            gatt: BluetoothGatt,
            descriptor: BluetoothGattDescriptor,
            status: Int
        ) {
            runNextGattOp()
        }

        @Deprecated("Deprecated in Java")
        override fun onCharacteristicChanged(
            gatt: BluetoothGatt,
            characteristic: BluetoothGattCharacteristic
        ) {
            handleCharacteristic(gatt, characteristic.uuid, characteristic.value)
        }

        @Deprecated("Deprecated in Java")
        override fun onCharacteristicRead(
            gatt: BluetoothGatt,
            characteristic: BluetoothGattCharacteristic,
            status: Int
        ) {
            if (status == BluetoothGatt.GATT_SUCCESS) {
                handleCharacteristic(gatt, characteristic.uuid, characteristic.value)
            }
            // Advance the queue regardless of success/failure.
            runNextGattOp()
        }
    }

    @SuppressLint("MissingPermission")
    private fun enableNotifications(
        gatt: BluetoothGatt,
        characteristic: BluetoothGattCharacteristic
    ) {
        gatt.setCharacteristicNotification(characteristic, true)
        val cccd = characteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG_UUID) ?: run {
            // No CCCD — nothing to write; advance the queue immediately.
            runNextGattOp()
            return
        }
        cccd.value = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
        gatt.writeDescriptor(cccd)
    }

    private fun handleCharacteristic(gatt: BluetoothGatt, uuid: UUID, value: ByteArray?) {
        if (value == null) return

        // Resolve probe index from which service instance owns this characteristic
        val probeIndex = resolveProbeIndex(gatt, uuid)

        when (uuid) {
            TEMPERATURE_CHARACTERISTIC_UUID -> {
                val decoded = decodeTemperature(value) ?: return
                mainHandler.post { onTemperature(probeIndex, decoded.tipCelsius, decoded.ambientCelsius) }
            }
            BATTERY_CHARACTERISTIC_UUID -> {
                val percent = decodeBattery(value)
                mainHandler.post { onBattery(probeIndex, percent) }
            }
        }
    }

    /** Find which service instance (0-based) this characteristic belongs to. */
    private fun resolveProbeIndex(gatt: BluetoothGatt, charUuid: UUID): Int {
        val meaterServices = gatt.services.filter { it.uuid == MEATER_SERVICE_UUID }
        meaterServices.forEachIndexed { index, service ->
            if (service.getCharacteristic(charUuid) != null) return index
        }
        return 0
    }

    private fun hasBluetoothConnectPermission(context: Context): Boolean =
        ContextCompat.checkSelfPermission(
            context, Manifest.permission.BLUETOOTH_CONNECT
        ) == PackageManager.PERMISSION_GRANTED

    private data class DecodedTemperature(val tipCelsius: Float, val ambientCelsius: Float)

    private fun decodeTemperature(payload: ByteArray): DecodedTemperature? {
        if (payload.size < 6) return null

        val tipRaw = u16(payload[0], payload[1])
        val raRaw  = u16(payload[2], payload[3])
        val oaRaw  = u16(payload[4], payload[5])

        val ambientRaw = tipRaw + max(0f, ((raRaw - min(48, oaRaw)) * 9424f) / 1487f).toInt()

        return DecodedTemperature(
            tipCelsius     = toCelsius(tipRaw).toFloat(),
            ambientCelsius = toCelsius(ambientRaw).toFloat()
        )
    }

    private fun decodeBattery(payload: ByteArray): Int {
        if (payload.size < 2) return 0
        return (u16(payload[0], payload[1]) * 10).coerceIn(0, 100)
    }

    // Mirrors the algorithm in meater.yaml (and nathanfaber/meaterble):
    //   tip_celsius = (x[0] + (x[1] << 8) + 8.0) / 16.0
    // The previous /32 divisor produced exactly half the real Celsius value
    // (e.g. boiling water tip reading ~30–47 °C instead of ~95–100 °C).
    private fun toCelsius(raw: Int): Float = when {
        raw > 0 -> (raw + 8) / 16f
        raw < 0 -> (raw - 8) / 16f
        else    -> 0f
    }

    private fun u16(low: Byte, high: Byte): Int =
        (low.toInt() and 0xFF) + ((high.toInt() and 0xFF) shl 8)

    private object BluetoothDeviceTransport {
        const val LE = 2
    }

    companion object {
        val MEATER_SERVICE_UUID: UUID =
            UUID.fromString("a75cc7fc-c956-488f-ac2a-2dbc08b63a04")
        val TEMPERATURE_CHARACTERISTIC_UUID: UUID =
            UUID.fromString("7edda774-045e-4bbf-909b-45d1991a2876")
        val BATTERY_CHARACTERISTIC_UUID: UUID =
            UUID.fromString("2adb4877-68d8-4884-bd3c-d83853bf27b8")
        val CLIENT_CHARACTERISTIC_CONFIG_UUID: UUID =
            UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")
        /** Interval between keepalive battery reads to prevent idle link supervision timeout. */
        const val KEEPALIVE_INTERVAL_MS = 15_000L
    }
}
