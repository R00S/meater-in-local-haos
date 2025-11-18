package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.NetworkOperatorManager;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.preferences.AptoideMd5Manager;
import cm.aptoide.p092pt.utils.p106q.QManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesBodyInterceptorV3Factory implements Provider {
    private final Provider<AptoideMd5Manager> aptoideMd5ManagerProvider;
    private final Provider<String> aptoidePackageProvider;
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<NetworkOperatorManager> networkOperatorManagerProvider;
    private final Provider<QManager> qManagerProvider;

    public ApplicationModule_ProvidesBodyInterceptorV3Factory(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<QManager> provider2, Provider<SharedPreferences> provider3, Provider<NetworkOperatorManager> provider4, Provider<AuthenticationPersistence> provider5, Provider<String> provider6, Provider<AptoideMd5Manager> provider7) {
        this.module = applicationModule;
        this.idsRepositoryProvider = provider;
        this.qManagerProvider = provider2;
        this.defaultSharedPreferencesProvider = provider3;
        this.networkOperatorManagerProvider = provider4;
        this.authenticationPersistenceProvider = provider5;
        this.aptoidePackageProvider = provider6;
        this.aptoideMd5ManagerProvider = provider7;
    }

    public static ApplicationModule_ProvidesBodyInterceptorV3Factory create(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<QManager> provider2, Provider<SharedPreferences> provider3, Provider<NetworkOperatorManager> provider4, Provider<AuthenticationPersistence> provider5, Provider<String> provider6, Provider<AptoideMd5Manager> provider7) {
        return new ApplicationModule_ProvidesBodyInterceptorV3Factory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static BodyInterceptor<BaseBody> providesBodyInterceptorV3(ApplicationModule applicationModule, IdsRepository idsRepository, QManager qManager, SharedPreferences sharedPreferences, NetworkOperatorManager networkOperatorManager, AuthenticationPersistence authenticationPersistence, String str, AptoideMd5Manager aptoideMd5Manager) {
        return (BodyInterceptor) C9055b.m29112c(applicationModule.providesBodyInterceptorV3(idsRepository, qManager, sharedPreferences, networkOperatorManager, authenticationPersistence, str, aptoideMd5Manager));
    }

    @Override // javax.inject.Provider
    public BodyInterceptor<BaseBody> get() {
        return providesBodyInterceptorV3(this.module, this.idsRepositoryProvider.get(), this.qManagerProvider.get(), this.defaultSharedPreferencesProvider.get(), this.networkOperatorManagerProvider.get(), this.authenticationPersistenceProvider.get(), this.aptoidePackageProvider.get(), this.aptoideMd5ManagerProvider.get());
    }
}
