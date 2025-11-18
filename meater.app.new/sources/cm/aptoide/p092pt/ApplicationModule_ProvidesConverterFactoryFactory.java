package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;
import retrofit2.Converter;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesConverterFactoryFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesConverterFactoryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesConverterFactoryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesConverterFactoryFactory(applicationModule);
    }

    public static Converter.Factory providesConverterFactory(ApplicationModule applicationModule) {
        return (Converter.Factory) C9055b.m29112c(applicationModule.providesConverterFactory());
    }

    @Override // javax.inject.Provider
    public Converter.Factory get() {
        return providesConverterFactory(this.module);
    }
}
