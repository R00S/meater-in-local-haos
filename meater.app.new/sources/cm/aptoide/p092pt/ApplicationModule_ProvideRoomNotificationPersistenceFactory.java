package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.RoomNotificationPersistence;
import cm.aptoide.p092pt.database.room.AptoideDatabase;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideRoomNotificationPersistenceFactory implements Provider {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideRoomNotificationPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvideRoomNotificationPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvideRoomNotificationPersistenceFactory(applicationModule, provider);
    }

    public static RoomNotificationPersistence provideRoomNotificationPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        return (RoomNotificationPersistence) C9055b.m29112c(applicationModule.provideRoomNotificationPersistence(aptoideDatabase));
    }

    @Override // javax.inject.Provider
    public RoomNotificationPersistence get() {
        return provideRoomNotificationPersistence(this.module, this.databaseProvider.get());
    }
}
