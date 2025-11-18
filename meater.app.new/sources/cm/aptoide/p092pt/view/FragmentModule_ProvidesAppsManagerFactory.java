package cm.aptoide.p092pt.view;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallManager;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignManager;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.home.apps.AppMapper;
import cm.aptoide.p092pt.home.apps.AppsManager;
import cm.aptoide.p092pt.home.apps.UpdatesManager;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.notification.UpdatesNotificationManager;
import cm.aptoide.p092pt.updates.UpdatesAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesAppsManagerFactory implements Provider {
    private final Provider<AppMapper> appMapperProvider;
    private final Provider<AptoideInstallManager> aptoideInstallManagerProvider;
    private final Provider<CampaignManager> campaignManagerProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<DynamicSplitsManager> dynamicSplitsManagerProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<SharedPreferences> secureSharedPreferencesProvider;
    private final Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;
    private final Provider<UpdatesAnalytics> updatesAnalyticsProvider;
    private final Provider<UpdatesManager> updatesManagerProvider;
    private final Provider<UpdatesNotificationManager> updatesNotificationManagerProvider;

    public FragmentModule_ProvidesAppsManagerFactory(FragmentModule fragmentModule, Provider<UpdatesManager> provider, Provider<InstallManager> provider2, Provider<AppMapper> provider3, Provider<DownloadAnalytics> provider4, Provider<InstallAnalytics> provider5, Provider<UpdatesAnalytics> provider6, Provider<DownloadFactory> provider7, Provider<MoPubAdsManager> provider8, Provider<AptoideInstallManager> provider9, Provider<UpdatesNotificationManager> provider10, Provider<SharedPreferences> provider11, Provider<DynamicSplitsManager> provider12, Provider<SplitAnalyticsMapper> provider13, Provider<CampaignManager> provider14) {
        this.module = fragmentModule;
        this.updatesManagerProvider = provider;
        this.installManagerProvider = provider2;
        this.appMapperProvider = provider3;
        this.downloadAnalyticsProvider = provider4;
        this.installAnalyticsProvider = provider5;
        this.updatesAnalyticsProvider = provider6;
        this.downloadFactoryProvider = provider7;
        this.moPubAdsManagerProvider = provider8;
        this.aptoideInstallManagerProvider = provider9;
        this.updatesNotificationManagerProvider = provider10;
        this.secureSharedPreferencesProvider = provider11;
        this.dynamicSplitsManagerProvider = provider12;
        this.splitAnalyticsMapperProvider = provider13;
        this.campaignManagerProvider = provider14;
    }

    public static FragmentModule_ProvidesAppsManagerFactory create(FragmentModule fragmentModule, Provider<UpdatesManager> provider, Provider<InstallManager> provider2, Provider<AppMapper> provider3, Provider<DownloadAnalytics> provider4, Provider<InstallAnalytics> provider5, Provider<UpdatesAnalytics> provider6, Provider<DownloadFactory> provider7, Provider<MoPubAdsManager> provider8, Provider<AptoideInstallManager> provider9, Provider<UpdatesNotificationManager> provider10, Provider<SharedPreferences> provider11, Provider<DynamicSplitsManager> provider12, Provider<SplitAnalyticsMapper> provider13, Provider<CampaignManager> provider14) {
        return new FragmentModule_ProvidesAppsManagerFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static AppsManager providesAppsManager(FragmentModule fragmentModule, UpdatesManager updatesManager, InstallManager installManager, AppMapper appMapper, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics, UpdatesAnalytics updatesAnalytics, DownloadFactory downloadFactory, MoPubAdsManager moPubAdsManager, AptoideInstallManager aptoideInstallManager, UpdatesNotificationManager updatesNotificationManager, SharedPreferences sharedPreferences, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, CampaignManager campaignManager) {
        return (AppsManager) C9055b.m29112c(fragmentModule.providesAppsManager(updatesManager, installManager, appMapper, downloadAnalytics, installAnalytics, updatesAnalytics, downloadFactory, moPubAdsManager, aptoideInstallManager, updatesNotificationManager, sharedPreferences, dynamicSplitsManager, splitAnalyticsMapper, campaignManager));
    }

    @Override // javax.inject.Provider
    public AppsManager get() {
        return providesAppsManager(this.module, this.updatesManagerProvider.get(), this.installManagerProvider.get(), this.appMapperProvider.get(), this.downloadAnalyticsProvider.get(), this.installAnalyticsProvider.get(), this.updatesAnalyticsProvider.get(), this.downloadFactoryProvider.get(), this.moPubAdsManagerProvider.get(), this.aptoideInstallManagerProvider.get(), this.updatesNotificationManagerProvider.get(), this.secureSharedPreferencesProvider.get(), this.dynamicSplitsManagerProvider.get(), this.splitAnalyticsMapperProvider.get(), this.campaignManagerProvider.get());
    }
}
