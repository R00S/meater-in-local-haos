package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallManager;
import cm.aptoide.p092pt.downloadmanager.AptoideDownloadManager;
import cm.aptoide.p092pt.downloadmanager.DownloadsRepository;
import cm.aptoide.p092pt.file.FileManager;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.ForegroundManager;
import cm.aptoide.p092pt.install.InstallAppSizeValidator;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.install.Installer;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesInstallManagerFactory implements Provider {
    private final Provider<AptoideDownloadManager> aptoideDownloadManagerProvider;
    private final Provider<AptoideInstallManager> aptoideInstallManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<Installer> defaultInstallerProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final Provider<DownloadsRepository> downloadsRepositoryProvider;
    private final Provider<FileManager> fileManagerProvider;
    private final Provider<ForegroundManager> foregroundManagerProvider;
    private final Provider<InstallAppSizeValidator> installAppSizeValidatorProvider;
    private final ApplicationModule module;
    private final Provider<RootAvailabilityManager> rootAvailabilityManagerProvider;
    private final Provider<SharedPreferences> secureSharedPreferencesProvider;

    public ApplicationModule_ProvidesInstallManagerFactory(ApplicationModule applicationModule, Provider<AptoideDownloadManager> provider, Provider<Installer> provider2, Provider<RootAvailabilityManager> provider3, Provider<SharedPreferences> provider4, Provider<SharedPreferences> provider5, Provider<DownloadsRepository> provider6, Provider<AptoideInstalledAppsRepository> provider7, Provider<ForegroundManager> provider8, Provider<AptoideInstallManager> provider9, Provider<InstallAppSizeValidator> provider10, Provider<FileManager> provider11) {
        this.module = applicationModule;
        this.aptoideDownloadManagerProvider = provider;
        this.defaultInstallerProvider = provider2;
        this.rootAvailabilityManagerProvider = provider3;
        this.defaultSharedPreferencesProvider = provider4;
        this.secureSharedPreferencesProvider = provider5;
        this.downloadsRepositoryProvider = provider6;
        this.aptoideInstalledAppsRepositoryProvider = provider7;
        this.foregroundManagerProvider = provider8;
        this.aptoideInstallManagerProvider = provider9;
        this.installAppSizeValidatorProvider = provider10;
        this.fileManagerProvider = provider11;
    }

    public static ApplicationModule_ProvidesInstallManagerFactory create(ApplicationModule applicationModule, Provider<AptoideDownloadManager> provider, Provider<Installer> provider2, Provider<RootAvailabilityManager> provider3, Provider<SharedPreferences> provider4, Provider<SharedPreferences> provider5, Provider<DownloadsRepository> provider6, Provider<AptoideInstalledAppsRepository> provider7, Provider<ForegroundManager> provider8, Provider<AptoideInstallManager> provider9, Provider<InstallAppSizeValidator> provider10, Provider<FileManager> provider11) {
        return new ApplicationModule_ProvidesInstallManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static InstallManager providesInstallManager(ApplicationModule applicationModule, AptoideDownloadManager aptoideDownloadManager, Installer installer, RootAvailabilityManager rootAvailabilityManager, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, DownloadsRepository downloadsRepository, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, ForegroundManager foregroundManager, AptoideInstallManager aptoideInstallManager, InstallAppSizeValidator installAppSizeValidator, FileManager fileManager) {
        return (InstallManager) C9055b.m29112c(applicationModule.providesInstallManager(aptoideDownloadManager, installer, rootAvailabilityManager, sharedPreferences, sharedPreferences2, downloadsRepository, aptoideInstalledAppsRepository, foregroundManager, aptoideInstallManager, installAppSizeValidator, fileManager));
    }

    @Override // javax.inject.Provider
    public InstallManager get() {
        return providesInstallManager(this.module, this.aptoideDownloadManagerProvider.get(), this.defaultInstallerProvider.get(), this.rootAvailabilityManagerProvider.get(), this.defaultSharedPreferencesProvider.get(), this.secureSharedPreferencesProvider.get(), this.downloadsRepositoryProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get(), this.foregroundManagerProvider.get(), this.aptoideInstallManagerProvider.get(), this.installAppSizeValidatorProvider.get(), this.fileManagerProvider.get());
    }
}
