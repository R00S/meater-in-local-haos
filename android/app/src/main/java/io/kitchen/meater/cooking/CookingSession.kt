package io.kitchen.meater.cooking

import java.time.Instant

/**
 * All state for a single active probe cooking session.
 *
 * [targetTempC] comes from the cut file data (doneness level).
 * [state] transitions are managed by [CookingEngine].
 */
data class CookingSession(
    val probeIndex: Int,             // 0-based probe slot in the Block
    val probeAddress: String,

    // Selection
    val proteinCategory: String = "",
    val cutId: String = "",
    val cutDisplayName: String = "",   // English name (ground truth: cut file `name`)
    val cutDisplayNameSv: String = "", // Swedish name  (ground truth: cut file `name_sv`)
    val doneness: String = "",
    val targetTempC: Int? = null,

    // Live readings
    val tipCelsius: Float? = null,
    val ambientCelsius: Float? = null,
    val batteryPercent: Int? = null,

    // State machine
    val state: CookingState = CookingState.IDLE,

    // ETA
    val etaMinutes: Int? = null,

    // Notification state
    val fiveMinuteRemainingNotified: Boolean = false,

    // History (time → temp °C) for ETA rate calculation
    val tempHistory: List<TempSample> = emptyList(),

    // Timestamps
    val cookStartedAt: Instant? = null,
    val restStartedAt: Instant? = null,
    val restMinutes: Int = 0,
    val transitionTriggeredAt: Instant? = null,

    // Rest complete flag
    val restNotified: Boolean = false,

    // Cooking method selected before starting (e.g. "pan_sear", "grill")
    val cookingMethod: String = "",

    // Notes
    val notes: String = ""
)

data class TempSample(val time: Instant, val tempC: Float)
