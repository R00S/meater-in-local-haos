package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.file.CacheHelper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideCacheHelperFactory implements Provider {
    private final Provider<String> cachePathProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideCacheHelperFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<String> provider2) {
        this.module = applicationModule;
        this.defaultSharedPreferencesProvider = provider;
        this.cachePathProvider = provider2;
    }

    public static ApplicationModule_ProvideCacheHelperFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<String> provider2) {
        return new ApplicationModule_ProvideCacheHelperFactory(applicationModule, provider, provider2);
    }

    public static CacheHelper provideCacheHelper(ApplicationModule applicationModule, SharedPreferences sharedPreferences, String str) {
        return (CacheHelper) C9055b.m29112c(applicationModule.provideCacheHelper(sharedPreferences, str));
    }

    @Override // javax.inject.Provider
    public CacheHelper get() {
        return provideCacheHelper(this.module, this.defaultSharedPreferencesProvider.get(), this.cachePathProvider.get());
    }
}
