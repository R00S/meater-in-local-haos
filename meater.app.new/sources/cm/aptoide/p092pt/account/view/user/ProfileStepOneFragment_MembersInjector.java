package cm.aptoide.p092pt.account.view.user;

import cm.aptoide.p092pt.LoginSignupManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.orientation.ScreenOrientationManager;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class ProfileStepOneFragment_MembersInjector implements InterfaceC9053a<ProfileStepOneFragment> {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<LoginSignupManager> loginSignupManagerProvider;
    private final Provider<ScreenOrientationManager> orientationManagerProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ProfileStepOneFragment_MembersInjector(Provider<ScreenOrientationManager> provider, Provider<AccountNavigator> provider2, Provider<AccountAnalytics> provider3, Provider<LoginSignupManager> provider4, Provider<ThemeManager> provider5) {
        this.orientationManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.accountAnalyticsProvider = provider3;
        this.loginSignupManagerProvider = provider4;
        this.themeManagerProvider = provider5;
    }

    public static InterfaceC9053a<ProfileStepOneFragment> create(Provider<ScreenOrientationManager> provider, Provider<AccountNavigator> provider2, Provider<AccountAnalytics> provider3, Provider<LoginSignupManager> provider4, Provider<ThemeManager> provider5) {
        return new ProfileStepOneFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectAccountAnalytics(ProfileStepOneFragment profileStepOneFragment, AccountAnalytics accountAnalytics) {
        profileStepOneFragment.accountAnalytics = accountAnalytics;
    }

    public static void injectAccountNavigator(ProfileStepOneFragment profileStepOneFragment, AccountNavigator accountNavigator) {
        profileStepOneFragment.accountNavigator = accountNavigator;
    }

    public static void injectLoginSignupManager(ProfileStepOneFragment profileStepOneFragment, LoginSignupManager loginSignupManager) {
        profileStepOneFragment.loginSignupManager = loginSignupManager;
    }

    public static void injectOrientationManager(ProfileStepOneFragment profileStepOneFragment, ScreenOrientationManager screenOrientationManager) {
        profileStepOneFragment.orientationManager = screenOrientationManager;
    }

    public static void injectThemeManager(ProfileStepOneFragment profileStepOneFragment, ThemeManager themeManager) {
        profileStepOneFragment.themeManager = themeManager;
    }

    public void injectMembers(ProfileStepOneFragment profileStepOneFragment) {
        injectOrientationManager(profileStepOneFragment, this.orientationManagerProvider.get());
        injectAccountNavigator(profileStepOneFragment, this.accountNavigatorProvider.get());
        injectAccountAnalytics(profileStepOneFragment, this.accountAnalyticsProvider.get());
        injectLoginSignupManager(profileStepOneFragment, this.loginSignupManagerProvider.get());
        injectThemeManager(profileStepOneFragment, this.themeManagerProvider.get());
    }
}
