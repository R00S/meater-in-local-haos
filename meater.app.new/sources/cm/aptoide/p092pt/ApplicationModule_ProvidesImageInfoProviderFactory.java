package cm.aptoide.p092pt;

import cm.aptoide.p092pt.account.view.ImageInfoProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesImageInfoProviderFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesImageInfoProviderFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesImageInfoProviderFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesImageInfoProviderFactory(applicationModule);
    }

    public static ImageInfoProvider providesImageInfoProvider(ApplicationModule applicationModule) {
        return (ImageInfoProvider) C9055b.m29112c(applicationModule.providesImageInfoProvider());
    }

    @Override // javax.inject.Provider
    public ImageInfoProvider get() {
        return providesImageInfoProvider(this.module);
    }
}
