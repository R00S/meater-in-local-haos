package cm.aptoide.p092pt;

import cm.aptoide.p092pt.home.ChipManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesChipManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesChipManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesChipManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesChipManagerFactory(applicationModule);
    }

    public static ChipManager providesChipManager(ApplicationModule applicationModule) {
        return (ChipManager) C9055b.m29112c(applicationModule.providesChipManager());
    }

    @Override // javax.inject.Provider
    public ChipManager get() {
        return providesChipManager(this.module);
    }
}
