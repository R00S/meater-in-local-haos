package cm.aptoide.p092pt.store.view.p104my;

import cm.aptoide.analytics.AnalyticsManager;
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
public final class MyStoresFragment_MembersInjector implements InterfaceC9053a<MyStoresFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<String> marketNameProvider2;
    private final Provider<MyStoresPresenter> myStoresPresenterProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider2;
    private final Provider<RoomStoreRepository> storeRepositoryProvider3;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public MyStoresFragment_MembersInjector(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<String> provider6, Provider<ThemeManager> provider7, Provider<StoreCredentialsProvider> provider8, Provider<RoomStoreRepository> provider9, Provider<MyStoresPresenter> provider10, Provider<RoomStoreRepository> provider11) {
        this.storeRepositoryProvider = provider;
        this.marketNameProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
        this.aptoideInstalledAppsRepositoryProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.marketNameProvider2 = provider6;
        this.themeManagerProvider = provider7;
        this.storeCredentialsProvider = provider8;
        this.storeRepositoryProvider2 = provider9;
        this.myStoresPresenterProvider = provider10;
        this.storeRepositoryProvider3 = provider11;
    }

    public static InterfaceC9053a<MyStoresFragment> create(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<String> provider6, Provider<ThemeManager> provider7, Provider<StoreCredentialsProvider> provider8, Provider<RoomStoreRepository> provider9, Provider<MyStoresPresenter> provider10, Provider<RoomStoreRepository> provider11) {
        return new MyStoresFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static void injectMyStoresPresenter(MyStoresFragment myStoresFragment, MyStoresPresenter myStoresPresenter) {
        myStoresFragment.myStoresPresenter = myStoresPresenter;
    }

    public static void injectStoreRepository(MyStoresFragment myStoresFragment, RoomStoreRepository roomStoreRepository) {
        myStoresFragment.storeRepository = roomStoreRepository;
    }

    public void injectMembers(MyStoresFragment myStoresFragment) {
        StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresFragment, this.storeRepositoryProvider.get());
        StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(myStoresFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(myStoresFragment, this.storeUtilsProxyProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(myStoresFragment, this.aptoideInstalledAppsRepositoryProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(myStoresFragment, this.analyticsManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(myStoresFragment, this.marketNameProvider2.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(myStoresFragment, this.themeManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(myStoresFragment, this.storeCredentialsProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresFragment, this.storeRepositoryProvider2.get());
        injectMyStoresPresenter(myStoresFragment, this.myStoresPresenterProvider.get());
        injectStoreRepository(myStoresFragment, this.storeRepositoryProvider3.get());
    }
}
