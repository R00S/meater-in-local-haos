package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.promotions.PromotionsAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesPromotionsAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesPromotionsAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<DownloadAnalytics> provider3, Provider<InstallAnalytics> provider4) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.downloadAnalyticsProvider = provider3;
        this.installAnalyticsProvider = provider4;
    }

    public static ApplicationModule_ProvidesPromotionsAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<DownloadAnalytics> provider3, Provider<InstallAnalytics> provider4) {
        return new ApplicationModule_ProvidesPromotionsAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static PromotionsAnalytics providesPromotionsAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics) {
        return (PromotionsAnalytics) C9055b.m29112c(applicationModule.providesPromotionsAnalytics(analyticsManager, navigationTracker, downloadAnalytics, installAnalytics));
    }

    @Override // javax.inject.Provider
    public PromotionsAnalytics get() {
        return providesPromotionsAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.downloadAnalyticsProvider.get(), this.installAnalyticsProvider.get());
    }
}
