package cm.aptoide.p092pt;

import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import cm.aptoide.accountmanager.AccountFactory;
import cm.aptoide.accountmanager.AccountPersistence;
import cm.aptoide.accountmanager.AccountService;
import cm.aptoide.accountmanager.AdultContent;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.EventLogger;
import cm.aptoide.analytics.SessionLogger;
import cm.aptoide.analytics.implementation.PageViewsAnalytics;
import cm.aptoide.analytics.implementation.loggers.FlurryEventLogger;
import cm.aptoide.analytics.implementation.loggers.HttpKnockEventLogger;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.utils.AnalyticsEventParametersNormalizer;
import cm.aptoide.analytics.implementation.utils.MapToJsonMapper;
import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.aab.DynamicSplitsMapper;
import cm.aptoide.p092pt.aab.DynamicSplitsRemoteService;
import cm.aptoide.p092pt.aab.DynamicSplitsService;
import cm.aptoide.p092pt.aab.SplitsMapper;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.AdultContentAnalytics;
import cm.aptoide.p092pt.account.AgentPersistence;
import cm.aptoide.p092pt.account.AndroidAccountProvider;
import cm.aptoide.p092pt.account.DatabaseStoreDataPersist;
import cm.aptoide.p092pt.account.LoginPreferences;
import cm.aptoide.p092pt.account.OAuthModeProvider;
import cm.aptoide.p092pt.account.view.AccountErrorMapper;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.account.view.ImageInfoProvider;
import cm.aptoide.p092pt.account.view.ImagePickerNavigator;
import cm.aptoide.p092pt.account.view.ImagePickerPresenter;
import cm.aptoide.p092pt.account.view.ImageValidator;
import cm.aptoide.p092pt.account.view.LoginSignUpCredentialsConfiguration;
import cm.aptoide.p092pt.account.view.LoginSignUpCredentialsFragment;
import cm.aptoide.p092pt.account.view.LoginSignUpCredentialsFragment_MembersInjector;
import cm.aptoide.p092pt.account.view.PhotoFileGenerator;
import cm.aptoide.p092pt.account.view.UriToPathResolver;
import cm.aptoide.p092pt.account.view.magiclink.CheckYourEmailFragment;
import cm.aptoide.p092pt.account.view.magiclink.CheckYourEmailFragment_MembersInjector;
import cm.aptoide.p092pt.account.view.magiclink.CheckYourEmailNavigator;
import cm.aptoide.p092pt.account.view.magiclink.CheckYourEmailPresenter;
import cm.aptoide.p092pt.account.view.magiclink.SendMagicLinkNavigator;
import cm.aptoide.p092pt.account.view.magiclink.SendMagicLinkPresenter;
import cm.aptoide.p092pt.account.view.store.ManageStoreErrorMapper;
import cm.aptoide.p092pt.account.view.store.ManageStoreFragment;
import cm.aptoide.p092pt.account.view.store.ManageStoreFragment_MembersInjector;
import cm.aptoide.p092pt.account.view.store.ManageStoreNavigator;
import cm.aptoide.p092pt.account.view.store.ManageStorePresenter;
import cm.aptoide.p092pt.account.view.store.StoreManager;
import cm.aptoide.p092pt.account.view.user.CreateUserErrorMapper;
import cm.aptoide.p092pt.account.view.user.ManageUserFragment;
import cm.aptoide.p092pt.account.view.user.ManageUserFragment_MembersInjector;
import cm.aptoide.p092pt.account.view.user.ManageUserNavigator;
import cm.aptoide.p092pt.account.view.user.ManageUserPresenter;
import cm.aptoide.p092pt.account.view.user.NewsletterManager;
import cm.aptoide.p092pt.account.view.user.ProfileStepOneFragment;
import cm.aptoide.p092pt.account.view.user.ProfileStepOneFragment_MembersInjector;
import cm.aptoide.p092pt.account.view.user.ProfileStepTwoFragment;
import cm.aptoide.p092pt.account.view.user.ProfileStepTwoFragment_MembersInjector;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.ads.WalletAdsOfferCardManager;
import cm.aptoide.p092pt.ads.WalletAdsOfferManager;
import cm.aptoide.p092pt.analytics.AppSizeAnalyticsStringMapper;
import cm.aptoide.p092pt.analytics.FirstLaunchAnalytics;
import cm.aptoide.p092pt.analytics.view.AnalyticsActivity;
import cm.aptoide.p092pt.analytics.view.AnalyticsActivity_MembersInjector;
import cm.aptoide.p092pt.apkfy.ApkFyParser;
import cm.aptoide.p092pt.apkfy.ApkfyManager;
import cm.aptoide.p092pt.apkfy.ApkfyService;
import cm.aptoide.p092pt.apkfy.AptoideApkfyService;
import cm.aptoide.p092pt.app.AdsManager;
import cm.aptoide.p092pt.app.AppCoinsAdvertisingManager;
import cm.aptoide.p092pt.app.AppCoinsService;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.AppViewAnalytics;
import cm.aptoide.p092pt.app.AppViewManager;
import cm.aptoide.p092pt.app.AppViewModelManager;
import cm.aptoide.p092pt.app.CampaignAnalytics;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.app.FlagManager;
import cm.aptoide.p092pt.app.FlagService;
import cm.aptoide.p092pt.app.ReviewsManager;
import cm.aptoide.p092pt.app.ReviewsRepository;
import cm.aptoide.p092pt.app.ReviewsService;
import cm.aptoide.p092pt.app.appsflyer.AppsFlyerManager;
import cm.aptoide.p092pt.app.appsflyer.AppsFlyerRepository;
import cm.aptoide.p092pt.app.appsflyer.AppsFlyerService;
import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallManager;
import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallRepository;
import cm.aptoide.p092pt.app.migration.AppcMigrationManager;
import cm.aptoide.p092pt.app.migration.AppcMigrationPersistence;
import cm.aptoide.p092pt.app.migration.AppcMigrationRepository;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignManager;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignMapper;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignRepository;
import cm.aptoide.p092pt.app.view.AppCoinsInfoFragment;
import cm.aptoide.p092pt.app.view.AppCoinsInfoFragment_MembersInjector;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.app.view.AppViewFragment_MembersInjector;
import cm.aptoide.p092pt.app.view.AppViewNavigator;
import cm.aptoide.p092pt.app.view.AppViewPresenter;
import cm.aptoide.p092pt.app.view.MoreBundleFragment;
import cm.aptoide.p092pt.app.view.MoreBundleFragment_MembersInjector;
import cm.aptoide.p092pt.app.view.MoreBundleManager;
import cm.aptoide.p092pt.app.view.MoreBundlePresenter;
import cm.aptoide.p092pt.app.view.OtherVersionsFragment;
import cm.aptoide.p092pt.app.view.OtherVersionsFragment_MembersInjector;
import cm.aptoide.p092pt.appview.PreferencesPersister;
import cm.aptoide.p092pt.autoupdate.AutoUpdateDialogFragment;
import cm.aptoide.p092pt.autoupdate.AutoUpdateDialogFragment_MembersInjector;
import cm.aptoide.p092pt.autoupdate.AutoUpdateDialogPresenter;
import cm.aptoide.p092pt.autoupdate.AutoUpdateManager;
import cm.aptoide.p092pt.autoupdate.AutoUpdateRepository;
import cm.aptoide.p092pt.autoupdate.AutoUpdateService;
import cm.aptoide.p092pt.autoupdate.Service;
import cm.aptoide.p092pt.blacklist.BlacklistManager;
import cm.aptoide.p092pt.blacklist.BlacklistPersistence;
import cm.aptoide.p092pt.blacklist.BlacklistUnitMapper;
import cm.aptoide.p092pt.blacklist.Blacklister;
import cm.aptoide.p092pt.bonus.BonusAppcRemoteService;
import cm.aptoide.p092pt.bonus.BonusAppcService;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity_MembersInjector;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationAnalytics;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.p092pt.comments.view.CommentDialogFragment;
import cm.aptoide.p092pt.comments.view.CommentDialogFragment_MembersInjector;
import cm.aptoide.p092pt.comments.view.CommentListFragment;
import cm.aptoide.p092pt.comments.view.CommentListFragment_MembersInjector;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.RoomInstallationMapper;
import cm.aptoide.p092pt.database.RoomInstallationPersistence;
import cm.aptoide.p092pt.database.RoomInstalledPersistence;
import cm.aptoide.p092pt.database.RoomNotificationPersistence;
import cm.aptoide.p092pt.database.RoomStoredMinimalAdPersistence;
import cm.aptoide.p092pt.database.room.AptoideDatabase;
import cm.aptoide.p092pt.dataprovider.NetworkOperatorManager;
import cm.aptoide.p092pt.dataprovider.cache.L2Cache;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.RequestBodyFactory;
import cm.aptoide.p092pt.download.AppValidationAnalytics;
import cm.aptoide.p092pt.download.AppValidator;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.DownloadSpeedIntervalMapper;
import cm.aptoide.p092pt.download.Md5Comparator;
import cm.aptoide.p092pt.download.OemidProvider;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.download.SplitTypeSubFileTypeMapper;
import cm.aptoide.p092pt.download.view.DownloadDialogProvider;
import cm.aptoide.p092pt.download.view.DownloadNavigator;
import cm.aptoide.p092pt.download.view.DownloadStatusManager;
import cm.aptoide.p092pt.download.view.DownloadViewActionPresenter;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogFragment;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogFragment_MembersInjector;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogPresenter;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceManager;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigator;
import cm.aptoide.p092pt.downloadmanager.AppDownloaderProvider;
import cm.aptoide.p092pt.downloadmanager.AptoideDownloadManager;
import cm.aptoide.p092pt.downloadmanager.DownloadAppFileMapper;
import cm.aptoide.p092pt.downloadmanager.DownloadAppMapper;
import cm.aptoide.p092pt.downloadmanager.DownloadPersistence;
import cm.aptoide.p092pt.downloadmanager.DownloadStatusMapper;
import cm.aptoide.p092pt.downloadmanager.DownloadsRepository;
import cm.aptoide.p092pt.downloadmanager.FileDownloaderProvider;
import cm.aptoide.p092pt.downloadmanager.RetryFileDownloaderProvider;
import cm.aptoide.p092pt.editorial.CaptionBackgroundPainter;
import cm.aptoide.p092pt.editorial.EditorialAnalytics;
import cm.aptoide.p092pt.editorial.EditorialFragment;
import cm.aptoide.p092pt.editorial.EditorialFragment_MembersInjector;
import cm.aptoide.p092pt.editorial.EditorialManager;
import cm.aptoide.p092pt.editorial.EditorialNavigator;
import cm.aptoide.p092pt.editorial.EditorialPresenter;
import cm.aptoide.p092pt.editorial.EditorialRepository;
import cm.aptoide.p092pt.editorial.EditorialService;
import cm.aptoide.p092pt.editorialList.EditorialCardListRepository;
import cm.aptoide.p092pt.editorialList.EditorialCardListService;
import cm.aptoide.p092pt.editorialList.EditorialListAnalytics;
import cm.aptoide.p092pt.editorialList.EditorialListFragment;
import cm.aptoide.p092pt.editorialList.EditorialListFragment_MembersInjector;
import cm.aptoide.p092pt.editorialList.EditorialListManager;
import cm.aptoide.p092pt.editorialList.EditorialListNavigator;
import cm.aptoide.p092pt.editorialList.EditorialListPresenter;
import cm.aptoide.p092pt.feature.NewFeatureDialogPresenter;
import cm.aptoide.p092pt.file.CacheHelper;
import cm.aptoide.p092pt.file.FileManager;
import cm.aptoide.p092pt.home.AppComingSoonRegistrationManager;
import cm.aptoide.p092pt.home.AppComingSoonRegistrationPersistence;
import cm.aptoide.p092pt.home.ChipManager;
import cm.aptoide.p092pt.home.Home;
import cm.aptoide.p092pt.home.HomeAnalytics;
import cm.aptoide.p092pt.home.HomeContainerFragment;
import cm.aptoide.p092pt.home.HomeContainerFragment_MembersInjector;
import cm.aptoide.p092pt.home.HomeContainerNavigator;
import cm.aptoide.p092pt.home.HomeContainerPresenter;
import cm.aptoide.p092pt.home.HomeFragment;
import cm.aptoide.p092pt.home.HomeFragment_MembersInjector;
import cm.aptoide.p092pt.home.HomeNavigator;
import cm.aptoide.p092pt.home.HomePresenter;
import cm.aptoide.p092pt.home.apps.AppMapper;
import cm.aptoide.p092pt.home.apps.AppsFragment;
import cm.aptoide.p092pt.home.apps.AppsFragment_MembersInjector;
import cm.aptoide.p092pt.home.apps.AppsManager;
import cm.aptoide.p092pt.home.apps.AppsNavigator;
import cm.aptoide.p092pt.home.apps.AppsPresenter;
import cm.aptoide.p092pt.home.apps.UpdatesManager;
import cm.aptoide.p092pt.home.bundles.BundleDataSource;
import cm.aptoide.p092pt.home.bundles.BundlesRepository;
import cm.aptoide.p092pt.home.bundles.BundlesResponseMapper;
import cm.aptoide.p092pt.home.bundles.ads.AdMapper;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListAnalytics;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListConfiguration;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListFragment;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListFragment_MembersInjector;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListManager;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListPresenter;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcNavigator;
import cm.aptoide.p092pt.home.more.apps.ListAppsConfiguration;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreFragment;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreFragment_MembersInjector;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreManager;
import cm.aptoide.p092pt.home.more.apps.ListAppsMorePresenter;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreRepository;
import cm.aptoide.p092pt.install.AppInstallerStatusReceiver;
import cm.aptoide.p092pt.install.AptoideInstallPersistence;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.DownloadService;
import cm.aptoide.p092pt.install.DownloadService_MembersInjector;
import cm.aptoide.p092pt.install.FilePathProvider;
import cm.aptoide.p092pt.install.ForegroundManager;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallAppSizeValidator;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.install.InstalledIntentService;
import cm.aptoide.p092pt.install.InstalledIntentService_MembersInjector;
import cm.aptoide.p092pt.install.Installer;
import cm.aptoide.p092pt.install.InstallerAnalytics;
import cm.aptoide.p092pt.install.PackageRepository;
import cm.aptoide.p092pt.install.RootInstallerProvider;
import cm.aptoide.p092pt.install.installer.InstallationProvider;
import cm.aptoide.p092pt.install.installer.RootInstallationRetryHandler;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator_MembersInjector;
import cm.aptoide.p092pt.navigator.ExternalNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.networking.MultipartBodyInterceptor;
import cm.aptoide.p092pt.notification.AppcPromotionNotificationStringProvider;
import cm.aptoide.p092pt.notification.AptoideWorkerFactory;
import cm.aptoide.p092pt.notification.ComingSoonNotificationManager;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.notification.NotificationProvider;
import cm.aptoide.p092pt.notification.PullingContentService;
import cm.aptoide.p092pt.notification.PullingContentService_MembersInjector;
import cm.aptoide.p092pt.notification.ReadyToInstallNotificationManager;
import cm.aptoide.p092pt.notification.RoomLocalNotificationSyncPersistence;
import cm.aptoide.p092pt.notification.UpdatesNotificationManager;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import cm.aptoide.p092pt.notification.view.InboxFragment;
import cm.aptoide.p092pt.orientation.ScreenOrientationManager;
import cm.aptoide.p092pt.packageinstaller.AppInstaller;
import cm.aptoide.p092pt.permission.AccountPermissionProvider;
import cm.aptoide.p092pt.preferences.AptoideMd5Manager;
import cm.aptoide.p092pt.preferences.LocalPersistenceAdultContent;
import cm.aptoide.p092pt.preferences.Preferences;
import cm.aptoide.p092pt.preferences.SecurePreferences;
import cm.aptoide.p092pt.preferences.secure.SecureCoderDecoder;
import cm.aptoide.p092pt.presenter.LoginSignupCredentialsFlavorPresenter;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.promotions.ClaimPromotionDialogFragment;
import cm.aptoide.p092pt.promotions.ClaimPromotionDialogFragment_MembersInjector;
import cm.aptoide.p092pt.promotions.ClaimPromotionDialogPresenter;
import cm.aptoide.p092pt.promotions.ClaimPromotionsManager;
import cm.aptoide.p092pt.promotions.ClaimPromotionsNavigator;
import cm.aptoide.p092pt.promotions.PromotionViewAppMapper;
import cm.aptoide.p092pt.promotions.PromotionsAnalytics;
import cm.aptoide.p092pt.promotions.PromotionsFragment;
import cm.aptoide.p092pt.promotions.PromotionsFragment_MembersInjector;
import cm.aptoide.p092pt.promotions.PromotionsManager;
import cm.aptoide.p092pt.promotions.PromotionsNavigator;
import cm.aptoide.p092pt.promotions.PromotionsPreferencesManager;
import cm.aptoide.p092pt.promotions.PromotionsPresenter;
import cm.aptoide.p092pt.promotions.PromotionsService;
import cm.aptoide.p092pt.reactions.ReactionsManager;
import cm.aptoide.p092pt.reactions.network.ReactionsRemoteService;
import cm.aptoide.p092pt.reactions.network.ReactionsService;
import cm.aptoide.p092pt.repository.request.RewardAppCoinsAppsRepository;
import cm.aptoide.p092pt.reviews.LatestReviewsFragment;
import cm.aptoide.p092pt.reviews.LatestReviewsFragment_MembersInjector;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment_MembersInjector;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import cm.aptoide.p092pt.search.SearchManager;
import cm.aptoide.p092pt.search.SearchNavigator;
import cm.aptoide.p092pt.search.SearchRepository;
import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import cm.aptoide.p092pt.search.suggestions.SearchSuggestionManager;
import cm.aptoide.p092pt.search.suggestions.SearchSuggestionRemoteRepository;
import cm.aptoide.p092pt.search.suggestions.TrendingManager;
import cm.aptoide.p092pt.search.suggestions.TrendingService;
import cm.aptoide.p092pt.search.view.SearchResultFragment;
import cm.aptoide.p092pt.search.view.SearchResultFragment_MembersInjector;
import cm.aptoide.p092pt.search.view.SearchResultPresenter;
import cm.aptoide.p092pt.socialmedia.SocialMediaAnalytics;
import cm.aptoide.p092pt.socialmedia.SocialMediaNavigator;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StorePersistence;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.store.view.AddStoreDialog;
import cm.aptoide.p092pt.store.view.AddStoreDialog_MembersInjector;
import cm.aptoide.p092pt.store.view.ListStoresFragment;
import cm.aptoide.p092pt.store.view.ListStoresFragment_MembersInjector;
import cm.aptoide.p092pt.store.view.PrivateStoreDialog;
import cm.aptoide.p092pt.store.view.PrivateStoreDialog_MembersInjector;
import cm.aptoide.p092pt.store.view.StoreFragment;
import cm.aptoide.p092pt.store.view.StoreFragment_MembersInjector;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment_MembersInjector;
import cm.aptoide.p092pt.store.view.StoreTabWidgetsGridRecyclerFragment;
import cm.aptoide.p092pt.store.view.StoreTabWidgetsGridRecyclerFragment_MembersInjector;
import cm.aptoide.p092pt.store.view.TopStoresFragment;
import cm.aptoide.p092pt.store.view.TopStoresFragment_MembersInjector;
import cm.aptoide.p092pt.store.view.p104my.MyStoresFragment;
import cm.aptoide.p092pt.store.view.p104my.MyStoresFragment_MembersInjector;
import cm.aptoide.p092pt.store.view.p104my.MyStoresNavigator;
import cm.aptoide.p092pt.store.view.p104my.MyStoresPresenter;
import cm.aptoide.p092pt.store.view.p104my.MyStoresSubscribedFragment;
import cm.aptoide.p092pt.store.view.p104my.MyStoresSubscribedFragment_MembersInjector;
import cm.aptoide.p092pt.store.view.recommended.RecommendedStoresFragment;
import cm.aptoide.p092pt.store.view.recommended.RecommendedStoresFragment_MembersInjector;
import cm.aptoide.p092pt.sync.SyncScheduler;
import cm.aptoide.p092pt.sync.alarm.SyncStorage;
import cm.aptoide.p092pt.themes.NewFeature;
import cm.aptoide.p092pt.themes.NewFeatureDialogFragment;
import cm.aptoide.p092pt.themes.NewFeatureDialogFragment_MembersInjector;
import cm.aptoide.p092pt.themes.NewFeatureManager;
import cm.aptoide.p092pt.themes.ThemeAnalytics;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowersFragment;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowersFragment_MembersInjector;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowingFragment;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowingFragment_MembersInjector;
import cm.aptoide.p092pt.toolbox.ToolboxContentProvider;
import cm.aptoide.p092pt.toolbox.ToolboxContentProvider_MembersInjector;
import cm.aptoide.p092pt.updates.UpdateMapper;
import cm.aptoide.p092pt.updates.UpdatePersistence;
import cm.aptoide.p092pt.updates.UpdateRepository;
import cm.aptoide.p092pt.updates.UpdatesAnalytics;
import cm.aptoide.p092pt.updates.view.excluded.ExcludedUpdatesFragment;
import cm.aptoide.p092pt.updates.view.excluded.ExcludedUpdatesFragment_MembersInjector;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import cm.aptoide.p092pt.utils.FileUtils;
import cm.aptoide.p092pt.utils.p106q.QManager;
import cm.aptoide.p092pt.view.ActivityComponent;
import cm.aptoide.p092pt.view.ActivityModule;
import cm.aptoide.p092pt.view.ActivityModule_ProvideAccountNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideAccountPermissionProviderFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideApkFyFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideAutoUpdateManagerFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideBottomNavigationMapperFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideBottomNavigationNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideClientSdkVersionFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideDeepLinkManagerFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideFragmentManagerFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideImagePickerNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideListStoreAppsNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideLocalVersionCodeFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideMainFragmentNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideMainPresenterFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideManageStoreNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideManageUserNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideMyAccountNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidePackageNameFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidePhotoFileGeneratorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideScreenOrientationManagerFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvideUriToPathResolverFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesAppCoinsInfoNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesAppNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesAppViewNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesAutoUpdateRepositoryFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesAutoUpdateServiceFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesBottomNavigationAnalyticsFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesCatappultNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesClaimPromotionsNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesDialogUtilsFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesExternalNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesListAppsMoreRepositoryFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesPromotionsNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesScreenHeightFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesScreenWidthFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesSearchNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesSocialMediaNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesThemeManagerFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesWalletInstallAnalyticsFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesWalletInstallConfigurationFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesWalletInstallManagerFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesWalletInstallNavigatorFactory;
import cm.aptoide.p092pt.view.ActivityModule_ProvidesWalletInstallPresenterFactory;
import cm.aptoide.p092pt.view.AppCoinsInfoNavigator;
import cm.aptoide.p092pt.view.AppCoinsInfoPresenter;
import cm.aptoide.p092pt.view.AppViewConfiguration;
import cm.aptoide.p092pt.view.BaseActivity;
import cm.aptoide.p092pt.view.BundleEvent;
import cm.aptoide.p092pt.view.C4682xf1dd651;
import cm.aptoide.p092pt.view.C4683xd0ca61e4;
import cm.aptoide.p092pt.view.DeepLinkManager;
import cm.aptoide.p092pt.view.FragmentComponent;
import cm.aptoide.p092pt.view.FragmentModule;
import cm.aptoide.p092pt.view.FragmentModule_EditorialListAnalyticsFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideAccountErrorMapperFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideCheckYourEmailPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideCreateUserErrorMapperFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideEarnAppCoinsListPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideEarnAppcListAnalyticsFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideEarnAppcListManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideEarnAppcNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideHomeFragmentNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideImagePickerPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideImageValidatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideLoginSignUpPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideManageStoreErrorMapperFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideManageStorePresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideManageUserPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideSearchResultPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvideSendMagicLinkPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesAppCoinsInfoPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesAppMapperFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesAppViewConfigurationFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesAppViewManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesAppViewModelManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesAppViewPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesAppsManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesAppsNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesAppsPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesAutoUpdateDialogPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesBundleEventFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesCheckYourEmailNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesClaimPromotionDialogPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesClaimPromotionsManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesDarkthemeDialogPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesDownloadDialogManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesDownloadNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesDownloadViewActionPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesEditorialAnalyticsFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesEditorialListManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesEditorialListNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesEditorialListPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesEditorialListRepositoryFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesEditorialManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesEditorialNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesEditorialPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesEditorialRepositoryFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesEditorialServiceFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesFlagManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesFlagServiceFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesGetStoreManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesGetStoreWidgetsPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesHomeAnalyticsFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesHomeContainerNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesHomeContainerPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesHomeFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesHomeNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesHomePresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesListAppsConfigurationFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesListAppsMoreConfigurationFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesListAppsMoreManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesListAppsMorePresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesMyStoreNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesMyStorePresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesOutOfSpaceManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesOutOfSpaceNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesPromotionsPresenterFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesRewardAppCoinsAppsRepositoryFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesSearchManagerFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesSendMagicLinkNavigatorFactory;
import cm.aptoide.p092pt.view.FragmentModule_ProvidesWizardPresenterFactory;
import cm.aptoide.p092pt.view.MainActivity;
import cm.aptoide.p092pt.view.MainActivity_MembersInjector;
import cm.aptoide.p092pt.view.ThemedActivityView;
import cm.aptoide.p092pt.view.ThemedActivityView_MembersInjector;
import cm.aptoide.p092pt.view.app.AppCenter;
import cm.aptoide.p092pt.view.app.AppCenterRepository;
import cm.aptoide.p092pt.view.app.AppService;
import cm.aptoide.p092pt.view.app.ListStoreAppsFragment;
import cm.aptoide.p092pt.view.app.ListStoreAppsFragment_MembersInjector;
import cm.aptoide.p092pt.view.app.ListStoreAppsNavigator;
import cm.aptoide.p092pt.view.dialog.DialogUtils;
import cm.aptoide.p092pt.view.feedback.SendFeedbackFragment;
import cm.aptoide.p092pt.view.feedback.SendFeedbackFragment_MembersInjector;
import cm.aptoide.p092pt.view.fragment.BaseBottomSheetDialogFragment;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment_MembersInjector;
import cm.aptoide.p092pt.view.fragment.DescriptionFragment;
import cm.aptoide.p092pt.view.fragment.DescriptionFragment_MembersInjector;
import cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeWithToolbarFragment;
import cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeWithToolbarFragment_MembersInjector;
import cm.aptoide.p092pt.view.settings.MyAccountFragment;
import cm.aptoide.p092pt.view.settings.MyAccountFragment_MembersInjector;
import cm.aptoide.p092pt.view.settings.MyAccountNavigator;
import cm.aptoide.p092pt.view.settings.SettingsFragment;
import cm.aptoide.p092pt.view.settings.SettingsFragment_MembersInjector;
import cm.aptoide.p092pt.view.settings.SupportEmailProvider;
import cm.aptoide.p092pt.view.wizard.WizardFragment;
import cm.aptoide.p092pt.view.wizard.WizardFragmentProvider;
import cm.aptoide.p092pt.view.wizard.WizardFragment_MembersInjector;
import cm.aptoide.p092pt.view.wizard.WizardPageTwoFragment;
import cm.aptoide.p092pt.view.wizard.WizardPageTwoFragment_MembersInjector;
import cm.aptoide.p092pt.view.wizard.WizardPresenter;
import cm.aptoide.p092pt.wallet.WalletAppProvider;
import cm.aptoide.p092pt.wallet.WalletInstallActivity;
import cm.aptoide.p092pt.wallet.WalletInstallActivity_MembersInjector;
import cm.aptoide.p092pt.wallet.WalletInstallAnalytics;
import cm.aptoide.p092pt.wallet.WalletInstallConfiguration;
import cm.aptoide.p092pt.wallet.WalletInstallManager;
import cm.aptoide.p092pt.wallet.WalletInstallNavigator;
import cm.aptoide.p092pt.wallet.WalletInstallPresenter;
import com.aptoide.authenticationrx.AptoideAuthenticationRx;
import com.facebook.InterfaceC5958y;
import com.facebook.p157o0.C5813a0;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.safetynet.SafetyNetClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p241e.p294g.p306b.C8986a;
import p317f.p318b.C9054a;
import p317f.p318b.C9055b;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class DaggerApplicationComponent implements ApplicationComponent {
    private final DaggerApplicationComponent applicationComponent;
    private Provider<DownloadStatusMapper> downloadStatusMapperProvider;
    private Provider<FilePathProvider> filePathManagerProvider;
    private Provider<AccountAnalytics> provideAccountAnalyticsProvider;
    private Provider<AccountFactory> provideAccountFactoryProvider;
    private Provider<AccountManager> provideAccountManagerProvider;
    private Provider<AccountService> provideAccountServiceProvider;
    private Provider<BodyInterceptor<BaseBody>> provideAccountSettingsBodyInterceptorPoolV7Provider;
    private Provider<String> provideAccountTypeProvider;
    private Provider<AdsRepository> provideAdsRepositoryProvider;
    private Provider<AdultContentAnalytics> provideAdultContentAnalyticsProvider;
    private Provider<AdultContent> provideAdultContentProvider;
    private Provider<AndroidAccountProvider> provideAndroidAccountProvider;
    private Provider<String> provideApkPathProvider;
    private Provider<ApkfyManager> provideApkfyManagerProvider;
    private Provider<ApkfyService> provideApkfyServiceProvider;
    private Provider<C5813a0> provideAppEventsLoggerProvider;
    private Provider<AppSizeAnalyticsStringMapper> provideAppSizeAnalyticsStringMapperProvider;
    private Provider<AptoideAccountManager> provideAptoideAccountManagerProvider;
    private Provider<AptoideDownloadManager> provideAptoideDownloadManagerProvider;
    private Provider<OkHttpClient> provideAptoideMMpOkHttpClientProvider;
    private Provider<String> provideAptoideMmpBaseHostProvider;
    private Provider<String> provideAptoidePackageProvider;
    private Provider<AuthenticationPersistence> provideAuthenticationPersistenceProvider;
    private Provider<BodyInterceptor<BaseBody>> provideBodyInterceptorPoolV7Provider;
    private Provider<BodyInterceptor<BaseBody>> provideBodyInterceptorWebV7Provider;
    private Provider<CacheHelper> provideCacheHelperProvider;
    private Provider<String> provideCachePathProvider;
    private Provider<InterfaceC5958y> provideCallbackManagerProvider;
    private Provider<CampaignManager> provideCampaignManagerProvider;
    private Provider<CampaignMapper> provideCampaignMapperProvider;
    private Provider<CampaignRepository> provideCampaignRepositoryProvider;
    private Provider<ContentResolver> provideContentResolverProvider;
    private Provider<DeepLinkAnalytics> provideDeepLinkAnalyticsProvider;
    private Provider<List<String>> provideDefaultFollowedStoresProvider;
    private Provider<Installer> provideDefaultInstallerProvider;
    private Provider<Preferences> provideDefaultPreferencesProvider;
    private Provider<DownloadFactory> provideDownloadFactoryProvider;
    private Provider<DownloadPersistence> provideDownloadPersistenceProvider;
    private Provider<DownloadSpeedIntervalMapper> provideDownloadSpeedIntervalMapperProvider;
    private Provider<DownloadsRepository> provideDownloadsRepositoryProvider;
    private Provider<String> provideExtraIDProvider;
    private Provider<Collection<String>> provideFacebookEventsProvider;
    private Provider<FileUtils> provideFileUtilsProvider;
    private Provider<FirebaseAnalytics> provideFirebaseAnalyticsProvider;
    private Provider<FirebaseNotificationAnalytics> provideFirebaseNotificationAnalyticsProvider;
    private Provider<Collection<String>> provideFlurryEventsProvider;
    private Provider<Map<Integer, Result>> provideFragmentNavigatorMapProvider;
    private Provider<C8986a<Map<Integer, Result>>> provideFragmentNavigatorRelayProvider;
    private Provider<GoogleApiClient> provideGoogleApiClientProvider;
    private Provider<String> provideHomePromotionsIdProvider;
    private Provider<IdsRepository> provideIdsRepositoryProvider;
    private Provider<InstallAnalytics> provideInstallAnalyticsProvider;
    private Provider<InstallationProvider> provideInstallationProvider;
    private Provider<AptoideInstalledAppsRepository> provideInstalledRepositoryProvider;
    private Provider<InvalidRefreshTokenLogoutManager> provideInvalidRefreshTokenLogoutManagerProvider;
    private Provider<L2Cache> provideL2CacheProvider;
    private Provider<LocalPersistenceAdultContent> provideLocalAdultContentProvider;
    private Provider<LoginPreferences> provideLoginPreferencesProvider;
    private Provider<OkHttpClient> provideLongTimeoutOkHttpClientProvider;
    private Provider<String> provideMarketNameProvider;
    private Provider<MarketResourceFormatter> provideMarketResourceFormatterProvider;
    private Provider<MultipartBodyInterceptor> provideMultipartBodyInterceptorProvider;
    private Provider<NavigationTracker> provideNavigationTrackerProvider;
    private Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> provideNoAuthenticationBodyInterceptorV3Provider;
    private Provider<ObjectMapper> provideNonNullObjectMapperProvider;
    private Provider<NotificationAnalytics> provideNotificationAnalyticsProvider;
    private Provider<NotificationProvider> provideNotificationProvider;
    private Provider<OAuthModeProvider> provideOAuthModeProvider;
    private Provider<String> provideObbPathProvider;
    private Provider<OkHttpClient> provideOkHttpClientProvider;
    private Provider<PageViewsAnalytics> providePageViewsAnalyticsProvider;
    private Provider<String> providePartnerIDProvider;
    private Provider<PermissionManager> providePermissionManagerProvider;
    private Provider<PromotionsManager> providePromotionsManagerProvider;
    private Provider<QManager> provideQManagerProvider;
    private Provider<RequestBodyFactory> provideRequestBodyFactoryProvider;
    private Provider<Resources> provideResourcesProvider;
    private Provider<Interceptor> provideRetrofitLogInterceptorProvider;
    private Provider<RoomInstalledPersistence> provideRoomInstalledPersistenceProvider;
    private Provider<RoomNotificationPersistence> provideRoomNotificationPersistenceProvider;
    private Provider<RootAvailabilityManager> provideRootAvailabilityManagerProvider;
    private Provider<RootInstallationRetryHandler> provideRootInstallationRetryHandlerProvider;
    private Provider<String> provideSearchBaseUrlProvider;
    private Provider<SecureCoderDecoder> provideSecureCoderDecoderProvider;
    private Provider<SplitTypeSubFileTypeMapper> provideSplitTypeSubFileTypeMapperProvider;
    private Provider<StoreManager> provideStoreManagerProvider;
    private Provider<StoreUtilsProxy> provideStoreUtilsProxyProvider;
    private Provider<SyncScheduler> provideSyncSchedulerProvider;
    private Provider<SyncStorage> provideSyncStorageProvider;
    private Provider<TokenInvalidator> provideTokenInvalidatorProvider;
    private Provider<Interceptor> provideUserAgentInterceptorDownloadsProvider;
    private Provider<Interceptor> provideUserAgentInterceptorProvider;
    private Provider<Interceptor> provideUserAgentInterceptorV8Provider;
    private Provider<OkHttpClient> provideV8OkHttpClientProvider;
    private Provider<WindowManager> provideWindowManagerProvider;
    private Provider<AccountPersistence> providesAccountPersistenceProvider;
    private Provider<AdMapper> providesAdMapperProvider;
    private Provider<AdsApplicationVersionCodeProvider> providesAdsApplicationVersionCodeProvider;
    private Provider<AdsManager> providesAdsManagerProvider;
    private Provider<AgentPersistence> providesAgentPersistenceProvider;
    private Provider<AnalyticsLogger> providesAnalyticsDebugLoggerProvider;
    private Provider<AnalyticsManager> providesAnalyticsManagerProvider;
    private Provider<AnalyticsEventParametersNormalizer> providesAnalyticsNormalizerProvider;
    private Provider<Retrofit> providesApiChainBDSRetrofitProvider;
    private Provider<String> providesApichainBdsBaseHostProvider;
    private Provider<AptoideApkfyService.ServiceApi> providesApkfyServiceApiProvider;
    private Provider<AppCenter> providesAppCenterProvider;
    private Provider<AppCenterRepository> providesAppCenterRepositoryProvider;
    private Provider<AppCoinsAdvertisingManager> providesAppCoinsAdvertisingManagerProvider;
    private Provider<AppCoinsManager> providesAppCoinsManagerProvider;
    private Provider<AppCoinsService> providesAppCoinsServiceProvider;
    private Provider<AppComingSoonRegistrationManager> providesAppComingSoonPreferencesManagerProvider;
    private Provider<AppComingSoonRegistrationPersistence> providesAppComingSoonRegistrationPersistenceProvider;
    private Provider<AppDownloaderProvider> providesAppDownloaderProvider;
    private Provider<AppInBackgroundTracker> providesAppInBackgroundTrackerProvider;
    private Provider<AppInstaller> providesAppInstallerProvider;
    private Provider<AppInstallerStatusReceiver> providesAppInstallerStatusReceiverProvider;
    private Provider<AppService> providesAppServiceProvider;
    private Provider<AppShortcutsAnalytics> providesAppShortcutsAnalyticsProvider;
    private Provider<AppValidationAnalytics> providesAppValidationAnalyticsProvider;
    private Provider<AppValidator> providesAppValidatorProvider;
    private Provider<AppViewAnalytics> providesAppViewAnalyticsProvider;
    private Provider<AppcMigrationPersistence> providesAppcMigrationAccessorProvider;
    private Provider<AppcMigrationManager> providesAppcMigrationManagerProvider;
    private Provider<AppcMigrationRepository> providesAppcMigrationServiceProvider;
    private Provider<String> providesAppsFlyerBaseUrlProvider;
    private Provider<AppsFlyerManager> providesAppsFlyerManagerProvider;
    private Provider<AppsFlyerRepository> providesAppsFlyerRepositoryProvider;
    private Provider<Retrofit> providesAppsFlyerRetrofitProvider;
    private Provider<AppsFlyerService> providesAppsFlyerServiceProvider;
    private Provider<AptoideAuthenticationRx> providesAptoideAuthenticationProvider;
    private Provider<AptoideDatabase> providesAptoideDataBaseProvider;
    private Provider<AptoideInstallManager> providesAptoideInstallManagerProvider;
    private Provider<AptoideInstallPersistence> providesAptoideInstallPersistenceProvider;
    private Provider<AptoideInstallRepository> providesAptoideInstallRepositoryProvider;
    private Provider<OkHttpClient.Builder> providesAptoideMMPOkHttpBuilderProvider;
    private Provider<AptoideMd5Manager> providesAptoideMd5ManagerProvider;
    private Provider<Retrofit> providesAptoideMmpRetrofitProvider;
    private Provider<Service> providesAutoUpdateServiceProvider;
    private Provider<String> providesBaseHostCacheProvider;
    private Provider<String> providesBaseRakamHostProvider;
    private Provider<String> providesBaseWebservicesHostProvider;
    private Provider<BlacklistManager> providesBlacklistManagerProvider;
    private Provider<BlacklistPersistence> providesBlacklistPersistenceProvider;
    private Provider<Blacklister> providesBlacklisterProvider;
    private Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> providesBodyInterceptorV3Provider;
    private Provider<BonusAppcRemoteService.ServiceApi> providesBonusAppcServiceApiProvider;
    private Provider<BonusAppcService> providesBonusAppcServiceProvider;
    private Provider<BundlesRepository> providesBundleRepositoryProvider;
    private Provider<BlacklistUnitMapper> providesBundleToBlacklistUnitMapperProvider;
    private Provider<BundlesResponseMapper> providesBundlesMapperProvider;
    private Provider<CallAdapter.Factory> providesCallAdapterFactoryProvider;
    private Provider<CampaignAnalytics> providesCampaignAnalyticsProvider;
    private Provider<CaptionBackgroundPainter> providesCaptionBackgroundPainterProvider;
    private Provider<ChipManager> providesChipManagerProvider;
    private Provider<ComingSoonNotificationManager> providesComingSoonNotificationManagerProvider;
    private Provider<ConnectivityManager> providesConnectivityManagerProvider;
    private Provider<Converter.Factory> providesConverterFactoryProvider;
    private Provider<CrashReport> providesCrashReportsProvider;
    private Provider<DatabaseStoreDataPersist> providesDatabaseStoreDataPersistProvider;
    private Provider<DecimalFormat> providesDecimalFormatProvider;
    private Provider<SharedPreferences> providesDefaultSharedPerefencesProvider;
    private Provider<DownloadAnalytics> providesDownloadAnalyticsProvider;
    private Provider<DownloadAppFileMapper> providesDownloadAppFileMapperProvider;
    private Provider<DownloadAppMapper> providesDownloadAppMapperProvider;
    private Provider<DownloadStateParser> providesDownloadStateParserProvider;
    private Provider<DownloadStatusManager> providesDownloadStatusManagerProvider;
    private Provider<DynamicSplitsRemoteService.DynamicSplitsApi> providesDynamicSplitsApiProvider;
    private Provider<DynamicSplitsManager> providesDynamicSplitsManagerProvider;
    private Provider<DynamicSplitsMapper> providesDynamicSplitsMapperProvider;
    private Provider<DynamicSplitsService> providesDynamicSplitsServiceProvider;
    private Provider<EditorialService> providesEditorialServiceProvider;
    private Provider<EventLogger> providesFacebookEventLoggerProvider;
    private Provider<List<String>> providesFacebookLoginPermissionsProvider;
    private Provider<FileDownloaderProvider> providesFileDownloaderProvider;
    private Provider<FileManager> providesFileManagerProvider;
    private Provider<EventLogger> providesFirebaseEventLoggerProvider;
    private Provider<Collection<String>> providesFirebaseEventsProvider;
    private Provider<FirstLaunchAnalytics> providesFirstLaunchAnalyticsProvider;
    private Provider<FirstLaunchManager> providesFirstLaunchManagerProvider;
    private Provider<EventLogger> providesFlurryEventLoggerProvider;
    private Provider<FlurryEventLogger> providesFlurryLoggerProvider;
    private Provider<SessionLogger> providesFlurrySessionLoggerProvider;
    private Provider<FollowedStoresManager> providesFollowedStoresManagerProvider;
    private Provider<ForegroundManager> providesForegroundManagerProvider;
    private Provider<GmsStatusValueProvider> providesGmsStatusValueProvider;
    private Provider<ImageInfoProvider> providesImageInfoProvider;
    private Provider<EventLogger> providesIndicativeEventLoggerProvider;
    private Provider<Collection<String>> providesIndicativeEventsProvider;
    private Provider<InstallAppSizeValidator> providesInstallAppSizeValidatorProvider;
    private Provider<InstallManager> providesInstallManagerProvider;
    private Provider<RoomInstallationPersistence> providesInstallationAccessorProvider;
    private Provider<InstallerAnalytics> providesInstallerAnalyticsProvider;
    private Provider<LaunchManager> providesLaunchManagerProvider;
    private Provider<Retrofit> providesLoadTopReactionsRetrofitProvider;
    private Provider<LocalNotificationSyncManager> providesLocalNotificationSyncManagerProvider;
    private Provider<LoginSignupManager> providesLoginSignupManagerProvider;
    private Provider<MapToJsonMapper> providesMapToJsonMapperProvider;
    private Provider<Md5Comparator> providesMd5ComparatorProvider;
    private Provider<MoPubAdsManager> providesMoPubAdsManagerProvider;
    private Provider<MyAccountManager> providesMyAccountManagerProvider;
    private Provider<NetworkOperatorManager> providesNetworkOperatorManagerProvider;
    private Provider<NewFeatureManager> providesNewFeatureManagerProvider;
    private Provider<NewFeature> providesNewFeatureProvider;
    private Provider<NewsletterManager> providesNewsletterManagerProvider;
    private Provider<OemidProvider> providesOemidProvider;
    private Provider<OkHttpClient.Builder> providesOkHttpBuilderProvider;
    private Provider<PackageRepository> providesPackageRepositoryProvider;
    private Provider<PromotionViewAppMapper> providesPromotionViewAppMapperProvider;
    private Provider<PromotionsAnalytics> providesPromotionsAnalyticsProvider;
    private Provider<PromotionsPreferencesManager> providesPromotionsPreferencesManagerProvider;
    private Provider<PromotionsService> providesPromotionsServiceProvider;
    private Provider<EventLogger> providesRakamEventLoggerProvider;
    private Provider<Collection<String>> providesRakamEventsProvider;
    private Provider<String> providesReactionsHostProvider;
    private Provider<ReactionsManager> providesReactionsManagerProvider;
    private Provider<ReactionsService> providesReactionsServiceProvider;
    private Provider<ReactionsRemoteService.ServiceV8> providesReactionsServiceV8Provider;
    private Provider<ReadyToInstallNotificationManager> providesReadyToInstallNotificationManagerProvider;
    private Provider<BundleDataSource> providesRemoteBundleDataSourceProvider;
    private Provider<RetryFileDownloaderProvider> providesRetryFileDownloaderProvider;
    private Provider<ReviewsManager> providesReviewsManagerProvider;
    private Provider<ReviewsRepository> providesReviewsRepositoryProvider;
    private Provider<ReviewsService> providesReviewsServiceProvider;
    private Provider<RoomInstallationMapper> providesRoomInstallationMapperProvider;
    private Provider<RoomLocalNotificationSyncPersistence> providesRoomLocalNotificationSyncPersistenceProvider;
    private Provider<RoomMigrationProvider> providesRoomMigrationProvider;
    private Provider<RoomStoredMinimalAdPersistence> providesRoomStoreMinimalAdPersistenceProvider;
    private Provider<RoomStoreRepository> providesRoomStoreRepositoryProvider;
    private Provider<RootInstallerProvider> providesRootInstallerProvider;
    private Provider<SafetyNetClient> providesSafetyNetClientProvider;
    private Provider<SearchAnalytics> providesSearchAnalyticsProvider;
    private Provider<SearchRepository> providesSearchRepositoryProvider;
    private Provider<SearchSuggestionManager> providesSearchSuggestionManagerProvider;
    private Provider<SearchSuggestionRemoteRepository> providesSearchSuggestionRemoteRepositoryProvider;
    private Provider<Retrofit> providesSearchSuggestionsRetrofitProvider;
    private Provider<SecurePreferences> providesSecurePerefencesProvider;
    private Provider<SharedPreferences> providesSecureSharedPreferencesProvider;
    private Provider<SettingsManager> providesSettingsManagerProvider;
    private Provider<AptoideShortcutManager> providesShortcutManagerProvider;
    private Provider<SocialMediaAnalytics> providesSocialMediaAnalyticsProvider;
    private Provider<SplitsMapper> providesSplitsMapperProvider;
    private Provider<StoreAnalytics> providesStoreAnalyticsProvider;
    private Provider<StoreCredentialsProvider> providesStoreCredentialsProvider;
    private Provider<StorePersistence> providesStorePersistenceProvider;
    private Provider<String> providesSupportEmailProvider;
    private Provider<SupportEmailProvider> providesSupportEmailProvider2;
    private Provider<TelephonyManager> providesTelephonyManagerProvider;
    private Provider<ThemeAnalytics> providesThemeAnalyticsProvider;
    private Provider<TrendingManager> providesTrendingManagerProvider;
    private Provider<TrendingService> providesTrendingServiceProvider;
    private Provider<UpdateLaunchManager> providesUpdateLaunchManagerProvider;
    private Provider<UpdateMapper> providesUpdateMapperProvider;
    private Provider<UpdatePersistence> providesUpdatePersistenceProvider;
    private Provider<UpdateRepository> providesUpdateRepositoryProvider;
    private Provider<UpdatesAnalytics> providesUpdatesAnalyticsProvider;
    private Provider<UpdatesManager> providesUpdatesManagerProvider;
    private Provider<UpdatesNotificationManager> providesUpdatesNotificationManagerProvider;
    private Provider<AptoideWorkerFactory> providesUpdatesNotificationWorkerFactoryProvider;
    private Provider<UserFeedbackAnalytics> providesUserFeedbackAnalyticsProvider;
    private Provider<PreferencesPersister> providesUserPreferencesPersisterProvider;
    private Provider<Retrofit> providesV7CacheRetrofitProvider;
    private Provider<WalletAdsOfferCardManager> providesWalletAdsOfferCardManagerProvider;
    private Provider<WalletAdsOfferManager> providesWalletAdsOfferManagerProvider;
    private Provider<WalletAppProvider> providesWalletAppProvider;
    private Provider<HttpKnockEventLogger> providesknockEventLoggerProvider;
    private Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;

    private static final class ActivityComponentImpl implements ActivityComponent {
        private final ActivityComponentImpl activityComponentImpl;
        private final DaggerApplicationComponent applicationComponent;
        private Provider<AccountNavigator> provideAccountNavigatorProvider;
        private Provider<AccountPermissionProvider> provideAccountPermissionProvider;
        private Provider<ApkFyParser> provideApkFyProvider;
        private Provider<AutoUpdateManager> provideAutoUpdateManagerProvider;
        private Provider<BottomNavigationMapper> provideBottomNavigationMapperProvider;
        private Provider<BottomNavigationNavigator> provideBottomNavigationNavigatorProvider;
        private Provider<Integer> provideClientSdkVersionProvider;
        private Provider<DeepLinkManager> provideDeepLinkManagerProvider;
        private Provider<FragmentManager> provideFragmentManagerProvider;
        private Provider<ImagePickerNavigator> provideImagePickerNavigatorProvider;
        private Provider<ListStoreAppsNavigator> provideListStoreAppsNavigatorProvider;
        private Provider<Integer> provideLocalVersionCodeProvider;
        private Provider<FragmentNavigator> provideMainFragmentNavigatorProvider;
        private Provider<Presenter> provideMainPresenterProvider;
        private Provider<ManageStoreNavigator> provideManageStoreNavigatorProvider;
        private Provider<ManageUserNavigator> provideManageUserNavigatorProvider;
        private Provider<MyAccountNavigator> provideMyAccountNavigatorProvider;
        private Provider<String> providePackageNameProvider;
        private Provider<PhotoFileGenerator> providePhotoFileGeneratorProvider;
        private Provider<ScreenOrientationManager> provideScreenOrientationManagerProvider;
        private Provider<UriToPathResolver> provideUriToPathResolverProvider;
        private Provider<AppCoinsInfoNavigator> providesAppCoinsInfoNavigatorProvider;
        private Provider<AppNavigator> providesAppNavigatorProvider;
        private Provider<AppViewNavigator> providesAppViewNavigatorProvider;
        private Provider<AutoUpdateRepository> providesAutoUpdateRepositoryProvider;
        private Provider<AutoUpdateService> providesAutoUpdateServiceProvider;
        private Provider<BottomNavigationAnalytics> providesBottomNavigationAnalyticsProvider;
        private Provider<CatappultNavigator> providesCatappultNavigatorProvider;
        private Provider<ClaimPromotionsNavigator> providesClaimPromotionsNavigatorProvider;
        private Provider<DialogUtils> providesDialogUtilsProvider;
        private Provider<ExternalNavigator> providesExternalNavigatorProvider;
        private Provider<ListAppsMoreRepository> providesListAppsMoreRepositoryProvider;
        private Provider<PromotionsNavigator> providesPromotionsNavigatorProvider;
        private Provider<Float> providesScreenHeightProvider;
        private Provider<Float> providesScreenWidthProvider;
        private Provider<SearchNavigator> providesSearchNavigatorProvider;
        private Provider<SocialMediaNavigator> providesSocialMediaNavigatorProvider;
        private Provider<ThemeManager> providesThemeManagerProvider;
        private Provider<WalletInstallAnalytics> providesWalletInstallAnalyticsProvider;
        private Provider<WalletInstallConfiguration> providesWalletInstallConfigurationProvider;
        private Provider<WalletInstallManager> providesWalletInstallManagerProvider;
        private Provider<WalletInstallNavigator> providesWalletInstallNavigatorProvider;
        private Provider<WalletInstallPresenter> providesWalletInstallPresenterProvider;

        private void initialize(ActivityModule activityModule, FlavourActivityModule flavourActivityModule) {
            this.providesThemeManagerProvider = C9054a.m29108a(ActivityModule_ProvidesThemeManagerFactory.create(activityModule));
            this.provideFragmentManagerProvider = C9054a.m29108a(ActivityModule_ProvideFragmentManagerFactory.create(activityModule));
            this.provideMainFragmentNavigatorProvider = C9054a.m29108a(ActivityModule_ProvideMainFragmentNavigatorFactory.create(activityModule, this.applicationComponent.provideFragmentNavigatorMapProvider, this.applicationComponent.provideFragmentNavigatorRelayProvider, this.provideFragmentManagerProvider));
            Provider<BottomNavigationAnalytics> providerM29108a = C9054a.m29108a(ActivityModule_ProvidesBottomNavigationAnalyticsFactory.create(activityModule, this.applicationComponent.providesAnalyticsManagerProvider, this.applicationComponent.provideNavigationTrackerProvider));
            this.providesBottomNavigationAnalyticsProvider = providerM29108a;
            this.provideBottomNavigationNavigatorProvider = C9054a.m29108a(ActivityModule_ProvideBottomNavigationNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, providerM29108a, this.applicationComponent.providesSearchAnalyticsProvider, this.providesThemeManagerProvider));
            this.provideAccountNavigatorProvider = C9054a.m29108a(ActivityModule_ProvideAccountNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, this.applicationComponent.provideAptoideAccountManagerProvider, this.applicationComponent.provideCallbackManagerProvider, this.applicationComponent.provideGoogleApiClientProvider, this.applicationComponent.provideAccountAnalyticsProvider, this.provideBottomNavigationNavigatorProvider, this.providesThemeManagerProvider));
            this.provideBottomNavigationMapperProvider = C9054a.m29108a(ActivityModule_ProvideBottomNavigationMapperFactory.create(activityModule));
            this.provideApkFyProvider = C9054a.m29108a(ActivityModule_ProvideApkFyFactory.create(activityModule, this.applicationComponent.providesSecureSharedPreferencesProvider, this.applicationComponent.provideApkfyManagerProvider, this.applicationComponent.providesFirstLaunchAnalyticsProvider));
            Provider<AppNavigator> providerM29108a2 = C9054a.m29108a(ActivityModule_ProvidesAppNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider));
            this.providesAppNavigatorProvider = providerM29108a2;
            this.providesSearchNavigatorProvider = C9054a.m29108a(ActivityModule_ProvidesSearchNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, providerM29108a2));
            this.provideDeepLinkManagerProvider = C9054a.m29108a(ActivityModule_ProvideDeepLinkManagerFactory.create(activityModule, this.applicationComponent.provideStoreUtilsProxyProvider, this.provideMainFragmentNavigatorProvider, this.provideBottomNavigationNavigatorProvider, this.providesSearchNavigatorProvider, this.applicationComponent.providesDefaultSharedPerefencesProvider, this.applicationComponent.providesRoomStoreRepositoryProvider, this.applicationComponent.provideNavigationTrackerProvider, this.applicationComponent.providesSearchAnalyticsProvider, this.applicationComponent.provideDeepLinkAnalyticsProvider, this.applicationComponent.providesAppShortcutsAnalyticsProvider, this.applicationComponent.provideAptoideAccountManagerProvider, this.applicationComponent.providesStoreAnalyticsProvider, this.applicationComponent.provideAdsRepositoryProvider, this.providesAppNavigatorProvider, this.applicationComponent.providesInstallManagerProvider, this.applicationComponent.providesNewFeatureProvider, this.providesThemeManagerProvider, this.applicationComponent.providesThemeAnalyticsProvider, this.applicationComponent.providesReadyToInstallNotificationManagerProvider));
            Provider<String> providerM29108a3 = C9054a.m29108a(ActivityModule_ProvidePackageNameFactory.create(activityModule));
            this.providePackageNameProvider = providerM29108a3;
            this.provideLocalVersionCodeProvider = C9054a.m29108a(ActivityModule_ProvideLocalVersionCodeFactory.create(activityModule, providerM29108a3));
            this.provideClientSdkVersionProvider = C9054a.m29108a(ActivityModule_ProvideClientSdkVersionFactory.create(activityModule));
            Provider<AutoUpdateService> providerM29108a4 = C9054a.m29108a(ActivityModule_ProvidesAutoUpdateServiceFactory.create(activityModule, this.applicationComponent.providesAutoUpdateServiceProvider, this.providePackageNameProvider, this.provideClientSdkVersionProvider));
            this.providesAutoUpdateServiceProvider = providerM29108a4;
            this.providesAutoUpdateRepositoryProvider = C9054a.m29108a(ActivityModule_ProvidesAutoUpdateRepositoryFactory.create(activityModule, providerM29108a4));
            this.provideAutoUpdateManagerProvider = C9054a.m29108a(ActivityModule_ProvideAutoUpdateManagerFactory.create(activityModule, this.applicationComponent.provideDownloadFactoryProvider, this.applicationComponent.providePermissionManagerProvider, this.applicationComponent.providesInstallManagerProvider, this.applicationComponent.providesDownloadAnalyticsProvider, this.provideLocalVersionCodeProvider, this.providesAutoUpdateRepositoryProvider));
            this.provideMainPresenterProvider = C9054a.m29108a(ActivityModule_ProvideMainPresenterFactory.create(activityModule, this.applicationComponent.provideRootInstallationRetryHandlerProvider, this.provideApkFyProvider, this.applicationComponent.providesInstallManagerProvider, this.applicationComponent.providesDefaultSharedPerefencesProvider, this.applicationComponent.providesSecureSharedPreferencesProvider, this.provideMainFragmentNavigatorProvider, this.provideDeepLinkManagerProvider, this.provideBottomNavigationNavigatorProvider, this.applicationComponent.providesUpdatesManagerProvider, this.provideAutoUpdateManagerProvider, this.applicationComponent.provideRootAvailabilityManagerProvider, this.provideBottomNavigationMapperProvider, this.applicationComponent.provideAptoideAccountManagerProvider, this.provideAccountNavigatorProvider, this.applicationComponent.providesAgentPersistenceProvider));
            this.providesWalletInstallConfigurationProvider = C9054a.m29108a(ActivityModule_ProvidesWalletInstallConfigurationFactory.create(activityModule));
            this.providesWalletInstallNavigatorProvider = C9054a.m29108a(ActivityModule_ProvidesWalletInstallNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider));
            this.providesWalletInstallAnalyticsProvider = C9054a.m29108a(ActivityModule_ProvidesWalletInstallAnalyticsFactory.create(activityModule, this.applicationComponent.providesDownloadAnalyticsProvider, this.applicationComponent.provideNotificationAnalyticsProvider, this.applicationComponent.provideInstallAnalyticsProvider, this.applicationComponent.providesDownloadStateParserProvider, this.applicationComponent.providesAnalyticsManagerProvider, this.applicationComponent.provideNavigationTrackerProvider, this.applicationComponent.splitAnalyticsMapperProvider));
            Provider<WalletInstallManager> providerM29108a5 = C9054a.m29108a(ActivityModule_ProvidesWalletInstallManagerFactory.create(activityModule, this.applicationComponent.providesInstallManagerProvider, this.applicationComponent.provideDownloadFactoryProvider, this.applicationComponent.providesDownloadStateParserProvider, this.applicationComponent.providesMoPubAdsManagerProvider, this.providesWalletInstallAnalyticsProvider, this.applicationComponent.provideInstalledRepositoryProvider, this.applicationComponent.providesWalletAppProvider, this.applicationComponent.providesAppInstallerStatusReceiverProvider, this.applicationComponent.providesDynamicSplitsManagerProvider));
            this.providesWalletInstallManagerProvider = providerM29108a5;
            this.providesWalletInstallPresenterProvider = C9054a.m29108a(ActivityModule_ProvidesWalletInstallPresenterFactory.create(activityModule, this.providesWalletInstallConfigurationProvider, this.providesWalletInstallNavigatorProvider, providerM29108a5, this.providesWalletInstallAnalyticsProvider, this.applicationComponent.providesMoPubAdsManagerProvider));
            this.provideScreenOrientationManagerProvider = C9054a.m29108a(ActivityModule_ProvideScreenOrientationManagerFactory.create(activityModule));
            this.provideAccountPermissionProvider = C9054a.m29108a(ActivityModule_ProvideAccountPermissionProviderFactory.create(activityModule));
            this.providePhotoFileGeneratorProvider = C9054a.m29108a(ActivityModule_ProvidePhotoFileGeneratorFactory.create(activityModule));
            this.provideUriToPathResolverProvider = C9054a.m29108a(ActivityModule_ProvideUriToPathResolverFactory.create(activityModule));
            this.provideImagePickerNavigatorProvider = C9054a.m29108a(ActivityModule_ProvideImagePickerNavigatorFactory.create(activityModule));
            this.provideManageUserNavigatorProvider = C9054a.m29108a(ActivityModule_ProvideManageUserNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, this.provideBottomNavigationNavigatorProvider));
            this.provideManageStoreNavigatorProvider = C9054a.m29108a(ActivityModule_ProvideManageStoreNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, this.provideBottomNavigationNavigatorProvider));
            this.provideListStoreAppsNavigatorProvider = C9054a.m29108a(ActivityModule_ProvideListStoreAppsNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, this.providesAppNavigatorProvider));
            Provider<ExternalNavigator> providerM29108a6 = C9054a.m29108a(ActivityModule_ProvidesExternalNavigatorFactory.create(activityModule, this.providesThemeManagerProvider));
            this.providesExternalNavigatorProvider = providerM29108a6;
            Provider<SocialMediaNavigator> providerM29108a7 = C9054a.m29108a(ActivityModule_ProvidesSocialMediaNavigatorFactory.create(activityModule, providerM29108a6));
            this.providesSocialMediaNavigatorProvider = providerM29108a7;
            this.provideMyAccountNavigatorProvider = C9054a.m29108a(ActivityModule_ProvideMyAccountNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, this.provideAccountNavigatorProvider, this.providesAppNavigatorProvider, this.providesThemeManagerProvider, providerM29108a7));
            Provider<CatappultNavigator> providerM29108a8 = C9054a.m29108a(ActivityModule_ProvidesCatappultNavigatorFactory.create(activityModule, this.providesExternalNavigatorProvider));
            this.providesCatappultNavigatorProvider = providerM29108a8;
            this.providesAppViewNavigatorProvider = C9054a.m29108a(ActivityModule_ProvidesAppViewNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, this.providesAppNavigatorProvider, providerM29108a8));
            this.providesPromotionsNavigatorProvider = C9054a.m29108a(ActivityModule_ProvidesPromotionsNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, this.providesAppNavigatorProvider));
            this.providesDialogUtilsProvider = C9054a.m29108a(ActivityModule_ProvidesDialogUtilsFactory.create(activityModule, this.applicationComponent.provideAptoideAccountManagerProvider, this.provideAccountNavigatorProvider, this.applicationComponent.provideAccountSettingsBodyInterceptorPoolV7Provider, this.applicationComponent.provideOkHttpClientProvider, this.applicationComponent.providesConverterFactoryProvider, this.applicationComponent.provideInstalledRepositoryProvider, this.applicationComponent.provideTokenInvalidatorProvider, this.applicationComponent.providesDefaultSharedPerefencesProvider, this.applicationComponent.provideMarketResourceFormatterProvider, this.providesThemeManagerProvider, this.applicationComponent.providesUserFeedbackAnalyticsProvider));
            this.providesAppCoinsInfoNavigatorProvider = C9054a.m29108a(ActivityModule_ProvidesAppCoinsInfoNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, this.providesSocialMediaNavigatorProvider, this.providesCatappultNavigatorProvider));
            this.providesScreenWidthProvider = C9054a.m29108a(ActivityModule_ProvidesScreenWidthFactory.create(activityModule, this.applicationComponent.provideResourcesProvider));
            this.providesScreenHeightProvider = C9054a.m29108a(ActivityModule_ProvidesScreenHeightFactory.create(activityModule, this.applicationComponent.provideResourcesProvider));
            this.providesClaimPromotionsNavigatorProvider = C9054a.m29108a(ActivityModule_ProvidesClaimPromotionsNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, this.providesAppNavigatorProvider));
            this.providesListAppsMoreRepositoryProvider = C9054a.m29108a(ActivityModule_ProvidesListAppsMoreRepositoryFactory.create(activityModule, this.applicationComponent.providesStoreCredentialsProvider, this.applicationComponent.provideOkHttpClientProvider, this.applicationComponent.provideAccountSettingsBodyInterceptorPoolV7Provider, this.applicationComponent.provideTokenInvalidatorProvider, this.applicationComponent.providesDefaultSharedPerefencesProvider, this.applicationComponent.providesConverterFactoryProvider));
        }

        private ActivityResultNavigator injectActivityResultNavigator(ActivityResultNavigator activityResultNavigator) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(activityResultNavigator, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(activityResultNavigator, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(activityResultNavigator, (String) this.applicationComponent.provideMarketNameProvider.get());
            return activityResultNavigator;
        }

        private AnalyticsActivity injectAnalyticsActivity(AnalyticsActivity analyticsActivity) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(analyticsActivity, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(analyticsActivity, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(analyticsActivity, (String) this.applicationComponent.provideMarketNameProvider.get());
            AnalyticsActivity_MembersInjector.injectAnalyticsManager(analyticsActivity, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(analyticsActivity, (FirstLaunchAnalytics) this.applicationComponent.providesFirstLaunchAnalyticsProvider.get());
            return analyticsActivity;
        }

        private BaseDialogFragment injectBaseDialogFragment(BaseDialogFragment baseDialogFragment) {
            BaseDialogFragment_MembersInjector.injectThemeManager(baseDialogFragment, this.providesThemeManagerProvider.get());
            return baseDialogFragment;
        }

        private BottomNavigationActivity injectBottomNavigationActivity(BottomNavigationActivity bottomNavigationActivity) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(bottomNavigationActivity, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(bottomNavigationActivity, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(bottomNavigationActivity, (String) this.applicationComponent.provideMarketNameProvider.get());
            AnalyticsActivity_MembersInjector.injectAnalyticsManager(bottomNavigationActivity, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(bottomNavigationActivity, (FirstLaunchAnalytics) this.applicationComponent.providesFirstLaunchAnalyticsProvider.get());
            ThemedActivityView_MembersInjector.injectThemeManager(bottomNavigationActivity, this.providesThemeManagerProvider.get());
            BottomNavigationActivity_MembersInjector.injectBottomNavigationMapper(bottomNavigationActivity, this.provideBottomNavigationMapperProvider.get());
            BottomNavigationActivity_MembersInjector.injectBottomNavigationNavigator(bottomNavigationActivity, this.provideBottomNavigationNavigatorProvider.get());
            return bottomNavigationActivity;
        }

        private MainActivity injectMainActivity(MainActivity mainActivity) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(mainActivity, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(mainActivity, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(mainActivity, (String) this.applicationComponent.provideMarketNameProvider.get());
            AnalyticsActivity_MembersInjector.injectAnalyticsManager(mainActivity, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(mainActivity, (FirstLaunchAnalytics) this.applicationComponent.providesFirstLaunchAnalyticsProvider.get());
            ThemedActivityView_MembersInjector.injectThemeManager(mainActivity, this.providesThemeManagerProvider.get());
            BottomNavigationActivity_MembersInjector.injectBottomNavigationMapper(mainActivity, this.provideBottomNavigationMapperProvider.get());
            BottomNavigationActivity_MembersInjector.injectBottomNavigationNavigator(mainActivity, this.provideBottomNavigationNavigatorProvider.get());
            MainActivity_MembersInjector.injectPresenter(mainActivity, this.provideMainPresenterProvider.get());
            MainActivity_MembersInjector.injectResources(mainActivity, (Resources) this.applicationComponent.provideResourcesProvider.get());
            MainActivity_MembersInjector.injectMarketResourceFormatter(mainActivity, (MarketResourceFormatter) this.applicationComponent.provideMarketResourceFormatterProvider.get());
            MainActivity_MembersInjector.injectThemeAnalytics(mainActivity, (ThemeAnalytics) this.applicationComponent.providesThemeAnalyticsProvider.get());
            MainActivity_MembersInjector.injectDeepLinkManager(mainActivity, this.provideDeepLinkManagerProvider.get());
            MainActivity_MembersInjector.injectFirebaseNotificationAnalytics(mainActivity, (FirebaseNotificationAnalytics) this.applicationComponent.provideFirebaseNotificationAnalyticsProvider.get());
            return mainActivity;
        }

        private SettingsFragment injectSettingsFragment(SettingsFragment settingsFragment) {
            SettingsFragment_MembersInjector.injectMarketName(settingsFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            SettingsFragment_MembersInjector.injectMarketResourceFormatter(settingsFragment, (MarketResourceFormatter) this.applicationComponent.provideMarketResourceFormatterProvider.get());
            SettingsFragment_MembersInjector.injectSupportEmailProvider(settingsFragment, (SupportEmailProvider) this.applicationComponent.providesSupportEmailProvider2.get());
            SettingsFragment_MembersInjector.injectThemeManager(settingsFragment, this.providesThemeManagerProvider.get());
            SettingsFragment_MembersInjector.injectThemeAnalytics(settingsFragment, (ThemeAnalytics) this.applicationComponent.providesThemeAnalyticsProvider.get());
            SettingsFragment_MembersInjector.injectUpdatesRepository(settingsFragment, (UpdateRepository) this.applicationComponent.providesUpdateRepositoryProvider.get());
            SettingsFragment_MembersInjector.injectFileManager(settingsFragment, (FileManager) this.applicationComponent.providesFileManagerProvider.get());
            return settingsFragment;
        }

        private StoreTabGridRecyclerFragment injectStoreTabGridRecyclerFragment(StoreTabGridRecyclerFragment storeTabGridRecyclerFragment) {
            StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(storeTabGridRecyclerFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(storeTabGridRecyclerFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            return storeTabGridRecyclerFragment;
        }

        private ThemedActivityView injectThemedActivityView(ThemedActivityView themedActivityView) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(themedActivityView, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(themedActivityView, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(themedActivityView, (String) this.applicationComponent.provideMarketNameProvider.get());
            AnalyticsActivity_MembersInjector.injectAnalyticsManager(themedActivityView, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(themedActivityView, (FirstLaunchAnalytics) this.applicationComponent.providesFirstLaunchAnalyticsProvider.get());
            ThemedActivityView_MembersInjector.injectThemeManager(themedActivityView, this.providesThemeManagerProvider.get());
            return themedActivityView;
        }

        private WalletInstallActivity injectWalletInstallActivity(WalletInstallActivity walletInstallActivity) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(walletInstallActivity, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(walletInstallActivity, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(walletInstallActivity, (String) this.applicationComponent.provideMarketNameProvider.get());
            AnalyticsActivity_MembersInjector.injectAnalyticsManager(walletInstallActivity, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(walletInstallActivity, (FirstLaunchAnalytics) this.applicationComponent.providesFirstLaunchAnalyticsProvider.get());
            WalletInstallActivity_MembersInjector.injectPresenter(walletInstallActivity, this.providesWalletInstallPresenterProvider.get());
            return walletInstallActivity;
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(BaseActivity baseActivity) {
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(MainActivity mainActivity) {
            injectMainActivity(mainActivity);
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(DialogUtils dialogUtils) {
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment) {
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public FragmentComponent plus(FragmentModule fragmentModule, FlavourFragmentModule flavourFragmentModule) {
            C9055b.m29111b(fragmentModule);
            C9055b.m29111b(flavourFragmentModule);
            return new FragmentComponentImpl(this.activityComponentImpl, fragmentModule, flavourFragmentModule);
        }

        private ActivityComponentImpl(DaggerApplicationComponent daggerApplicationComponent, ActivityModule activityModule, FlavourActivityModule flavourActivityModule) {
            this.activityComponentImpl = this;
            this.applicationComponent = daggerApplicationComponent;
            initialize(activityModule, flavourActivityModule);
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(ThemedActivityView themedActivityView) {
            injectThemedActivityView(themedActivityView);
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(WalletInstallActivity walletInstallActivity) {
            injectWalletInstallActivity(walletInstallActivity);
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(ActivityResultNavigator activityResultNavigator) {
            injectActivityResultNavigator(activityResultNavigator);
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(AnalyticsActivity analyticsActivity) {
            injectAnalyticsActivity(analyticsActivity);
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(BottomNavigationActivity bottomNavigationActivity) {
            injectBottomNavigationActivity(bottomNavigationActivity);
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(SettingsFragment settingsFragment) {
            injectSettingsFragment(settingsFragment);
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(StoreTabGridRecyclerFragment storeTabGridRecyclerFragment) {
            injectStoreTabGridRecyclerFragment(storeTabGridRecyclerFragment);
        }

        @Override // cm.aptoide.p092pt.view.ActivityComponent
        public void inject(BaseDialogFragment baseDialogFragment) {
            injectBaseDialogFragment(baseDialogFragment);
        }
    }

    public static final class Builder {
        private ApplicationModule applicationModule;
        private FlavourApplicationModule flavourApplicationModule;

        public Builder applicationModule(ApplicationModule applicationModule) {
            this.applicationModule = (ApplicationModule) C9055b.m29111b(applicationModule);
            return this;
        }

        public ApplicationComponent build() {
            C9055b.m29110a(this.applicationModule, ApplicationModule.class);
            C9055b.m29110a(this.flavourApplicationModule, FlavourApplicationModule.class);
            return new DaggerApplicationComponent(this.applicationModule, this.flavourApplicationModule);
        }

        public Builder flavourApplicationModule(FlavourApplicationModule flavourApplicationModule) {
            this.flavourApplicationModule = (FlavourApplicationModule) C9055b.m29111b(flavourApplicationModule);
            return this;
        }

        private Builder() {
        }
    }

    private static final class FragmentComponentImpl implements FragmentComponent {
        private final ActivityComponentImpl activityComponentImpl;
        private final DaggerApplicationComponent applicationComponent;
        private Provider<EditorialListAnalytics> editorialListAnalyticsProvider;
        private final FragmentComponentImpl fragmentComponentImpl;
        private Provider<AccountErrorMapper> provideAccountErrorMapperProvider;
        private Provider<CheckYourEmailPresenter> provideCheckYourEmailPresenterProvider;
        private Provider<CreateUserErrorMapper> provideCreateUserErrorMapperProvider;
        private Provider<EarnAppcListPresenter> provideEarnAppCoinsListPresenterProvider;
        private Provider<EarnAppcListAnalytics> provideEarnAppcListAnalyticsProvider;
        private Provider<EarnAppcListManager> provideEarnAppcListManagerProvider;
        private Provider<EarnAppcNavigator> provideEarnAppcNavigatorProvider;
        private Provider<FragmentNavigator> provideHomeFragmentNavigatorProvider;
        private Provider<ImagePickerPresenter> provideImagePickerPresenterProvider;
        private Provider<ImageValidator> provideImageValidatorProvider;
        private Provider<LoginSignupCredentialsFlavorPresenter> provideLoginSignUpPresenterProvider;
        private Provider<ManageStoreErrorMapper> provideManageStoreErrorMapperProvider;
        private Provider<ManageStorePresenter> provideManageStorePresenterProvider;
        private Provider<ManageUserPresenter> provideManageUserPresenterProvider;
        private Provider<SearchResultPresenter> provideSearchResultPresenterProvider;
        private Provider<SendMagicLinkPresenter> provideSendMagicLinkPresenterProvider;
        private Provider<AppCoinsInfoPresenter> providesAppCoinsInfoPresenterProvider;
        private Provider<AppMapper> providesAppMapperProvider;
        private Provider<AppViewConfiguration> providesAppViewConfigurationProvider;
        private Provider<AppViewManager> providesAppViewManagerProvider;
        private Provider<AppViewModelManager> providesAppViewModelManagerProvider;
        private Provider<AppViewPresenter> providesAppViewPresenterProvider;
        private Provider<AppcPromotionNotificationStringProvider> providesAppcPromotionNotificationStringProvider;
        private Provider<AppsManager> providesAppsManagerProvider;
        private Provider<AppsNavigator> providesAppsNavigatorProvider;
        private Provider<AppsPresenter> providesAppsPresenterProvider;
        private Provider<AutoUpdateDialogPresenter> providesAutoUpdateDialogPresenterProvider;
        private Provider<BundleEvent> providesBundleEventProvider;
        private Provider<CheckYourEmailNavigator> providesCheckYourEmailNavigatorProvider;
        private Provider<ClaimPromotionDialogPresenter> providesClaimPromotionDialogPresenterProvider;
        private Provider<ClaimPromotionsManager> providesClaimPromotionsManagerProvider;
        private Provider<NewFeatureDialogPresenter> providesDarkthemeDialogPresenterProvider;
        private Provider<DownloadDialogProvider> providesDownloadDialogManagerProvider;
        private Provider<DownloadNavigator> providesDownloadNavigatorProvider;
        private Provider<DownloadViewActionPresenter> providesDownloadViewActionPresenterProvider;
        private Provider<EditorialAnalytics> providesEditorialAnalyticsProvider;
        private Provider<EditorialListManager> providesEditorialListManagerProvider;
        private Provider<EditorialListNavigator> providesEditorialListNavigatorProvider;
        private Provider<EditorialListPresenter> providesEditorialListPresenterProvider;
        private Provider<EditorialCardListRepository> providesEditorialListRepositoryProvider;
        private Provider<EditorialManager> providesEditorialManagerProvider;
        private Provider<EditorialNavigator> providesEditorialNavigatorProvider;
        private Provider<EditorialPresenter> providesEditorialPresenterProvider;
        private Provider<EditorialRepository> providesEditorialRepositoryProvider;
        private Provider<EditorialCardListService> providesEditorialServiceProvider;
        private Provider<FlagManager> providesFlagManagerProvider;
        private Provider<FlagService> providesFlagServiceProvider;
        private Provider<MoreBundleManager> providesGetStoreManagerProvider;
        private Provider<MoreBundlePresenter> providesGetStoreWidgetsPresenterProvider;
        private Provider<HomeAnalytics> providesHomeAnalyticsProvider;
        private Provider<HomeContainerNavigator> providesHomeContainerNavigatorProvider;
        private Provider<HomeContainerPresenter> providesHomeContainerPresenterProvider;
        private Provider<HomeNavigator> providesHomeNavigatorProvider;
        private Provider<HomePresenter> providesHomePresenterProvider;
        private Provider<Home> providesHomeProvider;
        private Provider<EarnAppcListConfiguration> providesListAppsConfigurationProvider;
        private Provider<ListAppsConfiguration> providesListAppsMoreConfigurationProvider;
        private Provider<ListAppsMoreManager> providesListAppsMoreManagerProvider;
        private Provider<ListAppsMorePresenter> providesListAppsMorePresenterProvider;
        private Provider<LoginSignUpCredentialsConfiguration> providesLoginSignUpCredentialsConfigurationProvider;
        private Provider<MyStoresNavigator> providesMyStoreNavigatorProvider;
        private Provider<MyStoresPresenter> providesMyStorePresenterProvider;
        private Provider<OutOfSpaceDialogPresenter> providesOutOfSpaceDialogPresenterProvider;
        private Provider<OutOfSpaceManager> providesOutOfSpaceManagerProvider;
        private Provider<OutOfSpaceNavigator> providesOutOfSpaceNavigatorProvider;
        private Provider<PromotionsPresenter> providesPromotionsPresenterProvider;
        private Provider<RewardAppCoinsAppsRepository> providesRewardAppCoinsAppsRepositoryProvider;
        private Provider<SearchManager> providesSearchManagerProvider;
        private Provider<SendMagicLinkNavigator> providesSendMagicLinkNavigatorProvider;
        private Provider<WizardFragmentProvider> providesWizardFragmentProvider;
        private Provider<WizardPresenter> providesWizardPresenterProvider;

        private void initialize(FragmentModule fragmentModule, FlavourFragmentModule flavourFragmentModule) {
            this.provideAccountErrorMapperProvider = C9054a.m29108a(FragmentModule_ProvideAccountErrorMapperFactory.create(fragmentModule));
            this.providesLoginSignUpCredentialsConfigurationProvider = C9054a.m29108a(C4683xd0ca61e4.create(fragmentModule));
            this.provideLoginSignUpPresenterProvider = C9054a.m29108a(FragmentModule_ProvideLoginSignUpPresenterFactory.create(fragmentModule, this.applicationComponent.provideAptoideAccountManagerProvider, this.activityComponentImpl.provideAccountNavigatorProvider, this.provideAccountErrorMapperProvider, this.applicationComponent.provideAccountAnalyticsProvider, this.applicationComponent.providesFacebookLoginPermissionsProvider, this.providesLoginSignUpCredentialsConfigurationProvider));
            this.providesSendMagicLinkNavigatorProvider = C9054a.m29108a(FragmentModule_ProvidesSendMagicLinkNavigatorFactory.create(fragmentModule, this.activityComponentImpl.provideMainFragmentNavigatorProvider, this.activityComponentImpl.providesThemeManagerProvider));
            this.provideSendMagicLinkPresenterProvider = C9054a.m29108a(FragmentModule_ProvideSendMagicLinkPresenterFactory.create(fragmentModule, this.applicationComponent.provideAptoideAccountManagerProvider, this.providesSendMagicLinkNavigatorProvider, this.applicationComponent.providesAgentPersistenceProvider));
            this.provideImageValidatorProvider = C9054a.m29108a(FragmentModule_ProvideImageValidatorFactory.create(fragmentModule, this.applicationComponent.providesImageInfoProvider));
            this.provideImagePickerPresenterProvider = C9054a.m29108a(FragmentModule_ProvideImagePickerPresenterFactory.create(fragmentModule, this.activityComponentImpl.provideAccountPermissionProvider, this.activityComponentImpl.providePhotoFileGeneratorProvider, this.provideImageValidatorProvider, this.activityComponentImpl.provideUriToPathResolverProvider, this.activityComponentImpl.provideImagePickerNavigatorProvider));
            this.provideCreateUserErrorMapperProvider = C9054a.m29108a(FragmentModule_ProvideCreateUserErrorMapperFactory.create(fragmentModule, this.provideAccountErrorMapperProvider));
            this.provideManageUserPresenterProvider = C9054a.m29108a(FragmentModule_ProvideManageUserPresenterFactory.create(fragmentModule, this.applicationComponent.provideAptoideAccountManagerProvider, this.provideCreateUserErrorMapperProvider, this.activityComponentImpl.provideManageUserNavigatorProvider, this.activityComponentImpl.provideUriToPathResolverProvider, this.applicationComponent.provideAccountAnalyticsProvider));
            this.provideManageStoreErrorMapperProvider = C9054a.m29108a(FragmentModule_ProvideManageStoreErrorMapperFactory.create(fragmentModule));
            this.provideManageStorePresenterProvider = C9054a.m29108a(FragmentModule_ProvideManageStorePresenterFactory.create(fragmentModule, this.activityComponentImpl.provideUriToPathResolverProvider, this.activityComponentImpl.provideManageStoreNavigatorProvider, this.provideManageStoreErrorMapperProvider, this.applicationComponent.provideAptoideAccountManagerProvider, this.applicationComponent.provideAccountAnalyticsProvider));
            this.providesSearchManagerProvider = C9054a.m29108a(FragmentModule_ProvidesSearchManagerFactory.create(fragmentModule, this.applicationComponent.provideAptoideAccountManagerProvider, this.applicationComponent.providesSearchRepositoryProvider, this.applicationComponent.providesDownloadStatusManagerProvider, this.applicationComponent.providesAppCenterProvider));
            this.providesDownloadDialogManagerProvider = C9054a.m29108a(FragmentModule_ProvidesDownloadDialogManagerFactory.create(fragmentModule, this.activityComponentImpl.providesThemeManagerProvider));
            this.providesDownloadNavigatorProvider = C9054a.m29108a(FragmentModule_ProvidesDownloadNavigatorFactory.create(fragmentModule, this.activityComponentImpl.provideMainFragmentNavigatorProvider));
            this.providesDownloadViewActionPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesDownloadViewActionPresenterFactory.create(fragmentModule, this.applicationComponent.providesInstallManagerProvider, this.applicationComponent.providesMoPubAdsManagerProvider, this.applicationComponent.providePermissionManagerProvider, this.applicationComponent.providesAppcMigrationManagerProvider, this.providesDownloadDialogManagerProvider, this.providesDownloadNavigatorProvider, this.applicationComponent.provideDownloadFactoryProvider, this.applicationComponent.providesDownloadAnalyticsProvider, this.applicationComponent.provideInstallAnalyticsProvider, this.applicationComponent.provideNotificationAnalyticsProvider, this.applicationComponent.providesCrashReportsProvider, this.applicationComponent.providesDynamicSplitsManagerProvider, this.applicationComponent.splitAnalyticsMapperProvider, this.applicationComponent.provideCampaignManagerProvider));
            this.provideSearchResultPresenterProvider = C9054a.m29108a(FragmentModule_ProvideSearchResultPresenterFactory.create(fragmentModule, this.applicationComponent.providesSearchAnalyticsProvider, this.activityComponentImpl.providesSearchNavigatorProvider, this.providesSearchManagerProvider, this.applicationComponent.providesTrendingManagerProvider, this.applicationComponent.providesSearchSuggestionManagerProvider, this.activityComponentImpl.provideBottomNavigationMapperProvider, this.providesDownloadViewActionPresenterProvider));
            this.providesMyStoreNavigatorProvider = C9054a.m29108a(FragmentModule_ProvidesMyStoreNavigatorFactory.create(fragmentModule, this.activityComponentImpl.provideMainFragmentNavigatorProvider, this.activityComponentImpl.provideBottomNavigationMapperProvider));
            this.providesMyStorePresenterProvider = C9054a.m29108a(FragmentModule_ProvidesMyStorePresenterFactory.create(fragmentModule, this.applicationComponent.provideAptoideAccountManagerProvider, this.providesMyStoreNavigatorProvider));
            this.providesHomeProvider = C9054a.m29108a(FragmentModule_ProvidesHomeFactory.create(fragmentModule, this.applicationComponent.providesBundleRepositoryProvider, this.applicationComponent.providePromotionsManagerProvider, this.applicationComponent.providesPromotionsPreferencesManagerProvider, this.applicationComponent.providesBlacklistManagerProvider, this.applicationComponent.provideHomePromotionsIdProvider, this.applicationComponent.providesReactionsManagerProvider, this.applicationComponent.providesComingSoonNotificationManagerProvider));
            this.providesHomeNavigatorProvider = C9054a.m29108a(FragmentModule_ProvidesHomeNavigatorFactory.create(fragmentModule, this.activityComponentImpl.provideMainFragmentNavigatorProvider, this.activityComponentImpl.provideBottomNavigationMapperProvider, this.activityComponentImpl.providesAppNavigatorProvider, this.activityComponentImpl.provideAccountNavigatorProvider, this.activityComponentImpl.providesThemeManagerProvider));
            this.providesHomeAnalyticsProvider = C9054a.m29108a(FragmentModule_ProvidesHomeAnalyticsFactory.create(fragmentModule, this.applicationComponent.providesAnalyticsManagerProvider, this.applicationComponent.provideNavigationTrackerProvider));
            this.providesHomePresenterProvider = C9054a.m29108a(FragmentModule_ProvidesHomePresenterFactory.create(fragmentModule, this.providesHomeProvider, this.providesHomeNavigatorProvider, this.applicationComponent.providesAdMapperProvider, this.applicationComponent.provideAptoideAccountManagerProvider, this.providesHomeAnalyticsProvider, this.applicationComponent.providesUserFeedbackAnalyticsProvider));
            this.providesAppMapperProvider = C9054a.m29108a(FragmentModule_ProvidesAppMapperFactory.create(fragmentModule));
            this.providesAppsManagerProvider = C9054a.m29108a(FragmentModule_ProvidesAppsManagerFactory.create(fragmentModule, this.applicationComponent.providesUpdatesManagerProvider, this.applicationComponent.providesInstallManagerProvider, this.providesAppMapperProvider, this.applicationComponent.providesDownloadAnalyticsProvider, this.applicationComponent.provideInstallAnalyticsProvider, this.applicationComponent.providesUpdatesAnalyticsProvider, this.applicationComponent.provideDownloadFactoryProvider, this.applicationComponent.providesMoPubAdsManagerProvider, this.applicationComponent.providesAptoideInstallManagerProvider, this.applicationComponent.providesUpdatesNotificationManagerProvider, this.applicationComponent.providesSecureSharedPreferencesProvider, this.applicationComponent.providesDynamicSplitsManagerProvider, this.applicationComponent.splitAnalyticsMapperProvider, this.applicationComponent.provideCampaignManagerProvider));
            this.providesAppsNavigatorProvider = C9054a.m29108a(FragmentModule_ProvidesAppsNavigatorFactory.create(fragmentModule, this.activityComponentImpl.provideMainFragmentNavigatorProvider, this.activityComponentImpl.provideBottomNavigationMapperProvider, this.activityComponentImpl.providesAppNavigatorProvider));
            this.providesAppsPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesAppsPresenterFactory.create(fragmentModule, this.providesAppsManagerProvider, this.applicationComponent.provideAptoideAccountManagerProvider, this.providesAppsNavigatorProvider));
            Provider<AppViewConfiguration> providerM29108a = C9054a.m29108a(FragmentModule_ProvidesAppViewConfigurationFactory.create(fragmentModule));
            this.providesAppViewConfigurationProvider = providerM29108a;
            this.providesAppViewModelManagerProvider = C9054a.m29108a(FragmentModule_ProvidesAppViewModelManagerFactory.create(fragmentModule, providerM29108a, this.applicationComponent.provideStoreManagerProvider, this.applicationComponent.provideMarketNameProvider, this.applicationComponent.providesAppCenterProvider, this.applicationComponent.providesDownloadStateParserProvider, this.applicationComponent.providesInstallManagerProvider, this.applicationComponent.providesAppcMigrationManagerProvider, this.applicationComponent.providesAppCoinsAdvertisingManagerProvider, this.applicationComponent.providesAppCoinsManagerProvider));
            Provider<FlagService> providerM29108a2 = C9054a.m29108a(FragmentModule_ProvidesFlagServiceFactory.create(fragmentModule, this.applicationComponent.providesBodyInterceptorV3Provider, this.applicationComponent.provideOkHttpClientProvider, this.applicationComponent.provideTokenInvalidatorProvider, this.applicationComponent.providesDefaultSharedPerefencesProvider));
            this.providesFlagServiceProvider = providerM29108a2;
            this.providesFlagManagerProvider = C9054a.m29108a(FragmentModule_ProvidesFlagManagerFactory.create(fragmentModule, providerM29108a2));
            this.providesAppcPromotionNotificationStringProvider = C9054a.m29108a(C4682xf1dd651.create(fragmentModule));
            this.providesAppViewManagerProvider = C9054a.m29108a(FragmentModule_ProvidesAppViewManagerFactory.create(fragmentModule, this.providesAppViewModelManagerProvider, this.applicationComponent.providesInstallManagerProvider, this.applicationComponent.provideDownloadFactoryProvider, this.applicationComponent.providesAppCenterProvider, this.applicationComponent.providesReviewsManagerProvider, this.applicationComponent.providesAdsManagerProvider, this.providesFlagManagerProvider, this.applicationComponent.provideStoreUtilsProxyProvider, this.applicationComponent.provideAptoideAccountManagerProvider, this.applicationComponent.providesDownloadStateParserProvider, this.applicationComponent.providesAppViewAnalyticsProvider, this.applicationComponent.provideNotificationAnalyticsProvider, this.applicationComponent.provideInstallAnalyticsProvider, this.applicationComponent.provideResourcesProvider, this.applicationComponent.provideWindowManagerProvider, this.applicationComponent.provideMarketNameProvider, this.applicationComponent.providesAppCoinsManagerProvider, this.applicationComponent.providesMoPubAdsManagerProvider, this.applicationComponent.providePromotionsManagerProvider, this.applicationComponent.providesAppcMigrationManagerProvider, this.applicationComponent.providesLocalNotificationSyncManagerProvider, this.providesAppcPromotionNotificationStringProvider, this.applicationComponent.providesDynamicSplitsManagerProvider, this.applicationComponent.splitAnalyticsMapperProvider, this.applicationComponent.providesAppsFlyerManagerProvider, this.applicationComponent.provideCampaignManagerProvider));
            this.providesAppViewPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesAppViewPresenterFactory.create(fragmentModule, this.activityComponentImpl.provideAccountNavigatorProvider, this.applicationComponent.providesAppViewAnalyticsProvider, this.applicationComponent.providesCampaignAnalyticsProvider, this.activityComponentImpl.providesAppViewNavigatorProvider, this.providesAppViewManagerProvider, this.applicationComponent.provideAptoideAccountManagerProvider, this.applicationComponent.providesCrashReportsProvider, this.activityComponentImpl.providesPromotionsNavigatorProvider, this.applicationComponent.providesWalletAppProvider));
            this.providesGetStoreManagerProvider = C9054a.m29108a(FragmentModule_ProvidesGetStoreManagerFactory.create(fragmentModule, this.applicationComponent.providesBundleRepositoryProvider));
            this.providesBundleEventProvider = C9054a.m29108a(FragmentModule_ProvidesBundleEventFactory.create(fragmentModule));
            this.providesGetStoreWidgetsPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesGetStoreWidgetsPresenterFactory.create(fragmentModule, this.providesGetStoreManagerProvider, this.applicationComponent.providesCrashReportsProvider, this.providesHomeNavigatorProvider, this.applicationComponent.providesAdMapperProvider, this.providesBundleEventProvider, this.providesHomeAnalyticsProvider, this.applicationComponent.providesChipManagerProvider));
            this.providesWizardPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesWizardPresenterFactory.create(fragmentModule, this.applicationComponent.provideAptoideAccountManagerProvider, this.applicationComponent.providesCrashReportsProvider, this.applicationComponent.provideAccountAnalyticsProvider));
            this.providesWizardFragmentProvider = C9054a.m29108a(FlavourFragmentModule_ProvidesWizardFragmentProviderFactory.create(flavourFragmentModule, this.activityComponentImpl.providesThemeManagerProvider));
            this.providesAppCoinsInfoPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesAppCoinsInfoPresenterFactory.create(fragmentModule, this.activityComponentImpl.providesAppCoinsInfoNavigatorProvider, this.applicationComponent.providesInstallManagerProvider, this.applicationComponent.providesCrashReportsProvider, this.applicationComponent.providesSocialMediaAnalyticsProvider, this.applicationComponent.providesAppCoinsManagerProvider));
            this.providesEditorialRepositoryProvider = C9054a.m29108a(FragmentModule_ProvidesEditorialRepositoryFactory.create(fragmentModule, this.applicationComponent.providesEditorialServiceProvider));
            this.providesEditorialAnalyticsProvider = C9054a.m29108a(FragmentModule_ProvidesEditorialAnalyticsFactory.create(fragmentModule, this.applicationComponent.providesDownloadAnalyticsProvider, this.applicationComponent.providesAnalyticsManagerProvider, this.applicationComponent.provideNavigationTrackerProvider, this.applicationComponent.provideInstallAnalyticsProvider, this.applicationComponent.splitAnalyticsMapperProvider));
            this.providesEditorialManagerProvider = C9054a.m29108a(FragmentModule_ProvidesEditorialManagerFactory.create(fragmentModule, this.providesEditorialRepositoryProvider, this.applicationComponent.providesInstallManagerProvider, this.applicationComponent.provideDownloadFactoryProvider, this.applicationComponent.providesDownloadStateParserProvider, this.applicationComponent.provideNotificationAnalyticsProvider, this.applicationComponent.provideInstallAnalyticsProvider, this.providesEditorialAnalyticsProvider, this.applicationComponent.providesReactionsManagerProvider, this.applicationComponent.providesMoPubAdsManagerProvider, this.applicationComponent.providesDynamicSplitsManagerProvider, this.applicationComponent.splitAnalyticsMapperProvider, this.applicationComponent.provideCampaignManagerProvider));
            this.providesEditorialNavigatorProvider = C9054a.m29108a(FragmentModule_ProvidesEditorialNavigatorFactory.create(fragmentModule, this.activityComponentImpl.providesAppNavigatorProvider, this.activityComponentImpl.provideAccountNavigatorProvider, this.activityComponentImpl.providesSocialMediaNavigatorProvider, this.activityComponentImpl.provideMainFragmentNavigatorProvider));
            this.providesEditorialPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesEditorialPresenterFactory.create(fragmentModule, this.providesEditorialManagerProvider, this.applicationComponent.providesCrashReportsProvider, this.providesEditorialAnalyticsProvider, this.providesEditorialNavigatorProvider, this.applicationComponent.providesUserFeedbackAnalyticsProvider, this.applicationComponent.providesMoPubAdsManagerProvider, this.applicationComponent.providesSocialMediaAnalyticsProvider));
            this.providesPromotionsPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesPromotionsPresenterFactory.create(fragmentModule, this.applicationComponent.providePromotionsManagerProvider, this.applicationComponent.providesPromotionsAnalyticsProvider, this.activityComponentImpl.providesPromotionsNavigatorProvider, this.applicationComponent.provideHomePromotionsIdProvider, this.applicationComponent.providesMoPubAdsManagerProvider));
            Provider<ClaimPromotionsManager> providerM29108a3 = C9054a.m29108a(FragmentModule_ProvidesClaimPromotionsManagerFactory.create(fragmentModule, this.applicationComponent.providePromotionsManagerProvider));
            this.providesClaimPromotionsManagerProvider = providerM29108a3;
            this.providesClaimPromotionDialogPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesClaimPromotionDialogPresenterFactory.create(fragmentModule, providerM29108a3, this.applicationComponent.providesPromotionsAnalyticsProvider, this.activityComponentImpl.providesClaimPromotionsNavigatorProvider));
            Provider<FragmentNavigator> providerM29108a4 = C9054a.m29108a(FragmentModule_ProvideHomeFragmentNavigatorFactory.create(fragmentModule, this.applicationComponent.provideFragmentNavigatorMapProvider, this.applicationComponent.provideFragmentNavigatorRelayProvider));
            this.provideHomeFragmentNavigatorProvider = providerM29108a4;
            this.providesHomeContainerNavigatorProvider = C9054a.m29108a(FragmentModule_ProvidesHomeContainerNavigatorFactory.create(fragmentModule, providerM29108a4));
            this.providesHomeContainerPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesHomeContainerPresenterFactory.create(fragmentModule, this.applicationComponent.provideAptoideAccountManagerProvider, this.providesHomeContainerNavigatorProvider, this.providesHomeNavigatorProvider, this.providesHomeAnalyticsProvider, this.providesHomeProvider, this.applicationComponent.providesChipManagerProvider));
            Provider<EditorialCardListService> providerM29108a5 = C9054a.m29108a(FragmentModule_ProvidesEditorialServiceFactory.create(fragmentModule, this.applicationComponent.provideAccountSettingsBodyInterceptorPoolV7Provider, this.applicationComponent.provideOkHttpClientProvider, this.applicationComponent.provideTokenInvalidatorProvider, this.applicationComponent.providesDefaultSharedPerefencesProvider));
            this.providesEditorialServiceProvider = providerM29108a5;
            Provider<EditorialCardListRepository> providerM29108a6 = C9054a.m29108a(FragmentModule_ProvidesEditorialListRepositoryFactory.create(fragmentModule, providerM29108a5));
            this.providesEditorialListRepositoryProvider = providerM29108a6;
            this.providesEditorialListManagerProvider = C9054a.m29108a(FragmentModule_ProvidesEditorialListManagerFactory.create(fragmentModule, providerM29108a6, this.applicationComponent.providesReactionsManagerProvider, this.applicationComponent.providesAppCoinsManagerProvider));
            this.providesEditorialListNavigatorProvider = C9054a.m29108a(FragmentModule_ProvidesEditorialListNavigatorFactory.create(fragmentModule, this.activityComponentImpl.provideMainFragmentNavigatorProvider, this.activityComponentImpl.provideAccountNavigatorProvider));
            this.editorialListAnalyticsProvider = C9054a.m29108a(FragmentModule_EditorialListAnalyticsFactory.create(fragmentModule, this.applicationComponent.provideNavigationTrackerProvider, this.applicationComponent.providesAnalyticsManagerProvider));
            this.providesEditorialListPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesEditorialListPresenterFactory.create(fragmentModule, this.providesEditorialListManagerProvider, this.applicationComponent.provideAptoideAccountManagerProvider, this.providesEditorialListNavigatorProvider, this.editorialListAnalyticsProvider, this.applicationComponent.providesUserFeedbackAnalyticsProvider));
            this.providesRewardAppCoinsAppsRepositoryProvider = C9054a.m29108a(FragmentModule_ProvidesRewardAppCoinsAppsRepositoryFactory.create(fragmentModule, this.applicationComponent.provideOkHttpClientProvider, this.applicationComponent.provideAccountSettingsBodyInterceptorPoolV7Provider, this.applicationComponent.provideTokenInvalidatorProvider, this.applicationComponent.providesDefaultSharedPerefencesProvider, this.applicationComponent.providesInstallManagerProvider));
            this.providesListAppsConfigurationProvider = C9054a.m29108a(FragmentModule_ProvidesListAppsConfigurationFactory.create(fragmentModule));
            this.provideEarnAppcListManagerProvider = C9054a.m29108a(FragmentModule_ProvideEarnAppcListManagerFactory.create(fragmentModule, this.applicationComponent.providesWalletAppProvider, this.activityComponentImpl.providesWalletInstallManagerProvider));
            this.provideEarnAppcListAnalyticsProvider = C9054a.m29108a(FragmentModule_ProvideEarnAppcListAnalyticsFactory.create(fragmentModule, this.applicationComponent.providesDownloadAnalyticsProvider));
            this.provideEarnAppcNavigatorProvider = C9054a.m29108a(FragmentModule_ProvideEarnAppcNavigatorFactory.create(fragmentModule, this.activityComponentImpl.provideMainFragmentNavigatorProvider));
            this.provideEarnAppCoinsListPresenterProvider = C9054a.m29108a(FragmentModule_ProvideEarnAppCoinsListPresenterFactory.create(fragmentModule, this.applicationComponent.providesCrashReportsProvider, this.providesRewardAppCoinsAppsRepositoryProvider, this.applicationComponent.providesAnalyticsManagerProvider, this.activityComponentImpl.providesAppNavigatorProvider, this.providesListAppsConfigurationProvider, this.provideEarnAppcListManagerProvider, this.applicationComponent.providesMoPubAdsManagerProvider, this.provideEarnAppcListAnalyticsProvider, this.provideEarnAppcNavigatorProvider));
            this.providesListAppsMoreConfigurationProvider = C9054a.m29108a(FragmentModule_ProvidesListAppsMoreConfigurationFactory.create(fragmentModule));
            this.providesListAppsMoreManagerProvider = C9054a.m29108a(FragmentModule_ProvidesListAppsMoreManagerFactory.create(fragmentModule, this.activityComponentImpl.providesListAppsMoreRepositoryProvider, this.applicationComponent.provideAdsRepositoryProvider));
            this.providesListAppsMorePresenterProvider = C9054a.m29108a(FragmentModule_ProvidesListAppsMorePresenterFactory.create(fragmentModule, this.applicationComponent.providesCrashReportsProvider, this.activityComponentImpl.providesAppNavigatorProvider, this.applicationComponent.providesDefaultSharedPerefencesProvider, this.providesListAppsMoreConfigurationProvider, this.providesListAppsMoreManagerProvider));
            this.providesAutoUpdateDialogPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesAutoUpdateDialogPresenterFactory.create(fragmentModule, this.applicationComponent.providesCrashReportsProvider, this.activityComponentImpl.provideAutoUpdateManagerProvider));
            this.providesDarkthemeDialogPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesDarkthemeDialogPresenterFactory.create(fragmentModule, this.applicationComponent.providesNewFeatureManagerProvider));
            Provider<CheckYourEmailNavigator> providerM29108a7 = C9054a.m29108a(FragmentModule_ProvidesCheckYourEmailNavigatorFactory.create(fragmentModule));
            this.providesCheckYourEmailNavigatorProvider = providerM29108a7;
            this.provideCheckYourEmailPresenterProvider = C9054a.m29108a(FragmentModule_ProvideCheckYourEmailPresenterFactory.create(fragmentModule, providerM29108a7));
            this.providesOutOfSpaceManagerProvider = C9054a.m29108a(FragmentModule_ProvidesOutOfSpaceManagerFactory.create(fragmentModule, this.applicationComponent.providesInstallManagerProvider, this.applicationComponent.providesInstallAppSizeValidatorProvider));
            this.providesOutOfSpaceNavigatorProvider = C9054a.m29108a(FragmentModule_ProvidesOutOfSpaceNavigatorFactory.create(fragmentModule, this.activityComponentImpl.provideMainFragmentNavigatorProvider));
            this.providesOutOfSpaceDialogPresenterProvider = C9054a.m29108a(FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory.create(fragmentModule, this.applicationComponent.providesCrashReportsProvider, this.providesOutOfSpaceManagerProvider, this.providesOutOfSpaceNavigatorProvider));
        }

        private AddStoreDialog injectAddStoreDialog(AddStoreDialog addStoreDialog) {
            BaseDialogFragment_MembersInjector.injectThemeManager(addStoreDialog, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            AddStoreDialog_MembersInjector.injectStoreCredentialsProvider(addStoreDialog, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            AddStoreDialog_MembersInjector.injectStoreUtilsProxy(addStoreDialog, (StoreUtilsProxy) this.applicationComponent.provideStoreUtilsProxyProvider.get());
            return addStoreDialog;
        }

        private AppCoinsInfoFragment injectAppCoinsInfoFragment(AppCoinsInfoFragment appCoinsInfoFragment) {
            AppCoinsInfoFragment_MembersInjector.injectAppCoinsInfoPresenter(appCoinsInfoFragment, this.providesAppCoinsInfoPresenterProvider.get());
            AppCoinsInfoFragment_MembersInjector.injectScreenWidth(appCoinsInfoFragment, ((Float) this.activityComponentImpl.providesScreenWidthProvider.get()).floatValue());
            AppCoinsInfoFragment_MembersInjector.injectScreenHeight(appCoinsInfoFragment, ((Float) this.activityComponentImpl.providesScreenHeightProvider.get()).floatValue());
            return appCoinsInfoFragment;
        }

        private AppViewFragment injectAppViewFragment(AppViewFragment appViewFragment) {
            AppViewFragment_MembersInjector.injectPresenter(appViewFragment, this.providesAppViewPresenterProvider.get());
            AppViewFragment_MembersInjector.injectDialogUtils(appViewFragment, (DialogUtils) this.activityComponentImpl.providesDialogUtilsProvider.get());
            AppViewFragment_MembersInjector.injectMarketName(appViewFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            AppViewFragment_MembersInjector.injectOneDecimalFormat(appViewFragment, (DecimalFormat) this.applicationComponent.providesDecimalFormatProvider.get());
            AppViewFragment_MembersInjector.injectThemeManager(appViewFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            AppViewFragment_MembersInjector.injectRoomStoredMinimalAdPersistence(appViewFragment, (RoomStoredMinimalAdPersistence) this.applicationComponent.providesRoomStoreMinimalAdPersistenceProvider.get());
            return appViewFragment;
        }

        private AppsFragment injectAppsFragment(AppsFragment appsFragment) {
            AppsFragment_MembersInjector.injectAppsPresenter(appsFragment, this.providesAppsPresenterProvider.get());
            AppsFragment_MembersInjector.injectThemeManager(appsFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return appsFragment;
        }

        private AutoUpdateDialogFragment injectAutoUpdateDialogFragment(AutoUpdateDialogFragment autoUpdateDialogFragment) {
            BaseDialogFragment_MembersInjector.injectThemeManager(autoUpdateDialogFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            AutoUpdateDialogFragment_MembersInjector.injectPresenter(autoUpdateDialogFragment, this.providesAutoUpdateDialogPresenterProvider.get());
            return autoUpdateDialogFragment;
        }

        private CheckYourEmailFragment injectCheckYourEmailFragment(CheckYourEmailFragment checkYourEmailFragment) {
            CheckYourEmailFragment_MembersInjector.injectPresenter(checkYourEmailFragment, this.provideCheckYourEmailPresenterProvider.get());
            return checkYourEmailFragment;
        }

        private ClaimPromotionDialogFragment injectClaimPromotionDialogFragment(ClaimPromotionDialogFragment claimPromotionDialogFragment) {
            BaseDialogFragment_MembersInjector.injectThemeManager(claimPromotionDialogFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            ClaimPromotionDialogFragment_MembersInjector.injectPresenter(claimPromotionDialogFragment, this.providesClaimPromotionDialogPresenterProvider.get());
            ClaimPromotionDialogFragment_MembersInjector.injectClaimPromotionsManager(claimPromotionDialogFragment, this.providesClaimPromotionsManagerProvider.get());
            ClaimPromotionDialogFragment_MembersInjector.injectIdsRepository(claimPromotionDialogFragment, (IdsRepository) this.applicationComponent.provideIdsRepositoryProvider.get());
            ClaimPromotionDialogFragment_MembersInjector.injectPromotionsAnalytics(claimPromotionDialogFragment, (PromotionsAnalytics) this.applicationComponent.providesPromotionsAnalyticsProvider.get());
            ClaimPromotionDialogFragment_MembersInjector.injectNavigator(claimPromotionDialogFragment, (ClaimPromotionsNavigator) this.activityComponentImpl.providesClaimPromotionsNavigatorProvider.get());
            return claimPromotionDialogFragment;
        }

        private CommentDialogFragment injectCommentDialogFragment(CommentDialogFragment commentDialogFragment) {
            BaseDialogFragment_MembersInjector.injectThemeManager(commentDialogFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            CommentDialogFragment_MembersInjector.injectUserFeedbackAnalytics(commentDialogFragment, (UserFeedbackAnalytics) this.applicationComponent.providesUserFeedbackAnalyticsProvider.get());
            return commentDialogFragment;
        }

        private CommentListFragment injectCommentListFragment(CommentListFragment commentListFragment) {
            CommentListFragment_MembersInjector.injectAnalyticsManager(commentListFragment, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            CommentListFragment_MembersInjector.injectNavigationTracker(commentListFragment, (NavigationTracker) this.applicationComponent.provideNavigationTrackerProvider.get());
            CommentListFragment_MembersInjector.injectThemeManager(commentListFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            CommentListFragment_MembersInjector.injectStoreCredentialsProvider(commentListFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            return commentListFragment;
        }

        private DescriptionFragment injectDescriptionFragment(DescriptionFragment descriptionFragment) {
            DescriptionFragment_MembersInjector.injectThemeManager(descriptionFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            DescriptionFragment_MembersInjector.injectStoreCredentialsProvider(descriptionFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            return descriptionFragment;
        }

        private EarnAppcListFragment injectEarnAppcListFragment(EarnAppcListFragment earnAppcListFragment) {
            EarnAppcListFragment_MembersInjector.injectPresenter(earnAppcListFragment, this.provideEarnAppCoinsListPresenterProvider.get());
            EarnAppcListFragment_MembersInjector.injectThemeManager(earnAppcListFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return earnAppcListFragment;
        }

        private EditorialFragment injectEditorialFragment(EditorialFragment editorialFragment) {
            EditorialFragment_MembersInjector.injectPresenter(editorialFragment, this.providesEditorialPresenterProvider.get());
            EditorialFragment_MembersInjector.injectScreenWidth(editorialFragment, ((Float) this.activityComponentImpl.providesScreenWidthProvider.get()).floatValue());
            EditorialFragment_MembersInjector.injectScreenHeight(editorialFragment, ((Float) this.activityComponentImpl.providesScreenHeightProvider.get()).floatValue());
            EditorialFragment_MembersInjector.injectThemeManager(editorialFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            EditorialFragment_MembersInjector.injectCaptionBackgroundPainter(editorialFragment, (CaptionBackgroundPainter) this.applicationComponent.providesCaptionBackgroundPainterProvider.get());
            return editorialFragment;
        }

        private EditorialListFragment injectEditorialListFragment(EditorialListFragment editorialListFragment) {
            EditorialListFragment_MembersInjector.injectPresenter(editorialListFragment, this.providesEditorialListPresenterProvider.get());
            EditorialListFragment_MembersInjector.injectCaptionBackgroundPainter(editorialListFragment, (CaptionBackgroundPainter) this.applicationComponent.providesCaptionBackgroundPainterProvider.get());
            EditorialListFragment_MembersInjector.injectThemeAttributeProvider(editorialListFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return editorialListFragment;
        }

        private ExcludedUpdatesFragment injectExcludedUpdatesFragment(ExcludedUpdatesFragment excludedUpdatesFragment) {
            ExcludedUpdatesFragment_MembersInjector.injectUpdatesPersistence(excludedUpdatesFragment, (UpdatePersistence) this.applicationComponent.providesUpdatePersistenceProvider.get());
            return excludedUpdatesFragment;
        }

        private GridRecyclerSwipeWithToolbarFragment injectGridRecyclerSwipeWithToolbarFragment(GridRecyclerSwipeWithToolbarFragment gridRecyclerSwipeWithToolbarFragment) {
            GridRecyclerSwipeWithToolbarFragment_MembersInjector.injectMarketName(gridRecyclerSwipeWithToolbarFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            return gridRecyclerSwipeWithToolbarFragment;
        }

        private HomeContainerFragment injectHomeContainerFragment(HomeContainerFragment homeContainerFragment) {
            HomeContainerFragment_MembersInjector.injectPresenter(homeContainerFragment, this.providesHomeContainerPresenterProvider.get());
            HomeContainerFragment_MembersInjector.injectThemeManager(homeContainerFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return homeContainerFragment;
        }

        private HomeFragment injectHomeFragment(HomeFragment homeFragment) {
            HomeFragment_MembersInjector.injectPresenter(homeFragment, this.providesHomePresenterProvider.get());
            HomeFragment_MembersInjector.injectMarketName(homeFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            HomeFragment_MembersInjector.injectCaptionBackgroundPainter(homeFragment, (CaptionBackgroundPainter) this.applicationComponent.providesCaptionBackgroundPainterProvider.get());
            HomeFragment_MembersInjector.injectThemeManager(homeFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return homeFragment;
        }

        private LatestReviewsFragment injectLatestReviewsFragment(LatestReviewsFragment latestReviewsFragment) {
            LatestReviewsFragment_MembersInjector.injectAnalyticsManager(latestReviewsFragment, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            LatestReviewsFragment_MembersInjector.injectNavigationTracker(latestReviewsFragment, (NavigationTracker) this.applicationComponent.provideNavigationTrackerProvider.get());
            LatestReviewsFragment_MembersInjector.injectStoreCredentialsProvider(latestReviewsFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            return latestReviewsFragment;
        }

        private ListAppsMoreFragment injectListAppsMoreFragment(ListAppsMoreFragment listAppsMoreFragment) {
            ListAppsMoreFragment_MembersInjector.injectPresenter(listAppsMoreFragment, this.providesListAppsMorePresenterProvider.get());
            return listAppsMoreFragment;
        }

        private ListStoreAppsFragment injectListStoreAppsFragment(ListStoreAppsFragment listStoreAppsFragment) {
            ListStoreAppsFragment_MembersInjector.injectListStoreAppsNavigator(listStoreAppsFragment, (ListStoreAppsNavigator) this.activityComponentImpl.provideListStoreAppsNavigatorProvider.get());
            ListStoreAppsFragment_MembersInjector.injectAppCenter(listStoreAppsFragment, (AppCenter) this.applicationComponent.providesAppCenterProvider.get());
            return listStoreAppsFragment;
        }

        private ListStoresFragment injectListStoresFragment(ListStoresFragment listStoresFragment) {
            StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(listStoresFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(listStoresFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(listStoresFragment, (StoreUtilsProxy) this.applicationComponent.provideStoreUtilsProxyProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(listStoresFragment, (AptoideInstalledAppsRepository) this.applicationComponent.provideInstalledRepositoryProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(listStoresFragment, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(listStoresFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(listStoresFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(listStoresFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(listStoresFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            ListStoresFragment_MembersInjector.injectAnalyticsManager(listStoresFragment, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            ListStoresFragment_MembersInjector.injectNavigationTracker(listStoresFragment, (NavigationTracker) this.applicationComponent.provideNavigationTrackerProvider.get());
            return listStoresFragment;
        }

        private LoginSignUpCredentialsFragment injectLoginSignUpCredentialsFragment(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment) {
            LoginSignUpCredentialsFragment_MembersInjector.injectPresenter(loginSignUpCredentialsFragment, this.provideLoginSignUpPresenterProvider.get());
            LoginSignUpCredentialsFragment_MembersInjector.injectSendMagicLinkPresenter(loginSignUpCredentialsFragment, this.provideSendMagicLinkPresenterProvider.get());
            LoginSignUpCredentialsFragment_MembersInjector.injectOrientationManager(loginSignUpCredentialsFragment, (ScreenOrientationManager) this.activityComponentImpl.provideScreenOrientationManagerProvider.get());
            LoginSignUpCredentialsFragment_MembersInjector.injectAccountAnalytics(loginSignUpCredentialsFragment, (AccountAnalytics) this.applicationComponent.provideAccountAnalyticsProvider.get());
            LoginSignUpCredentialsFragment_MembersInjector.injectMarketName(loginSignUpCredentialsFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            LoginSignUpCredentialsFragment_MembersInjector.injectThemeManager(loginSignUpCredentialsFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return loginSignUpCredentialsFragment;
        }

        private ManageStoreFragment injectManageStoreFragment(ManageStoreFragment manageStoreFragment) {
            ManageStoreFragment_MembersInjector.injectImagePickerPresenter(manageStoreFragment, this.provideImagePickerPresenterProvider.get());
            ManageStoreFragment_MembersInjector.injectManageStorePresenter(manageStoreFragment, this.provideManageStorePresenterProvider.get());
            ManageStoreFragment_MembersInjector.injectOrientationManager(manageStoreFragment, (ScreenOrientationManager) this.activityComponentImpl.provideScreenOrientationManagerProvider.get());
            ManageStoreFragment_MembersInjector.injectThemeManager(manageStoreFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return manageStoreFragment;
        }

        private ManageUserFragment injectManageUserFragment(ManageUserFragment manageUserFragment) {
            ManageUserFragment_MembersInjector.injectImagePickerPresenter(manageUserFragment, this.provideImagePickerPresenterProvider.get());
            ManageUserFragment_MembersInjector.injectManageUserPresenter(manageUserFragment, this.provideManageUserPresenterProvider.get());
            ManageUserFragment_MembersInjector.injectOrientationManager(manageUserFragment, (ScreenOrientationManager) this.activityComponentImpl.provideScreenOrientationManagerProvider.get());
            ManageUserFragment_MembersInjector.injectNewsletterManager(manageUserFragment, (NewsletterManager) this.applicationComponent.providesNewsletterManagerProvider.get());
            ManageUserFragment_MembersInjector.injectThemeManager(manageUserFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return manageUserFragment;
        }

        private MoreBundleFragment injectMoreBundleFragment(MoreBundleFragment moreBundleFragment) {
            MoreBundleFragment_MembersInjector.injectPresenter(moreBundleFragment, this.providesGetStoreWidgetsPresenterProvider.get());
            MoreBundleFragment_MembersInjector.injectMarketName(moreBundleFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            MoreBundleFragment_MembersInjector.injectCaptionBackgroundPainter(moreBundleFragment, (CaptionBackgroundPainter) this.applicationComponent.providesCaptionBackgroundPainterProvider.get());
            MoreBundleFragment_MembersInjector.injectThemeAttributeProvider(moreBundleFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return moreBundleFragment;
        }

        private MyAccountFragment injectMyAccountFragment(MyAccountFragment myAccountFragment) {
            MyAccountFragment_MembersInjector.injectMyAccountNavigator(myAccountFragment, (MyAccountNavigator) this.activityComponentImpl.provideMyAccountNavigatorProvider.get());
            MyAccountFragment_MembersInjector.injectAccountAnalytics(myAccountFragment, (AccountAnalytics) this.applicationComponent.provideAccountAnalyticsProvider.get());
            MyAccountFragment_MembersInjector.injectMyAccountManager(myAccountFragment, (MyAccountManager) this.applicationComponent.providesMyAccountManagerProvider.get());
            MyAccountFragment_MembersInjector.injectMarketName(myAccountFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            MyAccountFragment_MembersInjector.injectThemeManager(myAccountFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            MyAccountFragment_MembersInjector.injectSocialMediaAnalytics(myAccountFragment, (SocialMediaAnalytics) this.applicationComponent.providesSocialMediaAnalyticsProvider.get());
            return myAccountFragment;
        }

        private MyStoresFragment injectMyStoresFragment(MyStoresFragment myStoresFragment) {
            StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(myStoresFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(myStoresFragment, (StoreUtilsProxy) this.applicationComponent.provideStoreUtilsProxyProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(myStoresFragment, (AptoideInstalledAppsRepository) this.applicationComponent.provideInstalledRepositoryProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(myStoresFragment, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(myStoresFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(myStoresFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(myStoresFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            MyStoresFragment_MembersInjector.injectMyStoresPresenter(myStoresFragment, this.providesMyStorePresenterProvider.get());
            MyStoresFragment_MembersInjector.injectStoreRepository(myStoresFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            return myStoresFragment;
        }

        private MyStoresSubscribedFragment injectMyStoresSubscribedFragment(MyStoresSubscribedFragment myStoresSubscribedFragment) {
            StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresSubscribedFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(myStoresSubscribedFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(myStoresSubscribedFragment, (StoreUtilsProxy) this.applicationComponent.provideStoreUtilsProxyProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(myStoresSubscribedFragment, (AptoideInstalledAppsRepository) this.applicationComponent.provideInstalledRepositoryProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(myStoresSubscribedFragment, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(myStoresSubscribedFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(myStoresSubscribedFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(myStoresSubscribedFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresSubscribedFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            MyStoresSubscribedFragment_MembersInjector.injectAnalyticsManager(myStoresSubscribedFragment, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            MyStoresSubscribedFragment_MembersInjector.injectNavigationTracker(myStoresSubscribedFragment, (NavigationTracker) this.applicationComponent.provideNavigationTrackerProvider.get());
            MyStoresSubscribedFragment_MembersInjector.injectStoreCredentialsProvider(myStoresSubscribedFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            MyStoresSubscribedFragment_MembersInjector.injectStoreRepository(myStoresSubscribedFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            MyStoresSubscribedFragment_MembersInjector.injectStoreUtilsProxy(myStoresSubscribedFragment, (StoreUtilsProxy) this.applicationComponent.provideStoreUtilsProxyProvider.get());
            return myStoresSubscribedFragment;
        }

        private NewFeatureDialogFragment injectNewFeatureDialogFragment(NewFeatureDialogFragment newFeatureDialogFragment) {
            NewFeatureDialogFragment_MembersInjector.injectPresenter(newFeatureDialogFragment, this.providesDarkthemeDialogPresenterProvider.get());
            return newFeatureDialogFragment;
        }

        private OtherVersionsFragment injectOtherVersionsFragment(OtherVersionsFragment otherVersionsFragment) {
            OtherVersionsFragment_MembersInjector.injectStoreRepository(otherVersionsFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            return otherVersionsFragment;
        }

        private OutOfSpaceDialogFragment injectOutOfSpaceDialogFragment(OutOfSpaceDialogFragment outOfSpaceDialogFragment) {
            BaseDialogFragment_MembersInjector.injectThemeManager(outOfSpaceDialogFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            OutOfSpaceDialogFragment_MembersInjector.injectPresenter(outOfSpaceDialogFragment, this.providesOutOfSpaceDialogPresenterProvider.get());
            return outOfSpaceDialogFragment;
        }

        private PrivateStoreDialog injectPrivateStoreDialog(PrivateStoreDialog privateStoreDialog) {
            BaseDialogFragment_MembersInjector.injectThemeManager(privateStoreDialog, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            PrivateStoreDialog_MembersInjector.injectStoreUtilsProxy(privateStoreDialog, (StoreUtilsProxy) this.applicationComponent.provideStoreUtilsProxyProvider.get());
            return privateStoreDialog;
        }

        private ProfileStepOneFragment injectProfileStepOneFragment(ProfileStepOneFragment profileStepOneFragment) {
            ProfileStepOneFragment_MembersInjector.injectOrientationManager(profileStepOneFragment, (ScreenOrientationManager) this.activityComponentImpl.provideScreenOrientationManagerProvider.get());
            ProfileStepOneFragment_MembersInjector.injectAccountNavigator(profileStepOneFragment, (AccountNavigator) this.activityComponentImpl.provideAccountNavigatorProvider.get());
            ProfileStepOneFragment_MembersInjector.injectAccountAnalytics(profileStepOneFragment, (AccountAnalytics) this.applicationComponent.provideAccountAnalyticsProvider.get());
            ProfileStepOneFragment_MembersInjector.injectLoginSignupManager(profileStepOneFragment, (LoginSignupManager) this.applicationComponent.providesLoginSignupManagerProvider.get());
            ProfileStepOneFragment_MembersInjector.injectThemeManager(profileStepOneFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return profileStepOneFragment;
        }

        private ProfileStepTwoFragment injectProfileStepTwoFragment(ProfileStepTwoFragment profileStepTwoFragment) {
            ProfileStepTwoFragment_MembersInjector.injectAccountAnalytics(profileStepTwoFragment, (AccountAnalytics) this.applicationComponent.provideAccountAnalyticsProvider.get());
            ProfileStepTwoFragment_MembersInjector.injectLoginSignupManager(profileStepTwoFragment, (LoginSignupManager) this.applicationComponent.providesLoginSignupManagerProvider.get());
            ProfileStepTwoFragment_MembersInjector.injectMarketResourceFormatter(profileStepTwoFragment, (MarketResourceFormatter) this.applicationComponent.provideMarketResourceFormatterProvider.get());
            ProfileStepTwoFragment_MembersInjector.injectThemeManager(profileStepTwoFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return profileStepTwoFragment;
        }

        private PromotionsFragment injectPromotionsFragment(PromotionsFragment promotionsFragment) {
            PromotionsFragment_MembersInjector.injectPromotionsPresenter(promotionsFragment, this.providesPromotionsPresenterProvider.get());
            PromotionsFragment_MembersInjector.injectThemeManager(promotionsFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return promotionsFragment;
        }

        private RateAndReviewsFragment injectRateAndReviewsFragment(RateAndReviewsFragment rateAndReviewsFragment) {
            RateAndReviewsFragment_MembersInjector.injectAppNavigator(rateAndReviewsFragment, (AppNavigator) this.activityComponentImpl.providesAppNavigatorProvider.get());
            RateAndReviewsFragment_MembersInjector.injectMarketName(rateAndReviewsFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            RateAndReviewsFragment_MembersInjector.injectMarketResourceFormatter(rateAndReviewsFragment, (MarketResourceFormatter) this.applicationComponent.provideMarketResourceFormatterProvider.get());
            RateAndReviewsFragment_MembersInjector.injectThemeManager(rateAndReviewsFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            RateAndReviewsFragment_MembersInjector.injectDialogUtils(rateAndReviewsFragment, (DialogUtils) this.activityComponentImpl.providesDialogUtilsProvider.get());
            RateAndReviewsFragment_MembersInjector.injectAptoideInstalledAppsRepository(rateAndReviewsFragment, (AptoideInstalledAppsRepository) this.applicationComponent.provideInstalledRepositoryProvider.get());
            RateAndReviewsFragment_MembersInjector.injectStoreCredentialsProvider(rateAndReviewsFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            RateAndReviewsFragment_MembersInjector.injectUserFeedbackAnalytics(rateAndReviewsFragment, (UserFeedbackAnalytics) this.applicationComponent.providesUserFeedbackAnalyticsProvider.get());
            return rateAndReviewsFragment;
        }

        private RecommendedStoresFragment injectRecommendedStoresFragment(RecommendedStoresFragment recommendedStoresFragment) {
            StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(recommendedStoresFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(recommendedStoresFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(recommendedStoresFragment, (StoreUtilsProxy) this.applicationComponent.provideStoreUtilsProxyProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(recommendedStoresFragment, (AptoideInstalledAppsRepository) this.applicationComponent.provideInstalledRepositoryProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(recommendedStoresFragment, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(recommendedStoresFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(recommendedStoresFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(recommendedStoresFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(recommendedStoresFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            RecommendedStoresFragment_MembersInjector.injectStoreCredentialsProvider(recommendedStoresFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            RecommendedStoresFragment_MembersInjector.injectStoreRepository(recommendedStoresFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            RecommendedStoresFragment_MembersInjector.injectStoreUtilsProxy(recommendedStoresFragment, (StoreUtilsProxy) this.applicationComponent.provideStoreUtilsProxyProvider.get());
            return recommendedStoresFragment;
        }

        private SearchResultFragment injectSearchResultFragment(SearchResultFragment searchResultFragment) {
            SearchResultFragment_MembersInjector.injectSearchResultPresenter(searchResultFragment, this.provideSearchResultPresenterProvider.get());
            SearchResultFragment_MembersInjector.injectThemeManager(searchResultFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return searchResultFragment;
        }

        private SendFeedbackFragment injectSendFeedbackFragment(SendFeedbackFragment sendFeedbackFragment) {
            SendFeedbackFragment_MembersInjector.injectAptoideInstalledAppsRepository(sendFeedbackFragment, (AptoideInstalledAppsRepository) this.applicationComponent.provideInstalledRepositoryProvider.get());
            return sendFeedbackFragment;
        }

        private SettingsFragment injectSettingsFragment(SettingsFragment settingsFragment) {
            SettingsFragment_MembersInjector.injectMarketName(settingsFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            SettingsFragment_MembersInjector.injectMarketResourceFormatter(settingsFragment, (MarketResourceFormatter) this.applicationComponent.provideMarketResourceFormatterProvider.get());
            SettingsFragment_MembersInjector.injectSupportEmailProvider(settingsFragment, (SupportEmailProvider) this.applicationComponent.providesSupportEmailProvider2.get());
            SettingsFragment_MembersInjector.injectThemeManager(settingsFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            SettingsFragment_MembersInjector.injectThemeAnalytics(settingsFragment, (ThemeAnalytics) this.applicationComponent.providesThemeAnalyticsProvider.get());
            SettingsFragment_MembersInjector.injectUpdatesRepository(settingsFragment, (UpdateRepository) this.applicationComponent.providesUpdateRepositoryProvider.get());
            SettingsFragment_MembersInjector.injectFileManager(settingsFragment, (FileManager) this.applicationComponent.providesFileManagerProvider.get());
            return settingsFragment;
        }

        private StoreFragment injectStoreFragment(StoreFragment storeFragment) {
            StoreFragment_MembersInjector.injectAnalyticsManager(storeFragment, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            StoreFragment_MembersInjector.injectNavigationTracker(storeFragment, (NavigationTracker) this.applicationComponent.provideNavigationTrackerProvider.get());
            StoreFragment_MembersInjector.injectAppNavigator(storeFragment, (AppNavigator) this.activityComponentImpl.providesAppNavigatorProvider.get());
            StoreFragment_MembersInjector.injectMarketName(storeFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            StoreFragment_MembersInjector.injectThemeManager(storeFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            StoreFragment_MembersInjector.injectMarketResourceFormatter(storeFragment, (MarketResourceFormatter) this.applicationComponent.provideMarketResourceFormatterProvider.get());
            StoreFragment_MembersInjector.injectStoreCredentialsProvider(storeFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            StoreFragment_MembersInjector.injectStoreRepository(storeFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            return storeFragment;
        }

        private StoreTabWidgetsGridRecyclerFragment injectStoreTabWidgetsGridRecyclerFragment(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment) {
            StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(storeTabWidgetsGridRecyclerFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(storeTabWidgetsGridRecyclerFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(storeTabWidgetsGridRecyclerFragment, (StoreUtilsProxy) this.applicationComponent.provideStoreUtilsProxyProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(storeTabWidgetsGridRecyclerFragment, (AptoideInstalledAppsRepository) this.applicationComponent.provideInstalledRepositoryProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(storeTabWidgetsGridRecyclerFragment, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(storeTabWidgetsGridRecyclerFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(storeTabWidgetsGridRecyclerFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(storeTabWidgetsGridRecyclerFragment, (StoreCredentialsProvider) this.applicationComponent.providesStoreCredentialsProvider.get());
            StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(storeTabWidgetsGridRecyclerFragment, (RoomStoreRepository) this.applicationComponent.providesRoomStoreRepositoryProvider.get());
            return storeTabWidgetsGridRecyclerFragment;
        }

        private TimeLineFollowersFragment injectTimeLineFollowersFragment(TimeLineFollowersFragment timeLineFollowersFragment) {
            GridRecyclerSwipeWithToolbarFragment_MembersInjector.injectMarketName(timeLineFollowersFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            TimeLineFollowersFragment_MembersInjector.injectThemeManager(timeLineFollowersFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return timeLineFollowersFragment;
        }

        private TimeLineFollowingFragment injectTimeLineFollowingFragment(TimeLineFollowingFragment timeLineFollowingFragment) {
            GridRecyclerSwipeWithToolbarFragment_MembersInjector.injectMarketName(timeLineFollowingFragment, (String) this.applicationComponent.provideMarketNameProvider.get());
            TimeLineFollowingFragment_MembersInjector.injectThemeManager(timeLineFollowingFragment, (ThemeManager) this.activityComponentImpl.providesThemeManagerProvider.get());
            return timeLineFollowingFragment;
        }

        private TopStoresFragment injectTopStoresFragment(TopStoresFragment topStoresFragment) {
            TopStoresFragment_MembersInjector.injectAnalyticsManager(topStoresFragment, (AnalyticsManager) this.applicationComponent.providesAnalyticsManagerProvider.get());
            TopStoresFragment_MembersInjector.injectNavigationTracker(topStoresFragment, (NavigationTracker) this.applicationComponent.provideNavigationTrackerProvider.get());
            return topStoresFragment;
        }

        private WizardFragment injectWizardFragment(WizardFragment wizardFragment) {
            WizardFragment_MembersInjector.injectWizardPresenter(wizardFragment, this.providesWizardPresenterProvider.get());
            WizardFragment_MembersInjector.injectWizardFragmentProvider(wizardFragment, this.providesWizardFragmentProvider.get());
            return wizardFragment;
        }

        private WizardPageTwoFragment injectWizardPageTwoFragment(WizardPageTwoFragment wizardPageTwoFragment) {
            WizardPageTwoFragment_MembersInjector.injectMarketResourceFormatter(wizardPageTwoFragment, (MarketResourceFormatter) this.applicationComponent.provideMarketResourceFormatterProvider.get());
            return wizardPageTwoFragment;
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment) {
            injectLoginSignUpCredentialsFragment(loginSignUpCredentialsFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(InboxFragment inboxFragment) {
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(WizardFragmentProvider wizardFragmentProvider) {
        }

        private FragmentComponentImpl(DaggerApplicationComponent daggerApplicationComponent, ActivityComponentImpl activityComponentImpl, FragmentModule fragmentModule, FlavourFragmentModule flavourFragmentModule) {
            this.fragmentComponentImpl = this;
            this.applicationComponent = daggerApplicationComponent;
            this.activityComponentImpl = activityComponentImpl;
            initialize(fragmentModule, flavourFragmentModule);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(ManageUserFragment manageUserFragment) {
            injectManageUserFragment(manageUserFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(ManageStoreFragment manageStoreFragment) {
            injectManageStoreFragment(manageStoreFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(SearchResultFragment searchResultFragment) {
            injectSearchResultFragment(searchResultFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(StoreFragment storeFragment) {
            injectStoreFragment(storeFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(CommentListFragment commentListFragment) {
            injectCommentListFragment(commentListFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(TopStoresFragment topStoresFragment) {
            injectTopStoresFragment(topStoresFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(LatestReviewsFragment latestReviewsFragment) {
            injectLatestReviewsFragment(latestReviewsFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(ListStoresFragment listStoresFragment) {
            injectListStoresFragment(listStoresFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(MyStoresSubscribedFragment myStoresSubscribedFragment) {
            injectMyStoresSubscribedFragment(myStoresSubscribedFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment) {
            injectStoreTabWidgetsGridRecyclerFragment(storeTabWidgetsGridRecyclerFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(RecommendedStoresFragment recommendedStoresFragment) {
            injectRecommendedStoresFragment(recommendedStoresFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(MyStoresFragment myStoresFragment) {
            injectMyStoresFragment(myStoresFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(ProfileStepOneFragment profileStepOneFragment) {
            injectProfileStepOneFragment(profileStepOneFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(ProfileStepTwoFragment profileStepTwoFragment) {
            injectProfileStepTwoFragment(profileStepTwoFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(ListStoreAppsFragment listStoreAppsFragment) {
            injectListStoreAppsFragment(listStoreAppsFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(HomeFragment homeFragment) {
            injectHomeFragment(homeFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(AppsFragment appsFragment) {
            injectAppsFragment(appsFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(MyAccountFragment myAccountFragment) {
            injectMyAccountFragment(myAccountFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(AppViewFragment appViewFragment) {
            injectAppViewFragment(appViewFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(RateAndReviewsFragment rateAndReviewsFragment) {
            injectRateAndReviewsFragment(rateAndReviewsFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(MoreBundleFragment moreBundleFragment) {
            injectMoreBundleFragment(moreBundleFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(WizardFragment wizardFragment) {
            injectWizardFragment(wizardFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(AppCoinsInfoFragment appCoinsInfoFragment) {
            injectAppCoinsInfoFragment(appCoinsInfoFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(EditorialFragment editorialFragment) {
            injectEditorialFragment(editorialFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(PromotionsFragment promotionsFragment) {
            injectPromotionsFragment(promotionsFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(DescriptionFragment descriptionFragment) {
            injectDescriptionFragment(descriptionFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(TimeLineFollowingFragment timeLineFollowingFragment) {
            injectTimeLineFollowingFragment(timeLineFollowingFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(TimeLineFollowersFragment timeLineFollowersFragment) {
            injectTimeLineFollowersFragment(timeLineFollowersFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(GridRecyclerSwipeWithToolbarFragment gridRecyclerSwipeWithToolbarFragment) {
            injectGridRecyclerSwipeWithToolbarFragment(gridRecyclerSwipeWithToolbarFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(SettingsFragment settingsFragment) {
            injectSettingsFragment(settingsFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(WizardPageTwoFragment wizardPageTwoFragment) {
            injectWizardPageTwoFragment(wizardPageTwoFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(ClaimPromotionDialogFragment claimPromotionDialogFragment) {
            injectClaimPromotionDialogFragment(claimPromotionDialogFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(HomeContainerFragment homeContainerFragment) {
            injectHomeContainerFragment(homeContainerFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(EditorialListFragment editorialListFragment) {
            injectEditorialListFragment(editorialListFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(EarnAppcListFragment earnAppcListFragment) {
            injectEarnAppcListFragment(earnAppcListFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(ListAppsMoreFragment listAppsMoreFragment) {
            injectListAppsMoreFragment(listAppsMoreFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(AutoUpdateDialogFragment autoUpdateDialogFragment) {
            injectAutoUpdateDialogFragment(autoUpdateDialogFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(NewFeatureDialogFragment newFeatureDialogFragment) {
            injectNewFeatureDialogFragment(newFeatureDialogFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(CommentDialogFragment commentDialogFragment) {
            injectCommentDialogFragment(commentDialogFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(SendFeedbackFragment sendFeedbackFragment) {
            injectSendFeedbackFragment(sendFeedbackFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(ExcludedUpdatesFragment excludedUpdatesFragment) {
            injectExcludedUpdatesFragment(excludedUpdatesFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(OtherVersionsFragment otherVersionsFragment) {
            injectOtherVersionsFragment(otherVersionsFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(AddStoreDialog addStoreDialog) {
            injectAddStoreDialog(addStoreDialog);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(PrivateStoreDialog privateStoreDialog) {
            injectPrivateStoreDialog(privateStoreDialog);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(CheckYourEmailFragment checkYourEmailFragment) {
            injectCheckYourEmailFragment(checkYourEmailFragment);
        }

        @Override // cm.aptoide.p092pt.view.FragmentComponent
        public void inject(OutOfSpaceDialogFragment outOfSpaceDialogFragment) {
            injectOutOfSpaceDialogFragment(outOfSpaceDialogFragment);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(ApplicationModule applicationModule, FlavourApplicationModule flavourApplicationModule) {
        Provider<RoomMigrationProvider> providerM29108a = C9054a.m29108a(ApplicationModule_ProvidesRoomMigrationProviderFactory.create(applicationModule));
        this.providesRoomMigrationProvider = providerM29108a;
        Provider<AptoideDatabase> providerM29108a2 = C9054a.m29108a(ApplicationModule_ProvidesAptoideDataBaseFactory.create(applicationModule, providerM29108a));
        this.providesAptoideDataBaseProvider = providerM29108a2;
        this.provideRoomNotificationPersistenceProvider = C9054a.m29108a(ApplicationModule_ProvideRoomNotificationPersistenceFactory.create(applicationModule, providerM29108a2));
        this.providesInstallationAccessorProvider = C9054a.m29108a(ApplicationModule_ProvidesInstallationAccessorFactory.create(applicationModule, this.providesAptoideDataBaseProvider));
        Provider<RoomInstallationMapper> providerM29108a3 = C9054a.m29108a(ApplicationModule_ProvidesRoomInstallationMapperFactory.create(applicationModule));
        this.providesRoomInstallationMapperProvider = providerM29108a3;
        this.provideRoomInstalledPersistenceProvider = C9054a.m29108a(ApplicationModule_ProvideRoomInstalledPersistenceFactory.create(applicationModule, this.providesAptoideDataBaseProvider, this.providesInstallationAccessorProvider, providerM29108a3));
        Provider<FileUtils> providerM29108a4 = C9054a.m29108a(ApplicationModule_ProvideFileUtilsFactory.create(applicationModule));
        this.provideFileUtilsProvider = providerM29108a4;
        this.provideInstalledRepositoryProvider = C9054a.m29108a(ApplicationModule_ProvideInstalledRepositoryFactory.create(applicationModule, this.provideRoomInstalledPersistenceProvider, providerM29108a4));
        Provider<SharedPreferences> providerM29108a5 = C9054a.m29108a(ApplicationModule_ProvidesDefaultSharedPerefencesFactory.create(applicationModule));
        this.providesDefaultSharedPerefencesProvider = providerM29108a5;
        this.providesBaseRakamHostProvider = C9054a.m29108a(ApplicationModule_ProvidesBaseRakamHostFactory.create(applicationModule, providerM29108a5));
        Provider<DownloadPersistence> providerM29108a6 = C9054a.m29108a(ApplicationModule_ProvideDownloadPersistenceFactory.create(applicationModule, this.providesAptoideDataBaseProvider));
        this.provideDownloadPersistenceProvider = providerM29108a6;
        this.provideDownloadsRepositoryProvider = C9054a.m29108a(ApplicationModule_ProvideDownloadsRepositoryFactory.create(applicationModule, providerM29108a6));
        this.downloadStatusMapperProvider = C9054a.m29108a(ApplicationModule_DownloadStatusMapperFactory.create(applicationModule));
        Provider<DownloadAppFileMapper> providerM29108a7 = C9054a.m29108a(ApplicationModule_ProvidesDownloadAppFileMapperFactory.create(applicationModule));
        this.providesDownloadAppFileMapperProvider = providerM29108a7;
        this.providesDownloadAppMapperProvider = C9054a.m29108a(ApplicationModule_ProvidesDownloadAppMapperFactory.create(applicationModule, providerM29108a7));
        this.provideCachePathProvider = C9054a.m29108a(ApplicationModule_ProvideCachePathFactory.create(applicationModule));
        Provider<ContentResolver> providerM29108a8 = C9054a.m29108a(ApplicationModule_ProvideContentResolverFactory.create(applicationModule));
        this.provideContentResolverProvider = providerM29108a8;
        this.provideIdsRepositoryProvider = C9054a.m29108a(ApplicationModule_ProvideIdsRepositoryFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider, providerM29108a8));
        Provider<String> providerM29108a9 = C9054a.m29108a(FlavourApplicationModule_ProvidePartnerIDFactory.create(flavourApplicationModule));
        this.providePartnerIDProvider = providerM29108a9;
        this.provideUserAgentInterceptorDownloadsProvider = C9054a.m29108a(ApplicationModule_ProvideUserAgentInterceptorDownloadsFactory.create(applicationModule, this.provideIdsRepositoryProvider, providerM29108a9));
        this.provideAccountManagerProvider = C9054a.m29108a(ApplicationModule_ProvideAccountManagerFactory.create(applicationModule));
        Provider<String> providerM29108a10 = C9054a.m29108a(ApplicationModule_ProvideAccountTypeFactory.create(applicationModule));
        this.provideAccountTypeProvider = providerM29108a10;
        Provider<AndroidAccountProvider> providerM29108a11 = C9054a.m29108a(ApplicationModule_ProvideAndroidAccountProviderFactory.create(applicationModule, this.provideAccountManagerProvider, providerM29108a10));
        this.provideAndroidAccountProvider = providerM29108a11;
        this.provideAuthenticationPersistenceProvider = C9054a.m29108a(ApplicationModule_ProvideAuthenticationPersistenceFactory.create(applicationModule, providerM29108a11));
        this.provideAppEventsLoggerProvider = C9054a.m29108a(ApplicationModule_ProvideAppEventsLoggerFactory.create(applicationModule));
        Provider<AnalyticsLogger> providerM29108a12 = C9054a.m29108a(ApplicationModule_ProvidesAnalyticsDebugLoggerFactory.create(applicationModule));
        this.providesAnalyticsDebugLoggerProvider = providerM29108a12;
        this.providesFacebookEventLoggerProvider = C9054a.m29108a(ApplicationModule_ProvidesFacebookEventLoggerFactory.create(applicationModule, this.provideAppEventsLoggerProvider, providerM29108a12));
        Provider<FlurryEventLogger> providerM29108a13 = C9054a.m29108a(ApplicationModule_ProvidesFlurryLoggerFactory.create(applicationModule, this.providesAnalyticsDebugLoggerProvider));
        this.providesFlurryLoggerProvider = providerM29108a13;
        this.providesFlurryEventLoggerProvider = C9054a.m29108a(ApplicationModule_ProvidesFlurryEventLoggerFactory.create(applicationModule, providerM29108a13));
        this.provideL2CacheProvider = C9054a.m29108a(ApplicationModule_ProvideL2CacheFactory.create(applicationModule));
        Provider<Interceptor> providerM29108a14 = C9054a.m29108a(ApplicationModule_ProvideRetrofitLogInterceptorFactory.create(applicationModule));
        this.provideRetrofitLogInterceptorProvider = providerM29108a14;
        this.providesOkHttpBuilderProvider = C9054a.m29108a(ApplicationModule_ProvidesOkHttpBuilderFactory.create(applicationModule, this.provideL2CacheProvider, this.providesDefaultSharedPerefencesProvider, providerM29108a14));
        Provider<PreferencesPersister> providerM29108a15 = C9054a.m29108a(ApplicationModule_ProvidesUserPreferencesPersisterFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider));
        this.providesUserPreferencesPersisterProvider = providerM29108a15;
        Provider<AptoideMd5Manager> providerM29108a16 = C9054a.m29108a(ApplicationModule_ProvidesAptoideMd5ManagerFactory.create(applicationModule, providerM29108a15));
        this.providesAptoideMd5ManagerProvider = providerM29108a16;
        Provider<Interceptor> providerM29108a17 = C9054a.m29108a(ApplicationModule_ProvideUserAgentInterceptorFactory.create(applicationModule, this.provideIdsRepositoryProvider, providerM29108a16));
        this.provideUserAgentInterceptorProvider = providerM29108a17;
        Provider<OkHttpClient> providerM29108a18 = C9054a.m29108a(ApplicationModule_ProvideOkHttpClientFactory.create(applicationModule, this.providesOkHttpBuilderProvider, providerM29108a17));
        this.provideOkHttpClientProvider = providerM29108a18;
        this.providesknockEventLoggerProvider = C9054a.m29108a(ApplicationModule_ProvidesknockEventLoggerFactory.create(applicationModule, providerM29108a18));
        this.provideFacebookEventsProvider = C9054a.m29108a(ApplicationModule_ProvideFacebookEventsFactory.create(applicationModule));
        this.provideFlurryEventsProvider = C9054a.m29108a(ApplicationModule_ProvideFlurryEventsFactory.create(applicationModule));
        this.providesFlurrySessionLoggerProvider = C9054a.m29108a(ApplicationModule_ProvidesFlurrySessionLoggerFactory.create(applicationModule, this.providesFlurryLoggerProvider));
        this.providesAnalyticsNormalizerProvider = C9054a.m29108a(ApplicationModule_ProvidesAnalyticsNormalizerFactory.create(applicationModule));
        Provider<MapToJsonMapper> providerM29108a19 = C9054a.m29108a(ApplicationModule_ProvidesMapToJsonMapperFactory.create(applicationModule));
        this.providesMapToJsonMapperProvider = providerM29108a19;
        this.providesRakamEventLoggerProvider = C9054a.m29108a(ApplicationModule_ProvidesRakamEventLoggerFactory.create(applicationModule, this.providesAnalyticsDebugLoggerProvider, providerM29108a19));
        this.providesRakamEventsProvider = C9054a.m29108a(ApplicationModule_ProvidesRakamEventsFactory.create(applicationModule));
        this.providesIndicativeEventLoggerProvider = C9054a.m29108a(ApplicationModule_ProvidesIndicativeEventLoggerFactory.create(applicationModule, this.providesAnalyticsDebugLoggerProvider));
        this.providesIndicativeEventsProvider = C9054a.m29108a(ApplicationModule_ProvidesIndicativeEventsFactory.create(applicationModule));
        Provider<FirebaseAnalytics> providerM29108a20 = C9054a.m29108a(ApplicationModule_ProvideFirebaseAnalyticsFactory.create(applicationModule));
        this.provideFirebaseAnalyticsProvider = providerM29108a20;
        this.providesFirebaseEventLoggerProvider = C9054a.m29108a(ApplicationModule_ProvidesFirebaseEventLoggerFactory.create(applicationModule, providerM29108a20, this.providesAnalyticsDebugLoggerProvider));
        Provider<Collection<String>> providerM29108a21 = C9054a.m29108a(ApplicationModule_ProvidesFirebaseEventsFactory.create(applicationModule));
        this.providesFirebaseEventsProvider = providerM29108a21;
        Provider<AnalyticsManager> providerM29108a22 = C9054a.m29108a(ApplicationModule_ProvidesAnalyticsManagerFactory.create(applicationModule, this.providesFacebookEventLoggerProvider, this.providesFlurryEventLoggerProvider, this.providesknockEventLoggerProvider, this.provideFacebookEventsProvider, this.provideFlurryEventsProvider, this.providesFlurrySessionLoggerProvider, this.providesAnalyticsNormalizerProvider, this.providesRakamEventLoggerProvider, this.providesRakamEventsProvider, this.providesIndicativeEventLoggerProvider, this.providesIndicativeEventsProvider, this.providesFirebaseEventLoggerProvider, providerM29108a21, this.providesAnalyticsDebugLoggerProvider));
        this.providesAnalyticsManagerProvider = providerM29108a22;
        Provider<PageViewsAnalytics> providerM29108a23 = C9054a.m29108a(ApplicationModule_ProvidePageViewsAnalyticsFactory.create(applicationModule, providerM29108a22));
        this.providePageViewsAnalyticsProvider = providerM29108a23;
        this.provideNavigationTrackerProvider = C9054a.m29108a(ApplicationModule_ProvideNavigationTrackerFactory.create(applicationModule, providerM29108a23, this.providesAnalyticsDebugLoggerProvider));
        this.providesConnectivityManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesConnectivityManagerFactory.create(applicationModule));
        this.providesTelephonyManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesTelephonyManagerFactory.create(applicationModule));
        this.provideAppSizeAnalyticsStringMapperProvider = C9054a.m29108a(ApplicationModule_ProvideAppSizeAnalyticsStringMapperFactory.create(applicationModule));
        Provider<DownloadSpeedIntervalMapper> providerM29108a24 = C9054a.m29108a(ApplicationModule_ProvideDownloadSpeedIntervalMapperFactory.create(applicationModule));
        this.provideDownloadSpeedIntervalMapperProvider = providerM29108a24;
        this.providesDownloadAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesDownloadAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider, this.providesConnectivityManagerProvider, this.providesTelephonyManagerProvider, this.provideAppSizeAnalyticsStringMapperProvider, providerM29108a24));
        this.provideInstallAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvideInstallAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider, this.providesConnectivityManagerProvider, this.providesTelephonyManagerProvider, this.provideAppSizeAnalyticsStringMapperProvider));
        Provider<Md5Comparator> providerM29108a25 = C9054a.m29108a(ApplicationModule_ProvidesMd5ComparatorFactory.create(applicationModule, this.provideCachePathProvider));
        this.providesMd5ComparatorProvider = providerM29108a25;
        Provider<FileDownloaderProvider> providerM29108a26 = C9054a.m29108a(ApplicationModule_ProvidesFileDownloaderProviderFactory.create(applicationModule, this.provideCachePathProvider, this.provideUserAgentInterceptorDownloadsProvider, this.provideAuthenticationPersistenceProvider, this.providesDownloadAnalyticsProvider, this.provideInstallAnalyticsProvider, providerM29108a25));
        this.providesFileDownloaderProvider = providerM29108a26;
        Provider<RetryFileDownloaderProvider> providerM29108a27 = C9054a.m29108a(ApplicationModule_ProvidesRetryFileDownloaderProviderFactory.create(applicationModule, providerM29108a26));
        this.providesRetryFileDownloaderProvider = providerM29108a27;
        this.providesAppDownloaderProvider = C9054a.m29108a(ApplicationModule_ProvidesAppDownloaderProviderFactory.create(applicationModule, providerM29108a27, this.providesDownloadAnalyticsProvider));
        this.provideApkPathProvider = C9054a.m29108a(ApplicationModule_ProvideApkPathFactory.create(applicationModule));
        Provider<String> providerM29108a28 = C9054a.m29108a(ApplicationModule_ProvideObbPathFactory.create(applicationModule));
        this.provideObbPathProvider = providerM29108a28;
        this.provideAptoideDownloadManagerProvider = C9054a.m29108a(ApplicationModule_ProvideAptoideDownloadManagerFactory.create(applicationModule, this.provideDownloadsRepositoryProvider, this.downloadStatusMapperProvider, this.providesDownloadAppMapperProvider, this.providesAppDownloaderProvider, this.provideApkPathProvider, providerM29108a28, this.providesDownloadAnalyticsProvider));
        this.providesUpdatePersistenceProvider = C9054a.m29108a(ApplicationModule_ProvidesUpdatePersistenceFactory.create(applicationModule, this.providesAptoideDataBaseProvider));
        Provider<StorePersistence> providerM29108a29 = C9054a.m29108a(ApplicationModule_ProvidesStorePersistenceFactory.create(applicationModule, this.providesAptoideDataBaseProvider));
        this.providesStorePersistenceProvider = providerM29108a29;
        this.providesRoomStoreRepositoryProvider = C9054a.m29108a(ApplicationModule_ProvidesRoomStoreRepositoryFactory.create(applicationModule, providerM29108a29));
        this.provideResourcesProvider = C9054a.m29108a(ApplicationModule_ProvideResourcesFactory.create(applicationModule));
        Provider<WindowManager> providerM29108a30 = C9054a.m29108a(ApplicationModule_ProvideWindowManagerFactory.create(applicationModule));
        this.provideWindowManagerProvider = providerM29108a30;
        this.provideQManagerProvider = C9054a.m29108a(ApplicationModule_ProvideQManagerFactory.create(applicationModule, this.provideResourcesProvider, providerM29108a30));
        Provider<String> providerM29108a31 = C9054a.m29108a(ApplicationModule_ProvideAptoidePackageFactory.create(applicationModule));
        this.provideAptoidePackageProvider = providerM29108a31;
        this.provideBodyInterceptorPoolV7Provider = C9054a.m29108a(ApplicationModule_ProvideBodyInterceptorPoolV7Factory.create(applicationModule, this.provideAuthenticationPersistenceProvider, this.provideIdsRepositoryProvider, this.providesDefaultSharedPerefencesProvider, this.provideResourcesProvider, this.provideQManagerProvider, providerM29108a31, this.providesAptoideMd5ManagerProvider));
        this.provideDefaultPreferencesProvider = C9054a.m29108a(ApplicationModule_ProvideDefaultPreferencesFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider));
        Provider<SecureCoderDecoder> providerM29108a32 = C9054a.m29108a(ApplicationModule_ProvideSecureCoderDecoderFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider));
        this.provideSecureCoderDecoderProvider = providerM29108a32;
        Provider<SecurePreferences> providerM29108a33 = C9054a.m29108a(ApplicationModule_ProvidesSecurePerefencesFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider, providerM29108a32));
        this.providesSecurePerefencesProvider = providerM29108a33;
        this.provideLocalAdultContentProvider = C9054a.m29108a(FlavourApplicationModule_ProvideLocalAdultContentFactory.create(flavourApplicationModule, this.provideDefaultPreferencesProvider, providerM29108a33));
        this.provideLongTimeoutOkHttpClientProvider = C9054a.m29108a(ApplicationModule_ProvideLongTimeoutOkHttpClientFactory.create(applicationModule, this.provideUserAgentInterceptorProvider, this.providesDefaultSharedPerefencesProvider, this.provideRetrofitLogInterceptorProvider));
        this.provideNoAuthenticationBodyInterceptorV3Provider = C9054a.m29108a(C1137xcbc5ac1.create(applicationModule, this.provideIdsRepositoryProvider, this.provideAptoidePackageProvider, this.providesAptoideMd5ManagerProvider));
        Provider<String> providerM29108a34 = C9054a.m29108a(ApplicationModule_ProvideExtraIDFactory.create(applicationModule));
        this.provideExtraIDProvider = providerM29108a34;
        this.provideTokenInvalidatorProvider = C9054a.m29108a(ApplicationModule_ProvideTokenInvalidatorFactory.create(applicationModule, this.provideOkHttpClientProvider, this.providesDefaultSharedPerefencesProvider, this.provideAuthenticationPersistenceProvider, this.provideNoAuthenticationBodyInterceptorV3Provider, providerM29108a34));
        this.provideBodyInterceptorWebV7Provider = C9054a.m29108a(ApplicationModule_ProvideBodyInterceptorWebV7Factory.create(applicationModule, this.provideAuthenticationPersistenceProvider, this.provideIdsRepositoryProvider, this.providesDefaultSharedPerefencesProvider, this.provideResourcesProvider, this.provideQManagerProvider, this.provideAptoidePackageProvider, this.providesAptoideMd5ManagerProvider));
        Provider<RequestBodyFactory> providerM29108a35 = C9054a.m29108a(ApplicationModule_ProvideRequestBodyFactoryFactory.create(applicationModule));
        this.provideRequestBodyFactoryProvider = providerM29108a35;
        this.provideMultipartBodyInterceptorProvider = C9054a.m29108a(ApplicationModule_ProvideMultipartBodyInterceptorFactory.create(applicationModule, this.provideIdsRepositoryProvider, this.provideAuthenticationPersistenceProvider, providerM29108a35));
        Provider<NetworkOperatorManager> providerM29108a36 = C9054a.m29108a(ApplicationModule_ProvidesNetworkOperatorManagerFactory.create(applicationModule, this.providesTelephonyManagerProvider));
        this.providesNetworkOperatorManagerProvider = providerM29108a36;
        this.providesBodyInterceptorV3Provider = C9054a.m29108a(ApplicationModule_ProvidesBodyInterceptorV3Factory.create(applicationModule, this.provideIdsRepositoryProvider, this.provideQManagerProvider, this.providesDefaultSharedPerefencesProvider, providerM29108a36, this.provideAuthenticationPersistenceProvider, this.provideAptoidePackageProvider, this.providesAptoideMd5ManagerProvider));
        this.provideNonNullObjectMapperProvider = C9054a.m29108a(ApplicationModule_ProvideNonNullObjectMapperFactory.create(applicationModule));
        this.providesConverterFactoryProvider = C9054a.m29108a(ApplicationModule_ProvidesConverterFactoryFactory.create(applicationModule));
        this.provideAccountFactoryProvider = C9054a.m29108a(ApplicationModule_ProvideAccountFactoryFactory.create(applicationModule));
        this.provideOAuthModeProvider = C9054a.m29108a(ApplicationModule_ProvideOAuthModeProviderFactory.create(applicationModule));
        Provider<String> providerM29108a37 = C9054a.m29108a(ApplicationModule_ProvidesBaseWebservicesHostFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider));
        this.providesBaseWebservicesHostProvider = providerM29108a37;
        Provider<AptoideAuthenticationRx> providerM29108a38 = C9054a.m29108a(ApplicationModule_ProvidesAptoideAuthenticationFactory.create(applicationModule, providerM29108a37, this.provideOkHttpClientProvider));
        this.providesAptoideAuthenticationProvider = providerM29108a38;
        Provider<AccountService> providerM29108a39 = C9054a.m29108a(ApplicationModule_ProvideAccountServiceFactory.create(applicationModule, this.provideOkHttpClientProvider, this.provideLongTimeoutOkHttpClientProvider, this.providesDefaultSharedPerefencesProvider, this.provideAuthenticationPersistenceProvider, this.provideTokenInvalidatorProvider, this.provideBodyInterceptorPoolV7Provider, this.provideBodyInterceptorWebV7Provider, this.provideMultipartBodyInterceptorProvider, this.provideNoAuthenticationBodyInterceptorV3Provider, this.providesBodyInterceptorV3Provider, this.provideNonNullObjectMapperProvider, this.providesConverterFactoryProvider, this.provideExtraIDProvider, this.provideAccountFactoryProvider, this.provideOAuthModeProvider, providerM29108a38));
        this.provideAccountServiceProvider = providerM29108a39;
        Provider<AdultContent> providerM29108a40 = C9054a.m29108a(FlavourApplicationModule_ProvideAdultContentFactory.create(flavourApplicationModule, this.provideLocalAdultContentProvider, providerM29108a39));
        this.provideAdultContentProvider = providerM29108a40;
        this.provideAccountSettingsBodyInterceptorPoolV7Provider = C9054a.m29108a(C1136xe98d65dc.create(applicationModule, this.provideBodyInterceptorPoolV7Provider, providerM29108a40));
        Provider<UpdateMapper> providerM29108a41 = C9054a.m29108a(ApplicationModule_ProvidesUpdateMapperFactory.create(applicationModule));
        this.providesUpdateMapperProvider = providerM29108a41;
        this.providesUpdateRepositoryProvider = C9054a.m29108a(ApplicationModule_ProvidesUpdateRepositoryFactory.create(applicationModule, this.providesUpdatePersistenceProvider, this.providesRoomStoreRepositoryProvider, this.provideIdsRepositoryProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider, providerM29108a41, this.provideInstalledRepositoryProvider));
        this.provideCacheHelperProvider = C9054a.m29108a(ApplicationModule_ProvideCacheHelperFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider, this.provideCachePathProvider));
        this.provideGoogleApiClientProvider = C9054a.m29108a(ApplicationModule_ProvideGoogleApiClientFactory.create(applicationModule));
        this.provideStoreManagerProvider = C9054a.m29108a(ApplicationModule_ProvideStoreManagerFactory.create(applicationModule, this.provideOkHttpClientProvider, this.provideMultipartBodyInterceptorProvider, this.providesBodyInterceptorV3Provider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.providesDefaultSharedPerefencesProvider, this.provideTokenInvalidatorProvider, this.provideRequestBodyFactoryProvider, this.provideNonNullObjectMapperProvider, this.providesRoomStoreRepositoryProvider));
    }

    private void initialize2(ApplicationModule applicationModule, FlavourApplicationModule flavourApplicationModule) {
        this.provideLoginPreferencesProvider = C9054a.m29108a(FlavourApplicationModule_ProvideLoginPreferencesFactory.create(flavourApplicationModule));
        Provider<DatabaseStoreDataPersist> providerM29108a = C9054a.m29108a(ApplicationModule_ProvidesDatabaseStoreDataPersistFactory.create(applicationModule, this.providesRoomStoreRepositoryProvider));
        this.providesDatabaseStoreDataPersistProvider = providerM29108a;
        this.providesAccountPersistenceProvider = C9054a.m29108a(ApplicationModule_ProvidesAccountPersistenceFactory.create(applicationModule, this.provideAccountManagerProvider, providerM29108a, this.provideAccountFactoryProvider, this.provideAndroidAccountProvider, this.provideAuthenticationPersistenceProvider));
        Provider<List<String>> providerM29108a2 = C9054a.m29108a(ApplicationModule_ProvidesFacebookLoginPermissionsFactory.create(applicationModule));
        this.providesFacebookLoginPermissionsProvider = providerM29108a2;
        this.provideAptoideAccountManagerProvider = C9054a.m29108a(ApplicationModule_ProvideAptoideAccountManagerFactory.create(applicationModule, this.provideAdultContentProvider, this.provideGoogleApiClientProvider, this.provideStoreManagerProvider, this.provideAccountServiceProvider, this.provideLoginPreferencesProvider, this.providesAccountPersistenceProvider, providerM29108a2));
        this.provideRootAvailabilityManagerProvider = C9054a.m29108a(ApplicationModule_ProvideRootAvailabilityManagerFactory.create(applicationModule, this.providesSecurePerefencesProvider));
        Provider<NotificationProvider> providerM29108a3 = C9054a.m29108a(ApplicationModule_ProvideNotificationProviderFactory.create(applicationModule, this.provideRoomNotificationPersistenceProvider));
        this.provideNotificationProvider = providerM29108a3;
        Provider<RoomLocalNotificationSyncPersistence> providerM29108a4 = C9054a.m29108a(C1141xc7529b2c.create(applicationModule, this.providesAptoideDataBaseProvider, providerM29108a3));
        this.providesRoomLocalNotificationSyncPersistenceProvider = providerM29108a4;
        Provider<SyncStorage> providerM29108a5 = C9054a.m29108a(ApplicationModule_ProvideSyncStorageFactory.create(applicationModule, providerM29108a4));
        this.provideSyncStorageProvider = providerM29108a5;
        this.provideSyncSchedulerProvider = C9054a.m29108a(ApplicationModule_ProvideSyncSchedulerFactory.create(applicationModule, providerM29108a5));
        Provider<PackageRepository> providerM29108a6 = C9054a.m29108a(ApplicationModule_ProvidesPackageRepositoryFactory.create(applicationModule));
        this.providesPackageRepositoryProvider = providerM29108a6;
        this.providesAdsApplicationVersionCodeProvider = C9054a.m29108a(C1138x234ee129.create(applicationModule, providerM29108a6));
        Provider<OemidProvider> providerM29108a7 = C9054a.m29108a(ApplicationModule_ProvidesOemidProviderFactory.create(applicationModule));
        this.providesOemidProvider = providerM29108a7;
        this.provideAdsRepositoryProvider = C9054a.m29108a(ApplicationModule_ProvideAdsRepositoryFactory.create(applicationModule, this.provideIdsRepositoryProvider, this.provideAptoideAccountManagerProvider, this.provideOkHttpClientProvider, this.provideQManagerProvider, this.providesDefaultSharedPerefencesProvider, this.providesAdsApplicationVersionCodeProvider, this.providesConnectivityManagerProvider, providerM29108a7));
        this.providesNewFeatureProvider = C9054a.m29108a(ApplicationModule_ProvidesNewFeatureFactory.create(applicationModule));
        Provider<LocalNotificationSyncManager> providerM29108a8 = C9054a.m29108a(ApplicationModule_ProvidesLocalNotificationSyncManagerFactory.create(applicationModule, this.provideSyncSchedulerProvider, this.provideNotificationProvider));
        this.providesLocalNotificationSyncManagerProvider = providerM29108a8;
        this.providesNewFeatureManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesNewFeatureManagerFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider, this.providesNewFeatureProvider, providerM29108a8));
        Provider<RoomStoredMinimalAdPersistence> providerM29108a9 = C9054a.m29108a(ApplicationModule_ProvidesRoomStoreMinimalAdPersistenceFactory.create(applicationModule, this.providesAptoideDataBaseProvider));
        this.providesRoomStoreMinimalAdPersistenceProvider = providerM29108a9;
        this.provideInstallationProvider = C9054a.m29108a(ApplicationModule_ProvideInstallationProviderFactory.create(applicationModule, this.provideAptoideDownloadManagerProvider, this.provideDownloadPersistenceProvider, this.provideInstalledRepositoryProvider, providerM29108a9));
        this.providesInstallerAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesInstallerAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideInstallAnalyticsProvider, this.providesDefaultSharedPerefencesProvider, this.provideRootAvailabilityManagerProvider, this.provideNavigationTrackerProvider));
        Provider<AppInstallerStatusReceiver> providerM29108a10 = C9054a.m29108a(ApplicationModule_ProvidesAppInstallerStatusReceiverFactory.create(applicationModule));
        this.providesAppInstallerStatusReceiverProvider = providerM29108a10;
        this.providesAppInstallerProvider = C9054a.m29108a(ApplicationModule_ProvidesAppInstallerFactory.create(applicationModule, providerM29108a10));
        Provider<RootInstallerProvider> providerM29108a11 = C9054a.m29108a(ApplicationModule_ProvidesRootInstallerProviderFactory.create(applicationModule, this.providesInstallerAnalyticsProvider));
        this.providesRootInstallerProvider = providerM29108a11;
        this.provideDefaultInstallerProvider = C9054a.m29108a(ApplicationModule_ProvideDefaultInstallerFactory.create(applicationModule, this.provideInstallationProvider, this.providesDefaultSharedPerefencesProvider, this.provideInstalledRepositoryProvider, this.provideRootAvailabilityManagerProvider, this.providesInstallerAnalyticsProvider, this.providesAppInstallerProvider, this.providesAppInstallerStatusReceiverProvider, providerM29108a11));
        this.providesSecureSharedPreferencesProvider = C9054a.m29108a(ApplicationModule_ProvidesSecureSharedPreferencesFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider));
        this.providesForegroundManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesForegroundManagerFactory.create(applicationModule));
        Provider<AptoideInstallPersistence> providerM29108a12 = C9054a.m29108a(ApplicationModule_ProvidesAptoideInstallPersistenceFactory.create(applicationModule, this.providesAptoideDataBaseProvider));
        this.providesAptoideInstallPersistenceProvider = providerM29108a12;
        Provider<AptoideInstallRepository> providerM29108a13 = C9054a.m29108a(ApplicationModule_ProvidesAptoideInstallRepositoryFactory.create(applicationModule, providerM29108a12));
        this.providesAptoideInstallRepositoryProvider = providerM29108a13;
        this.providesAptoideInstallManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesAptoideInstallManagerFactory.create(applicationModule, this.provideInstalledRepositoryProvider, providerM29108a13));
        Provider<FilePathProvider> providerM29108a14 = C9054a.m29108a(ApplicationModule_FilePathManagerFactory.create(applicationModule, this.provideCachePathProvider, this.provideApkPathProvider, this.provideObbPathProvider));
        this.filePathManagerProvider = providerM29108a14;
        this.providesInstallAppSizeValidatorProvider = C9054a.m29108a(ApplicationModule_ProvidesInstallAppSizeValidatorFactory.create(applicationModule, providerM29108a14));
        Provider<FileManager> providerM29108a15 = C9054a.m29108a(ApplicationModule_ProvidesFileManagerFactory.create(applicationModule, this.provideCacheHelperProvider, this.provideCachePathProvider, this.provideAptoideDownloadManagerProvider, this.provideL2CacheProvider));
        this.providesFileManagerProvider = providerM29108a15;
        Provider<InstallManager> providerM29108a16 = C9054a.m29108a(ApplicationModule_ProvidesInstallManagerFactory.create(applicationModule, this.provideAptoideDownloadManagerProvider, this.provideDefaultInstallerProvider, this.provideRootAvailabilityManagerProvider, this.providesDefaultSharedPerefencesProvider, this.providesSecureSharedPreferencesProvider, this.provideDownloadsRepositoryProvider, this.provideInstalledRepositoryProvider, this.providesForegroundManagerProvider, this.providesAptoideInstallManagerProvider, this.providesInstallAppSizeValidatorProvider, providerM29108a15));
        this.providesInstallManagerProvider = providerM29108a16;
        this.providesReadyToInstallNotificationManagerProvider = C9054a.m29108a(C1140xa0c4ceda.create(applicationModule, providerM29108a16));
        this.providesThemeAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesThemeAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideFirebaseAnalyticsProvider));
        Provider<StoreCredentialsProvider> providerM29108a17 = C9054a.m29108a(ApplicationModule_ProvidesStoreCredentialsProviderFactory.create(applicationModule, this.providesRoomStoreRepositoryProvider));
        this.providesStoreCredentialsProvider = providerM29108a17;
        this.provideStoreUtilsProxyProvider = C9054a.m29108a(ApplicationModule_ProvideStoreUtilsProxyFactory.create(applicationModule, this.provideAptoideAccountManagerProvider, this.providesRoomStoreRepositoryProvider, this.provideOkHttpClientProvider, this.providesDefaultSharedPerefencesProvider, this.provideTokenInvalidatorProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, providerM29108a17));
        Provider<TrendingService> providerM29108a18 = C9054a.m29108a(ApplicationModule_ProvidesTrendingServiceFactory.create(applicationModule, this.providesStoreCredentialsProvider, this.providesDefaultSharedPerefencesProvider, this.provideTokenInvalidatorProvider, this.providesConverterFactoryProvider, this.provideOkHttpClientProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider));
        this.providesTrendingServiceProvider = providerM29108a18;
        this.providesTrendingManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesTrendingManagerFactory.create(applicationModule, providerM29108a18));
        this.provideAdultContentAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvideAdultContentAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.provideNotificationAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvideNotificationAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.provideSearchBaseUrlProvider = C9054a.m29108a(ApplicationModule_ProvideSearchBaseUrlFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider));
        Provider<CallAdapter.Factory> providerM29108a19 = C9054a.m29108a(ApplicationModule_ProvidesCallAdapterFactoryFactory.create(applicationModule));
        this.providesCallAdapterFactoryProvider = providerM29108a19;
        Provider<Retrofit> providerM29108a20 = C9054a.m29108a(ApplicationModule_ProvidesSearchSuggestionsRetrofitFactory.create(applicationModule, this.provideSearchBaseUrlProvider, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, providerM29108a19));
        this.providesSearchSuggestionsRetrofitProvider = providerM29108a20;
        Provider<SearchSuggestionRemoteRepository> providerM29108a21 = C9054a.m29108a(C1142xf5423e59.create(applicationModule, providerM29108a20));
        this.providesSearchSuggestionRemoteRepositoryProvider = providerM29108a21;
        this.providesSearchSuggestionManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesSearchSuggestionManagerFactory.create(applicationModule, providerM29108a21));
        this.providesSafetyNetClientProvider = C9054a.m29108a(ApplicationModule_ProvidesSafetyNetClientFactory.create(applicationModule));
        Provider<GmsStatusValueProvider> providerM29108a22 = C9054a.m29108a(ApplicationModule_ProvidesGmsStatusValueProviderFactory.create(applicationModule));
        this.providesGmsStatusValueProvider = providerM29108a22;
        this.providesFirstLaunchAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesFirstLaunchAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.providesAnalyticsDebugLoggerProvider, this.providesSafetyNetClientProvider, providerM29108a22));
        this.provideInvalidRefreshTokenLogoutManagerProvider = C9054a.m29108a(ApplicationModule_ProvideInvalidRefreshTokenLogoutManagerFactory.create(applicationModule, this.provideAptoideAccountManagerProvider, this.provideTokenInvalidatorProvider));
        this.provideRootInstallationRetryHandlerProvider = C9054a.m29108a(ApplicationModule_ProvideRootInstallationRetryHandlerFactory.create(applicationModule, this.providesInstallManagerProvider));
        this.providesShortcutManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesShortcutManagerFactory.create(applicationModule));
        this.providesSettingsManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesSettingsManagerFactory.create(applicationModule));
        this.provideDefaultFollowedStoresProvider = C9054a.m29108a(ApplicationModule_ProvideDefaultFollowedStoresFactory.create(applicationModule));
        this.providesCrashReportsProvider = C9054a.m29108a(ApplicationModule_ProvidesCrashReportsFactory.create(applicationModule));
        this.providesSplitsMapperProvider = C9054a.m29108a(ApplicationModule_ProvidesSplitsMapperFactory.create(applicationModule));
        Provider<CampaignMapper> providerM29108a23 = C9054a.m29108a(ApplicationModule_ProvideCampaignMapperFactory.create(applicationModule));
        this.provideCampaignMapperProvider = providerM29108a23;
        Provider<AppService> providerM29108a24 = C9054a.m29108a(ApplicationModule_ProvidesAppServiceFactory.create(applicationModule, this.providesStoreCredentialsProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider, this.providesSplitsMapperProvider, providerM29108a23));
        this.providesAppServiceProvider = providerM29108a24;
        Provider<AppCenterRepository> providerM29108a25 = C9054a.m29108a(ApplicationModule_ProvidesAppCenterRepositoryFactory.create(applicationModule, providerM29108a24));
        this.providesAppCenterRepositoryProvider = providerM29108a25;
        Provider<AppCenter> providerM29108a26 = C9054a.m29108a(ApplicationModule_ProvidesAppCenterFactory.create(applicationModule, providerM29108a25));
        this.providesAppCenterProvider = providerM29108a26;
        this.providesUpdatesNotificationWorkerFactoryProvider = C9054a.m29108a(C1143x444edd3e.create(applicationModule, this.providesUpdateRepositoryProvider, this.providesDefaultSharedPerefencesProvider, this.providesAptoideInstallManagerProvider, this.provideSyncSchedulerProvider, this.provideSyncStorageProvider, this.providesCrashReportsProvider, providerM29108a26));
        Provider<FollowedStoresManager> providerM29108a27 = C9054a.m29108a(ApplicationModule_ProvidesFollowedStoresManagerFactory.create(applicationModule, this.providesStoreCredentialsProvider, this.provideDefaultFollowedStoresProvider, this.provideStoreUtilsProxyProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideAptoideAccountManagerProvider, this.provideOkHttpClientProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider));
        this.providesFollowedStoresManagerProvider = providerM29108a27;
        this.providesFirstLaunchManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesFirstLaunchManagerFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider, this.provideIdsRepositoryProvider, providerM29108a27, this.provideRootAvailabilityManagerProvider, this.provideAptoideAccountManagerProvider, this.providesShortcutManagerProvider));
        Provider<UpdateLaunchManager> providerM29108a28 = C9054a.m29108a(ApplicationModule_ProvidesUpdateLaunchManagerFactory.create(applicationModule, this.providesFollowedStoresManagerProvider));
        this.providesUpdateLaunchManagerProvider = providerM29108a28;
        this.providesLaunchManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesLaunchManagerFactory.create(applicationModule, this.providesFirstLaunchManagerProvider, providerM29108a28, this.providesSecureSharedPreferencesProvider));
        this.providesAppInBackgroundTrackerProvider = C9054a.m29108a(ApplicationModule_ProvidesAppInBackgroundTrackerFactory.create(applicationModule));
        Provider<Interceptor> providerM29108a29 = C9054a.m29108a(ApplicationModule_ProvideUserAgentInterceptorV8Factory.create(applicationModule, this.provideIdsRepositoryProvider, this.provideAptoidePackageProvider, this.provideAuthenticationPersistenceProvider, this.providesAptoideMd5ManagerProvider));
        this.provideUserAgentInterceptorV8Provider = providerM29108a29;
        this.provideV8OkHttpClientProvider = C9054a.m29108a(ApplicationModule_ProvideV8OkHttpClientFactory.create(applicationModule, this.providesOkHttpBuilderProvider, providerM29108a29));
        Provider<String> providerM29108a30 = C9054a.m29108a(ApplicationModule_ProvidesApichainBdsBaseHostFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider));
        this.providesApichainBdsBaseHostProvider = providerM29108a30;
        Provider<Retrofit> providerM29108a31 = C9054a.m29108a(ApplicationModule_ProvidesApiChainBDSRetrofitFactory.create(applicationModule, this.provideV8OkHttpClientProvider, this.providesConverterFactoryProvider, this.providesCallAdapterFactoryProvider, providerM29108a30));
        this.providesApiChainBDSRetrofitProvider = providerM29108a31;
        Provider<BonusAppcRemoteService.ServiceApi> providerM29108a32 = C9054a.m29108a(ApplicationModule_ProvidesBonusAppcServiceApiFactory.create(applicationModule, providerM29108a31));
        this.providesBonusAppcServiceApiProvider = providerM29108a32;
        Provider<BonusAppcService> providerM29108a33 = C9054a.m29108a(ApplicationModule_ProvidesBonusAppcServiceFactory.create(applicationModule, providerM29108a32));
        this.providesBonusAppcServiceProvider = providerM29108a33;
        this.providesAppCoinsManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesAppCoinsManagerFactory.create(applicationModule, providerM29108a33));
        this.provideFirebaseNotificationAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvideFirebaseNotificationAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider));
        this.providesCampaignAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesCampaignAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider));
        Provider<AppcMigrationPersistence> providerM29108a34 = C9054a.m29108a(ApplicationModule_ProvidesAppcMigrationAccessorFactory.create(applicationModule, this.providesAptoideDataBaseProvider));
        this.providesAppcMigrationAccessorProvider = providerM29108a34;
        Provider<AppcMigrationRepository> providerM29108a35 = C9054a.m29108a(ApplicationModule_ProvidesAppcMigrationServiceFactory.create(applicationModule, providerM29108a34));
        this.providesAppcMigrationServiceProvider = providerM29108a35;
        this.providesAppcMigrationManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesAppcMigrationManagerFactory.create(applicationModule, this.provideInstalledRepositoryProvider, providerM29108a35));
        this.provideMarketNameProvider = C9054a.m29108a(ApplicationModule_ProvideMarketNameFactory.create(applicationModule));
        Provider<AppValidationAnalytics> providerM29108a36 = C9054a.m29108a(ApplicationModule_ProvidesAppValidationAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesAppValidationAnalyticsProvider = providerM29108a36;
        this.providesAppValidatorProvider = C9054a.m29108a(ApplicationModule_ProvidesAppValidatorFactory.create(applicationModule, providerM29108a36));
        Provider<SplitTypeSubFileTypeMapper> providerM29108a37 = C9054a.m29108a(ApplicationModule_ProvideSplitTypeSubFileTypeMapperFactory.create(applicationModule));
        this.provideSplitTypeSubFileTypeMapperProvider = providerM29108a37;
        this.provideDownloadFactoryProvider = C9054a.m29108a(ApplicationModule_ProvideDownloadFactoryFactory.create(applicationModule, this.provideMarketNameProvider, this.provideCachePathProvider, this.providesAppValidatorProvider, providerM29108a37));
        this.provideFragmentNavigatorMapProvider = C9054a.m29108a(ApplicationModule_ProvideFragmentNavigatorMapFactory.create(applicationModule));
        this.provideFragmentNavigatorRelayProvider = C9054a.m29108a(ApplicationModule_ProvideFragmentNavigatorRelayFactory.create(applicationModule));
        this.provideCallbackManagerProvider = C9054a.m29108a(ApplicationModule_ProvideCallbackManagerFactory.create(applicationModule));
        this.provideAccountAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvideAccountAnalyticsFactory.create(applicationModule, this.provideNavigationTrackerProvider, this.providesAnalyticsManagerProvider));
        this.providesSearchAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesSearchAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.provideAptoideMmpBaseHostProvider = C9054a.m29108a(ApplicationModule_ProvideAptoideMmpBaseHostFactory.create(applicationModule));
        Provider<OkHttpClient.Builder> providerM29108a38 = C9054a.m29108a(ApplicationModule_ProvidesAptoideMMPOkHttpBuilderFactory.create(applicationModule, this.provideL2CacheProvider, this.providesDefaultSharedPerefencesProvider, this.provideRetrofitLogInterceptorProvider));
        this.providesAptoideMMPOkHttpBuilderProvider = providerM29108a38;
        Provider<OkHttpClient> providerM29108a39 = C9054a.m29108a(ApplicationModule_ProvideAptoideMMpOkHttpClientFactory.create(applicationModule, providerM29108a38, this.provideUserAgentInterceptorProvider));
        this.provideAptoideMMpOkHttpClientProvider = providerM29108a39;
        Provider<Retrofit> providerM29108a40 = C9054a.m29108a(ApplicationModule_ProvidesAptoideMmpRetrofitFactory.create(applicationModule, this.provideAptoideMmpBaseHostProvider, providerM29108a39, this.providesConverterFactoryProvider, this.providesCallAdapterFactoryProvider));
        this.providesAptoideMmpRetrofitProvider = providerM29108a40;
        Provider<AptoideApkfyService.ServiceApi> providerM29108a41 = C9054a.m29108a(ApplicationModule_ProvidesApkfyServiceApiFactory.create(applicationModule, providerM29108a40));
        this.providesApkfyServiceApiProvider = providerM29108a41;
        Provider<ApkfyService> providerM29108a42 = C9054a.m29108a(ApplicationModule_ProvideApkfyServiceFactory.create(applicationModule, providerM29108a41));
        this.provideApkfyServiceProvider = providerM29108a42;
        this.provideApkfyManagerProvider = C9054a.m29108a(ApplicationModule_ProvideApkfyManagerFactory.create(applicationModule, providerM29108a42));
        this.provideDeepLinkAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvideDeepLinkAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesAppShortcutsAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesAppShortcutsAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesStoreAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesStoreAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesUpdatesManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesUpdatesManagerFactory.create(applicationModule, this.providesUpdateRepositoryProvider));
        this.providePermissionManagerProvider = C9054a.m29108a(ApplicationModule_ProvidePermissionManagerFactory.create(applicationModule));
    }

    private void initialize3(ApplicationModule applicationModule, FlavourApplicationModule flavourApplicationModule) {
        Provider<String> providerM29108a = C9054a.m29108a(ApplicationModule_ProvidesBaseHostCacheFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider));
        this.providesBaseHostCacheProvider = providerM29108a;
        Provider<Retrofit> providerM29108a2 = C9054a.m29108a(ApplicationModule_ProvidesV7CacheRetrofitFactory.create(applicationModule, providerM29108a, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, this.providesCallAdapterFactoryProvider));
        this.providesV7CacheRetrofitProvider = providerM29108a2;
        this.providesAutoUpdateServiceProvider = C9054a.m29108a(ApplicationModule_ProvidesAutoUpdateServiceFactory.create(applicationModule, providerM29108a2));
        this.providesAgentPersistenceProvider = C9054a.m29108a(ApplicationModule_ProvidesAgentPersistenceFactory.create(applicationModule, this.providesSecureSharedPreferencesProvider));
        this.provideMarketResourceFormatterProvider = C9054a.m29108a(ApplicationModule_ProvideMarketResourceFormatterFactory.create(applicationModule, this.provideMarketNameProvider));
        this.providesDownloadStateParserProvider = C9054a.m29108a(ApplicationModule_ProvidesDownloadStateParserFactory.create(applicationModule));
        Provider<WalletAdsOfferManager> providerM29108a3 = C9054a.m29108a(FlavourApplicationModule_ProvidesWalletAdsOfferManagerFactory.create(flavourApplicationModule));
        this.providesWalletAdsOfferManagerProvider = providerM29108a3;
        this.providesMoPubAdsManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesMoPubAdsManagerFactory.create(applicationModule, providerM29108a3));
        this.splitAnalyticsMapperProvider = C9054a.m29108a(ApplicationModule_SplitAnalyticsMapperFactory.create(applicationModule));
        this.providesWalletAppProvider = C9054a.m29108a(ApplicationModule_ProvidesWalletAppProviderFactory.create(applicationModule, this.providesAppCenterProvider, this.provideInstalledRepositoryProvider, this.providesInstallManagerProvider, this.providesDownloadStateParserProvider));
        this.providesDynamicSplitsApiProvider = C9054a.m29108a(ApplicationModule_ProvidesDynamicSplitsApiFactory.create(applicationModule, this.providesV7CacheRetrofitProvider));
        Provider<DynamicSplitsMapper> providerM29108a4 = C9054a.m29108a(ApplicationModule_ProvidesDynamicSplitsMapperFactory.create(applicationModule));
        this.providesDynamicSplitsMapperProvider = providerM29108a4;
        Provider<DynamicSplitsService> providerM29108a5 = C9054a.m29108a(ApplicationModule_ProvidesDynamicSplitsServiceFactory.create(applicationModule, this.providesDynamicSplitsApiProvider, providerM29108a4));
        this.providesDynamicSplitsServiceProvider = providerM29108a5;
        this.providesDynamicSplitsManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesDynamicSplitsManagerFactory.create(applicationModule, providerM29108a5));
        Provider<String> providerM29108a6 = C9054a.m29108a(FlavourApplicationModule_ProvidesSupportEmailFactory.create(flavourApplicationModule));
        this.providesSupportEmailProvider = providerM29108a6;
        this.providesSupportEmailProvider2 = C9054a.m29108a(ApplicationModule_ProvidesSupportEmailProviderFactory.create(applicationModule, providerM29108a6));
        this.providesImageInfoProvider = C9054a.m29108a(ApplicationModule_ProvidesImageInfoProviderFactory.create(applicationModule));
        this.providesNewsletterManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesNewsletterManagerFactory.create(applicationModule));
        this.providesSearchRepositoryProvider = C9054a.m29108a(ApplicationModule_ProvidesSearchRepositoryFactory.create(applicationModule, this.providesRoomStoreRepositoryProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.providesDefaultSharedPerefencesProvider, this.provideTokenInvalidatorProvider, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, this.providesOemidProvider, this.provideCampaignMapperProvider));
        this.providesDownloadStatusManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesDownloadStatusManagerFactory.create(applicationModule, this.providesInstallManagerProvider, this.providesAppcMigrationManagerProvider));
        Provider<CampaignRepository> providerM29108a7 = C9054a.m29108a(ApplicationModule_ProvideCampaignRepositoryFactory.create(applicationModule, this.provideOkHttpClientProvider));
        this.provideCampaignRepositoryProvider = providerM29108a7;
        this.provideCampaignManagerProvider = C9054a.m29108a(ApplicationModule_ProvideCampaignManagerFactory.create(applicationModule, providerM29108a7, this.providesSecureSharedPreferencesProvider));
        this.providesLoginSignupManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesLoginSignupManagerFactory.create(applicationModule));
        Provider<BlacklistPersistence> providerM29108a8 = C9054a.m29108a(ApplicationModule_ProvidesBlacklistPersistenceFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider));
        this.providesBlacklistPersistenceProvider = providerM29108a8;
        this.providesBlacklisterProvider = C9054a.m29108a(ApplicationModule_ProvidesBlacklisterFactory.create(applicationModule, providerM29108a8));
        Provider<BlacklistUnitMapper> providerM29108a9 = C9054a.m29108a(ApplicationModule_ProvidesBundleToBlacklistUnitMapperFactory.create(applicationModule));
        this.providesBundleToBlacklistUnitMapperProvider = providerM29108a9;
        Provider<BlacklistManager> providerM29108a10 = C9054a.m29108a(ApplicationModule_ProvidesBlacklistManagerFactory.create(applicationModule, this.providesBlacklisterProvider, providerM29108a9));
        this.providesBlacklistManagerProvider = providerM29108a10;
        this.providesWalletAdsOfferCardManagerProvider = C9054a.m29108a(C1145x7d1c8138.create(flavourApplicationModule, providerM29108a10, this.providesPackageRepositoryProvider));
        Provider<AppComingSoonRegistrationPersistence> providerM29108a11 = C9054a.m29108a(C1139xde208b8c.create(applicationModule, this.providesAptoideDataBaseProvider));
        this.providesAppComingSoonRegistrationPersistenceProvider = providerM29108a11;
        Provider<AppComingSoonRegistrationManager> providerM29108a12 = C9054a.m29108a(ApplicationModule_ProvidesAppComingSoonPreferencesManagerFactory.create(applicationModule, providerM29108a11));
        this.providesAppComingSoonPreferencesManagerProvider = providerM29108a12;
        Provider<BundlesResponseMapper> providerM29108a13 = C9054a.m29108a(ApplicationModule_ProvidesBundlesMapperFactory.create(applicationModule, this.providesInstallManagerProvider, this.providesWalletAdsOfferCardManagerProvider, this.providesBlacklistManagerProvider, this.providesDownloadStateParserProvider, providerM29108a12));
        this.providesBundlesMapperProvider = providerM29108a13;
        Provider<BundleDataSource> providerM29108a14 = C9054a.m29108a(ApplicationModule_ProvidesRemoteBundleDataSourceFactory.create(applicationModule, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, providerM29108a13, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider, this.provideAptoideAccountManagerProvider, this.providesPackageRepositoryProvider, this.provideIdsRepositoryProvider, this.provideQManagerProvider, this.provideResourcesProvider, this.provideWindowManagerProvider, this.providesConnectivityManagerProvider, this.providesAdsApplicationVersionCodeProvider, this.providesOemidProvider, this.providesStoreCredentialsProvider, this.providesAppCoinsManagerProvider));
        this.providesRemoteBundleDataSourceProvider = providerM29108a14;
        this.providesBundleRepositoryProvider = C9054a.m29108a(ApplicationModule_ProvidesBundleRepositoryFactory.create(applicationModule, providerM29108a14));
        this.providesPromotionViewAppMapperProvider = C9054a.m29108a(ApplicationModule_ProvidesPromotionViewAppMapperFactory.create(applicationModule, this.providesDownloadStateParserProvider));
        this.providesPromotionsAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesPromotionsAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider, this.providesDownloadAnalyticsProvider, this.provideInstallAnalyticsProvider));
        Provider<PromotionsService> providerM29108a15 = C9054a.m29108a(ApplicationModule_ProvidesPromotionsServiceFactory.create(applicationModule, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.provideTokenInvalidatorProvider, this.providesConverterFactoryProvider, this.providesDefaultSharedPerefencesProvider, this.providesSplitsMapperProvider));
        this.providesPromotionsServiceProvider = providerM29108a15;
        this.providePromotionsManagerProvider = C9054a.m29108a(ApplicationModule_ProvidePromotionsManagerFactory.create(applicationModule, this.providesInstallManagerProvider, this.providesPromotionViewAppMapperProvider, this.provideDownloadFactoryProvider, this.providesDownloadStateParserProvider, this.providesPromotionsAnalyticsProvider, this.provideNotificationAnalyticsProvider, this.provideInstallAnalyticsProvider, providerM29108a15, this.provideInstalledRepositoryProvider, this.providesMoPubAdsManagerProvider, this.providesWalletAppProvider, this.providesDynamicSplitsManagerProvider, this.splitAnalyticsMapperProvider));
        this.providesPromotionsPreferencesManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesPromotionsPreferencesManagerFactory.create(applicationModule, this.providesUserPreferencesPersisterProvider));
        this.provideHomePromotionsIdProvider = C9054a.m29108a(ApplicationModule_ProvideHomePromotionsIdFactory.create(applicationModule));
        Provider<String> providerM29108a16 = C9054a.m29108a(ApplicationModule_ProvidesReactionsHostFactory.create(applicationModule));
        this.providesReactionsHostProvider = providerM29108a16;
        Provider<Retrofit> providerM29108a17 = C9054a.m29108a(ApplicationModule_ProvidesLoadTopReactionsRetrofitFactory.create(applicationModule, providerM29108a16, this.provideV8OkHttpClientProvider, this.providesConverterFactoryProvider, this.providesCallAdapterFactoryProvider));
        this.providesLoadTopReactionsRetrofitProvider = providerM29108a17;
        Provider<ReactionsRemoteService.ServiceV8> providerM29108a18 = C9054a.m29108a(ApplicationModule_ProvidesReactionsServiceV8Factory.create(applicationModule, providerM29108a17));
        this.providesReactionsServiceV8Provider = providerM29108a18;
        Provider<ReactionsService> providerM29108a19 = C9054a.m29108a(ApplicationModule_ProvidesReactionsServiceFactory.create(applicationModule, providerM29108a18));
        this.providesReactionsServiceProvider = providerM29108a19;
        this.providesReactionsManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesReactionsManagerFactory.create(applicationModule, providerM29108a19));
        this.providesComingSoonNotificationManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesComingSoonNotificationManagerFactory.create(applicationModule, this.providesAppComingSoonPreferencesManagerProvider));
        this.providesAdMapperProvider = C9054a.m29108a(ApplicationModule_ProvidesAdMapperFactory.create(applicationModule));
        this.providesUserFeedbackAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesUserFeedbackAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesCaptionBackgroundPainterProvider = C9054a.m29108a(ApplicationModule_ProvidesCaptionBackgroundPainterFactory.create(applicationModule));
        this.providesUpdatesAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesUpdatesAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider, this.provideInstallAnalyticsProvider));
        this.providesUpdatesNotificationManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesUpdatesNotificationManagerFactory.create(applicationModule));
        this.providesMyAccountManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesMyAccountManagerFactory.create(applicationModule));
        this.providesSocialMediaAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesSocialMediaAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesAppViewAnalyticsProvider = C9054a.m29108a(ApplicationModule_ProvidesAppViewAnalyticsFactory.create(applicationModule, this.providesDownloadAnalyticsProvider, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider, this.providesStoreAnalyticsProvider, this.provideInstallAnalyticsProvider));
        Provider<AppCoinsService> providerM29108a20 = C9054a.m29108a(ApplicationModule_ProvidesAppCoinsServiceFactory.create(applicationModule, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider, this.providesConverterFactoryProvider));
        this.providesAppCoinsServiceProvider = providerM29108a20;
        this.providesAppCoinsAdvertisingManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesAppCoinsAdvertisingManagerFactory.create(applicationModule, providerM29108a20));
        Provider<ReviewsService> providerM29108a21 = C9054a.m29108a(ApplicationModule_ProvidesReviewsServiceFactory.create(applicationModule, this.providesStoreCredentialsProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider));
        this.providesReviewsServiceProvider = providerM29108a21;
        Provider<ReviewsRepository> providerM29108a22 = C9054a.m29108a(ApplicationModule_ProvidesReviewsRepositoryFactory.create(applicationModule, providerM29108a21));
        this.providesReviewsRepositoryProvider = providerM29108a22;
        this.providesReviewsManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesReviewsManagerFactory.create(applicationModule, providerM29108a22));
        this.providesAdsManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesAdsManagerFactory.create(applicationModule, this.provideAdsRepositoryProvider, this.providesRoomStoreMinimalAdPersistenceProvider));
        Provider<String> providerM29108a23 = C9054a.m29108a(ApplicationModule_ProvidesAppsFlyerBaseUrlFactory.create(applicationModule));
        this.providesAppsFlyerBaseUrlProvider = providerM29108a23;
        Provider<Retrofit> providerM29108a24 = C9054a.m29108a(ApplicationModule_ProvidesAppsFlyerRetrofitFactory.create(applicationModule, providerM29108a23, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, this.providesCallAdapterFactoryProvider));
        this.providesAppsFlyerRetrofitProvider = providerM29108a24;
        Provider<AppsFlyerService> providerM29108a25 = C9054a.m29108a(ApplicationModule_ProvidesAppsFlyerServiceFactory.create(applicationModule, providerM29108a24));
        this.providesAppsFlyerServiceProvider = providerM29108a25;
        Provider<AppsFlyerRepository> providerM29108a26 = C9054a.m29108a(ApplicationModule_ProvidesAppsFlyerRepositoryFactory.create(applicationModule, providerM29108a25));
        this.providesAppsFlyerRepositoryProvider = providerM29108a26;
        this.providesAppsFlyerManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesAppsFlyerManagerFactory.create(applicationModule, providerM29108a26));
        this.providesDecimalFormatProvider = C9054a.m29108a(ApplicationModule_ProvidesDecimalFormatFactory.create(applicationModule));
        this.providesChipManagerProvider = C9054a.m29108a(ApplicationModule_ProvidesChipManagerFactory.create(applicationModule));
        this.providesEditorialServiceProvider = C9054a.m29108a(ApplicationModule_ProvidesEditorialServiceFactory.create(applicationModule, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider, this.providesSplitsMapperProvider, this.provideCampaignMapperProvider));
    }

    private AptoideApplication injectAptoideApplication(AptoideApplication aptoideApplication) {
        AptoideApplication_MembersInjector.injectAptoideDatabase(aptoideApplication, this.providesAptoideDataBaseProvider.get());
        AptoideApplication_MembersInjector.injectNotificationPersistence(aptoideApplication, this.provideRoomNotificationPersistenceProvider.get());
        AptoideApplication_MembersInjector.injectAptoideInstalledAppsRepository(aptoideApplication, this.provideInstalledRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectRakamBaseHost(aptoideApplication, this.providesBaseRakamHostProvider.get());
        AptoideApplication_MembersInjector.injectAptoideDownloadManager(aptoideApplication, this.provideAptoideDownloadManagerProvider.get());
        AptoideApplication_MembersInjector.injectUpdateRepository(aptoideApplication, this.providesUpdateRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectCacheHelper(aptoideApplication, this.provideCacheHelperProvider.get());
        AptoideApplication_MembersInjector.injectAccountManager(aptoideApplication, this.provideAptoideAccountManagerProvider.get());
        AptoideApplication_MembersInjector.injectPreferences(aptoideApplication, this.provideDefaultPreferencesProvider.get());
        AptoideApplication_MembersInjector.injectSecurePreferences(aptoideApplication, this.providesSecurePerefencesProvider.get());
        AptoideApplication_MembersInjector.injectAdultContent(aptoideApplication, this.provideAdultContentProvider.get());
        AptoideApplication_MembersInjector.injectIdsRepository(aptoideApplication, this.provideIdsRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectDefaultClient(aptoideApplication, this.provideOkHttpClientProvider.get());
        AptoideApplication_MembersInjector.injectRootAvailabilityManager(aptoideApplication, this.provideRootAvailabilityManagerProvider.get());
        AptoideApplication_MembersInjector.injectAuthenticationPersistence(aptoideApplication, this.provideAuthenticationPersistenceProvider.get());
        AptoideApplication_MembersInjector.injectAlarmSyncScheduler(aptoideApplication, this.provideSyncSchedulerProvider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorPoolV7(aptoideApplication, this.provideAccountSettingsBodyInterceptorPoolV7Provider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorWebV7(aptoideApplication, this.provideBodyInterceptorWebV7Provider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorV3(aptoideApplication, this.providesBodyInterceptorV3Provider.get());
        AptoideApplication_MembersInjector.injectHttpClientCache(aptoideApplication, this.provideL2CacheProvider.get());
        AptoideApplication_MembersInjector.injectQManager(aptoideApplication, this.provideQManagerProvider.get());
        AptoideApplication_MembersInjector.injectTokenInvalidator(aptoideApplication, this.provideTokenInvalidatorProvider.get());
        AptoideApplication_MembersInjector.injectPackageRepository(aptoideApplication, this.providesPackageRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectApplicationVersionCodeProvider(aptoideApplication, this.providesAdsApplicationVersionCodeProvider.get());
        AptoideApplication_MembersInjector.injectAdsRepository(aptoideApplication, this.provideAdsRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectSyncStorage(aptoideApplication, this.provideSyncStorageProvider.get());
        AptoideApplication_MembersInjector.injectNavigationTracker(aptoideApplication, this.provideNavigationTrackerProvider.get());
        AptoideApplication_MembersInjector.injectNewFeature(aptoideApplication, this.providesNewFeatureProvider.get());
        AptoideApplication_MembersInjector.injectNewFeatureManager(aptoideApplication, this.providesNewFeatureManagerProvider.get());
        AptoideApplication_MembersInjector.injectReadyToInstallNotificationManager(aptoideApplication, this.providesReadyToInstallNotificationManagerProvider.get());
        AptoideApplication_MembersInjector.injectThemeAnalytics(aptoideApplication, this.providesThemeAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectAccountSettingsBodyInterceptorPoolV7(aptoideApplication, this.provideAccountSettingsBodyInterceptorPoolV7Provider.get());
        AptoideApplication_MembersInjector.injectStoreCredentials(aptoideApplication, this.providesStoreCredentialsProvider.get());
        AptoideApplication_MembersInjector.injectStoreUtilsProxy(aptoideApplication, this.provideStoreUtilsProxyProvider.get());
        AptoideApplication_MembersInjector.injectTrendingManager(aptoideApplication, this.providesTrendingManagerProvider.get());
        AptoideApplication_MembersInjector.injectAdultContentAnalytics(aptoideApplication, this.provideAdultContentAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectNotificationAnalytics(aptoideApplication, this.provideNotificationAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectSearchSuggestionManager(aptoideApplication, this.providesSearchSuggestionManagerProvider.get());
        AptoideApplication_MembersInjector.injectAnalyticsManager(aptoideApplication, this.providesAnalyticsManagerProvider.get());
        AptoideApplication_MembersInjector.injectFirstLaunchAnalytics(aptoideApplication, this.providesFirstLaunchAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectInvalidRefreshTokenLogoutManager(aptoideApplication, this.provideInvalidRefreshTokenLogoutManagerProvider.get());
        AptoideApplication_MembersInjector.injectRootInstallationRetryHandler(aptoideApplication, this.provideRootInstallationRetryHandlerProvider.get());
        AptoideApplication_MembersInjector.injectShortcutManager(aptoideApplication, this.providesShortcutManagerProvider.get());
        AptoideApplication_MembersInjector.injectSettingsManager(aptoideApplication, this.providesSettingsManagerProvider.get());
        AptoideApplication_MembersInjector.injectInstallManager(aptoideApplication, this.providesInstallManagerProvider.get());
        AptoideApplication_MembersInjector.injectDefaultFollowedStores(aptoideApplication, this.provideDefaultFollowedStoresProvider.get());
        AptoideApplication_MembersInjector.injectOemidProvider(aptoideApplication, this.providesOemidProvider.get());
        AptoideApplication_MembersInjector.injectAptoideMd5Manager(aptoideApplication, this.providesAptoideMd5ManagerProvider.get());
        AptoideApplication_MembersInjector.injectAptoideWorkerFactory(aptoideApplication, this.providesUpdatesNotificationWorkerFactoryProvider.get());
        AptoideApplication_MembersInjector.injectLaunchManager(aptoideApplication, this.providesLaunchManagerProvider.get());
        AptoideApplication_MembersInjector.injectAppInBackgroundTracker(aptoideApplication, this.providesAppInBackgroundTrackerProvider.get());
        AptoideApplication_MembersInjector.injectAppCoinsManager(aptoideApplication, this.providesAppCoinsManagerProvider.get());
        AptoideApplication_MembersInjector.injectFileManager(aptoideApplication, this.providesFileManagerProvider.get());
        AptoideApplication_MembersInjector.injectFirebaseAnalytics(aptoideApplication, this.provideFirebaseAnalyticsProvider.get());
        return aptoideApplication;
    }

    private AptoideFirebaseNotificationService injectAptoideFirebaseNotificationService(AptoideFirebaseNotificationService aptoideFirebaseNotificationService) {
        AptoideFirebaseNotificationService_MembersInjector.injectFirebaseNotificationAnalytics(aptoideFirebaseNotificationService, this.provideFirebaseNotificationAnalyticsProvider.get());
        return aptoideFirebaseNotificationService;
    }

    private DownloadService injectDownloadService(DownloadService downloadService) {
        DownloadService_MembersInjector.injectDownloadManager(downloadService, this.provideAptoideDownloadManagerProvider.get());
        DownloadService_MembersInjector.injectAppInBackgroundTracker(downloadService, this.providesAppInBackgroundTrackerProvider.get());
        DownloadService_MembersInjector.injectNotificationProvider(downloadService, this.provideNotificationProvider.get());
        return downloadService;
    }

    private InstalledIntentService injectInstalledIntentService(InstalledIntentService installedIntentService) {
        InstalledIntentService_MembersInjector.injectInstallAnalytics(installedIntentService, this.provideInstallAnalyticsProvider.get());
        InstalledIntentService_MembersInjector.injectCampaignAnalytics(installedIntentService, this.providesCampaignAnalyticsProvider.get());
        InstalledIntentService_MembersInjector.injectAppcMigrationManager(installedIntentService, this.providesAppcMigrationManagerProvider.get());
        InstalledIntentService_MembersInjector.injectRoomStoredMinimalAdPersistence(installedIntentService, this.providesRoomStoreMinimalAdPersistenceProvider.get());
        InstalledIntentService_MembersInjector.injectUpdatesRepository(installedIntentService, this.providesUpdateRepositoryProvider.get());
        InstalledIntentService_MembersInjector.injectAptoideInstallManager(installedIntentService, this.providesAptoideInstallManagerProvider.get());
        InstalledIntentService_MembersInjector.injectFileUtils(installedIntentService, this.provideFileUtilsProvider.get());
        return installedIntentService;
    }

    private NotificationApplicationView injectNotificationApplicationView(NotificationApplicationView notificationApplicationView) {
        AptoideApplication_MembersInjector.injectAptoideDatabase(notificationApplicationView, this.providesAptoideDataBaseProvider.get());
        AptoideApplication_MembersInjector.injectNotificationPersistence(notificationApplicationView, this.provideRoomNotificationPersistenceProvider.get());
        AptoideApplication_MembersInjector.injectAptoideInstalledAppsRepository(notificationApplicationView, this.provideInstalledRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectRakamBaseHost(notificationApplicationView, this.providesBaseRakamHostProvider.get());
        AptoideApplication_MembersInjector.injectAptoideDownloadManager(notificationApplicationView, this.provideAptoideDownloadManagerProvider.get());
        AptoideApplication_MembersInjector.injectUpdateRepository(notificationApplicationView, this.providesUpdateRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectCacheHelper(notificationApplicationView, this.provideCacheHelperProvider.get());
        AptoideApplication_MembersInjector.injectAccountManager(notificationApplicationView, this.provideAptoideAccountManagerProvider.get());
        AptoideApplication_MembersInjector.injectPreferences(notificationApplicationView, this.provideDefaultPreferencesProvider.get());
        AptoideApplication_MembersInjector.injectSecurePreferences(notificationApplicationView, this.providesSecurePerefencesProvider.get());
        AptoideApplication_MembersInjector.injectAdultContent(notificationApplicationView, this.provideAdultContentProvider.get());
        AptoideApplication_MembersInjector.injectIdsRepository(notificationApplicationView, this.provideIdsRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectDefaultClient(notificationApplicationView, this.provideOkHttpClientProvider.get());
        AptoideApplication_MembersInjector.injectRootAvailabilityManager(notificationApplicationView, this.provideRootAvailabilityManagerProvider.get());
        AptoideApplication_MembersInjector.injectAuthenticationPersistence(notificationApplicationView, this.provideAuthenticationPersistenceProvider.get());
        AptoideApplication_MembersInjector.injectAlarmSyncScheduler(notificationApplicationView, this.provideSyncSchedulerProvider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorPoolV7(notificationApplicationView, this.provideAccountSettingsBodyInterceptorPoolV7Provider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorWebV7(notificationApplicationView, this.provideBodyInterceptorWebV7Provider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorV3(notificationApplicationView, this.providesBodyInterceptorV3Provider.get());
        AptoideApplication_MembersInjector.injectHttpClientCache(notificationApplicationView, this.provideL2CacheProvider.get());
        AptoideApplication_MembersInjector.injectQManager(notificationApplicationView, this.provideQManagerProvider.get());
        AptoideApplication_MembersInjector.injectTokenInvalidator(notificationApplicationView, this.provideTokenInvalidatorProvider.get());
        AptoideApplication_MembersInjector.injectPackageRepository(notificationApplicationView, this.providesPackageRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectApplicationVersionCodeProvider(notificationApplicationView, this.providesAdsApplicationVersionCodeProvider.get());
        AptoideApplication_MembersInjector.injectAdsRepository(notificationApplicationView, this.provideAdsRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectSyncStorage(notificationApplicationView, this.provideSyncStorageProvider.get());
        AptoideApplication_MembersInjector.injectNavigationTracker(notificationApplicationView, this.provideNavigationTrackerProvider.get());
        AptoideApplication_MembersInjector.injectNewFeature(notificationApplicationView, this.providesNewFeatureProvider.get());
        AptoideApplication_MembersInjector.injectNewFeatureManager(notificationApplicationView, this.providesNewFeatureManagerProvider.get());
        AptoideApplication_MembersInjector.injectReadyToInstallNotificationManager(notificationApplicationView, this.providesReadyToInstallNotificationManagerProvider.get());
        AptoideApplication_MembersInjector.injectThemeAnalytics(notificationApplicationView, this.providesThemeAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectAccountSettingsBodyInterceptorPoolV7(notificationApplicationView, this.provideAccountSettingsBodyInterceptorPoolV7Provider.get());
        AptoideApplication_MembersInjector.injectStoreCredentials(notificationApplicationView, this.providesStoreCredentialsProvider.get());
        AptoideApplication_MembersInjector.injectStoreUtilsProxy(notificationApplicationView, this.provideStoreUtilsProxyProvider.get());
        AptoideApplication_MembersInjector.injectTrendingManager(notificationApplicationView, this.providesTrendingManagerProvider.get());
        AptoideApplication_MembersInjector.injectAdultContentAnalytics(notificationApplicationView, this.provideAdultContentAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectNotificationAnalytics(notificationApplicationView, this.provideNotificationAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectSearchSuggestionManager(notificationApplicationView, this.providesSearchSuggestionManagerProvider.get());
        AptoideApplication_MembersInjector.injectAnalyticsManager(notificationApplicationView, this.providesAnalyticsManagerProvider.get());
        AptoideApplication_MembersInjector.injectFirstLaunchAnalytics(notificationApplicationView, this.providesFirstLaunchAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectInvalidRefreshTokenLogoutManager(notificationApplicationView, this.provideInvalidRefreshTokenLogoutManagerProvider.get());
        AptoideApplication_MembersInjector.injectRootInstallationRetryHandler(notificationApplicationView, this.provideRootInstallationRetryHandlerProvider.get());
        AptoideApplication_MembersInjector.injectShortcutManager(notificationApplicationView, this.providesShortcutManagerProvider.get());
        AptoideApplication_MembersInjector.injectSettingsManager(notificationApplicationView, this.providesSettingsManagerProvider.get());
        AptoideApplication_MembersInjector.injectInstallManager(notificationApplicationView, this.providesInstallManagerProvider.get());
        AptoideApplication_MembersInjector.injectDefaultFollowedStores(notificationApplicationView, this.provideDefaultFollowedStoresProvider.get());
        AptoideApplication_MembersInjector.injectOemidProvider(notificationApplicationView, this.providesOemidProvider.get());
        AptoideApplication_MembersInjector.injectAptoideMd5Manager(notificationApplicationView, this.providesAptoideMd5ManagerProvider.get());
        AptoideApplication_MembersInjector.injectAptoideWorkerFactory(notificationApplicationView, this.providesUpdatesNotificationWorkerFactoryProvider.get());
        AptoideApplication_MembersInjector.injectLaunchManager(notificationApplicationView, this.providesLaunchManagerProvider.get());
        AptoideApplication_MembersInjector.injectAppInBackgroundTracker(notificationApplicationView, this.providesAppInBackgroundTrackerProvider.get());
        AptoideApplication_MembersInjector.injectAppCoinsManager(notificationApplicationView, this.providesAppCoinsManagerProvider.get());
        AptoideApplication_MembersInjector.injectFileManager(notificationApplicationView, this.providesFileManagerProvider.get());
        AptoideApplication_MembersInjector.injectFirebaseAnalytics(notificationApplicationView, this.provideFirebaseAnalyticsProvider.get());
        return notificationApplicationView;
    }

    private PullingContentService injectPullingContentService(PullingContentService pullingContentService) {
        PullingContentService_MembersInjector.injectMarketName(pullingContentService, this.provideMarketNameProvider.get());
        PullingContentService_MembersInjector.injectDownloadFactory(pullingContentService, this.provideDownloadFactoryProvider.get());
        PullingContentService_MembersInjector.injectUpdateRepository(pullingContentService, this.providesUpdateRepositoryProvider.get());
        return pullingContentService;
    }

    private ToolboxContentProvider injectToolboxContentProvider(ToolboxContentProvider toolboxContentProvider) {
        ToolboxContentProvider_MembersInjector.injectAuthenticationPersistence(toolboxContentProvider, this.provideAuthenticationPersistenceProvider.get());
        ToolboxContentProvider_MembersInjector.injectSharedPreferences(toolboxContentProvider, this.providesDefaultSharedPerefencesProvider.get());
        ToolboxContentProvider_MembersInjector.injectAccountManager(toolboxContentProvider, this.provideAptoideAccountManagerProvider.get());
        return toolboxContentProvider;
    }

    @Override // cm.aptoide.p092pt.ApplicationComponent
    public void inject(AptoideApplication aptoideApplication) {
        injectAptoideApplication(aptoideApplication);
    }

    @Override // cm.aptoide.p092pt.ApplicationComponent
    public ActivityComponent plus(ActivityModule activityModule, FlavourActivityModule flavourActivityModule) {
        C9055b.m29111b(activityModule);
        C9055b.m29111b(flavourActivityModule);
        return new ActivityComponentImpl(activityModule, flavourActivityModule);
    }

    private DaggerApplicationComponent(ApplicationModule applicationModule, FlavourApplicationModule flavourApplicationModule) {
        this.applicationComponent = this;
        initialize(applicationModule, flavourApplicationModule);
        initialize2(applicationModule, flavourApplicationModule);
        initialize3(applicationModule, flavourApplicationModule);
    }

    @Override // cm.aptoide.p092pt.ApplicationComponent
    public void inject(NotificationApplicationView notificationApplicationView) {
        injectNotificationApplicationView(notificationApplicationView);
    }

    @Override // cm.aptoide.p092pt.ApplicationComponent
    public void inject(ToolboxContentProvider toolboxContentProvider) {
        injectToolboxContentProvider(toolboxContentProvider);
    }

    @Override // cm.aptoide.p092pt.ApplicationComponent
    public void inject(DownloadService downloadService) {
        injectDownloadService(downloadService);
    }

    @Override // cm.aptoide.p092pt.ApplicationComponent
    public void inject(AptoideFirebaseNotificationService aptoideFirebaseNotificationService) {
        injectAptoideFirebaseNotificationService(aptoideFirebaseNotificationService);
    }

    @Override // cm.aptoide.p092pt.ApplicationComponent
    public void inject(InstalledIntentService installedIntentService) {
        injectInstalledIntentService(installedIntentService);
    }

    @Override // cm.aptoide.p092pt.ApplicationComponent
    public void inject(PullingContentService pullingContentService) {
        injectPullingContentService(pullingContentService);
    }
}
