package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.downloadmanager.AppDownloadStatus;

/* loaded from: classes.dex */
public interface FileDownloadCallback {
    FileDownloadProgressResult getDownloadProgress();

    int getDownloadSpeed();

    AppDownloadStatus.AppDownloadState getDownloadState();

    DownloadError getError();

    int getFileType();

    String getMd5();

    boolean hasError();
}
