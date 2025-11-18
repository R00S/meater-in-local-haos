package cm.aptoide.p092pt;

import cm.aptoide.p092pt.abtesting.ABTestCenterRepository;
import cm.aptoide.p092pt.abtesting.ABTestManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesABTestManagerFactory implements Provider {
    private final Provider<ABTestCenterRepository> abTestCenterRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesABTestManagerFactory(ApplicationModule applicationModule, Provider<ABTestCenterRepository> provider) {
        this.module = applicationModule;
        this.abTestCenterRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesABTestManagerFactory create(ApplicationModule applicationModule, Provider<ABTestCenterRepository> provider) {
        return new ApplicationModule_ProvidesABTestManagerFactory(applicationModule, provider);
    }

    public static ABTestManager providesABTestManager(ApplicationModule applicationModule, ABTestCenterRepository aBTestCenterRepository) {
        return (ABTestManager) C9055b.m29112c(applicationModule.providesABTestManager(aBTestCenterRepository));
    }

    @Override // javax.inject.Provider
    public ABTestManager get() {
        return providesABTestManager(this.module, this.abTestCenterRepositoryProvider.get());
    }
}
