package cm.aptoide.p092pt.store.view.recommended;

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
public final class RecommendedStoresFragment_MembersInjector implements InterfaceC9053a<RecommendedStoresFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<String> marketNameProvider2;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider2;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider2;
    private final Provider<RoomStoreRepository> storeRepositoryProvider3;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider2;
    private final Provider<ThemeManager> themeManagerProvider;

    public RecommendedStoresFragment_MembersInjector(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<String> provider6, Provider<ThemeManager> provider7, Provider<StoreCredentialsProvider> provider8, Provider<RoomStoreRepository> provider9, Provider<StoreCredentialsProvider> provider10, Provider<RoomStoreRepository> provider11, Provider<StoreUtilsProxy> provider12) {
        this.storeRepositoryProvider = provider;
        this.marketNameProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
        this.aptoideInstalledAppsRepositoryProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.marketNameProvider2 = provider6;
        this.themeManagerProvider = provider7;
        this.storeCredentialsProvider = provider8;
        this.storeRepositoryProvider2 = provider9;
        this.storeCredentialsProvider2 = provider10;
        this.storeRepositoryProvider3 = provider11;
        this.storeUtilsProxyProvider2 = provider12;
    }

    public static InterfaceC9053a<RecommendedStoresFragment> create(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<String> provider6, Provider<ThemeManager> provider7, Provider<StoreCredentialsProvider> provider8, Provider<RoomStoreRepository> provider9, Provider<StoreCredentialsProvider> provider10, Provider<RoomStoreRepository> provider11, Provider<StoreUtilsProxy> provider12) {
        return new RecommendedStoresFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectStoreCredentialsProvider(RecommendedStoresFragment recommendedStoresFragment, StoreCredentialsProvider storeCredentialsProvider) {
        recommendedStoresFragment.storeCredentialsProvider = storeCredentialsProvider;
    }

    public static void injectStoreRepository(RecommendedStoresFragment recommendedStoresFragment, RoomStoreRepository roomStoreRepository) {
        recommendedStoresFragment.storeRepository = roomStoreRepository;
    }

    public static void injectStoreUtilsProxy(RecommendedStoresFragment recommendedStoresFragment, StoreUtilsProxy storeUtilsProxy) {
        recommendedStoresFragment.storeUtilsProxy = storeUtilsProxy;
    }

    public void injectMembers(RecommendedStoresFragment recommendedStoresFragment) {
        StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(recommendedStoresFragment, this.storeRepositoryProvider.get());
        StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(recommendedStoresFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(recommendedStoresFragment, this.storeUtilsProxyProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(recommendedStoresFragment, this.aptoideInstalledAppsRepositoryProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(recommendedStoresFragment, this.analyticsManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(recommendedStoresFragment, this.marketNameProvider2.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(recommendedStoresFragment, this.themeManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(recommendedStoresFragment, this.storeCredentialsProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(recommendedStoresFragment, this.storeRepositoryProvider2.get());
        injectStoreCredentialsProvider(recommendedStoresFragment, this.storeCredentialsProvider2.get());
        injectStoreRepository(recommendedStoresFragment, this.storeRepositoryProvider3.get());
        injectStoreUtilsProxy(recommendedStoresFragment, this.storeUtilsProxyProvider2.get());
    }
}
