package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAccountTypeFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAccountTypeFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAccountTypeFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAccountTypeFactory(applicationModule);
    }

    public static String provideAccountType(ApplicationModule applicationModule) {
        return (String) C9055b.m29112c(applicationModule.provideAccountType());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideAccountType(this.module);
    }
}
