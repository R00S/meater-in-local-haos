package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.account.view.store.StoreManager;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.RequestBodyFactory;
import cm.aptoide.p092pt.networking.MultipartBodyInterceptor;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideStoreManagerFactory implements Provider {
    private final Provider<BodyInterceptor<BaseBody>> accountSettingsBodyInterceptorPoolV7Provider;
    private final Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> bodyInterceptorV3Provider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final ApplicationModule module;
    private final Provider<MultipartBodyInterceptor> multipartBodyInterceptorProvider;
    private final Provider<ObjectMapper> nonNullObjectMapperProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<RequestBodyFactory> requestBodyFactoryProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvideStoreManagerFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<MultipartBodyInterceptor> provider2, Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> provider3, Provider<BodyInterceptor<BaseBody>> provider4, Provider<SharedPreferences> provider5, Provider<TokenInvalidator> provider6, Provider<RequestBodyFactory> provider7, Provider<ObjectMapper> provider8, Provider<RoomStoreRepository> provider9) {
        this.module = applicationModule;
        this.okHttpClientProvider = provider;
        this.multipartBodyInterceptorProvider = provider2;
        this.bodyInterceptorV3Provider = provider3;
        this.accountSettingsBodyInterceptorPoolV7Provider = provider4;
        this.defaultSharedPreferencesProvider = provider5;
        this.tokenInvalidatorProvider = provider6;
        this.requestBodyFactoryProvider = provider7;
        this.nonNullObjectMapperProvider = provider8;
        this.storeRepositoryProvider = provider9;
    }

    public static ApplicationModule_ProvideStoreManagerFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<MultipartBodyInterceptor> provider2, Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> provider3, Provider<BodyInterceptor<BaseBody>> provider4, Provider<SharedPreferences> provider5, Provider<TokenInvalidator> provider6, Provider<RequestBodyFactory> provider7, Provider<ObjectMapper> provider8, Provider<RoomStoreRepository> provider9) {
        return new ApplicationModule_ProvideStoreManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static StoreManager provideStoreManager(ApplicationModule applicationModule, OkHttpClient okHttpClient, MultipartBodyInterceptor multipartBodyInterceptor, BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody> bodyInterceptor, BodyInterceptor<BaseBody> bodyInterceptor2, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator, RequestBodyFactory requestBodyFactory, ObjectMapper objectMapper, RoomStoreRepository roomStoreRepository) {
        return (StoreManager) C9055b.m29112c(applicationModule.provideStoreManager(okHttpClient, multipartBodyInterceptor, bodyInterceptor, bodyInterceptor2, sharedPreferences, tokenInvalidator, requestBodyFactory, objectMapper, roomStoreRepository));
    }

    @Override // javax.inject.Provider
    public StoreManager get() {
        return provideStoreManager(this.module, this.okHttpClientProvider.get(), this.multipartBodyInterceptorProvider.get(), this.bodyInterceptorV3Provider.get(), this.accountSettingsBodyInterceptorPoolV7Provider.get(), this.defaultSharedPreferencesProvider.get(), this.tokenInvalidatorProvider.get(), this.requestBodyFactoryProvider.get(), this.nonNullObjectMapperProvider.get(), this.storeRepositoryProvider.get());
    }
}
