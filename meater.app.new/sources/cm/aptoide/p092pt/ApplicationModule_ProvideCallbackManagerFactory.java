package cm.aptoide.p092pt;

import com.facebook.InterfaceC5958y;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideCallbackManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideCallbackManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideCallbackManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideCallbackManagerFactory(applicationModule);
    }

    public static InterfaceC5958y provideCallbackManager(ApplicationModule applicationModule) {
        return (InterfaceC5958y) C9055b.m29112c(applicationModule.provideCallbackManager());
    }

    @Override // javax.inject.Provider
    public InterfaceC5958y get() {
        return provideCallbackManager(this.module);
    }
}
