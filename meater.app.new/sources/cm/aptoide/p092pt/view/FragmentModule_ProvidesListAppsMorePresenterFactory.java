package cm.aptoide.p092pt.view;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.home.more.apps.ListAppsConfiguration;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreManager;
import cm.aptoide.p092pt.home.more.apps.ListAppsMorePresenter;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesListAppsMorePresenterFactory implements Provider {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<ListAppsConfiguration> listAppsConfigurationProvider;
    private final Provider<ListAppsMoreManager> listAppsMoreManagerProvider;
    private final FragmentModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public FragmentModule_ProvidesListAppsMorePresenterFactory(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<AppNavigator> provider2, Provider<SharedPreferences> provider3, Provider<ListAppsConfiguration> provider4, Provider<ListAppsMoreManager> provider5) {
        this.module = fragmentModule;
        this.crashReportProvider = provider;
        this.appNavigatorProvider = provider2;
        this.sharedPreferencesProvider = provider3;
        this.listAppsConfigurationProvider = provider4;
        this.listAppsMoreManagerProvider = provider5;
    }

    public static FragmentModule_ProvidesListAppsMorePresenterFactory create(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<AppNavigator> provider2, Provider<SharedPreferences> provider3, Provider<ListAppsConfiguration> provider4, Provider<ListAppsMoreManager> provider5) {
        return new FragmentModule_ProvidesListAppsMorePresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ListAppsMorePresenter providesListAppsMorePresenter(FragmentModule fragmentModule, CrashReport crashReport, AppNavigator appNavigator, SharedPreferences sharedPreferences, ListAppsConfiguration listAppsConfiguration, ListAppsMoreManager listAppsMoreManager) {
        return (ListAppsMorePresenter) C9055b.m29112c(fragmentModule.providesListAppsMorePresenter(crashReport, appNavigator, sharedPreferences, listAppsConfiguration, listAppsMoreManager));
    }

    @Override // javax.inject.Provider
    public ListAppsMorePresenter get() {
        return providesListAppsMorePresenter(this.module, this.crashReportProvider.get(), this.appNavigatorProvider.get(), this.sharedPreferencesProvider.get(), this.listAppsConfigurationProvider.get(), this.listAppsMoreManagerProvider.get());
    }
}
