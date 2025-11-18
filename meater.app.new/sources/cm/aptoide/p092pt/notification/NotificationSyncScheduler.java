package cm.aptoide.p092pt.notification;

/* loaded from: classes.dex */
public interface NotificationSyncScheduler {
    void forceSync();

    void removeSchedules();

    void schedule();

    void setEnabled(boolean z);
}
