package cm.aptoide.p092pt;

import cm.aptoide.p092pt.view.app.AppCenter;
import cm.aptoide.p092pt.view.app.AppCenterRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppCenterFactory implements Provider {
    private final Provider<AppCenterRepository> appCenterRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppCenterFactory(ApplicationModule applicationModule, Provider<AppCenterRepository> provider) {
        this.module = applicationModule;
        this.appCenterRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesAppCenterFactory create(ApplicationModule applicationModule, Provider<AppCenterRepository> provider) {
        return new ApplicationModule_ProvidesAppCenterFactory(applicationModule, provider);
    }

    public static AppCenter providesAppCenter(ApplicationModule applicationModule, AppCenterRepository appCenterRepository) {
        return (AppCenter) C9055b.m29112c(applicationModule.providesAppCenter(appCenterRepository));
    }

    @Override // javax.inject.Provider
    public AppCenter get() {
        return providesAppCenter(this.module, this.appCenterRepositoryProvider.get());
    }
}
