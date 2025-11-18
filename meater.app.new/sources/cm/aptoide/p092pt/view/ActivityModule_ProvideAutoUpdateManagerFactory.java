package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.autoupdate.AutoUpdateManager;
import cm.aptoide.p092pt.autoupdate.AutoUpdateRepository;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.install.InstallManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideAutoUpdateManagerFactory implements Provider {
    private final Provider<AutoUpdateRepository> autoUpdateRepositoryProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<Integer> localVersionCodeProvider;
    private final ActivityModule module;
    private final Provider<PermissionManager> permissionManagerProvider;

    public ActivityModule_ProvideAutoUpdateManagerFactory(ActivityModule activityModule, Provider<DownloadFactory> provider, Provider<PermissionManager> provider2, Provider<InstallManager> provider3, Provider<DownloadAnalytics> provider4, Provider<Integer> provider5, Provider<AutoUpdateRepository> provider6) {
        this.module = activityModule;
        this.downloadFactoryProvider = provider;
        this.permissionManagerProvider = provider2;
        this.installManagerProvider = provider3;
        this.downloadAnalyticsProvider = provider4;
        this.localVersionCodeProvider = provider5;
        this.autoUpdateRepositoryProvider = provider6;
    }

    public static ActivityModule_ProvideAutoUpdateManagerFactory create(ActivityModule activityModule, Provider<DownloadFactory> provider, Provider<PermissionManager> provider2, Provider<InstallManager> provider3, Provider<DownloadAnalytics> provider4, Provider<Integer> provider5, Provider<AutoUpdateRepository> provider6) {
        return new ActivityModule_ProvideAutoUpdateManagerFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static AutoUpdateManager provideAutoUpdateManager(ActivityModule activityModule, DownloadFactory downloadFactory, PermissionManager permissionManager, InstallManager installManager, DownloadAnalytics downloadAnalytics, int i2, AutoUpdateRepository autoUpdateRepository) {
        return (AutoUpdateManager) C9055b.m29112c(activityModule.provideAutoUpdateManager(downloadFactory, permissionManager, installManager, downloadAnalytics, i2, autoUpdateRepository));
    }

    @Override // javax.inject.Provider
    public AutoUpdateManager get() {
        return provideAutoUpdateManager(this.module, this.downloadFactoryProvider.get(), this.permissionManagerProvider.get(), this.installManagerProvider.get(), this.downloadAnalyticsProvider.get(), this.localVersionCodeProvider.get().intValue(), this.autoUpdateRepositoryProvider.get());
    }
}
