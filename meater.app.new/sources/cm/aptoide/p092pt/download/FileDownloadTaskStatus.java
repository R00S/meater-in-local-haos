package cm.aptoide.p092pt.download;

import cm.aptoide.p092pt.downloadmanager.AppDownloadStatus;
import cm.aptoide.p092pt.downloadmanager.DownloadError;
import cm.aptoide.p092pt.downloadmanager.FileDownloadCallback;
import cm.aptoide.p092pt.downloadmanager.FileDownloadProgressResult;

/* loaded from: classes.dex */
public class FileDownloadTaskStatus implements FileDownloadCallback {
    private AppDownloadStatus.AppDownloadState appDownloadState;
    private int averageDownloadSpeed;
    private FileDownloadProgressResult downloadProgress;
    private DownloadError error;
    private int fileType;
    private String md5;

    public FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState appDownloadState, FileDownloadProgressResult fileDownloadProgressResult, String str, int i2, int i3) {
        this.appDownloadState = appDownloadState;
        this.downloadProgress = fileDownloadProgressResult;
        this.md5 = str;
        this.averageDownloadSpeed = i2;
        this.fileType = i3;
        this.error = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.md5.equals(((FileDownloadTaskStatus) obj).getMd5());
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloadCallback
    public FileDownloadProgressResult getDownloadProgress() {
        return this.downloadProgress;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloadCallback
    public int getDownloadSpeed() {
        return this.averageDownloadSpeed;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloadCallback
    public AppDownloadStatus.AppDownloadState getDownloadState() {
        return this.appDownloadState;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloadCallback
    public DownloadError getError() {
        return this.error;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloadCallback
    public int getFileType() {
        return this.fileType;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloadCallback
    public String getMd5() {
        return this.md5;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloadCallback
    public boolean hasError() {
        return this.error != null;
    }

    public FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState appDownloadState, String str, DownloadError downloadError, int i2, int i3) {
        this.appDownloadState = appDownloadState;
        this.md5 = str;
        this.error = downloadError;
        this.averageDownloadSpeed = i2;
        this.fileType = i3;
        this.downloadProgress = new FileDownloadProgressResult(0L, 0L);
    }
}
