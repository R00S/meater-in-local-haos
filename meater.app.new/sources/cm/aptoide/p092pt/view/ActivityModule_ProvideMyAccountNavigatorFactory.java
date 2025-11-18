package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.socialmedia.SocialMediaNavigator;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.settings.MyAccountNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideMyAccountNavigatorFactory implements Provider {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;
    private final Provider<SocialMediaNavigator> socialMediaNavigatorProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ActivityModule_ProvideMyAccountNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AccountNavigator> provider2, Provider<AppNavigator> provider3, Provider<ThemeManager> provider4, Provider<SocialMediaNavigator> provider5) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.appNavigatorProvider = provider3;
        this.themeManagerProvider = provider4;
        this.socialMediaNavigatorProvider = provider5;
    }

    public static ActivityModule_ProvideMyAccountNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AccountNavigator> provider2, Provider<AppNavigator> provider3, Provider<ThemeManager> provider4, Provider<SocialMediaNavigator> provider5) {
        return new ActivityModule_ProvideMyAccountNavigatorFactory(activityModule, provider, provider2, provider3, provider4, provider5);
    }

    public static MyAccountNavigator provideMyAccountNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AccountNavigator accountNavigator, AppNavigator appNavigator, ThemeManager themeManager, SocialMediaNavigator socialMediaNavigator) {
        return (MyAccountNavigator) C9055b.m29112c(activityModule.provideMyAccountNavigator(fragmentNavigator, accountNavigator, appNavigator, themeManager, socialMediaNavigator));
    }

    @Override // javax.inject.Provider
    public MyAccountNavigator get() {
        return provideMyAccountNavigator(this.module, this.fragmentNavigatorProvider.get(), this.accountNavigatorProvider.get(), this.appNavigatorProvider.get(), this.themeManagerProvider.get(), this.socialMediaNavigatorProvider.get());
    }
}
