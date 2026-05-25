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

        // Resting phase — check completion
        if (session.state == CookingState.RESTING) {
            val restStart = session.restStartedAt ?: now
            val restElapsedMin = (now.epochSecond - restStart.epochSecond) / 60f
            val done = restElapsedMin >= session.restMinutes && session.restMinutes > 0

            return session.copy(
                tipCelsius = tipC,
                ambientCelsius = ambientC,
                tempHistory = newHistory,
                state = if (done) CookingState.DONE else CookingState.RESTING
            )
        }

        // Cooking phase — evaluate state transitions
        if (targetC == null) {
            return session.copy(tipCelsius = tipC, ambientCelsius = ambientC, tempHistory = newHistory)
        }

        val newState = when {
            tipC >= targetC -> CookingState.GOAL_REACHED
            tipC >= targetC - APPROACHING_THRESHOLD_C -> CookingState.APPROACHING
            else -> CookingState.COOKING
        }

        val etaMin = if (newState != CookingState.GOAL_REACHED) {
            calculateEta(tipC, targetC.toFloat(), newHistory)
        } else 0

        // Transition to resting when goal first reached
        val (finalState, restStart) = when {
            newState == CookingState.GOAL_REACHED && session.state != CookingState.GOAL_REACHED ->
                CookingState.RESTING to now
            newState == CookingState.GOAL_REACHED ->
                CookingState.RESTING to (session.restStartedAt ?: now)
            else -> newState to session.restStartedAt
        }

        return session.copy(
            tipCelsius = tipC,
            ambientCelsius = ambientC,
            tempHistory = newHistory,
            state = finalState,
            etaMinutes = if (finalState == CookingState.COOKING || finalState == CookingState.APPROACHING) etaMin else null,
            restStartedAt = restStart
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
        restMinutes: Int = 5
    ): CookingSession = session.copy(
        proteinCategory = proteinCategory,
        cutId = cutId,
        cutDisplayName = cutDisplayName,
        cutDisplayNameSv = cutDisplayNameSv,
        doneness = doneness,
        targetTempC = targetTempC,
        restMinutes = restMinutes,
        state = CookingState.COOKING,
        cookStartedAt = Instant.now(),
        etaMinutes = null,
        tempHistory = emptyList(),
        restStartedAt = null,
        restNotified = false
    )

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
}
