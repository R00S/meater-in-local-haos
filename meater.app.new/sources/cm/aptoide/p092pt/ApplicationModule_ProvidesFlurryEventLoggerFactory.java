package cm.aptoide.p092pt;

import cm.aptoide.analytics.EventLogger;
import cm.aptoide.analytics.implementation.loggers.FlurryEventLogger;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFlurryEventLoggerFactory implements Provider {
    private final Provider<FlurryEventLogger> eventLoggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFlurryEventLoggerFactory(ApplicationModule applicationModule, Provider<FlurryEventLogger> provider) {
        this.module = applicationModule;
        this.eventLoggerProvider = provider;
    }

    public static ApplicationModule_ProvidesFlurryEventLoggerFactory create(ApplicationModule applicationModule, Provider<FlurryEventLogger> provider) {
        return new ApplicationModule_ProvidesFlurryEventLoggerFactory(applicationModule, provider);
    }

    public static EventLogger providesFlurryEventLogger(ApplicationModule applicationModule, FlurryEventLogger flurryEventLogger) {
        return (EventLogger) C9055b.m29112c(applicationModule.providesFlurryEventLogger(flurryEventLogger));
    }

    @Override // javax.inject.Provider
    public EventLogger get() {
        return providesFlurryEventLogger(this.module, this.eventLoggerProvider.get());
    }
}
