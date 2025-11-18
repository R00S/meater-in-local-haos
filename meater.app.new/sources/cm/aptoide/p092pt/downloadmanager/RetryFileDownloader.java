package cm.aptoide.p092pt.downloadmanager;

import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface RetryFileDownloader {
    C11234e<FileDownloadCallback> observeFileDownloadProgress();

    C11231b pauseDownload();

    C11231b removeDownloadFile();

    void startFileDownload();

    void stop();

    void stopFailedDownload();
}
