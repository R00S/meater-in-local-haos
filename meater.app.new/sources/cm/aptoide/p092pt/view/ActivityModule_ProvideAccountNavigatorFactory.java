package cm.aptoide.p092pt.view;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.themes.ThemeManager;
import com.facebook.InterfaceC5958y;
import com.google.android.gms.common.api.GoogleApiClient;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideAccountNavigatorFactory implements Provider {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<InterfaceC5958y> callbackManagerProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final Provider<GoogleApiClient> googleApiClientProvider;
    private final ActivityModule module;
    private final Provider<ThemeManager> themeManagerProvider;

    public ActivityModule_ProvideAccountNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AptoideAccountManager> provider2, Provider<InterfaceC5958y> provider3, Provider<GoogleApiClient> provider4, Provider<AccountAnalytics> provider5, Provider<BottomNavigationNavigator> provider6, Provider<ThemeManager> provider7) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.accountManagerProvider = provider2;
        this.callbackManagerProvider = provider3;
        this.googleApiClientProvider = provider4;
        this.accountAnalyticsProvider = provider5;
        this.bottomNavigationNavigatorProvider = provider6;
        this.themeManagerProvider = provider7;
    }

    public static ActivityModule_ProvideAccountNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AptoideAccountManager> provider2, Provider<InterfaceC5958y> provider3, Provider<GoogleApiClient> provider4, Provider<AccountAnalytics> provider5, Provider<BottomNavigationNavigator> provider6, Provider<ThemeManager> provider7) {
        return new ActivityModule_ProvideAccountNavigatorFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static AccountNavigator provideAccountNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AptoideAccountManager aptoideAccountManager, InterfaceC5958y interfaceC5958y, GoogleApiClient googleApiClient, AccountAnalytics accountAnalytics, BottomNavigationNavigator bottomNavigationNavigator, ThemeManager themeManager) {
        return (AccountNavigator) C9055b.m29112c(activityModule.provideAccountNavigator(fragmentNavigator, aptoideAccountManager, interfaceC5958y, googleApiClient, accountAnalytics, bottomNavigationNavigator, themeManager));
    }

    @Override // javax.inject.Provider
    public AccountNavigator get() {
        return provideAccountNavigator(this.module, this.fragmentNavigatorProvider.get(), this.accountManagerProvider.get(), this.callbackManagerProvider.get(), this.googleApiClientProvider.get(), this.accountAnalyticsProvider.get(), this.bottomNavigationNavigatorProvider.get(), this.themeManagerProvider.get());
    }
}
