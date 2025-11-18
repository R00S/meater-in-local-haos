package cm.aptoide.p092pt;

import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.downloadmanager.AppDownloaderProvider;
import cm.aptoide.p092pt.downloadmanager.AptoideDownloadManager;
import cm.aptoide.p092pt.downloadmanager.DownloadAppMapper;
import cm.aptoide.p092pt.downloadmanager.DownloadStatusMapper;
import cm.aptoide.p092pt.downloadmanager.DownloadsRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAptoideDownloadManagerFactory implements Provider {
    private final Provider<String> apkPathProvider;
    private final Provider<AppDownloaderProvider> appDownloaderProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<DownloadAppMapper> downloadAppMapperProvider;
    private final Provider<DownloadStatusMapper> downloadStatusMapperProvider;
    private final Provider<DownloadsRepository> downloadsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<String> obbPathProvider;

    public ApplicationModule_ProvideAptoideDownloadManagerFactory(ApplicationModule applicationModule, Provider<DownloadsRepository> provider, Provider<DownloadStatusMapper> provider2, Provider<DownloadAppMapper> provider3, Provider<AppDownloaderProvider> provider4, Provider<String> provider5, Provider<String> provider6, Provider<DownloadAnalytics> provider7) {
        this.module = applicationModule;
        this.downloadsRepositoryProvider = provider;
        this.downloadStatusMapperProvider = provider2;
        this.downloadAppMapperProvider = provider3;
        this.appDownloaderProvider = provider4;
        this.apkPathProvider = provider5;
        this.obbPathProvider = provider6;
        this.downloadAnalyticsProvider = provider7;
    }

    public static ApplicationModule_ProvideAptoideDownloadManagerFactory create(ApplicationModule applicationModule, Provider<DownloadsRepository> provider, Provider<DownloadStatusMapper> provider2, Provider<DownloadAppMapper> provider3, Provider<AppDownloaderProvider> provider4, Provider<String> provider5, Provider<String> provider6, Provider<DownloadAnalytics> provider7) {
        return new ApplicationModule_ProvideAptoideDownloadManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static AptoideDownloadManager provideAptoideDownloadManager(ApplicationModule applicationModule, DownloadsRepository downloadsRepository, DownloadStatusMapper downloadStatusMapper, DownloadAppMapper downloadAppMapper, AppDownloaderProvider appDownloaderProvider, String str, String str2, DownloadAnalytics downloadAnalytics) {
        return (AptoideDownloadManager) C9055b.m29112c(applicationModule.provideAptoideDownloadManager(downloadsRepository, downloadStatusMapper, downloadAppMapper, appDownloaderProvider, str, str2, downloadAnalytics));
    }

    @Override // javax.inject.Provider
    public AptoideDownloadManager get() {
        return provideAptoideDownloadManager(this.module, this.downloadsRepositoryProvider.get(), this.downloadStatusMapperProvider.get(), this.downloadAppMapperProvider.get(), this.appDownloaderProvider.get(), this.apkPathProvider.get(), this.obbPathProvider.get(), this.downloadAnalyticsProvider.get());
    }
}
