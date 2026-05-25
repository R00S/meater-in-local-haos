package io.kitchen.meater.ui

import android.content.Context
import java.util.Locale

/**
 * Persists language preference ("en" or "sv").
 * Defaults to the device locale if it is Swedish, otherwise English.
 */
object LanguagePreference {

    private const val PREFS_NAME = "meater_prefs"
    private const val KEY_LANGUAGE = "language"

    fun get(context: Context): String {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return prefs.getString(KEY_LANGUAGE, null) ?: deviceDefault()
    }

    fun set(context: Context, language: String) {
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .edit().putString(KEY_LANGUAGE, language).apply()
    }

    private fun deviceDefault(): String =
        if (Locale.getDefault().language == "sv") "sv" else "en"
}
