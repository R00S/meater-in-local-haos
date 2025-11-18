package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.AppCoinsAdvertisingManager;
import cm.aptoide.p092pt.app.AppCoinsService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppCoinsAdvertisingManagerFactory implements Provider {
    private final Provider<AppCoinsService> appCoinsServiceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppCoinsAdvertisingManagerFactory(ApplicationModule applicationModule, Provider<AppCoinsService> provider) {
        this.module = applicationModule;
        this.appCoinsServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesAppCoinsAdvertisingManagerFactory create(ApplicationModule applicationModule, Provider<AppCoinsService> provider) {
        return new ApplicationModule_ProvidesAppCoinsAdvertisingManagerFactory(applicationModule, provider);
    }

    public static AppCoinsAdvertisingManager providesAppCoinsAdvertisingManager(ApplicationModule applicationModule, AppCoinsService appCoinsService) {
        return (AppCoinsAdvertisingManager) C9055b.m29112c(applicationModule.providesAppCoinsAdvertisingManager(appCoinsService));
    }

    @Override // javax.inject.Provider
    public AppCoinsAdvertisingManager get() {
        return providesAppCoinsAdvertisingManager(this.module, this.appCoinsServiceProvider.get());
    }
}
