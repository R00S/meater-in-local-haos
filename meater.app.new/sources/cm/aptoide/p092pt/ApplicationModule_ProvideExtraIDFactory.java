package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideExtraIDFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideExtraIDFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideExtraIDFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideExtraIDFactory(applicationModule);
    }

    public static String provideExtraID(ApplicationModule applicationModule) {
        return (String) C9055b.m29112c(applicationModule.provideExtraID());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideExtraID(this.module);
    }
}
