package cm.aptoide.p092pt.ads;

import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.blacklist.BlacklistManager;
import cm.aptoide.p092pt.install.PackageRepository;

/* loaded from: classes.dex */
public class WalletAdsOfferCardManager {
    private final BlacklistManager blacklistManager;
    private final PackageRepository packageRepository;

    public WalletAdsOfferCardManager(BlacklistManager blacklistManager, PackageRepository packageRepository) {
        this.blacklistManager = blacklistManager;
        this.packageRepository = packageRepository;
    }

    public boolean shouldShowWalletOfferCard(String str, String str2) {
        return (this.blacklistManager.isBlacklisted(str, str2) || this.packageRepository.isAppInstalled(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME)) ? false : true;
    }
}
