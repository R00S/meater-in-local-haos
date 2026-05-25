package io.kitchen.meater

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import io.kitchen.meater.ui.AppScreen
import io.kitchen.meater.ui.CookHistoryScreen
import io.kitchen.meater.ui.CutSelectionScreen
import io.kitchen.meater.ui.MainScreen
import io.kitchen.meater.ui.MainViewModel
import io.kitchen.meater.ui.PermissionScreen
import io.kitchen.meater.ui.RecipeScreen

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

                AppScreen.CUT_SELECTION -> CutSelectionScreen(
                    probeIndex = state.cutSelectionProbeIndex,
                    useSv = state.language == "sv",
                    onConfirm = { catId, cutId, cutName, cutNameSv, doneness, tempC, restMin, method ->
                        viewModel.startCooking(
                            probeIndex = state.cutSelectionProbeIndex,
                            proteinCategory = catId,
                            cutId = cutId,
                            cutDisplayName = cutName,
                            cutDisplayNameSv = cutNameSv,
                            doneness = doneness,
                            targetTempC = tempC,
                            restMinutes = restMin,
                            cookingMethod = method
                        )
                    },
                    onViewRecipe = { slug, cutName, cutNameSv, method ->
                        viewModel.openRecipe(
                            probeIndex = state.cutSelectionProbeIndex,
                            slug = slug,
                            cutName = cutName,
                            cutNameSv = cutNameSv,
                            method = method
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
