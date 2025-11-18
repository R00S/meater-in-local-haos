package cm.aptoide.p092pt.view;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreRepository;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;
import retrofit2.Converter;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesListAppsMoreRepositoryFactory implements Provider {
    private final Provider<BodyInterceptor<BaseBody>> baseBodyBodyInterceptorProvider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final ActivityModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ActivityModule_ProvidesListAppsMoreRepositoryFactory(ActivityModule activityModule, Provider<StoreCredentialsProvider> provider, Provider<OkHttpClient> provider2, Provider<BodyInterceptor<BaseBody>> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5, Provider<Converter.Factory> provider6) {
        this.module = activityModule;
        this.storeCredentialsProvider = provider;
        this.okHttpClientProvider = provider2;
        this.baseBodyBodyInterceptorProvider = provider3;
        this.tokenInvalidatorProvider = provider4;
        this.sharedPreferencesProvider = provider5;
        this.converterFactoryProvider = provider6;
    }

    public static ActivityModule_ProvidesListAppsMoreRepositoryFactory create(ActivityModule activityModule, Provider<StoreCredentialsProvider> provider, Provider<OkHttpClient> provider2, Provider<BodyInterceptor<BaseBody>> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5, Provider<Converter.Factory> provider6) {
        return new ActivityModule_ProvidesListAppsMoreRepositoryFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ListAppsMoreRepository providesListAppsMoreRepository(ActivityModule activityModule, StoreCredentialsProvider storeCredentialsProvider, OkHttpClient okHttpClient, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Converter.Factory factory) {
        return (ListAppsMoreRepository) C9055b.m29112c(activityModule.providesListAppsMoreRepository(storeCredentialsProvider, okHttpClient, bodyInterceptor, tokenInvalidator, sharedPreferences, factory));
    }

    @Override // javax.inject.Provider
    public ListAppsMoreRepository get() {
        return providesListAppsMoreRepository(this.module, this.storeCredentialsProvider.get(), this.okHttpClientProvider.get(), this.baseBodyBodyInterceptorProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get(), this.converterFactoryProvider.get());
    }
}
