package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.EventLogger;
import cm.aptoide.analytics.SessionLogger;
import cm.aptoide.analytics.implementation.loggers.HttpKnockEventLogger;
import cm.aptoide.analytics.implementation.utils.AnalyticsEventParametersNormalizer;
import java.util.Collection;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAnalyticsManagerFactory implements Provider {
    private final Provider<AnalyticsEventParametersNormalizer> analyticsNormalizerProvider;
    private final Provider<EventLogger> facebookEventLoggerProvider;
    private final Provider<Collection<String>> facebookEventsProvider;
    private final Provider<EventLogger> firebaseEventLoggerProvider;
    private final Provider<Collection<String>> firebaseEventsProvider;
    private final Provider<EventLogger> flurryEventLoggerProvider;
    private final Provider<Collection<String>> flurryEventsProvider;
    private final Provider<SessionLogger> flurrySessionLoggerProvider;
    private final Provider<EventLogger> indicativeEventLoggerProvider;
    private final Provider<Collection<String>> indicativeEventsProvider;
    private final Provider<HttpKnockEventLogger> knockEventLoggerProvider;
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;
    private final Provider<EventLogger> rakamEventLoggerProvider;
    private final Provider<Collection<String>> rakamEventsProvider;

    public ApplicationModule_ProvidesAnalyticsManagerFactory(ApplicationModule applicationModule, Provider<EventLogger> provider, Provider<EventLogger> provider2, Provider<HttpKnockEventLogger> provider3, Provider<Collection<String>> provider4, Provider<Collection<String>> provider5, Provider<SessionLogger> provider6, Provider<AnalyticsEventParametersNormalizer> provider7, Provider<EventLogger> provider8, Provider<Collection<String>> provider9, Provider<EventLogger> provider10, Provider<Collection<String>> provider11, Provider<EventLogger> provider12, Provider<Collection<String>> provider13, Provider<AnalyticsLogger> provider14) {
        this.module = applicationModule;
        this.facebookEventLoggerProvider = provider;
        this.flurryEventLoggerProvider = provider2;
        this.knockEventLoggerProvider = provider3;
        this.facebookEventsProvider = provider4;
        this.flurryEventsProvider = provider5;
        this.flurrySessionLoggerProvider = provider6;
        this.analyticsNormalizerProvider = provider7;
        this.rakamEventLoggerProvider = provider8;
        this.rakamEventsProvider = provider9;
        this.indicativeEventLoggerProvider = provider10;
        this.indicativeEventsProvider = provider11;
        this.firebaseEventLoggerProvider = provider12;
        this.firebaseEventsProvider = provider13;
        this.loggerProvider = provider14;
    }

    public static ApplicationModule_ProvidesAnalyticsManagerFactory create(ApplicationModule applicationModule, Provider<EventLogger> provider, Provider<EventLogger> provider2, Provider<HttpKnockEventLogger> provider3, Provider<Collection<String>> provider4, Provider<Collection<String>> provider5, Provider<SessionLogger> provider6, Provider<AnalyticsEventParametersNormalizer> provider7, Provider<EventLogger> provider8, Provider<Collection<String>> provider9, Provider<EventLogger> provider10, Provider<Collection<String>> provider11, Provider<EventLogger> provider12, Provider<Collection<String>> provider13, Provider<AnalyticsLogger> provider14) {
        return new ApplicationModule_ProvidesAnalyticsManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static AnalyticsManager providesAnalyticsManager(ApplicationModule applicationModule, EventLogger eventLogger, EventLogger eventLogger2, HttpKnockEventLogger httpKnockEventLogger, Collection<String> collection, Collection<String> collection2, SessionLogger sessionLogger, AnalyticsEventParametersNormalizer analyticsEventParametersNormalizer, EventLogger eventLogger3, Collection<String> collection3, EventLogger eventLogger4, Collection<String> collection4, EventLogger eventLogger5, Collection<String> collection5, AnalyticsLogger analyticsLogger) {
        return (AnalyticsManager) C9055b.m29112c(applicationModule.providesAnalyticsManager(eventLogger, eventLogger2, httpKnockEventLogger, collection, collection2, sessionLogger, analyticsEventParametersNormalizer, eventLogger3, collection3, eventLogger4, collection4, eventLogger5, collection5, analyticsLogger));
    }

    @Override // javax.inject.Provider
    public AnalyticsManager get() {
        return providesAnalyticsManager(this.module, this.facebookEventLoggerProvider.get(), this.flurryEventLoggerProvider.get(), this.knockEventLoggerProvider.get(), this.facebookEventsProvider.get(), this.flurryEventsProvider.get(), this.flurrySessionLoggerProvider.get(), this.analyticsNormalizerProvider.get(), this.rakamEventLoggerProvider.get(), this.rakamEventsProvider.get(), this.indicativeEventLoggerProvider.get(), this.indicativeEventsProvider.get(), this.firebaseEventLoggerProvider.get(), this.firebaseEventsProvider.get(), this.loggerProvider.get());
    }
}
