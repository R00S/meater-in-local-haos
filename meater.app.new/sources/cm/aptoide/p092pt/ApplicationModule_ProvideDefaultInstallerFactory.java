package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.install.AppInstallerStatusReceiver;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.Installer;
import cm.aptoide.p092pt.install.InstallerAnalytics;
import cm.aptoide.p092pt.install.RootInstallerProvider;
import cm.aptoide.p092pt.install.installer.InstallationProvider;
import cm.aptoide.p092pt.packageinstaller.AppInstaller;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideDefaultInstallerFactory implements Provider {
    private final Provider<AppInstaller> appInstallerProvider;
    private final Provider<AppInstallerStatusReceiver> appInstallerStatusReceiverProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<InstallationProvider> installationProvider;
    private final Provider<InstallerAnalytics> installerAnalyticsProvider;
    private final ApplicationModule module;
    private final Provider<RootAvailabilityManager> rootAvailabilityManagerProvider;
    private final Provider<RootInstallerProvider> rootInstallerProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvideDefaultInstallerFactory(ApplicationModule applicationModule, Provider<InstallationProvider> provider, Provider<SharedPreferences> provider2, Provider<AptoideInstalledAppsRepository> provider3, Provider<RootAvailabilityManager> provider4, Provider<InstallerAnalytics> provider5, Provider<AppInstaller> provider6, Provider<AppInstallerStatusReceiver> provider7, Provider<RootInstallerProvider> provider8) {
        this.module = applicationModule;
        this.installationProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.aptoideInstalledAppsRepositoryProvider = provider3;
        this.rootAvailabilityManagerProvider = provider4;
        this.installerAnalyticsProvider = provider5;
        this.appInstallerProvider = provider6;
        this.appInstallerStatusReceiverProvider = provider7;
        this.rootInstallerProvider = provider8;
    }

    public static ApplicationModule_ProvideDefaultInstallerFactory create(ApplicationModule applicationModule, Provider<InstallationProvider> provider, Provider<SharedPreferences> provider2, Provider<AptoideInstalledAppsRepository> provider3, Provider<RootAvailabilityManager> provider4, Provider<InstallerAnalytics> provider5, Provider<AppInstaller> provider6, Provider<AppInstallerStatusReceiver> provider7, Provider<RootInstallerProvider> provider8) {
        return new ApplicationModule_ProvideDefaultInstallerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static Installer provideDefaultInstaller(ApplicationModule applicationModule, InstallationProvider installationProvider, SharedPreferences sharedPreferences, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, RootAvailabilityManager rootAvailabilityManager, InstallerAnalytics installerAnalytics, AppInstaller appInstaller, AppInstallerStatusReceiver appInstallerStatusReceiver, RootInstallerProvider rootInstallerProvider) {
        return (Installer) C9055b.m29112c(applicationModule.provideDefaultInstaller(installationProvider, sharedPreferences, aptoideInstalledAppsRepository, rootAvailabilityManager, installerAnalytics, appInstaller, appInstallerStatusReceiver, rootInstallerProvider));
    }

    @Override // javax.inject.Provider
    public Installer get() {
        return provideDefaultInstaller(this.module, this.installationProvider.get(), this.sharedPreferencesProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get(), this.rootAvailabilityManagerProvider.get(), this.installerAnalyticsProvider.get(), this.appInstallerProvider.get(), this.appInstallerStatusReceiverProvider.get(), this.rootInstallerProvider.get());
    }
}
