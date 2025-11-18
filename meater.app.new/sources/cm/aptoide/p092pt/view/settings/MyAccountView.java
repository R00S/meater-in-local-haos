package cm.aptoide.p092pt.view.settings;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStore;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface MyAccountView extends View {
    C11234e<Void> aptoideBackupCardViewClick();

    C11234e<Void> aptoideTvCardViewClick();

    C11234e<Void> aptoideUploaderCardViewClick();

    C11234e<Void> createStoreClick();

    C11234e<Void> editStoreClick();

    C11234e<Void> editUserProfileClick();

    C11234e<GetStore> getStore();

    C11234e<Void> loginClick();

    void refreshUI(Store store);

    C11234e<Void> settingsClicked();

    void showAccount(Account account);

    void showLoginAccountDisplayable();

    C11234e<Void> signOutClick();

    C11234e<SocialMediaView.SocialMediaType> socialMediaClick();

    void startAptoideTvWebView();

    C11234e<Void> storeClick();

    C11234e<Void> userClick();
}
