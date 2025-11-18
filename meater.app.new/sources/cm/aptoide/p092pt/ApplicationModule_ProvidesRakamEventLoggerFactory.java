package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.EventLogger;
import cm.aptoide.analytics.implementation.utils.MapToJsonMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRakamEventLoggerFactory implements Provider {
    private final Provider<AnalyticsLogger> loggerProvider;
    private final Provider<MapToJsonMapper> mapToJsonMapperProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRakamEventLoggerFactory(ApplicationModule applicationModule, Provider<AnalyticsLogger> provider, Provider<MapToJsonMapper> provider2) {
        this.module = applicationModule;
        this.loggerProvider = provider;
        this.mapToJsonMapperProvider = provider2;
    }

    public static ApplicationModule_ProvidesRakamEventLoggerFactory create(ApplicationModule applicationModule, Provider<AnalyticsLogger> provider, Provider<MapToJsonMapper> provider2) {
        return new ApplicationModule_ProvidesRakamEventLoggerFactory(applicationModule, provider, provider2);
    }

    public static EventLogger providesRakamEventLogger(ApplicationModule applicationModule, AnalyticsLogger analyticsLogger, MapToJsonMapper mapToJsonMapper) {
        return (EventLogger) C9055b.m29112c(applicationModule.providesRakamEventLogger(analyticsLogger, mapToJsonMapper));
    }

    @Override // javax.inject.Provider
    public EventLogger get() {
        return providesRakamEventLogger(this.module, this.loggerProvider.get(), this.mapToJsonMapperProvider.get());
    }
}
