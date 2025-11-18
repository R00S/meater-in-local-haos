package cm.aptoide.p092pt;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesV7RetrofitFactory implements Provider {
    private final Provider<String> baseHostProvider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<CallAdapter.Factory> rxCallAdapterFactoryProvider;

    public ApplicationModule_ProvidesV7RetrofitFactory(ApplicationModule applicationModule, Provider<String> provider, Provider<OkHttpClient> provider2, Provider<Converter.Factory> provider3, Provider<CallAdapter.Factory> provider4) {
        this.module = applicationModule;
        this.baseHostProvider = provider;
        this.httpClientProvider = provider2;
        this.converterFactoryProvider = provider3;
        this.rxCallAdapterFactoryProvider = provider4;
    }

    public static ApplicationModule_ProvidesV7RetrofitFactory create(ApplicationModule applicationModule, Provider<String> provider, Provider<OkHttpClient> provider2, Provider<Converter.Factory> provider3, Provider<CallAdapter.Factory> provider4) {
        return new ApplicationModule_ProvidesV7RetrofitFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static Retrofit providesV7Retrofit(ApplicationModule applicationModule, String str, OkHttpClient okHttpClient, Converter.Factory factory, CallAdapter.Factory factory2) {
        return (Retrofit) C9055b.m29112c(applicationModule.providesV7Retrofit(str, okHttpClient, factory, factory2));
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return providesV7Retrofit(this.module, this.baseHostProvider.get(), this.httpClientProvider.get(), this.converterFactoryProvider.get(), this.rxCallAdapterFactoryProvider.get());
    }
}
