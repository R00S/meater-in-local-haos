package cm.aptoide.p092pt.notification.sync;

import cm.aptoide.p092pt.notification.NotificationProvider;
import cm.aptoide.p092pt.sync.SyncScheduler;

/* loaded from: classes.dex */
public class LocalNotificationSyncManager {
    public static final long FIVE_MINUTES = 300000;
    public static final long TWO_MINUTES = 120000;
    private boolean enabled;
    private final NotificationProvider provider;
    private final SyncScheduler syncScheduler;

    public LocalNotificationSyncManager(SyncScheduler syncScheduler, boolean z, NotificationProvider notificationProvider) {
        this.syncScheduler = syncScheduler;
        this.enabled = z;
        this.provider = notificationProvider;
    }

    public void schedule(String str, String str2, String str3, int i2, String str4, String str5, int i3, long j2) {
        if (this.enabled) {
            this.syncScheduler.schedule(new LocalNotificationSync(this.provider, false, true, 0L, j2, str, str2, str3, i2, str4, str5, i3));
        }
    }

    public void unschedule(String str) {
        this.syncScheduler.cancel(str);
    }
}
