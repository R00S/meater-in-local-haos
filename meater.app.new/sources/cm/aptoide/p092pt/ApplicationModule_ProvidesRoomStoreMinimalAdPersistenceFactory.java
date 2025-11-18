package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.RoomStoredMinimalAdPersistence;
import cm.aptoide.p092pt.database.room.AptoideDatabase;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRoomStoreMinimalAdPersistenceFactory implements Provider {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRoomStoreMinimalAdPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvidesRoomStoreMinimalAdPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvidesRoomStoreMinimalAdPersistenceFactory(applicationModule, provider);
    }

    public static RoomStoredMinimalAdPersistence providesRoomStoreMinimalAdPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        return (RoomStoredMinimalAdPersistence) C9055b.m29112c(applicationModule.providesRoomStoreMinimalAdPersistence(aptoideDatabase));
    }

    @Override // javax.inject.Provider
    public RoomStoredMinimalAdPersistence get() {
        return providesRoomStoreMinimalAdPersistence(this.module, this.databaseProvider.get());
    }
}
