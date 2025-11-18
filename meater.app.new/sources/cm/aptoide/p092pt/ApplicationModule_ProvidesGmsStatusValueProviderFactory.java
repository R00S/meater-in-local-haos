package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesGmsStatusValueProviderFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesGmsStatusValueProviderFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesGmsStatusValueProviderFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesGmsStatusValueProviderFactory(applicationModule);
    }

    public static GmsStatusValueProvider providesGmsStatusValueProvider(ApplicationModule applicationModule) {
        return (GmsStatusValueProvider) C9055b.m29112c(applicationModule.providesGmsStatusValueProvider());
    }

    @Override // javax.inject.Provider
    public GmsStatusValueProvider get() {
        return providesGmsStatusValueProvider(this.module);
    }
}
