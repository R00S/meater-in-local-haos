package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideApkPathFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideApkPathFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideApkPathFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideApkPathFactory(applicationModule);
    }

    public static String provideApkPath(ApplicationModule applicationModule) {
        return (String) C9055b.m29112c(applicationModule.provideApkPath());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideApkPath(this.module);
    }
}
