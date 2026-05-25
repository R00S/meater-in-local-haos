package io.kitchen.meater

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import io.kitchen.meater.ui.AppScreen
import io.kitchen.meater.ui.CutSelectionScreen
import io.kitchen.meater.ui.MainScreen
import io.kitchen.meater.ui.MainViewModel
import io.kitchen.meater.ui.PermissionScreen
import io.kitchen.meater.ui.WebViewCookingScreen

class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.init(this)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val screen = viewModel.uiState.screen
                if (screen == AppScreen.CUT_SELECTION || screen == AppScreen.WEBVIEW_PANEL) {
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
                    onScanToggle = {
                        if (state.isScanning) viewModel.stopScan()
                        else viewModel.startScan(this)
                    },
                    onSelectDevice = { viewModel.selectDevice(it) },
                    onConnectToggle = { viewModel.connectOrDisconnect(this) },
                    onSelectCut = { probeIndex -> viewModel.openCutSelection(probeIndex) },
                    onOpenWebView = { viewModel.openWebViewPanel() },
                    onLanguageToggle = {
                        val next = if (state.language == "sv") "en" else "sv"
                        viewModel.setLanguage(this, next)
                    }
                )

                AppScreen.CUT_SELECTION -> CutSelectionScreen(
                    probeIndex = state.cutSelectionProbeIndex,
                    useSv = state.language == "sv",
                    onConfirm = { catId, cutId, cutName, doneness, tempC, restMin ->
                        viewModel.startCooking(
                            probeIndex = state.cutSelectionProbeIndex,
                            proteinCategory = catId,
                            cutId = cutId,
                            cutDisplayName = cutName,
                            doneness = doneness,
                            targetTempC = tempC,
                            restMinutes = restMin
                        )
                    },
                    onCancel = { viewModel.backToDashboard() }
                )

                AppScreen.WEBVIEW_PANEL -> WebViewCookingScreen(
                    sessions = state.sessions,
                    language = state.language,
                    onStartCooking = { probeIndex, cutId, doneness, targetTempC ->
                        viewModel.startCooking(
                            probeIndex = probeIndex,
                            proteinCategory = "",
                            cutId = cutId,
                            cutDisplayName = cutId,
                            doneness = doneness,
                            targetTempC = targetTempC
                        )
                    },
                    onStopCooking = { probeIndex -> viewModel.stopCooking(this, probeIndex) }
                )
            }
        }
    }
}
