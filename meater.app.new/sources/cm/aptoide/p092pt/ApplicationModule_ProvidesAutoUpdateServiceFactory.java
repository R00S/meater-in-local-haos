package cm.aptoide.p092pt;

import cm.aptoide.p092pt.autoupdate.Service;
import javax.inject.Provider;
import p317f.p318b.C9055b;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAutoUpdateServiceFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesAutoUpdateServiceFactory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesAutoUpdateServiceFactory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesAutoUpdateServiceFactory(applicationModule, provider);
    }

    public static Service providesAutoUpdateService(ApplicationModule applicationModule, Retrofit retrofit) {
        return (Service) C9055b.m29112c(applicationModule.providesAutoUpdateService(retrofit));
    }

    @Override // javax.inject.Provider
    public Service get() {
        return providesAutoUpdateService(this.module, this.retrofitProvider.get());
    }
}
