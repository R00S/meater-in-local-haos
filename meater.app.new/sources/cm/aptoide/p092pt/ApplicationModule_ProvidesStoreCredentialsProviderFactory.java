package cm.aptoide.p092pt;

import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesStoreCredentialsProviderFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;

    public ApplicationModule_ProvidesStoreCredentialsProviderFactory(ApplicationModule applicationModule, Provider<RoomStoreRepository> provider) {
        this.module = applicationModule;
        this.storeRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesStoreCredentialsProviderFactory create(ApplicationModule applicationModule, Provider<RoomStoreRepository> provider) {
        return new ApplicationModule_ProvidesStoreCredentialsProviderFactory(applicationModule, provider);
    }

    public static StoreCredentialsProvider providesStoreCredentialsProvider(ApplicationModule applicationModule, RoomStoreRepository roomStoreRepository) {
        return (StoreCredentialsProvider) C9055b.m29112c(applicationModule.providesStoreCredentialsProvider(roomStoreRepository));
    }

    @Override // javax.inject.Provider
    public StoreCredentialsProvider get() {
        return providesStoreCredentialsProvider(this.module, this.storeRepositoryProvider.get());
    }
}
