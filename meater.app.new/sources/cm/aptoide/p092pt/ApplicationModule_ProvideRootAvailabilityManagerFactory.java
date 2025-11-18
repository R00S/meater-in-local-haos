package cm.aptoide.p092pt;

import cm.aptoide.p092pt.preferences.SecurePreferences;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideRootAvailabilityManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<SecurePreferences> securePreferencesProvider;

    public ApplicationModule_ProvideRootAvailabilityManagerFactory(ApplicationModule applicationModule, Provider<SecurePreferences> provider) {
        this.module = applicationModule;
        this.securePreferencesProvider = provider;
    }

    public static ApplicationModule_ProvideRootAvailabilityManagerFactory create(ApplicationModule applicationModule, Provider<SecurePreferences> provider) {
        return new ApplicationModule_ProvideRootAvailabilityManagerFactory(applicationModule, provider);
    }

    public static RootAvailabilityManager provideRootAvailabilityManager(ApplicationModule applicationModule, SecurePreferences securePreferences) {
        return (RootAvailabilityManager) C9055b.m29112c(applicationModule.provideRootAvailabilityManager(securePreferences));
    }

    @Override // javax.inject.Provider
    public RootAvailabilityManager get() {
        return provideRootAvailabilityManager(this.module, this.securePreferencesProvider.get());
    }
}
