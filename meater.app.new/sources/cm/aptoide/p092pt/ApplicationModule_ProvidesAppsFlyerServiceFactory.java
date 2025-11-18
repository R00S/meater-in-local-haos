package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.appsflyer.AppsFlyerService;
import javax.inject.Provider;
import p317f.p318b.C9055b;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppsFlyerServiceFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesAppsFlyerServiceFactory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesAppsFlyerServiceFactory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesAppsFlyerServiceFactory(applicationModule, provider);
    }

    public static AppsFlyerService providesAppsFlyerService(ApplicationModule applicationModule, Retrofit retrofit) {
        return (AppsFlyerService) C9055b.m29112c(applicationModule.providesAppsFlyerService(retrofit));
    }

    @Override // javax.inject.Provider
    public AppsFlyerService get() {
        return providesAppsFlyerService(this.module, this.retrofitProvider.get());
    }
}
