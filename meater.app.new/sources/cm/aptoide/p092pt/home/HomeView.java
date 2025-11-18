package cm.aptoide.p092pt.home;

import cm.aptoide.p092pt.home.apps.BundleView;
import cm.aptoide.p092pt.home.bundles.HomeBundlesModel;
import cm.aptoide.p092pt.home.bundles.base.AppComingSoonPromotionalBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialHomeEvent;
import cm.aptoide.p092pt.reactions.ReactionsHomeEvent;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface HomeView extends BundleView {
    C11234e<HomeEvent> cancelNotifyMeClicked();

    C11234e<HomeEvent> dismissBundleClicked();

    C11234e<EditorialHomeEvent> editorialCardClicked();

    void hideBundle(int i2);

    C11234e<Void> imageClick();

    C11234e<HomeEvent> infoBundleKnowMoreClicked();

    C11234e<HomeEvent> notifyMeClicked();

    C11234e<HomeEvent> onLoadMoreRetryClicked();

    C11234e<EditorialHomeEvent> reactionButtonLongPress();

    C11234e<ReactionsHomeEvent> reactionClicked();

    C11234e<EditorialHomeEvent> reactionsButtonClicked();

    void removeLoadMoreError();

    void scrollToTop();

    void sendDeeplinkToWalletAppView(String str);

    void setAdsTest(boolean z);

    void setUserImage(String str);

    void showBundlesSkeleton(HomeBundlesModel homeBundlesModel);

    void showConsentDialog();

    void showGenericErrorToast();

    void showLoadMoreError();

    void showLogInDialog();

    void showNetworkErrorToast();

    void showReactionsPopup(String str, String str2, int i2);

    C11234e<Void> snackLogInClick();

    void updateAppComingSoonStatus(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle, boolean z);

    C11234e<HomeEvent> walletOfferCardInstallWalletClick();
}
