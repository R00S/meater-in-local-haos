package cm.aptoide.p092pt;

import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.downloadmanager.AppDownloaderProvider;
import cm.aptoide.p092pt.downloadmanager.RetryFileDownloaderProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppDownloaderProviderFactory implements Provider {
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<RetryFileDownloaderProvider> fileDownloaderProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppDownloaderProviderFactory(ApplicationModule applicationModule, Provider<RetryFileDownloaderProvider> provider, Provider<DownloadAnalytics> provider2) {
        this.module = applicationModule;
        this.fileDownloaderProvider = provider;
        this.downloadAnalyticsProvider = provider2;
    }

    public static ApplicationModule_ProvidesAppDownloaderProviderFactory create(ApplicationModule applicationModule, Provider<RetryFileDownloaderProvider> provider, Provider<DownloadAnalytics> provider2) {
        return new ApplicationModule_ProvidesAppDownloaderProviderFactory(applicationModule, provider, provider2);
    }

    public static AppDownloaderProvider providesAppDownloaderProvider(ApplicationModule applicationModule, RetryFileDownloaderProvider retryFileDownloaderProvider, DownloadAnalytics downloadAnalytics) {
        return (AppDownloaderProvider) C9055b.m29112c(applicationModule.providesAppDownloaderProvider(retryFileDownloaderProvider, downloadAnalytics));
    }

    @Override // javax.inject.Provider
    public AppDownloaderProvider get() {
        return providesAppDownloaderProvider(this.module, this.fileDownloaderProvider.get(), this.downloadAnalyticsProvider.get());
    }
}
