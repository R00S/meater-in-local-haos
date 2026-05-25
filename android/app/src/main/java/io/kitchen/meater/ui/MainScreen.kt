package io.kitchen.meater.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.kitchen.meater.model.BleDevice

@Composable
fun MainScreen(
    state: MainUiState,
    onScanToggle: () -> Unit,
    onSelectDevice: (String) -> Unit,
    onConnectToggle: () -> Unit
) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Text(text = "MEATER Kitchen", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = state.status)
            Spacer(modifier = Modifier.height(12.dp))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = onScanToggle) {
                    Text(if (state.isScanning) "Stop Scan" else "Start BLE Scan")
                }
                Button(onClick = onConnectToggle, enabled = state.selectedDeviceAddress != null || state.isConnected) {
                    Text(if (state.isConnected) "Disconnect" else "Connect")
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Discovered devices", style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(8.dp))

            LazyColumn {
                items(state.discoveredDevices, key = { it.address }) { device ->
                    DeviceRow(
                        device = device,
                        selected = state.selectedDeviceAddress == device.address,
                        connected = state.connectedDeviceAddress == device.address && state.isConnected,
                        onSelect = { onSelectDevice(device.address) }
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Live readings", style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = "Tip: ${state.tipCelsius?.let { "${it}°C" } ?: "--"}")
            Text(text = "Ambient: ${state.ambientCelsius?.let { "${it}°C" } ?: "--"}")
            Text(text = "Battery: ${state.batteryPercent?.let { "$it%" } ?: "--"}")
        }
    }
}

@Composable
private fun DeviceRow(
    device: BleDevice,
    selected: Boolean,
    connected: Boolean,
    onSelect: () -> Unit
) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Column(modifier = Modifier.weight(1f)) {
            Text(text = device.name)
            Text(text = device.address, style = MaterialTheme.typography.bodySmall)
            when {
                connected -> Text(text = "Connected", color = MaterialTheme.colorScheme.primary)
                selected -> Text(text = "Selected", color = MaterialTheme.colorScheme.secondary)
            }
        }
        Button(onClick = onSelect) {
            Text(if (selected) "Selected" else "Select")
        }
    }
}
