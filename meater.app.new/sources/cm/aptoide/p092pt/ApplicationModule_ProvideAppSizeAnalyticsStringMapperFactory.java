package cm.aptoide.p092pt;

import cm.aptoide.p092pt.analytics.AppSizeAnalyticsStringMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAppSizeAnalyticsStringMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAppSizeAnalyticsStringMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAppSizeAnalyticsStringMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAppSizeAnalyticsStringMapperFactory(applicationModule);
    }

    public static AppSizeAnalyticsStringMapper provideAppSizeAnalyticsStringMapper(ApplicationModule applicationModule) {
        return (AppSizeAnalyticsStringMapper) C9055b.m29112c(applicationModule.provideAppSizeAnalyticsStringMapper());
    }

    @Override // javax.inject.Provider
    public AppSizeAnalyticsStringMapper get() {
        return provideAppSizeAnalyticsStringMapper(this.module);
    }
}
