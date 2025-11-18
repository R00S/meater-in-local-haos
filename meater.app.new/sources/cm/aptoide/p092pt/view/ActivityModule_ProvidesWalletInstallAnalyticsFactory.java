package cm.aptoide.p092pt.view;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.wallet.WalletInstallAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesWalletInstallAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final ActivityModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<NotificationAnalytics> notificationAnalyticsProvider;
    private final Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;

    public ActivityModule_ProvidesWalletInstallAnalyticsFactory(ActivityModule activityModule, Provider<DownloadAnalytics> provider, Provider<NotificationAnalytics> provider2, Provider<InstallAnalytics> provider3, Provider<DownloadStateParser> provider4, Provider<AnalyticsManager> provider5, Provider<NavigationTracker> provider6, Provider<SplitAnalyticsMapper> provider7) {
        this.module = activityModule;
        this.downloadAnalyticsProvider = provider;
        this.notificationAnalyticsProvider = provider2;
        this.installAnalyticsProvider = provider3;
        this.downloadStateParserProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.navigationTrackerProvider = provider6;
        this.splitAnalyticsMapperProvider = provider7;
    }

    public static ActivityModule_ProvidesWalletInstallAnalyticsFactory create(ActivityModule activityModule, Provider<DownloadAnalytics> provider, Provider<NotificationAnalytics> provider2, Provider<InstallAnalytics> provider3, Provider<DownloadStateParser> provider4, Provider<AnalyticsManager> provider5, Provider<NavigationTracker> provider6, Provider<SplitAnalyticsMapper> provider7) {
        return new ActivityModule_ProvidesWalletInstallAnalyticsFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static WalletInstallAnalytics providesWalletInstallAnalytics(ActivityModule activityModule, DownloadAnalytics downloadAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, DownloadStateParser downloadStateParser, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, SplitAnalyticsMapper splitAnalyticsMapper) {
        return (WalletInstallAnalytics) C9055b.m29112c(activityModule.providesWalletInstallAnalytics(downloadAnalytics, notificationAnalytics, installAnalytics, downloadStateParser, analyticsManager, navigationTracker, splitAnalyticsMapper));
    }

    @Override // javax.inject.Provider
    public WalletInstallAnalytics get() {
        return providesWalletInstallAnalytics(this.module, this.downloadAnalyticsProvider.get(), this.notificationAnalyticsProvider.get(), this.installAnalyticsProvider.get(), this.downloadStateParserProvider.get(), this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.splitAnalyticsMapperProvider.get());
    }
}
