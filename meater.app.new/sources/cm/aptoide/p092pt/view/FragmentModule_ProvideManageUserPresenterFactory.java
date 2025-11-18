package cm.aptoide.p092pt.view;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.UriToPathResolver;
import cm.aptoide.p092pt.account.view.user.CreateUserErrorMapper;
import cm.aptoide.p092pt.account.view.user.ManageUserNavigator;
import cm.aptoide.p092pt.account.view.user.ManageUserPresenter;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideManageUserPresenterFactory implements Provider {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<CreateUserErrorMapper> errorMapperProvider;
    private final Provider<ManageUserNavigator> manageUserNavigatorProvider;
    private final FragmentModule module;
    private final Provider<UriToPathResolver> uriToPathResolverProvider;

    public FragmentModule_ProvideManageUserPresenterFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<CreateUserErrorMapper> provider2, Provider<ManageUserNavigator> provider3, Provider<UriToPathResolver> provider4, Provider<AccountAnalytics> provider5) {
        this.module = fragmentModule;
        this.accountManagerProvider = provider;
        this.errorMapperProvider = provider2;
        this.manageUserNavigatorProvider = provider3;
        this.uriToPathResolverProvider = provider4;
        this.accountAnalyticsProvider = provider5;
    }

    public static FragmentModule_ProvideManageUserPresenterFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<CreateUserErrorMapper> provider2, Provider<ManageUserNavigator> provider3, Provider<UriToPathResolver> provider4, Provider<AccountAnalytics> provider5) {
        return new FragmentModule_ProvideManageUserPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ManageUserPresenter provideManageUserPresenter(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, CreateUserErrorMapper createUserErrorMapper, ManageUserNavigator manageUserNavigator, UriToPathResolver uriToPathResolver, AccountAnalytics accountAnalytics) {
        return (ManageUserPresenter) C9055b.m29112c(fragmentModule.provideManageUserPresenter(aptoideAccountManager, createUserErrorMapper, manageUserNavigator, uriToPathResolver, accountAnalytics));
    }

    @Override // javax.inject.Provider
    public ManageUserPresenter get() {
        return provideManageUserPresenter(this.module, this.accountManagerProvider.get(), this.errorMapperProvider.get(), this.manageUserNavigatorProvider.get(), this.uriToPathResolverProvider.get(), this.accountAnalyticsProvider.get());
    }
}
