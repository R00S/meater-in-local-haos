package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;
import retrofit2.CallAdapter;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesCallAdapterFactoryFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesCallAdapterFactoryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesCallAdapterFactoryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesCallAdapterFactoryFactory(applicationModule);
    }

    public static CallAdapter.Factory providesCallAdapterFactory(ApplicationModule applicationModule) {
        return (CallAdapter.Factory) C9055b.m29112c(applicationModule.providesCallAdapterFactory());
    }

    @Override // javax.inject.Provider
    public CallAdapter.Factory get() {
        return providesCallAdapterFactory(this.module);
    }
}
