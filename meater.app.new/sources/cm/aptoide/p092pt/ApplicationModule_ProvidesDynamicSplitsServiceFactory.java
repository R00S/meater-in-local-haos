package cm.aptoide.p092pt;

import cm.aptoide.p092pt.aab.DynamicSplitsMapper;
import cm.aptoide.p092pt.aab.DynamicSplitsRemoteService;
import cm.aptoide.p092pt.aab.DynamicSplitsService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDynamicSplitsServiceFactory implements Provider {
    private final Provider<DynamicSplitsRemoteService.DynamicSplitsApi> dynamicSplitsApiProvider;
    private final Provider<DynamicSplitsMapper> dynamicSplitsMapperProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDynamicSplitsServiceFactory(ApplicationModule applicationModule, Provider<DynamicSplitsRemoteService.DynamicSplitsApi> provider, Provider<DynamicSplitsMapper> provider2) {
        this.module = applicationModule;
        this.dynamicSplitsApiProvider = provider;
        this.dynamicSplitsMapperProvider = provider2;
    }

    public static ApplicationModule_ProvidesDynamicSplitsServiceFactory create(ApplicationModule applicationModule, Provider<DynamicSplitsRemoteService.DynamicSplitsApi> provider, Provider<DynamicSplitsMapper> provider2) {
        return new ApplicationModule_ProvidesDynamicSplitsServiceFactory(applicationModule, provider, provider2);
    }

    public static DynamicSplitsService providesDynamicSplitsService(ApplicationModule applicationModule, DynamicSplitsRemoteService.DynamicSplitsApi dynamicSplitsApi, DynamicSplitsMapper dynamicSplitsMapper) {
        return (DynamicSplitsService) C9055b.m29112c(applicationModule.providesDynamicSplitsService(dynamicSplitsApi, dynamicSplitsMapper));
    }

    @Override // javax.inject.Provider
    public DynamicSplitsService get() {
        return providesDynamicSplitsService(this.module, this.dynamicSplitsApiProvider.get(), this.dynamicSplitsMapperProvider.get());
    }
}
