package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAutoUpdateBaseHostFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAutoUpdateBaseHostFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAutoUpdateBaseHostFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAutoUpdateBaseHostFactory(applicationModule);
    }

    public static String providesAutoUpdateBaseHost(ApplicationModule applicationModule) {
        return (String) C9055b.m29112c(applicationModule.providesAutoUpdateBaseHost());
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesAutoUpdateBaseHost(this.module);
    }
}
