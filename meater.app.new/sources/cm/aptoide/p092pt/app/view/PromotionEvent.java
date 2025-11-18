package cm.aptoide.p092pt.app.view;

import cm.aptoide.p092pt.promotions.Promotion;
import cm.aptoide.p092pt.promotions.WalletApp;

/* loaded from: classes.dex */
public class PromotionEvent {
    private ClickType clickType;
    private Promotion promotion;
    private WalletApp walletApp;

    enum ClickType {
        PAUSE_DOWNLOAD,
        CANCEL_DOWNLOAD,
        RESUME_DOWNLOAD,
        INSTALL_APP,
        DOWNLOAD,
        RETRY_DOWNLOAD,
        CLAIM,
        UPDATE,
        DOWNGRADE,
        DISMISS
    }

    public PromotionEvent(Promotion promotion, WalletApp walletApp, ClickType clickType) {
        this.walletApp = walletApp;
        this.clickType = clickType;
        this.promotion = promotion;
    }

    public ClickType getClickType() {
        return this.clickType;
    }

    public Promotion getPromotion() {
        return this.promotion;
    }

    public WalletApp getWallet() {
        return this.walletApp;
    }
}
