package cm.aptoide.p092pt;

import android.view.WindowManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideWindowManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideWindowManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideWindowManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideWindowManagerFactory(applicationModule);
    }

    public static WindowManager provideWindowManager(ApplicationModule applicationModule) {
        return (WindowManager) C9055b.m29112c(applicationModule.provideWindowManager());
    }

    @Override // javax.inject.Provider
    public WindowManager get() {
        return provideWindowManager(this.module);
    }
}
