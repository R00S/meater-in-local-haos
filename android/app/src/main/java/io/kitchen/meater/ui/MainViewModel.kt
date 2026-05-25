package io.kitchen.meater.ui

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import io.kitchen.meater.ble.MeaterBleScanner

data class MainUiState(
    val isScanning: Boolean = false,
    val discoveredDevices: List<String> = emptyList(),
    val status: String = "Ready"
)

class MainViewModel : ViewModel() {
    var uiState by mutableStateOf(MainUiState())
        private set

    private val scanner = MeaterBleScanner(
        onDeviceFound = { name, address ->
            val entry = "$name ($address)"
            if (!uiState.discoveredDevices.contains(entry)) {
                uiState = uiState.copy(discoveredDevices = uiState.discoveredDevices + entry)
            }
        },
        onError = { message ->
            uiState = uiState.copy(status = message, isScanning = false)
        }
    )

    fun startScan(context: Context) {
        uiState = uiState.copy(isScanning = true, status = "Scanning for MEATER Block...")
        scanner.start(context)
    }

    fun stopScan() {
        scanner.stop()
        uiState = uiState.copy(isScanning = false, status = "Scan stopped")
    }
}
