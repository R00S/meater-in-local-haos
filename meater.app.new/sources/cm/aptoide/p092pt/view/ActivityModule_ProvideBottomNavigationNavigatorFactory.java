package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.bottomNavigation.BottomNavigationAnalytics;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideBottomNavigationNavigatorFactory implements Provider {
    private final Provider<BottomNavigationAnalytics> bottomNavigationAnalyticsProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;
    private final Provider<SearchAnalytics> searchAnalyticsProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ActivityModule_ProvideBottomNavigationNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationAnalytics> provider2, Provider<SearchAnalytics> provider3, Provider<ThemeManager> provider4) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.bottomNavigationAnalyticsProvider = provider2;
        this.searchAnalyticsProvider = provider3;
        this.themeManagerProvider = provider4;
    }

    public static ActivityModule_ProvideBottomNavigationNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationAnalytics> provider2, Provider<SearchAnalytics> provider3, Provider<ThemeManager> provider4) {
        return new ActivityModule_ProvideBottomNavigationNavigatorFactory(activityModule, provider, provider2, provider3, provider4);
    }

    public static BottomNavigationNavigator provideBottomNavigationNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, BottomNavigationAnalytics bottomNavigationAnalytics, SearchAnalytics searchAnalytics, ThemeManager themeManager) {
        return (BottomNavigationNavigator) C9055b.m29112c(activityModule.provideBottomNavigationNavigator(fragmentNavigator, bottomNavigationAnalytics, searchAnalytics, themeManager));
    }

    @Override // javax.inject.Provider
    public BottomNavigationNavigator get() {
        return provideBottomNavigationNavigator(this.module, this.fragmentNavigatorProvider.get(), this.bottomNavigationAnalyticsProvider.get(), this.searchAnalyticsProvider.get(), this.themeManagerProvider.get());
    }
}
