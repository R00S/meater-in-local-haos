package cm.aptoide.p092pt;

import cm.aptoide.p092pt.notification.NotificationProvider;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import cm.aptoide.p092pt.sync.SyncScheduler;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesLocalNotificationSyncManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<NotificationProvider> providerProvider;
    private final Provider<SyncScheduler> syncSchedulerProvider;

    public ApplicationModule_ProvidesLocalNotificationSyncManagerFactory(ApplicationModule applicationModule, Provider<SyncScheduler> provider, Provider<NotificationProvider> provider2) {
        this.module = applicationModule;
        this.syncSchedulerProvider = provider;
        this.providerProvider = provider2;
    }

    public static ApplicationModule_ProvidesLocalNotificationSyncManagerFactory create(ApplicationModule applicationModule, Provider<SyncScheduler> provider, Provider<NotificationProvider> provider2) {
        return new ApplicationModule_ProvidesLocalNotificationSyncManagerFactory(applicationModule, provider, provider2);
    }

    public static LocalNotificationSyncManager providesLocalNotificationSyncManager(ApplicationModule applicationModule, SyncScheduler syncScheduler, NotificationProvider notificationProvider) {
        return (LocalNotificationSyncManager) C9055b.m29112c(applicationModule.providesLocalNotificationSyncManager(syncScheduler, notificationProvider));
    }

    @Override // javax.inject.Provider
    public LocalNotificationSyncManager get() {
        return providesLocalNotificationSyncManager(this.module, this.syncSchedulerProvider.get(), this.providerProvider.get());
    }
}
