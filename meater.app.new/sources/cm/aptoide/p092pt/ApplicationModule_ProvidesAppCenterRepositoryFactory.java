package cm.aptoide.p092pt;

import cm.aptoide.p092pt.view.app.AppCenterRepository;
import cm.aptoide.p092pt.view.app.AppService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppCenterRepositoryFactory implements Provider {
    private final Provider<AppService> appServiceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppCenterRepositoryFactory(ApplicationModule applicationModule, Provider<AppService> provider) {
        this.module = applicationModule;
        this.appServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesAppCenterRepositoryFactory create(ApplicationModule applicationModule, Provider<AppService> provider) {
        return new ApplicationModule_ProvidesAppCenterRepositoryFactory(applicationModule, provider);
    }

    public static AppCenterRepository providesAppCenterRepository(ApplicationModule applicationModule, AppService appService) {
        return (AppCenterRepository) C9055b.m29112c(applicationModule.providesAppCenterRepository(appService));
    }

    @Override // javax.inject.Provider
    public AppCenterRepository get() {
        return providesAppCenterRepository(this.module, this.appServiceProvider.get());
    }
}
