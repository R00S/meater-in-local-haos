package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.app.ReviewsService;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesReviewsServiceFactory implements Provider {
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorPoolV7Provider;
    private final ApplicationModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvidesReviewsServiceFactory(ApplicationModule applicationModule, Provider<StoreCredentialsProvider> provider, Provider<BodyInterceptor<BaseBody>> provider2, Provider<OkHttpClient> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5) {
        this.module = applicationModule;
        this.storeCredentialsProvider = provider;
        this.bodyInterceptorPoolV7Provider = provider2;
        this.okHttpClientProvider = provider3;
        this.tokenInvalidatorProvider = provider4;
        this.sharedPreferencesProvider = provider5;
    }

    public static ApplicationModule_ProvidesReviewsServiceFactory create(ApplicationModule applicationModule, Provider<StoreCredentialsProvider> provider, Provider<BodyInterceptor<BaseBody>> provider2, Provider<OkHttpClient> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5) {
        return new ApplicationModule_ProvidesReviewsServiceFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ReviewsService providesReviewsService(ApplicationModule applicationModule, StoreCredentialsProvider storeCredentialsProvider, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return (ReviewsService) C9055b.m29112c(applicationModule.providesReviewsService(storeCredentialsProvider, bodyInterceptor, okHttpClient, tokenInvalidator, sharedPreferences));
    }

    @Override // javax.inject.Provider
    public ReviewsService get() {
        return providesReviewsService(this.module, this.storeCredentialsProvider.get(), this.bodyInterceptorPoolV7Provider.get(), this.okHttpClientProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get());
    }
}
