package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesShortcutManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesShortcutManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesShortcutManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesShortcutManagerFactory(applicationModule);
    }

    public static AptoideShortcutManager providesShortcutManager(ApplicationModule applicationModule) {
        return (AptoideShortcutManager) C9055b.m29112c(applicationModule.providesShortcutManager());
    }

    @Override // javax.inject.Provider
    public AptoideShortcutManager get() {
        return providesShortcutManager(this.module);
    }
}
