package cm.aptoide.p092pt.view;

import android.R;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.AgentPersistence;
import cm.aptoide.p092pt.account.ErrorsMapper;
import cm.aptoide.p092pt.account.view.AccountErrorMapper;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.account.view.ImageInfoProvider;
import cm.aptoide.p092pt.account.view.ImagePickerNavigator;
import cm.aptoide.p092pt.account.view.ImagePickerPresenter;
import cm.aptoide.p092pt.account.view.ImagePickerView;
import cm.aptoide.p092pt.account.view.ImageValidator;
import cm.aptoide.p092pt.account.view.LoginSignUpCredentialsConfiguration;
import cm.aptoide.p092pt.account.view.LoginSignUpCredentialsFragment;
import cm.aptoide.p092pt.account.view.PhotoFileGenerator;
import cm.aptoide.p092pt.account.view.UriToPathResolver;
import cm.aptoide.p092pt.account.view.magiclink.CheckYourEmailNavigator;
import cm.aptoide.p092pt.account.view.magiclink.CheckYourEmailPresenter;
import cm.aptoide.p092pt.account.view.magiclink.CheckYourEmailView;
import cm.aptoide.p092pt.account.view.magiclink.MagicLinkView;
import cm.aptoide.p092pt.account.view.magiclink.SendMagicLinkNavigator;
import cm.aptoide.p092pt.account.view.magiclink.SendMagicLinkPresenter;
import cm.aptoide.p092pt.account.view.store.ManageStoreErrorMapper;
import cm.aptoide.p092pt.account.view.store.ManageStoreNavigator;
import cm.aptoide.p092pt.account.view.store.ManageStorePresenter;
import cm.aptoide.p092pt.account.view.store.ManageStoreView;
import cm.aptoide.p092pt.account.view.store.StoreManager;
import cm.aptoide.p092pt.account.view.user.CreateUserErrorMapper;
import cm.aptoide.p092pt.account.view.user.ManageUserNavigator;
import cm.aptoide.p092pt.account.view.user.ManageUserPresenter;
import cm.aptoide.p092pt.account.view.user.ManageUserView;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.AdsManager;
import cm.aptoide.p092pt.app.AppCoinsAdvertisingManager;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.AppViewAnalytics;
import cm.aptoide.p092pt.app.AppViewManager;
import cm.aptoide.p092pt.app.AppViewModelManager;
import cm.aptoide.p092pt.app.CampaignAnalytics;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.app.FlagManager;
import cm.aptoide.p092pt.app.FlagService;
import cm.aptoide.p092pt.app.ReviewsManager;
import cm.aptoide.p092pt.app.appsflyer.AppsFlyerManager;
import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallManager;
import cm.aptoide.p092pt.app.migration.AppcMigrationManager;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignManager;
import cm.aptoide.p092pt.app.view.AppCoinsInfoView;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.app.view.AppViewNavigator;
import cm.aptoide.p092pt.app.view.AppViewPresenter;
import cm.aptoide.p092pt.app.view.AppViewView;
import cm.aptoide.p092pt.app.view.MoreBundleManager;
import cm.aptoide.p092pt.app.view.MoreBundlePresenter;
import cm.aptoide.p092pt.app.view.MoreBundleView;
import cm.aptoide.p092pt.autoupdate.AutoUpdateDialogFragment;
import cm.aptoide.p092pt.autoupdate.AutoUpdateDialogPresenter;
import cm.aptoide.p092pt.autoupdate.AutoUpdateManager;
import cm.aptoide.p092pt.blacklist.BlacklistManager;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.download.view.DownloadDialogProvider;
import cm.aptoide.p092pt.download.view.DownloadNavigator;
import cm.aptoide.p092pt.download.view.DownloadStatusManager;
import cm.aptoide.p092pt.download.view.DownloadViewActionPresenter;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogFragment;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogPresenter;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceManager;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigator;
import cm.aptoide.p092pt.editorial.CardId;
import cm.aptoide.p092pt.editorial.EditorialAnalytics;
import cm.aptoide.p092pt.editorial.EditorialFragment;
import cm.aptoide.p092pt.editorial.EditorialManager;
import cm.aptoide.p092pt.editorial.EditorialNavigator;
import cm.aptoide.p092pt.editorial.EditorialPresenter;
import cm.aptoide.p092pt.editorial.EditorialRepository;
import cm.aptoide.p092pt.editorial.EditorialService;
import cm.aptoide.p092pt.editorial.EditorialView;
import cm.aptoide.p092pt.editorial.Slug;
import cm.aptoide.p092pt.editorialList.EditorialCardListRepository;
import cm.aptoide.p092pt.editorialList.EditorialCardListService;
import cm.aptoide.p092pt.editorialList.EditorialListAnalytics;
import cm.aptoide.p092pt.editorialList.EditorialListManager;
import cm.aptoide.p092pt.editorialList.EditorialListNavigator;
import cm.aptoide.p092pt.editorialList.EditorialListPresenter;
import cm.aptoide.p092pt.editorialList.EditorialListView;
import cm.aptoide.p092pt.feature.NewFeatureDialogPresenter;
import cm.aptoide.p092pt.feature.NoBehaviourNewFeatureListener;
import cm.aptoide.p092pt.home.AptoideBottomNavigator;
import cm.aptoide.p092pt.home.ChipManager;
import cm.aptoide.p092pt.home.Home;
import cm.aptoide.p092pt.home.HomeAnalytics;
import cm.aptoide.p092pt.home.HomeContainerNavigator;
import cm.aptoide.p092pt.home.HomeContainerPresenter;
import cm.aptoide.p092pt.home.HomeContainerView;
import cm.aptoide.p092pt.home.HomeNavigator;
import cm.aptoide.p092pt.home.HomePresenter;
import cm.aptoide.p092pt.home.HomeView;
import cm.aptoide.p092pt.home.apps.AppMapper;
import cm.aptoide.p092pt.home.apps.AppsFragmentView;
import cm.aptoide.p092pt.home.apps.AppsManager;
import cm.aptoide.p092pt.home.apps.AppsNavigator;
import cm.aptoide.p092pt.home.apps.AppsPresenter;
import cm.aptoide.p092pt.home.apps.UpdatesManager;
import cm.aptoide.p092pt.home.bundles.BundlesRepository;
import cm.aptoide.p092pt.home.bundles.ads.AdMapper;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListAnalytics;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListConfiguration;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListFragment;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListManager;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListPresenter;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcNavigator;
import cm.aptoide.p092pt.home.more.apps.ListAppsConfiguration;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreFragment;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreManager;
import cm.aptoide.p092pt.home.more.apps.ListAppsMorePresenter;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreRepository;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallAppSizeValidator;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.navigator.ActivityNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.FragmentResultNavigator;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.notification.AppcPromotionNotificationStringProvider;
import cm.aptoide.p092pt.notification.ComingSoonNotificationManager;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.notification.UpdatesNotificationManager;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import cm.aptoide.p092pt.permission.AccountPermissionProvider;
import cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView;
import cm.aptoide.p092pt.presenter.LoginSignupCredentialsFlavorPresenter;
import cm.aptoide.p092pt.promotions.ClaimPromotionDialogPresenter;
import cm.aptoide.p092pt.promotions.ClaimPromotionDialogView;
import cm.aptoide.p092pt.promotions.ClaimPromotionsManager;
import cm.aptoide.p092pt.promotions.ClaimPromotionsNavigator;
import cm.aptoide.p092pt.promotions.PromotionViewAppMapper;
import cm.aptoide.p092pt.promotions.PromotionsAnalytics;
import cm.aptoide.p092pt.promotions.PromotionsManager;
import cm.aptoide.p092pt.promotions.PromotionsNavigator;
import cm.aptoide.p092pt.promotions.PromotionsPreferencesManager;
import cm.aptoide.p092pt.promotions.PromotionsPresenter;
import cm.aptoide.p092pt.promotions.PromotionsView;
import cm.aptoide.p092pt.reactions.ReactionsManager;
import cm.aptoide.p092pt.repository.request.RewardAppCoinsAppsRepository;
import cm.aptoide.p092pt.search.SearchManager;
import cm.aptoide.p092pt.search.SearchNavigator;
import cm.aptoide.p092pt.search.SearchRepository;
import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.search.suggestions.SearchSuggestionManager;
import cm.aptoide.p092pt.search.suggestions.TrendingManager;
import cm.aptoide.p092pt.search.view.SearchResultPresenter;
import cm.aptoide.p092pt.search.view.SearchResultView;
import cm.aptoide.p092pt.socialmedia.SocialMediaAnalytics;
import cm.aptoide.p092pt.socialmedia.SocialMediaNavigator;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.store.view.p104my.MyStoresNavigator;
import cm.aptoide.p092pt.store.view.p104my.MyStoresPresenter;
import cm.aptoide.p092pt.store.view.p104my.MyStoresView;
import cm.aptoide.p092pt.themes.NewFeatureDialogView;
import cm.aptoide.p092pt.themes.NewFeatureManager;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.updates.UpdatesAnalytics;
import cm.aptoide.p092pt.view.app.AppCenter;
import cm.aptoide.p092pt.view.wizard.WizardPresenter;
import cm.aptoide.p092pt.view.wizard.WizardView;
import cm.aptoide.p092pt.wallet.WalletAppProvider;
import cm.aptoide.p092pt.wallet.WalletInstallManager;
import java.util.List;
import java.util.Map;
import javax.inject.Named;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.parceler.C11187d;
import p241e.p294g.p306b.C8986a;
import p456rx.p457l.p459c.C11250a;
import p456rx.p473s.C11418b;
import p456rx.p474t.C11426b;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class FragmentModule {
    private final Bundle arguments;
    private final Fragment fragment;
    private final boolean isCreateStoreUserPrivacyEnabled;
    private final String packageName;
    private final Bundle savedInstance;

    public FragmentModule(Fragment fragment, Bundle bundle, Bundle bundle2, boolean z, String str) {
        this.fragment = fragment;
        this.savedInstance = bundle;
        this.arguments = bundle2;
        this.isCreateStoreUserPrivacyEnabled = z;
        this.packageName = str;
    }

    private EditorialConfiguration getEditorialConfiguration() {
        String string = this.arguments.getString("cardId", HttpUrl.FRAGMENT_ENCODE_SET);
        return string.equals(HttpUrl.FRAGMENT_ENCODE_SET) ? new EditorialConfiguration(new Slug(this.arguments.getString("slug", HttpUrl.FRAGMENT_ENCODE_SET))) : new EditorialConfiguration(new CardId(string));
    }

    @FragmentScope
    EditorialListAnalytics editorialListAnalytics(NavigationTracker navigationTracker, AnalyticsManager analyticsManager) {
        return new EditorialListAnalytics(navigationTracker, analyticsManager);
    }

    @FragmentScope
    AccountErrorMapper provideAccountErrorMapper() {
        return new AccountErrorMapper(this.fragment.getContext(), new ErrorsMapper());
    }

    @FragmentScope
    CheckYourEmailPresenter provideCheckYourEmailPresenter(CheckYourEmailNavigator checkYourEmailNavigator) {
        return new CheckYourEmailPresenter((CheckYourEmailView) this.fragment, checkYourEmailNavigator);
    }

    @FragmentScope
    CreateUserErrorMapper provideCreateUserErrorMapper(AccountErrorMapper accountErrorMapper) {
        return new CreateUserErrorMapper(this.fragment.getContext(), accountErrorMapper, this.fragment.getResources());
    }

    @FragmentScope
    EarnAppcListPresenter provideEarnAppCoinsListPresenter(CrashReport crashReport, RewardAppCoinsAppsRepository rewardAppCoinsAppsRepository, AnalyticsManager analyticsManager, AppNavigator appNavigator, EarnAppcListConfiguration earnAppcListConfiguration, EarnAppcListManager earnAppcListManager, MoPubAdsManager moPubAdsManager, EarnAppcListAnalytics earnAppcListAnalytics, EarnAppcNavigator earnAppcNavigator) {
        return new EarnAppcListPresenter((EarnAppcListFragment) this.fragment, C11250a.m40156b(), crashReport, rewardAppCoinsAppsRepository, analyticsManager, appNavigator, earnAppcListConfiguration, earnAppcListManager, new PermissionManager(), (PermissionService) this.fragment.getContext(), moPubAdsManager, earnAppcListAnalytics, earnAppcNavigator);
    }

    @FragmentScope
    EarnAppcListAnalytics provideEarnAppcListAnalytics(DownloadAnalytics downloadAnalytics) {
        return new EarnAppcListAnalytics(downloadAnalytics);
    }

    @FragmentScope
    EarnAppcListManager provideEarnAppcListManager(WalletAppProvider walletAppProvider, WalletInstallManager walletInstallManager) {
        return new EarnAppcListManager(walletAppProvider, walletInstallManager);
    }

    @FragmentScope
    EarnAppcNavigator provideEarnAppcNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new EarnAppcNavigator(fragmentNavigator);
    }

    @FragmentScope
    @Named
    FragmentNavigator provideHomeFragmentNavigator(Map<Integer, Result> map, C8986a<Map<Integer, Result>> c8986a) {
        return new FragmentResultNavigator(this.fragment.getChildFragmentManager(), C1146R.id.main_home_container_content, R.anim.fade_in, R.anim.fade_out, map, c8986a);
    }

    @FragmentScope
    ImagePickerPresenter provideImagePickerPresenter(AccountPermissionProvider accountPermissionProvider, PhotoFileGenerator photoFileGenerator, ImageValidator imageValidator, UriToPathResolver uriToPathResolver, ImagePickerNavigator imagePickerNavigator) {
        return new ImagePickerPresenter((ImagePickerView) this.fragment, CrashReport.getInstance(), accountPermissionProvider, photoFileGenerator, imageValidator, C11250a.m40156b(), uriToPathResolver, imagePickerNavigator, this.fragment.getActivity().getContentResolver(), ImageLoader.with(this.fragment.getContext()), Schedulers.m40658io());
    }

    @FragmentScope
    ImageValidator provideImageValidator(ImageInfoProvider imageInfoProvider) {
        return new ImageValidator(Schedulers.computation(), imageInfoProvider);
    }

    @FragmentScope
    LoginSignupCredentialsFlavorPresenter provideLoginSignUpPresenter(AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, AccountErrorMapper accountErrorMapper, AccountAnalytics accountAnalytics, @Named("facebookLoginPermissions") List<String> list, LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration) {
        return new LoginSignupCredentialsFlavorPresenter((LoginSignUpCredentialsView) this.fragment, aptoideAccountManager, CrashReport.getInstance(), loginSignUpCredentialsConfiguration, accountNavigator, list, accountErrorMapper, accountAnalytics);
    }

    @FragmentScope
    ManageStoreErrorMapper provideManageStoreErrorMapper() {
        return new ManageStoreErrorMapper(this.fragment.getResources(), new ErrorsMapper());
    }

    @FragmentScope
    ManageStorePresenter provideManageStorePresenter(UriToPathResolver uriToPathResolver, ManageStoreNavigator manageStoreNavigator, ManageStoreErrorMapper manageStoreErrorMapper, AptoideAccountManager aptoideAccountManager, AccountAnalytics accountAnalytics) {
        return new ManageStorePresenter((ManageStoreView) this.fragment, CrashReport.getInstance(), uriToPathResolver, this.packageName, manageStoreNavigator, this.arguments.getBoolean("go_to_home", true), manageStoreErrorMapper, aptoideAccountManager, this.arguments.getInt(FragmentNavigator.REQUEST_CODE_EXTRA), accountAnalytics);
    }

    @FragmentScope
    ManageUserPresenter provideManageUserPresenter(AptoideAccountManager aptoideAccountManager, CreateUserErrorMapper createUserErrorMapper, ManageUserNavigator manageUserNavigator, UriToPathResolver uriToPathResolver, AccountAnalytics accountAnalytics) {
        return new ManageUserPresenter((ManageUserView) this.fragment, CrashReport.getInstance(), aptoideAccountManager, createUserErrorMapper, manageUserNavigator, this.arguments.getBoolean("is_edit", false), uriToPathResolver, this.isCreateStoreUserPrivacyEnabled, this.savedInstance == null, accountAnalytics);
    }

    @FragmentScope
    SearchResultPresenter provideSearchResultPresenter(SearchAnalytics searchAnalytics, SearchNavigator searchNavigator, SearchManager searchManager, TrendingManager trendingManager, SearchSuggestionManager searchSuggestionManager, BottomNavigationMapper bottomNavigationMapper, DownloadViewActionPresenter downloadViewActionPresenter) {
        return new SearchResultPresenter((SearchResultView) this.fragment, searchAnalytics, searchNavigator, CrashReport.getInstance(), C11250a.m40156b(), searchManager, trendingManager, searchSuggestionManager, (AptoideBottomNavigator) this.fragment.getActivity(), bottomNavigationMapper, Schedulers.m40658io(), downloadViewActionPresenter);
    }

    @FragmentScope
    SendMagicLinkPresenter provideSendMagicLinkPresenter(AptoideAccountManager aptoideAccountManager, SendMagicLinkNavigator sendMagicLinkNavigator, AgentPersistence agentPersistence) {
        return new SendMagicLinkPresenter((MagicLinkView) this.fragment, aptoideAccountManager, sendMagicLinkNavigator, C11250a.m40156b(), agentPersistence);
    }

    @FragmentScope
    AppCoinsInfoPresenter providesAppCoinsInfoPresenter(AppCoinsInfoNavigator appCoinsInfoNavigator, InstallManager installManager, CrashReport crashReport, SocialMediaAnalytics socialMediaAnalytics, AppCoinsManager appCoinsManager) {
        return new AppCoinsInfoPresenter((AppCoinsInfoView) this.fragment, appCoinsInfoNavigator, installManager, crashReport, AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME, C11250a.m40156b(), socialMediaAnalytics, appCoinsManager);
    }

    @FragmentScope
    AppMapper providesAppMapper() {
        return new AppMapper();
    }

    @FragmentScope
    AppViewConfiguration providesAppViewConfiguration() {
        return new AppViewConfiguration(this.arguments.getLong(AppViewFragment.BundleKeys.APP_ID.name(), -1L), this.arguments.getString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), null), this.arguments.getString(AppViewFragment.BundleKeys.STORE_NAME.name(), null), this.arguments.getString(AppViewFragment.BundleKeys.STORE_THEME.name(), HttpUrl.FRAGMENT_ENCODE_SET), (SearchAdResult) C11187d.m39873a(this.arguments.getParcelable(AppViewFragment.BundleKeys.MINIMAL_AD.name())), (AppViewFragment.OpenType) this.arguments.getSerializable(AppViewFragment.BundleKeys.SHOULD_INSTALL.name()), this.arguments.getString(AppViewFragment.BundleKeys.MD5.name(), HttpUrl.FRAGMENT_ENCODE_SET), this.arguments.getString(AppViewFragment.BundleKeys.UNAME.name(), HttpUrl.FRAGMENT_ENCODE_SET), this.arguments.getDouble(AppViewFragment.BundleKeys.APPC.name(), -1.0d), this.arguments.getString(AppViewFragment.BundleKeys.EDITORS_CHOICE_POSITION.name(), HttpUrl.FRAGMENT_ENCODE_SET), this.arguments.getString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), HttpUrl.FRAGMENT_ENCODE_SET), this.arguments.getString(AppViewFragment.BundleKeys.DOWNLOAD_CONVERSION_URL.name(), HttpUrl.FRAGMENT_ENCODE_SET), this.arguments.getString(AppViewFragment.BundleKeys.OEM_ID.name(), null));
    }

    @FragmentScope
    AppViewManager providesAppViewManager(AppViewModelManager appViewModelManager, InstallManager installManager, DownloadFactory downloadFactory, AppCenter appCenter, ReviewsManager reviewsManager, AdsManager adsManager, FlagManager flagManager, StoreUtilsProxy storeUtilsProxy, AptoideAccountManager aptoideAccountManager, DownloadStateParser downloadStateParser, AppViewAnalytics appViewAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, Resources resources, WindowManager windowManager, @Named("marketName") String str, AppCoinsManager appCoinsManager, MoPubAdsManager moPubAdsManager, PromotionsManager promotionsManager, AppcMigrationManager appcMigrationManager, LocalNotificationSyncManager localNotificationSyncManager, AppcPromotionNotificationStringProvider appcPromotionNotificationStringProvider, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, AppsFlyerManager appsFlyerManager, CampaignManager campaignManager) {
        return new AppViewManager(appViewModelManager, installManager, downloadFactory, appCenter, reviewsManager, adsManager, flagManager, storeUtilsProxy, aptoideAccountManager, moPubAdsManager, downloadStateParser, appViewAnalytics, notificationAnalytics, installAnalytics, Type.APPS_GROUP.getPerLineCount(resources, windowManager) * 6, str, appCoinsManager, promotionsManager, appcMigrationManager, localNotificationSyncManager, appcPromotionNotificationStringProvider, dynamicSplitsManager, splitAnalyticsMapper, appsFlyerManager, campaignManager);
    }

    @FragmentScope
    AppViewModelManager providesAppViewModelManager(AppViewConfiguration appViewConfiguration, StoreManager storeManager, @Named("marketName") String str, AppCenter appCenter, DownloadStateParser downloadStateParser, InstallManager installManager, AppcMigrationManager appcMigrationManager, AppCoinsAdvertisingManager appCoinsAdvertisingManager, AppCoinsManager appCoinsManager) {
        return new AppViewModelManager(appViewConfiguration, storeManager, str, appCenter, downloadStateParser, installManager, appcMigrationManager, appCoinsAdvertisingManager, appCoinsManager);
    }

    @FragmentScope
    AppViewPresenter providesAppViewPresenter(AccountNavigator accountNavigator, AppViewAnalytics appViewAnalytics, CampaignAnalytics campaignAnalytics, AppViewNavigator appViewNavigator, AppViewManager appViewManager, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, PromotionsNavigator promotionsNavigator, WalletAppProvider walletAppProvider) {
        return new AppViewPresenter((AppViewView) this.fragment, accountNavigator, appViewAnalytics, campaignAnalytics, appViewNavigator, appViewManager, aptoideAccountManager, C11250a.m40156b(), crashReport, new PermissionManager(), (PermissionService) this.fragment.getContext(), promotionsNavigator, walletAppProvider);
    }

    @FragmentScope
    AppcPromotionNotificationStringProvider providesAppcPromotionNotificationStringProvider() {
        return new AppcPromotionNotificationStringProvider(this.fragment.getContext().getString(C1146R.string.promo_update2appc_claim_notification_title), this.fragment.getContext().getString(C1146R.string.promo_update2appc_claim_notification_body));
    }

    @FragmentScope
    AppsManager providesAppsManager(UpdatesManager updatesManager, InstallManager installManager, AppMapper appMapper, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics, UpdatesAnalytics updatesAnalytics, DownloadFactory downloadFactory, MoPubAdsManager moPubAdsManager, AptoideInstallManager aptoideInstallManager, UpdatesNotificationManager updatesNotificationManager, @Named("secureShared") SharedPreferences sharedPreferences, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, CampaignManager campaignManager) {
        return new AppsManager(updatesManager, installManager, appMapper, downloadAnalytics, installAnalytics, updatesAnalytics, this.fragment.getContext().getPackageManager(), this.fragment.getContext(), downloadFactory, moPubAdsManager, aptoideInstallManager, updatesNotificationManager, sharedPreferences, dynamicSplitsManager, splitAnalyticsMapper, campaignManager);
    }

    @FragmentScope
    AppsNavigator providesAppsNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper, AppNavigator appNavigator) {
        return new AppsNavigator(fragmentNavigator, (AptoideBottomNavigator) this.fragment.getActivity(), bottomNavigationMapper, appNavigator);
    }

    @FragmentScope
    AppsPresenter providesAppsPresenter(AppsManager appsManager, AptoideAccountManager aptoideAccountManager, AppsNavigator appsNavigator) {
        return new AppsPresenter((AppsFragmentView) this.fragment, appsManager, C11250a.m40156b(), Schedulers.m40658io(), CrashReport.getInstance(), new PermissionManager(), (PermissionService) this.fragment.getContext(), aptoideAccountManager, appsNavigator);
    }

    @FragmentScope
    AutoUpdateDialogPresenter providesAutoUpdateDialogPresenter(CrashReport crashReport, AutoUpdateManager autoUpdateManager) {
        return new AutoUpdateDialogPresenter((AutoUpdateDialogFragment) this.fragment, crashReport, autoUpdateManager);
    }

    @FragmentScope
    BundleEvent providesBundleEvent() {
        return new BundleEvent(this.arguments.getString("title"), this.arguments.getString("action"));
    }

    @FragmentScope
    CheckYourEmailNavigator providesCheckYourEmailNavigator() {
        return new CheckYourEmailNavigator((ActivityNavigator) this.fragment.getActivity());
    }

    @FragmentScope
    ClaimPromotionDialogPresenter providesClaimPromotionDialogPresenter(ClaimPromotionsManager claimPromotionsManager, PromotionsAnalytics promotionsAnalytics, ClaimPromotionsNavigator claimPromotionsNavigator) {
        return new ClaimPromotionDialogPresenter((ClaimPromotionDialogView) this.fragment, new C11426b(), C11250a.m40156b(), claimPromotionsManager, promotionsAnalytics, claimPromotionsNavigator);
    }

    @FragmentScope
    ClaimPromotionsManager providesClaimPromotionsManager(PromotionsManager promotionsManager) {
        return new ClaimPromotionsManager(promotionsManager, this.arguments.getString("package_name", BuildConfig.APTOIDE_THEME), this.arguments.getString("promotion_id", BuildConfig.APTOIDE_THEME));
    }

    @FragmentScope
    NewFeatureDialogPresenter providesDarkthemeDialogPresenter(NewFeatureManager newFeatureManager) {
        return new NewFeatureDialogPresenter((NewFeatureDialogView) this.fragment, newFeatureManager, new NoBehaviourNewFeatureListener());
    }

    @FragmentScope
    DownloadDialogProvider providesDownloadDialogManager(ThemeManager themeManager) {
        return new DownloadDialogProvider(this.fragment, themeManager);
    }

    @FragmentScope
    DownloadNavigator providesDownloadNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        Fragment fragment = this.fragment;
        return new DownloadNavigator(fragment, fragment.getContext().getPackageManager(), fragmentNavigator);
    }

    @FragmentScope
    DownloadViewActionPresenter providesDownloadViewActionPresenter(InstallManager installManager, MoPubAdsManager moPubAdsManager, PermissionManager permissionManager, AppcMigrationManager appcMigrationManager, DownloadDialogProvider downloadDialogProvider, DownloadNavigator downloadNavigator, DownloadFactory downloadFactory, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics, NotificationAnalytics notificationAnalytics, CrashReport crashReport, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, CampaignManager campaignManager) {
        return new DownloadViewActionPresenter(installManager, moPubAdsManager, permissionManager, appcMigrationManager, downloadDialogProvider, downloadNavigator, (PermissionService) this.fragment.getActivity(), Schedulers.m40658io(), C11250a.m40156b(), downloadFactory, downloadAnalytics, installAnalytics, notificationAnalytics, crashReport, dynamicSplitsManager, splitAnalyticsMapper, campaignManager);
    }

    @FragmentScope
    EditorialAnalytics providesEditorialAnalytics(DownloadAnalytics downloadAnalytics, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, InstallAnalytics installAnalytics, SplitAnalyticsMapper splitAnalyticsMapper) {
        return new EditorialAnalytics(downloadAnalytics, analyticsManager, navigationTracker, this.arguments.getBoolean(EditorialFragment.FROM_HOME), installAnalytics, splitAnalyticsMapper);
    }

    @FragmentScope
    EditorialListManager providesEditorialListManager(EditorialCardListRepository editorialCardListRepository, ReactionsManager reactionsManager, AppCoinsManager appCoinsManager) {
        return new EditorialListManager(editorialCardListRepository, reactionsManager, appCoinsManager);
    }

    @FragmentScope
    EditorialListNavigator providesEditorialListNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AccountNavigator accountNavigator) {
        return new EditorialListNavigator(fragmentNavigator, accountNavigator);
    }

    @FragmentScope
    EditorialListPresenter providesEditorialListPresenter(EditorialListManager editorialListManager, AptoideAccountManager aptoideAccountManager, EditorialListNavigator editorialListNavigator, EditorialListAnalytics editorialListAnalytics, UserFeedbackAnalytics userFeedbackAnalytics) {
        return new EditorialListPresenter((EditorialListView) this.fragment, editorialListManager, aptoideAccountManager, editorialListNavigator, editorialListAnalytics, CrashReport.getInstance(), C11250a.m40156b(), userFeedbackAnalytics);
    }

    @FragmentScope
    EditorialCardListRepository providesEditorialListRepository(EditorialCardListService editorialCardListService) {
        return new EditorialCardListRepository(editorialCardListService);
    }

    @FragmentScope
    EditorialManager providesEditorialManager(EditorialRepository editorialRepository, InstallManager installManager, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, EditorialAnalytics editorialAnalytics, ReactionsManager reactionsManager, MoPubAdsManager moPubAdsManager, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, CampaignManager campaignManager) {
        return new EditorialManager(editorialRepository, getEditorialConfiguration(), installManager, downloadFactory, downloadStateParser, notificationAnalytics, installAnalytics, editorialAnalytics, reactionsManager, moPubAdsManager, dynamicSplitsManager, splitAnalyticsMapper, campaignManager);
    }

    @FragmentScope
    EditorialNavigator providesEditorialNavigator(AppNavigator appNavigator, AccountNavigator accountNavigator, SocialMediaNavigator socialMediaNavigator, @Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new EditorialNavigator((ActivityNavigator) this.fragment.getActivity(), fragmentNavigator, appNavigator, accountNavigator, socialMediaNavigator);
    }

    @FragmentScope
    EditorialPresenter providesEditorialPresenter(EditorialManager editorialManager, CrashReport crashReport, EditorialAnalytics editorialAnalytics, EditorialNavigator editorialNavigator, UserFeedbackAnalytics userFeedbackAnalytics, MoPubAdsManager moPubAdsManager, SocialMediaAnalytics socialMediaAnalytics) {
        return new EditorialPresenter((EditorialView) this.fragment, editorialManager, C11250a.m40156b(), crashReport, new PermissionManager(), (PermissionService) this.fragment.getContext(), editorialAnalytics, editorialNavigator, userFeedbackAnalytics, moPubAdsManager, socialMediaAnalytics);
    }

    @FragmentScope
    EditorialRepository providesEditorialRepository(EditorialService editorialService) {
        return new EditorialRepository(editorialService);
    }

    @FragmentScope
    EditorialCardListService providesEditorialService(@Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named(BuildConfig.APTOIDE_THEME) OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, @Named(BuildConfig.APTOIDE_THEME) SharedPreferences sharedPreferences) {
        return new EditorialCardListService(bodyInterceptor, okHttpClient, tokenInvalidator, WebService.getDefaultConverter(), sharedPreferences, 10);
    }

    @FragmentScope
    FlagManager providesFlagManager(FlagService flagService) {
        return new FlagManager(flagService);
    }

    @FragmentScope
    FlagService providesFlagService(@Named("defaultInterceptorV3") BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody> bodyInterceptor, @Named(BuildConfig.APTOIDE_THEME) OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, @Named(BuildConfig.APTOIDE_THEME) SharedPreferences sharedPreferences) {
        return new FlagService(bodyInterceptor, okHttpClient, tokenInvalidator, sharedPreferences);
    }

    @FragmentScope
    MoreBundleManager providesGetStoreManager(BundlesRepository bundlesRepository) {
        return new MoreBundleManager(bundlesRepository);
    }

    @FragmentScope
    MoreBundlePresenter providesGetStoreWidgetsPresenter(MoreBundleManager moreBundleManager, CrashReport crashReport, HomeNavigator homeNavigator, AdMapper adMapper, BundleEvent bundleEvent, HomeAnalytics homeAnalytics, ChipManager chipManager) {
        return new MoreBundlePresenter((MoreBundleView) this.fragment, moreBundleManager, C11250a.m40156b(), crashReport, homeNavigator, adMapper, bundleEvent, homeAnalytics, chipManager);
    }

    @FragmentScope
    Home providesHome(BundlesRepository bundlesRepository, PromotionsManager promotionsManager, PromotionsPreferencesManager promotionsPreferencesManager, BlacklistManager blacklistManager, @Named("homePromotionsId") String str, ReactionsManager reactionsManager, ComingSoonNotificationManager comingSoonNotificationManager) {
        return new Home(bundlesRepository, promotionsManager, promotionsPreferencesManager, blacklistManager, str, reactionsManager, comingSoonNotificationManager);
    }

    @FragmentScope
    HomeAnalytics providesHomeAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new HomeAnalytics(navigationTracker, analyticsManager);
    }

    @FragmentScope
    HomeContainerNavigator providesHomeContainerNavigator(@Named("home-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new HomeContainerNavigator(fragmentNavigator);
    }

    @FragmentScope
    HomeContainerPresenter providesHomeContainerPresenter(AptoideAccountManager aptoideAccountManager, HomeContainerNavigator homeContainerNavigator, HomeNavigator homeNavigator, HomeAnalytics homeAnalytics, Home home, ChipManager chipManager) {
        return new HomeContainerPresenter((HomeContainerView) this.fragment, C11250a.m40156b(), aptoideAccountManager, homeContainerNavigator, homeNavigator, homeAnalytics, home, chipManager);
    }

    @FragmentScope
    HomeNavigator providesHomeNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper, AppNavigator appNavigator, AccountNavigator accountNavigator, ThemeManager themeManager) {
        return new HomeNavigator(fragmentNavigator, (AptoideBottomNavigator) this.fragment.getActivity(), bottomNavigationMapper, appNavigator, (ActivityNavigator) this.fragment.getActivity(), accountNavigator, themeManager);
    }

    @FragmentScope
    HomePresenter providesHomePresenter(Home home, HomeNavigator homeNavigator, AdMapper adMapper, AptoideAccountManager aptoideAccountManager, HomeAnalytics homeAnalytics, UserFeedbackAnalytics userFeedbackAnalytics) {
        return new HomePresenter((HomeView) this.fragment, home, C11250a.m40156b(), CrashReport.getInstance(), homeNavigator, adMapper, homeAnalytics, userFeedbackAnalytics);
    }

    @FragmentScope
    EarnAppcListConfiguration providesListAppsConfiguration() {
        return new EarnAppcListConfiguration(this.arguments.getString("title"), this.arguments.getString(StoreTabGridRecyclerFragment.BundleCons.TAG));
    }

    @FragmentScope
    ListAppsConfiguration providesListAppsMoreConfiguration() {
        return new ListAppsConfiguration(this.fragment.getArguments().getString("title"), this.arguments.getString(StoreTabGridRecyclerFragment.BundleCons.TAG), this.arguments.getString("action"), this.arguments.getString("name"), Long.valueOf(this.arguments.getLong(StoreTabGridRecyclerFragment.BundleCons.GROUP_ID)));
    }

    @FragmentScope
    ListAppsMoreManager providesListAppsMoreManager(ListAppsMoreRepository listAppsMoreRepository, AdsRepository adsRepository) {
        return new ListAppsMoreManager(listAppsMoreRepository, adsRepository);
    }

    @FragmentScope
    ListAppsMorePresenter providesListAppsMorePresenter(CrashReport crashReport, AppNavigator appNavigator, @Named(BuildConfig.APTOIDE_THEME) SharedPreferences sharedPreferences, ListAppsConfiguration listAppsConfiguration, ListAppsMoreManager listAppsMoreManager) {
        return new ListAppsMorePresenter((ListAppsMoreFragment) this.fragment, C11250a.m40156b(), crashReport, appNavigator, sharedPreferences, listAppsConfiguration, listAppsMoreManager);
    }

    @FragmentScope
    LoginSignUpCredentialsConfiguration providesLoginSignUpCredentialsConfiguration() {
        String string = this.arguments.getString("magic_link_error_message");
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return new LoginSignUpCredentialsConfiguration(this.arguments.getBoolean(LoginSignUpCredentialsFragment.DISMISS_TO_NAVIGATE_TO_MAIN_VIEW), this.arguments.getBoolean(LoginSignUpCredentialsFragment.CLEAN_BACK_STACK), this.arguments.getBoolean("has_magic_link_error"), string);
    }

    @FragmentScope
    MyStoresNavigator providesMyStoreNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper) {
        return new MyStoresNavigator(fragmentNavigator, (AptoideBottomNavigator) this.fragment.getActivity(), bottomNavigationMapper);
    }

    @FragmentScope
    MyStoresPresenter providesMyStorePresenter(AptoideAccountManager aptoideAccountManager, MyStoresNavigator myStoresNavigator) {
        return new MyStoresPresenter((MyStoresView) this.fragment, C11250a.m40156b(), aptoideAccountManager, myStoresNavigator);
    }

    @FragmentScope
    OutOfSpaceDialogPresenter providesOutOfSpaceDialogPresenter(CrashReport crashReport, OutOfSpaceManager outOfSpaceManager, OutOfSpaceNavigator outOfSpaceNavigator) {
        return new OutOfSpaceDialogPresenter((OutOfSpaceDialogFragment) this.fragment, crashReport, C11250a.m40156b(), Schedulers.m40658io(), outOfSpaceManager, outOfSpaceNavigator);
    }

    @FragmentScope
    OutOfSpaceManager providesOutOfSpaceManager(InstallManager installManager, InstallAppSizeValidator installAppSizeValidator) {
        return new OutOfSpaceManager(installManager, this.arguments.getLong(OutOfSpaceDialogFragment.APP_SIZE), C11418b.m40637g1(), installAppSizeValidator);
    }

    @FragmentScope
    OutOfSpaceNavigator providesOutOfSpaceNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new OutOfSpaceNavigator(fragmentNavigator, this.arguments.getString("package_name"));
    }

    @FragmentScope
    PromotionViewAppMapper providesPromotionViewAppMapper(DownloadStateParser downloadStateParser) {
        return new PromotionViewAppMapper(downloadStateParser);
    }

    @FragmentScope
    PromotionsPresenter providesPromotionsPresenter(PromotionsManager promotionsManager, PromotionsAnalytics promotionsAnalytics, PromotionsNavigator promotionsNavigator, @Named("homePromotionsId") String str, MoPubAdsManager moPubAdsManager) {
        return new PromotionsPresenter((PromotionsView) this.fragment, promotionsManager, new PermissionManager(), (PermissionService) this.fragment.getContext(), C11250a.m40156b(), promotionsAnalytics, promotionsNavigator, str, moPubAdsManager);
    }

    @FragmentScope
    RewardAppCoinsAppsRepository providesRewardAppCoinsAppsRepository(@Named(BuildConfig.APTOIDE_THEME) OkHttpClient okHttpClient, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, @Named(BuildConfig.APTOIDE_THEME) SharedPreferences sharedPreferences, InstallManager installManager) {
        return new RewardAppCoinsAppsRepository(okHttpClient, WebService.getDefaultConverter(), bodyInterceptor, tokenInvalidator, sharedPreferences, installManager);
    }

    @FragmentScope
    SearchManager providesSearchManager(AptoideAccountManager aptoideAccountManager, SearchRepository searchRepository, DownloadStatusManager downloadStatusManager, AppCenter appCenter) {
        return new SearchManager(aptoideAccountManager, searchRepository, downloadStatusManager, appCenter);
    }

    @FragmentScope
    SendMagicLinkNavigator providesSendMagicLinkNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, ThemeManager themeManager) {
        return new SendMagicLinkNavigator(fragmentNavigator, this.fragment.getContext(), themeManager);
    }

    @FragmentScope
    WizardPresenter providesWizardPresenter(AptoideAccountManager aptoideAccountManager, CrashReport crashReport, AccountAnalytics accountAnalytics) {
        return new WizardPresenter((WizardView) this.fragment, aptoideAccountManager, crashReport, accountAnalytics);
    }
}
