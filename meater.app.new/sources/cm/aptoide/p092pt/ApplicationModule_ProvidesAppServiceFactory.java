package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.aab.SplitsMapper;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignMapper;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.view.app.AppService;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppServiceFactory implements Provider {
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorPoolV7Provider;
    private final Provider<CampaignMapper> campaignMapperProvider;
    private final ApplicationModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<SplitsMapper> splitsMapperProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvidesAppServiceFactory(ApplicationModule applicationModule, Provider<StoreCredentialsProvider> provider, Provider<BodyInterceptor<BaseBody>> provider2, Provider<OkHttpClient> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5, Provider<SplitsMapper> provider6, Provider<CampaignMapper> provider7) {
        this.module = applicationModule;
        this.storeCredentialsProvider = provider;
        this.bodyInterceptorPoolV7Provider = provider2;
        this.okHttpClientProvider = provider3;
        this.tokenInvalidatorProvider = provider4;
        this.sharedPreferencesProvider = provider5;
        this.splitsMapperProvider = provider6;
        this.campaignMapperProvider = provider7;
    }

    public static ApplicationModule_ProvidesAppServiceFactory create(ApplicationModule applicationModule, Provider<StoreCredentialsProvider> provider, Provider<BodyInterceptor<BaseBody>> provider2, Provider<OkHttpClient> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5, Provider<SplitsMapper> provider6, Provider<CampaignMapper> provider7) {
        return new ApplicationModule_ProvidesAppServiceFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static AppService providesAppService(ApplicationModule applicationModule, StoreCredentialsProvider storeCredentialsProvider, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, SplitsMapper splitsMapper, CampaignMapper campaignMapper) {
        return (AppService) C9055b.m29112c(applicationModule.providesAppService(storeCredentialsProvider, bodyInterceptor, okHttpClient, tokenInvalidator, sharedPreferences, splitsMapper, campaignMapper));
    }

    @Override // javax.inject.Provider
    public AppService get() {
        return providesAppService(this.module, this.storeCredentialsProvider.get(), this.bodyInterceptorPoolV7Provider.get(), this.okHttpClientProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get(), this.splitsMapperProvider.get(), this.campaignMapperProvider.get());
    }
}
