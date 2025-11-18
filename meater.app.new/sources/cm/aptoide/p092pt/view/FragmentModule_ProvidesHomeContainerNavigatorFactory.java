package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.home.HomeContainerNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesHomeContainerNavigatorFactory implements Provider {
    private final Provider<FragmentNavigator> childFragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesHomeContainerNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        this.module = fragmentModule;
        this.childFragmentNavigatorProvider = provider;
    }

    public static FragmentModule_ProvidesHomeContainerNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        return new FragmentModule_ProvidesHomeContainerNavigatorFactory(fragmentModule, provider);
    }

    public static HomeContainerNavigator providesHomeContainerNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator) {
        return (HomeContainerNavigator) C9055b.m29112c(fragmentModule.providesHomeContainerNavigator(fragmentNavigator));
    }

    @Override // javax.inject.Provider
    public HomeContainerNavigator get() {
        return providesHomeContainerNavigator(this.module, this.childFragmentNavigatorProvider.get());
    }
}
