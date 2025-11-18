package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesMyAccountManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesMyAccountManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesMyAccountManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesMyAccountManagerFactory(applicationModule);
    }

    public static MyAccountManager providesMyAccountManager(ApplicationModule applicationModule) {
        return (MyAccountManager) C9055b.m29112c(applicationModule.providesMyAccountManager());
    }

    @Override // javax.inject.Provider
    public MyAccountManager get() {
        return providesMyAccountManager(this.module);
    }
}
