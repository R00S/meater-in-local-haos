package cm.aptoide.p092pt;

import cm.aptoide.accountmanager.AdultContent;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.account.AdultContentAnalytics;
import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.analytics.FirstLaunchAnalytics;
import cm.aptoide.p092pt.database.RoomNotificationPersistence;
import cm.aptoide.p092pt.database.room.AptoideDatabase;
import cm.aptoide.p092pt.dataprovider.cache.L2Cache;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.download.OemidProvider;
import cm.aptoide.p092pt.downloadmanager.AptoideDownloadManager;
import cm.aptoide.p092pt.file.CacheHelper;
import cm.aptoide.p092pt.file.FileManager;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.install.PackageRepository;
import cm.aptoide.p092pt.install.installer.RootInstallationRetryHandler;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.notification.AptoideWorkerFactory;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.notification.ReadyToInstallNotificationManager;
import cm.aptoide.p092pt.preferences.AptoideMd5Manager;
import cm.aptoide.p092pt.preferences.Preferences;
import cm.aptoide.p092pt.preferences.SecurePreferences;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import cm.aptoide.p092pt.search.suggestions.SearchSuggestionManager;
import cm.aptoide.p092pt.search.suggestions.TrendingManager;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.sync.SyncScheduler;
import cm.aptoide.p092pt.sync.alarm.SyncStorage;
import cm.aptoide.p092pt.themes.NewFeature;
import cm.aptoide.p092pt.themes.NewFeatureManager;
import cm.aptoide.p092pt.themes.ThemeAnalytics;
import cm.aptoide.p092pt.updates.UpdateRepository;
import cm.aptoide.p092pt.utils.p106q.QManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import javax.inject.Named;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class AptoideApplication_MembersInjector implements InterfaceC9053a<AptoideApplication> {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<BodyInterceptor<BaseBody>> accountSettingsBodyInterceptorPoolV7Provider;
    private final Provider<AdsRepository> adsRepositoryProvider;
    private final Provider<AdultContentAnalytics> adultContentAnalyticsProvider;
    private final Provider<AdultContent> adultContentProvider;
    private final Provider<SyncScheduler> alarmSyncSchedulerProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AppCoinsManager> appCoinsManagerProvider;
    private final Provider<AppInBackgroundTracker> appInBackgroundTrackerProvider;
    private final Provider<AdsApplicationVersionCodeProvider> applicationVersionCodeProvider;
    private final Provider<AptoideDatabase> aptoideDatabaseProvider;
    private final Provider<AptoideDownloadManager> aptoideDownloadManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<AptoideMd5Manager> aptoideMd5ManagerProvider;
    private final Provider<AptoideWorkerFactory> aptoideWorkerFactoryProvider;
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorPoolV7Provider;
    private final Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> bodyInterceptorV3Provider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorWebV7Provider;
    private final Provider<CacheHelper> cacheHelperProvider;
    private final Provider<OkHttpClient> defaultClientProvider;
    private final Provider<List<String>> defaultFollowedStoresProvider;
    private final Provider<FileManager> fileManagerProvider;
    private final Provider<FirebaseAnalytics> firebaseAnalyticsProvider;
    private final Provider<FirstLaunchAnalytics> firstLaunchAnalyticsProvider;
    private final Provider<L2Cache> httpClientCacheProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<InvalidRefreshTokenLogoutManager> invalidRefreshTokenLogoutManagerProvider;
    private final Provider<LaunchManager> launchManagerProvider;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<NewFeatureManager> newFeatureManagerProvider;
    private final Provider<NewFeature> newFeatureProvider;
    private final Provider<NotificationAnalytics> notificationAnalyticsProvider;
    private final Provider<RoomNotificationPersistence> notificationPersistenceProvider;
    private final Provider<OemidProvider> oemidProvider;
    private final Provider<PackageRepository> packageRepositoryProvider;
    private final Provider<Preferences> preferencesProvider;
    private final Provider<QManager> qManagerProvider;
    private final Provider<String> rakamBaseHostProvider;
    private final Provider<ReadyToInstallNotificationManager> readyToInstallNotificationManagerProvider;
    private final Provider<RootAvailabilityManager> rootAvailabilityManagerProvider;
    private final Provider<RootInstallationRetryHandler> rootInstallationRetryHandlerProvider;
    private final Provider<SearchSuggestionManager> searchSuggestionManagerProvider;
    private final Provider<SecurePreferences> securePreferencesProvider;
    private final Provider<SettingsManager> settingsManagerProvider;
    private final Provider<AptoideShortcutManager> shortcutManagerProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<SyncStorage> syncStorageProvider;
    private final Provider<ThemeAnalytics> themeAnalyticsProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;
    private final Provider<TrendingManager> trendingManagerProvider;
    private final Provider<UpdateRepository> updateRepositoryProvider;

    public AptoideApplication_MembersInjector(Provider<AptoideDatabase> provider, Provider<RoomNotificationPersistence> provider2, Provider<AptoideInstalledAppsRepository> provider3, Provider<String> provider4, Provider<AptoideDownloadManager> provider5, Provider<UpdateRepository> provider6, Provider<CacheHelper> provider7, Provider<AptoideAccountManager> provider8, Provider<Preferences> provider9, Provider<SecurePreferences> provider10, Provider<AdultContent> provider11, Provider<IdsRepository> provider12, Provider<OkHttpClient> provider13, Provider<RootAvailabilityManager> provider14, Provider<AuthenticationPersistence> provider15, Provider<SyncScheduler> provider16, Provider<BodyInterceptor<BaseBody>> provider17, Provider<BodyInterceptor<BaseBody>> provider18, Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> provider19, Provider<L2Cache> provider20, Provider<QManager> provider21, Provider<TokenInvalidator> provider22, Provider<PackageRepository> provider23, Provider<AdsApplicationVersionCodeProvider> provider24, Provider<AdsRepository> provider25, Provider<SyncStorage> provider26, Provider<NavigationTracker> provider27, Provider<NewFeature> provider28, Provider<NewFeatureManager> provider29, Provider<ReadyToInstallNotificationManager> provider30, Provider<ThemeAnalytics> provider31, Provider<BodyInterceptor<BaseBody>> provider32, Provider<StoreCredentialsProvider> provider33, Provider<StoreUtilsProxy> provider34, Provider<TrendingManager> provider35, Provider<AdultContentAnalytics> provider36, Provider<NotificationAnalytics> provider37, Provider<SearchSuggestionManager> provider38, Provider<AnalyticsManager> provider39, Provider<FirstLaunchAnalytics> provider40, Provider<InvalidRefreshTokenLogoutManager> provider41, Provider<RootInstallationRetryHandler> provider42, Provider<AptoideShortcutManager> provider43, Provider<SettingsManager> provider44, Provider<InstallManager> provider45, Provider<List<String>> provider46, Provider<OemidProvider> provider47, Provider<AptoideMd5Manager> provider48, Provider<AptoideWorkerFactory> provider49, Provider<LaunchManager> provider50, Provider<AppInBackgroundTracker> provider51, Provider<AppCoinsManager> provider52, Provider<FileManager> provider53, Provider<FirebaseAnalytics> provider54) {
        this.aptoideDatabaseProvider = provider;
        this.notificationPersistenceProvider = provider2;
        this.aptoideInstalledAppsRepositoryProvider = provider3;
        this.rakamBaseHostProvider = provider4;
        this.aptoideDownloadManagerProvider = provider5;
        this.updateRepositoryProvider = provider6;
        this.cacheHelperProvider = provider7;
        this.accountManagerProvider = provider8;
        this.preferencesProvider = provider9;
        this.securePreferencesProvider = provider10;
        this.adultContentProvider = provider11;
        this.idsRepositoryProvider = provider12;
        this.defaultClientProvider = provider13;
        this.rootAvailabilityManagerProvider = provider14;
        this.authenticationPersistenceProvider = provider15;
        this.alarmSyncSchedulerProvider = provider16;
        this.bodyInterceptorPoolV7Provider = provider17;
        this.bodyInterceptorWebV7Provider = provider18;
        this.bodyInterceptorV3Provider = provider19;
        this.httpClientCacheProvider = provider20;
        this.qManagerProvider = provider21;
        this.tokenInvalidatorProvider = provider22;
        this.packageRepositoryProvider = provider23;
        this.applicationVersionCodeProvider = provider24;
        this.adsRepositoryProvider = provider25;
        this.syncStorageProvider = provider26;
        this.navigationTrackerProvider = provider27;
        this.newFeatureProvider = provider28;
        this.newFeatureManagerProvider = provider29;
        this.readyToInstallNotificationManagerProvider = provider30;
        this.themeAnalyticsProvider = provider31;
        this.accountSettingsBodyInterceptorPoolV7Provider = provider32;
        this.storeCredentialsProvider = provider33;
        this.storeUtilsProxyProvider = provider34;
        this.trendingManagerProvider = provider35;
        this.adultContentAnalyticsProvider = provider36;
        this.notificationAnalyticsProvider = provider37;
        this.searchSuggestionManagerProvider = provider38;
        this.analyticsManagerProvider = provider39;
        this.firstLaunchAnalyticsProvider = provider40;
        this.invalidRefreshTokenLogoutManagerProvider = provider41;
        this.rootInstallationRetryHandlerProvider = provider42;
        this.shortcutManagerProvider = provider43;
        this.settingsManagerProvider = provider44;
        this.installManagerProvider = provider45;
        this.defaultFollowedStoresProvider = provider46;
        this.oemidProvider = provider47;
        this.aptoideMd5ManagerProvider = provider48;
        this.aptoideWorkerFactoryProvider = provider49;
        this.launchManagerProvider = provider50;
        this.appInBackgroundTrackerProvider = provider51;
        this.appCoinsManagerProvider = provider52;
        this.fileManagerProvider = provider53;
        this.firebaseAnalyticsProvider = provider54;
    }

    public static InterfaceC9053a<AptoideApplication> create(Provider<AptoideDatabase> provider, Provider<RoomNotificationPersistence> provider2, Provider<AptoideInstalledAppsRepository> provider3, Provider<String> provider4, Provider<AptoideDownloadManager> provider5, Provider<UpdateRepository> provider6, Provider<CacheHelper> provider7, Provider<AptoideAccountManager> provider8, Provider<Preferences> provider9, Provider<SecurePreferences> provider10, Provider<AdultContent> provider11, Provider<IdsRepository> provider12, Provider<OkHttpClient> provider13, Provider<RootAvailabilityManager> provider14, Provider<AuthenticationPersistence> provider15, Provider<SyncScheduler> provider16, Provider<BodyInterceptor<BaseBody>> provider17, Provider<BodyInterceptor<BaseBody>> provider18, Provider<BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody>> provider19, Provider<L2Cache> provider20, Provider<QManager> provider21, Provider<TokenInvalidator> provider22, Provider<PackageRepository> provider23, Provider<AdsApplicationVersionCodeProvider> provider24, Provider<AdsRepository> provider25, Provider<SyncStorage> provider26, Provider<NavigationTracker> provider27, Provider<NewFeature> provider28, Provider<NewFeatureManager> provider29, Provider<ReadyToInstallNotificationManager> provider30, Provider<ThemeAnalytics> provider31, Provider<BodyInterceptor<BaseBody>> provider32, Provider<StoreCredentialsProvider> provider33, Provider<StoreUtilsProxy> provider34, Provider<TrendingManager> provider35, Provider<AdultContentAnalytics> provider36, Provider<NotificationAnalytics> provider37, Provider<SearchSuggestionManager> provider38, Provider<AnalyticsManager> provider39, Provider<FirstLaunchAnalytics> provider40, Provider<InvalidRefreshTokenLogoutManager> provider41, Provider<RootInstallationRetryHandler> provider42, Provider<AptoideShortcutManager> provider43, Provider<SettingsManager> provider44, Provider<InstallManager> provider45, Provider<List<String>> provider46, Provider<OemidProvider> provider47, Provider<AptoideMd5Manager> provider48, Provider<AptoideWorkerFactory> provider49, Provider<LaunchManager> provider50, Provider<AppInBackgroundTracker> provider51, Provider<AppCoinsManager> provider52, Provider<FileManager> provider53, Provider<FirebaseAnalytics> provider54) {
        return new AptoideApplication_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34, provider35, provider36, provider37, provider38, provider39, provider40, provider41, provider42, provider43, provider44, provider45, provider46, provider47, provider48, provider49, provider50, provider51, provider52, provider53, provider54);
    }

    public static void injectAccountManager(AptoideApplication aptoideApplication, AptoideAccountManager aptoideAccountManager) {
        aptoideApplication.accountManager = aptoideAccountManager;
    }

    @Named
    public static void injectAccountSettingsBodyInterceptorPoolV7(AptoideApplication aptoideApplication, BodyInterceptor<BaseBody> bodyInterceptor) {
        aptoideApplication.accountSettingsBodyInterceptorPoolV7 = bodyInterceptor;
    }

    public static void injectAdsRepository(AptoideApplication aptoideApplication, AdsRepository adsRepository) {
        aptoideApplication.adsRepository = adsRepository;
    }

    public static void injectAdultContent(AptoideApplication aptoideApplication, AdultContent adultContent) {
        aptoideApplication.adultContent = adultContent;
    }

    public static void injectAdultContentAnalytics(AptoideApplication aptoideApplication, AdultContentAnalytics adultContentAnalytics) {
        aptoideApplication.adultContentAnalytics = adultContentAnalytics;
    }

    public static void injectAlarmSyncScheduler(AptoideApplication aptoideApplication, SyncScheduler syncScheduler) {
        aptoideApplication.alarmSyncScheduler = syncScheduler;
    }

    public static void injectAnalyticsManager(AptoideApplication aptoideApplication, AnalyticsManager analyticsManager) {
        aptoideApplication.analyticsManager = analyticsManager;
    }

    public static void injectAppCoinsManager(AptoideApplication aptoideApplication, AppCoinsManager appCoinsManager) {
        aptoideApplication.appCoinsManager = appCoinsManager;
    }

    public static void injectAppInBackgroundTracker(AptoideApplication aptoideApplication, AppInBackgroundTracker appInBackgroundTracker) {
        aptoideApplication.appInBackgroundTracker = appInBackgroundTracker;
    }

    public static void injectApplicationVersionCodeProvider(AptoideApplication aptoideApplication, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        aptoideApplication.applicationVersionCodeProvider = adsApplicationVersionCodeProvider;
    }

    public static void injectAptoideDatabase(AptoideApplication aptoideApplication, AptoideDatabase aptoideDatabase) {
        aptoideApplication.aptoideDatabase = aptoideDatabase;
    }

    public static void injectAptoideDownloadManager(AptoideApplication aptoideApplication, AptoideDownloadManager aptoideDownloadManager) {
        aptoideApplication.aptoideDownloadManager = aptoideDownloadManager;
    }

    public static void injectAptoideInstalledAppsRepository(AptoideApplication aptoideApplication, AptoideInstalledAppsRepository aptoideInstalledAppsRepository) {
        aptoideApplication.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
    }

    public static void injectAptoideMd5Manager(AptoideApplication aptoideApplication, AptoideMd5Manager aptoideMd5Manager) {
        aptoideApplication.aptoideMd5Manager = aptoideMd5Manager;
    }

    public static void injectAptoideWorkerFactory(AptoideApplication aptoideApplication, AptoideWorkerFactory aptoideWorkerFactory) {
        aptoideApplication.aptoideWorkerFactory = aptoideWorkerFactory;
    }

    public static void injectAuthenticationPersistence(AptoideApplication aptoideApplication, AuthenticationPersistence authenticationPersistence) {
        aptoideApplication.authenticationPersistence = authenticationPersistence;
    }

    @Named
    public static void injectBodyInterceptorPoolV7(AptoideApplication aptoideApplication, BodyInterceptor<BaseBody> bodyInterceptor) {
        aptoideApplication.bodyInterceptorPoolV7 = bodyInterceptor;
    }

    @Named
    public static void injectBodyInterceptorV3(AptoideApplication aptoideApplication, BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody> bodyInterceptor) {
        aptoideApplication.bodyInterceptorV3 = bodyInterceptor;
    }

    @Named
    public static void injectBodyInterceptorWebV7(AptoideApplication aptoideApplication, BodyInterceptor<BaseBody> bodyInterceptor) {
        aptoideApplication.bodyInterceptorWebV7 = bodyInterceptor;
    }

    public static void injectCacheHelper(AptoideApplication aptoideApplication, CacheHelper cacheHelper) {
        aptoideApplication.cacheHelper = cacheHelper;
    }

    @Named
    public static void injectDefaultClient(AptoideApplication aptoideApplication, OkHttpClient okHttpClient) {
        aptoideApplication.defaultClient = okHttpClient;
    }

    @Named
    public static void injectDefaultFollowedStores(AptoideApplication aptoideApplication, List<String> list) {
        aptoideApplication.defaultFollowedStores = list;
    }

    public static void injectFileManager(AptoideApplication aptoideApplication, FileManager fileManager) {
        aptoideApplication.fileManager = fileManager;
    }

    public static void injectFirebaseAnalytics(AptoideApplication aptoideApplication, FirebaseAnalytics firebaseAnalytics) {
        aptoideApplication.firebaseAnalytics = firebaseAnalytics;
    }

    public static void injectFirstLaunchAnalytics(AptoideApplication aptoideApplication, FirstLaunchAnalytics firstLaunchAnalytics) {
        aptoideApplication.firstLaunchAnalytics = firstLaunchAnalytics;
    }

    public static void injectHttpClientCache(AptoideApplication aptoideApplication, L2Cache l2Cache) {
        aptoideApplication.httpClientCache = l2Cache;
    }

    public static void injectIdsRepository(AptoideApplication aptoideApplication, IdsRepository idsRepository) {
        aptoideApplication.idsRepository = idsRepository;
    }

    public static void injectInstallManager(AptoideApplication aptoideApplication, InstallManager installManager) {
        aptoideApplication.installManager = installManager;
    }

    public static void injectInvalidRefreshTokenLogoutManager(AptoideApplication aptoideApplication, InvalidRefreshTokenLogoutManager invalidRefreshTokenLogoutManager) {
        aptoideApplication.invalidRefreshTokenLogoutManager = invalidRefreshTokenLogoutManager;
    }

    public static void injectLaunchManager(AptoideApplication aptoideApplication, LaunchManager launchManager) {
        aptoideApplication.launchManager = launchManager;
    }

    public static void injectNavigationTracker(AptoideApplication aptoideApplication, NavigationTracker navigationTracker) {
        aptoideApplication.navigationTracker = navigationTracker;
    }

    public static void injectNewFeature(AptoideApplication aptoideApplication, NewFeature newFeature) {
        aptoideApplication.newFeature = newFeature;
    }

    public static void injectNewFeatureManager(AptoideApplication aptoideApplication, NewFeatureManager newFeatureManager) {
        aptoideApplication.newFeatureManager = newFeatureManager;
    }

    public static void injectNotificationAnalytics(AptoideApplication aptoideApplication, NotificationAnalytics notificationAnalytics) {
        aptoideApplication.notificationAnalytics = notificationAnalytics;
    }

    public static void injectNotificationPersistence(AptoideApplication aptoideApplication, RoomNotificationPersistence roomNotificationPersistence) {
        aptoideApplication.notificationPersistence = roomNotificationPersistence;
    }

    public static void injectOemidProvider(AptoideApplication aptoideApplication, OemidProvider oemidProvider) {
        aptoideApplication.oemidProvider = oemidProvider;
    }

    public static void injectPackageRepository(AptoideApplication aptoideApplication, PackageRepository packageRepository) {
        aptoideApplication.packageRepository = packageRepository;
    }

    public static void injectPreferences(AptoideApplication aptoideApplication, Preferences preferences) {
        aptoideApplication.preferences = preferences;
    }

    public static void injectQManager(AptoideApplication aptoideApplication, QManager qManager) {
        aptoideApplication.qManager = qManager;
    }

    @Named
    public static void injectRakamBaseHost(AptoideApplication aptoideApplication, String str) {
        aptoideApplication.rakamBaseHost = str;
    }

    public static void injectReadyToInstallNotificationManager(AptoideApplication aptoideApplication, ReadyToInstallNotificationManager readyToInstallNotificationManager) {
        aptoideApplication.readyToInstallNotificationManager = readyToInstallNotificationManager;
    }

    public static void injectRootAvailabilityManager(AptoideApplication aptoideApplication, RootAvailabilityManager rootAvailabilityManager) {
        aptoideApplication.rootAvailabilityManager = rootAvailabilityManager;
    }

    public static void injectRootInstallationRetryHandler(AptoideApplication aptoideApplication, RootInstallationRetryHandler rootInstallationRetryHandler) {
        aptoideApplication.rootInstallationRetryHandler = rootInstallationRetryHandler;
    }

    public static void injectSearchSuggestionManager(AptoideApplication aptoideApplication, SearchSuggestionManager searchSuggestionManager) {
        aptoideApplication.searchSuggestionManager = searchSuggestionManager;
    }

    @Named
    public static void injectSecurePreferences(AptoideApplication aptoideApplication, SecurePreferences securePreferences) {
        aptoideApplication.securePreferences = securePreferences;
    }

    public static void injectSettingsManager(AptoideApplication aptoideApplication, SettingsManager settingsManager) {
        aptoideApplication.settingsManager = settingsManager;
    }

    public static void injectShortcutManager(AptoideApplication aptoideApplication, AptoideShortcutManager aptoideShortcutManager) {
        aptoideApplication.shortcutManager = aptoideShortcutManager;
    }

    public static void injectStoreCredentials(AptoideApplication aptoideApplication, StoreCredentialsProvider storeCredentialsProvider) {
        aptoideApplication.storeCredentials = storeCredentialsProvider;
    }

    public static void injectStoreUtilsProxy(AptoideApplication aptoideApplication, StoreUtilsProxy storeUtilsProxy) {
        aptoideApplication.storeUtilsProxy = storeUtilsProxy;
    }

    public static void injectSyncStorage(AptoideApplication aptoideApplication, SyncStorage syncStorage) {
        aptoideApplication.syncStorage = syncStorage;
    }

    public static void injectThemeAnalytics(AptoideApplication aptoideApplication, ThemeAnalytics themeAnalytics) {
        aptoideApplication.themeAnalytics = themeAnalytics;
    }

    public static void injectTokenInvalidator(AptoideApplication aptoideApplication, TokenInvalidator tokenInvalidator) {
        aptoideApplication.tokenInvalidator = tokenInvalidator;
    }

    public static void injectTrendingManager(AptoideApplication aptoideApplication, TrendingManager trendingManager) {
        aptoideApplication.trendingManager = trendingManager;
    }

    public static void injectUpdateRepository(AptoideApplication aptoideApplication, UpdateRepository updateRepository) {
        aptoideApplication.updateRepository = updateRepository;
    }

    public void injectMembers(AptoideApplication aptoideApplication) {
        injectAptoideDatabase(aptoideApplication, this.aptoideDatabaseProvider.get());
        injectNotificationPersistence(aptoideApplication, this.notificationPersistenceProvider.get());
        injectAptoideInstalledAppsRepository(aptoideApplication, this.aptoideInstalledAppsRepositoryProvider.get());
        injectRakamBaseHost(aptoideApplication, this.rakamBaseHostProvider.get());
        injectAptoideDownloadManager(aptoideApplication, this.aptoideDownloadManagerProvider.get());
        injectUpdateRepository(aptoideApplication, this.updateRepositoryProvider.get());
        injectCacheHelper(aptoideApplication, this.cacheHelperProvider.get());
        injectAccountManager(aptoideApplication, this.accountManagerProvider.get());
        injectPreferences(aptoideApplication, this.preferencesProvider.get());
        injectSecurePreferences(aptoideApplication, this.securePreferencesProvider.get());
        injectAdultContent(aptoideApplication, this.adultContentProvider.get());
        injectIdsRepository(aptoideApplication, this.idsRepositoryProvider.get());
        injectDefaultClient(aptoideApplication, this.defaultClientProvider.get());
        injectRootAvailabilityManager(aptoideApplication, this.rootAvailabilityManagerProvider.get());
        injectAuthenticationPersistence(aptoideApplication, this.authenticationPersistenceProvider.get());
        injectAlarmSyncScheduler(aptoideApplication, this.alarmSyncSchedulerProvider.get());
        injectBodyInterceptorPoolV7(aptoideApplication, this.bodyInterceptorPoolV7Provider.get());
        injectBodyInterceptorWebV7(aptoideApplication, this.bodyInterceptorWebV7Provider.get());
        injectBodyInterceptorV3(aptoideApplication, this.bodyInterceptorV3Provider.get());
        injectHttpClientCache(aptoideApplication, this.httpClientCacheProvider.get());
        injectQManager(aptoideApplication, this.qManagerProvider.get());
        injectTokenInvalidator(aptoideApplication, this.tokenInvalidatorProvider.get());
        injectPackageRepository(aptoideApplication, this.packageRepositoryProvider.get());
        injectApplicationVersionCodeProvider(aptoideApplication, this.applicationVersionCodeProvider.get());
        injectAdsRepository(aptoideApplication, this.adsRepositoryProvider.get());
        injectSyncStorage(aptoideApplication, this.syncStorageProvider.get());
        injectNavigationTracker(aptoideApplication, this.navigationTrackerProvider.get());
        injectNewFeature(aptoideApplication, this.newFeatureProvider.get());
        injectNewFeatureManager(aptoideApplication, this.newFeatureManagerProvider.get());
        injectReadyToInstallNotificationManager(aptoideApplication, this.readyToInstallNotificationManagerProvider.get());
        injectThemeAnalytics(aptoideApplication, this.themeAnalyticsProvider.get());
        injectAccountSettingsBodyInterceptorPoolV7(aptoideApplication, this.accountSettingsBodyInterceptorPoolV7Provider.get());
        injectStoreCredentials(aptoideApplication, this.storeCredentialsProvider.get());
        injectStoreUtilsProxy(aptoideApplication, this.storeUtilsProxyProvider.get());
        injectTrendingManager(aptoideApplication, this.trendingManagerProvider.get());
        injectAdultContentAnalytics(aptoideApplication, this.adultContentAnalyticsProvider.get());
        injectNotificationAnalytics(aptoideApplication, this.notificationAnalyticsProvider.get());
        injectSearchSuggestionManager(aptoideApplication, this.searchSuggestionManagerProvider.get());
        injectAnalyticsManager(aptoideApplication, this.analyticsManagerProvider.get());
        injectFirstLaunchAnalytics(aptoideApplication, this.firstLaunchAnalyticsProvider.get());
        injectInvalidRefreshTokenLogoutManager(aptoideApplication, this.invalidRefreshTokenLogoutManagerProvider.get());
        injectRootInstallationRetryHandler(aptoideApplication, this.rootInstallationRetryHandlerProvider.get());
        injectShortcutManager(aptoideApplication, this.shortcutManagerProvider.get());
        injectSettingsManager(aptoideApplication, this.settingsManagerProvider.get());
        injectInstallManager(aptoideApplication, this.installManagerProvider.get());
        injectDefaultFollowedStores(aptoideApplication, this.defaultFollowedStoresProvider.get());
        injectOemidProvider(aptoideApplication, this.oemidProvider.get());
        injectAptoideMd5Manager(aptoideApplication, this.aptoideMd5ManagerProvider.get());
        injectAptoideWorkerFactory(aptoideApplication, this.aptoideWorkerFactoryProvider.get());
        injectLaunchManager(aptoideApplication, this.launchManagerProvider.get());
        injectAppInBackgroundTracker(aptoideApplication, this.appInBackgroundTrackerProvider.get());
        injectAppCoinsManager(aptoideApplication, this.appCoinsManagerProvider.get());
        injectFileManager(aptoideApplication, this.fileManagerProvider.get());
        injectFirebaseAnalytics(aptoideApplication, this.firebaseAnalyticsProvider.get());
    }
}
