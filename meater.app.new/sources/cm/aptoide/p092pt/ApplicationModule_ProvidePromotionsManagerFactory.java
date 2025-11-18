package cm.aptoide.p092pt;

import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.promotions.PromotionViewAppMapper;
import cm.aptoide.p092pt.promotions.PromotionsAnalytics;
import cm.aptoide.p092pt.promotions.PromotionsManager;
import cm.aptoide.p092pt.promotions.PromotionsService;
import cm.aptoide.p092pt.wallet.WalletAppProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidePromotionsManagerFactory implements Provider {
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<DynamicSplitsManager> dynamicSplitsManagerProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NotificationAnalytics> notificationAnalyticsProvider;
    private final Provider<PromotionViewAppMapper> promotionViewAppMapperProvider;
    private final Provider<PromotionsAnalytics> promotionsAnalyticsProvider;
    private final Provider<PromotionsService> promotionsServiceProvider;
    private final Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;
    private final Provider<WalletAppProvider> walletAppProvider;

    public ApplicationModule_ProvidePromotionsManagerFactory(ApplicationModule applicationModule, Provider<InstallManager> provider, Provider<PromotionViewAppMapper> provider2, Provider<DownloadFactory> provider3, Provider<DownloadStateParser> provider4, Provider<PromotionsAnalytics> provider5, Provider<NotificationAnalytics> provider6, Provider<InstallAnalytics> provider7, Provider<PromotionsService> provider8, Provider<AptoideInstalledAppsRepository> provider9, Provider<MoPubAdsManager> provider10, Provider<WalletAppProvider> provider11, Provider<DynamicSplitsManager> provider12, Provider<SplitAnalyticsMapper> provider13) {
        this.module = applicationModule;
        this.installManagerProvider = provider;
        this.promotionViewAppMapperProvider = provider2;
        this.downloadFactoryProvider = provider3;
        this.downloadStateParserProvider = provider4;
        this.promotionsAnalyticsProvider = provider5;
        this.notificationAnalyticsProvider = provider6;
        this.installAnalyticsProvider = provider7;
        this.promotionsServiceProvider = provider8;
        this.aptoideInstalledAppsRepositoryProvider = provider9;
        this.moPubAdsManagerProvider = provider10;
        this.walletAppProvider = provider11;
        this.dynamicSplitsManagerProvider = provider12;
        this.splitAnalyticsMapperProvider = provider13;
    }

    public static ApplicationModule_ProvidePromotionsManagerFactory create(ApplicationModule applicationModule, Provider<InstallManager> provider, Provider<PromotionViewAppMapper> provider2, Provider<DownloadFactory> provider3, Provider<DownloadStateParser> provider4, Provider<PromotionsAnalytics> provider5, Provider<NotificationAnalytics> provider6, Provider<InstallAnalytics> provider7, Provider<PromotionsService> provider8, Provider<AptoideInstalledAppsRepository> provider9, Provider<MoPubAdsManager> provider10, Provider<WalletAppProvider> provider11, Provider<DynamicSplitsManager> provider12, Provider<SplitAnalyticsMapper> provider13) {
        return new ApplicationModule_ProvidePromotionsManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static PromotionsManager providePromotionsManager(ApplicationModule applicationModule, InstallManager installManager, PromotionViewAppMapper promotionViewAppMapper, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, PromotionsAnalytics promotionsAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, PromotionsService promotionsService, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, MoPubAdsManager moPubAdsManager, WalletAppProvider walletAppProvider, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper) {
        return (PromotionsManager) C9055b.m29112c(applicationModule.providePromotionsManager(installManager, promotionViewAppMapper, downloadFactory, downloadStateParser, promotionsAnalytics, notificationAnalytics, installAnalytics, promotionsService, aptoideInstalledAppsRepository, moPubAdsManager, walletAppProvider, dynamicSplitsManager, splitAnalyticsMapper));
    }

    @Override // javax.inject.Provider
    public PromotionsManager get() {
        return providePromotionsManager(this.module, this.installManagerProvider.get(), this.promotionViewAppMapperProvider.get(), this.downloadFactoryProvider.get(), this.downloadStateParserProvider.get(), this.promotionsAnalyticsProvider.get(), this.notificationAnalyticsProvider.get(), this.installAnalyticsProvider.get(), this.promotionsServiceProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get(), this.moPubAdsManagerProvider.get(), this.walletAppProvider.get(), this.dynamicSplitsManagerProvider.get(), this.splitAnalyticsMapperProvider.get());
    }
}
