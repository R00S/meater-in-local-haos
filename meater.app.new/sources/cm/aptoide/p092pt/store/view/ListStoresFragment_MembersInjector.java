package cm.aptoide.p092pt.store.view;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class ListStoresFragment_MembersInjector implements InterfaceC9053a<ListStoresFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider2;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<String> marketNameProvider2;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider2;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ListStoresFragment_MembersInjector(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<String> provider6, Provider<ThemeManager> provider7, Provider<StoreCredentialsProvider> provider8, Provider<RoomStoreRepository> provider9, Provider<AnalyticsManager> provider10, Provider<NavigationTracker> provider11) {
        this.storeRepositoryProvider = provider;
        this.marketNameProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
        this.aptoideInstalledAppsRepositoryProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.marketNameProvider2 = provider6;
        this.themeManagerProvider = provider7;
        this.storeCredentialsProvider = provider8;
        this.storeRepositoryProvider2 = provider9;
        this.analyticsManagerProvider2 = provider10;
        this.navigationTrackerProvider = provider11;
    }

    public static InterfaceC9053a<ListStoresFragment> create(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<String> provider6, Provider<ThemeManager> provider7, Provider<StoreCredentialsProvider> provider8, Provider<RoomStoreRepository> provider9, Provider<AnalyticsManager> provider10, Provider<NavigationTracker> provider11) {
        return new ListStoresFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static void injectAnalyticsManager(ListStoresFragment listStoresFragment, AnalyticsManager analyticsManager) {
        listStoresFragment.analyticsManager = analyticsManager;
    }

    public static void injectNavigationTracker(ListStoresFragment listStoresFragment, NavigationTracker navigationTracker) {
        listStoresFragment.navigationTracker = navigationTracker;
    }

    public void injectMembers(ListStoresFragment listStoresFragment) {
        StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(listStoresFragment, this.storeRepositoryProvider.get());
        StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(listStoresFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(listStoresFragment, this.storeUtilsProxyProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(listStoresFragment, this.aptoideInstalledAppsRepositoryProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(listStoresFragment, this.analyticsManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(listStoresFragment, this.marketNameProvider2.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(listStoresFragment, this.themeManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(listStoresFragment, this.storeCredentialsProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(listStoresFragment, this.storeRepositoryProvider2.get());
        injectAnalyticsManager(listStoresFragment, this.analyticsManagerProvider2.get());
        injectNavigationTracker(listStoresFragment, this.navigationTrackerProvider.get());
    }
}
