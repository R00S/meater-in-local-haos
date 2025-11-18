package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.user.ManageUserNavigator;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideManageUserNavigatorFactory implements Provider {
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvideManageUserNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationNavigator> provider2) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.bottomNavigationNavigatorProvider = provider2;
    }

    public static ActivityModule_ProvideManageUserNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationNavigator> provider2) {
        return new ActivityModule_ProvideManageUserNavigatorFactory(activityModule, provider, provider2);
    }

    public static ManageUserNavigator provideManageUserNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator) {
        return (ManageUserNavigator) C9055b.m29112c(activityModule.provideManageUserNavigator(fragmentNavigator, bottomNavigationNavigator));
    }

    @Override // javax.inject.Provider
    public ManageUserNavigator get() {
        return provideManageUserNavigator(this.module, this.fragmentNavigatorProvider.get(), this.bottomNavigationNavigatorProvider.get());
    }
}
