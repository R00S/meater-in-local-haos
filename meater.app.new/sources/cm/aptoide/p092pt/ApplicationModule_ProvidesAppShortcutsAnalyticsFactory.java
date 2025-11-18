package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppShortcutsAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesAppShortcutsAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvidesAppShortcutsAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvidesAppShortcutsAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static AppShortcutsAnalytics providesAppShortcutsAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return (AppShortcutsAnalytics) C9055b.m29112c(applicationModule.providesAppShortcutsAnalytics(analyticsManager, navigationTracker));
    }

    @Override // javax.inject.Provider
    public AppShortcutsAnalytics get() {
        return providesAppShortcutsAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
