package cm.aptoide.p092pt;

import cm.aptoide.p092pt.apkfy.AptoideApkfyService;
import javax.inject.Provider;
import p317f.p318b.C9055b;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesApkfyServiceApiFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesApkfyServiceApiFactory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesApkfyServiceApiFactory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesApkfyServiceApiFactory(applicationModule, provider);
    }

    public static AptoideApkfyService.ServiceApi providesApkfyServiceApi(ApplicationModule applicationModule, Retrofit retrofit) {
        return (AptoideApkfyService.ServiceApi) C9055b.m29112c(applicationModule.providesApkfyServiceApi(retrofit));
    }

    @Override // javax.inject.Provider
    public AptoideApkfyService.ServiceApi get() {
        return providesApkfyServiceApi(this.module, this.retrofitProvider.get());
    }
}
