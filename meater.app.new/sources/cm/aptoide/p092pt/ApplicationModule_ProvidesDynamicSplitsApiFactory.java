package cm.aptoide.p092pt;

import cm.aptoide.p092pt.aab.DynamicSplitsRemoteService;
import javax.inject.Provider;
import p317f.p318b.C9055b;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDynamicSplitsApiFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesDynamicSplitsApiFactory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesDynamicSplitsApiFactory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesDynamicSplitsApiFactory(applicationModule, provider);
    }

    public static DynamicSplitsRemoteService.DynamicSplitsApi providesDynamicSplitsApi(ApplicationModule applicationModule, Retrofit retrofit) {
        return (DynamicSplitsRemoteService.DynamicSplitsApi) C9055b.m29112c(applicationModule.providesDynamicSplitsApi(retrofit));
    }

    @Override // javax.inject.Provider
    public DynamicSplitsRemoteService.DynamicSplitsApi get() {
        return providesDynamicSplitsApi(this.module, this.retrofitProvider.get());
    }
}
