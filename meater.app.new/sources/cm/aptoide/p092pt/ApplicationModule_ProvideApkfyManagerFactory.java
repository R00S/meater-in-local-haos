package cm.aptoide.p092pt;

import cm.aptoide.p092pt.apkfy.ApkfyManager;
import cm.aptoide.p092pt.apkfy.ApkfyService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideApkfyManagerFactory implements Provider {
    private final Provider<ApkfyService> apkfyServiceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideApkfyManagerFactory(ApplicationModule applicationModule, Provider<ApkfyService> provider) {
        this.module = applicationModule;
        this.apkfyServiceProvider = provider;
    }

    public static ApplicationModule_ProvideApkfyManagerFactory create(ApplicationModule applicationModule, Provider<ApkfyService> provider) {
        return new ApplicationModule_ProvideApkfyManagerFactory(applicationModule, provider);
    }

    public static ApkfyManager provideApkfyManager(ApplicationModule applicationModule, ApkfyService apkfyService) {
        return (ApkfyManager) C9055b.m29112c(applicationModule.provideApkfyManager(apkfyService));
    }

    @Override // javax.inject.Provider
    public ApkfyManager get() {
        return provideApkfyManager(this.module, this.apkfyServiceProvider.get());
    }
}
