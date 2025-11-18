package cm.aptoide.p092pt.ads;

import cm.aptoide.p092pt.ads.WalletAdsOfferManager;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class MoPubAdsManager {
    private final WalletAdsOfferManager walletAdsOfferManager;

    public MoPubAdsManager(WalletAdsOfferManager walletAdsOfferManager) {
        this.walletAdsOfferManager = walletAdsOfferManager;
    }

    static /* synthetic */ Single lambda$getAdsVisibilityStatus$0(Boolean bool) {
        return bool.booleanValue() ? Single.m39913m(WalletAdsOfferManager.OfferResponseStatus.NO_ADS) : Single.m39913m(WalletAdsOfferManager.OfferResponseStatus.ADS_HIDE);
    }

    public Single<WalletAdsOfferManager.OfferResponseStatus> getAdsVisibilityStatus() {
        return shouldRequestAds().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return MoPubAdsManager.lambda$getAdsVisibilityStatus$0((Boolean) obj);
            }
        });
    }

    public Single<Boolean> shouldRequestAds() {
        return this.walletAdsOfferManager.shouldRequestMoPubAd();
    }
}
