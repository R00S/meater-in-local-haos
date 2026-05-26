package io.kitchen.meater.cooking

import java.time.Instant

/**
 * Port of the KCE cooking algorithm from sensor.py.
 *
 * Manages state transitions and ETA calculation for one probe session.
 * Mirrors sensor.py constants exactly:
 *   APPROACHING_THRESHOLD_C = 10
 *   MIN_RATE_CALC_TIME_MINUTES = 0.5
 *   MINUTES_PER_DEGREE_C = 1.5 (fallback)
 *   MAX_TEMP_HISTORY = 50
 */
object CookingEngine {

    private const val APPROACHING_THRESHOLD_C = 10
    private const val MIN_RATE_CALC_TIME_MINUTES = 0.5
    private const val MINUTES_PER_DEGREE_C = 1.5
    private const val MAX_TEMP_HISTORY = 50
    private const val RATE_WINDOW_SECONDS = 300L   // 5 minutes
    private const val REST_AMBIENT_MARGIN_C = 8f
    private const val DONE_AMBIENT_MARGIN_C = 4f
    private const val STABLE_OR_COOLING_SLOPE_C_PER_MIN = 0.1f

    /**
     * Process a new temperature reading and return an updated session.
     * This is pure functional — no side effects, caller fires notifications.
     */
    fun update(session: CookingSession, tipC: Float, ambientC: Float): CookingSession {
        if (session.state == CookingState.IDLE || session.state == CookingState.DONE) {
            return session.copy(tipCelsius = tipC, ambientCelsius = ambientC)
        }

        val now = Instant.now()

        // Append temperature history
        val newHistory = (session.tempHistory + TempSample(now, tipC))
            .takeLast(MAX_TEMP_HISTORY)

        val targetC = session.targetTempC

        if (session.state == CookingState.WAITING_FOR_REST_ACK) {
            val shouldAutoStartRest =
                targetC != null &&
                    shouldAutoStartRest(targetC.toFloat(), tipC, ambientC)

            return session.copy(
                tipCelsius = tipC,
                ambientCelsius = ambientC,
                tempHistory = newHistory,
                state = if (shouldAutoStartRest) CookingState.RESTING else CookingState.WAITING_FOR_REST_ACK,
                etaMinutes = null,
                restStartedAt = if (shouldAutoStartRest) now else session.restStartedAt,
                transitionTriggeredAt = if (shouldAutoStartRest) null else (session.transitionTriggeredAt ?: now)
            )
        }

        if (session.state == CookingState.RESTING) {
            val restStart = session.restStartedAt ?: now
            val restElapsedMin = (now.epochSecond - restStart.epochSecond) / 60f
            val done = restElapsedMin >= session.restMinutes && session.restMinutes > 0

            return session.copy(
                tipCelsius = tipC,
                ambientCelsius = ambientC,
                tempHistory = newHistory,
                state = if (done) CookingState.WAITING_FOR_DONE_ACK else CookingState.RESTING,
                transitionTriggeredAt = if (done) now else session.transitionTriggeredAt
            )
        }

        if (session.state == CookingState.WAITING_FOR_DONE_ACK) {
            val shouldAutoComplete =
                shouldAutoCompleteRest(tipC, ambientC, newHistory)

            return session.copy(
                tipCelsius = tipC,
                ambientCelsius = ambientC,
                tempHistory = newHistory,
                state = if (shouldAutoComplete) CookingState.DONE else CookingState.WAITING_FOR_DONE_ACK,
                etaMinutes = null,
                transitionTriggeredAt = if (shouldAutoComplete) null else (session.transitionTriggeredAt ?: now)
            )
        }

        // Cooking phase — evaluate state transitions
        if (targetC == null) {
            return session.copy(tipCelsius = tipC, ambientCelsius = ambientC, tempHistory = newHistory)
        }

        val newState = when {
            tipC >= targetC -> CookingState.WAITING_FOR_REST_ACK
            tipC >= targetC - APPROACHING_THRESHOLD_C -> CookingState.APPROACHING
            else -> CookingState.COOKING
        }

        val etaMin = if (newState != CookingState.WAITING_FOR_REST_ACK) {
            calculateEta(tipC, targetC.toFloat(), newHistory)
        } else 0

        return session.copy(
            tipCelsius = tipC,
            ambientCelsius = ambientC,
            tempHistory = newHistory,
            state = newState,
            etaMinutes = if (newState == CookingState.COOKING || newState == CookingState.APPROACHING) etaMin else null,
            restStartedAt = session.restStartedAt,
            transitionTriggeredAt = if (newState == CookingState.WAITING_FOR_REST_ACK && session.state != CookingState.WAITING_FOR_REST_ACK) now else session.transitionTriggeredAt
        )
    }

    /**
     * Start a cooking session with selected cut and target temperature.
     */
    fun startSession(
        session: CookingSession,
        proteinCategory: String,
        cutId: String,
        cutDisplayName: String,
        cutDisplayNameSv: String = "",
        doneness: String,
        targetTempC: Int,
        restMinutes: Int = 5,
        cookingMethod: String = ""
    ): CookingSession = session.copy(
        proteinCategory = proteinCategory,
        cutId = cutId,
        cutDisplayName = cutDisplayName,
        cutDisplayNameSv = cutDisplayNameSv,
        doneness = doneness,
        targetTempC = targetTempC,
        restMinutes = restMinutes,
        cookingMethod = cookingMethod,
        state = CookingState.COOKING,
        cookStartedAt = Instant.now(),
        etaMinutes = null,
        fiveMinuteRemainingNotified = false,
        tempHistory = emptyList(),
        restStartedAt = null,
        transitionTriggeredAt = null,
        restNotified = false
    )

    fun acknowledgeRest(session: CookingSession): CookingSession {
        if (session.state != CookingState.WAITING_FOR_REST_ACK) return session
        return session.copy(
            state = CookingState.RESTING,
            restStartedAt = Instant.now(),
            transitionTriggeredAt = null,
            etaMinutes = null
        )
    }

    fun acknowledgeDone(session: CookingSession): CookingSession {
        if (session.state != CookingState.WAITING_FOR_DONE_ACK) return session
        return session.copy(
            state = CookingState.DONE,
            transitionTriggeredAt = null,
            etaMinutes = null
        )
    }

    /**
     * Calculate ETA in minutes.
     * Mirrors sensor.py _calculate_eta():
     *  1. Uses last 5 minutes of temp history if enough data (≥2 samples, >0.5 min span)
     *  2. Falls back to MINUTES_PER_DEGREE_C constant
     */
    private fun calculateEta(currentC: Float, targetC: Float, history: List<TempSample>): Int {
        val tempDiff = targetC - currentC
        if (tempDiff <= 0) return 0

        val now = Instant.now()
        val recentSamples = history.filter {
            now.epochSecond - it.time.epochSecond <= RATE_WINDOW_SECONDS
        }

        if (recentSamples.size >= 2) {
            val first = recentSamples.first()
            val last = recentSamples.last()
            val tempChange = last.tempC - first.tempC
            val timeMinutes = (last.time.epochSecond - first.time.epochSecond) / 60.0

            if (timeMinutes > MIN_RATE_CALC_TIME_MINUTES && tempChange > 0) {
                val riseRate = tempChange / timeMinutes
                val eta = (tempDiff / riseRate).toInt()
                return maxOf(0, eta)
            }
        }

        return (tempDiff * MINUTES_PER_DEGREE_C).toInt()
    }

    private fun shouldAutoStartRest(targetC: Float, tipC: Float, ambientC: Float): Boolean {
        if (tipC < targetC) return false
        return ambientC <= tipC + REST_AMBIENT_MARGIN_C
    }

    private fun shouldAutoCompleteRest(
        tipC: Float,
        ambientC: Float,
        history: List<TempSample>
    ): Boolean {
        val ambientSettled = ambientC <= tipC + DONE_AMBIENT_MARGIN_C
        val slope = temperatureSlopePerMinute(history)
        return ambientSettled && slope <= STABLE_OR_COOLING_SLOPE_C_PER_MIN
    }

    private fun temperatureSlopePerMinute(history: List<TempSample>): Float {
        val now = Instant.now()
        val recentSamples = history.filter {
            now.epochSecond - it.time.epochSecond <= RATE_WINDOW_SECONDS
        }
        if (recentSamples.size < 2) return 0f

        val first = recentSamples.first()
        val last = recentSamples.last()
        val minutes = (last.time.epochSecond - first.time.epochSecond) / 60f
        if (minutes <= 0f) return 0f

        return (last.tempC - first.tempC) / minutes
    }
}
