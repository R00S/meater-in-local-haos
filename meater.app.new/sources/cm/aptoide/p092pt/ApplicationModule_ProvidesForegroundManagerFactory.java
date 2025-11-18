package cm.aptoide.p092pt;

import cm.aptoide.p092pt.install.ForegroundManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesForegroundManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesForegroundManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesForegroundManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesForegroundManagerFactory(applicationModule);
    }

    public static ForegroundManager providesForegroundManager(ApplicationModule applicationModule) {
        return (ForegroundManager) C9055b.m29112c(applicationModule.providesForegroundManager());
    }

    @Override // javax.inject.Provider
    public ForegroundManager get() {
        return providesForegroundManager(this.module);
    }
}
