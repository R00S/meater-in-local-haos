package cm.aptoide.p092pt;

import cm.aptoide.p092pt.notification.RoomLocalNotificationSyncPersistence;
import cm.aptoide.p092pt.sync.alarm.SyncStorage;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideSyncStorageFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<RoomLocalNotificationSyncPersistence> persistenceProvider;

    public ApplicationModule_ProvideSyncStorageFactory(ApplicationModule applicationModule, Provider<RoomLocalNotificationSyncPersistence> provider) {
        this.module = applicationModule;
        this.persistenceProvider = provider;
    }

    public static ApplicationModule_ProvideSyncStorageFactory create(ApplicationModule applicationModule, Provider<RoomLocalNotificationSyncPersistence> provider) {
        return new ApplicationModule_ProvideSyncStorageFactory(applicationModule, provider);
    }

    public static SyncStorage provideSyncStorage(ApplicationModule applicationModule, RoomLocalNotificationSyncPersistence roomLocalNotificationSyncPersistence) {
        return (SyncStorage) C9055b.m29112c(applicationModule.provideSyncStorage(roomLocalNotificationSyncPersistence));
    }

    @Override // javax.inject.Provider
    public SyncStorage get() {
        return provideSyncStorage(this.module, this.persistenceProvider.get());
    }
}
