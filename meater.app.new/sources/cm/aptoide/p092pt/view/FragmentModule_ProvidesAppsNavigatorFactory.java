package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.home.apps.AppsNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesAppsNavigatorFactory implements Provider {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesAppsNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2, Provider<AppNavigator> provider3) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
        this.bottomNavigationMapperProvider = provider2;
        this.appNavigatorProvider = provider3;
    }

    public static FragmentModule_ProvidesAppsNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2, Provider<AppNavigator> provider3) {
        return new FragmentModule_ProvidesAppsNavigatorFactory(fragmentModule, provider, provider2, provider3);
    }

    public static AppsNavigator providesAppsNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper, AppNavigator appNavigator) {
        return (AppsNavigator) C9055b.m29112c(fragmentModule.providesAppsNavigator(fragmentNavigator, bottomNavigationMapper, appNavigator));
    }

    @Override // javax.inject.Provider
    public AppsNavigator get() {
        return providesAppsNavigator(this.module, this.fragmentNavigatorProvider.get(), this.bottomNavigationMapperProvider.get(), this.appNavigatorProvider.get());
    }
}
