package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsLogger;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAnalyticsDebugLoggerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAnalyticsDebugLoggerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAnalyticsDebugLoggerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAnalyticsDebugLoggerFactory(applicationModule);
    }

    public static AnalyticsLogger providesAnalyticsDebugLogger(ApplicationModule applicationModule) {
        return (AnalyticsLogger) C9055b.m29112c(applicationModule.providesAnalyticsDebugLogger());
    }

    @Override // javax.inject.Provider
    public AnalyticsLogger get() {
        return providesAnalyticsDebugLogger(this.module);
    }
}
