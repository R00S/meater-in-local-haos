package cm.aptoide.p092pt.view;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.app.AppViewAnalytics;
import cm.aptoide.p092pt.app.AppViewManager;
import cm.aptoide.p092pt.app.CampaignAnalytics;
import cm.aptoide.p092pt.app.view.AppViewNavigator;
import cm.aptoide.p092pt.app.view.AppViewPresenter;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.promotions.PromotionsNavigator;
import cm.aptoide.p092pt.wallet.WalletAppProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesAppViewPresenterFactory implements Provider {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AppViewAnalytics> analyticsProvider;
    private final Provider<AppViewManager> appViewManagerProvider;
    private final Provider<AppViewNavigator> appViewNavigatorProvider;
    private final Provider<CampaignAnalytics> campaignAnalyticsProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final FragmentModule module;
    private final Provider<PromotionsNavigator> promotionsNavigatorProvider;
    private final Provider<WalletAppProvider> walletAppProvider;

    public FragmentModule_ProvidesAppViewPresenterFactory(FragmentModule fragmentModule, Provider<AccountNavigator> provider, Provider<AppViewAnalytics> provider2, Provider<CampaignAnalytics> provider3, Provider<AppViewNavigator> provider4, Provider<AppViewManager> provider5, Provider<AptoideAccountManager> provider6, Provider<CrashReport> provider7, Provider<PromotionsNavigator> provider8, Provider<WalletAppProvider> provider9) {
        this.module = fragmentModule;
        this.accountNavigatorProvider = provider;
        this.analyticsProvider = provider2;
        this.campaignAnalyticsProvider = provider3;
        this.appViewNavigatorProvider = provider4;
        this.appViewManagerProvider = provider5;
        this.accountManagerProvider = provider6;
        this.crashReportProvider = provider7;
        this.promotionsNavigatorProvider = provider8;
        this.walletAppProvider = provider9;
    }

    public static FragmentModule_ProvidesAppViewPresenterFactory create(FragmentModule fragmentModule, Provider<AccountNavigator> provider, Provider<AppViewAnalytics> provider2, Provider<CampaignAnalytics> provider3, Provider<AppViewNavigator> provider4, Provider<AppViewManager> provider5, Provider<AptoideAccountManager> provider6, Provider<CrashReport> provider7, Provider<PromotionsNavigator> provider8, Provider<WalletAppProvider> provider9) {
        return new FragmentModule_ProvidesAppViewPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static AppViewPresenter providesAppViewPresenter(FragmentModule fragmentModule, AccountNavigator accountNavigator, AppViewAnalytics appViewAnalytics, CampaignAnalytics campaignAnalytics, AppViewNavigator appViewNavigator, AppViewManager appViewManager, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, PromotionsNavigator promotionsNavigator, WalletAppProvider walletAppProvider) {
        return (AppViewPresenter) C9055b.m29112c(fragmentModule.providesAppViewPresenter(accountNavigator, appViewAnalytics, campaignAnalytics, appViewNavigator, appViewManager, aptoideAccountManager, crashReport, promotionsNavigator, walletAppProvider));
    }

    @Override // javax.inject.Provider
    public AppViewPresenter get() {
        return providesAppViewPresenter(this.module, this.accountNavigatorProvider.get(), this.analyticsProvider.get(), this.campaignAnalyticsProvider.get(), this.appViewNavigatorProvider.get(), this.appViewManagerProvider.get(), this.accountManagerProvider.get(), this.crashReportProvider.get(), this.promotionsNavigatorProvider.get(), this.walletAppProvider.get());
    }
}
