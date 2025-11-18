package cm.aptoide.p092pt.promotions;

import p456rx.Single;

/* loaded from: classes.dex */
public class ClaimPromotionsManager {
    private final String promotionId;
    private PromotionsManager promotionsManager;
    private final String unclaimedAppPackageName;

    public ClaimPromotionsManager(PromotionsManager promotionsManager, String str, String str2) {
        this.promotionsManager = promotionsManager;
        this.unclaimedAppPackageName = str;
        this.promotionId = str2;
    }

    public Single<ClaimStatusWrapper> claimPromotion() {
        PromotionsManager promotionsManager = this.promotionsManager;
        return promotionsManager.claimPromotion(promotionsManager.getWalletAddress(), this.unclaimedAppPackageName, this.promotionId);
    }

    public void saveWalletAddress(String str) {
        this.promotionsManager.saveWalletAddress(str);
    }
}
