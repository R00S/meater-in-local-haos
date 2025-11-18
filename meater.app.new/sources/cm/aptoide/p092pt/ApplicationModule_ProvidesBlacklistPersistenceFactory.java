package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.blacklist.BlacklistPersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesBlacklistPersistenceFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesBlacklistPersistenceFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesBlacklistPersistenceFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesBlacklistPersistenceFactory(applicationModule, provider);
    }

    public static BlacklistPersistence providesBlacklistPersistence(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        return (BlacklistPersistence) C9055b.m29112c(applicationModule.providesBlacklistPersistence(sharedPreferences));
    }

    @Override // javax.inject.Provider
    public BlacklistPersistence get() {
        return providesBlacklistPersistence(this.module, this.sharedPreferencesProvider.get());
    }
}
