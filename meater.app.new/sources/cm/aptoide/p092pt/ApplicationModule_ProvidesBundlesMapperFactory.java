package cm.aptoide.p092pt;

import cm.aptoide.p092pt.ads.WalletAdsOfferCardManager;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.blacklist.BlacklistManager;
import cm.aptoide.p092pt.home.AppComingSoonRegistrationManager;
import cm.aptoide.p092pt.home.bundles.BundlesResponseMapper;
import cm.aptoide.p092pt.install.InstallManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesBundlesMapperFactory implements Provider {
    private final Provider<AppComingSoonRegistrationManager> appComingSoonRegistrationManagerProvider;
    private final Provider<BlacklistManager> blacklistManagerProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final ApplicationModule module;
    private final Provider<WalletAdsOfferCardManager> walletAdsOfferCardManagerProvider;

    public ApplicationModule_ProvidesBundlesMapperFactory(ApplicationModule applicationModule, Provider<InstallManager> provider, Provider<WalletAdsOfferCardManager> provider2, Provider<BlacklistManager> provider3, Provider<DownloadStateParser> provider4, Provider<AppComingSoonRegistrationManager> provider5) {
        this.module = applicationModule;
        this.installManagerProvider = provider;
        this.walletAdsOfferCardManagerProvider = provider2;
        this.blacklistManagerProvider = provider3;
        this.downloadStateParserProvider = provider4;
        this.appComingSoonRegistrationManagerProvider = provider5;
    }

    public static ApplicationModule_ProvidesBundlesMapperFactory create(ApplicationModule applicationModule, Provider<InstallManager> provider, Provider<WalletAdsOfferCardManager> provider2, Provider<BlacklistManager> provider3, Provider<DownloadStateParser> provider4, Provider<AppComingSoonRegistrationManager> provider5) {
        return new ApplicationModule_ProvidesBundlesMapperFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static BundlesResponseMapper providesBundlesMapper(ApplicationModule applicationModule, InstallManager installManager, WalletAdsOfferCardManager walletAdsOfferCardManager, BlacklistManager blacklistManager, DownloadStateParser downloadStateParser, AppComingSoonRegistrationManager appComingSoonRegistrationManager) {
        return (BundlesResponseMapper) C9055b.m29112c(applicationModule.providesBundlesMapper(installManager, walletAdsOfferCardManager, blacklistManager, downloadStateParser, appComingSoonRegistrationManager));
    }

    @Override // javax.inject.Provider
    public BundlesResponseMapper get() {
        return providesBundlesMapper(this.module, this.installManagerProvider.get(), this.walletAdsOfferCardManagerProvider.get(), this.blacklistManagerProvider.get(), this.downloadStateParserProvider.get(), this.appComingSoonRegistrationManagerProvider.get());
    }
}
