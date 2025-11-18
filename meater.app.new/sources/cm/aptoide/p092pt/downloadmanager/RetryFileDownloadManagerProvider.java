package cm.aptoide.p092pt.downloadmanager;

import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class RetryFileDownloadManagerProvider implements RetryFileDownloaderProvider {
    private FileDownloaderProvider fileDownloaderProvider;

    public RetryFileDownloadManagerProvider(FileDownloaderProvider fileDownloaderProvider) {
        this.fileDownloaderProvider = fileDownloaderProvider;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloaderProvider
    public RetryFileDownloader createRetryFileDownloader(String str, String str2, int i2, String str3, int i3, String str4, C11418b<FileDownloadCallback> c11418b, String str5, String str6) {
        return new RetryFileDownloadManager(str2, i2, str3, i3, str4, str, this.fileDownloaderProvider, str5, str6);
    }
}
