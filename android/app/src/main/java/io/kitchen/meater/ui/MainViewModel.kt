package io.kitchen.meater.ui

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import io.kitchen.meater.ble.MeaterBleScanner
import io.kitchen.meater.ble.MeaterBleService
import io.kitchen.meater.model.BleDevice

data class MainUiState(
    val isScanning: Boolean = false,
    val discoveredDevices: List<BleDevice> = emptyList(),
    val selectedDeviceAddress: String? = null,
    val connectedDeviceAddress: String? = null,
    val isConnected: Boolean = false,
    val status: String = "Ready",
    val tipCelsius: Float? = null,
    val ambientCelsius: Float? = null,
    val batteryPercent: Int? = null
)

class MainViewModel : ViewModel() {
    var uiState by mutableStateOf(MainUiState())
        private set

    private val scanner = MeaterBleScanner(
        onDeviceFound = { device ->
            if (uiState.discoveredDevices.none { it.address == device.address }) {
                uiState = uiState.copy(discoveredDevices = uiState.discoveredDevices + device)
            }
        },
        onError = { message ->
            uiState = uiState.copy(status = message, isScanning = false)
        }
    )

    private val bleService = MeaterBleService(
        onStatus = { message -> uiState = uiState.copy(status = message) },
        onTemperature = { tip, ambient ->
            uiState = uiState.copy(tipCelsius = tip, ambientCelsius = ambient)
        },
        onBattery = { percent ->
            uiState = uiState.copy(batteryPercent = percent)
        },
        onDisconnected = {
            uiState = uiState.copy(
                isConnected = false,
                connectedDeviceAddress = null,
                status = "Disconnected"
            )
        },
        onError = { message ->
            uiState = uiState.copy(status = message)
        }
    )

    fun startScan(context: Context) {
        uiState = uiState.copy(
            isScanning = true,
            status = "Scanning for MEATER devices…",
            discoveredDevices = emptyList(),
            selectedDeviceAddress = null
        )
        scanner.start(context)
    }

    fun stopScan() {
        scanner.stop()
        uiState = uiState.copy(isScanning = false, status = "Scan stopped")
    }

    fun selectDevice(address: String) {
        uiState = uiState.copy(selectedDeviceAddress = address)
    }

    fun connectOrDisconnect(context: Context) {
        if (uiState.isConnected) {
            bleService.disconnect()
            uiState = uiState.copy(
                isConnected = false,
                connectedDeviceAddress = null,
                status = "Disconnected"
            )
            return
        }

        val selected = uiState.selectedDeviceAddress
        if (selected == null) {
            uiState = uiState.copy(status = "Select a MEATER device first")
            return
        }

        scanner.stop()
        uiState = uiState.copy(isScanning = false)
        bleService.connect(context, selected)
        uiState = uiState.copy(
            isConnected = true,
            connectedDeviceAddress = selected,
            status = "Connecting …"
        )
    }

    override fun onCleared() {
        scanner.stop()
        bleService.disconnect()
        super.onCleared()
    }
}
