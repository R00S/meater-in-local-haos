package io.kitchen.meater.ble

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.content.Context
import android.content.pm.PackageManager
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
            val name = result.device.name ?: result.scanRecord?.deviceName ?: return
            if (name.contains("MEATER", ignoreCase = true)) {
                onDeviceFound(BleDevice(name = name, address = result.device.address))
            }
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

        scanner?.startScan(callback)
    }

    @SuppressLint("MissingPermission")
    fun stop() {
        scanner?.stopScan(callback)
    }
}
