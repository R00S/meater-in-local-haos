package cm.aptoide.p092pt.bottomNavigation;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.analytics.FirstLaunchAnalytics;
import cm.aptoide.p092pt.analytics.view.AnalyticsActivity_MembersInjector;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator_MembersInjector;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.ThemedActivityView_MembersInjector;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class BottomNavigationActivity_MembersInjector implements InterfaceC9053a<BottomNavigationActivity> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<FirstLaunchAnalytics> firstLaunchAnalyticsProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;
    private final Provider<ThemeManager> themeManagerProvider2;

    public BottomNavigationActivity_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5, Provider<ThemeManager> provider6, Provider<BottomNavigationMapper> provider7, Provider<BottomNavigationNavigator> provider8) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
        this.analyticsManagerProvider = provider4;
        this.firstLaunchAnalyticsProvider = provider5;
        this.themeManagerProvider2 = provider6;
        this.bottomNavigationMapperProvider = provider7;
        this.bottomNavigationNavigatorProvider = provider8;
    }

    public static InterfaceC9053a<BottomNavigationActivity> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5, Provider<ThemeManager> provider6, Provider<BottomNavigationMapper> provider7, Provider<BottomNavigationNavigator> provider8) {
        return new BottomNavigationActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectBottomNavigationMapper(BottomNavigationActivity bottomNavigationActivity, BottomNavigationMapper bottomNavigationMapper) {
        bottomNavigationActivity.bottomNavigationMapper = bottomNavigationMapper;
    }

    public static void injectBottomNavigationNavigator(BottomNavigationActivity bottomNavigationActivity, BottomNavigationNavigator bottomNavigationNavigator) {
        bottomNavigationActivity.bottomNavigationNavigator = bottomNavigationNavigator;
    }

    public void injectMembers(BottomNavigationActivity bottomNavigationActivity) {
        ActivityResultNavigator_MembersInjector.injectThemeManager(bottomNavigationActivity, this.themeManagerProvider.get());
        ActivityResultNavigator_MembersInjector.injectAccountNavigator(bottomNavigationActivity, this.accountNavigatorProvider.get());
        ActivityResultNavigator_MembersInjector.injectMarketName(bottomNavigationActivity, this.marketNameProvider.get());
        AnalyticsActivity_MembersInjector.injectAnalyticsManager(bottomNavigationActivity, this.analyticsManagerProvider.get());
        AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(bottomNavigationActivity, this.firstLaunchAnalyticsProvider.get());
        ThemedActivityView_MembersInjector.injectThemeManager(bottomNavigationActivity, this.themeManagerProvider2.get());
        injectBottomNavigationMapper(bottomNavigationActivity, this.bottomNavigationMapperProvider.get());
        injectBottomNavigationNavigator(bottomNavigationActivity, this.bottomNavigationNavigatorProvider.get());
    }
}
