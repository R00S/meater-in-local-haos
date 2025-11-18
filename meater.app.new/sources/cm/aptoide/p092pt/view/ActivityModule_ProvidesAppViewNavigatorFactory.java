package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.CatappultNavigator;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.view.AppViewNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesAppViewNavigatorFactory implements Provider {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<CatappultNavigator> catappultNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesAppViewNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2, Provider<CatappultNavigator> provider3) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.appNavigatorProvider = provider2;
        this.catappultNavigatorProvider = provider3;
    }

    public static ActivityModule_ProvidesAppViewNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2, Provider<CatappultNavigator> provider3) {
        return new ActivityModule_ProvidesAppViewNavigatorFactory(activityModule, provider, provider2, provider3);
    }

    public static AppViewNavigator providesAppViewNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AppNavigator appNavigator, CatappultNavigator catappultNavigator) {
        return (AppViewNavigator) C9055b.m29112c(activityModule.providesAppViewNavigator(fragmentNavigator, appNavigator, catappultNavigator));
    }

    @Override // javax.inject.Provider
    public AppViewNavigator get() {
        return providesAppViewNavigator(this.module, this.fragmentNavigatorProvider.get(), this.appNavigatorProvider.get(), this.catappultNavigatorProvider.get());
    }
}
