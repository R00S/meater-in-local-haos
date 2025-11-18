package cm.aptoide.p092pt.editorial;

import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.editorial.EditorialViewModel;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.reactions.ReactionEvent;
import cm.aptoide.p092pt.reactions.data.TopReaction;
import java.util.List;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface EditorialView extends View {
    C11234e<EditorialEvent> actionButtonClicked();

    void addBottomCardAnimation();

    C11234e<EditorialEvent> appCardClicked(EditorialViewModel editorialViewModel);

    C11234e<EditorialDownloadEvent> cancelDownload(EditorialViewModel editorialViewModel);

    String getAction();

    C11234e<Boolean> handleMovingCollapse();

    void hideLoading();

    C11234e<EditorialDownloadEvent> installButtonClick(EditorialViewModel editorialViewModel);

    C11234e<Void> isViewReady();

    void manageMediaListDescriptionAnimationVisibility(EditorialEvent editorialEvent);

    void managePlaceHolderVisibity();

    C11234e<EditorialEvent> mediaContentClicked();

    C11234e<EditorialEvent> mediaListDescriptionChanged();

    void openApp(String str);

    C11234e<EditorialDownloadEvent> pauseDownload(EditorialViewModel editorialViewModel);

    C11234e<ScrollEvent> placeHolderVisibilityChange();

    void populateView(EditorialViewModel editorialViewModel);

    C11234e<ReactionEvent> reactionClicked();

    C11234e<Void> reactionsButtonClicked();

    C11234e<Void> reactionsButtonLongPressed();

    void removeBottomCardAnimation();

    C11234e<EditorialDownloadEvent> resumeDownload(EditorialViewModel editorialViewModel);

    C11234e<Void> retryClicked();

    void setMediaListDescriptionsVisible(EditorialEvent editorialEvent);

    void setUserReaction(String str);

    C11234e<Boolean> showDowngradeMessage();

    void showDowngradingMessage();

    void showDownloadError(EditorialDownloadModel editorialDownloadModel);

    void showDownloadModel(EditorialDownloadModel editorialDownloadModel);

    void showError(EditorialViewModel.Error error);

    void showGenericErrorToast();

    void showLoading();

    void showLoginDialog();

    void showNetworkErrorToast();

    void showReactionsPopup(String str, String str2);

    C11234e<Boolean> showRootInstallWarningPopup();

    void showTopReactions(String str, List<TopReaction> list, int i2);

    C11234e<Void> snackLoginClick();

    C11234e<SocialMediaView.SocialMediaType> socialMediaClick();
}
