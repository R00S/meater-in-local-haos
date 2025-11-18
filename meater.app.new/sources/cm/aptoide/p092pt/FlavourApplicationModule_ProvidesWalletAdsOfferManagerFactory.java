package cm.aptoide.p092pt;

import cm.aptoide.p092pt.ads.WalletAdsOfferManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FlavourApplicationModule_ProvidesWalletAdsOfferManagerFactory implements Provider {
    private final FlavourApplicationModule module;

    public FlavourApplicationModule_ProvidesWalletAdsOfferManagerFactory(FlavourApplicationModule flavourApplicationModule) {
        this.module = flavourApplicationModule;
    }

    public static FlavourApplicationModule_ProvidesWalletAdsOfferManagerFactory create(FlavourApplicationModule flavourApplicationModule) {
        return new FlavourApplicationModule_ProvidesWalletAdsOfferManagerFactory(flavourApplicationModule);
    }

    public static WalletAdsOfferManager providesWalletAdsOfferManager(FlavourApplicationModule flavourApplicationModule) {
        return (WalletAdsOfferManager) C9055b.m29112c(flavourApplicationModule.providesWalletAdsOfferManager());
    }

    @Override // javax.inject.Provider
    public WalletAdsOfferManager get() {
        return providesWalletAdsOfferManager(this.module);
    }
}
