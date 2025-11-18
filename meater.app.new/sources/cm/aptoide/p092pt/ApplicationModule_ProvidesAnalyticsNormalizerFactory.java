package cm.aptoide.p092pt;

import cm.aptoide.analytics.implementation.utils.AnalyticsEventParametersNormalizer;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAnalyticsNormalizerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAnalyticsNormalizerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAnalyticsNormalizerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAnalyticsNormalizerFactory(applicationModule);
    }

    public static AnalyticsEventParametersNormalizer providesAnalyticsNormalizer(ApplicationModule applicationModule) {
        return (AnalyticsEventParametersNormalizer) C9055b.m29112c(applicationModule.providesAnalyticsNormalizer());
    }

    @Override // javax.inject.Provider
    public AnalyticsEventParametersNormalizer get() {
        return providesAnalyticsNormalizer(this.module);
    }
}
