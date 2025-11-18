package cm.aptoide.p092pt.view;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountErrorMapper;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.account.view.LoginSignUpCredentialsConfiguration;
import cm.aptoide.p092pt.presenter.LoginSignupCredentialsFlavorPresenter;
import java.util.List;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideLoginSignUpPresenterFactory implements Provider {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AccountErrorMapper> errorMapperProvider;
    private final Provider<List<String>> facebookPermissionsProvider;
    private final Provider<LoginSignUpCredentialsConfiguration> loginSignUpCredentialsConfigurationProvider;
    private final FragmentModule module;

    public FragmentModule_ProvideLoginSignUpPresenterFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<AccountNavigator> provider2, Provider<AccountErrorMapper> provider3, Provider<AccountAnalytics> provider4, Provider<List<String>> provider5, Provider<LoginSignUpCredentialsConfiguration> provider6) {
        this.module = fragmentModule;
        this.accountManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.errorMapperProvider = provider3;
        this.accountAnalyticsProvider = provider4;
        this.facebookPermissionsProvider = provider5;
        this.loginSignUpCredentialsConfigurationProvider = provider6;
    }

    public static FragmentModule_ProvideLoginSignUpPresenterFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<AccountNavigator> provider2, Provider<AccountErrorMapper> provider3, Provider<AccountAnalytics> provider4, Provider<List<String>> provider5, Provider<LoginSignUpCredentialsConfiguration> provider6) {
        return new FragmentModule_ProvideLoginSignUpPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static LoginSignupCredentialsFlavorPresenter provideLoginSignUpPresenter(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, AccountErrorMapper accountErrorMapper, AccountAnalytics accountAnalytics, List<String> list, LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration) {
        return (LoginSignupCredentialsFlavorPresenter) C9055b.m29112c(fragmentModule.provideLoginSignUpPresenter(aptoideAccountManager, accountNavigator, accountErrorMapper, accountAnalytics, list, loginSignUpCredentialsConfiguration));
    }

    @Override // javax.inject.Provider
    public LoginSignupCredentialsFlavorPresenter get() {
        return provideLoginSignUpPresenter(this.module, this.accountManagerProvider.get(), this.accountNavigatorProvider.get(), this.errorMapperProvider.get(), this.accountAnalyticsProvider.get(), this.facebookPermissionsProvider.get(), this.loginSignUpCredentialsConfigurationProvider.get());
    }
}
