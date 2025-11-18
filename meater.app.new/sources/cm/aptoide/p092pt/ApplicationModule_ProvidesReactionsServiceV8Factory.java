package cm.aptoide.p092pt;

import cm.aptoide.p092pt.reactions.network.ReactionsRemoteService;
import javax.inject.Provider;
import p317f.p318b.C9055b;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesReactionsServiceV8Factory implements Provider {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesReactionsServiceV8Factory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesReactionsServiceV8Factory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesReactionsServiceV8Factory(applicationModule, provider);
    }

    public static ReactionsRemoteService.ServiceV8 providesReactionsServiceV8(ApplicationModule applicationModule, Retrofit retrofit) {
        return (ReactionsRemoteService.ServiceV8) C9055b.m29112c(applicationModule.providesReactionsServiceV8(retrofit));
    }

    @Override // javax.inject.Provider
    public ReactionsRemoteService.ServiceV8 get() {
        return providesReactionsServiceV8(this.module, this.retrofitProvider.get());
    }
}
