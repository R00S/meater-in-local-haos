package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.AccountFactory;
import cm.aptoide.accountmanager.AccountService;
import cm.aptoide.p092pt.account.OAuthModeProvider;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import cm.aptoide.p092pt.networking.MultipartBodyInterceptor;
import com.aptoide.authenticationrx.AptoideAuthenticationRx;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;
import retrofit2.Converter;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAccountServiceFactory implements Provider {
    private final Provider<AccountFactory> accountFactoryProvider;
    private final Provider<AptoideAuthenticationRx> aptoideAuthenticationProvider;
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorPoolV7Provider;
    private final Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> bodyInterceptorV3Provider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorWebV7Provider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final Provider<String> extraIdProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final Provider<OkHttpClient> longTimeoutHttpClientProvider;
    private final ApplicationModule module;
    private final Provider<MultipartBodyInterceptor> multipartBodyInterceptorProvider;
    private final Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> noAuthenticationBodyInterceptorV3Provider;
    private final Provider<OAuthModeProvider> oAuthModeProvider;
    private final Provider<ObjectMapper> objectMapperProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvideAccountServiceFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<OkHttpClient> provider2, Provider<SharedPreferences> provider3, Provider<AuthenticationPersistence> provider4, Provider<TokenInvalidator> provider5, Provider<BodyInterceptor<BaseBody>> provider6, Provider<BodyInterceptor<BaseBody>> provider7, Provider<MultipartBodyInterceptor> provider8, Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> provider9, Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> provider10, Provider<ObjectMapper> provider11, Provider<Converter.Factory> provider12, Provider<String> provider13, Provider<AccountFactory> provider14, Provider<OAuthModeProvider> provider15, Provider<AptoideAuthenticationRx> provider16) {
        this.module = applicationModule;
        this.httpClientProvider = provider;
        this.longTimeoutHttpClientProvider = provider2;
        this.defaultSharedPreferencesProvider = provider3;
        this.authenticationPersistenceProvider = provider4;
        this.tokenInvalidatorProvider = provider5;
        this.bodyInterceptorPoolV7Provider = provider6;
        this.bodyInterceptorWebV7Provider = provider7;
        this.multipartBodyInterceptorProvider = provider8;
        this.noAuthenticationBodyInterceptorV3Provider = provider9;
        this.bodyInterceptorV3Provider = provider10;
        this.objectMapperProvider = provider11;
        this.converterFactoryProvider = provider12;
        this.extraIdProvider = provider13;
        this.accountFactoryProvider = provider14;
        this.oAuthModeProvider = provider15;
        this.aptoideAuthenticationProvider = provider16;
    }

    public static ApplicationModule_ProvideAccountServiceFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<OkHttpClient> provider2, Provider<SharedPreferences> provider3, Provider<AuthenticationPersistence> provider4, Provider<TokenInvalidator> provider5, Provider<BodyInterceptor<BaseBody>> provider6, Provider<BodyInterceptor<BaseBody>> provider7, Provider<MultipartBodyInterceptor> provider8, Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> provider9, Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> provider10, Provider<ObjectMapper> provider11, Provider<Converter.Factory> provider12, Provider<String> provider13, Provider<AccountFactory> provider14, Provider<OAuthModeProvider> provider15, Provider<AptoideAuthenticationRx> provider16) {
        return new ApplicationModule_ProvideAccountServiceFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public static AccountService provideAccountService(ApplicationModule applicationModule, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, SharedPreferences sharedPreferences, AuthenticationPersistence authenticationPersistence, TokenInvalidator tokenInvalidator, BodyInterceptor<BaseBody> bodyInterceptor, BodyInterceptor<BaseBody> bodyInterceptor2, MultipartBodyInterceptor multipartBodyInterceptor, BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody> bodyInterceptor3, BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody> bodyInterceptor4, ObjectMapper objectMapper, Converter.Factory factory, String str, AccountFactory accountFactory, OAuthModeProvider oAuthModeProvider, AptoideAuthenticationRx aptoideAuthenticationRx) {
        return (AccountService) C9055b.m29112c(applicationModule.provideAccountService(okHttpClient, okHttpClient2, sharedPreferences, authenticationPersistence, tokenInvalidator, bodyInterceptor, bodyInterceptor2, multipartBodyInterceptor, bodyInterceptor3, bodyInterceptor4, objectMapper, factory, str, accountFactory, oAuthModeProvider, aptoideAuthenticationRx));
    }

    @Override // javax.inject.Provider
    public AccountService get() {
        return provideAccountService(this.module, this.httpClientProvider.get(), this.longTimeoutHttpClientProvider.get(), this.defaultSharedPreferencesProvider.get(), this.authenticationPersistenceProvider.get(), this.tokenInvalidatorProvider.get(), this.bodyInterceptorPoolV7Provider.get(), this.bodyInterceptorWebV7Provider.get(), this.multipartBodyInterceptorProvider.get(), this.noAuthenticationBodyInterceptorV3Provider.get(), this.bodyInterceptorV3Provider.get(), this.objectMapperProvider.get(), this.converterFactoryProvider.get(), this.extraIdProvider.get(), this.accountFactoryProvider.get(), this.oAuthModeProvider.get(), this.aptoideAuthenticationProvider.get());
    }
}
