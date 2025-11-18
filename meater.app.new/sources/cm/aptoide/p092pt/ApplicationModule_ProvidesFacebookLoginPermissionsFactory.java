package cm.aptoide.p092pt;

import java.util.List;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFacebookLoginPermissionsFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFacebookLoginPermissionsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesFacebookLoginPermissionsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesFacebookLoginPermissionsFactory(applicationModule);
    }

    public static List<String> providesFacebookLoginPermissions(ApplicationModule applicationModule) {
        return (List) C9055b.m29112c(applicationModule.providesFacebookLoginPermissions());
    }

    @Override // javax.inject.Provider
    public List<String> get() {
        return providesFacebookLoginPermissions(this.module);
    }
}
