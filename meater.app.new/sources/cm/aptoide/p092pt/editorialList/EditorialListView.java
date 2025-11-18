package cm.aptoide.p092pt.editorialList;

import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialHomeEvent;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.reactions.ReactionsHomeEvent;
import java.util.List;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface EditorialListView extends View {
    C11234e<EditorialHomeEvent> editorialCardClicked();

    void hideLoadMore();

    void hideLoading();

    void hideRefresh();

    C11234e<Void> imageClick();

    C11234e<EditorialHomeEvent> onPopupDismiss();

    void populateView(List<CurationCard> list, BonusAppcModel bonusAppcModel);

    C11234e<Object> reachesBottom();

    C11234e<EditorialHomeEvent> reactionButtonLongPress();

    C11234e<ReactionsHomeEvent> reactionClicked();

    C11234e<EditorialHomeEvent> reactionsButtonClicked();

    C11234e<Void> refreshes();

    C11234e<Void> retryClicked();

    void setDefaultUserImage();

    void setScrollEnabled(Boolean bool);

    void setUserImage(String str);

    void showAvatar();

    void showGenericError();

    void showGenericErrorToast();

    void showLoadMore();

    void showLoading();

    void showLogInDialog();

    void showNetworkError();

    void showNetworkErrorToast();

    void showReactionsPopup(String str, String str2, int i2);

    C11234e<Void> snackLogInClick();

    void update(List<CurationCard> list);

    void updateEditorialCard(CurationCard curationCard);

    C11234e<EditorialListEvent> visibleCards();
}
