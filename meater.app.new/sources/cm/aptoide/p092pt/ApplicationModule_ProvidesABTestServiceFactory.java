package cm.aptoide.p092pt;

import cm.aptoide.p092pt.abtesting.ABTestService;
import cm.aptoide.p092pt.abtesting.ABTestServiceProvider;
import cm.aptoide.p092pt.networking.IdsRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesABTestServiceFactory implements Provider {
    private final Provider<ABTestServiceProvider> abTestServiceProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesABTestServiceFactory(ApplicationModule applicationModule, Provider<ABTestServiceProvider> provider, Provider<IdsRepository> provider2) {
        this.module = applicationModule;
        this.abTestServiceProvider = provider;
        this.idsRepositoryProvider = provider2;
    }

    public static ApplicationModule_ProvidesABTestServiceFactory create(ApplicationModule applicationModule, Provider<ABTestServiceProvider> provider, Provider<IdsRepository> provider2) {
        return new ApplicationModule_ProvidesABTestServiceFactory(applicationModule, provider, provider2);
    }

    public static ABTestService providesABTestService(ApplicationModule applicationModule, ABTestServiceProvider aBTestServiceProvider, IdsRepository idsRepository) {
        return (ABTestService) C9055b.m29112c(applicationModule.providesABTestService(aBTestServiceProvider, idsRepository));
    }

    @Override // javax.inject.Provider
    public ABTestService get() {
        return providesABTestService(this.module, this.abTestServiceProvider.get(), this.idsRepositoryProvider.get());
    }
}
