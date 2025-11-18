package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAptoideMmpBaseHostFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAptoideMmpBaseHostFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAptoideMmpBaseHostFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAptoideMmpBaseHostFactory(applicationModule);
    }

    public static String provideAptoideMmpBaseHost(ApplicationModule applicationModule) {
        return (String) C9055b.m29112c(applicationModule.provideAptoideMmpBaseHost());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideAptoideMmpBaseHost(this.module);
    }
}
