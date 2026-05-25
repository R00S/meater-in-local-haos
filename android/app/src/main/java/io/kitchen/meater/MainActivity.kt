package io.kitchen.meater

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import io.kitchen.meater.ui.MainScreen
import io.kitchen.meater.ui.MainViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(
                state = viewModel.uiState,
                onScanToggle = {
                    if (viewModel.uiState.isScanning) {
                        viewModel.stopScan()
                    } else {
                        viewModel.startScan(this)
                    }
                },
                onSelectDevice = { address ->
                    viewModel.selectDevice(address)
                },
                onConnectToggle = {
                    viewModel.connectOrDisconnect(this)
                }
            )
        }
    }
}
