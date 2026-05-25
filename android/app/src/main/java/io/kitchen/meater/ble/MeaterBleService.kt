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
import androidx.core.content.ContextCompat
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
    private val onTemperature: (probeIndex: Int, tipCelsius: Float, ambientCelsius: Float) -> Unit,
    private val onBattery: (probeIndex: Int, percent: Int) -> Unit,
    private val onDisconnected: () -> Unit,
    private val onError: (String) -> Unit
) {
    private var gatt: BluetoothGatt? = null

    @SuppressLint("MissingPermission")
    fun connect(context: Context, deviceAddress: String) {
        val appContext = context.applicationContext

        if (!hasBluetoothConnectPermission(appContext)) {
            onError("BLUETOOTH_CONNECT permission not granted")
            return
        }

        val manager = appContext.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        val adapter: BluetoothAdapter = manager.adapter ?: run {
            onError("Bluetooth adapter unavailable")
            return
        }

        val device = runCatching { adapter.getRemoteDevice(deviceAddress) }.getOrNull()
        if (device == null) {
            onError("Invalid BLE device address")
            return
        }

        disconnect()
        onStatus("Connecting to $deviceAddress …")
        gatt = device.connectGatt(appContext, false, callback, BluetoothDeviceTransport.LE)
    }

    @SuppressLint("MissingPermission")
    fun disconnect() {
        gatt?.disconnect()
        gatt?.close()
        gatt = null
    }

    private val callback = object : BluetoothGattCallback() {
        @SuppressLint("MissingPermission")
        override fun onConnectionStateChange(gatt: BluetoothGatt, status: Int, newState: Int) {
            if (status != BluetoothGatt.GATT_SUCCESS) {
                onError("GATT connection error: $status")
                gatt.close()
                this@MeaterBleService.gatt = null
                onDisconnected()
                return
            }

            when (newState) {
                BluetoothGatt.STATE_CONNECTED -> {
                    onStatus("Connected. Discovering services …")
                    gatt.discoverServices()
                }
                BluetoothGatt.STATE_DISCONNECTED -> {
                    onStatus("Disconnected")
                    gatt.close()
                    this@MeaterBleService.gatt = null
                    onDisconnected()
                }
            }
        }

        @SuppressLint("MissingPermission")
        override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
            if (status != BluetoothGatt.GATT_SUCCESS) {
                onError("Service discovery failed: $status")
                return
            }

            // The Block may expose the same service multiple times (once per probe slot).
            // We enumerate all instances and register for each.
            val meaterServices = gatt.services.filter { it.uuid == MEATER_SERVICE_UUID }

            if (meaterServices.isEmpty()) {
                onError("MEATER service not found")
                return
            }

            meaterServices.forEachIndexed { probeIndex, service ->
                val tempChar = service.getCharacteristic(TEMPERATURE_CHARACTERISTIC_UUID)
                val battChar = service.getCharacteristic(BATTERY_CHARACTERISTIC_UUID)

                tempChar?.let { enableNotifications(gatt, it) }
                battChar?.let { enableNotifications(gatt, it) }
                tempChar?.let { gatt.readCharacteristic(it) }
                battChar?.let { gatt.readCharacteristic(it) }
            }

            onStatus("Connected (${meaterServices.size} probe slot${if (meaterServices.size != 1) "s" else ""})")
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
        }
    }

    @SuppressLint("MissingPermission")
    private fun enableNotifications(
        gatt: BluetoothGatt,
        characteristic: BluetoothGattCharacteristic
    ) {
        gatt.setCharacteristicNotification(characteristic, true)
        val cccd = characteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG_UUID) ?: return
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
                onTemperature(probeIndex, decoded.tipCelsius, decoded.ambientCelsius)
            }
            BATTERY_CHARACTERISTIC_UUID -> {
                val percent = decodeBattery(value)
                onBattery(probeIndex, percent)
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

    private fun toCelsius(raw: Int): Int = when {
        raw > 0 -> (raw + 8) / 32
        raw < 0 -> (raw - 8) / 32
        else    -> 0
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
    }
}
