package cm.aptoide.p092pt;

import cm.aptoide.p092pt.account.DatabaseStoreDataPersist;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDatabaseStoreDataPersistFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;

    public ApplicationModule_ProvidesDatabaseStoreDataPersistFactory(ApplicationModule applicationModule, Provider<RoomStoreRepository> provider) {
        this.module = applicationModule;
        this.storeRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesDatabaseStoreDataPersistFactory create(ApplicationModule applicationModule, Provider<RoomStoreRepository> provider) {
        return new ApplicationModule_ProvidesDatabaseStoreDataPersistFactory(applicationModule, provider);
    }

    public static DatabaseStoreDataPersist providesDatabaseStoreDataPersist(ApplicationModule applicationModule, RoomStoreRepository roomStoreRepository) {
        return (DatabaseStoreDataPersist) C9055b.m29112c(applicationModule.providesDatabaseStoreDataPersist(roomStoreRepository));
    }

    @Override // javax.inject.Provider
    public DatabaseStoreDataPersist get() {
        return providesDatabaseStoreDataPersist(this.module, this.storeRepositoryProvider.get());
    }
}
