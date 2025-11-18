package cm.aptoide.p092pt.promotions;

/* loaded from: classes.dex */
public class PromotionAppClick {
    private PromotionViewApp app;
    private ClickType clickType;

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
        NAVIGATE
    }

    public PromotionAppClick(PromotionViewApp promotionViewApp, ClickType clickType) {
        this.app = promotionViewApp;
        this.clickType = clickType;
    }

    public PromotionViewApp getApp() {
        return this.app;
    }

    public ClickType getClickType() {
        return this.clickType;
    }
}
