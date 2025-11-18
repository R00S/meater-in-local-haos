package cm.aptoide.p092pt;

import cm.aptoide.p092pt.ads.WalletAdsOfferCardManager;
import cm.aptoide.p092pt.blacklist.BlacklistManager;
import cm.aptoide.p092pt.install.PackageRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* renamed from: cm.aptoide.pt.FlavourApplicationModule_ProvidesWalletAdsOfferCardManagerFactory */
/* loaded from: classes.dex */
public final class C1145x7d1c8138 implements Provider {
    private final Provider<BlacklistManager> blacklistManagerProvider;
    private final FlavourApplicationModule module;
    private final Provider<PackageRepository> packageRepositoryProvider;

    public C1145x7d1c8138(FlavourApplicationModule flavourApplicationModule, Provider<BlacklistManager> provider, Provider<PackageRepository> provider2) {
        this.module = flavourApplicationModule;
        this.blacklistManagerProvider = provider;
        this.packageRepositoryProvider = provider2;
    }

    public static C1145x7d1c8138 create(FlavourApplicationModule flavourApplicationModule, Provider<BlacklistManager> provider, Provider<PackageRepository> provider2) {
        return new C1145x7d1c8138(flavourApplicationModule, provider, provider2);
    }

    public static WalletAdsOfferCardManager providesWalletAdsOfferCardManager(FlavourApplicationModule flavourApplicationModule, BlacklistManager blacklistManager, PackageRepository packageRepository) {
        return (WalletAdsOfferCardManager) C9055b.m29112c(flavourApplicationModule.providesWalletAdsOfferCardManager(blacklistManager, packageRepository));
    }

    @Override // javax.inject.Provider
    public WalletAdsOfferCardManager get() {
        return providesWalletAdsOfferCardManager(this.module, this.blacklistManagerProvider.get(), this.packageRepositoryProvider.get());
    }
}
