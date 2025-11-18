package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideStoreNameFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideStoreNameFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideStoreNameFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideStoreNameFactory(applicationModule);
    }

    public static String provideStoreName(ApplicationModule applicationModule) {
        return (String) C9055b.m29112c(applicationModule.provideStoreName());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideStoreName(this.module);
    }
}
