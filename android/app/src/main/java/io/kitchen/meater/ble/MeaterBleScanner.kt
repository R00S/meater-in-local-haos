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
 * Scanning approach adapted from grgcmz/BLEScanner (MIT, Giorgio Camozzi 2023):
 *  - Every scan result — including duplicates for the same MAC — is forwarded to [onDeviceFound].
 *    The caller (ViewModel) is responsible for de-duplication and name-accumulation.
 *  - This is critical for MEATER+: the Block sends its name in a SCAN_RSP packet, which arrives
 *    as a *second* onScanResult callback after the initial ADV_IND (often nameless) packet.
 *    If we drop duplicates here, the name is never captured.
 *  - RSSI is included so the UI can sort by signal strength.
 *  - MEATER devices are flagged by name ("MEATER") or Apption Labs OUI (B8:1F:5E / 90:21:2E,
 *    IEEE-verified 2026-05-25).
 */
class MeaterBleScanner(
    private val onDeviceFound: (BleDevice) -> Unit,
    private val onError: (String) -> Unit
) {
    private val mainHandler = Handler(Looper.getMainLooper())

    // Use BluetoothManager to get adapter (BluetoothAdapter.getDefaultAdapter() is deprecated)
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
            // Report duplicates so SCAN_RSP packets (which carry the device name) are not dropped
            .setCallbackType(ScanSettings.CALLBACK_TYPE_ALL_MATCHES)
            .build()

        val cb = object : ScanCallback() {
            override fun onScanResult(callbackType: Int, result: ScanResult) {
                // Prefer scanRecord name (no permission needed) over device.name (needs CONNECT)
                val name = result.scanRecord?.deviceName
                    ?: result.device.name
                    ?: ""
                val address = result.device.address
                val rssi = result.rssi
                val isMeater = name.contains("MEATER", ignoreCase = true)
                    || address.startsWith("B8:1F:5E", ignoreCase = true)
                    || address.startsWith("90:21:2E", ignoreCase = true)
                val device = BleDevice(
                    name = name.ifEmpty { address },
                    address = address,
                    rssi = rssi,
                    isMeaterDevice = isMeater
                )
                mainHandler.post { onDeviceFound(device) }
            }

            override fun onScanFailed(errorCode: Int) {
                mainHandler.post { onError("BLE scan failed: $errorCode") }
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
