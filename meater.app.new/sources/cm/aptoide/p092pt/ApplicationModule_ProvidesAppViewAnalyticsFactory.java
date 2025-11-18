package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.app.AppViewAnalytics;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.store.StoreAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppViewAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<StoreAnalytics> storeAnalyticsProvider;

    public ApplicationModule_ProvidesAppViewAnalyticsFactory(ApplicationModule applicationModule, Provider<DownloadAnalytics> provider, Provider<AnalyticsManager> provider2, Provider<NavigationTracker> provider3, Provider<StoreAnalytics> provider4, Provider<InstallAnalytics> provider5) {
        this.module = applicationModule;
        this.downloadAnalyticsProvider = provider;
        this.analyticsManagerProvider = provider2;
        this.navigationTrackerProvider = provider3;
        this.storeAnalyticsProvider = provider4;
        this.installAnalyticsProvider = provider5;
    }

    public static ApplicationModule_ProvidesAppViewAnalyticsFactory create(ApplicationModule applicationModule, Provider<DownloadAnalytics> provider, Provider<AnalyticsManager> provider2, Provider<NavigationTracker> provider3, Provider<StoreAnalytics> provider4, Provider<InstallAnalytics> provider5) {
        return new ApplicationModule_ProvidesAppViewAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static AppViewAnalytics providesAppViewAnalytics(ApplicationModule applicationModule, DownloadAnalytics downloadAnalytics, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, StoreAnalytics storeAnalytics, InstallAnalytics installAnalytics) {
        return (AppViewAnalytics) C9055b.m29112c(applicationModule.providesAppViewAnalytics(downloadAnalytics, analyticsManager, navigationTracker, storeAnalytics, installAnalytics));
    }

    @Override // javax.inject.Provider
    public AppViewAnalytics get() {
        return providesAppViewAnalytics(this.module, this.downloadAnalyticsProvider.get(), this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.storeAnalyticsProvider.get(), this.installAnalyticsProvider.get());
    }
}
