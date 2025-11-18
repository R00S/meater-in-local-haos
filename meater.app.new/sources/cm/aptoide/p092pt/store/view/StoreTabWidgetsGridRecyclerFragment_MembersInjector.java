package cm.aptoide.p092pt.store.view;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Named;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class StoreTabWidgetsGridRecyclerFragment_MembersInjector implements InterfaceC9053a<StoreTabWidgetsGridRecyclerFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<String> marketNameProvider2;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider2;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public StoreTabWidgetsGridRecyclerFragment_MembersInjector(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<String> provider6, Provider<ThemeManager> provider7, Provider<StoreCredentialsProvider> provider8, Provider<RoomStoreRepository> provider9) {
        this.storeRepositoryProvider = provider;
        this.marketNameProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
        this.aptoideInstalledAppsRepositoryProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.marketNameProvider2 = provider6;
        this.themeManagerProvider = provider7;
        this.storeCredentialsProvider = provider8;
        this.storeRepositoryProvider2 = provider9;
    }

    public static InterfaceC9053a<StoreTabWidgetsGridRecyclerFragment> create(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<String> provider6, Provider<ThemeManager> provider7, Provider<StoreCredentialsProvider> provider8, Provider<RoomStoreRepository> provider9) {
        return new StoreTabWidgetsGridRecyclerFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static void injectAnalyticsManager(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, AnalyticsManager analyticsManager) {
        storeTabWidgetsGridRecyclerFragment.analyticsManager = analyticsManager;
    }

    public static void injectAptoideInstalledAppsRepository(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, AptoideInstalledAppsRepository aptoideInstalledAppsRepository) {
        storeTabWidgetsGridRecyclerFragment.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
    }

    @Named
    public static void injectMarketName(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, String str) {
        storeTabWidgetsGridRecyclerFragment.marketName = str;
    }

    public static void injectStoreCredentialsProvider(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, StoreCredentialsProvider storeCredentialsProvider) {
        storeTabWidgetsGridRecyclerFragment.storeCredentialsProvider = storeCredentialsProvider;
    }

    public static void injectStoreRepository(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, RoomStoreRepository roomStoreRepository) {
        storeTabWidgetsGridRecyclerFragment.storeRepository = roomStoreRepository;
    }

    public static void injectStoreUtilsProxy(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, StoreUtilsProxy storeUtilsProxy) {
        storeTabWidgetsGridRecyclerFragment.storeUtilsProxy = storeUtilsProxy;
    }

    public static void injectThemeManager(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, ThemeManager themeManager) {
        storeTabWidgetsGridRecyclerFragment.themeManager = themeManager;
    }

    public void injectMembers(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment) {
        StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(storeTabWidgetsGridRecyclerFragment, this.storeRepositoryProvider.get());
        StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(storeTabWidgetsGridRecyclerFragment, this.marketNameProvider.get());
        injectStoreUtilsProxy(storeTabWidgetsGridRecyclerFragment, this.storeUtilsProxyProvider.get());
        injectAptoideInstalledAppsRepository(storeTabWidgetsGridRecyclerFragment, this.aptoideInstalledAppsRepositoryProvider.get());
        injectAnalyticsManager(storeTabWidgetsGridRecyclerFragment, this.analyticsManagerProvider.get());
        injectMarketName(storeTabWidgetsGridRecyclerFragment, this.marketNameProvider2.get());
        injectThemeManager(storeTabWidgetsGridRecyclerFragment, this.themeManagerProvider.get());
        injectStoreCredentialsProvider(storeTabWidgetsGridRecyclerFragment, this.storeCredentialsProvider.get());
        injectStoreRepository(storeTabWidgetsGridRecyclerFragment, this.storeRepositoryProvider2.get());
    }
}
