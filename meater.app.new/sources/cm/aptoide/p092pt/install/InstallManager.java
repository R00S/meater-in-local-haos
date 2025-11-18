package cm.aptoide.p092pt.install;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallManager;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.database.room.RoomInstallation;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.downloadmanager.AptoideDownloadManager;
import cm.aptoide.p092pt.downloadmanager.DownloadNotFoundException;
import cm.aptoide.p092pt.downloadmanager.DownloadsRepository;
import cm.aptoide.p092pt.file.FileManager;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.installer.InstallCandidate;
import cm.aptoide.p092pt.install.installer.InstallationState;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.preferences.secure.SecurePreferences;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p460m.InterfaceC11258g;
import p456rx.p473s.C11418b;
import p456rx.p474t.C11426b;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class InstallManager {
    private static final String TAG = "InstallManager";
    private final AptoideDownloadManager aptoideDownloadManager;
    private final AptoideInstallManager aptoideInstallManager;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final Context context;
    private final DownloadsRepository downloadRepository;
    private final FileManager fileManager;
    private final ForegroundManager foregroundManager;
    private final InstallAppSizeValidator installAppSizeValidator;
    private final Installer installer;
    private final RootAvailabilityManager rootAvailabilityManager;
    private final SharedPreferences securePreferences;
    private final SharedPreferences sharedPreferences;
    private final C11426b dispatchInstallationsSubscription = new C11426b();
    private final C11418b<InstallCandidate> installCandidateSubject = C11418b.m40637g1();

    public InstallManager(Context context, AptoideDownloadManager aptoideDownloadManager, Installer installer, RootAvailabilityManager rootAvailabilityManager, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, DownloadsRepository downloadsRepository, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, ForegroundManager foregroundManager, AptoideInstallManager aptoideInstallManager, InstallAppSizeValidator installAppSizeValidator, FileManager fileManager) {
        this.aptoideDownloadManager = aptoideDownloadManager;
        this.installer = installer;
        this.context = context;
        this.rootAvailabilityManager = rootAvailabilityManager;
        this.downloadRepository = downloadsRepository;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
        this.sharedPreferences = sharedPreferences;
        this.securePreferences = sharedPreferences2;
        this.foregroundManager = foregroundManager;
        this.aptoideInstallManager = aptoideInstallManager;
        this.installAppSizeValidator = installAppSizeValidator;
        this.fileManager = fileManager;
    }

    private RoomInstalled convertDownloadToInstalled(RoomDownload roomDownload) {
        RoomInstalled roomInstalled = new RoomInstalled();
        roomInstalled.setPackageAndVersionCode(roomDownload.getPackageName() + roomDownload.getVersionCode());
        roomInstalled.setVersionCode(roomDownload.getVersionCode());
        roomInstalled.setVersionName(roomDownload.getVersionName());
        roomInstalled.setAppSize(Long.valueOf(roomDownload.getSize()));
        roomInstalled.setStatus(2);
        roomInstalled.setType(-1);
        roomInstalled.setPackageName(roomDownload.getPackageName());
        return roomInstalled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createDownloadAndRetry, reason: merged with bridge method [inline-methods] */
    public C11234e<Throwable> m8225m(C11234e<? extends Throwable> c11234e, final RoomDownload roomDownload) {
        return c11234e.m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.d1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10090f.m8217e(roomDownload, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createInstall, reason: merged with bridge method [inline-methods] */
    public Install m8222j(RoomDownload roomDownload, InstallationState installationState, String str, String str2, int i2, Install.InstallationType installationType) {
        return new Install(mapInstallation(roomDownload), mapInstallationStatus(roomDownload, installationState), installationType, mapIndeterminateState(roomDownload, installationState), getSpeed(roomDownload), str, str2, i2, getVersionName(roomDownload, installationState), getAppName(roomDownload, installationState), getAppIcon(roomDownload, installationState), getDownloadSize(roomDownload, installationState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized List<Install> createInstallList(List<RoomDownload> list, List<RoomInstalled> list2, List<RoomInstalled> list3) {
        ArrayList arrayList;
        InstallationState installationState;
        Install.InstallationType installationType;
        InstallationState installationState2;
        Install.InstallationType installationType2;
        arrayList = new ArrayList();
        for (RoomDownload roomDownload : list) {
            boolean zIsAppInstalling = isAppInstalling(list3, roomDownload.getPackageName(), roomDownload.getVersionCode());
            int status = zIsAppInstalling ? 3 : 1;
            InstallationState installationState3 = new InstallationState(roomDownload.getPackageName(), roomDownload.getVersionCode(), status, -1, roomDownload.getSize());
            Install.InstallationType installationType3 = Install.InstallationType.INSTALL;
            Iterator<RoomInstalled> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    installationState = installationState3;
                    installationType = installationType3;
                    break;
                }
                RoomInstalled next = it.next();
                if (roomDownload.getPackageName().equals(next.getPackageName())) {
                    if (roomDownload.getVersionCode() == next.getVersionCode()) {
                        if (!zIsAppInstalling) {
                            status = next.getStatus();
                        }
                        installationState2 = new InstallationState(next.getPackageName(), next.getVersionCode(), next.getVersionName(), status, next.getType(), next.getName(), next.getIcon(), roomDownload.getSize());
                        installationType2 = Install.InstallationType.INSTALLED;
                    } else {
                        installationState2 = new InstallationState(next.getPackageName(), next.getVersionCode(), status, -1, roomDownload.getSize());
                        installationType2 = next.getVersionCode() > roomDownload.getVersionCode() ? Install.InstallationType.DOWNGRADE : Install.InstallationType.UPDATE;
                    }
                    installationType = installationType2;
                    installationState = installationState2;
                }
            }
            arrayList.add(lambda$getInstall$17(roomDownload, installationState, roomDownload.getMd5(), roomDownload.getPackageName(), roomDownload.getVersionCode(), installationType));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: defaultInstall, reason: merged with bridge method [inline-methods] */
    public C11231b m8232t(RoomDownload roomDownload) {
        return install(roomDownload, true, true);
    }

    private void dispatchInstallationCandidates() {
        C11426b c11426b = this.dispatchInstallationsSubscription;
        C11234e<R> c11234eM40060G = this.installCandidateSubject.m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.o1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10228f.m8219g((InstallCandidate) obj);
            }
        });
        InterfaceC11253b<? super Throwable> interfaceC11253b = C3471i3.f10120f;
        c11426b.m40667a(c11234eM40060G.m40117w(interfaceC11253b).m40110s0().m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.c2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                InstallManager.lambda$dispatchInstallationCandidates$4((RoomDownload) obj);
            }
        }, interfaceC11253b));
    }

    private String getAppIcon(RoomDownload roomDownload, InstallationState installationState) {
        return roomDownload != null ? roomDownload.getIcon() : installationState.getIcon();
    }

    private String getAppName(RoomDownload roomDownload, InstallationState installationState) {
        return roomDownload != null ? roomDownload.getAppName() : installationState.getName();
    }

    private long getDownloadSize(RoomDownload roomDownload, InstallationState installationState) {
        return roomDownload != null ? roomDownload.getSize() : installationState.getAppSize();
    }

    private C11234e<Install.InstallationType> getInstallationType(String str, final int i2) {
        return this.aptoideInstalledAppsRepository.getInstalled(str).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.s0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return InstallManager.lambda$getInstallationType$32(i2, (RoomInstalled) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.g1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                Logger.getInstance().m8273d("AptoideDownloadManager", " emiting installation type");
            }
        });
    }

    private int getSpeed(RoomDownload roomDownload) {
        return 0;
    }

    private String getVersionName(RoomDownload roomDownload, InstallationState installationState) {
        return roomDownload != null ? roomDownload.getVersionName() : installationState.getVersionName();
    }

    private C11231b initInstallationProgress(RoomDownload roomDownload) {
        return this.aptoideInstalledAppsRepository.save(convertDownloadToInstalled(roomDownload));
    }

    private boolean isAppInstalling(List<RoomInstalled> list, String str, int i2) {
        for (RoomInstalled roomInstalled : list) {
            if (str.equals(roomInstalled.getPackageName()) && i2 == roomInstalled.getVersionCode()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cleanTimedOutInstalls$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8214b(RoomInstalled roomInstalled) {
        roomInstalled.setStatus(1);
        return this.aptoideInstalledAppsRepository.save(roomInstalled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cleanTimedOutInstalls$38, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8215c(Install install) {
        return this.aptoideInstalledAppsRepository.get(install.getPackageName(), install.getVersionCode()).m40057E().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.u1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10255f.m8214b((RoomInstalled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cleanTimedOutInstalls$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8216d(List list) {
        return C11234e.m40020N(list).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.a1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10066f.m8215c((Install) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createDownloadAndRetry$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8217e(RoomDownload roomDownload, Throwable th) {
        if (!(th instanceof DownloadNotFoundException)) {
            return C11234e.m40017C(th);
        }
        Logger.getInstance().m8273d(TAG, "saved the newly created download because the other one was null");
        return this.downloadRepository.save(roomDownload).m39974b(C11234e.m40025S(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchInstallationCandidates$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8218f(InstallCandidate installCandidate, RoomDownload roomDownload) {
        return stopForegroundAndInstall(roomDownload.getMd5(), roomDownload.getAction(), installCandidate.getForceDefaultInstall(), installCandidate.getShouldSetPackageInstaller()).m39973a(sendBackgroundInstallFinishedBroadcast(roomDownload));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchInstallationCandidates$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8219g(final InstallCandidate installCandidate) {
        return this.aptoideDownloadManager.getDownloadAsObservable(installCandidate.getMd5()).m40105p0(null).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.i1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomDownload) obj) != null);
            }
        }).m40074O0(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.j1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomDownload) obj).getOverallDownloadStatus() == 1);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.b1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10072f.m8218f(installCandidate, (RoomDownload) obj);
            }
        });
    }

    static /* synthetic */ void lambda$dispatchInstallationCandidates$4(RoomDownload roomDownload) {
    }

    static /* synthetic */ Iterable lambda$fetchInstalled$40(List list) {
        return list;
    }

    static /* synthetic */ Single lambda$filterInstalled$42(Install install, Boolean bool) {
        return bool.booleanValue() ? Single.m39913m(null) : Single.m39913m(install);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getCurrentInstallation$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8220h(RoomDownload roomDownload) {
        return getInstall(roomDownload.getMd5(), roomDownload.getPackageName(), roomDownload.getVersionCode());
    }

    static /* synthetic */ Install.InstallationType lambda$getInstallationType$32(int i2, RoomInstalled roomInstalled) {
        return roomInstalled == null ? Install.InstallationType.INSTALL : roomInstalled.getVersionCode() == i2 ? Install.InstallationType.INSTALLED : roomInstalled.getVersionCode() > i2 ? Install.InstallationType.DOWNGRADE : Install.InstallationType.UPDATE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleNotEnoughSpaceForDownload$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8223k(RoomDownload roomDownload, boolean z, boolean z2, boolean z3, Long l) {
        if (roomDownload.getSize() < this.installAppSizeValidator.getAvailableSpace()) {
            return startBackgroundInstallation(roomDownload.getMd5(), z, z2, z3);
        }
        roomDownload.setOverallDownloadStatus(9);
        roomDownload.setDownloadError(2);
        return this.downloadRepository.save(roomDownload).m39974b(C11234e.m40025S(roomDownload.getMd5()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$install$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8224l(RoomDownload roomDownload, RoomDownload roomDownload2) {
        return updateDownloadAction(roomDownload, roomDownload2).m39974b(C11234e.m40025S(roomDownload2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$install$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8226n(RoomDownload roomDownload) {
        this.aptoideInstallManager.addAptoideInstallCandidate(roomDownload.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$install$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8227o(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() != 9) {
            return C11234e.m40025S(roomDownload);
        }
        roomDownload.setOverallDownloadStatus(0);
        return this.downloadRepository.save(roomDownload).m39974b(C11234e.m40025S(roomDownload));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$install$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8228p(boolean z, boolean z2, RoomDownload roomDownload, RoomDownload roomDownload2) {
        return !this.installAppSizeValidator.hasEnoughSpaceToInstallApp(roomDownload2) ? handleNotEnoughSpaceForDownload(roomDownload2, z, true, z2) : startBackgroundInstallation(roomDownload.getMd5(), z, true, z2);
    }

    static /* synthetic */ Iterable lambda$onAppInstalled$28(RoomInstalled roomInstalled, List list) {
        if (list.isEmpty()) {
            list.add(roomInstalled);
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onAppInstalled$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8229q(RoomInstalled roomInstalled, RoomInstalled roomInstalled2) {
        if (roomInstalled2.getVersionCode() != roomInstalled.getVersionCode()) {
            return this.aptoideInstalledAppsRepository.remove(roomInstalled2.getPackageName(), roomInstalled2.getVersionCode());
        }
        roomInstalled.setType(roomInstalled2.getType());
        roomInstalled.setStatus(4);
        return this.aptoideInstalledAppsRepository.save(roomInstalled).m39973a(this.downloadRepository.remove(roomInstalled.getPackageName(), roomInstalled.getVersionCode()));
    }

    static /* synthetic */ Iterable lambda$onAppRemoved$30(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onAppRemoved$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8230r(String str, RoomInstalled roomInstalled) {
        return this.aptoideInstalledAppsRepository.remove(str, roomInstalled.getVersionCode());
    }

    static /* synthetic */ Iterable lambda$retryTimedOutInstallations$34(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$retryTimedOutInstallations$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8231s(Install install) {
        return getDownload(install.getMd5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendBackgroundInstallFinishedBroadcast$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8233u(RoomDownload roomDownload) {
        this.context.sendBroadcast(new Intent(DownloadService.ACTION_INSTALL_FINISHED).putExtra(DownloadService.EXTRA_INSTALLATION_MD5, roomDownload.getMd5()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startBackgroundInstallation$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8234v(boolean z, String str, boolean z2, boolean z3, RoomDownload roomDownload) {
        if (z) {
            this.installCandidateSubject.onNext(new InstallCandidate(str, z2, z3));
            this.foregroundManager.startDownloadService();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startBackgroundInstallation$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8235w(RoomDownload roomDownload) {
        return initInstallationProgress(roomDownload).m39973a(startDownload(roomDownload));
    }

    static /* synthetic */ String lambda$startBackgroundInstallation$23(String str, RoomDownload roomDownload) {
        return str;
    }

    static /* synthetic */ RoomDownload lambda$startInstalls$24(RoomDownload roomDownload, Long l) {
        return roomDownload;
    }

    static /* synthetic */ Iterable lambda$wasAppEverInstalled$43(List list) {
        return list;
    }

    static /* synthetic */ C11234e lambda$wasAppEverInstalled$45(List list) {
        return list.isEmpty() ? C11234e.m40025S(Boolean.FALSE) : C11234e.m40025S(Boolean.TRUE);
    }

    private boolean mapIndeterminate(RoomDownload roomDownload) {
        if (roomDownload == null) {
            return false;
        }
        switch (roomDownload.getOverallDownloadStatus()) {
        }
        return false;
    }

    private boolean mapIndeterminateState(RoomDownload roomDownload, InstallationState installationState) {
        return mapIndeterminate(roomDownload) || mapInstallIndeterminate(installationState.getStatus(), installationState.getType(), roomDownload);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean mapInstallIndeterminate(int r3, int r4, cm.aptoide.p092pt.database.room.RoomDownload r5) {
        /*
            r2 = this;
            r0 = 1
            r1 = 0
            switch(r3) {
                case 1: goto L13;
                case 2: goto La;
                case 3: goto L6;
                case 4: goto L13;
                case 5: goto L6;
                case 6: goto L13;
                default: goto L5;
            }
        L5:
            goto L13
        L6:
            if (r4 == 0) goto L13
        L8:
            r1 = 1
            goto L13
        La:
            if (r5 == 0) goto L13
            int r3 = r5.getOverallDownloadStatus()
            if (r3 != r0) goto L13
            goto L8
        L13:
            if (r5 == 0) goto L1c
            int r3 = r5.getOverallDownloadStatus()
            if (r3 != 0) goto L1c
            goto L1d
        L1c:
            r0 = r1
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.install.InstallManager.mapInstallIndeterminate(int, int, cm.aptoide.pt.database.room.RoomDownload):boolean");
    }

    private int mapInstallation(RoomDownload roomDownload) {
        if (roomDownload == null) {
            Logger.getInstance().m8273d(TAG, " download is null");
            return 0;
        }
        int overallProgress = roomDownload.getOverallProgress();
        Logger.getInstance().m8273d(TAG, " download is not null " + overallProgress + " state " + roomDownload.getOverallDownloadStatus());
        return overallProgress;
    }

    private Install.InstallationStatus mapInstallationStatus(RoomDownload roomDownload, InstallationState installationState) {
        return installationState.getStatus() == 4 ? Install.InstallationStatus.INSTALLED : (installationState.getStatus() != 3 || installationState.getType() == 0) ? installationState.getStatus() == 6 ? Install.InstallationStatus.UNINSTALLED : (installationState.getStatus() == 2 && roomDownload != null && roomDownload.getOverallDownloadStatus() == 1) ? Install.InstallationStatus.DOWNLOADING : installationState.getStatus() == 5 ? Install.InstallationStatus.INSTALLATION_TIMEOUT : lambda$getDownloadState$46(roomDownload) : Install.InstallationStatus.INSTALLING;
    }

    private C11231b sendBackgroundInstallFinishedBroadcast(final RoomDownload roomDownload) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.install.q0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10237f.m8233u(roomDownload);
            }
        });
    }

    private C11234e<String> startBackgroundInstallation(final String str, final boolean z, final boolean z2, final boolean z3) {
        return this.aptoideDownloadManager.getDownloadAsSingle(str).m39917e(C3471i3.f10120f).m39915A().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.j0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10192f.m8234v(z3, str, z, z2, (RoomDownload) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.a2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10067f.m8235w((RoomDownload) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                String str2 = str;
                InstallManager.lambda$startBackgroundInstallation$23(str2, (RoomDownload) obj);
                return str2;
            }
        });
    }

    private C11231b startDownload(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() != 1) {
            return this.aptoideDownloadManager.startDownload(roomDownload);
        }
        Logger.getInstance().m8273d(TAG, "Saving an already completed download to trigger the download installation");
        return this.downloadRepository.save(roomDownload);
    }

    private C11231b stopForegroundAndInstall(String str, int i2, boolean z, boolean z2) {
        Logger.getInstance().m8273d(TAG, "going to pop install from: " + str + "and download action: " + i2);
        if (i2 == 0) {
            return this.installer.install(str, z, z2);
        }
        if (i2 == 1) {
            return this.installer.update(str, z, z2);
        }
        if (i2 == 2) {
            return this.installer.downgrade(str, z, z2);
        }
        return C11231b.m39951s(new IllegalArgumentException("Invalid download action " + i2));
    }

    private C11231b updateDownloadAction(RoomDownload roomDownload, RoomDownload roomDownload2) {
        if (roomDownload2.getAction() == roomDownload.getAction()) {
            return C11231b.m39946e();
        }
        roomDownload2.setAction(roomDownload.getAction());
        return this.downloadRepository.save(roomDownload2);
    }

    public C11231b cancelInstall(String str, String str2, int i2) {
        return pauseInstall(str).m39973a(this.aptoideInstalledAppsRepository.remove(str2, i2)).m39973a(this.aptoideDownloadManager.cancelDownload(str)).m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.z1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    public C11231b cleanTimedOutInstalls() {
        return getTimedOutInstallations().m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10095f.m8216d((List) obj);
            }
        }).m40084Y0().m40083X0();
    }

    public C11234e<List<RoomInstalled>> fetchInstalled() {
        return this.aptoideInstalledAppsRepository.getAllInstalledSorted().m40057E().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.l1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                InstallManager.lambda$fetchInstalled$40(list);
                return list;
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                RoomInstalled roomInstalled = (RoomInstalled) obj;
                return Boolean.valueOf(!roomInstalled.isSystemApp());
            }
        }).m40084Y0();
    }

    public C11234e<List<RoomInstalled>> fetchInstalledExceptSystem() {
        return this.aptoideInstalledAppsRepository.getInstalledAppsFilterSystem();
    }

    public Single<Install> filterInstalled(final Install install) {
        return this.aptoideInstalledAppsRepository.isInstalled(install.getPackageName(), install.getVersionCode()).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.x1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return InstallManager.lambda$filterInstalled$42(install, (Boolean) obj);
            }
        });
    }

    public C11234e<Install> getCurrentInstallation() {
        return this.aptoideDownloadManager.getCurrentInProgressDownload().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.c1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomDownload) obj) != null);
            }
        }).m40095j0(Schedulers.m40658io()).m40113u(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((RoomDownload) obj).getMd5();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.u0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10254f.m8220h((RoomDownload) obj);
            }
        });
    }

    public Single<RoomDownload> getDownload(String str) {
        return this.downloadRepository.getDownloadAsSingle(str);
    }

    public C11234e<List<String>> getDownloadOutOfSpaceMd5List() {
        return this.downloadRepository.getOutOfSpaceDownloads().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.x0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                return Boolean.valueOf(!list.isEmpty());
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.q1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40020N((List) obj).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.n1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj2) {
                        return ((RoomDownload) obj2).getMd5();
                    }
                }).m40084Y0();
            }
        });
    }

    public C11234e<Install.InstallationStatus> getDownloadState(String str) {
        return this.aptoideDownloadManager.getDownloadAsObservable(str).m40057E().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.t0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10250f.m8221i((RoomDownload) obj);
            }
        });
    }

    public C11234e<Install> getInstall(final String str, final String str2, final int i2) {
        return C11234e.m40038d(this.aptoideDownloadManager.getDownloadsByMd5(str), this.installer.getState(str2, i2), getInstallationType(str2, i2), new InterfaceC11258g() { // from class: cm.aptoide.pt.install.y1
            @Override // p456rx.p460m.InterfaceC11258g
            /* renamed from: a */
            public final Object mo6864a(Object obj, Object obj2, Object obj3) {
                return this.f10274a.m8222j(str, str2, i2, (RoomDownload) obj, (InstallationState) obj2, (Install.InstallationType) obj3);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.f0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                Logger.getInstance().m8273d(InstallManager.TAG, ((Install) obj).toString());
            }
        });
    }

    public C11234e<List<Install>> getInstallations() {
        return C11234e.m40038d(this.aptoideDownloadManager.getDownloadsList(), this.aptoideInstalledAppsRepository.getAllInstalled(), this.aptoideInstalledAppsRepository.getAllInstalling(), new InterfaceC11258g() { // from class: cm.aptoide.pt.install.z0
            @Override // p456rx.p460m.InterfaceC11258g
            /* renamed from: a */
            public final Object mo6864a(Object obj, Object obj2, Object obj3) {
                return this.f10280a.createInstallList((List) obj, (List) obj2, (List) obj3);
            }
        }).m40111t();
    }

    public Single<Long> getInstalledAppSize(String str) {
        return this.aptoideInstalledAppsRepository.getInstalled(str).m40057E().m40085Z0().m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((RoomInstalled) obj).getAppSize();
            }
        });
    }

    public C11234e<List<Install>> getTimedOutInstallations() {
        return getInstallations().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.f1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40020N((List) obj).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.m0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Install) obj2).getState().equals(Install.InstallationStatus.INSTALLATION_TIMEOUT));
                    }
                }).m40084Y0();
            }
        });
    }

    public C11234e<String> handleNotEnoughSpaceForDownload(final RoomDownload roomDownload, final boolean z, final boolean z2, final boolean z3) {
        return this.fileManager.deleteCache(false).m40057E().m40085Z0().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.m1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10213f.m8223k(roomDownload, z, z2, z3, (Long) obj);
            }
        });
    }

    public Single<Boolean> hasNextDownload() {
        return this.aptoideDownloadManager.getCurrentActiveDownloads().m40057E().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.o0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                return Boolean.valueOf((list == null || list.isEmpty()) ? false : true);
            }
        }).m40085Z0();
    }

    /* renamed from: install, reason: merged with bridge method [inline-methods] */
    public C11231b m8236x(RoomDownload roomDownload) {
        return install(roomDownload, false, true);
    }

    public C11234e<Boolean> isInstalled(String str) {
        return this.aptoideInstalledAppsRepository.isInstalled(str).m40057E();
    }

    /* renamed from: mapDownloadState, reason: merged with bridge method [inline-methods] */
    public Install.InstallationStatus m8221i(RoomDownload roomDownload) {
        Install.InstallationStatus installationStatus;
        Install.InstallationStatus installationStatus2 = Install.InstallationStatus.UNINSTALLED;
        if (roomDownload == null) {
            Logger.getInstance().m8273d(TAG, "mapping a null Download state");
            return installationStatus2;
        }
        switch (roomDownload.getOverallDownloadStatus()) {
            case 0:
                installationStatus = Install.InstallationStatus.INITIAL_STATE;
                break;
            case 1:
            case 10:
            case 12:
            case 14:
            default:
                return installationStatus2;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 11:
            case 15:
                installationStatus = Install.InstallationStatus.DOWNLOADING;
                break;
            case 6:
                installationStatus = Install.InstallationStatus.PAUSED;
                break;
            case 9:
                int downloadError = roomDownload.getDownloadError();
                return downloadError != 1 ? downloadError != 2 ? installationStatus2 : Install.InstallationStatus.NOT_ENOUGH_SPACE_ERROR : Install.InstallationStatus.GENERIC_ERROR;
            case 13:
                installationStatus = Install.InstallationStatus.IN_QUEUE;
                break;
        }
        return installationStatus;
    }

    public C11231b onAppInstalled(final RoomInstalled roomInstalled) {
        return this.aptoideInstalledAppsRepository.getAsList(roomInstalled.getPackageName()).m40057E().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.e1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                InstallManager.lambda$onAppInstalled$28(roomInstalled, list);
                return list;
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.k1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10203f.m8229q(roomInstalled, (RoomInstalled) obj);
            }
        }).m40083X0();
    }

    public C11231b onAppRemoved(final String str) {
        return this.aptoideInstalledAppsRepository.getAsList(str).m40057E().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.h1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                InstallManager.lambda$onAppRemoved$30(list);
                return list;
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10105f.m8230r(str, (RoomInstalled) obj);
            }
        }).m40083X0();
    }

    public C11231b onUpdateConfirmed(RoomInstalled roomInstalled) {
        return onAppInstalled(roomInstalled);
    }

    public C11231b pauseInstall(String str) {
        return this.aptoideDownloadManager.pauseDownload(str);
    }

    public C11231b retryTimedOutInstallations() {
        return getTimedOutInstallations().m40057E().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.v1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                InstallManager.lambda$retryTimedOutInstallations$34(list);
                return list;
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.r1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10243f.m8231s((Install) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.n0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10223f.m8232t((RoomDownload) obj);
            }
        }).m40083X0();
    }

    public void rootInstallAllowed(boolean z) {
        SecurePreferences.setRootDialogShowed(true, this.securePreferences);
        ManagerPreferences.setAllowRootInstallation(z, this.sharedPreferences);
    }

    public boolean showWarning() {
        return (!this.rootAvailabilityManager.isRootAvailable().m39933y().m40633b().booleanValue() || SecurePreferences.isRootDialogShowed(this.securePreferences) || ManagerPreferences.allowRootInstallation(this.securePreferences)) ? false : true;
    }

    public C11231b splitInstall(RoomDownload roomDownload) {
        return install(roomDownload, false, true);
    }

    public void start() {
        this.aptoideDownloadManager.start();
        dispatchInstallationCandidates();
        this.installer.dispatchInstallations();
    }

    public C11234e<Boolean> startInstalls(List<RoomDownload> list) {
        return C11234e.m40020N(list).m40090e1(C11234e.m40023Q(0L, 1L, TimeUnit.SECONDS), new InterfaceC11257f() { // from class: cm.aptoide.pt.install.i0
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                RoomDownload roomDownload = (RoomDownload) obj;
                InstallManager.lambda$startInstalls$24(roomDownload, (Long) obj2);
                return roomDownload;
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10231f.m8236x((RoomDownload) obj);
            }
        }).m40084Y0().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.w1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.s1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        });
    }

    public void stop() {
        this.aptoideDownloadManager.stop();
        this.installer.stopDispatching();
    }

    public C11231b uninstallApp(String str) {
        return this.installer.uninstall(str);
    }

    public boolean wasAppEverInstalled(final String str) {
        return ((Boolean) this.aptoideInstalledAppsRepository.getInstallationsHistory().m40057E().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                InstallManager.lambda$wasAppEverInstalled$43(list);
                return list;
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.y0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((RoomInstallation) obj).getPackageName()));
            }
        }).m40084Y0().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.k0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return InstallManager.lambda$wasAppEverInstalled$45((List) obj);
            }
        }).m40081W0().m40551b()).booleanValue();
    }

    public C11231b install(RoomDownload roomDownload, boolean z) {
        return install(roomDownload, false, z);
    }

    private C11231b install(final RoomDownload roomDownload, final boolean z, final boolean z2) {
        return this.aptoideDownloadManager.getDownloadAsSingle(roomDownload.getMd5()).m39917e(C3471i3.f10120f).m39915A().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10082f.m8224l(roomDownload, (RoomDownload) obj);
            }
        }).m40112t0(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.p1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10232f.m8225m(roomDownload, (C11234e) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.t1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10251f.m8226n((RoomDownload) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.v0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10259f.m8227o((RoomDownload) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.b2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10074f.m8228p(z, z2, roomDownload, (RoomDownload) obj);
            }
        }).m40083X0();
    }
}
