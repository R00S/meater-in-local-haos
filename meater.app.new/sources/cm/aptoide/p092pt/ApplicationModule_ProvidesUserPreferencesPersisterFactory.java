package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.appview.PreferencesPersister;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesUserPreferencesPersisterFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesUserPreferencesPersisterFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesUserPreferencesPersisterFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesUserPreferencesPersisterFactory(applicationModule, provider);
    }

    public static PreferencesPersister providesUserPreferencesPersister(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        return (PreferencesPersister) C9055b.m29112c(applicationModule.providesUserPreferencesPersister(sharedPreferences));
    }

    @Override // javax.inject.Provider
    public PreferencesPersister get() {
        return providesUserPreferencesPersister(this.module, this.sharedPreferencesProvider.get());
    }
}
