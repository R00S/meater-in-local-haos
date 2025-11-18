package cm.aptoide.p092pt.view;

import android.R;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.view.WindowManager;
import androidx.appcompat.app.ActivityC0067d;
import androidx.fragment.app.FragmentManager;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.AppShortcutsAnalytics;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.CatappultNavigator;
import cm.aptoide.p092pt.DeepLinkAnalytics;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.AgentPersistence;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.account.view.ImagePickerNavigator;
import cm.aptoide.p092pt.account.view.PhotoFileGenerator;
import cm.aptoide.p092pt.account.view.UriToPathResolver;
import cm.aptoide.p092pt.account.view.store.ManageStoreNavigator;
import cm.aptoide.p092pt.account.view.user.ManageUserNavigator;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.analytics.FirstLaunchAnalytics;
import cm.aptoide.p092pt.apkfy.ApkFyParser;
import cm.aptoide.p092pt.apkfy.ApkfyManager;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.app.view.AppViewNavigator;
import cm.aptoide.p092pt.autoupdate.AutoUpdateManager;
import cm.aptoide.p092pt.autoupdate.AutoUpdateRepository;
import cm.aptoide.p092pt.autoupdate.AutoUpdateService;
import cm.aptoide.p092pt.autoupdate.Service;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationAnalytics;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.home.AptoideBottomNavigator;
import cm.aptoide.p092pt.home.apps.UpdatesManager;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreRepository;
import cm.aptoide.p092pt.install.AppInstallerStatusReceiver;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallCompletedNotifier;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.install.installer.RootInstallationRetryHandler;
import cm.aptoide.p092pt.navigator.ActivityNavigator;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.navigator.ExternalNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.FragmentResultNavigator;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.notification.ContentPuller;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.notification.NotificationSyncScheduler;
import cm.aptoide.p092pt.notification.ReadyToInstallNotificationManager;
import cm.aptoide.p092pt.orientation.ScreenOrientationManager;
import cm.aptoide.p092pt.permission.AccountPermissionProvider;
import cm.aptoide.p092pt.permission.PermissionProvider;
import cm.aptoide.p092pt.presenter.MainPresenter;
import cm.aptoide.p092pt.presenter.MainView;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.promotions.ClaimPromotionsNavigator;
import cm.aptoide.p092pt.promotions.PromotionsNavigator;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import cm.aptoide.p092pt.search.SearchNavigator;
import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import cm.aptoide.p092pt.socialmedia.SocialMediaNavigator;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.themes.NewFeature;
import cm.aptoide.p092pt.themes.ThemeAnalytics;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import cm.aptoide.p092pt.view.DeepLinkManager;
import cm.aptoide.p092pt.view.app.ListStoreAppsNavigator;
import cm.aptoide.p092pt.view.dialog.DialogUtils;
import cm.aptoide.p092pt.view.settings.MyAccountNavigator;
import cm.aptoide.p092pt.wallet.WalletAppProvider;
import cm.aptoide.p092pt.wallet.WalletInstallAnalytics;
import cm.aptoide.p092pt.wallet.WalletInstallConfiguration;
import cm.aptoide.p092pt.wallet.WalletInstallManager;
import cm.aptoide.p092pt.wallet.WalletInstallNavigator;
import cm.aptoide.p092pt.wallet.WalletInstallPresenter;
import cm.aptoide.p092pt.wallet.WalletInstallView;
import com.facebook.InterfaceC5958y;
import com.facebook.login.C5804x;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Map;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import p241e.p294g.p306b.C8986a;
import p241e.p294g.p306b.C8988c;
import p456rx.p457l.p459c.C11250a;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class ActivityModule {
    private final ActivityC0067d activity;
    private final String fileProviderAuthority;
    private final boolean firstCreated;
    private final Intent intent;
    private final NotificationSyncScheduler notificationSyncScheduler;
    private final View view;

    public ActivityModule(ActivityC0067d activityC0067d, Intent intent, NotificationSyncScheduler notificationSyncScheduler, View view, boolean z, String str) {
        this.activity = activityC0067d;
        this.intent = intent;
        this.notificationSyncScheduler = notificationSyncScheduler;
        this.view = view;
        this.firstCreated = z;
        this.fileProviderAuthority = str;
    }

    @ActivityScope
    AccountNavigator provideAccountNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AptoideAccountManager aptoideAccountManager, InterfaceC5958y interfaceC5958y, GoogleApiClient googleApiClient, AccountAnalytics accountAnalytics, BottomNavigationNavigator bottomNavigationNavigator, ThemeManager themeManager) {
        return new AccountNavigator(bottomNavigationNavigator, fragmentNavigator, aptoideAccountManager, (ActivityNavigator) this.activity, C5804x.m12103g(), interfaceC5958y, googleApiClient, C8988c.m28593f1(), "http://m.aptoide.com/account/password-recovery", accountAnalytics, themeManager);
    }

    @ActivityScope
    AccountPermissionProvider provideAccountPermissionProvider() {
        return new AccountPermissionProvider((PermissionProvider) this.activity);
    }

    @ActivityScope
    ApkFyParser provideApkFy(@Named("secureShared") SharedPreferences sharedPreferences, ApkfyManager apkfyManager, FirstLaunchAnalytics firstLaunchAnalytics) {
        return new ApkFyParser(this.activity, this.intent, sharedPreferences, apkfyManager, firstLaunchAnalytics);
    }

    @ActivityScope
    AutoUpdateManager provideAutoUpdateManager(DownloadFactory downloadFactory, PermissionManager permissionManager, InstallManager installManager, DownloadAnalytics downloadAnalytics, @Named("local-version-code") int i2, AutoUpdateRepository autoUpdateRepository) {
        return new AutoUpdateManager(downloadFactory, permissionManager, installManager, downloadAnalytics, i2, autoUpdateRepository, Build.VERSION.SDK_INT, ((AptoideApplication) this.activity.getApplication()).getDefaultSharedPreferences());
    }

    @ActivityScope
    BottomNavigationMapper provideBottomNavigationMapper() {
        return new BottomNavigationMapper();
    }

    @ActivityScope
    BottomNavigationNavigator provideBottomNavigationNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationAnalytics bottomNavigationAnalytics, SearchAnalytics searchAnalytics, ThemeManager themeManager) {
        return new BottomNavigationNavigator(fragmentNavigator, bottomNavigationAnalytics, searchAnalytics, themeManager);
    }

    @ActivityScope
    @Named
    int provideClientSdkVersion() {
        return Build.VERSION.SDK_INT;
    }

    @ActivityScope
    DeepLinkManager provideDeepLinkManager(StoreUtilsProxy storeUtilsProxy, @Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator, SearchNavigator searchNavigator, @Named(BuildConfig.APTOIDE_THEME) SharedPreferences sharedPreferences, RoomStoreRepository roomStoreRepository, NavigationTracker navigationTracker, SearchAnalytics searchAnalytics, DeepLinkAnalytics deepLinkAnalytics, AppShortcutsAnalytics appShortcutsAnalytics, AptoideAccountManager aptoideAccountManager, StoreAnalytics storeAnalytics, AdsRepository adsRepository, AppNavigator appNavigator, InstallManager installManager, NewFeature newFeature, ThemeManager themeManager, ThemeAnalytics themeAnalytics, ReadyToInstallNotificationManager readyToInstallNotificationManager) {
        return new DeepLinkManager(storeUtilsProxy, fragmentNavigator, bottomNavigationNavigator, searchNavigator, (DeepLinkManager.DeepLinkView) this.activity, sharedPreferences, roomStoreRepository, navigationTracker, searchAnalytics, appShortcutsAnalytics, aptoideAccountManager, deepLinkAnalytics, storeAnalytics, adsRepository, appNavigator, installManager, newFeature, themeManager, themeAnalytics, readyToInstallNotificationManager);
    }

    @ActivityScope
    FragmentManager provideFragmentManager() {
        return this.activity.getSupportFragmentManager();
    }

    @ActivityScope
    ImagePickerNavigator provideImagePickerNavigator() {
        return new ImagePickerNavigator((ActivityNavigator) this.activity);
    }

    @ActivityScope
    ListStoreAppsNavigator provideListStoreAppsNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        return new ListStoreAppsNavigator(fragmentNavigator, appNavigator);
    }

    @ActivityScope
    @Named
    int provideLocalVersionCode(@Named("package-name") String str) {
        try {
            return this.activity.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @ActivityScope
    @Named
    FragmentNavigator provideMainFragmentNavigator(Map<Integer, Result> map, C8986a<Map<Integer, Result>> c8986a, FragmentManager fragmentManager) {
        return new FragmentResultNavigator(fragmentManager, C1146R.id.fragment_placeholder, R.anim.fade_in, R.anim.fade_out, map, c8986a);
    }

    @ActivityScope
    Presenter provideMainPresenter(RootInstallationRetryHandler rootInstallationRetryHandler, ApkFyParser apkFyParser, InstallManager installManager, @Named(BuildConfig.APTOIDE_THEME) SharedPreferences sharedPreferences, @Named("secureShared") SharedPreferences sharedPreferences2, @Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, DeepLinkManager deepLinkManager, BottomNavigationNavigator bottomNavigationNavigator, UpdatesManager updatesManager, AutoUpdateManager autoUpdateManager, RootAvailabilityManager rootAvailabilityManager, BottomNavigationMapper bottomNavigationMapper, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, AgentPersistence agentPersistence) {
        return new MainPresenter((MainView) this.view, installManager, rootInstallationRetryHandler, CrashReport.getInstance(), apkFyParser, new ContentPuller(this.activity), this.notificationSyncScheduler, new InstallCompletedNotifier(C8988c.m28593f1(), installManager, CrashReport.getInstance()), sharedPreferences, sharedPreferences2, fragmentNavigator, deepLinkManager, this.firstCreated, (AptoideBottomNavigator) this.activity, C11250a.m40156b(), Schedulers.m40658io(), bottomNavigationNavigator, updatesManager, autoUpdateManager, (PermissionService) this.activity, rootAvailabilityManager, bottomNavigationMapper, aptoideAccountManager, accountNavigator, agentPersistence);
    }

    @ActivityScope
    ManageStoreNavigator provideManageStoreNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator) {
        return new ManageStoreNavigator(fragmentNavigator, bottomNavigationNavigator);
    }

    @ActivityScope
    ManageUserNavigator provideManageUserNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator) {
        return new ManageUserNavigator(fragmentNavigator, bottomNavigationNavigator);
    }

    @ActivityScope
    MyAccountNavigator provideMyAccountNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AccountNavigator accountNavigator, AppNavigator appNavigator, ThemeManager themeManager, SocialMediaNavigator socialMediaNavigator) {
        return new MyAccountNavigator(fragmentNavigator, accountNavigator, appNavigator, themeManager, socialMediaNavigator);
    }

    @ActivityScope
    @Named
    String providePackageName() {
        return this.activity.getPackageName();
    }

    @ActivityScope
    PhotoFileGenerator providePhotoFileGenerator() {
        ActivityC0067d activityC0067d = this.activity;
        return new PhotoFileGenerator(activityC0067d, activityC0067d.getExternalFilesDir(Environment.DIRECTORY_PICTURES), this.fileProviderAuthority);
    }

    @ActivityScope
    ScreenOrientationManager provideScreenOrientationManager() {
        ActivityC0067d activityC0067d = this.activity;
        return new ScreenOrientationManager(activityC0067d, (WindowManager) activityC0067d.getSystemService("window"));
    }

    @ActivityScope
    UriToPathResolver provideUriToPathResolver() {
        return new UriToPathResolver(this.activity.getContentResolver());
    }

    @ActivityScope
    AppCoinsInfoNavigator providesAppCoinsInfoNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, SocialMediaNavigator socialMediaNavigator, CatappultNavigator catappultNavigator) {
        return new AppCoinsInfoNavigator(fragmentNavigator, socialMediaNavigator, catappultNavigator);
    }

    @ActivityScope
    AppNavigator providesAppNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new AppNavigator(fragmentNavigator);
    }

    @ActivityScope
    AppViewNavigator providesAppViewNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AppNavigator appNavigator, CatappultNavigator catappultNavigator) {
        return new AppViewNavigator(fragmentNavigator, (ActivityNavigator) this.activity, appNavigator, catappultNavigator);
    }

    @ActivityScope
    AutoUpdateRepository providesAutoUpdateRepository(AutoUpdateService autoUpdateService) {
        return new AutoUpdateRepository(autoUpdateService);
    }

    @ActivityScope
    AutoUpdateService providesAutoUpdateService(Service service, @Named("package-name") String str, @Named("client-sdk-version") int i2) {
        return new AutoUpdateService(service, str, i2);
    }

    @ActivityScope
    BottomNavigationAnalytics providesBottomNavigationAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new BottomNavigationAnalytics(analyticsManager, navigationTracker);
    }

    @ActivityScope
    CatappultNavigator providesCatappultNavigator(ExternalNavigator externalNavigator) {
        return new CatappultNavigator(externalNavigator);
    }

    @ActivityScope
    ClaimPromotionsNavigator providesClaimPromotionsNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        return new ClaimPromotionsNavigator(fragmentNavigator, (ActivityResultNavigator) this.activity, appNavigator);
    }

    @ActivityScope
    DialogUtils providesDialogUtils(AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named(BuildConfig.APTOIDE_THEME) OkHttpClient okHttpClient, Converter.Factory factory, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, TokenInvalidator tokenInvalidator, @Named(BuildConfig.APTOIDE_THEME) SharedPreferences sharedPreferences, MarketResourceFormatter marketResourceFormatter, ThemeManager themeManager, UserFeedbackAnalytics userFeedbackAnalytics) {
        return new DialogUtils(aptoideAccountManager, accountNavigator, bodyInterceptor, okHttpClient, factory, aptoideInstalledAppsRepository, tokenInvalidator, sharedPreferences, marketResourceFormatter, themeManager, userFeedbackAnalytics);
    }

    @ActivityScope
    ExternalNavigator providesExternalNavigator(ThemeManager themeManager) {
        return new ExternalNavigator(this.activity.getApplicationContext(), themeManager);
    }

    @ActivityScope
    ListAppsMoreRepository providesListAppsMoreRepository(StoreCredentialsProvider storeCredentialsProvider, @Named(BuildConfig.APTOIDE_THEME) OkHttpClient okHttpClient, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, @Named(BuildConfig.APTOIDE_THEME) SharedPreferences sharedPreferences, Converter.Factory factory) {
        return new ListAppsMoreRepository(storeCredentialsProvider, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, this.activity.getResources(), this.activity.getWindowManager());
    }

    @ActivityScope
    PromotionsNavigator providesPromotionsNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        return new PromotionsNavigator(fragmentNavigator, appNavigator);
    }

    @ActivityScope
    @Named
    float providesScreenHeight(Resources resources) {
        return resources.getDisplayMetrics().heightPixels;
    }

    @ActivityScope
    @Named
    float providesScreenWidth(Resources resources) {
        return resources.getDisplayMetrics().widthPixels;
    }

    @ActivityScope
    SearchNavigator providesSearchNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        return new SearchNavigator(fragmentNavigator, appNavigator);
    }

    @ActivityScope
    SocialMediaNavigator providesSocialMediaNavigator(ExternalNavigator externalNavigator) {
        return new SocialMediaNavigator(externalNavigator);
    }

    @ActivityScope
    ThemeManager providesThemeManager() {
        ActivityC0067d activityC0067d = this.activity;
        return new ThemeManager(activityC0067d, ((AptoideApplication) activityC0067d.getApplicationContext()).getDefaultSharedPreferences());
    }

    @ActivityScope
    WalletInstallAnalytics providesWalletInstallAnalytics(DownloadAnalytics downloadAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, DownloadStateParser downloadStateParser, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, SplitAnalyticsMapper splitAnalyticsMapper) {
        return new WalletInstallAnalytics(downloadAnalytics, notificationAnalytics, installAnalytics, downloadStateParser, analyticsManager, navigationTracker, splitAnalyticsMapper);
    }

    @ActivityScope
    WalletInstallConfiguration providesWalletInstallConfiguration() {
        return new WalletInstallConfiguration(this.intent.getStringExtra("packageName"), this.intent.getStringExtra(DeepLinkIntentReceiver.DeepLinksKeys.WALLET_PACKAGE_NAME_KEY));
    }

    @ActivityScope
    WalletInstallManager providesWalletInstallManager(InstallManager installManager, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, MoPubAdsManager moPubAdsManager, WalletInstallAnalytics walletInstallAnalytics, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, WalletAppProvider walletAppProvider, AppInstallerStatusReceiver appInstallerStatusReceiver, DynamicSplitsManager dynamicSplitsManager) {
        return new WalletInstallManager(this.activity.getPackageManager(), installManager, downloadFactory, downloadStateParser, moPubAdsManager, walletInstallAnalytics, aptoideInstalledAppsRepository, walletAppProvider, appInstallerStatusReceiver, dynamicSplitsManager);
    }

    @ActivityScope
    WalletInstallNavigator providesWalletInstallNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new WalletInstallNavigator(fragmentNavigator);
    }

    @ActivityScope
    WalletInstallPresenter providesWalletInstallPresenter(WalletInstallConfiguration walletInstallConfiguration, WalletInstallNavigator walletInstallNavigator, WalletInstallManager walletInstallManager, WalletInstallAnalytics walletInstallAnalytics, MoPubAdsManager moPubAdsManager) {
        return new WalletInstallPresenter((WalletInstallView) this.view, walletInstallManager, walletInstallNavigator, new PermissionManager(), (PermissionService) this.activity, C11250a.m40156b(), Schedulers.m40658io(), walletInstallConfiguration, walletInstallAnalytics, moPubAdsManager);
    }
}
