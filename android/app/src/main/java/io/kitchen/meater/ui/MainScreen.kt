package io.kitchen.meater.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(
    state: MainUiState,
    onScanToggle: () -> Unit
) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Text(text = "MEATER Kitchen", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = state.status)
            Spacer(modifier = Modifier.height(12.dp))
            Button(onClick = onScanToggle) {
                Text(if (state.isScanning) "Stop Scan" else "Start BLE Scan")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Discovered devices", style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(8.dp))
            LazyColumn {
                items(state.discoveredDevices) { device ->
                    Text(text = "• $device")
                    Spacer(modifier = Modifier.height(6.dp))
                }
            }
        }
    }
}
