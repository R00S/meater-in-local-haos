package cm.aptoide.p092pt.download;

import cm.aptoide.p092pt.ads.MinimalAdMapper;
import cm.aptoide.p092pt.database.RoomStoredMinimalAdPersistence;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.database.room.RoomStoredMinimalAd;
import cm.aptoide.p092pt.dataprovider.ads.AdNetworkUtils;
import cm.aptoide.p092pt.downloadmanager.AptoideDownloadManager;
import cm.aptoide.p092pt.downloadmanager.DownloadPersistence;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.exception.InstallationException;
import cm.aptoide.p092pt.install.installer.DownloadInstallationAdapter;
import cm.aptoide.p092pt.install.installer.Installation;
import cm.aptoide.p092pt.install.installer.InstallationProvider;
import cm.aptoide.p092pt.logger.Logger;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class DownloadInstallationProvider implements InstallationProvider {
    private static final String TAG = "DownloadInstallationPro";
    private final MinimalAdMapper adMapper;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final AptoideDownloadManager downloadManager;
    private final DownloadPersistence downloadPersistence;
    private final RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence;

    public DownloadInstallationProvider(AptoideDownloadManager aptoideDownloadManager, DownloadPersistence downloadPersistence, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, MinimalAdMapper minimalAdMapper, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        this.downloadManager = aptoideDownloadManager;
        this.downloadPersistence = downloadPersistence;
        this.adMapper = minimalAdMapper;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
        this.roomStoredMinimalAdPersistence = roomStoredMinimalAdPersistence;
    }

    private RoomInstalled convertDownloadToInstalled(RoomDownload roomDownload) {
        RoomInstalled roomInstalled = new RoomInstalled();
        roomInstalled.setPackageAndVersionCode(roomDownload.getPackageName() + roomDownload.getVersionCode());
        roomInstalled.setVersionCode(roomDownload.getVersionCode());
        roomInstalled.setVersionName(roomDownload.getVersionName());
        roomInstalled.setAppSize(Long.valueOf(roomDownload.getSize()));
        roomInstalled.setStatus(1);
        roomInstalled.setType(-1);
        roomInstalled.setPackageName(roomDownload.getPackageName());
        return roomInstalled;
    }

    private InterfaceC11253b<RoomStoredMinimalAd> handleCpd() {
        return new InterfaceC11253b() { // from class: cm.aptoide.pt.download.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8662f.m7502d((RoomStoredMinimalAd) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getInstallation$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ DownloadInstallationAdapter m7499a(RoomDownload roomDownload, RoomInstalled roomInstalled) {
        if (roomInstalled == null) {
            roomInstalled = convertDownloadToInstalled(roomDownload);
        }
        return new DownloadInstallationAdapter(roomDownload, this.downloadPersistence, this.aptoideInstalledAppsRepository, roomInstalled);
    }

    static /* synthetic */ void lambda$getInstallation$1(RoomStoredMinimalAd roomStoredMinimalAd) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getInstallation$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7500b(DownloadInstallationAdapter downloadInstallationAdapter) {
        this.roomStoredMinimalAdPersistence.get(downloadInstallationAdapter.getPackageName()).m40119x(handleCpd()).m40065I0(Schedulers.m40658io()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DownloadInstallationProvider.lambda$getInstallation$1((RoomStoredMinimalAd) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.download.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getInstallation$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7501c(final RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() == 1) {
            return this.aptoideInstalledAppsRepository.get(roomDownload.getPackageName(), roomDownload.getVersionCode()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.a
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f8658f.m7499a(roomDownload, (RoomInstalled) obj);
                }
            }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.e
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f8663f.m7500b((DownloadInstallationAdapter) obj);
                }
            });
        }
        return C11234e.m40017C(new InstallationException("Installation file not available. download is " + roomDownload.getMd5() + " and the state is : " + roomDownload.getOverallDownloadStatus()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCpd$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7502d(RoomStoredMinimalAd roomStoredMinimalAd) {
        if (roomStoredMinimalAd == null || roomStoredMinimalAd.getCpdUrl() == null) {
            return;
        }
        AdNetworkUtils.knockCpd(this.adMapper.map(roomStoredMinimalAd));
        roomStoredMinimalAd.setCpdUrl(null);
        this.roomStoredMinimalAdPersistence.insert(roomStoredMinimalAd);
    }

    @Override // cm.aptoide.p092pt.install.installer.InstallationProvider
    public C11234e<Installation> getInstallation(String str) {
        Logger.getInstance().m8273d(TAG, "Getting the installation " + str);
        return this.downloadManager.getDownloadAsSingle(str).m39915A().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8661f.m7501c((RoomDownload) obj);
            }
        });
    }
}
