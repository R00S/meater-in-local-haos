package cm.aptoide.p092pt.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC0818y;
import androidx.work.C0704c;
import androidx.work.C0812s;
import androidx.work.EnumC0707f;
import androidx.work.EnumC0808o;
import cm.aptoide.p092pt.updates.UpdatesAnalytics;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11231b;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: UpdatesNotificationManager.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\r"}, m32267d2 = {"Lcm/aptoide/pt/notification/UpdatesNotificationManager;", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "updatesWorkRequest", "Landroidx/work/PeriodicWorkRequest;", "setUpChannel", HttpUrl.FRAGMENT_ENCODE_SET, "setUpNotification", "Lrx/Completable;", "setUpWorkRequest", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class UpdatesNotificationManager {
    public static final String CHANNEL_ID = "updates_notification_channel";
    public static final int UPDATE_NOTIFICATION_ID = 123;
    private static final String WORKER_TAG = "UpdatesNotificationWorker";
    private final Context context;
    private C0812s updatesWorkRequest;

    public UpdatesNotificationManager(Context context) {
        C9801m.m32346f(context, "context");
        this.context = context;
    }

    private final void setUpChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Updates notifications", 3);
            notificationChannel.setDescription(UpdatesAnalytics.UPDATE_EVENT);
            Object systemService = this.context.getSystemService("notification");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpNotification$lambda-0, reason: not valid java name */
    public static final void m40961setUpNotification$lambda0(UpdatesNotificationManager updatesNotificationManager) {
        C9801m.m32346f(updatesNotificationManager, "this$0");
        updatesNotificationManager.setUpChannel();
        updatesNotificationManager.setUpWorkRequest();
    }

    private final void setUpWorkRequest() {
        C0812s c0812sM5246b = new C0812s.a(UpdatesNotificationWorker.class, 1L, TimeUnit.DAYS).m5247e(new C0704c.a().m4817b(EnumC0808o.UNMETERED).m4816a()).m5246b();
        C9801m.m32345e(c0812sM5246b, "PeriodicWorkRequestBuild…build())\n        .build()");
        this.updatesWorkRequest = c0812sM5246b;
        AbstractC0818y abstractC0818yM5238h = AbstractC0818y.m5238h(this.context);
        EnumC0707f enumC0707f = EnumC0707f.KEEP;
        C0812s c0812s = this.updatesWorkRequest;
        if (c0812s == null) {
            C9801m.m32363w("updatesWorkRequest");
            c0812s = null;
        }
        abstractC0818yM5238h.mo4987e(WORKER_TAG, enumC0707f, c0812s);
    }

    public final C11231b setUpNotification() {
        C11231b c11231bM39952t = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.notification.k2
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                UpdatesNotificationManager.m40961setUpNotification$lambda0(this.f10409f);
            }
        });
        C9801m.m32345e(c11231bM39952t, "fromAction {\n      setUp… setUpWorkRequest()\n    }");
        return c11231bM39952t;
    }
}
