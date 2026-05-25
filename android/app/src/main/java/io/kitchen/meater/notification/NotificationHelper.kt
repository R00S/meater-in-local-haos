package io.kitchen.meater.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import io.kitchen.meater.cooking.CookingSession
import io.kitchen.meater.cooking.CookingState

/**
 * Fires local Android notifications at key cooking milestones.
 * Mirrors the KCE HAOS sensor.py events:
 *   - EVENT_APPROACHING   → "X is approaching target temperature"
 *   - EVENT_GOAL_REACHED  → "X has reached Y °C — time to rest!"
 *   - EVENT_REST_COMPLETE → "X has finished resting and is ready to serve!"
 */
class NotificationHelper(private val context: Context) {

    companion object {
        const val CHANNEL_ID = "meater_cooking"
        private const val CHANNEL_NAME = "Cooking Notifications"
    }

    init {
        createChannel()
    }

    private fun createChannel() {
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (manager.getNotificationChannel(CHANNEL_ID) == null) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                CHANNEL_NAME,
                NotificationManager.IMPORTANCE_HIGH
            )
            manager.createNotificationChannel(channel)
        }
    }

    fun notifyApproaching(session: CookingSession) {
        val target = session.targetTempC ?: return
        val cut = session.cutDisplayName.ifBlank { "Probe ${session.probeIndex + 1}" }
        post(
            id = notifId(session, 0),
            title = "Approaching target",
            body = "$cut is within 10 °C of ${target}°C"
        )
    }

    fun notifyGoalReached(session: CookingSession) {
        val target = session.targetTempC ?: return
        val cut = session.cutDisplayName.ifBlank { "Probe ${session.probeIndex + 1}" }
        post(
            id = notifId(session, 1),
            title = "Target reached!",
            body = "$cut has reached ${target}°C — time to rest!"
        )
    }

    fun notifyRestComplete(session: CookingSession) {
        val cut = session.cutDisplayName.ifBlank { "Probe ${session.probeIndex + 1}" }
        post(
            id = notifId(session, 2),
            title = "Ready to serve!",
            body = "$cut has finished resting and is ready to eat."
        )
    }

    private fun notifId(session: CookingSession, type: Int): Int =
        (session.probeIndex * 10) + type

    private fun post(id: Int, title: String, body: String) {
        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentTitle(title)
            .setContentText(body)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .build()
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(id, notification)
    }
}
