package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesLaunchManagerFactory implements Provider {
    private final Provider<FirstLaunchManager> firstLaunchManagerProvider;
    private final ApplicationModule module;
    private final Provider<SharedPreferences> secureSharedPreferencesProvider;
    private final Provider<UpdateLaunchManager> updateLaunchManagerProvider;

    public ApplicationModule_ProvidesLaunchManagerFactory(ApplicationModule applicationModule, Provider<FirstLaunchManager> provider, Provider<UpdateLaunchManager> provider2, Provider<SharedPreferences> provider3) {
        this.module = applicationModule;
        this.firstLaunchManagerProvider = provider;
        this.updateLaunchManagerProvider = provider2;
        this.secureSharedPreferencesProvider = provider3;
    }

    public static ApplicationModule_ProvidesLaunchManagerFactory create(ApplicationModule applicationModule, Provider<FirstLaunchManager> provider, Provider<UpdateLaunchManager> provider2, Provider<SharedPreferences> provider3) {
        return new ApplicationModule_ProvidesLaunchManagerFactory(applicationModule, provider, provider2, provider3);
    }

    public static LaunchManager providesLaunchManager(ApplicationModule applicationModule, FirstLaunchManager firstLaunchManager, UpdateLaunchManager updateLaunchManager, SharedPreferences sharedPreferences) {
        return (LaunchManager) C9055b.m29112c(applicationModule.providesLaunchManager(firstLaunchManager, updateLaunchManager, sharedPreferences));
    }

    @Override // javax.inject.Provider
    public LaunchManager get() {
        return providesLaunchManager(this.module, this.firstLaunchManagerProvider.get(), this.updateLaunchManagerProvider.get(), this.secureSharedPreferencesProvider.get());
    }
}
