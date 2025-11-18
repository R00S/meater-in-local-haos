package cm.aptoide.p092pt;

import cm.aptoide.p092pt.abtesting.ABTestService;
import javax.inject.Provider;
import p317f.p318b.C9055b;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesABTestServiceV7Factory implements Provider {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesABTestServiceV7Factory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesABTestServiceV7Factory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesABTestServiceV7Factory(applicationModule, provider);
    }

    public static ABTestService.ABTestingService providesABTestServiceV7(ApplicationModule applicationModule, Retrofit retrofit) {
        return (ABTestService.ABTestingService) C9055b.m29112c(applicationModule.providesABTestServiceV7(retrofit));
    }

    @Override // javax.inject.Provider
    public ABTestService.ABTestingService get() {
        return providesABTestServiceV7(this.module, this.retrofitProvider.get());
    }
}
