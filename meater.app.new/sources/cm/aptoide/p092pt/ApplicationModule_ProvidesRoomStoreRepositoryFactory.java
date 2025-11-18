package cm.aptoide.p092pt;

import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StorePersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRoomStoreRepositoryFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<StorePersistence> storePersistenceProvider;

    public ApplicationModule_ProvidesRoomStoreRepositoryFactory(ApplicationModule applicationModule, Provider<StorePersistence> provider) {
        this.module = applicationModule;
        this.storePersistenceProvider = provider;
    }

    public static ApplicationModule_ProvidesRoomStoreRepositoryFactory create(ApplicationModule applicationModule, Provider<StorePersistence> provider) {
        return new ApplicationModule_ProvidesRoomStoreRepositoryFactory(applicationModule, provider);
    }

    public static RoomStoreRepository providesRoomStoreRepository(ApplicationModule applicationModule, StorePersistence storePersistence) {
        return (RoomStoreRepository) C9055b.m29112c(applicationModule.providesRoomStoreRepository(storePersistence));
    }

    @Override // javax.inject.Provider
    public RoomStoreRepository get() {
        return providesRoomStoreRepository(this.module, this.storePersistenceProvider.get());
    }
}
