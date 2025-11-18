package cm.aptoide.p092pt.home;

import cm.aptoide.p092pt.home.HomeContainerFragment;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface HomeContainerView extends View {
    C11234e<Boolean> appsChipClicked();

    void dismissPromotionsDialog();

    void expandChips();

    C11234e<Boolean> gamesChipClicked();

    C11234e<String> gdprDialogClicked();

    void hidePromotionsIcon();

    C11234e<HomeContainerFragment.ChipsEvents> isChipChecked();

    C11234e<String> promotionsHomeDialogClicked();

    void setDefaultUserImage();

    void setUserImage(String str);

    void showAvatar();

    void showPromotionsHomeDialog(HomePromotionsWrapper homePromotionsWrapper);

    void showPromotionsHomeIcon(HomePromotionsWrapper homePromotionsWrapper);

    void showTermsAndConditionsDialog();

    C11234e<Void> toolbarPromotionsClick();

    C11234e<Void> toolbarUserClick();

    void uncheckChips();
}
