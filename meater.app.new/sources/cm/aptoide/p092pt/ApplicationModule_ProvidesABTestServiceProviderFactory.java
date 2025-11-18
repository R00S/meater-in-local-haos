package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.abtesting.ABTestServiceProvider;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesABTestServiceProviderFactory implements Provider {
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<CallAdapter.Factory> rxCallAdapterFactoryProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesABTestServiceProviderFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<Converter.Factory> provider2, Provider<CallAdapter.Factory> provider3, Provider<SharedPreferences> provider4) {
        this.module = applicationModule;
        this.httpClientProvider = provider;
        this.converterFactoryProvider = provider2;
        this.rxCallAdapterFactoryProvider = provider3;
        this.sharedPreferencesProvider = provider4;
    }

    public static ApplicationModule_ProvidesABTestServiceProviderFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<Converter.Factory> provider2, Provider<CallAdapter.Factory> provider3, Provider<SharedPreferences> provider4) {
        return new ApplicationModule_ProvidesABTestServiceProviderFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static ABTestServiceProvider providesABTestServiceProvider(ApplicationModule applicationModule, OkHttpClient okHttpClient, Converter.Factory factory, CallAdapter.Factory factory2, SharedPreferences sharedPreferences) {
        return (ABTestServiceProvider) C9055b.m29112c(applicationModule.providesABTestServiceProvider(okHttpClient, factory, factory2, sharedPreferences));
    }

    @Override // javax.inject.Provider
    public ABTestServiceProvider get() {
        return providesABTestServiceProvider(this.module, this.httpClientProvider.get(), this.converterFactoryProvider.get(), this.rxCallAdapterFactoryProvider.get(), this.sharedPreferencesProvider.get());
    }
}
