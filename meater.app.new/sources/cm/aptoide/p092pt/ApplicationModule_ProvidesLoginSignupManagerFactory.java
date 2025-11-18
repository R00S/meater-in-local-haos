package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesLoginSignupManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesLoginSignupManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesLoginSignupManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesLoginSignupManagerFactory(applicationModule);
    }

    public static LoginSignupManager providesLoginSignupManager(ApplicationModule applicationModule) {
        return (LoginSignupManager) C9055b.m29112c(applicationModule.providesLoginSignupManager());
    }

    @Override // javax.inject.Provider
    public LoginSignupManager get() {
        return providesLoginSignupManager(this.module);
    }
}
