package cm.aptoide.p092pt.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC0818y;
import androidx.work.C0706e;
import androidx.work.C0812s;
import androidx.work.EnumC0707f;
import cm.aptoide.p092pt.home.AppComingSoonRegistrationManager;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11231b;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: ComingSoonNotificationManager.kt */
@Metadata(m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m32267d2 = {"Lcm/aptoide/pt/notification/ComingSoonNotificationManager;", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "appComingSoonPreferencesManager", "Lcm/aptoide/pt/home/AppComingSoonRegistrationManager;", "(Landroid/content/Context;Lcm/aptoide/pt/home/AppComingSoonRegistrationManager;)V", "comingSoonWorkRequest", "Landroidx/work/PeriodicWorkRequest;", "cancelScheduledNotification", "Lrx/Completable;", "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "setUpChannel", HttpUrl.FRAGMENT_ENCODE_SET, "setUpWorkRequest", "url", "setupNotification", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ComingSoonNotificationManager {
    public static final String CHANNEL_ID = "coming_soon_notification_channel";
    public static final int NOTIFICATION_ID = 1994;
    public static final String PACKAGE_NAME = "package_name";
    public static final String WORKER_TAG = "ComingSoonNotificationWorker";
    private final AppComingSoonRegistrationManager appComingSoonPreferencesManager;
    private C0812s comingSoonWorkRequest;
    private final Context context;

    public ComingSoonNotificationManager(Context context, AppComingSoonRegistrationManager appComingSoonRegistrationManager) {
        C9801m.m32346f(context, "context");
        C9801m.m32346f(appComingSoonRegistrationManager, "appComingSoonPreferencesManager");
        this.context = context;
        this.appComingSoonPreferencesManager = appComingSoonRegistrationManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelScheduledNotification$lambda-2, reason: not valid java name */
    public static final void m40953cancelScheduledNotification$lambda2(ComingSoonNotificationManager comingSoonNotificationManager, String str) {
        C9801m.m32346f(comingSoonNotificationManager, "this$0");
        C9801m.m32346f(str, "$packageName");
        AbstractC0818y.m5238h(comingSoonNotificationManager.context).mo4984a(WORKER_TAG + str);
    }

    private final void setUpChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Coming Soon notifications", 3);
            notificationChannel.setDescription("Coming Soon");
            Object systemService = this.context.getSystemService("notification");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
    }

    private final void setUpWorkRequest(String url) {
        C0706e.a aVar = new C0706e.a();
        aVar.m4840f("package_name", url);
        C0812s c0812sM5246b = new C0812s.a(ComingSoonNotificationWorker.class, 1L, TimeUnit.DAYS).m5245a(WORKER_TAG + url).m5249g(aVar.m4835a()).m5246b();
        C9801m.m32345e(c0812sM5246b, "PeriodicWorkRequestBuild…build())\n        .build()");
        this.comingSoonWorkRequest = c0812sM5246b;
        AbstractC0818y abstractC0818yM5238h = AbstractC0818y.m5238h(this.context);
        String str = WORKER_TAG + url;
        EnumC0707f enumC0707f = EnumC0707f.KEEP;
        C0812s c0812s = this.comingSoonWorkRequest;
        if (c0812s == null) {
            C9801m.m32363w("comingSoonWorkRequest");
            c0812s = null;
        }
        abstractC0818yM5238h.mo4987e(str, enumC0707f, c0812s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupNotification$lambda-0, reason: not valid java name */
    public static final void m40954setupNotification$lambda0(ComingSoonNotificationManager comingSoonNotificationManager, String str) {
        C9801m.m32346f(comingSoonNotificationManager, "this$0");
        C9801m.m32346f(str, "$url");
        comingSoonNotificationManager.setUpChannel();
        comingSoonNotificationManager.setUpWorkRequest(str);
    }

    public final C11231b cancelScheduledNotification(final String str) {
        C9801m.m32346f(str, "packageName");
        C11231b c11231bM39973a = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.notification.b
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                ComingSoonNotificationManager.m40953cancelScheduledNotification$lambda2(this.f10350f, str);
            }
        }).m39973a(this.appComingSoonPreferencesManager.cancelScheduledNotification(str));
        C9801m.m32345e(c11231bM39973a, "fromAction {\n      WorkM…otification(packageName))");
        return c11231bM39973a;
    }

    public final C11231b setupNotification(final String str) {
        C9801m.m32346f(str, "url");
        C11231b c11231bM39973a = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.notification.a
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                ComingSoonNotificationManager.m40954setupNotification$lambda0(this.f10342f, str);
            }
        }).m39973a(this.appComingSoonPreferencesManager.registerUserNotification(str));
        C9801m.m32345e(c11231bM39973a, "fromAction {\n      setUp…terUserNotification(url))");
        return c11231bM39973a;
    }
}
