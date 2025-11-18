package cm.aptoide.p092pt.view;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.AgentPersistence;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.apkfy.ApkFyParser;
import cm.aptoide.p092pt.autoupdate.AutoUpdateManager;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.p092pt.home.apps.UpdatesManager;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.install.installer.RootInstallationRetryHandler;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideMainPresenterFactory implements Provider {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AgentPersistence> agentPersistenceProvider;
    private final Provider<ApkFyParser> apkFyParserProvider;
    private final Provider<AutoUpdateManager> autoUpdateManagerProvider;
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<DeepLinkManager> deepLinkManagerProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final ActivityModule module;
    private final Provider<RootAvailabilityManager> rootAvailabilityManagerProvider;
    private final Provider<RootInstallationRetryHandler> rootInstallationRetryHandlerProvider;
    private final Provider<SharedPreferences> secureSharedPreferencesProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<UpdatesManager> updatesManagerProvider;

    public ActivityModule_ProvideMainPresenterFactory(ActivityModule activityModule, Provider<RootInstallationRetryHandler> provider, Provider<ApkFyParser> provider2, Provider<InstallManager> provider3, Provider<SharedPreferences> provider4, Provider<SharedPreferences> provider5, Provider<FragmentNavigator> provider6, Provider<DeepLinkManager> provider7, Provider<BottomNavigationNavigator> provider8, Provider<UpdatesManager> provider9, Provider<AutoUpdateManager> provider10, Provider<RootAvailabilityManager> provider11, Provider<BottomNavigationMapper> provider12, Provider<AptoideAccountManager> provider13, Provider<AccountNavigator> provider14, Provider<AgentPersistence> provider15) {
        this.module = activityModule;
        this.rootInstallationRetryHandlerProvider = provider;
        this.apkFyParserProvider = provider2;
        this.installManagerProvider = provider3;
        this.sharedPreferencesProvider = provider4;
        this.secureSharedPreferencesProvider = provider5;
        this.fragmentNavigatorProvider = provider6;
        this.deepLinkManagerProvider = provider7;
        this.bottomNavigationNavigatorProvider = provider8;
        this.updatesManagerProvider = provider9;
        this.autoUpdateManagerProvider = provider10;
        this.rootAvailabilityManagerProvider = provider11;
        this.bottomNavigationMapperProvider = provider12;
        this.accountManagerProvider = provider13;
        this.accountNavigatorProvider = provider14;
        this.agentPersistenceProvider = provider15;
    }

    public static ActivityModule_ProvideMainPresenterFactory create(ActivityModule activityModule, Provider<RootInstallationRetryHandler> provider, Provider<ApkFyParser> provider2, Provider<InstallManager> provider3, Provider<SharedPreferences> provider4, Provider<SharedPreferences> provider5, Provider<FragmentNavigator> provider6, Provider<DeepLinkManager> provider7, Provider<BottomNavigationNavigator> provider8, Provider<UpdatesManager> provider9, Provider<AutoUpdateManager> provider10, Provider<RootAvailabilityManager> provider11, Provider<BottomNavigationMapper> provider12, Provider<AptoideAccountManager> provider13, Provider<AccountNavigator> provider14, Provider<AgentPersistence> provider15) {
        return new ActivityModule_ProvideMainPresenterFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static Presenter provideMainPresenter(ActivityModule activityModule, RootInstallationRetryHandler rootInstallationRetryHandler, ApkFyParser apkFyParser, InstallManager installManager, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, FragmentNavigator fragmentNavigator, DeepLinkManager deepLinkManager, BottomNavigationNavigator bottomNavigationNavigator, UpdatesManager updatesManager, AutoUpdateManager autoUpdateManager, RootAvailabilityManager rootAvailabilityManager, BottomNavigationMapper bottomNavigationMapper, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, AgentPersistence agentPersistence) {
        return (Presenter) C9055b.m29112c(activityModule.provideMainPresenter(rootInstallationRetryHandler, apkFyParser, installManager, sharedPreferences, sharedPreferences2, fragmentNavigator, deepLinkManager, bottomNavigationNavigator, updatesManager, autoUpdateManager, rootAvailabilityManager, bottomNavigationMapper, aptoideAccountManager, accountNavigator, agentPersistence));
    }

    @Override // javax.inject.Provider
    public Presenter get() {
        return provideMainPresenter(this.module, this.rootInstallationRetryHandlerProvider.get(), this.apkFyParserProvider.get(), this.installManagerProvider.get(), this.sharedPreferencesProvider.get(), this.secureSharedPreferencesProvider.get(), this.fragmentNavigatorProvider.get(), this.deepLinkManagerProvider.get(), this.bottomNavigationNavigatorProvider.get(), this.updatesManagerProvider.get(), this.autoUpdateManagerProvider.get(), this.rootAvailabilityManagerProvider.get(), this.bottomNavigationMapperProvider.get(), this.accountManagerProvider.get(), this.accountNavigatorProvider.get(), this.agentPersistenceProvider.get());
    }
}
