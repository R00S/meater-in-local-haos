package io.kitchen.meater.ble

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCallback
import android.bluetooth.BluetoothGattCharacteristic
import android.bluetooth.BluetoothGattDescriptor
import android.bluetooth.BluetoothGattService
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import java.util.UUID
import kotlin.math.max
import kotlin.math.min

class MeaterBleService(
    private val onStatus: (String) -> Unit,
    private val onTemperature: (tipCelsius: Float, ambientCelsius: Float) -> Unit,
    private val onBattery: (percent: Int) -> Unit,
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

            val service = gatt.getService(MEATER_SERVICE_UUID)
            if (service == null) {
                onError("MEATER service not found")
                return
            }

            val temperatureChar = service.getCharacteristic(TEMPERATURE_CHARACTERISTIC_UUID)
            val batteryChar = service.getCharacteristic(BATTERY_CHARACTERISTIC_UUID)

            if (temperatureChar == null || batteryChar == null) {
                onError("Required MEATER characteristics not found")
                return
            }

            enableNotifications(gatt, temperatureChar)
            enableNotifications(gatt, batteryChar)
            gatt.readCharacteristic(temperatureChar)
            gatt.readCharacteristic(batteryChar)
            onStatus("Connected")
        }

        @Deprecated("Deprecated in Java")
        override fun onCharacteristicChanged(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic) {
            handleCharacteristicValue(characteristic.uuid, characteristic.value)
        }

        @Deprecated("Deprecated in Java")
        override fun onCharacteristicRead(
            gatt: BluetoothGatt,
            characteristic: BluetoothGattCharacteristic,
            status: Int
        ) {
            if (status == BluetoothGatt.GATT_SUCCESS) {
                handleCharacteristicValue(characteristic.uuid, characteristic.value)
            }
        }
    }

    @SuppressLint("MissingPermission")
    private fun enableNotifications(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic) {
        gatt.setCharacteristicNotification(characteristic, true)
        val cccd = characteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG_UUID) ?: return
        cccd.value = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
        gatt.writeDescriptor(cccd)
    }

    private fun handleCharacteristicValue(uuid: UUID, value: ByteArray?) {
        if (value == null) return

        when (uuid) {
            TEMPERATURE_CHARACTERISTIC_UUID -> {
                val reading = decodeTemperature(value) ?: return
                onTemperature(reading.tipCelsius, reading.ambientCelsius)
            }

            BATTERY_CHARACTERISTIC_UUID -> {
                val percent = decodeBattery(value)
                onBattery(percent)
            }
        }
    }

    private fun hasBluetoothConnectPermission(context: Context): Boolean {
        return ContextCompat.checkSelfPermission(context, Manifest.permission.BLUETOOTH_CONNECT) == PackageManager.PERMISSION_GRANTED
    }

    private data class DecodedTemperature(val tipCelsius: Float, val ambientCelsius: Float)

    private fun decodeTemperature(payload: ByteArray): DecodedTemperature? {
        if (payload.size < 6) return null

        val tipRaw = u16(payload[0], payload[1])
        val raRaw = u16(payload[2], payload[3])
        val oaRaw = u16(payload[4], payload[5])

        val ambientRaw = tipRaw + max(0f, ((raRaw - min(48, oaRaw)) * 9424f) / 1487f).toInt()

        val tipCelsius = toCelsius(tipRaw).toFloat()
        val ambientCelsius = toCelsius(ambientRaw).toFloat()
        return DecodedTemperature(tipCelsius = tipCelsius, ambientCelsius = ambientCelsius)
    }

    private fun decodeBattery(payload: ByteArray): Int {
        if (payload.size < 2) return 0
        val raw = u16(payload[0], payload[1])
        return (raw * 10).coerceIn(0, 100)
    }

    private fun toCelsius(raw: Int): Int {
        return when {
            raw > 0 -> (raw + 8) / 32
            raw < 0 -> (raw - 8) / 32
            else -> 0
        }
    }

    private fun u16(low: Byte, high: Byte): Int {
        return (low.toInt() and 0xFF) + ((high.toInt() and 0xFF) shl 8)
    }

    private object BluetoothDeviceTransport {
        const val LE = 2
    }

    companion object {
        val MEATER_SERVICE_UUID: UUID = UUID.fromString("a75cc7fc-c956-488f-ac2a-2dbc08b63a04")
        val TEMPERATURE_CHARACTERISTIC_UUID: UUID = UUID.fromString("7edda774-045e-4bbf-909b-45d1991a2876")
        val BATTERY_CHARACTERISTIC_UUID: UUID = UUID.fromString("2adb4877-68d8-4884-bd3c-d83853bf27b8")
        val CLIENT_CHARACTERISTIC_CONFIG_UUID: UUID = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")
    }
}
