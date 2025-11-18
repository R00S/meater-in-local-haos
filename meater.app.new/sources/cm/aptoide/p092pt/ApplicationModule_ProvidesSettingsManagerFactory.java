package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesSettingsManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesSettingsManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesSettingsManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesSettingsManagerFactory(applicationModule);
    }

    public static SettingsManager providesSettingsManager(ApplicationModule applicationModule) {
        return (SettingsManager) C9055b.m29112c(applicationModule.providesSettingsManager());
    }

    @Override // javax.inject.Provider
    public SettingsManager get() {
        return providesSettingsManager(this.module);
    }
}
