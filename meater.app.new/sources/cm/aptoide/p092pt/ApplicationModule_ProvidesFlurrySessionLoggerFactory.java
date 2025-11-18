package cm.aptoide.p092pt;

import cm.aptoide.analytics.SessionLogger;
import cm.aptoide.analytics.implementation.loggers.FlurryEventLogger;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFlurrySessionLoggerFactory implements Provider {
    private final Provider<FlurryEventLogger> eventLoggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFlurrySessionLoggerFactory(ApplicationModule applicationModule, Provider<FlurryEventLogger> provider) {
        this.module = applicationModule;
        this.eventLoggerProvider = provider;
    }

    public static ApplicationModule_ProvidesFlurrySessionLoggerFactory create(ApplicationModule applicationModule, Provider<FlurryEventLogger> provider) {
        return new ApplicationModule_ProvidesFlurrySessionLoggerFactory(applicationModule, provider);
    }

    public static SessionLogger providesFlurrySessionLogger(ApplicationModule applicationModule, FlurryEventLogger flurryEventLogger) {
        return (SessionLogger) C9055b.m29112c(applicationModule.providesFlurrySessionLogger(flurryEventLogger));
    }

    @Override // javax.inject.Provider
    public SessionLogger get() {
        return providesFlurrySessionLogger(this.module, this.eventLoggerProvider.get());
    }
}
