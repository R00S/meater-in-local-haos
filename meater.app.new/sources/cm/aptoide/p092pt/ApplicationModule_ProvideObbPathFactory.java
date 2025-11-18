package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideObbPathFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideObbPathFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideObbPathFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideObbPathFactory(applicationModule);
    }

    public static String provideObbPath(ApplicationModule applicationModule) {
        return (String) C9055b.m29112c(applicationModule.provideObbPath());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideObbPath(this.module);
    }
}
