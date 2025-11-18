package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.home.HomeNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesHomeNavigatorFactory implements Provider {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;
    private final Provider<ThemeManager> themeManagerProvider;

    public FragmentModule_ProvidesHomeNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2, Provider<AppNavigator> provider3, Provider<AccountNavigator> provider4, Provider<ThemeManager> provider5) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
        this.bottomNavigationMapperProvider = provider2;
        this.appNavigatorProvider = provider3;
        this.accountNavigatorProvider = provider4;
        this.themeManagerProvider = provider5;
    }

    public static FragmentModule_ProvidesHomeNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2, Provider<AppNavigator> provider3, Provider<AccountNavigator> provider4, Provider<ThemeManager> provider5) {
        return new FragmentModule_ProvidesHomeNavigatorFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static HomeNavigator providesHomeNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper, AppNavigator appNavigator, AccountNavigator accountNavigator, ThemeManager themeManager) {
        return (HomeNavigator) C9055b.m29112c(fragmentModule.providesHomeNavigator(fragmentNavigator, bottomNavigationMapper, appNavigator, accountNavigator, themeManager));
    }

    @Override // javax.inject.Provider
    public HomeNavigator get() {
        return providesHomeNavigator(this.module, this.fragmentNavigatorProvider.get(), this.bottomNavigationMapperProvider.get(), this.appNavigatorProvider.get(), this.accountNavigatorProvider.get(), this.themeManagerProvider.get());
    }
}
