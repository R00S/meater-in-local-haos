package cm.aptoide.p092pt;

import cm.aptoide.p092pt.account.LoginPreferences;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FlavourApplicationModule_ProvideLoginPreferencesFactory implements Provider {
    private final FlavourApplicationModule module;

    public FlavourApplicationModule_ProvideLoginPreferencesFactory(FlavourApplicationModule flavourApplicationModule) {
        this.module = flavourApplicationModule;
    }

    public static FlavourApplicationModule_ProvideLoginPreferencesFactory create(FlavourApplicationModule flavourApplicationModule) {
        return new FlavourApplicationModule_ProvideLoginPreferencesFactory(flavourApplicationModule);
    }

    public static LoginPreferences provideLoginPreferences(FlavourApplicationModule flavourApplicationModule) {
        return (LoginPreferences) C9055b.m29112c(flavourApplicationModule.provideLoginPreferences());
    }

    @Override // javax.inject.Provider
    public LoginPreferences get() {
        return provideLoginPreferences(this.module);
    }
}
