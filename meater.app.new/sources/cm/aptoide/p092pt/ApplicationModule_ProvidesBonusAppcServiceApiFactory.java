package cm.aptoide.p092pt;

import cm.aptoide.p092pt.bonus.BonusAppcRemoteService;
import javax.inject.Provider;
import p317f.p318b.C9055b;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesBonusAppcServiceApiFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesBonusAppcServiceApiFactory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesBonusAppcServiceApiFactory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesBonusAppcServiceApiFactory(applicationModule, provider);
    }

    public static BonusAppcRemoteService.ServiceApi providesBonusAppcServiceApi(ApplicationModule applicationModule, Retrofit retrofit) {
        return (BonusAppcRemoteService.ServiceApi) C9055b.m29112c(applicationModule.providesBonusAppcServiceApi(retrofit));
    }

    @Override // javax.inject.Provider
    public BonusAppcRemoteService.ServiceApi get() {
        return providesBonusAppcServiceApi(this.module, this.retrofitProvider.get());
    }
}
