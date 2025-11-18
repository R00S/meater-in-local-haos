package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesSecureSharedPreferencesFactory implements Provider {
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesSecureSharedPreferencesFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.defaultSharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesSecureSharedPreferencesFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesSecureSharedPreferencesFactory(applicationModule, provider);
    }

    public static SharedPreferences providesSecureSharedPreferences(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        return (SharedPreferences) C9055b.m29112c(applicationModule.providesSecureSharedPreferences(sharedPreferences));
    }

    @Override // javax.inject.Provider
    public SharedPreferences get() {
        return providesSecureSharedPreferences(this.module, this.defaultSharedPreferencesProvider.get());
    }
}
