package io.kitchen.meater

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import io.kitchen.meater.data.CookingDataRepository
import io.kitchen.meater.ui.AppScreen
import io.kitchen.meater.ui.CookHistoryScreen
import io.kitchen.meater.ui.MainScreen
import io.kitchen.meater.ui.MainViewModel
import io.kitchen.meater.ui.PermissionScreen
import io.kitchen.meater.ui.RecipeScreen
import io.kitchen.meater.ui.WebViewCutSelectionScreen

class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.init(this)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val screen = viewModel.uiState.screen
                if (screen == AppScreen.CUT_SELECTION ||
                    screen == AppScreen.HISTORY ||
                    screen == AppScreen.RECIPE) {
                    viewModel.backToDashboard()
                } else {
                    isEnabled = false
                    onBackPressedDispatcher.onBackPressed()
                }
            }
        })

        setContent {
            val state = viewModel.uiState

            when (state.screen) {

                AppScreen.PERMISSIONS -> PermissionScreen(
                    onPermissionsGranted = { viewModel.onPermissionsGranted() }
                )

                AppScreen.SCAN, AppScreen.DASHBOARD -> MainScreen(
                    state = state,
                    discoveredDevices = viewModel.scannedDevices,
                    onScanToggle = {
                        if (state.isScanning) viewModel.stopScan()
                        else viewModel.startScan(this)
                    },
                    onSelectDevice = { viewModel.selectDevice(it) },
                    onConnectToggle = { viewModel.connectOrDisconnect(this) },
                    onManualMacChange = { viewModel.setManualMacAddress(it) },
                    onConnectManualMac = { viewModel.connectManualMac(this) },
                    onConnectKnownProbe = { probe -> viewModel.connectKnownProbe(this, probe) },
                    onForgetProbe = { address -> viewModel.forgetProbe(address) },
                    onSelectCut = { probeIndex -> viewModel.openCutSelection(probeIndex) },
                    onAddProbeSlot = { viewModel.addProbeSlot() },
                    onOpenWebView = { viewModel.openWebViewPanel() },
                    onLanguageToggle = {
                        val next = if (state.language == "sv") "en" else "sv"
                        viewModel.setLanguage(this, next)
                    }
                )

                AppScreen.CUT_SELECTION -> WebViewCutSelectionScreen(
                    probeIndex = state.cutSelectionProbeIndex,
                    language   = state.language,
                    modifier   = Modifier.fillMaxSize(),
                    onStartCook = { probeIndex, cutId, doneness, customTempC, method, _ ->
                        // Enrich the bare service-data with cut display names, protein
                        // category, rest time — all sourced from CookingDataRepository
                        // (which reads EXP_TREE / EXP_DONENESS_OPTIONS from the same
                        // kitchen-cooking-panel.js asset the WebView just ran).
                        val repo       = CookingDataRepository(this)
                        val cut        = repo.findCutById(cutId)
                        val donenessOp = repo.doneness[doneness]
                        val targetTempC = customTempC
                            ?: donenessOp?.tempC
                            ?: 65   // safe fallback (USDA poultry minimum)
                        val category   = repo.findCategoryIdByCutId(cutId)
                        val restMin    = cut?.restTimeMin ?: 5
                        viewModel.startCooking(
                            probeIndex       = probeIndex,
                            proteinCategory  = category,
                            cutId            = cutId,
                            cutDisplayName   = cut?.name   ?: cutId,
                            cutDisplayNameSv = cut?.nameSv ?: "",
                            doneness         = doneness,
                            targetTempC      = targetTempC,
                            restMinutes      = restMin,
                            cookingMethod    = method
                        )
                    },
                    onCancel = { viewModel.backToDashboard() }
                )

                AppScreen.HISTORY -> CookHistoryScreen(
                    useSv = state.language == "sv",
                    onBack = { viewModel.backToDashboard() }
                )

                AppScreen.RECIPE -> RecipeScreen(
                    slug = state.recipeCutSlug,
                    cutName = state.recipeCutName,
                    cutNameSv = state.recipeCutNameSv,
                    method = state.recipeMethod,
                    useSv = state.language == "sv",
                    onBack = { viewModel.backToDashboard() }
                )
            }
        }
    }
}
