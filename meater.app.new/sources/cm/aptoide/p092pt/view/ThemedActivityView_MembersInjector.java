package cm.aptoide.p092pt.view;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.analytics.FirstLaunchAnalytics;
import cm.aptoide.p092pt.analytics.view.AnalyticsActivity_MembersInjector;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator_MembersInjector;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class ThemedActivityView_MembersInjector implements InterfaceC9053a<ThemedActivityView> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<FirstLaunchAnalytics> firstLaunchAnalyticsProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;
    private final Provider<ThemeManager> themeManagerProvider2;

    public ThemedActivityView_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5, Provider<ThemeManager> provider6) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
        this.analyticsManagerProvider = provider4;
        this.firstLaunchAnalyticsProvider = provider5;
        this.themeManagerProvider2 = provider6;
    }

    public static InterfaceC9053a<ThemedActivityView> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5, Provider<ThemeManager> provider6) {
        return new ThemedActivityView_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectThemeManager(ThemedActivityView themedActivityView, ThemeManager themeManager) {
        themedActivityView.themeManager = themeManager;
    }

    public void injectMembers(ThemedActivityView themedActivityView) {
        ActivityResultNavigator_MembersInjector.injectThemeManager(themedActivityView, this.themeManagerProvider.get());
        ActivityResultNavigator_MembersInjector.injectAccountNavigator(themedActivityView, this.accountNavigatorProvider.get());
        ActivityResultNavigator_MembersInjector.injectMarketName(themedActivityView, this.marketNameProvider.get());
        AnalyticsActivity_MembersInjector.injectAnalyticsManager(themedActivityView, this.analyticsManagerProvider.get());
        AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(themedActivityView, this.firstLaunchAnalyticsProvider.get());
        injectThemeManager(themedActivityView, this.themeManagerProvider2.get());
    }
}
