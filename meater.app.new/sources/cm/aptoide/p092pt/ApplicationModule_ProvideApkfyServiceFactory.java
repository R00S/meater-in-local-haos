package cm.aptoide.p092pt;

import cm.aptoide.p092pt.apkfy.ApkfyService;
import cm.aptoide.p092pt.apkfy.AptoideApkfyService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideApkfyServiceFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<AptoideApkfyService.ServiceApi> serviceApiProvider;

    public ApplicationModule_ProvideApkfyServiceFactory(ApplicationModule applicationModule, Provider<AptoideApkfyService.ServiceApi> provider) {
        this.module = applicationModule;
        this.serviceApiProvider = provider;
    }

    public static ApplicationModule_ProvideApkfyServiceFactory create(ApplicationModule applicationModule, Provider<AptoideApkfyService.ServiceApi> provider) {
        return new ApplicationModule_ProvideApkfyServiceFactory(applicationModule, provider);
    }

    public static ApkfyService provideApkfyService(ApplicationModule applicationModule, AptoideApkfyService.ServiceApi serviceApi) {
        return (ApkfyService) C9055b.m29112c(applicationModule.provideApkfyService(serviceApi));
    }

    @Override // javax.inject.Provider
    public ApkfyService get() {
        return provideApkfyService(this.module, this.serviceApiProvider.get());
    }
}
