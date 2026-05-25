package io.kitchen.meater.ble

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.bluetooth.le.ScanSettings
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
            val name = result.device.name
                ?: result.scanRecord?.deviceName
                ?: ""
            val address = result.device.address  // format: "XX:XX:XX:XX:XX:XX"

            // Three independent ways to recognise an Apption Labs / MEATER device:
            //   1. Service UUID in the advertising packet (bare probe when not Block-connected)
            //   2. Device name starts with "MEATER" (Block advertises as "MEATER+")
            //   3. MAC OUI matches a registered Apption Labs prefix (IEEE OUI database,
            //      verified 2026-05-25: B8:1F:5E = Apption Labs Limited,
            //                           90:21:2E = Apption Labs Ltd)
            val advertisedUuids = result.scanRecord?.serviceUuids
            val hasMeaterUuid = advertisedUuids?.any {
                it.uuid == MeaterBleService.MEATER_SERVICE_UUID
            } == true
            val hasMeaterName = name.startsWith("MEATER", ignoreCase = true)
            val hasApptionOui = address.startsWith("B8:1F:5E", ignoreCase = true) ||
                                address.startsWith("90:21:2E", ignoreCase = true)

            if (!hasMeaterUuid && !hasMeaterName && !hasApptionOui) return

            val displayName = name.ifEmpty { address }
            onDeviceFound(BleDevice(name = displayName, address = address))
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

        // Scan with no hardware filter so both the Block (name-only advertisement) and
        // the probe (service UUID advertisement) are returned. Filtering happens in the callback.
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
