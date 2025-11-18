package cm.aptoide.p092pt;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesApiChainBDSRetrofitFactory implements Provider {
    private final Provider<String> baseHostProvider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<CallAdapter.Factory> rxCallAdapterFactoryProvider;

    public ApplicationModule_ProvidesApiChainBDSRetrofitFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<Converter.Factory> provider2, Provider<CallAdapter.Factory> provider3, Provider<String> provider4) {
        this.module = applicationModule;
        this.httpClientProvider = provider;
        this.converterFactoryProvider = provider2;
        this.rxCallAdapterFactoryProvider = provider3;
        this.baseHostProvider = provider4;
    }

    public static ApplicationModule_ProvidesApiChainBDSRetrofitFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<Converter.Factory> provider2, Provider<CallAdapter.Factory> provider3, Provider<String> provider4) {
        return new ApplicationModule_ProvidesApiChainBDSRetrofitFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static Retrofit providesApiChainBDSRetrofit(ApplicationModule applicationModule, OkHttpClient okHttpClient, Converter.Factory factory, CallAdapter.Factory factory2, String str) {
        return (Retrofit) C9055b.m29112c(applicationModule.providesApiChainBDSRetrofit(okHttpClient, factory, factory2, str));
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return providesApiChainBDSRetrofit(this.module, this.httpClientProvider.get(), this.converterFactoryProvider.get(), this.rxCallAdapterFactoryProvider.get(), this.baseHostProvider.get());
    }
}
