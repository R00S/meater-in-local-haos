package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesOutOfSpaceNavigatorFactory implements Provider {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesOutOfSpaceNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
    }

    public static FragmentModule_ProvidesOutOfSpaceNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        return new FragmentModule_ProvidesOutOfSpaceNavigatorFactory(fragmentModule, provider);
    }

    public static OutOfSpaceNavigator providesOutOfSpaceNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator) {
        return (OutOfSpaceNavigator) C9055b.m29112c(fragmentModule.providesOutOfSpaceNavigator(fragmentNavigator));
    }

    @Override // javax.inject.Provider
    public OutOfSpaceNavigator get() {
        return providesOutOfSpaceNavigator(this.module, this.fragmentNavigatorProvider.get());
    }
}
