package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.store.view.p104my.MyStoresNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesMyStoreNavigatorFactory implements Provider {
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesMyStoreNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
        this.bottomNavigationMapperProvider = provider2;
    }

    public static FragmentModule_ProvidesMyStoreNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2) {
        return new FragmentModule_ProvidesMyStoreNavigatorFactory(fragmentModule, provider, provider2);
    }

    public static MyStoresNavigator providesMyStoreNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper) {
        return (MyStoresNavigator) C9055b.m29112c(fragmentModule.providesMyStoreNavigator(fragmentNavigator, bottomNavigationMapper));
    }

    @Override // javax.inject.Provider
    public MyStoresNavigator get() {
        return providesMyStoreNavigator(this.module, this.fragmentNavigatorProvider.get(), this.bottomNavigationMapperProvider.get());
    }
}
