package cm.aptoide.p092pt.view;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.AppShortcutsAnalytics;
import cm.aptoide.p092pt.DeepLinkAnalytics;
import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.notification.ReadyToInstallNotificationManager;
import cm.aptoide.p092pt.search.SearchNavigator;
import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.themes.NewFeature;
import cm.aptoide.p092pt.themes.ThemeAnalytics;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideDeepLinkManagerFactory implements Provider {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AdsRepository> adsRepositoryProvider;
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<AppShortcutsAnalytics> appShortcutsAnalyticsProvider;
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<DeepLinkAnalytics> deepLinkAnalyticsProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final ActivityModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<NewFeature> newFeatureProvider;
    private final Provider<ReadyToInstallNotificationManager> readyToInstallNotificationManagerProvider;
    private final Provider<RoomStoreRepository> roomStoreRepositoryProvider;
    private final Provider<SearchAnalytics> searchAnalyticsProvider;
    private final Provider<SearchNavigator> searchNavigatorProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<StoreAnalytics> storeAnalyticsProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeAnalytics> themeAnalyticsProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ActivityModule_ProvideDeepLinkManagerFactory(ActivityModule activityModule, Provider<StoreUtilsProxy> provider, Provider<FragmentNavigator> provider2, Provider<BottomNavigationNavigator> provider3, Provider<SearchNavigator> provider4, Provider<SharedPreferences> provider5, Provider<RoomStoreRepository> provider6, Provider<NavigationTracker> provider7, Provider<SearchAnalytics> provider8, Provider<DeepLinkAnalytics> provider9, Provider<AppShortcutsAnalytics> provider10, Provider<AptoideAccountManager> provider11, Provider<StoreAnalytics> provider12, Provider<AdsRepository> provider13, Provider<AppNavigator> provider14, Provider<InstallManager> provider15, Provider<NewFeature> provider16, Provider<ThemeManager> provider17, Provider<ThemeAnalytics> provider18, Provider<ReadyToInstallNotificationManager> provider19) {
        this.module = activityModule;
        this.storeUtilsProxyProvider = provider;
        this.fragmentNavigatorProvider = provider2;
        this.bottomNavigationNavigatorProvider = provider3;
        this.searchNavigatorProvider = provider4;
        this.sharedPreferencesProvider = provider5;
        this.roomStoreRepositoryProvider = provider6;
        this.navigationTrackerProvider = provider7;
        this.searchAnalyticsProvider = provider8;
        this.deepLinkAnalyticsProvider = provider9;
        this.appShortcutsAnalyticsProvider = provider10;
        this.accountManagerProvider = provider11;
        this.storeAnalyticsProvider = provider12;
        this.adsRepositoryProvider = provider13;
        this.appNavigatorProvider = provider14;
        this.installManagerProvider = provider15;
        this.newFeatureProvider = provider16;
        this.themeManagerProvider = provider17;
        this.themeAnalyticsProvider = provider18;
        this.readyToInstallNotificationManagerProvider = provider19;
    }

    public static ActivityModule_ProvideDeepLinkManagerFactory create(ActivityModule activityModule, Provider<StoreUtilsProxy> provider, Provider<FragmentNavigator> provider2, Provider<BottomNavigationNavigator> provider3, Provider<SearchNavigator> provider4, Provider<SharedPreferences> provider5, Provider<RoomStoreRepository> provider6, Provider<NavigationTracker> provider7, Provider<SearchAnalytics> provider8, Provider<DeepLinkAnalytics> provider9, Provider<AppShortcutsAnalytics> provider10, Provider<AptoideAccountManager> provider11, Provider<StoreAnalytics> provider12, Provider<AdsRepository> provider13, Provider<AppNavigator> provider14, Provider<InstallManager> provider15, Provider<NewFeature> provider16, Provider<ThemeManager> provider17, Provider<ThemeAnalytics> provider18, Provider<ReadyToInstallNotificationManager> provider19) {
        return new ActivityModule_ProvideDeepLinkManagerFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    public static DeepLinkManager provideDeepLinkManager(ActivityModule activityModule, StoreUtilsProxy storeUtilsProxy, FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator, SearchNavigator searchNavigator, SharedPreferences sharedPreferences, RoomStoreRepository roomStoreRepository, NavigationTracker navigationTracker, SearchAnalytics searchAnalytics, DeepLinkAnalytics deepLinkAnalytics, AppShortcutsAnalytics appShortcutsAnalytics, AptoideAccountManager aptoideAccountManager, StoreAnalytics storeAnalytics, AdsRepository adsRepository, AppNavigator appNavigator, InstallManager installManager, NewFeature newFeature, ThemeManager themeManager, ThemeAnalytics themeAnalytics, ReadyToInstallNotificationManager readyToInstallNotificationManager) {
        return (DeepLinkManager) C9055b.m29112c(activityModule.provideDeepLinkManager(storeUtilsProxy, fragmentNavigator, bottomNavigationNavigator, searchNavigator, sharedPreferences, roomStoreRepository, navigationTracker, searchAnalytics, deepLinkAnalytics, appShortcutsAnalytics, aptoideAccountManager, storeAnalytics, adsRepository, appNavigator, installManager, newFeature, themeManager, themeAnalytics, readyToInstallNotificationManager));
    }

    @Override // javax.inject.Provider
    public DeepLinkManager get() {
        return provideDeepLinkManager(this.module, this.storeUtilsProxyProvider.get(), this.fragmentNavigatorProvider.get(), this.bottomNavigationNavigatorProvider.get(), this.searchNavigatorProvider.get(), this.sharedPreferencesProvider.get(), this.roomStoreRepositoryProvider.get(), this.navigationTrackerProvider.get(), this.searchAnalyticsProvider.get(), this.deepLinkAnalyticsProvider.get(), this.appShortcutsAnalyticsProvider.get(), this.accountManagerProvider.get(), this.storeAnalyticsProvider.get(), this.adsRepositoryProvider.get(), this.appNavigatorProvider.get(), this.installManagerProvider.get(), this.newFeatureProvider.get(), this.themeManagerProvider.get(), this.themeAnalyticsProvider.get(), this.readyToInstallNotificationManagerProvider.get());
    }
}
