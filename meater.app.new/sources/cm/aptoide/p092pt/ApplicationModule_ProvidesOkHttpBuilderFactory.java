package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.cache.L2Cache;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesOkHttpBuilderFactory implements Provider {
    private final Provider<L2Cache> httpClientCacheProvider;
    private final ApplicationModule module;
    private final Provider<Interceptor> retrofitLogInterceptorProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesOkHttpBuilderFactory(ApplicationModule applicationModule, Provider<L2Cache> provider, Provider<SharedPreferences> provider2, Provider<Interceptor> provider3) {
        this.module = applicationModule;
        this.httpClientCacheProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.retrofitLogInterceptorProvider = provider3;
    }

    public static ApplicationModule_ProvidesOkHttpBuilderFactory create(ApplicationModule applicationModule, Provider<L2Cache> provider, Provider<SharedPreferences> provider2, Provider<Interceptor> provider3) {
        return new ApplicationModule_ProvidesOkHttpBuilderFactory(applicationModule, provider, provider2, provider3);
    }

    public static OkHttpClient.Builder providesOkHttpBuilder(ApplicationModule applicationModule, L2Cache l2Cache, SharedPreferences sharedPreferences, Interceptor interceptor) {
        return (OkHttpClient.Builder) C9055b.m29112c(applicationModule.providesOkHttpBuilder(l2Cache, sharedPreferences, interceptor));
    }

    @Override // javax.inject.Provider
    public OkHttpClient.Builder get() {
        return providesOkHttpBuilder(this.module, this.httpClientCacheProvider.get(), this.sharedPreferencesProvider.get(), this.retrofitLogInterceptorProvider.get());
    }
}
