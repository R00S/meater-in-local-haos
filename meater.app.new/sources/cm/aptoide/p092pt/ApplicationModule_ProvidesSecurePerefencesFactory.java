package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.preferences.SecurePreferences;
import cm.aptoide.p092pt.preferences.secure.SecureCoderDecoder;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesSecurePerefencesFactory implements Provider {
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final ApplicationModule module;
    private final Provider<SecureCoderDecoder> secureCoderDecoderProvider;

    public ApplicationModule_ProvidesSecurePerefencesFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<SecureCoderDecoder> provider2) {
        this.module = applicationModule;
        this.defaultSharedPreferencesProvider = provider;
        this.secureCoderDecoderProvider = provider2;
    }

    public static ApplicationModule_ProvidesSecurePerefencesFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<SecureCoderDecoder> provider2) {
        return new ApplicationModule_ProvidesSecurePerefencesFactory(applicationModule, provider, provider2);
    }

    public static SecurePreferences providesSecurePerefences(ApplicationModule applicationModule, SharedPreferences sharedPreferences, SecureCoderDecoder secureCoderDecoder) {
        return (SecurePreferences) C9055b.m29112c(applicationModule.providesSecurePerefences(sharedPreferences, secureCoderDecoder));
    }

    @Override // javax.inject.Provider
    public SecurePreferences get() {
        return providesSecurePerefences(this.module, this.defaultSharedPreferencesProvider.get(), this.secureCoderDecoderProvider.get());
    }
}
