package cm.aptoide.p092pt;

import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.ads.WalletAdsOfferManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesMoPubAdsManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<WalletAdsOfferManager> walletAdsOfferManagerProvider;

    public ApplicationModule_ProvidesMoPubAdsManagerFactory(ApplicationModule applicationModule, Provider<WalletAdsOfferManager> provider) {
        this.module = applicationModule;
        this.walletAdsOfferManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesMoPubAdsManagerFactory create(ApplicationModule applicationModule, Provider<WalletAdsOfferManager> provider) {
        return new ApplicationModule_ProvidesMoPubAdsManagerFactory(applicationModule, provider);
    }

    public static MoPubAdsManager providesMoPubAdsManager(ApplicationModule applicationModule, WalletAdsOfferManager walletAdsOfferManager) {
        return (MoPubAdsManager) C9055b.m29112c(applicationModule.providesMoPubAdsManager(walletAdsOfferManager));
    }

    @Override // javax.inject.Provider
    public MoPubAdsManager get() {
        return providesMoPubAdsManager(this.module, this.walletAdsOfferManagerProvider.get());
    }
}
