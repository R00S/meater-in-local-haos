package cm.aptoide.p092pt;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.C0245i;
import androidx.core.app.C0248l;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.MainActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: AptoideFirebaseNotificationService.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m32267d2 = {"Lcm/aptoide/pt/AptoideFirebaseNotificationService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "firebaseNotificationAnalytics", "Lcm/aptoide/pt/FirebaseNotificationAnalytics;", "getFirebaseNotificationAnalytics", "()Lcm/aptoide/pt/FirebaseNotificationAnalytics;", "setFirebaseNotificationAnalytics", "(Lcm/aptoide/pt/FirebaseNotificationAnalytics;)V", "handleIntent", HttpUrl.FRAGMENT_ENCODE_SET, "intent", "Landroid/content/Intent;", "onCreate", "onMessageReceived", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", HttpUrl.FRAGMENT_ENCODE_SET, "setupNotificationChannel", "context", "Landroid/content/Context;", "showNotification", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AptoideFirebaseNotificationService extends FirebaseMessagingService {
    public static final String FCM_NOTIFICATION_CHANNEL_ID = "fcm_notification_channel";
    public static final String FCM_NOTIFICATION_CHANNEL_NAME = "Remote Notification Channel";

    @Inject
    public FirebaseNotificationAnalytics firebaseNotificationAnalytics;

    private final void setupNotificationChannel(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = context.getSystemService("notification");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (notificationManager.getNotificationChannel(FCM_NOTIFICATION_CHANNEL_ID) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(FCM_NOTIFICATION_CHANNEL_ID, FCM_NOTIFICATION_CHANNEL_NAME, 3);
                notificationChannel.setSound(null, null);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    private final void showNotification(Context context, RemoteMessage message) {
        RemoteMessage.C8418b c8418bM26457z = message.m26457z();
        if (c8418bM26457z != null) {
            String strM26456y = message.m26456y();
            int iHashCode = strM26456y != null ? strM26456y.hashCode() : 0;
            Notification notificationM1590c = new C0245i.e(getApplicationContext(), FCM_NOTIFICATION_CHANNEL_ID).m1595j(PendingIntent.getActivity(context, iHashCode, new Intent(context, (Class<?>) MainActivity.class).putExtras(message.m26455W()).putExtra(FirebaseConstants.FIREBASE_MESSAGE_ID, message.m26456y()).putExtra(FirebaseConstants.FIREBASE_ANALYTICS_DATA, message.m26455W().getExtras()), 201326592)).m1604t(false).m1609y(C1146R.drawable.ic_stat_aptoide_notification).m1600p(ImageLoader.with(getApplicationContext()).loadBitmap(String.valueOf(c8418bM26457z.m26460b()))).m1597l(c8418bM26457z.m26461d()).m1596k(c8418bM26457z.m26459a()).m1606v(0).m1592g(true).m1608x(true).m1590c();
            C9801m.m32345e(notificationM1590c, "Builder(applicationConte…(true)\n          .build()");
            C0248l.m1628b(getApplicationContext()).m1633d(iHashCode, notificationM1590c);
        }
    }

    public final FirebaseNotificationAnalytics getFirebaseNotificationAnalytics() {
        FirebaseNotificationAnalytics firebaseNotificationAnalytics = this.firebaseNotificationAnalytics;
        if (firebaseNotificationAnalytics != null) {
            return firebaseNotificationAnalytics;
        }
        C9801m.m32363w("firebaseNotificationAnalytics");
        return null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.AbstractServiceC8433g
    public void handleIntent(Intent intent) {
        try {
            C9801m.m32343c(intent);
            intent.putExtra(FirebaseConstants.LAUNCH_SOURCE, "notification");
            onMessageReceived(new RemoteMessage(intent.getExtras()));
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString(FirebaseConstants.FIREBASE_MESSAGE_ID);
                String string2 = extras.getString(FirebaseConstants.FIREBASE_MESSAGE_NAME);
                if (string == null || string2 == null) {
                    return;
                }
                getFirebaseNotificationAnalytics().sendFirebaseNotificationReceived(string, string2, System.currentTimeMillis(), extras.getString(FirebaseConstants.FIREBASE_MESSAGE_LABEL), C0248l.m1628b(getApplicationContext()).m1632a());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("null cannot be cast to non-null type cm.aptoide.pt.AptoideApplication");
        }
        ((AptoideApplication) applicationContext).getApplicationComponent().inject(this);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage message) {
        C9801m.m32346f(message, "message");
        super.onMessageReceived(message);
        if (message.m26457z() != null) {
            Context applicationContext = getApplicationContext();
            C9801m.m32345e(applicationContext, "applicationContext");
            setupNotificationChannel(applicationContext);
            Context applicationContext2 = getApplicationContext();
            C9801m.m32345e(applicationContext2, "applicationContext");
            showNotification(applicationContext2, message);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        C9801m.m32346f(token, "token");
        super.onNewToken(token);
        Log.d("firebase", "onNewToken: " + token);
    }

    public final void setFirebaseNotificationAnalytics(FirebaseNotificationAnalytics firebaseNotificationAnalytics) {
        C9801m.m32346f(firebaseNotificationAnalytics, "<set-?>");
        this.firebaseNotificationAnalytics = firebaseNotificationAnalytics;
    }
}
