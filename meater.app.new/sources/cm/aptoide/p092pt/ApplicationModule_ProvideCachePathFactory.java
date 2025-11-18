package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideCachePathFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideCachePathFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideCachePathFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideCachePathFactory(applicationModule);
    }

    public static String provideCachePath(ApplicationModule applicationModule) {
        return (String) C9055b.m29112c(applicationModule.provideCachePath());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideCachePath(this.module);
    }
}
