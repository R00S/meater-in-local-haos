package io.kitchen.meater.data

import android.content.Context

class SessionHistoryRepository(context: Context) {
    private val prefs = context.getSharedPreferences("meater_history", Context.MODE_PRIVATE)

    fun saveSessionSummary(sessionId: String, summary: String) {
        prefs.edit().putString(sessionId, summary).apply()
    }

    fun getSessionSummary(sessionId: String): String? = prefs.getString(sessionId, null)
}
