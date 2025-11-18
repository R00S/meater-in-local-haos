package cm.aptoide.p092pt.downloadmanager;

import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface FileDownloader {
    C11234e<FileDownloadCallback> observeFileDownloadProgress();

    C11231b pauseDownload();

    C11231b removeDownloadFile();

    C11231b startFileDownload();

    void stopFailedDownload();
}
