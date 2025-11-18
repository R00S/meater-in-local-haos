package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.LoginSignUpCredentialsFragment;
import cm.aptoide.p092pt.account.view.magiclink.CheckYourEmailFragment;
import cm.aptoide.p092pt.account.view.store.ManageStoreFragment;
import cm.aptoide.p092pt.account.view.user.ManageUserFragment;
import cm.aptoide.p092pt.account.view.user.ProfileStepOneFragment;
import cm.aptoide.p092pt.account.view.user.ProfileStepTwoFragment;
import cm.aptoide.p092pt.app.view.AppCoinsInfoFragment;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.app.view.MoreBundleFragment;
import cm.aptoide.p092pt.app.view.OtherVersionsFragment;
import cm.aptoide.p092pt.autoupdate.AutoUpdateDialogFragment;
import cm.aptoide.p092pt.comments.view.CommentDialogFragment;
import cm.aptoide.p092pt.comments.view.CommentListFragment;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogFragment;
import cm.aptoide.p092pt.editorial.EditorialFragment;
import cm.aptoide.p092pt.editorialList.EditorialListFragment;
import cm.aptoide.p092pt.home.HomeContainerFragment;
import cm.aptoide.p092pt.home.HomeFragment;
import cm.aptoide.p092pt.home.apps.AppsFragment;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListFragment;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreFragment;
import cm.aptoide.p092pt.notification.view.InboxFragment;
import cm.aptoide.p092pt.promotions.ClaimPromotionDialogFragment;
import cm.aptoide.p092pt.promotions.PromotionsFragment;
import cm.aptoide.p092pt.reviews.LatestReviewsFragment;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import cm.aptoide.p092pt.search.view.SearchResultFragment;
import cm.aptoide.p092pt.store.view.AddStoreDialog;
import cm.aptoide.p092pt.store.view.ListStoresFragment;
import cm.aptoide.p092pt.store.view.PrivateStoreDialog;
import cm.aptoide.p092pt.store.view.StoreFragment;
import cm.aptoide.p092pt.store.view.StoreTabWidgetsGridRecyclerFragment;
import cm.aptoide.p092pt.store.view.TopStoresFragment;
import cm.aptoide.p092pt.store.view.p104my.MyStoresFragment;
import cm.aptoide.p092pt.store.view.p104my.MyStoresSubscribedFragment;
import cm.aptoide.p092pt.store.view.recommended.RecommendedStoresFragment;
import cm.aptoide.p092pt.themes.NewFeatureDialogFragment;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowersFragment;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowingFragment;
import cm.aptoide.p092pt.updates.view.excluded.ExcludedUpdatesFragment;
import cm.aptoide.p092pt.view.app.ListStoreAppsFragment;
import cm.aptoide.p092pt.view.feedback.SendFeedbackFragment;
import cm.aptoide.p092pt.view.fragment.DescriptionFragment;
import cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeWithToolbarFragment;
import cm.aptoide.p092pt.view.settings.MyAccountFragment;
import cm.aptoide.p092pt.view.settings.SettingsFragment;
import cm.aptoide.p092pt.view.wizard.WizardFragment;
import cm.aptoide.p092pt.view.wizard.WizardFragmentProvider;
import cm.aptoide.p092pt.view.wizard.WizardPageTwoFragment;

@FragmentScope
/* loaded from: classes.dex */
public interface FragmentComponent {
    void inject(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment);

    void inject(CheckYourEmailFragment checkYourEmailFragment);

    void inject(ManageStoreFragment manageStoreFragment);

    void inject(ManageUserFragment manageUserFragment);

    void inject(ProfileStepOneFragment profileStepOneFragment);

    void inject(ProfileStepTwoFragment profileStepTwoFragment);

    void inject(AppCoinsInfoFragment appCoinsInfoFragment);

    void inject(AppViewFragment appViewFragment);

    void inject(MoreBundleFragment moreBundleFragment);

    void inject(OtherVersionsFragment otherVersionsFragment);

    void inject(AutoUpdateDialogFragment autoUpdateDialogFragment);

    void inject(CommentDialogFragment commentDialogFragment);

    void inject(CommentListFragment commentListFragment);

    void inject(OutOfSpaceDialogFragment outOfSpaceDialogFragment);

    void inject(EditorialFragment editorialFragment);

    void inject(EditorialListFragment editorialListFragment);

    void inject(HomeContainerFragment homeContainerFragment);

    void inject(HomeFragment homeFragment);

    void inject(AppsFragment appsFragment);

    void inject(EarnAppcListFragment earnAppcListFragment);

    void inject(ListAppsMoreFragment listAppsMoreFragment);

    void inject(InboxFragment inboxFragment);

    void inject(ClaimPromotionDialogFragment claimPromotionDialogFragment);

    void inject(PromotionsFragment promotionsFragment);

    void inject(LatestReviewsFragment latestReviewsFragment);

    void inject(RateAndReviewsFragment rateAndReviewsFragment);

    void inject(SearchResultFragment searchResultFragment);

    void inject(AddStoreDialog addStoreDialog);

    void inject(ListStoresFragment listStoresFragment);

    void inject(PrivateStoreDialog privateStoreDialog);

    void inject(StoreFragment storeFragment);

    void inject(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment);

    void inject(TopStoresFragment topStoresFragment);

    void inject(MyStoresFragment myStoresFragment);

    void inject(MyStoresSubscribedFragment myStoresSubscribedFragment);

    void inject(RecommendedStoresFragment recommendedStoresFragment);

    void inject(NewFeatureDialogFragment newFeatureDialogFragment);

    void inject(TimeLineFollowersFragment timeLineFollowersFragment);

    void inject(TimeLineFollowingFragment timeLineFollowingFragment);

    void inject(ExcludedUpdatesFragment excludedUpdatesFragment);

    void inject(ListStoreAppsFragment listStoreAppsFragment);

    void inject(SendFeedbackFragment sendFeedbackFragment);

    void inject(DescriptionFragment descriptionFragment);

    void inject(GridRecyclerSwipeWithToolbarFragment gridRecyclerSwipeWithToolbarFragment);

    void inject(MyAccountFragment myAccountFragment);

    void inject(SettingsFragment settingsFragment);

    void inject(WizardFragment wizardFragment);

    void inject(WizardFragmentProvider wizardFragmentProvider);

    void inject(WizardPageTwoFragment wizardPageTwoFragment);
}
