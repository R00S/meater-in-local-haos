package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.appsflyer.AppsFlyerManager;
import cm.aptoide.p092pt.app.appsflyer.AppsFlyerRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppsFlyerManagerFactory implements Provider {
    private final Provider<AppsFlyerRepository> appsFlyerRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppsFlyerManagerFactory(ApplicationModule applicationModule, Provider<AppsFlyerRepository> provider) {
        this.module = applicationModule;
        this.appsFlyerRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesAppsFlyerManagerFactory create(ApplicationModule applicationModule, Provider<AppsFlyerRepository> provider) {
        return new ApplicationModule_ProvidesAppsFlyerManagerFactory(applicationModule, provider);
    }

    public static AppsFlyerManager providesAppsFlyerManager(ApplicationModule applicationModule, AppsFlyerRepository appsFlyerRepository) {
        return (AppsFlyerManager) C9055b.m29112c(applicationModule.providesAppsFlyerManager(appsFlyerRepository));
    }

    @Override // javax.inject.Provider
    public AppsFlyerManager get() {
        return providesAppsFlyerManager(this.module, this.appsFlyerRepositoryProvider.get());
    }
}
