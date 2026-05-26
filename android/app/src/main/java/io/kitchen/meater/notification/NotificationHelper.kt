package io.kitchen.meater.notification

import android.Manifest
import android.app.PendingIntent
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.content.ContextCompat
import androidx.core.app.NotificationCompat
import android.content.pm.PackageManager
import io.kitchen.meater.cooking.CookingSession

/**
 * Fires local Android notifications at key cooking milestones.
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
            channel.description = "MEATER cook alerts"
            channel.enableVibration(true)
            channel.vibrationPattern = longArrayOf(0, 350, 150, 350)
            manager.createNotificationChannel(channel)
        }
    }

    fun notifyCookingStarted(session: CookingSession, useSv: Boolean) {
        val cut = cutLabel(session)
        post(
            id = notifId(session, 0),
            title = if (useSv) "Tillagning startad" else "Cooking started",
            body = if (useSv) "$cut har startats." else "$cut has started."
        )
    }

    fun notifyFiveMinutesRemaining(session: CookingSession, useSv: Boolean) {
        val cut = cutLabel(session)
        post(
            id = notifId(session, 1),
            title = if (useSv) "5 minuter kvar" else "5 minutes remaining",
            body = if (useSv) "$cut beräknas vara klar om cirka 5 minuter."
            else "$cut is estimated to be ready in about 5 minutes."
        )
    }

    fun notifyRestRequired(session: CookingSession, useSv: Boolean) {
        val target = session.targetTempC ?: return
        val cut = cutLabel(session)
        post(
            id = notifId(session, 2),
            title = if (useSv) "Starta vilan" else "Start resting",
            body = if (useSv) "$cut har nått ${target}°C. Bekräfta att den ska vila."
            else "$cut has reached ${target}°C. Acknowledge that it should start resting."
        )
    }

    fun notifyDoneRequired(session: CookingSession, useSv: Boolean) {
        val cut = cutLabel(session)
        post(
            id = notifId(session, 3),
            title = if (useSv) "Vilan är klar" else "Rest complete",
            body = if (useSv) "$cut är klar att serveras. Bekräfta att den är färdig."
            else "$cut is ready to serve. Acknowledge that it is done."
        )
    }

    private fun notifId(session: CookingSession, type: Int): Int =
        (session.probeIndex * 10) + type

    private fun post(id: Int, title: String, body: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
            ContextCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }

        val launchIntent = context.packageManager
            .getLaunchIntentForPackage(context.packageName)
            ?.apply {
                flags = android.content.Intent.FLAG_ACTIVITY_NEW_TASK or
                    android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP or
                    android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
        val contentIntent = launchIntent?.let {
            PendingIntent.getActivity(
                context,
                0,
                it,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )
        }
        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(NotificationCompat.BigTextStyle().bigText(body))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setCategory(NotificationCompat.CATEGORY_ALARM)
            .setDefaults(NotificationCompat.DEFAULT_SOUND)
            .setVibrate(longArrayOf(0, 350, 150, 350))
            .setContentIntent(contentIntent)
            .setAutoCancel(true)
            .build()
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(id, notification)
    }

    private fun cutLabel(session: CookingSession): String =
        session.cutDisplayName.ifBlank { "Probe ${session.probeIndex + 1}" }
}
