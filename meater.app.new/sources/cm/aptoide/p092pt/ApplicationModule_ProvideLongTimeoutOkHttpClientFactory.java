package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideLongTimeoutOkHttpClientFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<Interceptor> retrofitLogInterceptorProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<Interceptor> userAgentInterceptorProvider;

    public ApplicationModule_ProvideLongTimeoutOkHttpClientFactory(ApplicationModule applicationModule, Provider<Interceptor> provider, Provider<SharedPreferences> provider2, Provider<Interceptor> provider3) {
        this.module = applicationModule;
        this.userAgentInterceptorProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.retrofitLogInterceptorProvider = provider3;
    }

    public static ApplicationModule_ProvideLongTimeoutOkHttpClientFactory create(ApplicationModule applicationModule, Provider<Interceptor> provider, Provider<SharedPreferences> provider2, Provider<Interceptor> provider3) {
        return new ApplicationModule_ProvideLongTimeoutOkHttpClientFactory(applicationModule, provider, provider2, provider3);
    }

    public static OkHttpClient provideLongTimeoutOkHttpClient(ApplicationModule applicationModule, Interceptor interceptor, SharedPreferences sharedPreferences, Interceptor interceptor2) {
        return (OkHttpClient) C9055b.m29112c(applicationModule.provideLongTimeoutOkHttpClient(interceptor, sharedPreferences, interceptor2));
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideLongTimeoutOkHttpClient(this.module, this.userAgentInterceptorProvider.get(), this.sharedPreferencesProvider.get(), this.retrofitLogInterceptorProvider.get());
    }
}
