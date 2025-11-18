package cm.aptoide.p092pt;

import cm.aptoide.p092pt.appview.PreferencesPersister;
import cm.aptoide.p092pt.promotions.PromotionsPreferencesManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesPromotionsPreferencesManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<PreferencesPersister> persisterProvider;

    public ApplicationModule_ProvidesPromotionsPreferencesManagerFactory(ApplicationModule applicationModule, Provider<PreferencesPersister> provider) {
        this.module = applicationModule;
        this.persisterProvider = provider;
    }

    public static ApplicationModule_ProvidesPromotionsPreferencesManagerFactory create(ApplicationModule applicationModule, Provider<PreferencesPersister> provider) {
        return new ApplicationModule_ProvidesPromotionsPreferencesManagerFactory(applicationModule, provider);
    }

    public static PromotionsPreferencesManager providesPromotionsPreferencesManager(ApplicationModule applicationModule, PreferencesPersister preferencesPersister) {
        return (PromotionsPreferencesManager) C9055b.m29112c(applicationModule.providesPromotionsPreferencesManager(preferencesPersister));
    }

    @Override // javax.inject.Provider
    public PromotionsPreferencesManager get() {
        return providesPromotionsPreferencesManager(this.module, this.persisterProvider.get());
    }
}
