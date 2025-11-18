package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.account.AccountAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAccountAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvideAccountAnalyticsFactory(ApplicationModule applicationModule, Provider<NavigationTracker> provider, Provider<AnalyticsManager> provider2) {
        this.module = applicationModule;
        this.navigationTrackerProvider = provider;
        this.analyticsManagerProvider = provider2;
    }

    public static ApplicationModule_ProvideAccountAnalyticsFactory create(ApplicationModule applicationModule, Provider<NavigationTracker> provider, Provider<AnalyticsManager> provider2) {
        return new ApplicationModule_ProvideAccountAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static AccountAnalytics provideAccountAnalytics(ApplicationModule applicationModule, NavigationTracker navigationTracker, AnalyticsManager analyticsManager) {
        return (AccountAnalytics) C9055b.m29112c(applicationModule.provideAccountAnalytics(navigationTracker, analyticsManager));
    }

    @Override // javax.inject.Provider
    public AccountAnalytics get() {
        return provideAccountAnalytics(this.module, this.navigationTrackerProvider.get(), this.analyticsManagerProvider.get());
    }
}
