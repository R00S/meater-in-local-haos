package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesAppNavigatorFactory implements Provider {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesAppNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
    }

    public static ActivityModule_ProvidesAppNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider) {
        return new ActivityModule_ProvidesAppNavigatorFactory(activityModule, provider);
    }

    public static AppNavigator providesAppNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator) {
        return (AppNavigator) C9055b.m29112c(activityModule.providesAppNavigator(fragmentNavigator));
    }

    @Override // javax.inject.Provider
    public AppNavigator get() {
        return providesAppNavigator(this.module, this.fragmentNavigatorProvider.get());
    }
}
