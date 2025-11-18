package cm.aptoide.p092pt.promotions;

import cm.aptoide.p092pt.presenter.View;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface PromotionsView extends View {
    C11234e<PromotionAppClick> appCardClick();

    C11234e<PromotionViewApp> cancelDownload();

    C11234e<PromotionViewApp> claimAppClick();

    C11234e<PromotionViewApp> installButtonClick();

    void lockPromotionApps(boolean z);

    C11234e<PromotionViewApp> pauseDownload();

    C11234e<Void> promotionOverDialogClick();

    C11234e<PromotionViewApp> resumeDownload();

    C11234e<Void> retryClicked();

    void setPromotionMessage(String str);

    void showDownloadError(PromotionViewApp promotionViewApp);

    void showErrorView();

    void showLoading();

    void showPromotionApp(PromotionViewApp promotionViewApp, boolean z);

    void showPromotionFeatureGraphic(String str);

    void showPromotionOverDialog();

    void showPromotionTitle(String str);

    C11234e<Boolean> showRootInstallWarningPopup();

    void updateClaimStatus(String str);
}
