package cm.aptoide.p092pt.download;

import cm.aptoide.p092pt.downloadmanager.AppDownloadStatus;
import cm.aptoide.p092pt.downloadmanager.DownloadError;
import cm.aptoide.p092pt.downloadmanager.FileDownloadCallback;
import cm.aptoide.p092pt.downloadmanager.FileDownloadProgressResult;
import cm.aptoide.p092pt.logger.Logger;
import com.liulishuo.filedownloader.exception.FileDownloadHttpException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import p241e.p307h.p308a.AbstractC9010g;
import p241e.p307h.p308a.InterfaceC8991a;
import p456rx.C11234e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class FileDownloadTask extends AbstractC9010g {
    private static final int FILE_NOT_FOUND_HTTP_ERROR = 404;
    private final String TAG = "FileDownloader";
    private final String attributionId;
    private final C11418b<FileDownloadCallback> downloadStatus;
    private final String fileName;
    private final int fileType;
    private final String md5;
    private final Md5Comparator md5Comparator;
    private final boolean shouldConfirmMd5;

    public FileDownloadTask(C11418b<FileDownloadCallback> c11418b, String str, Md5Comparator md5Comparator, String str2, String str3, boolean z, int i2) {
        this.downloadStatus = c11418b;
        this.md5 = str;
        this.md5Comparator = md5Comparator;
        this.fileName = str2;
        this.attributionId = str3;
        this.shouldConfirmMd5 = z;
        this.fileType = i2;
    }

    private boolean isMd5Approved(String str, String str2, boolean z) {
        if (z) {
            return this.md5Comparator.compareMd5(str, str2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$completed$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7506a(InterfaceC8991a interfaceC8991a) {
        FileDownloadTaskStatus fileDownloadTaskStatus;
        this.downloadStatus.onNext(new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.VERIFYING_FILE_INTEGRITY, new FileDownloadProgressResult(interfaceC8991a.mo28609E(), interfaceC8991a.mo28609E()), this.md5, interfaceC8991a.mo28620c(), this.fileType));
        if (this.attributionId != null || isMd5Approved(this.md5, this.fileName, this.shouldConfirmMd5)) {
            fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.COMPLETED, new FileDownloadProgressResult(interfaceC8991a.mo28609E(), interfaceC8991a.mo28609E()), this.md5, interfaceC8991a.mo28620c(), this.fileType);
            Logger.getInstance().m8273d("FileDownloader", " Download completed");
        } else {
            Logger.getInstance().m8273d("FileDownloader", " Download error in md5");
            fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.ERROR_MD5_DOES_NOT_MATCH, this.md5, new DownloadError(new Md5DownloadComparisonException("md5 does not match"), "not_http", interfaceC8991a.mo28631n()), interfaceC8991a.mo28620c(), this.fileType);
        }
        this.downloadStatus.onNext(fileDownloadTaskStatus);
    }

    @Override // p241e.p307h.p308a.AbstractC9024i
    protected void completed(final InterfaceC8991a interfaceC8991a) {
        new Thread(new Runnable() { // from class: cm.aptoide.pt.download.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f8667f.m7506a(interfaceC8991a);
            }
        }).start();
    }

    @Override // p241e.p307h.p308a.AbstractC9024i
    protected void error(InterfaceC8991a interfaceC8991a, Throwable th) {
        FileDownloadTaskStatus fileDownloadTaskStatus;
        if (th != null) {
            th.printStackTrace();
            if (th instanceof FileDownloadHttpException) {
                int iM27516b = ((FileDownloadHttpException) th).m27516b();
                if (iM27516b == FILE_NOT_FOUND_HTTP_ERROR) {
                    Logger.getInstance().m8273d("FileDownloader", "File not found error on app: " + this.md5);
                    fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND, this.md5, new DownloadError(th, String.valueOf(iM27516b), interfaceC8991a.mo28631n()), interfaceC8991a.mo28620c(), this.fileType);
                } else {
                    Logger.getInstance().m8273d("FileDownloader", "Http error + " + iM27516b + " on app: " + this.md5);
                    fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.ERROR, this.md5, new DownloadError(th, String.valueOf(iM27516b), interfaceC8991a.mo28631n()), interfaceC8991a.mo28620c(), this.fileType);
                }
            } else if (th instanceof FileDownloadOutOfSpaceException) {
                Logger.getInstance().m8273d("FileDownloader", "Out of space error for the app: " + this.md5);
                fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.ERROR_NOT_ENOUGH_SPACE, this.md5, new DownloadError(th, "not_http", interfaceC8991a.mo28631n()), interfaceC8991a.mo28620c(), this.fileType);
            } else {
                Logger.getInstance().m8273d("FileDownloader", "Generic error on app: " + this.md5);
                fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.ERROR, this.md5, new DownloadError(th, "not_http", interfaceC8991a.mo28631n()), interfaceC8991a.mo28620c(), this.fileType);
            }
        } else {
            Logger.getInstance().m8273d("FileDownloader", "Unknown error on app: " + this.md5);
            fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.ERROR, this.md5, new DownloadError(new GeneralDownloadErrorException("Empty download error"), "not_http", interfaceC8991a.mo28631n()), interfaceC8991a.mo28620c(), this.fileType);
        }
        this.downloadStatus.onNext(fileDownloadTaskStatus);
    }

    public C11234e<FileDownloadCallback> onDownloadStateChanged() {
        return this.downloadStatus;
    }

    @Override // p241e.p307h.p308a.AbstractC9010g
    protected void paused(InterfaceC8991a interfaceC8991a, long j2, long j3) {
        this.downloadStatus.onNext(new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.PAUSED, new FileDownloadProgressResult(j2, j3), this.md5, interfaceC8991a.mo28620c(), this.fileType));
    }

    @Override // p241e.p307h.p308a.AbstractC9010g
    protected void pending(InterfaceC8991a interfaceC8991a, long j2, long j3) {
        this.downloadStatus.onNext(new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.PENDING, new FileDownloadProgressResult(j2, j3), this.md5, interfaceC8991a.mo28620c(), this.fileType));
    }

    @Override // p241e.p307h.p308a.AbstractC9010g
    protected void progress(InterfaceC8991a interfaceC8991a, long j2, long j3) {
        this.downloadStatus.onNext(new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.PROGRESS, new FileDownloadProgressResult(j2, j3), this.md5, interfaceC8991a.mo28620c(), this.fileType));
    }

    @Override // p241e.p307h.p308a.AbstractC9024i
    protected void warn(InterfaceC8991a interfaceC8991a) {
        this.downloadStatus.onNext(new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.WARN, this.md5, (DownloadError) null, interfaceC8991a.mo28620c(), this.fileType));
    }
}
