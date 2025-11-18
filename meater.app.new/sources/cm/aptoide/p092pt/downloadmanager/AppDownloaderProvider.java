package cm.aptoide.p092pt.downloadmanager;

import java.util.HashMap;

/* loaded from: classes.dex */
public class AppDownloaderProvider {
    private final DownloadAnalytics downloadAnalytics;
    private final RetryFileDownloaderProvider fileDownloaderProvider;

    public AppDownloaderProvider(RetryFileDownloaderProvider retryFileDownloaderProvider, DownloadAnalytics downloadAnalytics) {
        this.fileDownloaderProvider = retryFileDownloaderProvider;
        this.downloadAnalytics = downloadAnalytics;
    }

    public AppDownloader getAppDownloader(DownloadApp downloadApp) {
        return new AppDownloadManager(this.fileDownloaderProvider, downloadApp, new HashMap(), this.downloadAnalytics);
    }
}
