package cm.aptoide.p092pt.app.view;

import android.util.Pair;
import android.view.MenuItem;
import cm.aptoide.p092pt.app.AppModel;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.ReviewsViewModel;
import cm.aptoide.p092pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.p092pt.app.view.similar.SimilarAppClickEvent;
import cm.aptoide.p092pt.app.view.similar.SimilarAppsBundle;
import cm.aptoide.p092pt.appview.InstallAppView;
import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.promotions.Promotion;
import cm.aptoide.p092pt.promotions.WalletApp;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.app.DetailedAppRequestResult;
import cm.aptoide.p092pt.view.app.FlagsVote;
import java.util.List;
import p241e.p294g.p295a.p304c.C8980f;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface AppViewView extends InstallAppView {
    C11234e<String> apkfyDialogPositiveClick();

    C11234e<WalletApp> cancelPromotionDownload();

    C11234e<Promotion> claimAppClick();

    C11234e<Void> clickBonusAppcFlair();

    C11234e<Void> clickCatappultCard();

    C11234e<Void> clickDeveloperEmail();

    C11234e<Void> clickDeveloperPermissions();

    C11234e<Void> clickDeveloperPrivacy();

    C11234e<Void> clickDeveloperWebsite();

    C11234e<Void> clickErrorRetry();

    C11234e<FlagsVote.VoteType> clickFakeFlag();

    C11234e<Void> clickFollowStore();

    C11234e<Void> clickGetAppcInfo();

    C11234e<FlagsVote.VoteType> clickLicenseFlag();

    C11234e<Void> clickLoginSnack();

    C11234e<Void> clickOtherVersions();

    C11234e<Void> clickRateApp();

    C11234e<Void> clickRateAppLarge();

    C11234e<Void> clickRateAppLayout();

    C11234e<Void> clickReadAllReviews();

    C11234e<Void> clickReviewsLayout();

    C11234e<SimilarAppClickEvent> clickSimilarApp();

    C11234e<Void> clickStoreLayout();

    C11234e<MenuItem> clickToolbar();

    C11234e<Void> clickTrustedBadge();

    C11234e<FlagsVote.VoteType> clickVirusFlag();

    C11234e<FlagsVote.VoteType> clickWorkingFlag();

    C11234e<ReadMoreClickEvent> clickedReadMore();

    void defaultShare(String str, String str2);

    void disableFlags();

    C11234e<Promotion> dismissWalletPromotionClick();

    void dismissWalletPromotionView();

    void displayNotLoggedInSnack();

    void displayStoreFollowedSnack(String str);

    void enableFlags();

    void extractReferrer(SearchAdResult searchAdResult);

    String getLanguageFilter();

    C11234e<ScreenShotClickEvent> getScreenshotClickEvent();

    void handleError(DetailedAppRequestResult.Error error);

    void hideReviews();

    void hideSimilarApps();

    C11234e<Void> iabInfoClick();

    void incrementFlags(FlagsVote.VoteType voteType);

    C11234e<Pair<Promotion, WalletApp>> installWalletButtonClick();

    boolean isSimilarAppsVisible();

    void navigateToDeveloperEmail(AppModel appModel);

    void navigateToDeveloperPermissions(AppModel appModel);

    void navigateToDeveloperPrivacy(AppModel appModel);

    void navigateToDeveloperWebsite(AppModel appModel);

    C11234e<WalletApp> pausePromotionDownload();

    void populateReviews(ReviewsViewModel reviewsViewModel, AppModel appModel);

    void populateSimilar(List<SimilarAppsBundle> list);

    void recoverScrollViewState();

    C11234e<WalletApp> resumePromotionDownload();

    void scrollReviews(Integer num);

    C11234e<Integer> scrollReviewsResponse();

    C11234e<C8980f> scrollVisibleSimilarApps();

    void setFollowButton(boolean z);

    void setInstallButton(AppCoinsViewModel appCoinsViewModel);

    void setupAppcAppView(boolean z, BonusAppcModel bonusAppcModel);

    void showApkfyElement(String str);

    void showAppView(AppModel appModel);

    void showAppcWalletPromotionView(Promotion promotion, WalletApp walletApp, Promotion.ClaimAction claimAction, DownloadModel downloadModel);

    void showDownloadError(DownloadModel downloadModel);

    void showDownloadingSimilarApps(boolean z);

    void showFlagVoteSubmittedMessage();

    void showLoading();

    C11234e<Void> showOpenAndInstallApkFyDialog(String str, String str2, double d2, float f2, String str3, int i2);

    C11234e<Void> showOpenAndInstallDialog(String str, String str2);

    C11234e<GenericDialogs.EResponse> showRateDialog(String str, String str2, String str3);

    void showShareOnTvDialog(long j2);

    void showTrustedDialog(AppModel appModel);

    C11234e<Boolean> similarAppsVisibilityFromInstallClick();
}
