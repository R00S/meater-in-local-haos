package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.navigator.ExternalNavigator;
import cm.aptoide.p092pt.socialmedia.SocialMediaNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesSocialMediaNavigatorFactory implements Provider {
    private final Provider<ExternalNavigator> externalNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesSocialMediaNavigatorFactory(ActivityModule activityModule, Provider<ExternalNavigator> provider) {
        this.module = activityModule;
        this.externalNavigatorProvider = provider;
    }

    public static ActivityModule_ProvidesSocialMediaNavigatorFactory create(ActivityModule activityModule, Provider<ExternalNavigator> provider) {
        return new ActivityModule_ProvidesSocialMediaNavigatorFactory(activityModule, provider);
    }

    public static SocialMediaNavigator providesSocialMediaNavigator(ActivityModule activityModule, ExternalNavigator externalNavigator) {
        return (SocialMediaNavigator) C9055b.m29112c(activityModule.providesSocialMediaNavigator(externalNavigator));
    }

    @Override // javax.inject.Provider
    public SocialMediaNavigator get() {
        return providesSocialMediaNavigator(this.module, this.externalNavigatorProvider.get());
    }
}
