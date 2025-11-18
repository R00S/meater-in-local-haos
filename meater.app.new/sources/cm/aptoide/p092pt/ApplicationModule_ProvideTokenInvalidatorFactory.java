package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideTokenInvalidatorFactory implements Provider {
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorProvider;
    private final Provider<String> extraIdProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvideTokenInvalidatorFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<SharedPreferences> provider2, Provider<AuthenticationPersistence> provider3, Provider<BodyInterceptor<BaseBody>> provider4, Provider<String> provider5) {
        this.module = applicationModule;
        this.httpClientProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.authenticationPersistenceProvider = provider3;
        this.bodyInterceptorProvider = provider4;
        this.extraIdProvider = provider5;
    }

    public static ApplicationModule_ProvideTokenInvalidatorFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<SharedPreferences> provider2, Provider<AuthenticationPersistence> provider3, Provider<BodyInterceptor<BaseBody>> provider4, Provider<String> provider5) {
        return new ApplicationModule_ProvideTokenInvalidatorFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static TokenInvalidator provideTokenInvalidator(ApplicationModule applicationModule, OkHttpClient okHttpClient, SharedPreferences sharedPreferences, AuthenticationPersistence authenticationPersistence, BodyInterceptor<BaseBody> bodyInterceptor, String str) {
        return (TokenInvalidator) C9055b.m29112c(applicationModule.provideTokenInvalidator(okHttpClient, sharedPreferences, authenticationPersistence, bodyInterceptor, str));
    }

    @Override // javax.inject.Provider
    public TokenInvalidator get() {
        return provideTokenInvalidator(this.module, this.httpClientProvider.get(), this.sharedPreferencesProvider.get(), this.authenticationPersistenceProvider.get(), this.bodyInterceptorProvider.get(), this.extraIdProvider.get());
    }
}
