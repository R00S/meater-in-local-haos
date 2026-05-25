package io.kitchen.meater.ble

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.bluetooth.le.ScanSettings
import android.content.Context
import android.content.pm.PackageManager
import android.os.Handler
import android.os.Looper
import androidx.core.content.ContextCompat
import io.kitchen.meater.model.BleDevice

/**
 * BLE scanner that surfaces every nearby device so the user can pick their MEATER+ Block.
 *
 * Pattern copied from grgcmz/BLEScanner (MIT, Giorgio Camozzi 2023):
 *  - [onDeviceFound] is called directly from the BLE callback thread — no Handler.post().
 *    The caller (ViewModel) uses Compose mutableStateListOf which is thread-safe and
 *    triggers recomposition without needing to marshal back to the main thread.
 *  - Every scan result including duplicates is forwarded (no dedup here) so that
 *    SCAN_RSP packets carrying the MEATER+ name are not dropped.
 *  - @SuppressLint("MissingPermission") is placed directly on onScanResult, matching
 *    the grgcmz/santansarah pattern — permissions are checked once before startScan.
 *  - MEATER devices are flagged by name or Apption Labs OUI (B8:1F:5E / 90:21:2E).
 */
class MeaterBleScanner(
    private val onDeviceFound: (BleDevice) -> Unit,
    private val onError: (String) -> Unit
) {
    private val mainHandler = Handler(Looper.getMainLooper())

    private fun getAdapter(context: Context): BluetoothAdapter? =
        (context.getSystemService(Context.BLUETOOTH_SERVICE) as? BluetoothManager)?.adapter

    private var scanCallback: ScanCallback? = null

    @SuppressLint("MissingPermission")
    fun start(context: Context) {
        val adapter = getAdapter(context)
        if (adapter == null || !adapter.isEnabled) {
            mainHandler.post { onError("Bluetooth is not available or disabled") }
            return
        }
        if (ContextCompat.checkSelfPermission(context, Manifest.permission.BLUETOOTH_SCAN)
                != PackageManager.PERMISSION_GRANTED) {
            mainHandler.post { onError("BLUETOOTH_SCAN permission not granted") }
            return
        }

        val settings = ScanSettings.Builder()
            .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
            .build()

        val cb = object : ScanCallback() {
            // @SuppressLint placed here, matching grgcmz/BLEScanner and santansarah/ble-scanner —
            // permissions are already verified above; annotation suppresses the IDE warning only.
            @SuppressLint("MissingPermission")
            override fun onScanResult(callbackType: Int, result: ScanResult) {
                val address = result.device.address
                // Use device.name (requires BLUETOOTH_CONNECT, granted at startup).
                // scanRecord.deviceName is a secondary fallback for the rare case where
                // CONNECT is unavailable — both reference apps use device.name directly.
                val name = result.device.name
                    ?: result.scanRecord?.deviceName
                    ?: ""
                val isMeater = name.contains("MEATER", ignoreCase = true)
                    || address.startsWith("B8:1F:5E", ignoreCase = true)
                    || address.startsWith("90:21:2E", ignoreCase = true)
                // Call directly on BLE callback thread — caller uses mutableStateListOf
                // which is thread-safe (Compose snapshot state), same as grgcmz pattern.
                onDeviceFound(
                    BleDevice(
                        name = name.ifEmpty { address },
                        address = address,
                        rssi = result.rssi,
                        isMeaterDevice = isMeater
                    )
                )
            }

            override fun onScanFailed(errorCode: Int) {
                // Error code 2 = SCAN_FAILED_ALREADY_STARTED: stop and restart (santansarah pattern)
                if (errorCode == 2) { stop(); start(context) }
                else mainHandler.post { onError("BLE scan failed: $errorCode") }
            }
        }

        scanCallback = cb
        adapter.bluetoothLeScanner?.startScan(null, settings, cb)
            ?: mainHandler.post { onError("BLE LE scanner unavailable") }
    }

    @SuppressLint("MissingPermission")
    fun stop(context: Context? = null) {
        val cb = scanCallback ?: return
        scanCallback = null
        try {
            val adapter = if (context != null) getAdapter(context)
                         else BluetoothAdapter.getDefaultAdapter()
            adapter?.bluetoothLeScanner?.stopScan(cb)
        } catch (_: Exception) { /* adapter gone, scan already dead */ }
    }
}
