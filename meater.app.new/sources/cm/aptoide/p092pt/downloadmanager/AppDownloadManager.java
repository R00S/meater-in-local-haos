package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.downloadmanager.AppDownloadStatus;
import cm.aptoide.p092pt.logger.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class AppDownloadManager implements AppDownloader {
    private static final String TAG = "AppDownloadManager";
    private final DownloadApp app;
    private AppDownloadStatus appDownloadStatus;
    private DownloadAnalytics downloadAnalytics;
    private C11418b<FileDownloadCallback> fileDownloadSubject = C11418b.m40637g1();
    private HashMap<String, RetryFileDownloader> fileDownloaderPersistence;
    private RetryFileDownloaderProvider fileDownloaderProvider;
    private InterfaceC11246k subscribe;

    /* renamed from: cm.aptoide.pt.downloadmanager.AppDownloadManager$1 */
    static /* synthetic */ class C23951 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState */
        static final /* synthetic */ int[] f8763x5e1d6a72;

        static {
            int[] iArr = new int[AppDownloadStatus.AppDownloadState.values().length];
            f8763x5e1d6a72 = iArr;
            try {
                iArr[AppDownloadStatus.AppDownloadState.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8763x5e1d6a72[AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8763x5e1d6a72[AppDownloadStatus.AppDownloadState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8763x5e1d6a72[AppDownloadStatus.AppDownloadState.ERROR_NOT_ENOUGH_SPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AppDownloadManager(RetryFileDownloaderProvider retryFileDownloaderProvider, DownloadApp downloadApp, HashMap<String, RetryFileDownloader> map, DownloadAnalytics downloadAnalytics) {
        this.fileDownloaderProvider = retryFileDownloaderProvider;
        this.app = downloadApp;
        this.fileDownloaderPersistence = map;
        this.downloadAnalytics = downloadAnalytics;
        this.appDownloadStatus = new AppDownloadStatus(downloadApp.getMd5(), new ArrayList(), AppDownloadStatus.AppDownloadState.PENDING, downloadApp.getSize());
    }

    private void handleCompletedFileDownload(RetryFileDownloader retryFileDownloader) {
        retryFileDownloader.stop();
    }

    private void handleErrorFileDownload() {
        Iterator<RetryFileDownloader> it = this.fileDownloaderPersistence.values().iterator();
        while (it.hasNext()) {
            it.next().stopFailedDownload();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleFileDownloadProgress, reason: merged with bridge method [inline-methods] */
    public C11234e<FileDownloadCallback> m7591i(final RetryFileDownloader retryFileDownloader) {
        return retryFileDownloader.observeFileDownloadProgress().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.p
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8845f.m7583a((FileDownloadCallback) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8825f.m7584b(retryFileDownloader, (FileDownloadCallback) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFileDownloadProgress$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7583a(FileDownloadCallback fileDownloadCallback) {
        this.fileDownloadSubject.onNext(fileDownloadCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFileDownloadProgress$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7584b(RetryFileDownloader retryFileDownloader, FileDownloadCallback fileDownloadCallback) {
        if (fileDownloadCallback.getDownloadState() != null) {
            int i2 = C23951.f8763x5e1d6a72[fileDownloadCallback.getDownloadState().ordinal()];
            if (i2 == 1) {
                handleCompletedFileDownload(retryFileDownloader);
                return;
            }
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                handleErrorFileDownload();
                if (fileDownloadCallback.hasError()) {
                    this.downloadAnalytics.onError(this.app.getPackageName(), this.app.getVersionCode(), this.app.getMd5(), fileDownloadCallback.getError().getErrorException(), fileDownloadCallback.getError().getUrlError(), fileDownloadCallback.getError().getHttpError(), this.appDownloadStatus.getAverageDownloadSpeed().getAverageApkSpeed(), this.appDownloadStatus.getAverageDownloadSpeed().getAverageObbSpeed(), this.appDownloadStatus.getAverageDownloadSpeed().getAverageSplitSpeed());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadProgress$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7585c(FileDownloadCallback fileDownloadCallback) {
        setAppDownloadStatus(fileDownloadCallback);
        return C11234e.m40025S(this.appDownloadStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadProgress$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ AppDownloadStatus m7586d(AppDownloadStatus appDownloadStatus) {
        return this.appDownloadStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseAppDownload$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7587e(DownloadAppFile downloadAppFile) {
        return getFileDownloader(downloadAppFile.getMainDownloadPath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeAppDownload$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7588f(DownloadAppFile downloadAppFile) {
        return getFileDownloader(downloadAppFile.getMainDownloadPath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startAppDownload$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7589g(DownloadAppFile downloadAppFile) {
        return startFileDownload(downloadAppFile, this.app.getAttributionId());
    }

    static /* synthetic */ void lambda$startAppDownload$1(FileDownloadCallback fileDownloadCallback) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startFileDownload$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7590h(DownloadAppFile downloadAppFile, RetryFileDownloader retryFileDownloader) {
        this.fileDownloaderPersistence.put(downloadAppFile.getMainDownloadPath(), retryFileDownloader);
    }

    private C11234e<FileDownloadCallback> observeFileDownload() {
        return this.fileDownloadSubject;
    }

    private void setAppDownloadStatus(FileDownloadCallback fileDownloadCallback) {
        this.appDownloadStatus.setFileDownloadCallback(fileDownloadCallback);
    }

    private C11234e<FileDownloadCallback> startFileDownload(final DownloadAppFile downloadAppFile, String str) {
        return C11234e.m40025S(this.fileDownloaderProvider.createRetryFileDownloader(downloadAppFile.getDownloadMd5(), downloadAppFile.getMainDownloadPath(), downloadAppFile.getFileType(), downloadAppFile.getPackageName(), downloadAppFile.getVersionCode(), downloadAppFile.getFileName(), C11418b.m40637g1(), downloadAppFile.getAlternativeDownloadPath(), str)).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8814f.m7590h(downloadAppFile, (RetryFileDownloader) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.l
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                Logger.getInstance().m8273d(AppDownloadManager.TAG, "Starting app file download " + downloadAppFile.getFileName());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.h
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((RetryFileDownloader) obj).startFileDownload();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8810f.m7591i((RetryFileDownloader) obj);
            }
        }).m40117w(C2460u1.f8863f);
    }

    public C11234e<RetryFileDownloader> getFileDownloader(String str) {
        return C11234e.m40025S(this.fileDownloaderPersistence.get(str));
    }

    @Override // cm.aptoide.p092pt.downloadmanager.AppDownloader
    public C11234e<AppDownloadStatus> observeDownloadProgress() {
        return observeFileDownload().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8799f.m7585c((FileDownloadCallback) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8853f.m7586d((AppDownloadStatus) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.downloadmanager.AppDownloader
    public C11231b pauseAppDownload() {
        return C11234e.m40020N(this.app.getDownloadFiles()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8802f.m7587e((DownloadAppFile) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RetryFileDownloader) obj) != null);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((RetryFileDownloader) obj).pauseDownload().m39958A();
            }
        }).m40083X0();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.AppDownloader
    public C11231b removeAppDownload() {
        return C11234e.m40020N(this.app.getDownloadFiles()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8822f.m7588f((DownloadAppFile) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((RetryFileDownloader) obj).removeDownloadFile().m39958A();
            }
        }).m40083X0();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.AppDownloader
    public void startAppDownload() {
        this.subscribe = C11234e.m40020N(this.app.getDownloadFiles()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8829f.m7589g((DownloadAppFile) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.o
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppDownloadManager.lambda$startAppDownload$1((FileDownloadCallback) obj);
            }
        }, C2460u1.f8863f);
    }

    @Override // cm.aptoide.p092pt.downloadmanager.AppDownloader
    public void stop() {
        InterfaceC11246k interfaceC11246k = this.subscribe;
        if (interfaceC11246k == null || interfaceC11246k.isUnsubscribed()) {
            return;
        }
        this.subscribe.unsubscribe();
        this.fileDownloadSubject = null;
        this.fileDownloaderPersistence.clear();
        this.fileDownloaderPersistence = null;
    }
}
