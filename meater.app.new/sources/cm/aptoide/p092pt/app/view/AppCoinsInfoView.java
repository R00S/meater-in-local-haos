package cm.aptoide.p092pt.app.view;

import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.editorial.ScrollEvent;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface AppCoinsInfoView extends View {
    void addBottomCardAnimation();

    C11234e<Void> appCoinsWalletLinkClick();

    C11234e<ScrollEvent> appItemVisibilityChanged();

    C11234e<Void> cardViewClick();

    C11234e<Void> catappultButtonClick();

    C11234e<Void> installButtonClick();

    void openApp(String str);

    void removeBottomCardAnimation();

    void setBonusAppc(int i2);

    void setButtonText(boolean z);

    void setNoBonusAppcView();

    C11234e<SocialMediaView.SocialMediaType> socialMediaClick();
}
