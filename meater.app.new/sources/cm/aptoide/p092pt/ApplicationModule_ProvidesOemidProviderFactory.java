package cm.aptoide.p092pt;

import cm.aptoide.p092pt.download.OemidProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesOemidProviderFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesOemidProviderFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesOemidProviderFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesOemidProviderFactory(applicationModule);
    }

    public static OemidProvider providesOemidProvider(ApplicationModule applicationModule) {
        return (OemidProvider) C9055b.m29112c(applicationModule.providesOemidProvider());
    }

    @Override // javax.inject.Provider
    public OemidProvider get() {
        return providesOemidProvider(this.module);
    }
}
