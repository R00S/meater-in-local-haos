package io.kitchen.meater.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
    onAddProbeSlot: () -> Unit,
    onOpenWebView: () -> Unit,
    onLanguageToggle: () -> Unit
) {
    val useSv = state.language == "sv"

    // UI chrome strings — mirror I18N_STRINGS from the HAOS panel
    val strAppName       = if (useSv) "MEATER Kök"              else "MEATER Kitchen"
    val strStartScan     = if (useSv) "Starta sökning"          else "Start Scan"
    val strStopScan      = if (useSv) "Stoppa sökning"          else "Stop Scan"
    val strConnect       = if (useSv) "Anslut"                  else "Connect"
    val strDisconnect    = if (useSv) "Koppla från"             else "Disconnect"
    val strKnownDevices  = if (useSv) "Kända enheter"           else "Known devices"
    val strForget        = if (useSv) "Glöm"                    else "Forget"
    val strNearby        = if (useSv) "Nearby BLE-enheter"      else "Nearby BLE devices"
    val strMacTitle      = if (useSv) "Anslut via MAC-adress"   else "Connect by MAC address"
    val strProbes        = if (useSv) "Prober"                  else "Probes"
    val strFullPanel     = if (useSv) "Tillagningshistorik"   else "Cook History"
    val strAddProbe      = if (useSv) "+ Lägg till probplats"   else "+ Add probe slot"

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.Top
        ) {
            // Title + language toggle
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Column {
                    Text(strAppName, style = MaterialTheme.typography.headlineMedium)
                    Text("v${BuildConfig.VERSION_NAME}", style = MaterialTheme.typography.bodySmall)
                }
                OutlinedButton(onClick = onLanguageToggle) {
                    Text(if (useSv) "EN" else "SV")
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            Text(state.status, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(12.dp))

            // Scan / Disconnect buttons
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = onScanToggle, enabled = !state.isConnected) {
                    Text(if (state.isScanning) strStopScan else strStartScan)
                }
                Button(
                    onClick = onConnectToggle,
                    enabled = state.selectedDeviceAddress != null || state.isConnected
                ) {
                    Text(if (state.isConnected) strDisconnect else strConnect)
                }
            }

            if (!state.isConnected) {
                // Known / saved probes
                if (state.knownProbes.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(strKnownDevices, style = MaterialTheme.typography.titleMedium)
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
                                    Button(onClick = { onConnectKnownProbe(probe) }) { Text(strConnect) }
                                    TextButton(onClick = { onForgetProbe(probe.address) }) { Text(strForget) }
                                }
                            }
                        }
                    }
                }

                // Discovered BLE devices
                Spacer(modifier = Modifier.height(16.dp))
                Text(strNearby, style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(6.dp))

                if (state.discoveredDevices.isEmpty() && !state.isScanning) {
                    Text(
                        if (useSv)
                            "Tryck på \u201cStarta sökning\u201d för att hitta enheter i närheten. " +
                                "Din MEATER+ Block visas som \u201cMEATER+\u201d i listan."
                        else
                            "Tap \u201cStart Scan\u201d to discover nearby devices. " +
                                "Your MEATER+ Block will appear as \u201cMEATER+\u201d in the list.",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                // Plain Column — device count is always small; avoids the height-squish
                // problem that a weighted LazyColumn causes when the screen fills up.
                Column {
                    state.discoveredDevices.forEach { device ->
                        DeviceRow(
                            device = device,
                            selected = state.selectedDeviceAddress == device.address,
                            onSelect = { onSelectDevice(device.address) },
                            useSv = useSv
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                    }
                }

                // Direct connect by full MAC (power-user fallback)
                Spacer(modifier = Modifier.height(12.dp))
                Text(strMacTitle, style = MaterialTheme.typography.titleSmall)
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
                    Button(onClick = onConnectManualMac, enabled = isFullMac) { Text(strConnect) }
                }
            }

            // ── Dashboard (connected) ─────────────────────────────────────────
            if (state.isConnected) {
                Spacer(modifier = Modifier.height(16.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(strProbes, style = MaterialTheme.typography.titleMedium)
                    OutlinedButton(onClick = onOpenWebView) { Text(strFullPanel) }
                }
                Spacer(modifier = Modifier.height(8.dp))

                // One card per probe slot (already in sessions map)
                state.sessions.values.sortedBy { it.probeIndex }.forEach { session ->
                    ProbeCard(
                        session = session,
                        useSv = useSv,
                        onSelectCut = { onSelectCut(session.probeIndex) }
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }

                // "+ Add probe" button — lets user set up another probe slot
                val hasRoomForMore = (0..3).any { it !in state.sessions }
                if (hasRoomForMore) {
                    OutlinedButton(
                        onClick = onAddProbeSlot,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(strAddProbe)
                    }
                }
            }
        }
    }
}

@Composable
private fun ProbeCard(session: CookingSession, useSv: Boolean, onSelectCut: () -> Unit) {
    // UI chrome — mirror I18N_STRINGS from the HAOS panel
    val strProbe        = if (useSv) "Prob"                             else "Probe"
    val strSelectCut    = if (useSv) "Välj styckdel & starta tillagning" else "Select cut & start cook"
    val strChangeCut    = if (useSv) "Byt styckdel"                     else "Change cut"
    val strTip          = if (useSv) "Spets:"                           else "Tip:"
    val strAmbient      = if (useSv) "Omgivning:"                       else "Ambient:"
    val strBattery      = if (useSv) "Batteri:"                         else "Battery:"
    val strState        = if (useSv) "Status:"                          else "State:"
    val strTarget       = if (useSv) "Mål:"                             else "Target:"
    val strEta          = if (useSv) "Beräknad tid:"                    else "ETA:"

    // Cut display name: prefer the language-matched name stored from the cut file
    val cutName = when {
        session.cutDisplayName.isBlank() -> ""
        useSv && session.cutDisplayNameSv.isNotBlank() -> session.cutDisplayNameSv
        else -> session.cutDisplayName
    }

    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = "$strProbe ${session.probeIndex + 1}" +
                        if (cutName.isNotBlank()) " \u2014 $cutName" else "",
                    style = MaterialTheme.typography.titleSmall
                )
                Button(onClick = onSelectCut) {
                    Text(if (session.state == CookingState.IDLE && session.cutId.isBlank())
                        strSelectCut else strChangeCut)
                }
            }

            Spacer(modifier = Modifier.height(4.dp))
            Text("$strTip     ${session.tipCelsius?.let { "%.1f\u00b0C".format(it) } ?: "--"}")
            Text("$strAmbient ${session.ambientCelsius?.let { "%.1f\u00b0C".format(it) } ?: "--"}")
            Text("$strBattery ${session.batteryPercent?.let { "$it%" } ?: "--"}")

            if (session.state != CookingState.IDLE || session.cutId.isNotBlank()) {
                Spacer(modifier = Modifier.height(4.dp))
                Text("$strState   ${cookingStateLabel(session.state, useSv)}")
                session.targetTempC?.let { Text("$strTarget  ${it}\u00b0C  (${session.doneness})") }
                session.etaMinutes?.let { Text("$strEta $it min") }
            }
        }
    }
}

/** Translate CookingState to display label — mirrors I18N_STRINGS meater section. */
private fun cookingStateLabel(state: CookingState, useSv: Boolean): String = when (state) {
    CookingState.IDLE         -> if (useSv) "Väntar"             else "Idle"
    CookingState.COOKING      -> if (useSv) "Tillagas"           else "Cooking"
    CookingState.APPROACHING  -> if (useSv) "Närmar sig målet"   else "Approaching target"
    CookingState.GOAL_REACHED -> if (useSv) "Mål nått!"          else "Goal reached!"
    CookingState.RESTING      -> if (useSv) "Vilar"              else "Resting"
    CookingState.DONE         -> if (useSv) "Klar"               else "Done"
}

@Composable
private fun DeviceRow(device: BleDevice, selected: Boolean, onSelect: () -> Unit, useSv: Boolean) {
    val strSelected = if (useSv) "Vald \u2713" else "Selected \u2713"
    val strSelect   = if (useSv) "Välj"        else "Select"
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
            Button(onClick = onSelect) { Text(if (selected) strSelected else strSelect) }
        }
    }
}
