package cm.aptoide.p092pt;

import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.preferences.AptoideMd5Manager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideNoAuthenticationBodyInterceptorV3Factory */
/* loaded from: classes.dex */
public final class C1137xcbc5ac1 implements Provider {
    private final Provider<AptoideMd5Manager> aptoideMd5ManagerProvider;
    private final Provider<String> aptoidePackageProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;

    public C1137xcbc5ac1(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<String> provider2, Provider<AptoideMd5Manager> provider3) {
        this.module = applicationModule;
        this.idsRepositoryProvider = provider;
        this.aptoidePackageProvider = provider2;
        this.aptoideMd5ManagerProvider = provider3;
    }

    public static C1137xcbc5ac1 create(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<String> provider2, Provider<AptoideMd5Manager> provider3) {
        return new C1137xcbc5ac1(applicationModule, provider, provider2, provider3);
    }

    public static BodyInterceptor<BaseBody> provideNoAuthenticationBodyInterceptorV3(ApplicationModule applicationModule, IdsRepository idsRepository, String str, AptoideMd5Manager aptoideMd5Manager) {
        return (BodyInterceptor) C9055b.m29112c(applicationModule.provideNoAuthenticationBodyInterceptorV3(idsRepository, str, aptoideMd5Manager));
    }

    @Override // javax.inject.Provider
    public BodyInterceptor<BaseBody> get() {
        return provideNoAuthenticationBodyInterceptorV3(this.module, this.idsRepositoryProvider.get(), this.aptoidePackageProvider.get(), this.aptoideMd5ManagerProvider.get());
    }
}
