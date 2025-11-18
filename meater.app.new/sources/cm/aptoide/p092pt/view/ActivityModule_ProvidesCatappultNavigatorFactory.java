package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.CatappultNavigator;
import cm.aptoide.p092pt.navigator.ExternalNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesCatappultNavigatorFactory implements Provider {
    private final Provider<ExternalNavigator> externalNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesCatappultNavigatorFactory(ActivityModule activityModule, Provider<ExternalNavigator> provider) {
        this.module = activityModule;
        this.externalNavigatorProvider = provider;
    }

    public static ActivityModule_ProvidesCatappultNavigatorFactory create(ActivityModule activityModule, Provider<ExternalNavigator> provider) {
        return new ActivityModule_ProvidesCatappultNavigatorFactory(activityModule, provider);
    }

    public static CatappultNavigator providesCatappultNavigator(ActivityModule activityModule, ExternalNavigator externalNavigator) {
        return (CatappultNavigator) C9055b.m29112c(activityModule.providesCatappultNavigator(externalNavigator));
    }

    @Override // javax.inject.Provider
    public CatappultNavigator get() {
        return providesCatappultNavigator(this.module, this.externalNavigatorProvider.get());
    }
}
