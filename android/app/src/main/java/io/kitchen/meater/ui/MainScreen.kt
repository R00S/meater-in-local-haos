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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import io.kitchen.meater.BuildConfig
import io.kitchen.meater.cooking.CookingSession
import io.kitchen.meater.cooking.CookingState
import io.kitchen.meater.model.BleDevice

private val FULL_MAC = Regex("^([0-9A-Fa-f]{2}:){5}[0-9A-Fa-f]{2}\$")

@Composable
fun MainScreen(
    state: MainUiState,
    onScanToggle: () -> Unit,
    onSelectDevice: (String) -> Unit,
    onConnectToggle: () -> Unit,
    onManualMacChange: (String) -> Unit,
    onConnectManualMac: () -> Unit,
    onConnectKnownProbe: (BleDevice) -> Unit,
    onForgetProbe: (String) -> Unit,
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
                    Text("MEATER Kitchen", style = MaterialTheme.typography.headlineMedium)
                    Text("v${BuildConfig.VERSION_NAME}", style = MaterialTheme.typography.bodySmall)
                }
                OutlinedButton(onClick = onLanguageToggle) {
                    Text(if (state.language == "sv") "EN" else "SV")
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            Text(state.status, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(12.dp))

            // Scan / Connect buttons
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = onScanToggle, enabled = !state.isConnected) {
                    Text(if (state.isScanning) "Stop Scan" else "Start Scan")
                }
                Button(
                    onClick = onConnectToggle,
                    enabled = state.selectedDeviceAddress != null || state.isConnected
                ) {
                    Text(if (state.isConnected) "Disconnect" else "Connect")
                }
            }

            if (!state.isConnected) {
                // Known / saved probes
                if (state.knownProbes.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Text("Known devices", style = MaterialTheme.typography.titleMedium)
                    Spacer(modifier = Modifier.height(6.dp))
                    state.knownProbes.forEach { probe ->
                        Card(
                            modifier = Modifier.fillMaxWidth().padding(vertical = 3.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.secondaryContainer
                            )
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth()
                                    .padding(horizontal = 12.dp, vertical = 8.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(probe.name, style = MaterialTheme.typography.bodyLarge)
                                    Text(probe.address, style = MaterialTheme.typography.bodySmall)
                                }
                                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                    Button(onClick = { onConnectKnownProbe(probe) }) { Text("Connect") }
                                    TextButton(onClick = { onForgetProbe(probe.address) }) { Text("Forget") }
                                }
                            }
                        }
                    }
                }

                // Discovered BLE devices
                Spacer(modifier = Modifier.height(16.dp))
                Text("Nearby BLE devices", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(6.dp))

                if (state.discoveredDevices.isEmpty() && !state.isScanning) {
                    Text(
                        "Tap \"Start Scan\" to discover nearby devices. " +
                            "Your MEATER+ Block will appear as \"MEATER+\" in the list.",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                LazyColumn(modifier = Modifier.weight(1f, fill = false)) {
                    items(state.discoveredDevices, key = { it.address }) { device ->
                        DeviceRow(
                            device = device,
                            selected = state.selectedDeviceAddress == device.address,
                            onSelect = { onSelectDevice(device.address) }
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                    }
                }

                // Direct connect by full MAC (power-user fallback)
                Spacer(modifier = Modifier.height(12.dp))
                Text("Connect by MAC address", style = MaterialTheme.typography.titleSmall)
                Spacer(modifier = Modifier.height(4.dp))
                val isFullMac = state.manualMacAddress.matches(FULL_MAC)
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedTextField(
                        value = state.manualMacAddress,
                        onValueChange = onManualMacChange,
                        modifier = Modifier.weight(1f),
                        label = { Text("XX:XX:XX:XX:XX:XX") },
                        singleLine = true,
                        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done)
                    )
                    Button(onClick = onConnectManualMac, enabled = isFullMac) { Text("Connect") }
                }
            }

            // Multi-probe dashboard (connected)
            if (state.isConnected) {
                Spacer(modifier = Modifier.height(16.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Probes", style = MaterialTheme.typography.titleMedium)
                    OutlinedButton(onClick = onOpenWebView) { Text("Full Panel") }
                }
                Spacer(modifier = Modifier.height(8.dp))

                if (state.sessions.isEmpty()) {
                    Text("Waiting for probe data\u2026", style = MaterialTheme.typography.bodyMedium)
                } else {
                    state.sessions.values.sortedBy { it.probeIndex }.forEach { session ->
                        ProbeCard(session = session, useSv = state.language == "sv",
                            onSelectCut = { onSelectCut(session.probeIndex) })
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            }
        }
    }
}

@Composable
private fun ProbeCard(session: CookingSession, useSv: Boolean, onSelectCut: () -> Unit) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = "Probe ${session.probeIndex + 1}" +
                        if (session.cutDisplayName.isNotBlank()) " \u2014 ${session.cutDisplayName}" else "",
                    style = MaterialTheme.typography.titleSmall
                )
                OutlinedButton(onClick = onSelectCut) {
                    Text(if (session.state == CookingState.IDLE) "Select cut" else "Change cut")
                }
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text("Tip:     ${session.tipCelsius?.let { "%.1f\u00b0C".format(it) } ?: "--"}")
            Text("Ambient: ${session.ambientCelsius?.let { "%.1f\u00b0C".format(it) } ?: "--"}")
            Text("Battery: ${session.batteryPercent?.let { "$it%" } ?: "--"}")
            if (session.state != CookingState.IDLE) {
                Spacer(modifier = Modifier.height(4.dp))
                Text("State:   ${session.state.name}")
                session.targetTempC?.let { Text("Target:  ${it}\u00b0C  (${session.doneness})") }
                session.etaMinutes?.let { Text("ETA:     $it min") }
            }
        }
    }
}

@Composable
private fun DeviceRow(device: BleDevice, selected: Boolean, onSelect: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = if (selected)
            CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
        else CardDefaults.cardColors()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(device.name, style = MaterialTheme.typography.bodyLarge)
                Text(device.address, style = MaterialTheme.typography.bodySmall)
            }
            Button(onClick = onSelect) { Text(if (selected) "Selected \u2713" else "Select") }
        }
    }
}
