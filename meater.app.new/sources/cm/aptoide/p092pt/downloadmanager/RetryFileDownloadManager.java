package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.downloadmanager.AppDownloadStatus;
import cm.aptoide.p092pt.logger.Logger;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class RetryFileDownloadManager implements RetryFileDownloader {
    private static final String TAG = "RetryFileDownloadManage";
    private String alternativeDownloadPath;
    private final String attributionId;
    private FileDownloader fileDownloader;
    private FileDownloaderProvider fileDownloaderProvider;
    private final String fileName;
    private final int fileType;
    private final String mainDownloadPath;
    private String md5;
    private final String packageName;
    private boolean retried;
    private C11418b<FileDownloadCallback> retryFileDownloadSubject = C11418b.m40637g1();
    private InterfaceC11246k startDownloadSubscription;
    private final int versionCode;

    public RetryFileDownloadManager(String str, int i2, String str2, int i3, String str3, String str4, FileDownloaderProvider fileDownloaderProvider, String str5, String str6) {
        this.mainDownloadPath = str;
        this.fileType = i2;
        this.packageName = str2;
        this.versionCode = i3;
        this.fileName = str3;
        this.md5 = str4;
        this.fileDownloaderProvider = fileDownloaderProvider;
        this.alternativeDownloadPath = str5;
        this.attributionId = str6;
    }

    private C11234e<FileDownloadCallback> handleFileDownloadProgress(FileDownloader fileDownloader) {
        return fileDownloader.observeFileDownloadProgress().m40076Q0(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.t1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((FileDownloadCallback) obj).getDownloadState() == AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.s1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8855f.m7616a((FileDownloadCallback) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.r1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8852f.m7617b((FileDownloadCallback) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFileDownloadProgress$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7616a(FileDownloadCallback fileDownloadCallback) {
        if (fileDownloadCallback.getDownloadState() != AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND || this.retried) {
            return C11234e.m40025S(fileDownloadCallback);
        }
        Logger.getInstance().m8273d(TAG, "File not found error, restarting the download with the alternative link");
        FileDownloader fileDownloaderCreateFileDownloader = this.fileDownloaderProvider.createFileDownloader(this.md5, this.alternativeDownloadPath, this.fileType, this.packageName, this.versionCode, this.fileName, C11418b.m40637g1(), this.attributionId);
        this.retried = true;
        this.fileDownloader = fileDownloaderCreateFileDownloader;
        return fileDownloaderCreateFileDownloader.startFileDownload().m39974b(handleFileDownloadProgress(fileDownloaderCreateFileDownloader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFileDownloadProgress$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7617b(FileDownloadCallback fileDownloadCallback) {
        this.retryFileDownloadSubject.onNext(fileDownloadCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startFileDownload$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7618c(FileDownloader fileDownloader) {
        return fileDownloader.startFileDownload().m39974b(handleFileDownloadProgress(fileDownloader));
    }

    private FileDownloader setupFileDownloader() {
        FileDownloader fileDownloaderCreateFileDownloader = this.fileDownloaderProvider.createFileDownloader(this.md5, this.mainDownloadPath, this.fileType, this.packageName, this.versionCode, this.fileName, C11418b.m40637g1(), this.attributionId);
        this.fileDownloader = fileDownloaderCreateFileDownloader;
        return fileDownloaderCreateFileDownloader;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public C11234e<FileDownloadCallback> observeFileDownloadProgress() {
        return this.retryFileDownloadSubject;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public C11231b pauseDownload() {
        return this.fileDownloader.pauseDownload();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public C11231b removeDownloadFile() {
        return this.fileDownloader.removeDownloadFile();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public void startFileDownload() {
        this.startDownloadSubscription = C11234e.m40025S(setupFileDownloader()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.q1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8850f.m7618c((FileDownloader) obj);
            }
        }).m40056D0();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public void stop() {
        InterfaceC11246k interfaceC11246k = this.startDownloadSubscription;
        if (interfaceC11246k == null || interfaceC11246k.isUnsubscribed()) {
            return;
        }
        this.startDownloadSubscription.unsubscribe();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public void stopFailedDownload() {
        this.fileDownloader.stopFailedDownload();
    }
}
