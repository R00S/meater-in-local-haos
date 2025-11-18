package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.room.AptoideDatabase;
import cm.aptoide.p092pt.notification.NotificationProvider;
import cm.aptoide.p092pt.notification.RoomLocalNotificationSyncPersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRoomLocalNotificationSyncPersistenceFactory */
/* loaded from: classes.dex */
public final class C1141xc7529b2c implements Provider {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;
    private final Provider<NotificationProvider> providerProvider;

    public C1141xc7529b2c(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<NotificationProvider> provider2) {
        this.module = applicationModule;
        this.databaseProvider = provider;
        this.providerProvider = provider2;
    }

    public static C1141xc7529b2c create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<NotificationProvider> provider2) {
        return new C1141xc7529b2c(applicationModule, provider, provider2);
    }

    public static RoomLocalNotificationSyncPersistence providesRoomLocalNotificationSyncPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase, NotificationProvider notificationProvider) {
        return (RoomLocalNotificationSyncPersistence) C9055b.m29112c(applicationModule.providesRoomLocalNotificationSyncPersistence(aptoideDatabase, notificationProvider));
    }

    @Override // javax.inject.Provider
    public RoomLocalNotificationSyncPersistence get() {
        return providesRoomLocalNotificationSyncPersistence(this.module, this.databaseProvider.get(), this.providerProvider.get());
    }
}
