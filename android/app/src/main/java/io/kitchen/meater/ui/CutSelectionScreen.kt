package io.kitchen.meater.ui

import androidx.compose.foundation.clickable
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
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import io.kitchen.meater.data.CookingDataRepository

/**
 * Four-step cut selection flow: protein category → species → cut → doneness.
 * Data comes from the bundled kitchen-cooking-panel.js asset — the same source as the
 * KCE HAOS panel.  Cut names and doneness names are already bilingual in EXP_TREE and
 * EXP_DONENESS_OPTIONS (from the cut files); [useSv] selects which to show.
 * UI chrome strings mirror the I18N_STRINGS translations in the HAOS panel.
 */
@Composable
fun CutSelectionScreen(
    probeIndex: Int,
    useSv: Boolean,
    onConfirm: (
        proteinCategory: String,
        cutId: String,
        cutDisplayName: String,    // English name (cut file `name`)
        cutDisplayNameSv: String,  // Swedish name (cut file `name_sv`)
        doneness: String,
        targetTempC: Int,
        restMinutes: Int
    ) -> Unit,
    onViewRecipe: (slug: String, cutName: String, cutNameSv: String, categoryId: String) -> Unit,
    onCancel: () -> Unit
) {
    val context = LocalContext.current
    val repo = remember { CookingDataRepository(context) }
    val tree = remember { repo.tree }
    val donenessMap = remember { repo.doneness }

    var selectedCategory by remember { mutableStateOf<CookingDataRepository.ProteinCategory?>(null) }
    var selectedSpecies  by remember { mutableStateOf<CookingDataRepository.Species?>(null) }
    var selectedCut      by remember { mutableStateOf<CookingDataRepository.Cut?>(null) }

    // UI chrome strings — mirror I18N_STRINGS from the HAOS panel
    val strBack       = if (useSv) "Tillbaka"              else "Back"
    val strCancel     = if (useSv) "Avbryt"                else "Cancel"
    val strProbe      = if (useSv) "Prob"                  else "Probe"
    val strPickProt   = if (useSv) "Välj proteinkategori"  else "Select protein"
    val strPickSpec   = if (useSv) "Välj djurslag"         else "Select species"
    val strPickCut    = if (useSv) "Välj styckdel"         else "Select cut"
    val strPickDone   = if (useSv) "Välj tillagningsgrad"  else "Select doneness"
    val strRecom      = if (useSv) "Rekommenderad"         else "Recommended"
    val strMethods    = if (useSv) "Metoder"               else "Methods"
    val strSafeTemp   = if (useSv) "USDA säker temp"       else "USDA safe temp"
    val strRestTime   = if (useSv) "Vilotid"               else "Rest time"
    val strMin        = if (useSv) "min"                   else "min"
    val strCarryover  = if (useSv) "Övertillagning"        else "Carryover"

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

            // Header with back/cancel
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                val backLabel = when {
                    selectedCut != null || selectedSpecies != null || selectedCategory != null -> strBack
                    else -> strCancel
                }
                Button(onClick = {
                    when {
                        selectedCut      != null -> selectedCut = null
                        selectedSpecies  != null -> selectedSpecies = null
                        selectedCategory != null -> selectedCategory = null
                        else -> onCancel()
                    }
                }) { Text(backLabel) }

                Text(
                    text = "$strProbe ${probeIndex + 1}",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                when {
                    // ── Step 4: doneness picker + cut recipe info ─────────────────
                    selectedCut != null -> {
                        val cut = selectedCut!!
                        Text(
                            text = if (useSv && cut.nameSv.isNotBlank()) cut.nameSv else cut.name,
                            style = MaterialTheme.typography.headlineSmall
                        )
                        // Recipe viewer button
                        OutlinedButton(
                            onClick = {
                                onViewRecipe(cut.slug, cut.name, cut.nameSv, selectedCategory!!.id)
                            },
                            modifier = Modifier.padding(top = 4.dp, bottom = 8.dp)
                        ) {
                            Text("📖 ${if (useSv) "Visa recept" else "View Recipes"}")
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        if (cut.supportedMethods.isNotEmpty() || cut.usdaSafeC > 0) {
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.surfaceVariant
                                )
                            ) {
                                Column(modifier = Modifier.padding(12.dp)) {
                                    if (cut.usdaSafeC > 0) {
                                        Text(
                                            "🌡️ $strSafeTemp: ${cut.usdaSafeC}°C",
                                            style = MaterialTheme.typography.bodyMedium
                                        )
                                    }
                                    if (cut.restTimeMax > 0) {
                                        val restStr = if (cut.restTimeMin == cut.restTimeMax)
                                            "${cut.restTimeMin} $strMin"
                                        else
                                            "${cut.restTimeMin}–${cut.restTimeMax} $strMin"
                                        Text(
                                            "⏱️ $strRestTime: $restStr",
                                            style = MaterialTheme.typography.bodyMedium
                                        )
                                    }
                                    if (cut.carryoverTempC > 0) {
                                        Text(
                                            "📈 $strCarryover: +${cut.carryoverTempC}°C",
                                            style = MaterialTheme.typography.bodyMedium
                                        )
                                    }
                                    if (cut.supportedMethods.isNotEmpty()) {
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            "🍳 $strMethods: ${cut.supportedMethods.joinToString(", ") { it.replace('_', ' ') }}",
                                            style = MaterialTheme.typography.bodySmall
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                        }

                        Text(strPickDone, style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(8.dp))

                        cut.doneness.forEach { donenessId ->
                            val opt = donenessMap[donenessId]
                            val label = when {
                                opt == null -> donenessId
                                useSv && opt.nameSv.isNotBlank() -> "${opt.icon} ${opt.nameSv} (${opt.tempC}°C)"
                                else -> "${opt.icon} ${opt.name} (${opt.tempC}°C)"
                            }
                            val isRecommended = donenessId == cut.recommendedDoneness
                            Card(modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .clickable {
                                    if (opt != null) {
                                        onConfirm(
                                            selectedCategory!!.id,
                                            cut.id,
                                            cut.name,     // always store English name
                                            cut.nameSv,   // always store Swedish name
                                            donenessId,
                                            opt.tempC,
                                            cut.restTimeMax.coerceAtLeast(1)
                                        )
                                    }
                                }
                            ) {
                                Column(modifier = Modifier.padding(12.dp)) {
                                    Text(label, style = MaterialTheme.typography.bodyLarge)
                                    if (isRecommended) {
                                        Text(
                                            strRecom,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.primary
                                        )
                                    }
                                }
                            }
                        }
                    }

                    // ── Step 3: cut picker (cuts grouped by cutType) ──────────────
                    selectedSpecies != null -> {
                        val species = selectedSpecies!!
                        Text(
                            text = if (useSv && species.nameSv.isNotBlank()) species.nameSv else species.name,
                            style = MaterialTheme.typography.headlineSmall
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(strPickCut, style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(8.dp))

                        species.cutTypes.forEach { cutType ->
                            // Show cut type as section header only when there are multiple cut types
                            if (species.cutTypes.size > 1) {
                                val ctLabel = if (useSv && cutType.nameSv.isNotBlank()) cutType.nameSv else cutType.name
                                Text(
                                    text = ctLabel,
                                    style = MaterialTheme.typography.labelLarge,
                                    color = MaterialTheme.colorScheme.primary,
                                    modifier = Modifier.padding(top = 8.dp, bottom = 2.dp)
                                )
                                HorizontalDivider()
                            }
                            cutType.cuts.forEach { cut ->
                                val label = if (useSv && cut.nameSv.isNotBlank()) cut.nameSv else cut.name
                                Card(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 4.dp)
                                    .clickable { selectedCut = cut }
                                ) {
                                    Text(label, modifier = Modifier.padding(12.dp), style = MaterialTheme.typography.bodyLarge)
                                }
                            }
                        }
                    }

                    // ── Step 2: species picker ────────────────────────────────────
                    selectedCategory != null -> {
                        val cat = selectedCategory!!
                        Text(
                            text = if (useSv && cat.nameSv.isNotBlank()) cat.nameSv else cat.name,
                            style = MaterialTheme.typography.headlineSmall
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        // If there is only one species, skip this step automatically
                        val speciesList = cat.species
                        if (speciesList.size == 1) {
                            selectedSpecies = speciesList[0]
                        } else {
                            Text(strPickSpec, style = MaterialTheme.typography.titleMedium)
                            Spacer(modifier = Modifier.height(8.dp))
                            speciesList.forEach { species ->
                                val label = if (useSv && species.nameSv.isNotBlank()) species.nameSv else species.name
                                Card(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 4.dp)
                                    .clickable { selectedSpecies = species }
                                ) {
                                    Text(label, modifier = Modifier.padding(12.dp), style = MaterialTheme.typography.bodyLarge)
                                }
                            }
                        }
                    }

                    // ── Step 1: protein category picker ──────────────────────────
                    else -> {
                        Text(strPickProt, style = MaterialTheme.typography.headlineSmall)
                        Spacer(modifier = Modifier.height(8.dp))
                        tree.forEach { cat ->
                            val label = if (useSv && cat.nameSv.isNotBlank()) cat.nameSv else cat.name
                            Card(modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .clickable { selectedCategory = cat }
                            ) {
                                Text("${cat.icon} $label", modifier = Modifier.padding(12.dp), style = MaterialTheme.typography.bodyLarge)
                            }
                        }
                    }
                }
            }
        }
    }
}
