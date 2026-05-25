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
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
 * Full KCE MEATER cook-path (minus AI recipe option):
 *   Step 1 — Protein category
 *   Step 2 — Species (auto-skipped when only one)
 *   Step 3 — Cut (grouped by cut type)
 *   Step 4 — Doneness level  (recommended marked, temp shown)
 *   Step 5 — Target temperature fine-tuning (slider + ±1 °C, USDA safety warning)
 *   Step 6 — Cooking method (from cut file supported_methods; shows recipe titles inline)
 *   Step 7 — Start Cook button
 *
 * Data comes from kitchen-cooking-panel.js (EXP_TREE, EXP_DONENESS_OPTIONS,
 * RECIPE_TITLES_INDEX) — the same source as the KCE HAOS panel.
 * UI chrome mirrors the I18N_STRINGS translations in panel-class-template.js.
 */
@Composable
fun CutSelectionScreen(
    probeIndex: Int,
    useSv: Boolean,
    onConfirm: (
        proteinCategory: String,
        cutId: String,
        cutDisplayName: String,
        cutDisplayNameSv: String,
        doneness: String,
        targetTempC: Int,
        restMinutes: Int,
        cookingMethod: String
    ) -> Unit,
    onViewRecipe: (slug: String, cutName: String, cutNameSv: String, method: String) -> Unit,
    onCancel: () -> Unit
) {
    val context = LocalContext.current
    val repo = remember { CookingDataRepository(context) }
    val tree = remember { repo.tree }
    val donenessMap = remember { repo.doneness }
    val recipeTitles = remember { repo.recipeTitles }

    var selectedCategory by remember { mutableStateOf<CookingDataRepository.ProteinCategory?>(null) }
    var selectedSpecies  by remember { mutableStateOf<CookingDataRepository.Species?>(null) }
    var selectedCut      by remember { mutableStateOf<CookingDataRepository.Cut?>(null) }

    // Steps 4-6 state — reset whenever the user picks a new cut
    var selectedDoneness by remember { mutableStateOf<String?>(null) }
    var customTempC      by remember { mutableStateOf<Int?>(null) }
    var selectedMethod   by remember { mutableStateOf<String?>(null) }

    // UI chrome strings — mirror I18N_STRINGS from the HAOS panel
    val strBack         = if (useSv) "Tillbaka"                    else "Back"
    val strCancel       = if (useSv) "Avbryt"                      else "Cancel"
    val strProbe        = if (useSv) "Prob"                        else "Probe"
    val strPickProt     = if (useSv) "Välj proteinkategori"        else "Select protein"
    val strPickSpec     = if (useSv) "Välj djurslag"               else "Select species"
    val strPickCut      = if (useSv) "Välj styckdel"               else "Select cut"
    val strPickDone     = if (useSv) "Välj tillagningsgrad"        else "Select doneness"
    val strRecom        = if (useSv) "Rekommenderad"               else "Recommended"
    val strSafeTemp     = if (useSv) "USDA säker temp"             else "USDA safe temp"
    val strRestTime     = if (useSv) "Vilotid"                     else "Rest time"
    val strMin          = if (useSv) "min"                         else "min"
    val strCarryover    = if (useSv) "Övertillagning"              else "Carryover"
    val strMethods      = if (useSv) "Metoder"                     else "Methods"
    val strTargetTemp   = if (useSv) "Måltemperatur"               else "Target temperature"
    val strCustom       = if (useSv) "Anpassad"                    else "Custom"
    val strResetTo      = if (useSv) "Återställ till"              else "Reset to"
    val strPickMethod   = if (useSv) "Välj tillagningsmetod"       else "Select cooking method"
    val strRecipes      = if (useSv) "Recept"                      else "Recipes"
    val strStartCook    = if (useSv) "Starta tillagning"           else "Start Cook"
    val strSafetyWarn   = if (useSv) "Under USDA säkerhetsminimum" else "Below USDA safety minimum"
    val strMethodNeeded = if (useSv) "Välj metod ovan för att starta" else "Select a method above to start"

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

            // Header: back/cancel + probe label
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                val backLabel = when {
                    selectedCut != null || selectedSpecies != null || selectedCategory != null -> strBack
                    else -> strCancel
                }
                Button(onClick = {
                    when {
                        selectedCut != null -> {
                            selectedCut = null
                            selectedDoneness = null
                            customTempC = null
                            selectedMethod = null
                        }
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
                    // ── Steps 4-7: doneness → temp → method → start ───────────────
                    selectedCut != null -> {
                        val cut = selectedCut!!
                        val cutLabel = if (useSv && cut.nameSv.isNotBlank()) cut.nameSv else cut.name

                        Text(cutLabel, style = MaterialTheme.typography.headlineSmall)
                        Spacer(modifier = Modifier.height(8.dp))

                        // Cut profile info card
                        if (cut.usdaSafeC > 0 || cut.restTimeMax > 0 ||
                            cut.carryoverTempC > 0 || cut.supportedMethods.isNotEmpty()) {
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.surfaceVariant
                                )
                            ) {
                                Column(modifier = Modifier.padding(12.dp)) {
                                    if (cut.usdaSafeC > 0) {
                                        Text("🌡️ $strSafeTemp: ${cut.usdaSafeC}°C",
                                            style = MaterialTheme.typography.bodyMedium)
                                    }
                                    if (cut.restTimeMax > 0) {
                                        val restStr = if (cut.restTimeMin == cut.restTimeMax)
                                            "${cut.restTimeMin} $strMin"
                                        else
                                            "${cut.restTimeMin}–${cut.restTimeMax} $strMin"
                                        Text("⏱️ $strRestTime: $restStr",
                                            style = MaterialTheme.typography.bodyMedium)
                                    }
                                    if (cut.carryoverTempC > 0) {
                                        Text("📈 $strCarryover: +${cut.carryoverTempC}°C",
                                            style = MaterialTheme.typography.bodyMedium)
                                    }
                                    if (cut.supportedMethods.isNotEmpty()) {
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            "🍳 $strMethods: ${cut.supportedMethods.joinToString(", ") {
                                                it.replace('_', ' ')
                                            }}",
                                            style = MaterialTheme.typography.bodySmall
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(12.dp))
                        }

                        // ── Step 4: Doneness ─────────────────────────────────────
                        Text("🌡️ $strPickDone", style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(8.dp))

                        cut.doneness.forEach { donenessId ->
                            val opt = donenessMap[donenessId]
                            val isSelected = selectedDoneness == donenessId
                            val isRecom = donenessId == cut.recommendedDoneness
                            val label = when {
                                opt == null -> donenessId
                                useSv && opt.nameSv.isNotBlank() ->
                                    "${opt.icon} ${opt.nameSv} (${opt.tempC}°C)"
                                else ->
                                    "${opt.icon} ${opt.name} (${opt.tempC}°C)"
                            }
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 3.dp)
                                    .clickable {
                                        if (opt != null) {
                                            selectedDoneness = donenessId
                                            customTempC = null   // reset custom temp on doneness change
                                            selectedMethod = null
                                        }
                                    },
                                colors = if (isSelected)
                                    CardDefaults.cardColors(
                                        containerColor = MaterialTheme.colorScheme.primaryContainer
                                    )
                                else CardDefaults.cardColors()
                            ) {
                                Column(modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp)) {
                                    Text(label, style = MaterialTheme.typography.bodyLarge)
                                    if (isRecom) {
                                        Text(
                                            "⭐ $strRecom",
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.primary
                                        )
                                    }
                                }
                            }
                        }

                        // ── Step 5: Temperature fine-tuning (after doneness chosen) ──
                        if (selectedDoneness != null) {
                            val donenessOpt = donenessMap[selectedDoneness!!]
                            val defaultTempC = donenessOpt?.tempC ?: 57
                            val effectiveTempC = customTempC ?: defaultTempC
                            val showSafetyWarning = cut.usdaSafeC > 0 &&
                                effectiveTempC < cut.usdaSafeC

                            Spacer(modifier = Modifier.height(16.dp))
                            Text("🎯 $strTargetTemp", style = MaterialTheme.typography.titleMedium)
                            Spacer(modifier = Modifier.height(8.dp))

                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                colors = CardDefaults.cardColors(
                                    containerColor = if (showSafetyWarning)
                                        MaterialTheme.colorScheme.errorContainer
                                    else
                                        MaterialTheme.colorScheme.surfaceVariant
                                )
                            ) {
                                Column(modifier = Modifier.padding(12.dp)) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(
                                            "$effectiveTempC°C",
                                            style = MaterialTheme.typography.headlineMedium
                                        )
                                        if (customTempC != null) {
                                            Text(
                                                "($strCustom)",
                                                style = MaterialTheme.typography.bodySmall,
                                                color = MaterialTheme.colorScheme.primary,
                                                modifier = Modifier.padding(top = 10.dp)
                                            )
                                        }
                                    }

                                    if (showSafetyWarning) {
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            "⚠️ $strSafetyWarn (${cut.usdaSafeC}°C)",
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.onErrorContainer
                                        )
                                    }

                                    Spacer(modifier = Modifier.height(8.dp))
                                    Slider(
                                        value = effectiveTempC.toFloat(),
                                        onValueChange = { customTempC = it.toInt() },
                                        valueRange = 35f..100f,
                                        steps = 64,   // 1 °C steps across 35–100 range
                                        modifier = Modifier.fillMaxWidth()
                                    )

                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                                    ) {
                                        OutlinedButton(
                                            onClick = {
                                                customTempC = (effectiveTempC - 1).coerceAtLeast(35)
                                            },
                                            modifier = Modifier.weight(1f)
                                        ) { Text("-1°C") }
                                        OutlinedButton(
                                            onClick = {
                                                customTempC = (effectiveTempC + 1).coerceAtMost(100)
                                            },
                                            modifier = Modifier.weight(1f)
                                        ) { Text("+1°C") }
                                    }

                                    if (customTempC != null) {
                                        TextButton(
                                            onClick = { customTempC = null },
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Text(
                                                "$strResetTo $defaultTempC°C",
                                                style = MaterialTheme.typography.bodySmall
                                            )
                                        }
                                    }
                                }
                            }

                            // ── Step 6: Cooking method ────────────────────────────
                            if (cut.supportedMethods.isNotEmpty()) {
                                Spacer(modifier = Modifier.height(16.dp))
                                Text("🍳 $strPickMethod", style = MaterialTheme.typography.titleMedium)
                                Spacer(modifier = Modifier.height(8.dp))

                                cut.supportedMethods.forEach { methodSlug ->
                                    val methodLabel = methodSlug
                                        .split('_')
                                        .joinToString(" ") { w ->
                                            w.replaceFirstChar { it.uppercaseChar() }
                                        }
                                    val isMethodSelected = selectedMethod == methodSlug
                                    val titles = recipeTitles[cut.slug]?.get(methodSlug)

                                    Card(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 3.dp)
                                            .clickable {
                                                selectedMethod =
                                                    if (selectedMethod == methodSlug) null
                                                    else methodSlug
                                            },
                                        colors = if (isMethodSelected)
                                            CardDefaults.cardColors(
                                                containerColor = MaterialTheme.colorScheme.primaryContainer
                                            )
                                        else CardDefaults.cardColors()
                                    ) {
                                        Column(
                                            modifier = Modifier.padding(
                                                horizontal = 12.dp,
                                                vertical = 10.dp
                                            )
                                        ) {
                                            Text(
                                                "🍳 $methodLabel",
                                                style = MaterialTheme.typography.bodyLarge
                                            )

                                            // Recipe titles for this method — shown when selected
                                            if (isMethodSelected && !titles.isNullOrEmpty()) {
                                                Spacer(modifier = Modifier.height(8.dp))
                                                Text(
                                                    "📖 $strRecipes",
                                                    style = MaterialTheme.typography.labelMedium,
                                                    color = MaterialTheme.colorScheme.primary
                                                )
                                                titles.forEach { title ->
                                                    TextButton(
                                                        onClick = {
                                                            onViewRecipe(
                                                                cut.slug,
                                                                cut.name,
                                                                cut.nameSv,
                                                                methodSlug
                                                            )
                                                        },
                                                        modifier = Modifier.fillMaxWidth()
                                                    ) {
                                                        Text(
                                                            "📄 $title",
                                                            style = MaterialTheme.typography.bodySmall,
                                                            modifier = Modifier.fillMaxWidth()
                                                        )
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            // ── Step 7: Start Cook button ─────────────────────────
                            Spacer(modifier = Modifier.height(16.dp))

                            val needsMethod = cut.supportedMethods.isNotEmpty()
                            val canStart = !needsMethod || selectedMethod != null

                            if (needsMethod && selectedMethod == null) {
                                Text(
                                    strMethodNeeded,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                )
                            }

                            Button(
                                onClick = {
                                    onConfirm(
                                        selectedCategory!!.id,
                                        cut.id,
                                        cut.name,
                                        cut.nameSv,
                                        selectedDoneness!!,
                                        effectiveTempC,
                                        cut.restTimeMax.coerceAtLeast(1),
                                        selectedMethod ?: ""
                                    )
                                },
                                enabled = canStart,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text("🚀 $strStartCook — $effectiveTempC°C")
                            }

                            Spacer(modifier = Modifier.height(16.dp))
                        }
                    }

                    // ── Step 3: cut picker (grouped by cutType) ───────────────────
                    selectedSpecies != null -> {
                        val species = selectedSpecies!!
                        Text(
                            text = if (useSv && species.nameSv.isNotBlank()) species.nameSv
                                   else species.name,
                            style = MaterialTheme.typography.headlineSmall
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(strPickCut, style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(8.dp))

                        species.cutTypes.forEach { cutType ->
                            if (species.cutTypes.size > 1) {
                                val ctLabel = if (useSv && cutType.nameSv.isNotBlank())
                                    cutType.nameSv else cutType.name
                                Text(
                                    text = ctLabel,
                                    style = MaterialTheme.typography.labelLarge,
                                    color = MaterialTheme.colorScheme.primary,
                                    modifier = Modifier.padding(top = 8.dp, bottom = 2.dp)
                                )
                                HorizontalDivider()
                            }
                            cutType.cuts.forEach { cut ->
                                val label = if (useSv && cut.nameSv.isNotBlank())
                                    cut.nameSv else cut.name
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 4.dp)
                                        .clickable {
                                            selectedCut = cut
                                            selectedDoneness = null
                                            customTempC = null
                                            selectedMethod = null
                                        }
                                ) {
                                    Text(
                                        label,
                                        modifier = Modifier.padding(12.dp),
                                        style = MaterialTheme.typography.bodyLarge
                                    )
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

                        val speciesList = cat.species
                        if (speciesList.size == 1) {
                            selectedSpecies = speciesList[0]
                        } else {
                            Text(strPickSpec, style = MaterialTheme.typography.titleMedium)
                            Spacer(modifier = Modifier.height(8.dp))
                            speciesList.forEach { species ->
                                val label = if (useSv && species.nameSv.isNotBlank())
                                    species.nameSv else species.name
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 4.dp)
                                        .clickable { selectedSpecies = species }
                                ) {
                                    Text(
                                        label,
                                        modifier = Modifier.padding(12.dp),
                                        style = MaterialTheme.typography.bodyLarge
                                    )
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
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 4.dp)
                                    .clickable { selectedCategory = cat }
                            ) {
                                Text(
                                    "${cat.icon} $label",
                                    modifier = Modifier.padding(12.dp),
                                    style = MaterialTheme.typography.bodyLarge
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
