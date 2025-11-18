package cm.aptoide.p092pt;

import cm.aptoide.p092pt.preferences.LocalPersistenceAdultContent;
import cm.aptoide.p092pt.preferences.Preferences;
import cm.aptoide.p092pt.preferences.SecurePreferences;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FlavourApplicationModule_ProvideLocalAdultContentFactory implements Provider {
    private final FlavourApplicationModule module;
    private final Provider<Preferences> preferencesProvider;
    private final Provider<SecurePreferences> securePreferencesProvider;

    public FlavourApplicationModule_ProvideLocalAdultContentFactory(FlavourApplicationModule flavourApplicationModule, Provider<Preferences> provider, Provider<SecurePreferences> provider2) {
        this.module = flavourApplicationModule;
        this.preferencesProvider = provider;
        this.securePreferencesProvider = provider2;
    }

    public static FlavourApplicationModule_ProvideLocalAdultContentFactory create(FlavourApplicationModule flavourApplicationModule, Provider<Preferences> provider, Provider<SecurePreferences> provider2) {
        return new FlavourApplicationModule_ProvideLocalAdultContentFactory(flavourApplicationModule, provider, provider2);
    }

    public static LocalPersistenceAdultContent provideLocalAdultContent(FlavourApplicationModule flavourApplicationModule, Preferences preferences, SecurePreferences securePreferences) {
        return (LocalPersistenceAdultContent) C9055b.m29112c(flavourApplicationModule.provideLocalAdultContent(preferences, securePreferences));
    }

    @Override // javax.inject.Provider
    public LocalPersistenceAdultContent get() {
        return provideLocalAdultContent(this.module, this.preferencesProvider.get(), this.securePreferencesProvider.get());
    }
}
