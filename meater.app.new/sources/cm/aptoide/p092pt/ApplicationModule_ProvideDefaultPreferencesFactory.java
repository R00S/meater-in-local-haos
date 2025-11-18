package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.preferences.Preferences;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideDefaultPreferencesFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvideDefaultPreferencesFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvideDefaultPreferencesFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvideDefaultPreferencesFactory(applicationModule, provider);
    }

    public static Preferences provideDefaultPreferences(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        return (Preferences) C9055b.m29112c(applicationModule.provideDefaultPreferences(sharedPreferences));
    }

    @Override // javax.inject.Provider
    public Preferences get() {
        return provideDefaultPreferences(this.module, this.sharedPreferencesProvider.get());
    }
}
