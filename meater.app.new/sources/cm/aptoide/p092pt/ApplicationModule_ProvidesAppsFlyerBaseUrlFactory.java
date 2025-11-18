package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppsFlyerBaseUrlFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppsFlyerBaseUrlFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAppsFlyerBaseUrlFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAppsFlyerBaseUrlFactory(applicationModule);
    }

    public static String providesAppsFlyerBaseUrl(ApplicationModule applicationModule) {
        return (String) C9055b.m29112c(applicationModule.providesAppsFlyerBaseUrl());
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesAppsFlyerBaseUrl(this.module);
    }
}
