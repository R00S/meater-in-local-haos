package cm.aptoide.p092pt;

import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideV8OkHttpClientFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<OkHttpClient.Builder> okHttpClientBuilderProvider;
    private final Provider<Interceptor> userAgentInterceptorV8Provider;

    public ApplicationModule_ProvideV8OkHttpClientFactory(ApplicationModule applicationModule, Provider<OkHttpClient.Builder> provider, Provider<Interceptor> provider2) {
        this.module = applicationModule;
        this.okHttpClientBuilderProvider = provider;
        this.userAgentInterceptorV8Provider = provider2;
    }

    public static ApplicationModule_ProvideV8OkHttpClientFactory create(ApplicationModule applicationModule, Provider<OkHttpClient.Builder> provider, Provider<Interceptor> provider2) {
        return new ApplicationModule_ProvideV8OkHttpClientFactory(applicationModule, provider, provider2);
    }

    public static OkHttpClient provideV8OkHttpClient(ApplicationModule applicationModule, OkHttpClient.Builder builder, Interceptor interceptor) {
        return (OkHttpClient) C9055b.m29112c(applicationModule.provideV8OkHttpClient(builder, interceptor));
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideV8OkHttpClient(this.module, this.okHttpClientBuilderProvider.get(), this.userAgentInterceptorV8Provider.get());
    }
}
