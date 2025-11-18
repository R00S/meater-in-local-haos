package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import java.util.List;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFollowedStoresManagerFactory implements Provider {
    private final Provider<BodyInterceptor<BaseBody>> accountSettingsBodyInterceptorPoolV7Provider;
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final Provider<List<String>> defaultFollowedStoresProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvidesFollowedStoresManagerFactory(ApplicationModule applicationModule, Provider<StoreCredentialsProvider> provider, Provider<List<String>> provider2, Provider<StoreUtilsProxy> provider3, Provider<BodyInterceptor<BaseBody>> provider4, Provider<AptoideAccountManager> provider5, Provider<OkHttpClient> provider6, Provider<TokenInvalidator> provider7, Provider<SharedPreferences> provider8) {
        this.module = applicationModule;
        this.storeCredentialsProvider = provider;
        this.defaultFollowedStoresProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
        this.accountSettingsBodyInterceptorPoolV7Provider = provider4;
        this.aptoideAccountManagerProvider = provider5;
        this.httpClientProvider = provider6;
        this.tokenInvalidatorProvider = provider7;
        this.defaultSharedPreferencesProvider = provider8;
    }

    public static ApplicationModule_ProvidesFollowedStoresManagerFactory create(ApplicationModule applicationModule, Provider<StoreCredentialsProvider> provider, Provider<List<String>> provider2, Provider<StoreUtilsProxy> provider3, Provider<BodyInterceptor<BaseBody>> provider4, Provider<AptoideAccountManager> provider5, Provider<OkHttpClient> provider6, Provider<TokenInvalidator> provider7, Provider<SharedPreferences> provider8) {
        return new ApplicationModule_ProvidesFollowedStoresManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static FollowedStoresManager providesFollowedStoresManager(ApplicationModule applicationModule, StoreCredentialsProvider storeCredentialsProvider, List<String> list, StoreUtilsProxy storeUtilsProxy, BodyInterceptor<BaseBody> bodyInterceptor, AptoideAccountManager aptoideAccountManager, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return (FollowedStoresManager) C9055b.m29112c(applicationModule.providesFollowedStoresManager(storeCredentialsProvider, list, storeUtilsProxy, bodyInterceptor, aptoideAccountManager, okHttpClient, tokenInvalidator, sharedPreferences));
    }

    @Override // javax.inject.Provider
    public FollowedStoresManager get() {
        return providesFollowedStoresManager(this.module, this.storeCredentialsProvider.get(), this.defaultFollowedStoresProvider.get(), this.storeUtilsProxyProvider.get(), this.accountSettingsBodyInterceptorPoolV7Provider.get(), this.aptoideAccountManagerProvider.get(), this.httpClientProvider.get(), this.tokenInvalidatorProvider.get(), this.defaultSharedPreferencesProvider.get());
    }
}
