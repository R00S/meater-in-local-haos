package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.implementation.PageViewsAnalytics;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideNavigationTrackerFactory implements Provider {
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;
    private final Provider<PageViewsAnalytics> pageViewsAnalyticsProvider;

    public ApplicationModule_ProvideNavigationTrackerFactory(ApplicationModule applicationModule, Provider<PageViewsAnalytics> provider, Provider<AnalyticsLogger> provider2) {
        this.module = applicationModule;
        this.pageViewsAnalyticsProvider = provider;
        this.loggerProvider = provider2;
    }

    public static ApplicationModule_ProvideNavigationTrackerFactory create(ApplicationModule applicationModule, Provider<PageViewsAnalytics> provider, Provider<AnalyticsLogger> provider2) {
        return new ApplicationModule_ProvideNavigationTrackerFactory(applicationModule, provider, provider2);
    }

    public static NavigationTracker provideNavigationTracker(ApplicationModule applicationModule, PageViewsAnalytics pageViewsAnalytics, AnalyticsLogger analyticsLogger) {
        return (NavigationTracker) C9055b.m29112c(applicationModule.provideNavigationTracker(pageViewsAnalytics, analyticsLogger));
    }

    @Override // javax.inject.Provider
    public NavigationTracker get() {
        return provideNavigationTracker(this.module, this.pageViewsAnalyticsProvider.get(), this.loggerProvider.get());
    }
}
