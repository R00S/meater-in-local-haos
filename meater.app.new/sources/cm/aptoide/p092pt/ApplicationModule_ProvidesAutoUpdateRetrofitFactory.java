package cm.aptoide.p092pt;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAutoUpdateRetrofitFactory implements Provider {
    private final Provider<String> baseHostProvider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<CallAdapter.Factory> rxCallAdapterFactoryProvider;

    public ApplicationModule_ProvidesAutoUpdateRetrofitFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<String> provider2, Provider<Converter.Factory> provider3, Provider<CallAdapter.Factory> provider4) {
        this.module = applicationModule;
        this.httpClientProvider = provider;
        this.baseHostProvider = provider2;
        this.converterFactoryProvider = provider3;
        this.rxCallAdapterFactoryProvider = provider4;
    }

    public static ApplicationModule_ProvidesAutoUpdateRetrofitFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<String> provider2, Provider<Converter.Factory> provider3, Provider<CallAdapter.Factory> provider4) {
        return new ApplicationModule_ProvidesAutoUpdateRetrofitFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static Retrofit providesAutoUpdateRetrofit(ApplicationModule applicationModule, OkHttpClient okHttpClient, String str, Converter.Factory factory, CallAdapter.Factory factory2) {
        return (Retrofit) C9055b.m29112c(applicationModule.providesAutoUpdateRetrofit(okHttpClient, str, factory, factory2));
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return providesAutoUpdateRetrofit(this.module, this.httpClientProvider.get(), this.baseHostProvider.get(), this.converterFactoryProvider.get(), this.rxCallAdapterFactoryProvider.get());
    }
}
