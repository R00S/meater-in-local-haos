package cm.aptoide.p092pt.store.view.p104my;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment_MembersInjector;
import cm.aptoide.p092pt.store.view.StoreTabWidgetsGridRecyclerFragment_MembersInjector;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class MyStoresSubscribedFragment_MembersInjector implements InterfaceC9053a<MyStoresSubscribedFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider2;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<String> marketNameProvider2;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider2;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider2;
    private final Provider<RoomStoreRepository> storeRepositoryProvider3;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider2;
    private final Provider<ThemeManager> themeManagerProvider;

    public MyStoresSubscribedFragment_MembersInjector(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<String> provider6, Provider<ThemeManager> provider7, Provider<StoreCredentialsProvider> provider8, Provider<RoomStoreRepository> provider9, Provider<AnalyticsManager> provider10, Provider<NavigationTracker> provider11, Provider<StoreCredentialsProvider> provider12, Provider<RoomStoreRepository> provider13, Provider<StoreUtilsProxy> provider14) {
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
        this.storeCredentialsProvider2 = provider12;
        this.storeRepositoryProvider3 = provider13;
        this.storeUtilsProxyProvider2 = provider14;
    }

    public static InterfaceC9053a<MyStoresSubscribedFragment> create(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<String> provider6, Provider<ThemeManager> provider7, Provider<StoreCredentialsProvider> provider8, Provider<RoomStoreRepository> provider9, Provider<AnalyticsManager> provider10, Provider<NavigationTracker> provider11, Provider<StoreCredentialsProvider> provider12, Provider<RoomStoreRepository> provider13, Provider<StoreUtilsProxy> provider14) {
        return new MyStoresSubscribedFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static void injectAnalyticsManager(MyStoresSubscribedFragment myStoresSubscribedFragment, AnalyticsManager analyticsManager) {
        myStoresSubscribedFragment.analyticsManager = analyticsManager;
    }

    public static void injectNavigationTracker(MyStoresSubscribedFragment myStoresSubscribedFragment, NavigationTracker navigationTracker) {
        myStoresSubscribedFragment.navigationTracker = navigationTracker;
    }

    public static void injectStoreCredentialsProvider(MyStoresSubscribedFragment myStoresSubscribedFragment, StoreCredentialsProvider storeCredentialsProvider) {
        myStoresSubscribedFragment.storeCredentialsProvider = storeCredentialsProvider;
    }

    public static void injectStoreRepository(MyStoresSubscribedFragment myStoresSubscribedFragment, RoomStoreRepository roomStoreRepository) {
        myStoresSubscribedFragment.storeRepository = roomStoreRepository;
    }

    public static void injectStoreUtilsProxy(MyStoresSubscribedFragment myStoresSubscribedFragment, StoreUtilsProxy storeUtilsProxy) {
        myStoresSubscribedFragment.storeUtilsProxy = storeUtilsProxy;
    }

    public void injectMembers(MyStoresSubscribedFragment myStoresSubscribedFragment) {
        StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresSubscribedFragment, this.storeRepositoryProvider.get());
        StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(myStoresSubscribedFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(myStoresSubscribedFragment, this.storeUtilsProxyProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(myStoresSubscribedFragment, this.aptoideInstalledAppsRepositoryProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(myStoresSubscribedFragment, this.analyticsManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(myStoresSubscribedFragment, this.marketNameProvider2.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(myStoresSubscribedFragment, this.themeManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(myStoresSubscribedFragment, this.storeCredentialsProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresSubscribedFragment, this.storeRepositoryProvider2.get());
        injectAnalyticsManager(myStoresSubscribedFragment, this.analyticsManagerProvider2.get());
        injectNavigationTracker(myStoresSubscribedFragment, this.navigationTrackerProvider.get());
        injectStoreCredentialsProvider(myStoresSubscribedFragment, this.storeCredentialsProvider2.get());
        injectStoreRepository(myStoresSubscribedFragment, this.storeRepositoryProvider3.get());
        injectStoreUtilsProxy(myStoresSubscribedFragment, this.storeUtilsProxyProvider2.get());
    }
}
