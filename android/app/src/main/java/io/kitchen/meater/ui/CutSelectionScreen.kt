package io.kitchen.meater.ui

import android.content.Context
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import io.kitchen.meater.R
import io.kitchen.meater.data.CookingDataRepository

/**
 * Three-step cut selection flow: protein category → cut → doneness.
 * Data comes from the bundled cooking_data.json asset (same source as the KCE HAOS panel).
 * Language is derived from the current locale (Swedish if locale language == "sv").
 */
@Composable
fun CutSelectionScreen(
    probeIndex: Int,
    useSv: Boolean,
    onConfirm: (
        proteinCategory: String,
        cutId: String,
        cutDisplayName: String,
        doneness: String,
        targetTempC: Int,
        restMinutes: Int
    ) -> Unit,
    onCancel: () -> Unit
) {
    val context = LocalContext.current
    val repo = remember { CookingDataRepository(context) }
    val tree = remember { repo.tree }
    val donenessMap = remember { repo.doneness }

    var selectedCategory by remember { mutableStateOf<CookingDataRepository.ProteinCategory?>(null) }
    var selectedCut by remember { mutableStateOf<CookingDataRepository.Cut?>(null) }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

            // Header with back/cancel
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                val backLabel = when {
                    selectedCut != null -> stringResource(R.string.cut_selection_back)
                    selectedCategory != null -> stringResource(R.string.cut_selection_back)
                    else -> stringResource(R.string.cut_selection_cancel)
                }
                Button(onClick = {
                    when {
                        selectedCut != null -> selectedCut = null
                        selectedCategory != null -> selectedCategory = null
                        else -> onCancel()
                    }
                }) { Text(backLabel) }

                Text(
                    text = "Probe ${probeIndex + 1}",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            when {
                // Step 3 — doneness picker
                selectedCut != null -> {
                    val cut = selectedCut!!
                    Text(
                        text = if (useSv && cut.nameSv.isNotBlank()) cut.nameSv else cut.name,
                        style = MaterialTheme.typography.headlineSmall
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(stringResource(R.string.cut_selection_pick_doneness), style = MaterialTheme.typography.titleMedium)
                    Spacer(modifier = Modifier.height(8.dp))
                    LazyColumn {
                        items(cut.doneness) { donenessId ->
                            val opt = donenessMap[donenessId]
                            val label = when {
                                opt == null -> donenessId
                                useSv && opt.nameSv.isNotBlank() -> "${opt.icon} ${opt.nameSv} (${opt.tempC}°C)"
                                else -> "${opt.icon} ${opt.name} (${opt.tempC}°C)"
                            }
                            val isRecommended = donenessId == cut.recommendedDoneness
                            Card(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp).clickable {
                                if (opt != null) {
                                    onConfirm(
                                        selectedCategory!!.id,
                                        cut.id,
                                        if (useSv && cut.nameSv.isNotBlank()) cut.nameSv else cut.name,
                                        donenessId,
                                        opt.tempC,
                                        5 // default rest minutes
                                    )
                                }
                            }) {
                                Column(modifier = Modifier.padding(12.dp)) {
                                    Text(label, style = MaterialTheme.typography.bodyLarge)
                                    if (isRecommended) {
                                        Text(
                                            stringResource(R.string.cut_selection_recommended),
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.primary
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                // Step 2 — cut picker
                selectedCategory != null -> {
                    val cat = selectedCategory!!
                    Text(
                        text = if (useSv && cat.nameSv.isNotBlank()) cat.nameSv else cat.name,
                        style = MaterialTheme.typography.headlineSmall
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(stringResource(R.string.cut_selection_pick_cut), style = MaterialTheme.typography.titleMedium)
                    Spacer(modifier = Modifier.height(8.dp))
                    LazyColumn {
                        items(cat.cuts) { cut ->
                            val label = if (useSv && cut.nameSv.isNotBlank()) cut.nameSv else cut.name
                            Card(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp).clickable {
                                selectedCut = cut
                            }) {
                                Text(label, modifier = Modifier.padding(12.dp), style = MaterialTheme.typography.bodyLarge)
                            }
                        }
                    }
                }

                // Step 1 — protein category picker
                else -> {
                    Text(stringResource(R.string.cut_selection_pick_protein), style = MaterialTheme.typography.headlineSmall)
                    Spacer(modifier = Modifier.height(8.dp))
                    LazyColumn {
                        items(tree) { cat ->
                            val label = if (useSv && cat.nameSv.isNotBlank()) cat.nameSv else cat.name
                            Card(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp).clickable {
                                selectedCategory = cat
                            }) {
                                Text("${cat.icon} $label", modifier = Modifier.padding(12.dp), style = MaterialTheme.typography.bodyLarge)
                            }
                        }
                    }
                }
            }
        }
    }
}
