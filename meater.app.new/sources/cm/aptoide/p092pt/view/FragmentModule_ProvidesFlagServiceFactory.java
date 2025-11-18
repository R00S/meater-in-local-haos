package cm.aptoide.p092pt.view;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.app.FlagService;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesFlagServiceFactory implements Provider {
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorV3Provider;
    private final FragmentModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public FragmentModule_ProvidesFlagServiceFactory(FragmentModule fragmentModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<TokenInvalidator> provider3, Provider<SharedPreferences> provider4) {
        this.module = fragmentModule;
        this.bodyInterceptorV3Provider = provider;
        this.okHttpClientProvider = provider2;
        this.tokenInvalidatorProvider = provider3;
        this.sharedPreferencesProvider = provider4;
    }

    public static FragmentModule_ProvidesFlagServiceFactory create(FragmentModule fragmentModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<TokenInvalidator> provider3, Provider<SharedPreferences> provider4) {
        return new FragmentModule_ProvidesFlagServiceFactory(fragmentModule, provider, provider2, provider3, provider4);
    }

    public static FlagService providesFlagService(FragmentModule fragmentModule, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return (FlagService) C9055b.m29112c(fragmentModule.providesFlagService(bodyInterceptor, okHttpClient, tokenInvalidator, sharedPreferences));
    }

    @Override // javax.inject.Provider
    public FlagService get() {
        return providesFlagService(this.module, this.bodyInterceptorV3Provider.get(), this.okHttpClientProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get());
    }
}
