package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.migration.AppcMigrationManager;
import cm.aptoide.p092pt.download.view.DownloadStatusManager;
import cm.aptoide.p092pt.install.InstallManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDownloadStatusManagerFactory implements Provider {
    private final Provider<AppcMigrationManager> appcMigrationManagerProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDownloadStatusManagerFactory(ApplicationModule applicationModule, Provider<InstallManager> provider, Provider<AppcMigrationManager> provider2) {
        this.module = applicationModule;
        this.installManagerProvider = provider;
        this.appcMigrationManagerProvider = provider2;
    }

    public static ApplicationModule_ProvidesDownloadStatusManagerFactory create(ApplicationModule applicationModule, Provider<InstallManager> provider, Provider<AppcMigrationManager> provider2) {
        return new ApplicationModule_ProvidesDownloadStatusManagerFactory(applicationModule, provider, provider2);
    }

    public static DownloadStatusManager providesDownloadStatusManager(ApplicationModule applicationModule, InstallManager installManager, AppcMigrationManager appcMigrationManager) {
        return (DownloadStatusManager) C9055b.m29112c(applicationModule.providesDownloadStatusManager(installManager, appcMigrationManager));
    }

    @Override // javax.inject.Provider
    public DownloadStatusManager get() {
        return providesDownloadStatusManager(this.module, this.installManagerProvider.get(), this.appcMigrationManagerProvider.get());
    }
}
