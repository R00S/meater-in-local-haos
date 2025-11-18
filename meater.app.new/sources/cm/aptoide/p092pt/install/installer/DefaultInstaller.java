package cm.aptoide.p092pt.install.installer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.content.FileProvider;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.room.RoomFileToDownload;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.downloadmanager.Constants;
import cm.aptoide.p092pt.install.AppInstallerStatusReceiver;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.Installer;
import cm.aptoide.p092pt.install.InstallerAnalytics;
import cm.aptoide.p092pt.install.RootCommandTimeoutException;
import cm.aptoide.p092pt.install.RootInstallerProvider;
import cm.aptoide.p092pt.install.exception.InstallationException;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.packageinstaller.AppInstall;
import cm.aptoide.p092pt.packageinstaller.AppInstaller;
import cm.aptoide.p092pt.packageinstaller.InstallStatus;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import cm.aptoide.p092pt.root.RootShell;
import cm.aptoide.p092pt.utils.BroadcastRegisterOnSubscribe;
import cm.aptoide.p092pt.utils.FileUtils;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;
import p456rx.p474t.C11426b;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class DefaultInstaller implements Installer {
    public static final String OBB_FOLDER = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb/";
    private static final String TAG = DefaultInstaller.class.getSimpleName();
    private final AppInstaller appInstaller;
    private final AppInstallerStatusReceiver appInstallerStatusReceiver;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final Context context;
    private final FileUtils fileUtils;
    private final InstallationProvider installationProvider;
    private final InstallerAnalytics installerAnalytics;
    private final int installingStateTimeout;
    private final PackageManager packageManager;
    private final RootAvailabilityManager rootAvailabilityManager;
    private final RootInstallerProvider rootInstallerProvider;
    private final SharedPreferences sharedPreferences;
    private final C11426b dispatchInstallationsSubscription = new C11426b();
    private final C11418b<InstallationCandidate> installCandidateSubject = C11418b.m40637g1();

    /* renamed from: cm.aptoide.pt.install.installer.DefaultInstaller$1 */
    static /* synthetic */ class C34721 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status;

        static {
            int[] iArr = new int[InstallStatus.Status.values().length];
            $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status = iArr;
            try {
                iArr[InstallStatus.Status.INSTALLING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status[InstallStatus.Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status[InstallStatus.Status.WAITING_INSTALL_FEEDBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status[InstallStatus.Status.FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status[InstallStatus.Status.CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status[InstallStatus.Status.UNKNOWN_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public DefaultInstaller(PackageManager packageManager, InstallationProvider installationProvider, AppInstaller appInstaller, FileUtils fileUtils, boolean z, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, int i2, RootAvailabilityManager rootAvailabilityManager, SharedPreferences sharedPreferences, InstallerAnalytics installerAnalytics, int i3, AppInstallerStatusReceiver appInstallerStatusReceiver, RootInstallerProvider rootInstallerProvider, Context context) {
        this.packageManager = packageManager;
        this.installationProvider = installationProvider;
        this.appInstaller = appInstaller;
        this.fileUtils = fileUtils;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
        this.installerAnalytics = installerAnalytics;
        this.appInstallerStatusReceiver = appInstallerStatusReceiver;
        this.rootInstallerProvider = rootInstallerProvider;
        RootShell.debugMode = z;
        RootShell.defaultCommandTimeout = i2;
        this.rootAvailabilityManager = rootAvailabilityManager;
        this.sharedPreferences = sharedPreferences;
        this.installingStateTimeout = i3;
        this.context = context;
    }

    private C11234e<Installation> defaultInstall(final Context context, final Installation installation, final boolean z) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme(Constants.PACKAGE);
        return C11234e.m40033a0(handleInstallationResult(intentFilter, installation, z), C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.install.installer.z
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f10187f.m8250b(installation, z, context);
                return null;
            }
        })).m40065I0(Schedulers.computation()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Installation installation2 = installation;
                DefaultInstaller.lambda$defaultInstall$30(installation2, obj);
                return installation2;
            }
        });
    }

    private C11234e<Installation> handleInstallationResult(IntentFilter intentFilter, final Installation installation, final boolean z) {
        return C11234e.m40033a0(waitPackageIntent(this.context, intentFilter, installation.getPackageName()).m40078S0(this.installingStateTimeout, TimeUnit.MILLISECONDS, C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.install.installer.p
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f10164f.m8256h(installation, z);
                return null;
            }
        })), this.appInstallerStatusReceiver.getInstallerInstallStatus().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.q
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10168f.m8257i(installation, (InstallStatus) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(installation.getPackageName().equalsIgnoreCase(((InstallStatus) obj).getPackageName()));
            }
        }).m40111t().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.n
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10158f.m8258j(installation, z, (InstallStatus) obj);
            }
        })).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Installation installation2 = installation;
                DefaultInstaller.lambda$handleInstallationResult$35(installation2, obj);
                return installation2;
            }
        });
    }

    private boolean isInstalled(String str, int i2) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = this.packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode == i2;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private boolean isSystem(Context context) {
        try {
            return (this.packageManager.getApplicationInfo(context.getPackageName(), 0).flags & 1) == 1;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new AssertionError("Aptoide application not found by package manager.");
        }
    }

    private /* synthetic */ Void lambda$defaultInstall$29(Installation installation, boolean z, Context context) throws Exception {
        AppInstall map = map(installation);
        if (z) {
            this.appInstaller.install(map);
            return null;
        }
        updateInstallation(installation, z ? 3 : 0, 3);
        startInstallIntent(context, installation.getFile());
        return null;
    }

    static /* synthetic */ Installation lambda$defaultInstall$30(Installation installation, Object obj) {
        return installation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchInstallations$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8251c(InstallationCandidate installationCandidate) {
        return moveInstallationFiles(installationCandidate.getInstallation()).m39974b(C11234e.m40025S(installationCandidate));
    }

    static /* synthetic */ void lambda$dispatchInstallations$11(Installation installation) {
    }

    static /* synthetic */ Installation lambda$dispatchInstallations$2(Installation installation, Object obj) {
        return installation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchInstallations$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8252d(InstallationCandidate installationCandidate, Boolean bool) {
        final Installation installation = installationCandidate.getInstallation();
        if (!bool.booleanValue()) {
            return installationCandidate.getForceDefaultInstall() ? startDefaultInstallation(this.context, installation, false) : startInstallation(this.context, installation, installationCandidate.getShouldSetPackageInstaller());
        }
        installation.setStatus(4);
        return installation.save().m39968M().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.j0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Installation installation2 = installation;
                DefaultInstaller.lambda$dispatchInstallations$2(installation2, obj);
                return installation2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchInstallations$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8253e(final InstallationCandidate installationCandidate) {
        return C11234e.m40025S(Boolean.valueOf(isInstalled(installationCandidate.getInstallation().getPackageName(), installationCandidate.getInstallation().getVersionCode()))).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }).m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10151f.m8252d(installationCandidate, (Boolean) obj);
            }
        });
    }

    static /* synthetic */ void lambda$dispatchInstallations$6(Installation installation) {
    }

    static /* synthetic */ Installation lambda$dispatchInstallations$8(Installation installation, RoomInstalled roomInstalled) {
        return installation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchInstallations$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8254f(final Installation installation) {
        return this.aptoideInstalledAppsRepository.get(installation.getPackageName(), installation.getVersionCode()).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomInstalled) obj).getStatus() == 4);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Installation installation2 = installation;
                DefaultInstaller.lambda$dispatchInstallations$8(installation2, (RoomInstalled) obj);
                return installation2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downgrade$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8255g(Installation installation) {
        return uninstall(installation.getPackageName());
    }

    static /* synthetic */ InstallationState lambda$getState$18(String str, int i2, RoomInstalled roomInstalled) {
        return roomInstalled != null ? new InstallationState(roomInstalled.getPackageName(), roomInstalled.getVersionCode(), roomInstalled.getVersionName(), roomInstalled.getStatus(), roomInstalled.getType(), roomInstalled.getName(), roomInstalled.getIcon(), roomInstalled.getAppSize().longValue()) : new InstallationState(str, i2, 1, -1);
    }

    private /* synthetic */ Void lambda$handleInstallationResult$31(Installation installation, boolean z) throws Exception {
        if (installation.getStatus() != 3) {
            return null;
        }
        updateInstallation(installation, z ? 3 : 0, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallationResult$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8257i(Installation installation, InstallStatus installStatus) {
        if (InstallStatus.Status.CANCELED.equals(installStatus.getStatus())) {
            this.installerAnalytics.logInstallCancelEvent(installation.getPackageName(), installation.getVersionCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallationResult$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8258j(Installation installation, boolean z, InstallStatus installStatus) {
        Logger.getInstance().m8273d("Installer", "status: " + installStatus.getStatus().name() + " " + installation.getPackageName());
        updateInstallation(installation, z ? 3 : 0, map(installStatus));
    }

    static /* synthetic */ Installation lambda$handleInstallationResult$35(Installation installation, Object obj) {
        return installation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$install$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8259k(Boolean bool) {
        this.installerAnalytics.installationType(ManagerPreferences.allowRootInstallation(this.sharedPreferences), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$install$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8260l(String str, Boolean bool) {
        return this.installationProvider.getInstallation(str).m40057E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$install$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8261m(boolean z, boolean z2, Installation installation) {
        installation.setStatus(3);
        installation.setType(-1);
        this.installCandidateSubject.onNext(new InstallationCandidate(installation, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$moveInstallationFiles$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8262n(Installation installation) {
        String str = OBB_FOLDER + installation.getPackageName() + "/";
        this.fileUtils.deleteDir(new File(str));
        for (RoomFileToDownload roomFileToDownload : installation.getFiles()) {
            if (roomFileToDownload.getFileType() == 1 && FileUtils.fileExists(roomFileToDownload.getFilePath()) && !roomFileToDownload.getPath().equals(str)) {
                this.fileUtils.copyFile(roomFileToDownload.getPath(), str, roomFileToDownload.getFileName());
                roomFileToDownload.setPath(str);
            }
        }
    }

    static /* synthetic */ Installation lambda$rootInstall$24(Installation installation, Void r1) {
        return installation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$rootInstall$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8263o(Installation installation, Throwable th) {
        return th instanceof RootCommandTimeoutException ? updateInstallation(installation, 1, 5).save().m39968M() : C11234e.m40017C(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startInstallation$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8264p(Installation installation, Throwable th) {
        return rootInstall(installation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startInstallation$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8265q(Context context, Installation installation, boolean z, Throwable th) {
        return defaultInstall(context, installation, z);
    }

    static /* synthetic */ Installation lambda$systemInstall$28(Installation installation, Void r1) {
        return installation;
    }

    private /* synthetic */ Void lambda$uninstall$16(String str, Uri uri) throws Exception {
        startUninstallIntent(this.context, str, uri);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$uninstall$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8267s(IntentFilter intentFilter, String str, Void r3) {
        return waitPackageIntent(this.context, intentFilter, str);
    }

    static /* synthetic */ Void lambda$waitPackageIntent$37(Intent intent) {
        return null;
    }

    private AppInstall map(Installation installation) {
        AppInstall.InstallBuilder baseApk = AppInstall.builder().setPackageName(installation.getPackageName()).setBaseApk(installation.getFile());
        for (RoomFileToDownload roomFileToDownload : installation.getFiles()) {
            if (3 == roomFileToDownload.getFileType()) {
                baseApk.addApkSplit(new File(roomFileToDownload.getFilePath()));
            }
        }
        return baseApk.build();
    }

    private C11231b moveInstallationFiles(final Installation installation) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.install.installer.f0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10136f.m8262n(installation);
            }
        }).m39973a(installation.saveFileChanges()).m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.o
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m39958A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInstallationFiles(Installation installation) {
        for (RoomFileToDownload roomFileToDownload : installation.getFiles()) {
            if (roomFileToDownload.getFileType() != 1) {
                FileUtils.removeFile(roomFileToDownload.getFilePath());
                Logger.getInstance().m8273d(TAG, "removing the file " + roomFileToDownload.getFilePath() + " " + roomFileToDownload.getFileName());
            }
        }
    }

    private C11234e<Installation> rootInstall(final Installation installation) {
        return ManagerPreferences.allowRootInstallation(this.sharedPreferences) ? C11234e.m40048l(this.rootInstallerProvider.provideRootInstaller(installation)).m40065I0(Schedulers.computation()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Installation installation2 = installation;
                DefaultInstaller.lambda$rootInstall$24(installation2, (Void) obj);
                return installation2;
            }
        }).m40054C0(updateInstallation(installation, 1, 3)).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10149f.m8263o(installation, (Throwable) obj);
            }
        }) : C11234e.m40017C(new InstallationException("User doesn't allow root installation"));
    }

    private C11234e<Installation> startDefaultInstallation(Context context, Installation installation, boolean z) {
        return defaultInstall(context, installation, z).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Installation installation2 = (Installation) obj;
                return installation2.save().m39974b(C11234e.m40025S(installation2));
            }
        });
    }

    private void startInstallIntent(Context context, File file) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uriM1666e = Build.VERSION.SDK_INT > 23 ? FileProvider.m1666e(context, "cm.aptoide.pt.provider", file) : Uri.fromFile(file);
        Logger.getInstance().m8283v(TAG, uriM1666e.toString());
        intent.setDataAndType(uriM1666e, "application/vnd.android.package-archive");
        intent.setFlags(268435459);
        context.startActivity(intent);
    }

    private C11234e<Installation> startInstallation(final Context context, final Installation installation, final boolean z) {
        return systemInstall(context, installation).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10140f.m8264p(installation, (Throwable) obj);
            }
        }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.m0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10154f.m8265q(context, installation, z, (Throwable) obj);
            }
        }).m40117w(C3514t0.f10176f).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Installation installation2 = (Installation) obj;
                return installation2.save().m39974b(C11234e.m40025S(installation2));
            }
        });
    }

    private void startUninstallIntent(Context context, String str, Uri uri) throws InstallationException, PackageManager.NameNotFoundException {
        try {
            this.packageManager.getPackageInfo(str, 0);
            Intent intent = new Intent("android.intent.action.UNINSTALL_PACKAGE", uri);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (PackageManager.NameNotFoundException e2) {
            CrashReport.getInstance().log(e2);
            throw new InstallationException(e2);
        }
    }

    private C11234e<Installation> systemInstall(Context context, final Installation installation) {
        return isSystem(context) ? Build.VERSION.SDK_INT >= 28 ? defaultInstall(context, installation, true) : C11234e.m40048l(new SystemInstallOnSubscribe(context, this.packageManager, Uri.fromFile(installation.getFile()))).m40065I0(Schedulers.computation()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Installation installation2 = installation;
                DefaultInstaller.lambda$systemInstall$28(installation2, (Void) obj);
                return installation2;
            }
        }).m40054C0(updateInstallation(installation, 2, 3)) : C11234e.m40017C(new Throwable());
    }

    private Installation updateInstallation(Installation installation, int i2, int i3) {
        installation.setType(i2);
        installation.setStatus(i3);
        return installation;
    }

    private C11234e<Void> waitPackageIntent(Context context, IntentFilter intentFilter, final String str) {
        return C11234e.m40048l(new BroadcastRegisterOnSubscribe(context, intentFilter, null, null)).m40059F(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Intent) obj).getData().toString().contains(str));
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                DefaultInstaller.lambda$waitPackageIntent$37((Intent) obj);
                return null;
            }
        });
    }

    /* renamed from: b */
    public /* synthetic */ Void m8250b(Installation installation, boolean z, Context context) throws Exception {
        lambda$defaultInstall$29(installation, z, context);
        return null;
    }

    @Override // cm.aptoide.p092pt.install.Installer
    public synchronized void dispatchInstallations() {
        C11426b c11426b = this.dispatchInstallationsSubscription;
        C11234e c11234eM40110s0 = this.installCandidateSubject.m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.k0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10148f.m8251c((InstallationCandidate) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10145f.m8253e((InstallationCandidate) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }).m40110s0();
        C3518w c3518w = new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.w
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DefaultInstaller.lambda$dispatchInstallations$6((Installation) obj);
            }
        };
        C3514t0 c3514t0 = C3514t0.f10176f;
        c11426b.m40667a(c11234eM40110s0.m40063H0(c3518w, c3514t0));
        this.dispatchInstallationsSubscription.m40667a(this.installCandidateSubject.m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.u0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((InstallationCandidate) obj).getInstallation();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10177f.m8254f((Installation) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.b0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10125f.removeInstallationFiles((Installation) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.s
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }).m40110s0().m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.r
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DefaultInstaller.lambda$dispatchInstallations$11((Installation) obj);
            }
        }, c3514t0));
    }

    @Override // cm.aptoide.p092pt.install.Installer
    public C11231b downgrade(String str, boolean z, boolean z2) {
        return this.installationProvider.getInstallation(str).m40057E().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10143f.m8255g((Installation) obj);
            }
        }).m40083X0().m39973a(install(str, z, z2));
    }

    public PackageManager getPackageManager() {
        return this.packageManager;
    }

    @Override // cm.aptoide.p092pt.install.Installer
    public C11234e<InstallationState> getState(final String str, final int i2) {
        return this.aptoideInstalledAppsRepository.getAsList(str, i2).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DefaultInstaller.lambda$getState$18(str, i2, (RoomInstalled) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.i0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                InstallationState installationState = (InstallationState) obj;
                Logger.getInstance().m8273d("AptoideDownloadManager", "creating an installation state " + installationState.getPackageName() + " state is: " + installationState.getStatus());
            }
        }).m40111t();
    }

    /* renamed from: h */
    public /* synthetic */ Void m8256h(Installation installation, boolean z) throws Exception {
        lambda$handleInstallationResult$31(installation, z);
        return null;
    }

    @Override // cm.aptoide.p092pt.install.Installer
    public C11231b install(final String str, final boolean z, final boolean z2) {
        return this.rootAvailabilityManager.isRootAvailable().m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10124f.m8259k((Boolean) obj);
            }
        }).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.a0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10122f.m8260l(str, (Boolean) obj);
            }
        }).m40095j0(Schedulers.computation()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10184f.m8261m(z, z2, (Installation) obj);
            }
        }).m40117w(C3514t0.f10176f).m40057E().m40085Z0().m39934z();
    }

    /* renamed from: r */
    public /* synthetic */ Void m8266r(String str, Uri uri) throws Exception {
        lambda$uninstall$16(str, uri);
        return null;
    }

    @Override // cm.aptoide.p092pt.install.Installer
    public void stopDispatching() {
        this.dispatchInstallationsSubscription.m40668b();
        if (this.dispatchInstallationsSubscription.isUnsubscribed()) {
            return;
        }
        this.dispatchInstallationsSubscription.unsubscribe();
    }

    @Override // cm.aptoide.p092pt.install.Installer
    public C11231b uninstall(final String str) {
        final Uri uriFromParts = Uri.fromParts(Constants.PACKAGE, str, null);
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme(Constants.PACKAGE);
        return C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.install.installer.d
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f10128f.m8266r(str, uriFromParts);
                return null;
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.installer.v
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10179f.m8267s(intentFilter, str, (Void) obj);
            }
        }).m40083X0();
    }

    @Override // cm.aptoide.p092pt.install.Installer
    public C11231b update(String str, boolean z, boolean z2) {
        return install(str, z, z2);
    }

    private int map(InstallStatus installStatus) {
        int i2 = C34721.$SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status[installStatus.getStatus().ordinal()];
        if (i2 == 1) {
            return 3;
        }
        if (i2 != 2) {
            return i2 != 3 ? 1 : 6;
        }
        return 4;
    }
}
