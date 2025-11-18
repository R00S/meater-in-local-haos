package cm.aptoide.p092pt.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.app.C0245i;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.MainActivity;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.Single;

/* compiled from: ReadyToInstallNotificationManager.kt */
@Metadata(m32266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006$"}, m32267d2 = {"Lcm/aptoide/pt/notification/ReadyToInstallNotificationManager;", HttpUrl.FRAGMENT_ENCODE_SET, "installManager", "Lcm/aptoide/pt/install/InstallManager;", "notificationIdsMapper", "Lcm/aptoide/pt/notification/NotificationIdsMapper;", "(Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/notification/NotificationIdsMapper;)V", "getInstallManager", "()Lcm/aptoide/pt/install/InstallManager;", "isNotificationDisplayed", HttpUrl.FRAGMENT_ENCODE_SET, "getNotificationIdsMapper", "()Lcm/aptoide/pt/notification/NotificationIdsMapper;", "buildMultiReadyToInstallNotification", "Lrx/Single;", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "buildNotification", "aptoideNotification", "Lcm/aptoide/pt/notification/AptoideNotification;", "buildSingleReadyToInstallNotification", "appName", HttpUrl.FRAGMENT_ENCODE_SET, RoomInstalled.ICON, "url", "getMultiAppPressIntentAction", "Landroid/app/PendingIntent;", "getNotificationChannel", "Landroid/app/NotificationChannel;", "getOnDismissAction", "getSingleAppPressIntentAction", "setIsNotificationDisplayed", HttpUrl.FRAGMENT_ENCODE_SET, "isActive", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ReadyToInstallNotificationManager {
    public static final String CHANNEL_ID = "ready_to_install_notification_channel";
    public static final String ORIGIN = "ready_to_install";
    private final InstallManager installManager;
    private boolean isNotificationDisplayed;
    private final NotificationIdsMapper notificationIdsMapper;

    public ReadyToInstallNotificationManager(InstallManager installManager, NotificationIdsMapper notificationIdsMapper) {
        C9801m.m32346f(installManager, "installManager");
        C9801m.m32346f(notificationIdsMapper, "notificationIdsMapper");
        this.installManager = installManager;
        this.notificationIdsMapper = notificationIdsMapper;
    }

    private final Single<Notification> buildMultiReadyToInstallNotification(final Context context) {
        Single<Notification> singleM39912l = Single.m39912l(new Callable() { // from class: cm.aptoide.pt.notification.a1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReadyToInstallNotificationManager.m40959buildMultiReadyToInstallNotification$lambda2(context, this);
            }
        });
        C9801m.m32345e(singleM39912l, "fromCallable {\n      val…\n      notification\n    }");
        return singleM39912l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: buildMultiReadyToInstallNotification$lambda-2, reason: not valid java name */
    public static final Notification m40959buildMultiReadyToInstallNotification$lambda2(Context context, ReadyToInstallNotificationManager readyToInstallNotificationManager) {
        C9801m.m32346f(context, "$context");
        C9801m.m32346f(readyToInstallNotificationManager, "this$0");
        String string = context.getString(C1146R.string.notification_install_ready_plural_title);
        C9801m.m32345e(string, "context.getString(R.stri…stall_ready_plural_title)");
        String string2 = context.getString(C1146R.string.notification_install_ready_plural_body);
        C9801m.m32345e(string2, "context.getString(R.stri…nstall_ready_plural_body)");
        Notification notificationM1590c = new C0245i.e(context).m1595j(readyToInstallNotificationManager.getMultiAppPressIntentAction(context)).m1599n(readyToInstallNotificationManager.getOnDismissAction(context)).m1609y(C1146R.drawable.ic_stat_aptoide_notification).m1600p(BitmapFactory.decodeResource(context.getResources(), C1146R.mipmap.ic_launcher)).m1597l(string).m1596k(string2).m1583A(new C0245i.c().m1576h(string2)).m1592g(true).m1593h(CHANNEL_ID).m1605u(true).m1604t(true).m1590c();
        C9801m.m32345e(notificationM1590c, "Builder(context)\n       …(true)\n          .build()");
        return notificationM1590c;
    }

    private final Single<Notification> buildSingleReadyToInstallNotification(final String appName, final String icon, final String url, final Context context) {
        Single<Notification> singleM39912l = Single.m39912l(new Callable() { // from class: cm.aptoide.pt.notification.b1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReadyToInstallNotificationManager.m40960buildSingleReadyToInstallNotification$lambda1(context, appName, this, url, icon);
            }
        });
        C9801m.m32345e(singleM39912l, "fromCallable {\n      val…\n      notification\n    }");
        return singleM39912l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: buildSingleReadyToInstallNotification$lambda-1, reason: not valid java name */
    public static final Notification m40960buildSingleReadyToInstallNotification$lambda1(Context context, String str, ReadyToInstallNotificationManager readyToInstallNotificationManager, String str2, String str3) {
        C9801m.m32346f(context, "$context");
        C9801m.m32346f(str, "$appName");
        C9801m.m32346f(readyToInstallNotificationManager, "this$0");
        C9801m.m32346f(str2, "$url");
        C9801m.m32346f(str3, "$icon");
        String string = context.getString(C1146R.string.notification_install_ready_singular_title);
        C9801m.m32345e(string, "context.getString(R.stri…all_ready_singular_title)");
        String string2 = context.getString(C1146R.string.notification_install_ready_singular_body, str);
        C9801m.m32345e(string2, "context.getString(R.stri…y_singular_body, appName)");
        Notification notificationM1590c = new C0245i.e(context).m1595j(readyToInstallNotificationManager.getSingleAppPressIntentAction(str2, context)).m1599n(readyToInstallNotificationManager.getOnDismissAction(context)).m1609y(C1146R.drawable.ic_stat_aptoide_notification).m1597l(string).m1596k(string2).m1600p(ImageLoader.with(context).loadBitmap(str3)).m1583A(new C0245i.c().m1576h(string2)).m1592g(true).m1604t(true).m1593h(CHANNEL_ID).m1605u(true).m1590c();
        C9801m.m32345e(notificationM1590c, "Builder(context)\n       …(true)\n          .build()");
        return notificationM1590c;
    }

    private final PendingIntent getMultiAppPressIntentAction(Context context) {
        Intent intent = new Intent(context, AptoideApplication.getActivityProvider().getMainActivityFragmentClass());
        intent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.APPS, true);
        intent.putExtra(DeepLinkIntentReceiver.DeepLinksKeys.FROM_NOTIFICATION_READY_TO_INSTALL, true);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 67108864);
        C9801m.m32345e(activity, "getActivity(\n      conte…tent.FLAG_IMMUTABLE\n    )");
        return activity;
    }

    private final PendingIntent getOnDismissAction(Context context) throws RuntimeException {
        int notificationId = this.notificationIdsMapper.getNotificationId(9);
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction(SystemNotificationShower.NOTIFICATION_DISMISSED_ACTION);
        intent.putExtra(SystemNotificationShower.NOTIFICATION_NOTIFICATION_ID, notificationId);
        return PendingIntent.getActivity(context, notificationId, intent, 167772160);
    }

    private final PendingIntent getSingleAppPressIntentAction(String url, Context context) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse(url), context, DeepLinkIntentReceiver.class), 67108864);
        C9801m.m32345e(activity, "getActivity(\n      conte…tent.FLAG_IMMUTABLE\n    )");
        return activity;
    }

    public final Single<Notification> buildNotification(AptoideNotification aptoideNotification, Context context) {
        C9801m.m32346f(aptoideNotification, "aptoideNotification");
        C9801m.m32346f(context, "context");
        if (this.isNotificationDisplayed) {
            return buildMultiReadyToInstallNotification(context);
        }
        String appName = aptoideNotification.getAppName();
        C9801m.m32345e(appName, "aptoideNotification.appName");
        String img = aptoideNotification.getImg();
        C9801m.m32345e(img, "aptoideNotification.img");
        String url = aptoideNotification.getUrl();
        C9801m.m32345e(url, "aptoideNotification.url");
        return buildSingleReadyToInstallNotification(appName, img, url, context);
    }

    public final InstallManager getInstallManager() {
        return this.installManager;
    }

    public final NotificationChannel getNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Install notifications", 3);
        notificationChannel.setDescription("Install");
        return notificationChannel;
    }

    public final NotificationIdsMapper getNotificationIdsMapper() {
        return this.notificationIdsMapper;
    }

    public final synchronized void setIsNotificationDisplayed(boolean isActive) {
        this.isNotificationDisplayed = isActive;
    }
}
