package cm.aptoide.p092pt;

import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.aab.DynamicSplitsService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDynamicSplitsManagerFactory implements Provider {
    private final Provider<DynamicSplitsService> dynamicSplitsServiceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDynamicSplitsManagerFactory(ApplicationModule applicationModule, Provider<DynamicSplitsService> provider) {
        this.module = applicationModule;
        this.dynamicSplitsServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesDynamicSplitsManagerFactory create(ApplicationModule applicationModule, Provider<DynamicSplitsService> provider) {
        return new ApplicationModule_ProvidesDynamicSplitsManagerFactory(applicationModule, provider);
    }

    public static DynamicSplitsManager providesDynamicSplitsManager(ApplicationModule applicationModule, DynamicSplitsService dynamicSplitsService) {
        return (DynamicSplitsManager) C9055b.m29112c(applicationModule.providesDynamicSplitsManager(dynamicSplitsService));
    }

    @Override // javax.inject.Provider
    public DynamicSplitsManager get() {
        return providesDynamicSplitsManager(this.module, this.dynamicSplitsServiceProvider.get());
    }
}
