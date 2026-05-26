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
    discoveredDevices: List<BleDevice>,
    onScanToggle: () -> Unit,
    onSelectDevice: (String) -> Unit,
    onConnectToggle: () -> Unit,
    onManualMacChange: (String) -> Unit,
    onConnectManualMac: () -> Unit,
    onConnectKnownProbe: (BleDevice) -> Unit,
    onForgetProbe: (String) -> Unit,
    onSelectCut: (probeIndex: Int) -> Unit,
    onDismissCookingAlert: () -> Unit,
    onAcknowledgeRest: (probeIndex: Int) -> Unit,
    onAcknowledgeDone: (probeIndex: Int) -> Unit,
    onAddProbeSlot: () -> Unit,
    onOpenWebView: () -> Unit,
    onLanguageToggle: () -> Unit
) {
    val useSv = state.language == "sv"

    val strAppName      = if (useSv) "MEATER Kök"             else "MEATER Kitchen"
    val strStartScan    = if (useSv) "Starta sökning"         else "Start Scan"
    val strStopScan     = if (useSv) "Stoppa sökning"         else "Stop Scan"
    val strConnect      = if (useSv) "Anslut"                 else "Connect"
    val strDisconnect   = if (useSv) "Koppla från"            else "Disconnect"
    val strKnownDevices = if (useSv) "Kända enheter"          else "Known devices"
    val strForget       = if (useSv) "Glöm"                   else "Forget"
    val strNearby       = if (useSv) "BLE-enheter i närheten" else "Nearby BLE devices"
    val strMacTitle     = if (useSv) "Anslut via MAC-adress"  else "Connect by MAC address"
    val strProbes       = if (useSv) "Prober"                 else "Probes"
    val strFullPanel    = if (useSv) "Tillagningshistorik"    else "Cook History"
    val strAddProbe     = if (useSv) "+ Lägg till probplats"  else "+ Add probe slot"
    val strScanHint     = if (useSv)
        "Tryck \u201cStarta sökning\u201d — din MEATER+ Block visas som \u201cMEATER+\u201d. Tryck på enheten för att ansluta."
    else
        "Tap \u201cStart Scan\u201d — your MEATER+ Block appears as \u201cMEATER+\u201d. Tap a device to connect."

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.Top
        ) {
            // Title bar
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Column {
                    Text(strAppName, style = MaterialTheme.typography.headlineMedium)
                    val branch = BuildConfig.GIT_BRANCH
                    val branchSuffix = if (branch != "main" && branch != "local")
                        "  [$branch]" else ""
                    Text("v${BuildConfig.VERSION_NAME}$branchSuffix", style = MaterialTheme.typography.bodySmall)
                }
                OutlinedButton(onClick = onLanguageToggle) {
                    Text(if (useSv) "EN" else "SV")
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            Text(state.status, style = MaterialTheme.typography.bodyMedium)
            state.activeCookingAlert?.let { alert ->
                Spacer(modifier = Modifier.height(12.dp))
                CookingAlertCard(
                    alert = alert,
                    session = state.sessions[alert.probeIndex],
                    useSv = useSv,
                    onDismiss = onDismissCookingAlert,
                    onAcknowledgeRest = onAcknowledgeRest,
                    onAcknowledgeDone = onAcknowledgeDone
                )
            }
            Spacer(modifier = Modifier.height(12.dp))

            // ── Not connected ─────────────────────────────────────────────────
            if (!state.isConnected) {

                // 1. Scan button — the primary action
                Button(
                    onClick = onScanToggle,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(if (state.isScanning) strStopScan else strStartScan)
                }

                // 2. Known / saved probes
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
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp, vertical = 8.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(probe.name, style = MaterialTheme.typography.bodyLarge)
                                    Text(probe.address, style = MaterialTheme.typography.bodySmall,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                                }
                                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                    Button(onClick = { onConnectKnownProbe(probe) }) { Text(strConnect) }
                                    TextButton(onClick = { onForgetProbe(probe.address) }) { Text(strForget) }
                                }
                            }
                        }
                    }
                }

                // 3. Nearby BLE devices — one-tap connect (approach from grgcmz/BLEScanner MIT)
                Spacer(modifier = Modifier.height(16.dp))
                Text(strNearby, style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(6.dp))

                if (discoveredDevices.isEmpty()) {
                    Text(strScanHint, style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                }

                // Sorted: MEATER first, then RSSI descending — sorting done in ViewModel
                discoveredDevices.forEach { device ->
                    DeviceRow(
                        device = device,
                        // One-tap connect: tap the row to connect immediately
                        onTap = { onSelectDevice(device.address); onConnectToggle() },
                        useSv = useSv
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                }

                // 4. Full-MAC fallback — last resort when scan doesn't find the device
                Spacer(modifier = Modifier.height(16.dp))
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

            // ── Connected / Dashboard ─────────────────────────────────────────
            if (state.isConnected) {
                Spacer(modifier = Modifier.height(8.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Button(onClick = onConnectToggle) { Text(strDisconnect) }
                    OutlinedButton(onClick = onOpenWebView) { Text(strFullPanel) }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(strProbes, style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))

                state.sessions.values.sortedBy { it.probeIndex }.forEach { session ->
                    ProbeCard(
                        session = session,
                        useSv = useSv,
                        onSelectCut = { onSelectCut(session.probeIndex) },
                        onAcknowledgeRest = onAcknowledgeRest,
                        onAcknowledgeDone = onAcknowledgeDone
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }

                val hasRoomForMore = (0..3).any { it !in state.sessions }
                if (hasRoomForMore) {
                    OutlinedButton(onClick = onAddProbeSlot, modifier = Modifier.fillMaxWidth()) {
                        Text(strAddProbe)
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
    onSelectCut: () -> Unit,
    onAcknowledgeRest: (Int) -> Unit,
    onAcknowledgeDone: (Int) -> Unit
) {
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
    val strAckRest      = if (useSv) "Bekräfta vila"                    else "Acknowledge rest"
    val strAckDone      = if (useSv) "Bekräfta klar"                    else "Acknowledge done"

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
                when (session.state) {
                    CookingState.WAITING_FOR_REST_ACK -> {
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(onClick = { onAcknowledgeRest(session.probeIndex) }) {
                            Text(strAckRest)
                        }
                    }
                    CookingState.WAITING_FOR_DONE_ACK -> {
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(onClick = { onAcknowledgeDone(session.probeIndex) }) {
                            Text(strAckDone)
                        }
                    }
                    else -> Unit
                }
            }
        }
    }
}

/** Translate CookingState to display label — mirrors I18N_STRINGS meater section. */
private fun cookingStateLabel(state: CookingState, useSv: Boolean): String = when (state) {
    CookingState.IDLE         -> if (useSv) "Väntar"             else "Idle"
    CookingState.COOKING      -> if (useSv) "Tillagas"           else "Cooking"
    CookingState.APPROACHING  -> if (useSv) "Närmar sig målet"   else "Approaching target"
    CookingState.WAITING_FOR_REST_ACK -> if (useSv) "Klar för vila" else "Ready to rest"
    CookingState.RESTING      -> if (useSv) "Vilar"              else "Resting"
    CookingState.WAITING_FOR_DONE_ACK -> if (useSv) "Klar att servera" else "Ready to serve"
    CookingState.DONE         -> if (useSv) "Klar"               else "Done"
}

@Composable
private fun CookingAlertCard(
    alert: InAppCookingAlert,
    session: CookingSession?,
    useSv: Boolean,
    onDismiss: () -> Unit,
    onAcknowledgeRest: (Int) -> Unit,
    onAcknowledgeDone: (Int) -> Unit
) {
    val cut = when {
        session == null -> if (useSv) "Proben" else "Probe"
        useSv && session.cutDisplayNameSv.isNotBlank() -> session.cutDisplayNameSv
        session.cutDisplayName.isNotBlank() -> session.cutDisplayName
        else -> if (useSv) "Prob ${alert.probeIndex + 1}" else "Probe ${alert.probeIndex + 1}"
    }
    val (title, body) = when (alert.kind) {
        CookingAlertKind.STARTED -> (if (useSv) "Tillagning startad" else "Cooking started") to
            (if (useSv) "$cut har startats." else "$cut has started.")
        CookingAlertKind.FIVE_MINUTES_REMAINING -> (if (useSv) "5 minuter kvar" else "5 minutes remaining") to
            (if (useSv) "$cut beräknas vara klar om cirka 5 minuter." else "$cut is estimated to be ready in about 5 minutes.")
        CookingAlertKind.REST_ACK_REQUIRED -> (if (useSv) "Starta vilan" else "Start resting") to
            (if (useSv) "$cut har nått måltemperaturen. Bekräfta vila." else "$cut reached target temperature. Acknowledge rest.")
        CookingAlertKind.DONE_ACK_REQUIRED -> (if (useSv) "Vilan är klar" else "Rest complete") to
            (if (useSv) "$cut är klar att serveras. Bekräfta att den är färdig." else "$cut is ready to serve. Acknowledge that it is done.")
    }
    val dismissText = if (useSv) "Senare" else "Later"
    val ackText = when (alert.kind) {
        CookingAlertKind.REST_ACK_REQUIRED -> if (useSv) "Bekräfta vila" else "Acknowledge rest"
        CookingAlertKind.DONE_ACK_REQUIRED -> if (useSv) "Bekräfta klar" else "Acknowledge done"
        else -> if (useSv) "Stäng" else "Dismiss"
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(title, style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(4.dp))
            Text(body, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                when (alert.kind) {
                    CookingAlertKind.REST_ACK_REQUIRED -> Button(onClick = { onAcknowledgeRest(alert.probeIndex) }) {
                        Text(ackText)
                    }
                    CookingAlertKind.DONE_ACK_REQUIRED -> Button(onClick = { onAcknowledgeDone(alert.probeIndex) }) {
                        Text(ackText)
                    }
                    else -> Button(onClick = onDismiss) { Text(ackText) }
                }
                if (alert.kind == CookingAlertKind.REST_ACK_REQUIRED || alert.kind == CookingAlertKind.DONE_ACK_REQUIRED) {
                    OutlinedButton(onClick = onDismiss) { Text(dismissText) }
                }
            }
        }
    }
}

@Composable
private fun DeviceRow(device: BleDevice, onTap: () -> Unit, useSv: Boolean) {
    val strConnect = if (useSv) "Anslut" else "Connect"
    // RSSI → human-readable signal label (same scale as BLE Scanner apps)
    val signalLabel = when {
        device.rssi >= -60 -> "████"    // excellent
        device.rssi >= -70 -> "███░"    // good
        device.rssi >= -80 -> "██░░"    // fair
        device.rssi >= -90 -> "█░░░"    // weak
        device.rssi > -100 -> "░░░░"    // very weak
        else               -> "    "    // unknown (saved probe, no live RSSI)
    }
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = if (device.isMeaterDevice)
            CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
        else
            CardDefaults.cardColors()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    if (device.isMeaterDevice) {
                        Text("🥩", style = MaterialTheme.typography.bodyLarge)
                    }
                    Text(device.name, style = MaterialTheme.typography.bodyLarge)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(device.address, style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                    if (device.rssi > -100) {
                        Text(signalLabel, style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant)
                        Text("${device.rssi} dBm", style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                }
            }
            // One-tap connect: no separate select step needed
            Button(onClick = onTap) { Text(strConnect) }
        }
    }
}
