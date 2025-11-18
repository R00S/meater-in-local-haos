package cm.aptoide.p092pt;

import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.RequestBodyFactory;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.networking.MultipartBodyInterceptor;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideMultipartBodyInterceptorFactory implements Provider {
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<RequestBodyFactory> requestBodyFactoryProvider;

    public ApplicationModule_ProvideMultipartBodyInterceptorFactory(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<AuthenticationPersistence> provider2, Provider<RequestBodyFactory> provider3) {
        this.module = applicationModule;
        this.idsRepositoryProvider = provider;
        this.authenticationPersistenceProvider = provider2;
        this.requestBodyFactoryProvider = provider3;
    }

    public static ApplicationModule_ProvideMultipartBodyInterceptorFactory create(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<AuthenticationPersistence> provider2, Provider<RequestBodyFactory> provider3) {
        return new ApplicationModule_ProvideMultipartBodyInterceptorFactory(applicationModule, provider, provider2, provider3);
    }

    public static MultipartBodyInterceptor provideMultipartBodyInterceptor(ApplicationModule applicationModule, IdsRepository idsRepository, AuthenticationPersistence authenticationPersistence, RequestBodyFactory requestBodyFactory) {
        return (MultipartBodyInterceptor) C9055b.m29112c(applicationModule.provideMultipartBodyInterceptor(idsRepository, authenticationPersistence, requestBodyFactory));
    }

    @Override // javax.inject.Provider
    public MultipartBodyInterceptor get() {
        return provideMultipartBodyInterceptor(this.module, this.idsRepositoryProvider.get(), this.authenticationPersistenceProvider.get(), this.requestBodyFactoryProvider.get());
    }
}
