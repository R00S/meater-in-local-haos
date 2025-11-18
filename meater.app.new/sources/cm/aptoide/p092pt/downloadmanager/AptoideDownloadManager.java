package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.database.room.RoomFileToDownload;
import cm.aptoide.p092pt.downloadmanager.AppDownloadStatus;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.utils.FileUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class AptoideDownloadManager implements DownloadManager {
    private static final String TAG = "AptoideDownloadManager";
    private HashMap<String, AppDownloader> appDownloaderMap = new HashMap<>();
    private AppDownloaderProvider appDownloaderProvider;
    private InterfaceC11246k dispatchDownloadsSubscription;
    private DownloadAnalytics downloadAnalytics;
    private final DownloadAppMapper downloadAppMapper;
    private DownloadStatusMapper downloadStatusMapper;
    private DownloadsRepository downloadsRepository;

    public AptoideDownloadManager(DownloadsRepository downloadsRepository, DownloadStatusMapper downloadStatusMapper, DownloadAppMapper downloadAppMapper, AppDownloaderProvider appDownloaderProvider, DownloadAnalytics downloadAnalytics) {
        this.downloadsRepository = downloadsRepository;
        this.downloadStatusMapper = downloadStatusMapper;
        this.downloadAppMapper = downloadAppMapper;
        this.appDownloaderProvider = appDownloaderProvider;
        this.downloadAnalytics = downloadAnalytics;
    }

    private AppDownloader createAppDownloadManager(RoomDownload roomDownload) {
        return this.appDownloaderProvider.getAppDownloader(this.downloadAppMapper.mapDownload(roomDownload));
    }

    private void dispatchDownloads() {
        this.dispatchDownloadsSubscription = this.downloadsRepository.getInProgressDownloadsList().m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.m0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40110s0().m40077R0(750L, TimeUnit.MILLISECONDS).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.h1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                Logger.getInstance().m8273d(AptoideDownloadManager.TAG, "Downloads in Progress " + ((List) obj).size());
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((List) obj).isEmpty());
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.y0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8871f.m7597f((List) obj);
            }
        }).m40111t().m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.k1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40110s0().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.n0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                Logger.getInstance().m8273d(AptoideDownloadManager.TAG, "Queued downloads " + ((List) obj).size());
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.q0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                return Boolean.valueOf(!list.isEmpty());
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AptoideDownloadManager.lambda$dispatchDownloads$33((List) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8851f.m7599h((RoomDownload) obj);
            }
        }).m40110s0().m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.m1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.x0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AptoideDownloadManager.lambda$dispatchDownloads$37((RoomDownload) obj);
            }
        }, C2460u1.f8863f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAppDownloader, reason: merged with bridge method [inline-methods] */
    public C11234e<AppDownloader> m7614w(final RoomDownload roomDownload) {
        return C11234e.m40025S(this.appDownloaderMap.get(roomDownload.getMd5())).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.o0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8842f.m7600i(roomDownload, (AppDownloader) obj);
            }
        });
    }

    private int getStateIfFileExists(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() == 5) {
            return 5;
        }
        for (RoomFileToDownload roomFileToDownload : roomDownload.getFilesToDownload()) {
            if (!FileUtils.fileExists(roomFileToDownload.getFilePath())) {
                Logger.getInstance().m8273d(TAG, "File is missing: " + roomFileToDownload.getFileName() + " file path: " + roomFileToDownload.getFilePath());
                return 10;
            }
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C11234e<RoomDownload> handleDownloadProgress(AppDownloader appDownloader) {
        return appDownloader.observeDownloadProgress().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8833f.m7606o((AppDownloadStatus) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.k0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8830f.m7607p((RoomDownload) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.w
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomDownload) obj).getOverallDownloadStatus() == 1);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.l1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8834f.m7608q((RoomDownload) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.j1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8828f.m7609r((RoomDownload) obj);
            }
        }).m40076Q0(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.v0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomDownload) obj).getOverallDownloadStatus() == 1);
            }
        });
    }

    private boolean isFileMissingFromCompletedDownload(RoomDownload roomDownload) {
        return roomDownload.getOverallDownloadStatus() == 1 && getStateIfFileExists(roomDownload) == 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7593b(String str, RoomDownload roomDownload, AppDownloader appDownloader) {
        return appDownloader.removeAppDownload().m39973a(this.downloadsRepository.remove(str)).m39974b(C11234e.m40025S(roomDownload));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7594c(final String str, final RoomDownload roomDownload) {
        return lambda$pauseDownload$18(roomDownload).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.e1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8807f.m7593b(str, roomDownload, (AppDownloader) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7595d(RoomDownload roomDownload) {
        this.downloadAnalytics.onDownloadCancel(roomDownload.getMd5(), roomDownload.getAverageApkDownloadSpeed(), roomDownload.getAverageObbDownloadSpeed(), roomDownload.getAverageSplitsDownloadSpeed());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchDownloads$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7597f(List list) {
        return this.downloadsRepository.getInQueueDownloads().m40057E();
    }

    static /* synthetic */ RoomDownload lambda$dispatchDownloads$33(List list) {
        return (RoomDownload) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchDownloads$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7598g(RoomDownload roomDownload, Throwable th) {
        lambda$cancelDownload$23(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchDownloads$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7599h(final RoomDownload roomDownload) {
        return lambda$pauseDownload$18(roomDownload).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.t
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8856f.m7598g(roomDownload, (Throwable) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((AppDownloader) obj).startAppDownload();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8872f.handleDownloadProgress((AppDownloader) obj);
            }
        });
    }

    static /* synthetic */ void lambda$dispatchDownloads$37(RoomDownload roomDownload) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAppDownloader$45, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ AppDownloader m7600i(RoomDownload roomDownload, AppDownloader appDownloader) {
        return appDownloader == null ? createAppDownloadManager(roomDownload) : appDownloader;
    }

    static /* synthetic */ Iterable lambda$getCurrentInProgressDownload$9(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getDownloadAsObservable$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7601j(RoomDownload roomDownload) {
        return (roomDownload == null || isFileMissingFromCompletedDownload(roomDownload)) ? C11234e.m40017C(new DownloadNotFoundException()) : C11234e.m40025S(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getDownloadAsSingle$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7602k(RoomDownload roomDownload) {
        return (roomDownload == null || isFileMissingFromCompletedDownload(roomDownload)) ? Single.m39911h(new DownloadNotFoundException()) : Single.m39913m(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getDownloadsByMd5$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7603l(RoomDownload roomDownload) {
        return Boolean.valueOf((roomDownload == null || isFileMissingFromCompletedDownload(roomDownload)) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getDownloadsByMd5$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7604m(List list) {
        return C11234e.m40020N(list).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8803f.m7603l((RoomDownload) obj);
            }
        }).m40084Y0();
    }

    static /* synthetic */ RoomDownload lambda$getDownloadsByMd5$7(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return (RoomDownload) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadProgress$38, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7605n(AppDownloadStatus appDownloadStatus, RoomDownload roomDownload) {
        return updateDownload(roomDownload, appDownloadStatus).m39974b(C11234e.m40025S(roomDownload));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadProgress$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7606o(final AppDownloadStatus appDownloadStatus) {
        return this.downloadsRepository.getDownloadAsObservable(appDownloadStatus.getMd5()).m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8860f.m7605n(appDownloadStatus, (RoomDownload) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadProgress$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7607p(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() == 5) {
            this.downloadAnalytics.startProgress(roomDownload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadProgress$42, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7608q(RoomDownload roomDownload) {
        this.downloadAnalytics.onDownloadComplete(roomDownload.getMd5(), roomDownload.getPackageName(), roomDownload.getVersionCode(), roomDownload.getAverageApkDownloadSpeed(), roomDownload.getAverageObbDownloadSpeed(), roomDownload.getAverageSplitsDownloadSpeed());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadProgress$43, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7609r(RoomDownload roomDownload) {
        removeAppDownloader(roomDownload.getMd5());
    }

    static /* synthetic */ Iterable lambda$invalidateDatabase$24(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$invalidateDatabase$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7610s(RoomDownload roomDownload) {
        return Boolean.valueOf(getStateIfFileExists(roomDownload) == 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$invalidateDatabase$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7611t(RoomDownload roomDownload) {
        return this.downloadsRepository.remove(roomDownload.getMd5());
    }

    static /* synthetic */ Iterable lambda$pauseAllDownloads$12(List list) {
        return list;
    }

    static /* synthetic */ RoomDownload lambda$pauseAllDownloads$14(RoomDownload roomDownload, AppDownloader appDownloader) {
        return roomDownload;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseAllDownloads$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7612u(final RoomDownload roomDownload) {
        return lambda$pauseDownload$18(roomDownload).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.j0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((AppDownloader) obj).pauseAppDownload();
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.d1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                RoomDownload roomDownload2 = roomDownload;
                AptoideDownloadManager.lambda$pauseAllDownloads$14(roomDownload2, (AppDownloader) obj);
                return roomDownload2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7613v(RoomDownload roomDownload) {
        roomDownload.setOverallDownloadStatus(6);
        return this.downloadsRepository.save(roomDownload).m39974b(C11234e.m40025S(roomDownload));
    }

    static /* synthetic */ void lambda$startDownload$0(RoomDownload roomDownload) {
        roomDownload.setOverallDownloadStatus(13);
        roomDownload.setTimeStamp(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startDownload$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7615x(RoomDownload roomDownload) {
        this.appDownloaderMap.put(roomDownload.getMd5(), createAppDownloadManager(roomDownload));
    }

    private void removeAppDownloader(String str) {
        AppDownloader appDownloader = this.appDownloaderMap.get(str);
        Logger.getInstance().m8273d(TAG, "removing download manager from app : " + str);
        if (appDownloader != null) {
            appDownloader.stop();
            Logger.getInstance().m8273d(TAG, "removed download manager from app " + str);
            this.appDownloaderMap.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeDownloadFiles, reason: merged with bridge method [inline-methods] */
    public void m7596e(RoomDownload roomDownload) {
        Iterator<RoomFileToDownload> it = roomDownload.getFilesToDownload().iterator();
        while (it.hasNext()) {
            FileUtils.removeFile(it.next().getFilePath());
        }
    }

    private C11231b updateDownload(RoomDownload roomDownload, AppDownloadStatus appDownloadStatus) {
        roomDownload.setOverallProgress(appDownloadStatus.getOverallProgress());
        roomDownload.setOverallDownloadStatus(this.downloadStatusMapper.mapAppDownloadStatus(appDownloadStatus.getDownloadStatus()));
        roomDownload.setDownloadError(this.downloadStatusMapper.mapDownloadError(appDownloadStatus.getDownloadStatus()));
        for (RoomFileToDownload roomFileToDownload : roomDownload.getFilesToDownload()) {
            roomFileToDownload.setStatus(this.downloadStatusMapper.mapAppDownloadStatus(appDownloadStatus.getFileDownloadStatus(roomFileToDownload.getMd5())));
            roomFileToDownload.setProgress(appDownloadStatus.getFileDownloadProgress(roomFileToDownload.getMd5()));
        }
        if (appDownloadStatus.getDownloadStatus().equals(AppDownloadStatus.AppDownloadState.ERROR_MD5_DOES_NOT_MATCH)) {
            lambda$cancelDownload$23(roomDownload);
        }
        if (appDownloadStatus.isAppDownloadOver()) {
            roomDownload.setAverageApkDownloadSpeed(appDownloadStatus.getAverageDownloadSpeed().getAverageApkSpeed());
            roomDownload.setAverageObbDownloadSpeed(appDownloadStatus.getAverageDownloadSpeed().getAverageObbSpeed());
            roomDownload.setAverageSplitsDownloadSpeed(appDownloadStatus.getAverageDownloadSpeed().getAverageSplitSpeed());
        }
        return this.downloadsRepository.save(roomDownload);
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public C11231b cancelDownload(final String str) {
        return this.downloadsRepository.getDownloadAsObservable(str).m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.g1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8817f.m7594c(str, (RoomDownload) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8870f.m7595d((RoomDownload) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.n1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8840f.m7596e((RoomDownload) obj);
            }
        }).m40083X0();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public C11234e<List<RoomDownload>> getCurrentActiveDownloads() {
        return this.downloadsRepository.getCurrentActiveDownloads();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public C11234e<RoomDownload> getCurrentInProgressDownload() {
        return getDownloadsList().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.a0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                AptoideDownloadManager.lambda$getCurrentInProgressDownload$9(list);
                return list;
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomDownload) obj).getOverallDownloadStatus() == 5);
            }
        });
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public C11234e<RoomDownload> getDownloadAsObservable(String str) {
        return this.downloadsRepository.getDownloadAsObservable(str).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.i1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8824f.m7601j((RoomDownload) obj);
            }
        }).m40076Q0(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.v
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomDownload) obj).getOverallDownloadStatus() == 1);
            }
        });
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public Single<RoomDownload> getDownloadAsSingle(String str) {
        return this.downloadsRepository.getDownloadAsSingle(str).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8806f.m7602k((RoomDownload) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public C11234e<RoomDownload> getDownloadsByMd5(String str) {
        return this.downloadsRepository.getDownloadListByMd5(str).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.i0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8823f.m7604m((List) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AptoideDownloadManager.lambda$getDownloadsByMd5$7((List) obj);
            }
        }).m40111t().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.a1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                Logger.getInstance().m8273d(AptoideDownloadManager.TAG, "passing a download : ");
            }
        });
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public C11234e<List<RoomDownload>> getDownloadsList() {
        return this.downloadsRepository.getAllDownloads();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public C11231b invalidateDatabase() {
        return getDownloadsList().m40057E().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                AptoideDownloadManager.lambda$invalidateDatabase$24(list);
                return list;
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.s0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8854f.m7610s((RoomDownload) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.b1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8798f.m7611t((RoomDownload) obj);
            }
        }).m40084Y0().m40083X0();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public C11231b pauseAllDownloads() {
        return this.downloadsRepository.getDownloadsInProgress().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.t0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                return Boolean.valueOf(!list.isEmpty());
            }
        }).m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.b0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                AptoideDownloadManager.lambda$pauseAllDownloads$12(list);
                return list;
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8816f.m7612u((RoomDownload) obj);
            }
        }).m40083X0();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public C11231b pauseDownload(String str) {
        return this.downloadsRepository.getDownloadAsObservable(str).m40057E().m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.downloadmanager.c1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.z0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8873f.m7613v((RoomDownload) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8868f.m7614w((RoomDownload) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.f1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((AppDownloader) obj).pauseAppDownload();
            }
        }).m40083X0();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public synchronized void start() {
        dispatchDownloads();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public C11231b startDownload(final RoomDownload roomDownload) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.downloadmanager.u0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                AptoideDownloadManager.lambda$startDownload$0(roomDownload);
            }
        }).m39973a(this.downloadsRepository.save(roomDownload)).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.downloadmanager.f0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8811f.m7615x(roomDownload);
            }
        });
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadManager
    public void stop() {
        if (this.dispatchDownloadsSubscription.isUnsubscribed()) {
            return;
        }
        this.dispatchDownloadsSubscription.unsubscribe();
    }
}
