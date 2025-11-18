package cm.aptoide.p092pt;

import cm.aptoide.p092pt.actions.PermissionManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidePermissionManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidePermissionManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidePermissionManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidePermissionManagerFactory(applicationModule);
    }

    public static PermissionManager providePermissionManager(ApplicationModule applicationModule) {
        return (PermissionManager) C9055b.m29112c(applicationModule.providePermissionManager());
    }

    @Override // javax.inject.Provider
    public PermissionManager get() {
        return providePermissionManager(this.module);
    }
}
