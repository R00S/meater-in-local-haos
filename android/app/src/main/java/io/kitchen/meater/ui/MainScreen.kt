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
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import io.kitchen.meater.BuildConfig
import io.kitchen.meater.R
import io.kitchen.meater.cooking.CookingSession
import io.kitchen.meater.cooking.CookingState
import io.kitchen.meater.model.BleDevice

@Composable
fun MainScreen(
    state: MainUiState,
    onScanToggle: () -> Unit,
    onSelectDevice: (String) -> Unit,
    onConnectToggle: () -> Unit,
    onSelectCut: (probeIndex: Int) -> Unit,
    onOpenWebView: () -> Unit,
    onLanguageToggle: () -> Unit
) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top
        ) {
            // Title + language toggle
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Column {
                    Text(text = "MEATER Kitchen", style = MaterialTheme.typography.headlineMedium)
                    Text(text = "v${BuildConfig.VERSION_NAME}", style = MaterialTheme.typography.bodySmall)
                }
                OutlinedButton(onClick = onLanguageToggle) {
                    Text(if (state.language == "sv") "EN" else "SV")
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            Text(text = state.status, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(onClick = onScanToggle, enabled = !state.isConnected) {
                    Text(if (state.isScanning) "Stop Scan" else "Start BLE Scan")
                }
                Button(
                    onClick = onConnectToggle,
                    enabled = state.selectedDeviceAddress != null || state.isConnected
                ) {
                    Text(if (state.isConnected) "Disconnect" else "Connect")
                }
            }

            // Device list (before connecting)
            if (!state.isConnected) {
                Spacer(modifier = Modifier.height(16.dp))
                Text("Discovered devices", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))
                LazyColumn {
                    items(state.discoveredDevices, key = { it.address }) { device ->
                        DeviceRow(
                            device = device,
                            selected = state.selectedDeviceAddress == device.address,
                            onSelect = { onSelectDevice(device.address) }
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                    }
                }
            }

            // Multi-probe dashboard
            if (state.isConnected) {
                Spacer(modifier = Modifier.height(16.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Probes", style = MaterialTheme.typography.titleMedium)
                    OutlinedButton(onClick = onOpenWebView) {
                        Text("Full Panel")
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))

                if (state.sessions.isEmpty()) {
                    Text("Waiting for probe data…", style = MaterialTheme.typography.bodyMedium)
                } else {
                    state.sessions.values.sortedBy { it.probeIndex }.forEach { session ->
                        ProbeCard(
                            session = session,
                            useSv = state.language == "sv",
                            onSelectCut = { onSelectCut(session.probeIndex) }
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            }
        }
    }
}

@Composable
private fun ProbeCard(
    session: CookingSession,
    useSv: Boolean,
    onSelectCut: () -> Unit
) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = "Probe ${session.probeIndex + 1}" +
                        if (session.cutDisplayName.isNotBlank()) " — ${session.cutDisplayName}" else "",
                    style = MaterialTheme.typography.titleSmall
                )
                OutlinedButton(onClick = onSelectCut) {
                    Text(if (session.state == CookingState.IDLE) "Select cut" else "Change cut")
                }
            }

            Spacer(modifier = Modifier.height(4.dp))
            Text("Tip:     ${session.tipCelsius?.let { "%.1f°C".format(it) } ?: "--"}")
            Text("Ambient: ${session.ambientCelsius?.let { "%.1f°C".format(it) } ?: "--"}")
            Text("Battery: ${session.batteryPercent?.let { "$it%" } ?: "--"}")

            if (session.state != CookingState.IDLE) {
                Spacer(modifier = Modifier.height(4.dp))
                Text("State:   ${session.state.name}")
                session.targetTempC?.let { Text("Target:  ${it}°C  (${session.doneness})") }
                session.etaMinutes?.let { Text("ETA:     $it min") }
            }
        }
    }
}

@Composable
private fun DeviceRow(
    device: BleDevice,
    selected: Boolean,
    onSelect: () -> Unit
) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Column(modifier = Modifier.weight(1f)) {
            Text(device.name)
            Text(device.address, style = MaterialTheme.typography.bodySmall)
            if (selected) Text("Selected", color = MaterialTheme.colorScheme.secondary)
        }
        Button(onClick = onSelect) {
            Text(if (selected) "Selected" else "Select")
        }
    }
}
