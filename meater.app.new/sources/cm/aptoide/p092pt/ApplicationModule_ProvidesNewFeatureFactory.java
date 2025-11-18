package cm.aptoide.p092pt;

import cm.aptoide.p092pt.themes.NewFeature;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesNewFeatureFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesNewFeatureFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesNewFeatureFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesNewFeatureFactory(applicationModule);
    }

    public static NewFeature providesNewFeature(ApplicationModule applicationModule) {
        return (NewFeature) C9055b.m29112c(applicationModule.providesNewFeature());
    }

    @Override // javax.inject.Provider
    public NewFeature get() {
        return providesNewFeature(this.module);
    }
}
