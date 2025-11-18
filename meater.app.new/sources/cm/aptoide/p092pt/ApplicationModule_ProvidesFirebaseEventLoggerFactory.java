package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.EventLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFirebaseEventLoggerFactory implements Provider {
    private final Provider<FirebaseAnalytics> firebaseAnalyticsProvider;
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFirebaseEventLoggerFactory(ApplicationModule applicationModule, Provider<FirebaseAnalytics> provider, Provider<AnalyticsLogger> provider2) {
        this.module = applicationModule;
        this.firebaseAnalyticsProvider = provider;
        this.loggerProvider = provider2;
    }

    public static ApplicationModule_ProvidesFirebaseEventLoggerFactory create(ApplicationModule applicationModule, Provider<FirebaseAnalytics> provider, Provider<AnalyticsLogger> provider2) {
        return new ApplicationModule_ProvidesFirebaseEventLoggerFactory(applicationModule, provider, provider2);
    }

    public static EventLogger providesFirebaseEventLogger(ApplicationModule applicationModule, FirebaseAnalytics firebaseAnalytics, AnalyticsLogger analyticsLogger) {
        return (EventLogger) C9055b.m29112c(applicationModule.providesFirebaseEventLogger(firebaseAnalytics, analyticsLogger));
    }

    @Override // javax.inject.Provider
    public EventLogger get() {
        return providesFirebaseEventLogger(this.module, this.firebaseAnalyticsProvider.get(), this.loggerProvider.get());
    }
}
