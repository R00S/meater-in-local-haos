package cm.aptoide.p092pt.view;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.UriToPathResolver;
import cm.aptoide.p092pt.account.view.store.ManageStoreErrorMapper;
import cm.aptoide.p092pt.account.view.store.ManageStoreNavigator;
import cm.aptoide.p092pt.account.view.store.ManageStorePresenter;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideManageStorePresenterFactory implements Provider {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<ManageStoreErrorMapper> manageStoreErrorMapperProvider;
    private final Provider<ManageStoreNavigator> manageStoreNavigatorProvider;
    private final FragmentModule module;
    private final Provider<UriToPathResolver> uriToPathResolverProvider;

    public FragmentModule_ProvideManageStorePresenterFactory(FragmentModule fragmentModule, Provider<UriToPathResolver> provider, Provider<ManageStoreNavigator> provider2, Provider<ManageStoreErrorMapper> provider3, Provider<AptoideAccountManager> provider4, Provider<AccountAnalytics> provider5) {
        this.module = fragmentModule;
        this.uriToPathResolverProvider = provider;
        this.manageStoreNavigatorProvider = provider2;
        this.manageStoreErrorMapperProvider = provider3;
        this.accountManagerProvider = provider4;
        this.accountAnalyticsProvider = provider5;
    }

    public static FragmentModule_ProvideManageStorePresenterFactory create(FragmentModule fragmentModule, Provider<UriToPathResolver> provider, Provider<ManageStoreNavigator> provider2, Provider<ManageStoreErrorMapper> provider3, Provider<AptoideAccountManager> provider4, Provider<AccountAnalytics> provider5) {
        return new FragmentModule_ProvideManageStorePresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ManageStorePresenter provideManageStorePresenter(FragmentModule fragmentModule, UriToPathResolver uriToPathResolver, ManageStoreNavigator manageStoreNavigator, ManageStoreErrorMapper manageStoreErrorMapper, AptoideAccountManager aptoideAccountManager, AccountAnalytics accountAnalytics) {
        return (ManageStorePresenter) C9055b.m29112c(fragmentModule.provideManageStorePresenter(uriToPathResolver, manageStoreNavigator, manageStoreErrorMapper, aptoideAccountManager, accountAnalytics));
    }

    @Override // javax.inject.Provider
    public ManageStorePresenter get() {
        return provideManageStorePresenter(this.module, this.uriToPathResolverProvider.get(), this.manageStoreNavigatorProvider.get(), this.manageStoreErrorMapperProvider.get(), this.accountManagerProvider.get(), this.accountAnalyticsProvider.get());
    }
}
