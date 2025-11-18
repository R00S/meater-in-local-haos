package cm.aptoide.p092pt.install;

import android.app.IntentService;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.ads.MinimalAdMapper;
import cm.aptoide.p092pt.app.CampaignAnalytics;
import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallManager;
import cm.aptoide.p092pt.app.migration.AppcMigrationManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.RoomStoredMinimalAdPersistence;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.database.room.RoomStoredMinimalAd;
import cm.aptoide.p092pt.dataprovider.ads.AdNetworkUtils;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import cm.aptoide.p092pt.updates.UpdateRepository;
import cm.aptoide.p092pt.util.ReferrerUtils;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.FileUtils;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import p456rx.C11231b;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p474t.C11426b;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class InstalledIntentService extends IntentService {
    private static final String TAG = InstalledIntentService.class.getName();
    private MinimalAdMapper adMapper;

    @Inject
    AppcMigrationManager appcMigrationManager;

    @Inject
    AptoideInstallManager aptoideInstallManager;

    @Inject
    CampaignAnalytics campaignAnalytics;

    @Inject
    FileUtils fileUtils;

    @Inject
    InstallAnalytics installAnalytics;
    private InstallManager installManager;
    private PackageManager packageManager;

    @Inject
    RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence;
    private RootAvailabilityManager rootAvailabilityManager;
    private SharedPreferences sharedPreferences;
    private C11426b subscriptions;

    @Inject
    UpdateRepository updatesRepository;

    public InstalledIntentService() {
        super("InstalledIntentService");
    }

    private void checkAndBroadcastReferrer(final String str) {
        this.subscriptions.m40667a(this.roomStoredMinimalAdPersistence.get(str).m40095j0(Schedulers.m40658io()).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.j2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10198f.m8237a(str, (RoomStoredMinimalAd) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.l2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                InstalledIntentService.lambda$checkAndBroadcastReferrer$3((RoomStoredMinimalAd) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.install.h2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }

    private boolean checkAndLogNullPackageInfo(PackageInfo packageInfo, String str) {
        if (packageInfo != null) {
            return false;
        }
        CrashReport.getInstance().log(new IllegalArgumentException("PackageName null for package " + str));
        return true;
    }

    private PackageInfo databaseOnPackageAdded(String str) {
        PackageInfo packageInfo = AptoideUtils.SystemU.getPackageInfo(str, getPackageManager());
        if (checkAndLogNullPackageInfo(packageInfo, str)) {
            return packageInfo;
        }
        this.installManager.onAppInstalled(new RoomInstalled(packageInfo, this.packageManager, this.fileUtils)).m39965I(new InterfaceC11252a() { // from class: cm.aptoide.pt.install.d2
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                InstalledIntentService.lambda$databaseOnPackageAdded$0();
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.install.k2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
        return packageInfo;
    }

    private void databaseOnPackageRemoved(final String str) {
        this.installManager.onAppRemoved(str).m39973a(this.updatesRepository.remove(str)).m39965I(new InterfaceC11252a() { // from class: cm.aptoide.pt.install.f2
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                Logger.getInstance().m8273d(InstalledIntentService.TAG, "databaseOnPackageRemoved: " + str);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.install.i2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    private PackageInfo databaseOnPackageReplaced(final String str) {
        PackageInfo packageInfo = AptoideUtils.SystemU.getPackageInfo(str, getPackageManager());
        if (checkAndLogNullPackageInfo(packageInfo, str)) {
            return packageInfo;
        }
        this.installManager.onUpdateConfirmed(new RoomInstalled(packageInfo, this.packageManager, this.fileUtils)).m39973a(this.updatesRepository.remove(str)).m39965I(new InterfaceC11252a() { // from class: cm.aptoide.pt.install.g2
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                Logger.getInstance().m8273d(InstalledIntentService.TAG, "databaseOnPackageReplaced: " + str);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.install.e2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
        return packageInfo;
    }

    private C11231b knockCpi(final String str, final RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence, final RoomStoredMinimalAd roomStoredMinimalAd) {
        return C11231b.m39953u(new Callable() { // from class: cm.aptoide.pt.install.m2
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f10218f.m8238b(str, roomStoredMinimalAd, roomStoredMinimalAdPersistence);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$checkAndBroadcastReferrer$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8237a(String str, RoomStoredMinimalAd roomStoredMinimalAd) {
        if (roomStoredMinimalAd != null) {
            return knockCpi(str, this.roomStoredMinimalAdPersistence, roomStoredMinimalAd);
        }
        return null;
    }

    static /* synthetic */ void lambda$checkAndBroadcastReferrer$3(RoomStoredMinimalAd roomStoredMinimalAd) {
    }

    static /* synthetic */ void lambda$databaseOnPackageAdded$0() {
    }

    private /* synthetic */ Object lambda$knockCpi$9(String str, RoomStoredMinimalAd roomStoredMinimalAd, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) throws Exception {
        ReferrerUtils.broadcastReferrer(str, roomStoredMinimalAd.getReferrer(), getApplicationContext());
        AdNetworkUtils.knockCpi(this.adMapper.map(roomStoredMinimalAd));
        roomStoredMinimalAdPersistence.remove(roomStoredMinimalAd);
        return null;
    }

    private void reportPackageInfoNullEvent() {
        CrashReport.getInstance().log(new NullPointerException("PackageInfo is null."));
    }

    private void sendCampaignConversion(String str, PackageInfo packageInfo) {
        if (packageInfo != null) {
            this.campaignAnalytics.convertCampaignEvent(str, packageInfo.versionCode);
        } else {
            reportPackageInfoNullEvent();
        }
    }

    private void sendInstallEvent(String str, PackageInfo packageInfo) {
        if (packageInfo != null) {
            this.installAnalytics.installCompleted(str, packageInfo.versionCode, this.rootAvailabilityManager.isRootAvailable().m39933y().m40633b().booleanValue(), ManagerPreferences.allowRootInstallation(this.sharedPreferences));
        } else {
            reportPackageInfoNullEvent();
        }
    }

    private void sendUninstallEvent(String str) {
        this.installAnalytics.uninstallCompleted(str);
    }

    /* renamed from: b */
    public /* synthetic */ Object m8238b(String str, RoomStoredMinimalAd roomStoredMinimalAd, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) throws Exception {
        lambda$knockCpi$9(str, roomStoredMinimalAd, roomStoredMinimalAdPersistence);
        return null;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        ((AptoideApplication) getApplicationContext()).getApplicationComponent().inject(this);
        this.adMapper = new MinimalAdMapper();
        this.sharedPreferences = ((AptoideApplication) getApplicationContext()).getDefaultSharedPreferences();
        ((AptoideApplication) getApplicationContext()).getDefaultSharedPreferences();
        this.subscriptions = new C11426b();
        this.installManager = ((AptoideApplication) getApplicationContext()).getInstallManager();
        this.rootAvailabilityManager = ((AptoideApplication) getApplicationContext()).getRootAvailabilityManager();
        this.packageManager = getPackageManager();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onHandleIntent(android.content.Intent r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L59
            java.lang.String r0 = r6.getAction()
            android.net.Uri r1 = r6.getData()
            java.lang.String r1 = r1.getEncodedSchemeSpecificPart()
            java.lang.String r2 = "android.intent.action.PACKAGE_REPLACED"
            boolean r3 = android.text.TextUtils.equals(r0, r2)
            r4 = 0
            if (r3 != 0) goto L20
            java.lang.String r3 = "android.intent.extra.REPLACING"
            boolean r6 = r6.getBooleanExtra(r3, r4)
            if (r6 == 0) goto L20
            return
        L20:
            r0.hashCode()
            r6 = -1
            int r3 = r0.hashCode()
            switch(r3) {
                case -810471698: goto L43;
                case 525384130: goto L38;
                case 1544582882: goto L2d;
                default: goto L2b;
            }
        L2b:
            r4 = -1
            goto L4a
        L2d:
            java.lang.String r2 = "android.intent.action.PACKAGE_ADDED"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L36
            goto L2b
        L36:
            r4 = 2
            goto L4a
        L38:
            java.lang.String r2 = "android.intent.action.PACKAGE_REMOVED"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L41
            goto L2b
        L41:
            r4 = 1
            goto L4a
        L43:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4a
            goto L2b
        L4a:
            switch(r4) {
                case 0: goto L56;
                case 1: goto L52;
                case 2: goto L4e;
                default: goto L4d;
            }
        L4d:
            goto L59
        L4e:
            r5.onPackageAdded(r1)
            goto L59
        L52:
            r5.onPackageRemoved(r1)
            goto L59
        L56:
            r5.onPackageReplaced(r1)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.install.InstalledIntentService.onHandleIntent(android.content.Intent):void");
    }

    protected void onPackageAdded(String str) {
        Logger.getInstance().m8273d(TAG, "Package added: " + str);
        PackageInfo packageInfoDatabaseOnPackageAdded = databaseOnPackageAdded(str);
        checkAndBroadcastReferrer(str);
        sendInstallEvent(str, packageInfoDatabaseOnPackageAdded);
        sendCampaignConversion(str, packageInfoDatabaseOnPackageAdded);
        this.appcMigrationManager.persistCandidate(str);
        this.aptoideInstallManager.persistCandidate(str);
    }

    protected void onPackageRemoved(String str) {
        Logger.getInstance().m8273d(TAG, "Packaged removed: " + str);
        sendUninstallEvent(str);
        databaseOnPackageRemoved(str);
    }

    protected void onPackageReplaced(String str) {
        Logger.getInstance().m8273d(TAG, "Packaged replaced: " + str);
        PackageInfo packageInfoDatabaseOnPackageReplaced = databaseOnPackageReplaced(str);
        sendInstallEvent(str, packageInfoDatabaseOnPackageReplaced);
        sendCampaignConversion(str, packageInfoDatabaseOnPackageReplaced);
        this.aptoideInstallManager.persistCandidate(str);
    }
}
