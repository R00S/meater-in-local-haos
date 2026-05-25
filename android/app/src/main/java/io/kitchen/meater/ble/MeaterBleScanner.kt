package io.kitchen.meater.ble

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanFilter
import android.bluetooth.le.ScanResult
import android.bluetooth.le.ScanSettings
import android.content.Context
import android.content.pm.PackageManager
import android.os.ParcelUuid
import androidx.core.content.ContextCompat
import io.kitchen.meater.model.BleDevice

class MeaterBleScanner(
    private val onDeviceFound: (BleDevice) -> Unit,
    private val onError: (String) -> Unit
) {
    private val adapter: BluetoothAdapter? = BluetoothAdapter.getDefaultAdapter()
    private val scanner get() = adapter?.bluetoothLeScanner

    private val callback = object : ScanCallback() {
        override fun onScanResult(callbackType: Int, result: ScanResult) {
            // Identify the device by service UUID (same as ESP32 ble_client approach),
            // not by name — the name may be absent from the primary advertising packet.
            val name = result.device.name
                ?: result.scanRecord?.deviceName
                ?: result.device.address
            onDeviceFound(BleDevice(name = name, address = result.device.address))
        }

        override fun onScanFailed(errorCode: Int) {
            onError("BLE scan failed: $errorCode")
        }
    }

    @SuppressLint("MissingPermission")
    fun start(context: Context) {
        if (adapter == null || scanner == null) {
            onError("Bluetooth LE is not available on this device")
            return
        }
        if (!adapter.isEnabled) {
            onError("Bluetooth is disabled")
            return
        }

        if (ContextCompat.checkSelfPermission(context, Manifest.permission.BLUETOOTH_SCAN) != PackageManager.PERMISSION_GRANTED) {
            onError("BLUETOOTH_SCAN permission not granted")
            return
        }

        val filter = ScanFilter.Builder()
            .setServiceUuid(ParcelUuid.fromString(MeaterBleService.MEATER_SERVICE_UUID.toString()))
            .build()
        val settings = ScanSettings.Builder()
            .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
            .build()
        scanner?.startScan(listOf(filter), settings, callback)
    }

    @SuppressLint("MissingPermission")
    fun stop() {
        scanner?.stopScan(callback)
    }
}
