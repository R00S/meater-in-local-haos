package cm.aptoide.p092pt.view;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesBottomNavigationAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> managerProvider;
    private final ActivityModule module;
    private final Provider<NavigationTracker> trackerProvider;

    public ActivityModule_ProvidesBottomNavigationAnalyticsFactory(ActivityModule activityModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = activityModule;
        this.managerProvider = provider;
        this.trackerProvider = provider2;
    }

    public static ActivityModule_ProvidesBottomNavigationAnalyticsFactory create(ActivityModule activityModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ActivityModule_ProvidesBottomNavigationAnalyticsFactory(activityModule, provider, provider2);
    }

    public static BottomNavigationAnalytics providesBottomNavigationAnalytics(ActivityModule activityModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return (BottomNavigationAnalytics) C9055b.m29112c(activityModule.providesBottomNavigationAnalytics(analyticsManager, navigationTracker));
    }

    @Override // javax.inject.Provider
    public BottomNavigationAnalytics get() {
        return providesBottomNavigationAnalytics(this.module, this.managerProvider.get(), this.trackerProvider.get());
    }
}
