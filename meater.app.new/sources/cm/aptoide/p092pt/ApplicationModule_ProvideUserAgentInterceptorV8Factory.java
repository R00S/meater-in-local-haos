package cm.aptoide.p092pt;

import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.preferences.AptoideMd5Manager;
import javax.inject.Provider;
import okhttp3.Interceptor;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideUserAgentInterceptorV8Factory implements Provider {
    private final Provider<AptoideMd5Manager> aptoideMd5ManagerProvider;
    private final Provider<String> aptoidePackageProvider;
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideUserAgentInterceptorV8Factory(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<String> provider2, Provider<AuthenticationPersistence> provider3, Provider<AptoideMd5Manager> provider4) {
        this.module = applicationModule;
        this.idsRepositoryProvider = provider;
        this.aptoidePackageProvider = provider2;
        this.authenticationPersistenceProvider = provider3;
        this.aptoideMd5ManagerProvider = provider4;
    }

    public static ApplicationModule_ProvideUserAgentInterceptorV8Factory create(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<String> provider2, Provider<AuthenticationPersistence> provider3, Provider<AptoideMd5Manager> provider4) {
        return new ApplicationModule_ProvideUserAgentInterceptorV8Factory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static Interceptor provideUserAgentInterceptorV8(ApplicationModule applicationModule, IdsRepository idsRepository, String str, AuthenticationPersistence authenticationPersistence, AptoideMd5Manager aptoideMd5Manager) {
        return (Interceptor) C9055b.m29112c(applicationModule.provideUserAgentInterceptorV8(idsRepository, str, authenticationPersistence, aptoideMd5Manager));
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return provideUserAgentInterceptorV8(this.module, this.idsRepositoryProvider.get(), this.aptoidePackageProvider.get(), this.authenticationPersistenceProvider.get(), this.aptoideMd5ManagerProvider.get());
    }
}
