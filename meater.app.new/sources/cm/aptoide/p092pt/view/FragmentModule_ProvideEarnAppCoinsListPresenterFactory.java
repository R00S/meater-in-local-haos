package cm.aptoide.p092pt.view;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListAnalytics;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListConfiguration;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListManager;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListPresenter;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcNavigator;
import cm.aptoide.p092pt.repository.request.RewardAppCoinsAppsRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideEarnAppCoinsListPresenterFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<EarnAppcListAnalytics> earnAppcListAnalyticsProvider;
    private final Provider<EarnAppcListConfiguration> earnAppcListConfigurationProvider;
    private final Provider<EarnAppcListManager> earnAppcListManagerProvider;
    private final Provider<EarnAppcNavigator> earnAppcNavigatorProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<RewardAppCoinsAppsRepository> rewardAppCoinsAppsRepositoryProvider;

    public FragmentModule_ProvideEarnAppCoinsListPresenterFactory(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<RewardAppCoinsAppsRepository> provider2, Provider<AnalyticsManager> provider3, Provider<AppNavigator> provider4, Provider<EarnAppcListConfiguration> provider5, Provider<EarnAppcListManager> provider6, Provider<MoPubAdsManager> provider7, Provider<EarnAppcListAnalytics> provider8, Provider<EarnAppcNavigator> provider9) {
        this.module = fragmentModule;
        this.crashReportProvider = provider;
        this.rewardAppCoinsAppsRepositoryProvider = provider2;
        this.analyticsManagerProvider = provider3;
        this.appNavigatorProvider = provider4;
        this.earnAppcListConfigurationProvider = provider5;
        this.earnAppcListManagerProvider = provider6;
        this.moPubAdsManagerProvider = provider7;
        this.earnAppcListAnalyticsProvider = provider8;
        this.earnAppcNavigatorProvider = provider9;
    }

    public static FragmentModule_ProvideEarnAppCoinsListPresenterFactory create(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<RewardAppCoinsAppsRepository> provider2, Provider<AnalyticsManager> provider3, Provider<AppNavigator> provider4, Provider<EarnAppcListConfiguration> provider5, Provider<EarnAppcListManager> provider6, Provider<MoPubAdsManager> provider7, Provider<EarnAppcListAnalytics> provider8, Provider<EarnAppcNavigator> provider9) {
        return new FragmentModule_ProvideEarnAppCoinsListPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static EarnAppcListPresenter provideEarnAppCoinsListPresenter(FragmentModule fragmentModule, CrashReport crashReport, RewardAppCoinsAppsRepository rewardAppCoinsAppsRepository, AnalyticsManager analyticsManager, AppNavigator appNavigator, EarnAppcListConfiguration earnAppcListConfiguration, EarnAppcListManager earnAppcListManager, MoPubAdsManager moPubAdsManager, EarnAppcListAnalytics earnAppcListAnalytics, EarnAppcNavigator earnAppcNavigator) {
        return (EarnAppcListPresenter) C9055b.m29112c(fragmentModule.provideEarnAppCoinsListPresenter(crashReport, rewardAppCoinsAppsRepository, analyticsManager, appNavigator, earnAppcListConfiguration, earnAppcListManager, moPubAdsManager, earnAppcListAnalytics, earnAppcNavigator));
    }

    @Override // javax.inject.Provider
    public EarnAppcListPresenter get() {
        return provideEarnAppCoinsListPresenter(this.module, this.crashReportProvider.get(), this.rewardAppCoinsAppsRepositoryProvider.get(), this.analyticsManagerProvider.get(), this.appNavigatorProvider.get(), this.earnAppcListConfigurationProvider.get(), this.earnAppcListManagerProvider.get(), this.moPubAdsManagerProvider.get(), this.earnAppcListAnalyticsProvider.get(), this.earnAppcNavigatorProvider.get());
    }
}
