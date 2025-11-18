package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideStoreUtilsProxyFactory implements Provider {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvideStoreUtilsProxyFactory(ApplicationModule applicationModule, Provider<AptoideAccountManager> provider, Provider<RoomStoreRepository> provider2, Provider<OkHttpClient> provider3, Provider<SharedPreferences> provider4, Provider<TokenInvalidator> provider5, Provider<BodyInterceptor<BaseBody>> provider6, Provider<StoreCredentialsProvider> provider7) {
        this.module = applicationModule;
        this.accountManagerProvider = provider;
        this.storeRepositoryProvider = provider2;
        this.httpClientProvider = provider3;
        this.sharedPreferencesProvider = provider4;
        this.tokenInvalidatorProvider = provider5;
        this.bodyInterceptorProvider = provider6;
        this.storeCredentialsProvider = provider7;
    }

    public static ApplicationModule_ProvideStoreUtilsProxyFactory create(ApplicationModule applicationModule, Provider<AptoideAccountManager> provider, Provider<RoomStoreRepository> provider2, Provider<OkHttpClient> provider3, Provider<SharedPreferences> provider4, Provider<TokenInvalidator> provider5, Provider<BodyInterceptor<BaseBody>> provider6, Provider<StoreCredentialsProvider> provider7) {
        return new ApplicationModule_ProvideStoreUtilsProxyFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static StoreUtilsProxy provideStoreUtilsProxy(ApplicationModule applicationModule, AptoideAccountManager aptoideAccountManager, RoomStoreRepository roomStoreRepository, OkHttpClient okHttpClient, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator, BodyInterceptor<BaseBody> bodyInterceptor, StoreCredentialsProvider storeCredentialsProvider) {
        return (StoreUtilsProxy) C9055b.m29112c(applicationModule.provideStoreUtilsProxy(aptoideAccountManager, roomStoreRepository, okHttpClient, sharedPreferences, tokenInvalidator, bodyInterceptor, storeCredentialsProvider));
    }

    @Override // javax.inject.Provider
    public StoreUtilsProxy get() {
        return provideStoreUtilsProxy(this.module, this.accountManagerProvider.get(), this.storeRepositoryProvider.get(), this.httpClientProvider.get(), this.sharedPreferencesProvider.get(), this.tokenInvalidatorProvider.get(), this.bodyInterceptorProvider.get(), this.storeCredentialsProvider.get());
    }
}
