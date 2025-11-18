package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.wallet.WalletInstallNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesWalletInstallNavigatorFactory implements Provider {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesWalletInstallNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
    }

    public static ActivityModule_ProvidesWalletInstallNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider) {
        return new ActivityModule_ProvidesWalletInstallNavigatorFactory(activityModule, provider);
    }

    public static WalletInstallNavigator providesWalletInstallNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator) {
        return (WalletInstallNavigator) C9055b.m29112c(activityModule.providesWalletInstallNavigator(fragmentNavigator));
    }

    @Override // javax.inject.Provider
    public WalletInstallNavigator get() {
        return providesWalletInstallNavigator(this.module, this.fragmentNavigatorProvider.get());
    }
}
