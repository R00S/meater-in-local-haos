package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.home.more.appcoins.EarnAppcNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideEarnAppcNavigatorFactory implements Provider {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvideEarnAppcNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
    }

    public static FragmentModule_ProvideEarnAppcNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        return new FragmentModule_ProvideEarnAppcNavigatorFactory(fragmentModule, provider);
    }

    public static EarnAppcNavigator provideEarnAppcNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator) {
        return (EarnAppcNavigator) C9055b.m29112c(fragmentModule.provideEarnAppcNavigator(fragmentNavigator));
    }

    @Override // javax.inject.Provider
    public EarnAppcNavigator get() {
        return provideEarnAppcNavigator(this.module, this.fragmentNavigatorProvider.get());
    }
}
