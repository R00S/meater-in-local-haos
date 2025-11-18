package cm.aptoide.p092pt.view;

import android.content.res.Resources;
import android.view.WindowManager;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.AdsManager;
import cm.aptoide.p092pt.app.AppViewAnalytics;
import cm.aptoide.p092pt.app.AppViewManager;
import cm.aptoide.p092pt.app.AppViewModelManager;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.app.FlagManager;
import cm.aptoide.p092pt.app.ReviewsManager;
import cm.aptoide.p092pt.app.appsflyer.AppsFlyerManager;
import cm.aptoide.p092pt.app.migration.AppcMigrationManager;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignManager;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.notification.AppcPromotionNotificationStringProvider;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import cm.aptoide.p092pt.promotions.PromotionsManager;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.view.app.AppCenter;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesAppViewManagerFactory implements Provider {
    private final Provider<AdsManager> adsManagerProvider;
    private final Provider<AppCenter> appCenterProvider;
    private final Provider<AppCoinsManager> appCoinsManagerProvider;
    private final Provider<AppViewAnalytics> appViewAnalyticsProvider;
    private final Provider<AppViewModelManager> appViewModelManagerProvider;
    private final Provider<AppcMigrationManager> appcMigrationManagerProvider;
    private final Provider<AppcPromotionNotificationStringProvider> appcPromotionNotificationStringProvider;
    private final Provider<AppsFlyerManager> appsFlyerManagerProvider;
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final Provider<CampaignManager> campaignManagerProvider;
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<DynamicSplitsManager> dynamicSplitsManagerProvider;
    private final Provider<FlagManager> flagManagerProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<LocalNotificationSyncManager> localNotificationSyncManagerProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<NotificationAnalytics> notificationAnalyticsProvider;
    private final Provider<PromotionsManager> promotionsManagerProvider;
    private final Provider<Resources> resourcesProvider;
    private final Provider<ReviewsManager> reviewsManagerProvider;
    private final Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<WindowManager> windowManagerProvider;

    public FragmentModule_ProvidesAppViewManagerFactory(FragmentModule fragmentModule, Provider<AppViewModelManager> provider, Provider<InstallManager> provider2, Provider<DownloadFactory> provider3, Provider<AppCenter> provider4, Provider<ReviewsManager> provider5, Provider<AdsManager> provider6, Provider<FlagManager> provider7, Provider<StoreUtilsProxy> provider8, Provider<AptoideAccountManager> provider9, Provider<DownloadStateParser> provider10, Provider<AppViewAnalytics> provider11, Provider<NotificationAnalytics> provider12, Provider<InstallAnalytics> provider13, Provider<Resources> provider14, Provider<WindowManager> provider15, Provider<String> provider16, Provider<AppCoinsManager> provider17, Provider<MoPubAdsManager> provider18, Provider<PromotionsManager> provider19, Provider<AppcMigrationManager> provider20, Provider<LocalNotificationSyncManager> provider21, Provider<AppcPromotionNotificationStringProvider> provider22, Provider<DynamicSplitsManager> provider23, Provider<SplitAnalyticsMapper> provider24, Provider<AppsFlyerManager> provider25, Provider<CampaignManager> provider26) {
        this.module = fragmentModule;
        this.appViewModelManagerProvider = provider;
        this.installManagerProvider = provider2;
        this.downloadFactoryProvider = provider3;
        this.appCenterProvider = provider4;
        this.reviewsManagerProvider = provider5;
        this.adsManagerProvider = provider6;
        this.flagManagerProvider = provider7;
        this.storeUtilsProxyProvider = provider8;
        this.aptoideAccountManagerProvider = provider9;
        this.downloadStateParserProvider = provider10;
        this.appViewAnalyticsProvider = provider11;
        this.notificationAnalyticsProvider = provider12;
        this.installAnalyticsProvider = provider13;
        this.resourcesProvider = provider14;
        this.windowManagerProvider = provider15;
        this.marketNameProvider = provider16;
        this.appCoinsManagerProvider = provider17;
        this.moPubAdsManagerProvider = provider18;
        this.promotionsManagerProvider = provider19;
        this.appcMigrationManagerProvider = provider20;
        this.localNotificationSyncManagerProvider = provider21;
        this.appcPromotionNotificationStringProvider = provider22;
        this.dynamicSplitsManagerProvider = provider23;
        this.splitAnalyticsMapperProvider = provider24;
        this.appsFlyerManagerProvider = provider25;
        this.campaignManagerProvider = provider26;
    }

    public static FragmentModule_ProvidesAppViewManagerFactory create(FragmentModule fragmentModule, Provider<AppViewModelManager> provider, Provider<InstallManager> provider2, Provider<DownloadFactory> provider3, Provider<AppCenter> provider4, Provider<ReviewsManager> provider5, Provider<AdsManager> provider6, Provider<FlagManager> provider7, Provider<StoreUtilsProxy> provider8, Provider<AptoideAccountManager> provider9, Provider<DownloadStateParser> provider10, Provider<AppViewAnalytics> provider11, Provider<NotificationAnalytics> provider12, Provider<InstallAnalytics> provider13, Provider<Resources> provider14, Provider<WindowManager> provider15, Provider<String> provider16, Provider<AppCoinsManager> provider17, Provider<MoPubAdsManager> provider18, Provider<PromotionsManager> provider19, Provider<AppcMigrationManager> provider20, Provider<LocalNotificationSyncManager> provider21, Provider<AppcPromotionNotificationStringProvider> provider22, Provider<DynamicSplitsManager> provider23, Provider<SplitAnalyticsMapper> provider24, Provider<AppsFlyerManager> provider25, Provider<CampaignManager> provider26) {
        return new FragmentModule_ProvidesAppViewManagerFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26);
    }

    public static AppViewManager providesAppViewManager(FragmentModule fragmentModule, AppViewModelManager appViewModelManager, InstallManager installManager, DownloadFactory downloadFactory, AppCenter appCenter, ReviewsManager reviewsManager, AdsManager adsManager, FlagManager flagManager, StoreUtilsProxy storeUtilsProxy, AptoideAccountManager aptoideAccountManager, DownloadStateParser downloadStateParser, AppViewAnalytics appViewAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, Resources resources, WindowManager windowManager, String str, AppCoinsManager appCoinsManager, MoPubAdsManager moPubAdsManager, PromotionsManager promotionsManager, AppcMigrationManager appcMigrationManager, LocalNotificationSyncManager localNotificationSyncManager, AppcPromotionNotificationStringProvider appcPromotionNotificationStringProvider, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, AppsFlyerManager appsFlyerManager, CampaignManager campaignManager) {
        return (AppViewManager) C9055b.m29112c(fragmentModule.providesAppViewManager(appViewModelManager, installManager, downloadFactory, appCenter, reviewsManager, adsManager, flagManager, storeUtilsProxy, aptoideAccountManager, downloadStateParser, appViewAnalytics, notificationAnalytics, installAnalytics, resources, windowManager, str, appCoinsManager, moPubAdsManager, promotionsManager, appcMigrationManager, localNotificationSyncManager, appcPromotionNotificationStringProvider, dynamicSplitsManager, splitAnalyticsMapper, appsFlyerManager, campaignManager));
    }

    @Override // javax.inject.Provider
    public AppViewManager get() {
        return providesAppViewManager(this.module, this.appViewModelManagerProvider.get(), this.installManagerProvider.get(), this.downloadFactoryProvider.get(), this.appCenterProvider.get(), this.reviewsManagerProvider.get(), this.adsManagerProvider.get(), this.flagManagerProvider.get(), this.storeUtilsProxyProvider.get(), this.aptoideAccountManagerProvider.get(), this.downloadStateParserProvider.get(), this.appViewAnalyticsProvider.get(), this.notificationAnalyticsProvider.get(), this.installAnalyticsProvider.get(), this.resourcesProvider.get(), this.windowManagerProvider.get(), this.marketNameProvider.get(), this.appCoinsManagerProvider.get(), this.moPubAdsManagerProvider.get(), this.promotionsManagerProvider.get(), this.appcMigrationManagerProvider.get(), this.localNotificationSyncManagerProvider.get(), this.appcPromotionNotificationStringProvider.get(), this.dynamicSplitsManagerProvider.get(), this.splitAnalyticsMapperProvider.get(), this.appsFlyerManagerProvider.get(), this.campaignManagerProvider.get());
    }
}
