package cm.aptoide.p092pt;

import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.RequestBodyFactory;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideRequestBodyFactoryFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideRequestBodyFactoryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideRequestBodyFactoryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideRequestBodyFactoryFactory(applicationModule);
    }

    public static RequestBodyFactory provideRequestBodyFactory(ApplicationModule applicationModule) {
        return (RequestBodyFactory) C9055b.m29112c(applicationModule.provideRequestBodyFactory());
    }

    @Override // javax.inject.Provider
    public RequestBodyFactory get() {
        return provideRequestBodyFactory(this.module);
    }
}
