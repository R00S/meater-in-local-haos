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
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import io.kitchen.meater.data.SessionHistoryRepository

/**
 * Shows completed cook sessions from local history.
 * Replaces the WebView panel which was unusable without a Home Assistant connection.
 */
@Composable
fun CookHistoryScreen(
    useSv: Boolean,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val records = remember { SessionHistoryRepository(context).loadAll().sortedByDescending { it.cookStartedAt } }

    val strTitle  = if (useSv) "Tillagningshistorik"  else "Cook History"
    val strBack   = if (useSv) "Tillbaka"             else "Back"
    val strEmpty  = if (useSv) "Inga tidigare tillagningar." else "No previous cooks yet."
    val strDone   = if (useSv) "Tillagningsgrad:"     else "Doneness:"
    val strTarget = if (useSv) "Mål:"                 else "Target:"
    val strFinal  = if (useSv) "Sluttemp:"            else "Final temp:"
    val strRest   = if (useSv) "Vilotid:"             else "Rest:"
    val strMin    = if (useSv) "min"                  else "min"
    val strNotes  = if (useSv) "Anteckningar:"        else "Notes:"

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Button(onClick = onBack) { Text(strBack) }
                Text(strTitle, style = MaterialTheme.typography.titleMedium, modifier = Modifier.padding(top = 8.dp))
            }

            Spacer(modifier = Modifier.height(12.dp))

            if (records.isEmpty()) {
                Text(strEmpty, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            } else {
                Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                    records.forEach { rec ->
                        Card(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
                            Column(modifier = Modifier.padding(12.dp)) {
                                Text(rec.cutDisplayName.ifBlank { "—" }, style = MaterialTheme.typography.titleSmall)
                                rec.cookStartedAt?.let {
                                    Text(it.take(16).replace("T", " "), style = MaterialTheme.typography.bodySmall,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                HorizontalDivider()
                                Spacer(modifier = Modifier.height(4.dp))
                                if (rec.doneness.isNotBlank()) Text("$strDone ${rec.doneness}")
                                rec.targetTempC?.let { Text("$strTarget ${it}°C") }
                                rec.finalTipC?.let { Text("$strFinal ${"%.1f".format(it)}°C") }
                                if (rec.restMinutes > 0) Text("$strRest ${rec.restMinutes} $strMin")
                                if (rec.notes.isNotBlank()) {
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text("$strNotes ${rec.notes}", style = MaterialTheme.typography.bodySmall)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
