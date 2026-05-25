package io.kitchen.meater.data

import android.content.Context
import org.json.JSONArray
import org.json.JSONObject
import java.time.Instant

/**
 * Local storage for completed cook sessions.
 * Uses SharedPreferences with JSON serialisation.
 * Schema: list of session summary objects stored under key "sessions".
 */
class SessionHistoryRepository(context: Context) {

    private val prefs = context.getSharedPreferences("meater_history", Context.MODE_PRIVATE)

    data class SessionRecord(
        val id: String,
        val cutDisplayName: String,
        val doneness: String,
        val targetTempC: Int?,
        val finalTipC: Float?,
        val cookStartedAt: String?,
        val restMinutes: Int,
        val notes: String
    )

    fun saveSession(record: SessionRecord) {
        val list = loadAll().toMutableList()
        list.removeAll { it.id == record.id }   // replace if already stored
        list.add(record)
        persist(list)
    }

    fun loadAll(): List<SessionRecord> {
        val json = prefs.getString("sessions", "[]") ?: "[]"
        return try {
            val arr = JSONArray(json)
            (0 until arr.length()).map { arr.getJSONObject(it).toRecord() }
        } catch (_: Exception) {
            emptyList()
        }
    }

    fun updateNotes(id: String, notes: String) {
        val list = loadAll().map {
            if (it.id == id) it.copy(notes = notes) else it
        }
        persist(list)
    }

    fun deleteSession(id: String) {
        val list = loadAll().filter { it.id != id }
        persist(list)
    }

    private fun persist(list: List<SessionRecord>) {
        val arr = JSONArray()
        list.forEach { arr.put(it.toJson()) }
        prefs.edit().putString("sessions", arr.toString()).apply()
    }

    private fun SessionRecord.toJson() = JSONObject().apply {
        put("id", id)
        put("cutDisplayName", cutDisplayName)
        put("doneness", doneness)
        put("targetTempC", targetTempC ?: JSONObject.NULL)
        put("finalTipC", finalTipC ?: JSONObject.NULL)
        put("cookStartedAt", cookStartedAt ?: JSONObject.NULL)
        put("restMinutes", restMinutes)
        put("notes", notes)
    }

    private fun JSONObject.toRecord() = SessionRecord(
        id = getString("id"),
        cutDisplayName = getString("cutDisplayName"),
        doneness = getString("doneness"),
        targetTempC = if (isNull("targetTempC")) null else getInt("targetTempC"),
        finalTipC = if (isNull("finalTipC")) null else getDouble("finalTipC").toFloat(),
        cookStartedAt = if (isNull("cookStartedAt")) null else getString("cookStartedAt"),
        restMinutes = getInt("restMinutes"),
        notes = getString("notes")
    )
}
