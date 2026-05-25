package io.kitchen.meater.ui

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import io.kitchen.meater.ble.MeaterBleScanner
import io.kitchen.meater.ble.MeaterBleService
import io.kitchen.meater.cooking.CookingEngine
import io.kitchen.meater.cooking.CookingSession
import io.kitchen.meater.cooking.CookingState
import io.kitchen.meater.data.ProbeRepository
import io.kitchen.meater.data.SessionHistoryRepository
import io.kitchen.meater.model.BleDevice
import io.kitchen.meater.notification.NotificationHelper

enum class AppScreen {
    PERMISSIONS,
    SCAN,
    DASHBOARD,
    CUT_SELECTION,
    WEBVIEW_PANEL
}

data class MainUiState(
    val screen: AppScreen = AppScreen.PERMISSIONS,
    val isScanning: Boolean = false,
    val discoveredDevices: List<BleDevice> = emptyList(),
    val knownProbes: List<BleDevice> = emptyList(),
    val selectedDeviceAddress: String? = null,
    val connectedDeviceAddress: String? = null,
    val isConnected: Boolean = false,
    val status: String = "Ready",
    val sessions: Map<Int, CookingSession> = emptyMap(),
    val language: String = "en",
    // Which probe the cut selection screen is targeting (-1 = none)
    val cutSelectionProbeIndex: Int = -1,
    // Full MAC for direct connect without scanning
    val manualMacAddress: String = ""
)

class MainViewModel : ViewModel() {
    var uiState by mutableStateOf(MainUiState())
        private set

    private var notificationHelper: NotificationHelper? = null
    private var historyRepository: SessionHistoryRepository? = null
    private var probeRepository: ProbeRepository? = null

    private val scanner = MeaterBleScanner(
        onDeviceFound = { device ->
            if (uiState.discoveredDevices.none { it.address == device.address }) {
                uiState = uiState.copy(discoveredDevices = uiState.discoveredDevices + device)
            }
        },
        onError = { message ->
            uiState = uiState.copy(status = message, isScanning = false)
        }
    )

    private val bleService = MeaterBleService(
        onStatus = { message -> uiState = uiState.copy(status = message) },
        onTemperature = { probeIndex, tipC, ambientC ->
            handleTemperatureUpdate(probeIndex, tipC, ambientC)
        },
        onBattery = { probeIndex, percent ->
            val sessions = uiState.sessions.toMutableMap()
            val existing = sessions[probeIndex] ?: CookingSession(
                probeIndex = probeIndex,
                probeAddress = uiState.connectedDeviceAddress ?: ""
            )
            sessions[probeIndex] = existing.copy(batteryPercent = percent)
            uiState = uiState.copy(sessions = sessions)
        },
        onDisconnected = {
            uiState = uiState.copy(
                isConnected = false,
                connectedDeviceAddress = null,
                status = "Disconnected",
                screen = AppScreen.SCAN
            )
        },
        onError = { message -> uiState = uiState.copy(status = message) }
    )

    fun init(context: Context) {
        notificationHelper = NotificationHelper(context)
        historyRepository = SessionHistoryRepository(context)
        probeRepository = ProbeRepository(context)
        val lang = LanguagePreference.get(context)
        val known = probeRepository!!.loadAll()
        uiState = uiState.copy(language = lang, knownProbes = known)
    }

    // ── Permission ──────────────────────────────────────────────────────────

    fun onPermissionsGranted() {
        uiState = uiState.copy(screen = AppScreen.SCAN)
    }

    // ── Language ────────────────────────────────────────────────────────────

    fun setLanguage(context: Context, lang: String) {
        LanguagePreference.set(context, lang)
        uiState = uiState.copy(language = lang)
    }

    // ── Scan ─────────────────────────────────────────────────────────────────

    fun startScan(context: Context) {
        init(context)
        uiState = uiState.copy(
            isScanning = true,
            status = "Scanning for BLE devices…",
            discoveredDevices = emptyList(),
            selectedDeviceAddress = null
        )
        scanner.start(context)
    }

    fun stopScan() {
        scanner.stop()
        uiState = uiState.copy(isScanning = false, status = "Scan stopped")
    }

    fun selectDevice(address: String) {
        uiState = uiState.copy(selectedDeviceAddress = address)
    }

    fun setManualMacAddress(mac: String) {
        uiState = uiState.copy(manualMacAddress = mac)
    }

    fun connectManualMac(context: Context) {
        val mac = uiState.manualMacAddress.trim().uppercase()
        if (!mac.matches(Regex("^([0-9A-F]{2}:){5}[0-9A-F]{2}$"))) {
            uiState = uiState.copy(status = "Invalid MAC — use XX:XX:XX:XX:XX:XX")
            return
        }
        connectToAddress(context, BleDevice(name = mac, address = mac))
    }

    // ── Connect ──────────────────────────────────────────────────────────────

    fun connectOrDisconnect(context: Context) {
        if (uiState.isConnected) {
            bleService.disconnect()
            uiState = uiState.copy(
                isConnected = false,
                connectedDeviceAddress = null,
                status = "Disconnected",
                sessions = emptyMap(),
                screen = AppScreen.SCAN
            )
            return
        }

        val selected = uiState.selectedDeviceAddress ?: run {
            uiState = uiState.copy(status = "Select a device first")
            return
        }
        val device = uiState.discoveredDevices.find { it.address == selected }
            ?: BleDevice(name = selected, address = selected)
        connectToAddress(context, device)
    }

    fun connectKnownProbe(context: Context, probe: BleDevice) {
        connectToAddress(context, probe)
    }

    fun forgetProbe(address: String) {
        probeRepository?.delete(address)
        uiState = uiState.copy(knownProbes = probeRepository?.loadAll() ?: emptyList())
    }

    private fun connectToAddress(context: Context, device: BleDevice) {
        scanner.stop()
        init(context)
        bleService.connect(context, device.address)
        // Save as a known probe for future sessions
        probeRepository?.save(device)
        uiState = uiState.copy(
            isConnected = true,
            connectedDeviceAddress = device.address,
            selectedDeviceAddress = device.address,
            knownProbes = probeRepository?.loadAll() ?: uiState.knownProbes,
            status = "Connecting to ${device.name}…",
            screen = AppScreen.DASHBOARD
        )
    }

    // ── Cut selection navigation ─────────────────────────────────────────────

    fun openCutSelection(probeIndex: Int) {
        uiState = uiState.copy(screen = AppScreen.CUT_SELECTION, cutSelectionProbeIndex = probeIndex)
    }

    fun openWebViewPanel() {
        uiState = uiState.copy(screen = AppScreen.WEBVIEW_PANEL)
    }

    fun backToDashboard() {
        uiState = uiState.copy(screen = AppScreen.DASHBOARD, cutSelectionProbeIndex = -1)
    }

    // ── Cooking session management ───────────────────────────────────────────

    fun startCooking(
        probeIndex: Int,
        proteinCategory: String,
        cutId: String,
        cutDisplayName: String,
        doneness: String,
        targetTempC: Int,
        restMinutes: Int = 5
    ) {
        val sessions = uiState.sessions.toMutableMap()
        val existing = sessions[probeIndex] ?: CookingSession(
            probeIndex = probeIndex,
            probeAddress = uiState.connectedDeviceAddress ?: ""
        )
        sessions[probeIndex] = CookingEngine.startSession(
            session = existing,
            proteinCategory = proteinCategory,
            cutId = cutId,
            cutDisplayName = cutDisplayName,
            doneness = doneness,
            targetTempC = targetTempC,
            restMinutes = restMinutes
        )
        uiState = uiState.copy(sessions = sessions, screen = AppScreen.DASHBOARD, cutSelectionProbeIndex = -1)
    }

    fun stopCooking(context: Context, probeIndex: Int) {
        val sessions = uiState.sessions.toMutableMap()
        val session = sessions[probeIndex] ?: return
        saveSessionToHistory(session)
        sessions[probeIndex] = session.copy(state = CookingState.IDLE)
        uiState = uiState.copy(sessions = sessions)
    }

    fun updateNotes(probeIndex: Int, notes: String) {
        val sessions = uiState.sessions.toMutableMap()
        sessions[probeIndex] = sessions[probeIndex]?.copy(notes = notes) ?: return
        uiState = uiState.copy(sessions = sessions)
    }

    private fun handleTemperatureUpdate(probeIndex: Int, tipC: Float, ambientC: Float) {
        val sessions = uiState.sessions.toMutableMap()
        val existing = sessions[probeIndex] ?: CookingSession(
            probeIndex = probeIndex,
            probeAddress = uiState.connectedDeviceAddress ?: ""
        )

        val prevState = existing.state
        val updated = CookingEngine.update(existing, tipC, ambientC)
        sessions[probeIndex] = updated

        val helper = notificationHelper
        if (helper != null) {
            when {
                prevState == CookingState.COOKING && updated.state == CookingState.APPROACHING ->
                    helper.notifyApproaching(updated)
                prevState != CookingState.RESTING && updated.state == CookingState.RESTING ->
                    helper.notifyGoalReached(updated)
                prevState == CookingState.RESTING && updated.state == CookingState.DONE ->
                    helper.notifyRestComplete(updated)
            }
        }

        if (updated.state == CookingState.DONE && prevState != CookingState.DONE) {
            saveSessionToHistory(updated)
        }

        uiState = uiState.copy(sessions = sessions)
    }

    private fun saveSessionToHistory(session: CookingSession) {
        val repo = historyRepository ?: return
        repo.saveSession(
            SessionHistoryRepository.SessionRecord(
                id = "${session.probeAddress}_${session.cookStartedAt?.epochSecond ?: 0}",
                cutDisplayName = session.cutDisplayName,
                doneness = session.doneness,
                targetTempC = session.targetTempC,
                finalTipC = session.tipCelsius,
                cookStartedAt = session.cookStartedAt?.toString(),
                restMinutes = session.restMinutes,
                notes = session.notes
            )
        )
    }

    override fun onCleared() {
        scanner.stop()
        bleService.disconnect()
        super.onCleared()
    }
}

