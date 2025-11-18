package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.migration.AppcMigrationManager;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.download.view.DownloadDialogProvider;
import cm.aptoide.p092pt.download.view.DownloadNavigator;
import cm.aptoide.p092pt.download.view.DownloadViewActionPresenter;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesDownloadViewActionPresenterFactory implements Provider {
    private final Provider<AppcMigrationManager> appcMigrationManagerProvider;
    private final Provider<CampaignManager> campaignManagerProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<DownloadDialogProvider> downloadDialogProvider;
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<DownloadNavigator> downloadNavigatorProvider;
    private final Provider<DynamicSplitsManager> dynamicSplitsManagerProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<NotificationAnalytics> notificationAnalyticsProvider;
    private final Provider<PermissionManager> permissionManagerProvider;
    private final Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;

    public FragmentModule_ProvidesDownloadViewActionPresenterFactory(FragmentModule fragmentModule, Provider<InstallManager> provider, Provider<MoPubAdsManager> provider2, Provider<PermissionManager> provider3, Provider<AppcMigrationManager> provider4, Provider<DownloadDialogProvider> provider5, Provider<DownloadNavigator> provider6, Provider<DownloadFactory> provider7, Provider<DownloadAnalytics> provider8, Provider<InstallAnalytics> provider9, Provider<NotificationAnalytics> provider10, Provider<CrashReport> provider11, Provider<DynamicSplitsManager> provider12, Provider<SplitAnalyticsMapper> provider13, Provider<CampaignManager> provider14) {
        this.module = fragmentModule;
        this.installManagerProvider = provider;
        this.moPubAdsManagerProvider = provider2;
        this.permissionManagerProvider = provider3;
        this.appcMigrationManagerProvider = provider4;
        this.downloadDialogProvider = provider5;
        this.downloadNavigatorProvider = provider6;
        this.downloadFactoryProvider = provider7;
        this.downloadAnalyticsProvider = provider8;
        this.installAnalyticsProvider = provider9;
        this.notificationAnalyticsProvider = provider10;
        this.crashReportProvider = provider11;
        this.dynamicSplitsManagerProvider = provider12;
        this.splitAnalyticsMapperProvider = provider13;
        this.campaignManagerProvider = provider14;
    }

    public static FragmentModule_ProvidesDownloadViewActionPresenterFactory create(FragmentModule fragmentModule, Provider<InstallManager> provider, Provider<MoPubAdsManager> provider2, Provider<PermissionManager> provider3, Provider<AppcMigrationManager> provider4, Provider<DownloadDialogProvider> provider5, Provider<DownloadNavigator> provider6, Provider<DownloadFactory> provider7, Provider<DownloadAnalytics> provider8, Provider<InstallAnalytics> provider9, Provider<NotificationAnalytics> provider10, Provider<CrashReport> provider11, Provider<DynamicSplitsManager> provider12, Provider<SplitAnalyticsMapper> provider13, Provider<CampaignManager> provider14) {
        return new FragmentModule_ProvidesDownloadViewActionPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static DownloadViewActionPresenter providesDownloadViewActionPresenter(FragmentModule fragmentModule, InstallManager installManager, MoPubAdsManager moPubAdsManager, PermissionManager permissionManager, AppcMigrationManager appcMigrationManager, DownloadDialogProvider downloadDialogProvider, DownloadNavigator downloadNavigator, DownloadFactory downloadFactory, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics, NotificationAnalytics notificationAnalytics, CrashReport crashReport, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, CampaignManager campaignManager) {
        return (DownloadViewActionPresenter) C9055b.m29112c(fragmentModule.providesDownloadViewActionPresenter(installManager, moPubAdsManager, permissionManager, appcMigrationManager, downloadDialogProvider, downloadNavigator, downloadFactory, downloadAnalytics, installAnalytics, notificationAnalytics, crashReport, dynamicSplitsManager, splitAnalyticsMapper, campaignManager));
    }

    @Override // javax.inject.Provider
    public DownloadViewActionPresenter get() {
        return providesDownloadViewActionPresenter(this.module, this.installManagerProvider.get(), this.moPubAdsManagerProvider.get(), this.permissionManagerProvider.get(), this.appcMigrationManagerProvider.get(), this.downloadDialogProvider.get(), this.downloadNavigatorProvider.get(), this.downloadFactoryProvider.get(), this.downloadAnalyticsProvider.get(), this.installAnalyticsProvider.get(), this.notificationAnalyticsProvider.get(), this.crashReportProvider.get(), this.dynamicSplitsManagerProvider.get(), this.splitAnalyticsMapperProvider.get(), this.campaignManagerProvider.get());
    }
}
