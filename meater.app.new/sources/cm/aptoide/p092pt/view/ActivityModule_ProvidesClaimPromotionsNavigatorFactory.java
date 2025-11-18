package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.promotions.ClaimPromotionsNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesClaimPromotionsNavigatorFactory implements Provider {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesClaimPromotionsNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.appNavigatorProvider = provider2;
    }

    public static ActivityModule_ProvidesClaimPromotionsNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        return new ActivityModule_ProvidesClaimPromotionsNavigatorFactory(activityModule, provider, provider2);
    }

    public static ClaimPromotionsNavigator providesClaimPromotionsNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        return (ClaimPromotionsNavigator) C9055b.m29112c(activityModule.providesClaimPromotionsNavigator(fragmentNavigator, appNavigator));
    }

    @Override // javax.inject.Provider
    public ClaimPromotionsNavigator get() {
        return providesClaimPromotionsNavigator(this.module, this.fragmentNavigatorProvider.get(), this.appNavigatorProvider.get());
    }
}
