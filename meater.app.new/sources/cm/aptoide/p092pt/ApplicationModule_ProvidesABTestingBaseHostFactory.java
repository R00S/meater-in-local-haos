package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesABTestingBaseHostFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesABTestingBaseHostFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesABTestingBaseHostFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesABTestingBaseHostFactory(applicationModule, provider);
    }

    public static String providesABTestingBaseHost(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        return (String) C9055b.m29112c(applicationModule.providesABTestingBaseHost(sharedPreferences));
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesABTestingBaseHost(this.module, this.sharedPreferencesProvider.get());
    }
}
