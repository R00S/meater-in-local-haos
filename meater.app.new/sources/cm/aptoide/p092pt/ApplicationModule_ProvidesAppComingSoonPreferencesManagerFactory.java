package cm.aptoide.p092pt;

import cm.aptoide.p092pt.home.AppComingSoonRegistrationManager;
import cm.aptoide.p092pt.home.AppComingSoonRegistrationPersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppComingSoonPreferencesManagerFactory implements Provider {
    private final Provider<AppComingSoonRegistrationPersistence> appComingSoonRegistrationPersistenceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppComingSoonPreferencesManagerFactory(ApplicationModule applicationModule, Provider<AppComingSoonRegistrationPersistence> provider) {
        this.module = applicationModule;
        this.appComingSoonRegistrationPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvidesAppComingSoonPreferencesManagerFactory create(ApplicationModule applicationModule, Provider<AppComingSoonRegistrationPersistence> provider) {
        return new ApplicationModule_ProvidesAppComingSoonPreferencesManagerFactory(applicationModule, provider);
    }

    public static AppComingSoonRegistrationManager providesAppComingSoonPreferencesManager(ApplicationModule applicationModule, AppComingSoonRegistrationPersistence appComingSoonRegistrationPersistence) {
        return (AppComingSoonRegistrationManager) C9055b.m29112c(applicationModule.providesAppComingSoonPreferencesManager(appComingSoonRegistrationPersistence));
    }

    @Override // javax.inject.Provider
    public AppComingSoonRegistrationManager get() {
        return providesAppComingSoonPreferencesManager(this.module, this.appComingSoonRegistrationPersistenceProvider.get());
    }
}
