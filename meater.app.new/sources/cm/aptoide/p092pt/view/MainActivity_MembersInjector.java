package cm.aptoide.p092pt.view;

import android.content.res.Resources;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.FirebaseNotificationAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.analytics.FirstLaunchAnalytics;
import cm.aptoide.p092pt.analytics.view.AnalyticsActivity_MembersInjector;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity_MembersInjector;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator_MembersInjector;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.themes.ThemeAnalytics;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class MainActivity_MembersInjector implements InterfaceC9053a<MainActivity> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<DeepLinkManager> deepLinkManagerProvider;
    private final Provider<FirebaseNotificationAnalytics> firebaseNotificationAnalyticsProvider;
    private final Provider<FirstLaunchAnalytics> firstLaunchAnalyticsProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<MarketResourceFormatter> marketResourceFormatterProvider;
    private final Provider<Presenter> presenterProvider;
    private final Provider<Resources> resourcesProvider;
    private final Provider<ThemeAnalytics> themeAnalyticsProvider;
    private final Provider<ThemeManager> themeManagerProvider;
    private final Provider<ThemeManager> themeManagerProvider2;

    public MainActivity_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5, Provider<ThemeManager> provider6, Provider<BottomNavigationMapper> provider7, Provider<BottomNavigationNavigator> provider8, Provider<Presenter> provider9, Provider<Resources> provider10, Provider<MarketResourceFormatter> provider11, Provider<ThemeAnalytics> provider12, Provider<DeepLinkManager> provider13, Provider<FirebaseNotificationAnalytics> provider14) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
        this.analyticsManagerProvider = provider4;
        this.firstLaunchAnalyticsProvider = provider5;
        this.themeManagerProvider2 = provider6;
        this.bottomNavigationMapperProvider = provider7;
        this.bottomNavigationNavigatorProvider = provider8;
        this.presenterProvider = provider9;
        this.resourcesProvider = provider10;
        this.marketResourceFormatterProvider = provider11;
        this.themeAnalyticsProvider = provider12;
        this.deepLinkManagerProvider = provider13;
        this.firebaseNotificationAnalyticsProvider = provider14;
    }

    public static InterfaceC9053a<MainActivity> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5, Provider<ThemeManager> provider6, Provider<BottomNavigationMapper> provider7, Provider<BottomNavigationNavigator> provider8, Provider<Presenter> provider9, Provider<Resources> provider10, Provider<MarketResourceFormatter> provider11, Provider<ThemeAnalytics> provider12, Provider<DeepLinkManager> provider13, Provider<FirebaseNotificationAnalytics> provider14) {
        return new MainActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static void injectDeepLinkManager(MainActivity mainActivity, DeepLinkManager deepLinkManager) {
        mainActivity.deepLinkManager = deepLinkManager;
    }

    public static void injectFirebaseNotificationAnalytics(MainActivity mainActivity, FirebaseNotificationAnalytics firebaseNotificationAnalytics) {
        mainActivity.firebaseNotificationAnalytics = firebaseNotificationAnalytics;
    }

    public static void injectMarketResourceFormatter(MainActivity mainActivity, MarketResourceFormatter marketResourceFormatter) {
        mainActivity.marketResourceFormatter = marketResourceFormatter;
    }

    public static void injectPresenter(MainActivity mainActivity, Presenter presenter) {
        mainActivity.presenter = presenter;
    }

    public static void injectResources(MainActivity mainActivity, Resources resources) {
        mainActivity.resources = resources;
    }

    public static void injectThemeAnalytics(MainActivity mainActivity, ThemeAnalytics themeAnalytics) {
        mainActivity.themeAnalytics = themeAnalytics;
    }

    public void injectMembers(MainActivity mainActivity) {
        ActivityResultNavigator_MembersInjector.injectThemeManager(mainActivity, this.themeManagerProvider.get());
        ActivityResultNavigator_MembersInjector.injectAccountNavigator(mainActivity, this.accountNavigatorProvider.get());
        ActivityResultNavigator_MembersInjector.injectMarketName(mainActivity, this.marketNameProvider.get());
        AnalyticsActivity_MembersInjector.injectAnalyticsManager(mainActivity, this.analyticsManagerProvider.get());
        AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(mainActivity, this.firstLaunchAnalyticsProvider.get());
        ThemedActivityView_MembersInjector.injectThemeManager(mainActivity, this.themeManagerProvider2.get());
        BottomNavigationActivity_MembersInjector.injectBottomNavigationMapper(mainActivity, this.bottomNavigationMapperProvider.get());
        BottomNavigationActivity_MembersInjector.injectBottomNavigationNavigator(mainActivity, this.bottomNavigationNavigatorProvider.get());
        injectPresenter(mainActivity, this.presenterProvider.get());
        injectResources(mainActivity, this.resourcesProvider.get());
        injectMarketResourceFormatter(mainActivity, this.marketResourceFormatterProvider.get());
        injectThemeAnalytics(mainActivity, this.themeAnalyticsProvider.get());
        injectDeepLinkManager(mainActivity, this.deepLinkManagerProvider.get());
        injectFirebaseNotificationAnalytics(mainActivity, this.firebaseNotificationAnalyticsProvider.get());
    }
}
