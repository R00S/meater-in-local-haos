package io.kitchen.meater.ble

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.bluetooth.le.ScanSettings
import android.content.Context
import android.content.pm.PackageManager
import android.os.Handler
import android.os.Looper
import androidx.core.content.ContextCompat
import io.kitchen.meater.model.BleDevice

class MeaterBleScanner(
    private val onDeviceFound: (BleDevice) -> Unit,
    private val onError: (String) -> Unit
) {
    private val adapter: BluetoothAdapter? = BluetoothAdapter.getDefaultAdapter()
    private val scanner get() = adapter?.bluetoothLeScanner
    private val mainHandler = Handler(Looper.getMainLooper())

    private val callback = object : ScanCallback() {
        override fun onScanResult(callbackType: Int, result: ScanResult) {
            val name = result.device.name
                ?: result.scanRecord?.deviceName
                ?: ""
            val address = result.device.address  // format: "XX:XX:XX:XX:XX:XX"
            // Show all BLE devices — the user picks their MEATER+ from the list.
            val displayName = name.ifEmpty { address }
            val device = BleDevice(name = displayName, address = address)
            mainHandler.post { onDeviceFound(device) }
        }

        override fun onScanFailed(errorCode: Int) {
            mainHandler.post { onError("BLE scan failed: $errorCode") }
        }
    }

    @SuppressLint("MissingPermission")
    fun start(context: Context) {
        if (adapter == null || scanner == null) {
            mainHandler.post { onError("Bluetooth LE is not available on this device") }
            return
        }
        if (!adapter.isEnabled) {
            mainHandler.post { onError("Bluetooth is disabled") }
            return
        }

        if (ContextCompat.checkSelfPermission(context, Manifest.permission.BLUETOOTH_SCAN) != PackageManager.PERMISSION_GRANTED) {
            mainHandler.post { onError("BLUETOOTH_SCAN permission not granted") }
            return
        }

        // No hardware filter — all BLE devices are returned so the user can
        // pick their "MEATER+" from the list.
        val settings = ScanSettings.Builder()
            .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
            .build()
        scanner?.startScan(null, settings, callback)
    }

    @SuppressLint("MissingPermission")
    fun stop() {
        scanner?.stopScan(callback)
    }
}
