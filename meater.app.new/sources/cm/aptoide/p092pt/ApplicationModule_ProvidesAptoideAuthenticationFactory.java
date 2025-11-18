package cm.aptoide.p092pt;

import com.aptoide.authenticationrx.AptoideAuthenticationRx;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAptoideAuthenticationFactory implements Provider {
    private final Provider<String> authenticationBaseHostProvider;
    private final ApplicationModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;

    public ApplicationModule_ProvidesAptoideAuthenticationFactory(ApplicationModule applicationModule, Provider<String> provider, Provider<OkHttpClient> provider2) {
        this.module = applicationModule;
        this.authenticationBaseHostProvider = provider;
        this.okHttpClientProvider = provider2;
    }

    public static ApplicationModule_ProvidesAptoideAuthenticationFactory create(ApplicationModule applicationModule, Provider<String> provider, Provider<OkHttpClient> provider2) {
        return new ApplicationModule_ProvidesAptoideAuthenticationFactory(applicationModule, provider, provider2);
    }

    public static AptoideAuthenticationRx providesAptoideAuthentication(ApplicationModule applicationModule, String str, OkHttpClient okHttpClient) {
        return (AptoideAuthenticationRx) C9055b.m29112c(applicationModule.providesAptoideAuthentication(str, okHttpClient));
    }

    @Override // javax.inject.Provider
    public AptoideAuthenticationRx get() {
        return providesAptoideAuthentication(this.module, this.authenticationBaseHostProvider.get(), this.okHttpClientProvider.get());
    }
}
