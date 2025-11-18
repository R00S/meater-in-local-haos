package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.install.AppInstallerStatusReceiver;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.wallet.WalletAppProvider;
import cm.aptoide.p092pt.wallet.WalletInstallAnalytics;
import cm.aptoide.p092pt.wallet.WalletInstallManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesWalletInstallManagerFactory implements Provider {
    private final Provider<AppInstallerStatusReceiver> appInstallerStatusReceiverProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<DynamicSplitsManager> dynamicSplitsManagerProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final ActivityModule module;
    private final Provider<WalletAppProvider> walletAppProvider;
    private final Provider<WalletInstallAnalytics> walletInstallAnalyticsProvider;

    public ActivityModule_ProvidesWalletInstallManagerFactory(ActivityModule activityModule, Provider<InstallManager> provider, Provider<DownloadFactory> provider2, Provider<DownloadStateParser> provider3, Provider<MoPubAdsManager> provider4, Provider<WalletInstallAnalytics> provider5, Provider<AptoideInstalledAppsRepository> provider6, Provider<WalletAppProvider> provider7, Provider<AppInstallerStatusReceiver> provider8, Provider<DynamicSplitsManager> provider9) {
        this.module = activityModule;
        this.installManagerProvider = provider;
        this.downloadFactoryProvider = provider2;
        this.downloadStateParserProvider = provider3;
        this.moPubAdsManagerProvider = provider4;
        this.walletInstallAnalyticsProvider = provider5;
        this.aptoideInstalledAppsRepositoryProvider = provider6;
        this.walletAppProvider = provider7;
        this.appInstallerStatusReceiverProvider = provider8;
        this.dynamicSplitsManagerProvider = provider9;
    }

    public static ActivityModule_ProvidesWalletInstallManagerFactory create(ActivityModule activityModule, Provider<InstallManager> provider, Provider<DownloadFactory> provider2, Provider<DownloadStateParser> provider3, Provider<MoPubAdsManager> provider4, Provider<WalletInstallAnalytics> provider5, Provider<AptoideInstalledAppsRepository> provider6, Provider<WalletAppProvider> provider7, Provider<AppInstallerStatusReceiver> provider8, Provider<DynamicSplitsManager> provider9) {
        return new ActivityModule_ProvidesWalletInstallManagerFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static WalletInstallManager providesWalletInstallManager(ActivityModule activityModule, InstallManager installManager, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, MoPubAdsManager moPubAdsManager, WalletInstallAnalytics walletInstallAnalytics, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, WalletAppProvider walletAppProvider, AppInstallerStatusReceiver appInstallerStatusReceiver, DynamicSplitsManager dynamicSplitsManager) {
        return (WalletInstallManager) C9055b.m29112c(activityModule.providesWalletInstallManager(installManager, downloadFactory, downloadStateParser, moPubAdsManager, walletInstallAnalytics, aptoideInstalledAppsRepository, walletAppProvider, appInstallerStatusReceiver, dynamicSplitsManager));
    }

    @Override // javax.inject.Provider
    public WalletInstallManager get() {
        return providesWalletInstallManager(this.module, this.installManagerProvider.get(), this.downloadFactoryProvider.get(), this.downloadStateParserProvider.get(), this.moPubAdsManagerProvider.get(), this.walletInstallAnalyticsProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get(), this.walletAppProvider.get(), this.appInstallerStatusReceiverProvider.get(), this.dynamicSplitsManagerProvider.get());
    }
}
