package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.appsflyer.AppsFlyerRepository;
import cm.aptoide.p092pt.app.appsflyer.AppsFlyerService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppsFlyerRepositoryFactory implements Provider {
    private final Provider<AppsFlyerService> appsFlyerServiceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppsFlyerRepositoryFactory(ApplicationModule applicationModule, Provider<AppsFlyerService> provider) {
        this.module = applicationModule;
        this.appsFlyerServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesAppsFlyerRepositoryFactory create(ApplicationModule applicationModule, Provider<AppsFlyerService> provider) {
        return new ApplicationModule_ProvidesAppsFlyerRepositoryFactory(applicationModule, provider);
    }

    public static AppsFlyerRepository providesAppsFlyerRepository(ApplicationModule applicationModule, AppsFlyerService appsFlyerService) {
        return (AppsFlyerRepository) C9055b.m29112c(applicationModule.providesAppsFlyerRepository(appsFlyerService));
    }

    @Override // javax.inject.Provider
    public AppsFlyerRepository get() {
        return providesAppsFlyerRepository(this.module, this.appsFlyerServiceProvider.get());
    }
}
