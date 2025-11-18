package cm.aptoide.p092pt.account.view;

import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.magiclink.SendMagicLinkPresenter;
import cm.aptoide.p092pt.orientation.ScreenOrientationManager;
import cm.aptoide.p092pt.presenter.LoginSignupCredentialsFlavorPresenter;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Named;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class LoginSignUpCredentialsFragment_MembersInjector implements InterfaceC9053a<LoginSignUpCredentialsFragment> {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<ScreenOrientationManager> orientationManagerProvider;
    private final Provider<LoginSignupCredentialsFlavorPresenter> presenterProvider;
    private final Provider<SendMagicLinkPresenter> sendMagicLinkPresenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public LoginSignUpCredentialsFragment_MembersInjector(Provider<LoginSignupCredentialsFlavorPresenter> provider, Provider<SendMagicLinkPresenter> provider2, Provider<ScreenOrientationManager> provider3, Provider<AccountAnalytics> provider4, Provider<String> provider5, Provider<ThemeManager> provider6) {
        this.presenterProvider = provider;
        this.sendMagicLinkPresenterProvider = provider2;
        this.orientationManagerProvider = provider3;
        this.accountAnalyticsProvider = provider4;
        this.marketNameProvider = provider5;
        this.themeManagerProvider = provider6;
    }

    public static InterfaceC9053a<LoginSignUpCredentialsFragment> create(Provider<LoginSignupCredentialsFlavorPresenter> provider, Provider<SendMagicLinkPresenter> provider2, Provider<ScreenOrientationManager> provider3, Provider<AccountAnalytics> provider4, Provider<String> provider5, Provider<ThemeManager> provider6) {
        return new LoginSignUpCredentialsFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectAccountAnalytics(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment, AccountAnalytics accountAnalytics) {
        loginSignUpCredentialsFragment.accountAnalytics = accountAnalytics;
    }

    @Named
    public static void injectMarketName(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment, String str) {
        loginSignUpCredentialsFragment.marketName = str;
    }

    public static void injectOrientationManager(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment, ScreenOrientationManager screenOrientationManager) {
        loginSignUpCredentialsFragment.orientationManager = screenOrientationManager;
    }

    public static void injectPresenter(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment, LoginSignupCredentialsFlavorPresenter loginSignupCredentialsFlavorPresenter) {
        loginSignUpCredentialsFragment.presenter = loginSignupCredentialsFlavorPresenter;
    }

    public static void injectSendMagicLinkPresenter(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment, SendMagicLinkPresenter sendMagicLinkPresenter) {
        loginSignUpCredentialsFragment.sendMagicLinkPresenter = sendMagicLinkPresenter;
    }

    public static void injectThemeManager(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment, ThemeManager themeManager) {
        loginSignUpCredentialsFragment.themeManager = themeManager;
    }

    public void injectMembers(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment) {
        injectPresenter(loginSignUpCredentialsFragment, this.presenterProvider.get());
        injectSendMagicLinkPresenter(loginSignUpCredentialsFragment, this.sendMagicLinkPresenterProvider.get());
        injectOrientationManager(loginSignUpCredentialsFragment, this.orientationManagerProvider.get());
        injectAccountAnalytics(loginSignUpCredentialsFragment, this.accountAnalyticsProvider.get());
        injectMarketName(loginSignUpCredentialsFragment, this.marketNameProvider.get());
        injectThemeManager(loginSignUpCredentialsFragment, this.themeManagerProvider.get());
    }
}
