package cm.aptoide.p092pt.database.room;

import android.database.SQLException;
import androidx.room.AbstractC0651j;
import androidx.room.C0642a;
import androidx.room.C0648g;
import androidx.room.C0653l;
import androidx.room.p010t.C0663c;
import androidx.room.p010t.C0667g;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import java.util.HashMap;
import java.util.HashSet;
import p024c.p082u.p083a.InterfaceC1008b;
import p024c.p082u.p083a.InterfaceC1009c;

/* loaded from: classes.dex */
public final class AptoideDatabase_Impl extends AptoideDatabase {
    private volatile AppComingSoonRegistrationDAO _appComingSoonRegistrationDAO;
    private volatile AptoideInstallDao _aptoideInstallDao;
    private volatile DownloadDAO _downloadDAO;
    private volatile EventDAO _eventDAO;
    private volatile ExperimentDAO _experimentDAO;
    private volatile InstallationDao _installationDao;
    private volatile InstalledDao _installedDao;
    private volatile LocalNotificationSyncDao _localNotificationSyncDao;
    private volatile MigratedAppDAO _migratedAppDAO;
    private volatile NotificationDao _notificationDao;
    private volatile StoreDao _storeDao;
    private volatile StoredMinimalAdDAO _storedMinimalAdDAO;
    private volatile UpdateDao _updateDao;

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public AppComingSoonRegistrationDAO appComingSoonRegistrationDAO() {
        AppComingSoonRegistrationDAO appComingSoonRegistrationDAO;
        if (this._appComingSoonRegistrationDAO != null) {
            return this._appComingSoonRegistrationDAO;
        }
        synchronized (this) {
            if (this._appComingSoonRegistrationDAO == null) {
                this._appComingSoonRegistrationDAO = new AppComingSoonRegistrationDAO_Impl(this);
            }
            appComingSoonRegistrationDAO = this._appComingSoonRegistrationDAO;
        }
        return appComingSoonRegistrationDAO;
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public AptoideInstallDao aptoideInstallDao() {
        AptoideInstallDao aptoideInstallDao;
        if (this._aptoideInstallDao != null) {
            return this._aptoideInstallDao;
        }
        synchronized (this) {
            if (this._aptoideInstallDao == null) {
                this._aptoideInstallDao = new AptoideInstallDao_Impl(this);
            }
            aptoideInstallDao = this._aptoideInstallDao;
        }
        return aptoideInstallDao;
    }

    @Override // androidx.room.AbstractC0651j
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        InterfaceC1008b interfaceC1008bMo4666s0 = super.getOpenHelper().mo4666s0();
        try {
            super.beginTransaction();
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `event`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `experiment`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `storedMinimalAd`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `notification`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `localNotificationSync`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `installed`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `installation`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `migratedapp`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `update`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `download`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `store`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `aptoideinstallapp`");
            interfaceC1008bMo4666s0.mo6461v("DELETE FROM `appComingSoonRegistration`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            interfaceC1008bMo4666s0.mo6460u0("PRAGMA wal_checkpoint(FULL)").close();
            if (!interfaceC1008bMo4666s0.mo6453P0()) {
                interfaceC1008bMo4666s0.mo6461v("VACUUM");
            }
        }
    }

    @Override // androidx.room.AbstractC0651j
    protected C0648g createInvalidationTracker() {
        return new C0648g(this, new HashMap(0), new HashMap(0), "event", "experiment", "storedMinimalAd", "notification", "localNotificationSync", "installed", "installation", "migratedapp", "update", DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, AccountAnalytics.STORE, "aptoideinstallapp", "appComingSoonRegistration");
    }

    @Override // androidx.room.AbstractC0651j
    protected InterfaceC1009c createOpenHelper(C0642a c0642a) {
        return c0642a.f4236a.mo4667a(InterfaceC1009c.b.m6465a(c0642a.f4237b).m6468c(c0642a.f4238c).m6467b(new C0653l(c0642a, new C0653l.a(109) { // from class: cm.aptoide.pt.database.room.AptoideDatabase_Impl.1
            @Override // androidx.room.C0653l.a
            public void createAllTables(InterfaceC1008b interfaceC1008b) throws SQLException {
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `event` (`timestamp` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventName` TEXT, `action` INTEGER NOT NULL, `context` TEXT, `data` TEXT)");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `experiment` (`experimentName` TEXT NOT NULL, `requestTime` INTEGER NOT NULL, `assignment` TEXT, `payload` TEXT, `partOfExperiment` INTEGER NOT NULL, `experimentOver` INTEGER NOT NULL, PRIMARY KEY(`experimentName`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `storedMinimalAd` (`packageName` TEXT NOT NULL, `referrer` TEXT, `cpcUrl` TEXT, `cpdUrl` TEXT, `cpiUrl` TEXT, `timestamp` INTEGER, `adId` INTEGER, PRIMARY KEY(`packageName`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `notification` (`expire` INTEGER, `abTestingGroup` TEXT, `body` TEXT, `campaignId` INTEGER NOT NULL, `img` TEXT, `lang` TEXT, `title` TEXT, `url` TEXT, `urlTrack` TEXT, `notificationCenterUrlTrack` TEXT, `type` INTEGER NOT NULL, `timeStamp` INTEGER NOT NULL, `appName` TEXT, `graphic` TEXT, `ownerId` TEXT, `processed` INTEGER NOT NULL, `actionStringRes` INTEGER NOT NULL, `whitelistedPackages` TEXT, `key` TEXT NOT NULL, `dismissed` INTEGER NOT NULL, PRIMARY KEY(`key`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `localNotificationSync` (`notificationId` TEXT NOT NULL, `title` TEXT, `body` TEXT, `image` TEXT, `navigationUrl` TEXT, `trigger` INTEGER NOT NULL, `id` TEXT, `actionStringRes` INTEGER NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`notificationId`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `installed` (`packageAndVersionCode` TEXT NOT NULL, `icon` TEXT, `packageName` TEXT, `name` TEXT, `versionCode` INTEGER NOT NULL, `versionName` TEXT, `signature` TEXT, `systemApp` INTEGER NOT NULL, `storeName` TEXT, `status` INTEGER NOT NULL, `type` INTEGER NOT NULL, `enabled` INTEGER NOT NULL, `appSize` INTEGER NOT NULL, PRIMARY KEY(`packageAndVersionCode`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `installation` (`packageName` TEXT NOT NULL, `icon` TEXT, `name` TEXT, `versionCode` INTEGER NOT NULL, `versionName` TEXT, PRIMARY KEY(`packageName`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `migratedapp` (`packageName` TEXT NOT NULL, PRIMARY KEY(`packageName`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `update` (`packageName` TEXT NOT NULL, `appId` INTEGER NOT NULL, `label` TEXT, `icon` TEXT, `md5` TEXT, `apkPath` TEXT, `size` INTEGER NOT NULL, `updateVersionName` TEXT, `updateVersionCode` INTEGER NOT NULL, `excluded` INTEGER NOT NULL, `trustedBadge` TEXT, `alternativeApkPath` TEXT, `storeName` TEXT, `mainObbName` TEXT, `mainObbPath` TEXT, `mainObbMd5` TEXT, `patchObbName` TEXT, `patchObbPath` TEXT, `patchObbMd5` TEXT, `roomSplits` TEXT, `requiredSplits` TEXT, `hasAppc` INTEGER NOT NULL, `downloadCampaigns` TEXT, PRIMARY KEY(`packageName`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `download` (`filesToDownload` TEXT, `overallDownloadStatus` INTEGER NOT NULL, `overallProgress` INTEGER NOT NULL, `md5` TEXT NOT NULL, `appName` TEXT, `Icon` TEXT, `timeStamp` INTEGER NOT NULL, `packageName` TEXT, `versionCode` INTEGER NOT NULL, `action` INTEGER NOT NULL, `versionName` TEXT, `hasAppc` INTEGER NOT NULL, `size` INTEGER NOT NULL, `storeName` TEXT, `trustedBadge` TEXT, `downloadError` INTEGER NOT NULL, `attributionId` TEXT, `averageApkDownloadSpeed` INTEGER NOT NULL, `averageObbDownloadSpeed` INTEGER NOT NULL, `averageSplitsDownloadSpeed` INTEGER NOT NULL, PRIMARY KEY(`md5`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `store` (`storeId` INTEGER NOT NULL, `iconPath` TEXT, `theme` TEXT, `downloads` INTEGER NOT NULL, `storeName` TEXT, `username` TEXT, `passwordSha1` TEXT, PRIMARY KEY(`storeId`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `aptoideinstallapp` (`packageName` TEXT NOT NULL, PRIMARY KEY(`packageName`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `appComingSoonRegistration` (`packageName` TEXT NOT NULL, PRIMARY KEY(`packageName`))");
                interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC1008b.mo6461v("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7e316c0a1665c11b439c50fb81744638')");
            }

            @Override // androidx.room.C0653l.a
            public void dropAllTables(InterfaceC1008b interfaceC1008b) throws SQLException {
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `event`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `experiment`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `storedMinimalAd`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `notification`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `localNotificationSync`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `installed`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `installation`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `migratedapp`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `update`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `download`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `store`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `aptoideinstallapp`");
                interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `appComingSoonRegistration`");
                if (((AbstractC0651j) AptoideDatabase_Impl.this).mCallbacks != null) {
                    int size = ((AbstractC0651j) AptoideDatabase_Impl.this).mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((AbstractC0651j.b) ((AbstractC0651j) AptoideDatabase_Impl.this).mCallbacks.get(i2)).m4625b(interfaceC1008b);
                    }
                }
            }

            @Override // androidx.room.C0653l.a
            protected void onCreate(InterfaceC1008b interfaceC1008b) {
                if (((AbstractC0651j) AptoideDatabase_Impl.this).mCallbacks != null) {
                    int size = ((AbstractC0651j) AptoideDatabase_Impl.this).mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((AbstractC0651j.b) ((AbstractC0651j) AptoideDatabase_Impl.this).mCallbacks.get(i2)).m4624a(interfaceC1008b);
                    }
                }
            }

            @Override // androidx.room.C0653l.a
            public void onOpen(InterfaceC1008b interfaceC1008b) {
                ((AbstractC0651j) AptoideDatabase_Impl.this).mDatabase = interfaceC1008b;
                AptoideDatabase_Impl.this.internalInitInvalidationTracker(interfaceC1008b);
                if (((AbstractC0651j) AptoideDatabase_Impl.this).mCallbacks != null) {
                    int size = ((AbstractC0651j) AptoideDatabase_Impl.this).mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((AbstractC0651j.b) ((AbstractC0651j) AptoideDatabase_Impl.this).mCallbacks.get(i2)).mo4626c(interfaceC1008b);
                    }
                }
            }

            @Override // androidx.room.C0653l.a
            public void onPostMigrate(InterfaceC1008b interfaceC1008b) {
            }

            @Override // androidx.room.C0653l.a
            public void onPreMigrate(InterfaceC1008b interfaceC1008b) throws SQLException {
                C0663c.m4674a(interfaceC1008b);
            }

            @Override // androidx.room.C0653l.a
            protected C0653l.b onValidateSchema(InterfaceC1008b interfaceC1008b) {
                HashMap map = new HashMap(5);
                map.put("timestamp", new C0667g.a("timestamp", "INTEGER", true, 1, null, 1));
                map.put("eventName", new C0667g.a("eventName", "TEXT", false, 0, null, 1));
                map.put("action", new C0667g.a("action", "INTEGER", true, 0, null, 1));
                map.put("context", new C0667g.a("context", "TEXT", false, 0, null, 1));
                map.put("data", new C0667g.a("data", "TEXT", false, 0, null, 1));
                C0667g c0667g = new C0667g("event", map, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a = C0667g.m4682a(interfaceC1008b, "event");
                if (!c0667g.equals(c0667gM4682a)) {
                    return new C0653l.b(false, "event(cm.aptoide.pt.database.room.RoomEvent).\n Expected:\n" + c0667g + "\n Found:\n" + c0667gM4682a);
                }
                HashMap map2 = new HashMap(6);
                map2.put("experimentName", new C0667g.a("experimentName", "TEXT", true, 1, null, 1));
                map2.put("requestTime", new C0667g.a("requestTime", "INTEGER", true, 0, null, 1));
                map2.put("assignment", new C0667g.a("assignment", "TEXT", false, 0, null, 1));
                map2.put("payload", new C0667g.a("payload", "TEXT", false, 0, null, 1));
                map2.put("partOfExperiment", new C0667g.a("partOfExperiment", "INTEGER", true, 0, null, 1));
                map2.put("experimentOver", new C0667g.a("experimentOver", "INTEGER", true, 0, null, 1));
                C0667g c0667g2 = new C0667g("experiment", map2, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a2 = C0667g.m4682a(interfaceC1008b, "experiment");
                if (!c0667g2.equals(c0667gM4682a2)) {
                    return new C0653l.b(false, "experiment(cm.aptoide.pt.database.room.RoomExperiment).\n Expected:\n" + c0667g2 + "\n Found:\n" + c0667gM4682a2);
                }
                HashMap map3 = new HashMap(7);
                map3.put("packageName", new C0667g.a("packageName", "TEXT", true, 1, null, 1));
                map3.put("referrer", new C0667g.a("referrer", "TEXT", false, 0, null, 1));
                map3.put("cpcUrl", new C0667g.a("cpcUrl", "TEXT", false, 0, null, 1));
                map3.put("cpdUrl", new C0667g.a("cpdUrl", "TEXT", false, 0, null, 1));
                map3.put("cpiUrl", new C0667g.a("cpiUrl", "TEXT", false, 0, null, 1));
                map3.put("timestamp", new C0667g.a("timestamp", "INTEGER", false, 0, null, 1));
                map3.put("adId", new C0667g.a("adId", "INTEGER", false, 0, null, 1));
                C0667g c0667g3 = new C0667g("storedMinimalAd", map3, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a3 = C0667g.m4682a(interfaceC1008b, "storedMinimalAd");
                if (!c0667g3.equals(c0667gM4682a3)) {
                    return new C0653l.b(false, "storedMinimalAd(cm.aptoide.pt.database.room.RoomStoredMinimalAd).\n Expected:\n" + c0667g3 + "\n Found:\n" + c0667gM4682a3);
                }
                HashMap map4 = new HashMap(20);
                map4.put("expire", new C0667g.a("expire", "INTEGER", false, 0, null, 1));
                map4.put("abTestingGroup", new C0667g.a("abTestingGroup", "TEXT", false, 0, null, 1));
                map4.put("body", new C0667g.a("body", "TEXT", false, 0, null, 1));
                map4.put("campaignId", new C0667g.a("campaignId", "INTEGER", true, 0, null, 1));
                map4.put("img", new C0667g.a("img", "TEXT", false, 0, null, 1));
                map4.put("lang", new C0667g.a("lang", "TEXT", false, 0, null, 1));
                map4.put("title", new C0667g.a("title", "TEXT", false, 0, null, 1));
                map4.put("url", new C0667g.a("url", "TEXT", false, 0, null, 1));
                map4.put("urlTrack", new C0667g.a("urlTrack", "TEXT", false, 0, null, 1));
                map4.put("notificationCenterUrlTrack", new C0667g.a("notificationCenterUrlTrack", "TEXT", false, 0, null, 1));
                map4.put("type", new C0667g.a("type", "INTEGER", true, 0, null, 1));
                map4.put("timeStamp", new C0667g.a("timeStamp", "INTEGER", true, 0, null, 1));
                map4.put("appName", new C0667g.a("appName", "TEXT", false, 0, null, 1));
                map4.put("graphic", new C0667g.a("graphic", "TEXT", false, 0, null, 1));
                map4.put("ownerId", new C0667g.a("ownerId", "TEXT", false, 0, null, 1));
                map4.put("processed", new C0667g.a("processed", "INTEGER", true, 0, null, 1));
                map4.put("actionStringRes", new C0667g.a("actionStringRes", "INTEGER", true, 0, null, 1));
                map4.put("whitelistedPackages", new C0667g.a("whitelistedPackages", "TEXT", false, 0, null, 1));
                map4.put(RoomNotification.KEY, new C0667g.a(RoomNotification.KEY, "TEXT", true, 1, null, 1));
                map4.put("dismissed", new C0667g.a("dismissed", "INTEGER", true, 0, null, 1));
                C0667g c0667g4 = new C0667g("notification", map4, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a4 = C0667g.m4682a(interfaceC1008b, "notification");
                if (!c0667g4.equals(c0667gM4682a4)) {
                    return new C0653l.b(false, "notification(cm.aptoide.pt.database.room.RoomNotification).\n Expected:\n" + c0667g4 + "\n Found:\n" + c0667gM4682a4);
                }
                HashMap map5 = new HashMap(9);
                map5.put("notificationId", new C0667g.a("notificationId", "TEXT", true, 1, null, 1));
                map5.put("title", new C0667g.a("title", "TEXT", false, 0, null, 1));
                map5.put("body", new C0667g.a("body", "TEXT", false, 0, null, 1));
                map5.put("image", new C0667g.a("image", "TEXT", false, 0, null, 1));
                map5.put("navigationUrl", new C0667g.a("navigationUrl", "TEXT", false, 0, null, 1));
                map5.put("trigger", new C0667g.a("trigger", "INTEGER", true, 0, null, 1));
                map5.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, new C0667g.a(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, "TEXT", false, 0, null, 1));
                map5.put("actionStringRes", new C0667g.a("actionStringRes", "INTEGER", true, 0, null, 1));
                map5.put("type", new C0667g.a("type", "INTEGER", true, 0, null, 1));
                C0667g c0667g5 = new C0667g("localNotificationSync", map5, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a5 = C0667g.m4682a(interfaceC1008b, "localNotificationSync");
                if (!c0667g5.equals(c0667gM4682a5)) {
                    return new C0653l.b(false, "localNotificationSync(cm.aptoide.pt.database.room.RoomLocalNotificationSync).\n Expected:\n" + c0667g5 + "\n Found:\n" + c0667gM4682a5);
                }
                HashMap map6 = new HashMap(13);
                map6.put("packageAndVersionCode", new C0667g.a("packageAndVersionCode", "TEXT", true, 1, null, 1));
                map6.put(RoomInstalled.ICON, new C0667g.a(RoomInstalled.ICON, "TEXT", false, 0, null, 1));
                map6.put("packageName", new C0667g.a("packageName", "TEXT", false, 0, null, 1));
                map6.put("name", new C0667g.a("name", "TEXT", false, 0, null, 1));
                map6.put(RoomInstalled.VERSION_CODE, new C0667g.a(RoomInstalled.VERSION_CODE, "INTEGER", true, 0, null, 1));
                map6.put(RoomInstalled.VERSION_NAME, new C0667g.a(RoomInstalled.VERSION_NAME, "TEXT", false, 0, null, 1));
                map6.put(RoomInstalled.SIGNATURE, new C0667g.a(RoomInstalled.SIGNATURE, "TEXT", false, 0, null, 1));
                map6.put("systemApp", new C0667g.a("systemApp", "INTEGER", true, 0, null, 1));
                map6.put("storeName", new C0667g.a("storeName", "TEXT", false, 0, null, 1));
                map6.put("status", new C0667g.a("status", "INTEGER", true, 0, null, 1));
                map6.put("type", new C0667g.a("type", "INTEGER", true, 0, null, 1));
                map6.put("enabled", new C0667g.a("enabled", "INTEGER", true, 0, null, 1));
                map6.put("appSize", new C0667g.a("appSize", "INTEGER", true, 0, null, 1));
                C0667g c0667g6 = new C0667g("installed", map6, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a6 = C0667g.m4682a(interfaceC1008b, "installed");
                if (!c0667g6.equals(c0667gM4682a6)) {
                    return new C0653l.b(false, "installed(cm.aptoide.pt.database.room.RoomInstalled).\n Expected:\n" + c0667g6 + "\n Found:\n" + c0667gM4682a6);
                }
                HashMap map7 = new HashMap(5);
                map7.put("packageName", new C0667g.a("packageName", "TEXT", true, 1, null, 1));
                map7.put(RoomInstalled.ICON, new C0667g.a(RoomInstalled.ICON, "TEXT", false, 0, null, 1));
                map7.put("name", new C0667g.a("name", "TEXT", false, 0, null, 1));
                map7.put(RoomInstalled.VERSION_CODE, new C0667g.a(RoomInstalled.VERSION_CODE, "INTEGER", true, 0, null, 1));
                map7.put(RoomInstalled.VERSION_NAME, new C0667g.a(RoomInstalled.VERSION_NAME, "TEXT", false, 0, null, 1));
                C0667g c0667g7 = new C0667g("installation", map7, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a7 = C0667g.m4682a(interfaceC1008b, "installation");
                if (!c0667g7.equals(c0667gM4682a7)) {
                    return new C0653l.b(false, "installation(cm.aptoide.pt.database.room.RoomInstallation).\n Expected:\n" + c0667g7 + "\n Found:\n" + c0667gM4682a7);
                }
                HashMap map8 = new HashMap(1);
                map8.put("packageName", new C0667g.a("packageName", "TEXT", true, 1, null, 1));
                C0667g c0667g8 = new C0667g("migratedapp", map8, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a8 = C0667g.m4682a(interfaceC1008b, "migratedapp");
                if (!c0667g8.equals(c0667gM4682a8)) {
                    return new C0653l.b(false, "migratedapp(cm.aptoide.pt.database.room.RoomMigratedApp).\n Expected:\n" + c0667g8 + "\n Found:\n" + c0667gM4682a8);
                }
                HashMap map9 = new HashMap(23);
                map9.put("packageName", new C0667g.a("packageName", "TEXT", true, 1, null, 1));
                map9.put("appId", new C0667g.a("appId", "INTEGER", true, 0, null, 1));
                map9.put("label", new C0667g.a("label", "TEXT", false, 0, null, 1));
                map9.put(RoomInstalled.ICON, new C0667g.a(RoomInstalled.ICON, "TEXT", false, 0, null, 1));
                map9.put("md5", new C0667g.a("md5", "TEXT", false, 0, null, 1));
                map9.put("apkPath", new C0667g.a("apkPath", "TEXT", false, 0, null, 1));
                map9.put("size", new C0667g.a("size", "INTEGER", true, 0, null, 1));
                map9.put("updateVersionName", new C0667g.a("updateVersionName", "TEXT", false, 0, null, 1));
                map9.put("updateVersionCode", new C0667g.a("updateVersionCode", "INTEGER", true, 0, null, 1));
                map9.put("excluded", new C0667g.a("excluded", "INTEGER", true, 0, null, 1));
                map9.put("trustedBadge", new C0667g.a("trustedBadge", "TEXT", false, 0, null, 1));
                map9.put("alternativeApkPath", new C0667g.a("alternativeApkPath", "TEXT", false, 0, null, 1));
                map9.put("storeName", new C0667g.a("storeName", "TEXT", false, 0, null, 1));
                map9.put("mainObbName", new C0667g.a("mainObbName", "TEXT", false, 0, null, 1));
                map9.put("mainObbPath", new C0667g.a("mainObbPath", "TEXT", false, 0, null, 1));
                map9.put("mainObbMd5", new C0667g.a("mainObbMd5", "TEXT", false, 0, null, 1));
                map9.put("patchObbName", new C0667g.a("patchObbName", "TEXT", false, 0, null, 1));
                map9.put("patchObbPath", new C0667g.a("patchObbPath", "TEXT", false, 0, null, 1));
                map9.put("patchObbMd5", new C0667g.a("patchObbMd5", "TEXT", false, 0, null, 1));
                map9.put("roomSplits", new C0667g.a("roomSplits", "TEXT", false, 0, null, 1));
                map9.put("requiredSplits", new C0667g.a("requiredSplits", "TEXT", false, 0, null, 1));
                map9.put("hasAppc", new C0667g.a("hasAppc", "INTEGER", true, 0, null, 1));
                map9.put("downloadCampaigns", new C0667g.a("downloadCampaigns", "TEXT", false, 0, null, 1));
                C0667g c0667g9 = new C0667g("update", map9, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a9 = C0667g.m4682a(interfaceC1008b, "update");
                if (!c0667g9.equals(c0667gM4682a9)) {
                    return new C0653l.b(false, "update(cm.aptoide.pt.database.room.RoomUpdate).\n Expected:\n" + c0667g9 + "\n Found:\n" + c0667gM4682a9);
                }
                HashMap map10 = new HashMap(20);
                map10.put("filesToDownload", new C0667g.a("filesToDownload", "TEXT", false, 0, null, 1));
                map10.put("overallDownloadStatus", new C0667g.a("overallDownloadStatus", "INTEGER", true, 0, null, 1));
                map10.put("overallProgress", new C0667g.a("overallProgress", "INTEGER", true, 0, null, 1));
                map10.put("md5", new C0667g.a("md5", "TEXT", true, 1, null, 1));
                map10.put("appName", new C0667g.a("appName", "TEXT", false, 0, null, 1));
                map10.put("Icon", new C0667g.a("Icon", "TEXT", false, 0, null, 1));
                map10.put("timeStamp", new C0667g.a("timeStamp", "INTEGER", true, 0, null, 1));
                map10.put("packageName", new C0667g.a("packageName", "TEXT", false, 0, null, 1));
                map10.put(RoomInstalled.VERSION_CODE, new C0667g.a(RoomInstalled.VERSION_CODE, "INTEGER", true, 0, null, 1));
                map10.put("action", new C0667g.a("action", "INTEGER", true, 0, null, 1));
                map10.put(RoomInstalled.VERSION_NAME, new C0667g.a(RoomInstalled.VERSION_NAME, "TEXT", false, 0, null, 1));
                map10.put("hasAppc", new C0667g.a("hasAppc", "INTEGER", true, 0, null, 1));
                map10.put("size", new C0667g.a("size", "INTEGER", true, 0, null, 1));
                map10.put("storeName", new C0667g.a("storeName", "TEXT", false, 0, null, 1));
                map10.put("trustedBadge", new C0667g.a("trustedBadge", "TEXT", false, 0, null, 1));
                map10.put("downloadError", new C0667g.a("downloadError", "INTEGER", true, 0, null, 1));
                map10.put("attributionId", new C0667g.a("attributionId", "TEXT", false, 0, null, 1));
                map10.put("averageApkDownloadSpeed", new C0667g.a("averageApkDownloadSpeed", "INTEGER", true, 0, null, 1));
                map10.put("averageObbDownloadSpeed", new C0667g.a("averageObbDownloadSpeed", "INTEGER", true, 0, null, 1));
                map10.put("averageSplitsDownloadSpeed", new C0667g.a("averageSplitsDownloadSpeed", "INTEGER", true, 0, null, 1));
                C0667g c0667g10 = new C0667g(DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, map10, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a10 = C0667g.m4682a(interfaceC1008b, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
                if (!c0667g10.equals(c0667gM4682a10)) {
                    return new C0653l.b(false, "download(cm.aptoide.pt.database.room.RoomDownload).\n Expected:\n" + c0667g10 + "\n Found:\n" + c0667gM4682a10);
                }
                HashMap map11 = new HashMap(7);
                map11.put(RoomStore.STORE_ID, new C0667g.a(RoomStore.STORE_ID, "INTEGER", true, 1, null, 1));
                map11.put(RoomStore.ICON_PATH, new C0667g.a(RoomStore.ICON_PATH, "TEXT", false, 0, null, 1));
                map11.put(RoomStore.THEME, new C0667g.a(RoomStore.THEME, "TEXT", false, 0, null, 1));
                map11.put(RoomStore.DOWNLOADS, new C0667g.a(RoomStore.DOWNLOADS, "INTEGER", true, 0, null, 1));
                map11.put("storeName", new C0667g.a("storeName", "TEXT", false, 0, null, 1));
                map11.put("username", new C0667g.a("username", "TEXT", false, 0, null, 1));
                map11.put(RoomStore.PASSWORD_SHA1, new C0667g.a(RoomStore.PASSWORD_SHA1, "TEXT", false, 0, null, 1));
                C0667g c0667g11 = new C0667g(AccountAnalytics.STORE, map11, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a11 = C0667g.m4682a(interfaceC1008b, AccountAnalytics.STORE);
                if (!c0667g11.equals(c0667gM4682a11)) {
                    return new C0653l.b(false, "store(cm.aptoide.pt.database.room.RoomStore).\n Expected:\n" + c0667g11 + "\n Found:\n" + c0667gM4682a11);
                }
                HashMap map12 = new HashMap(1);
                map12.put("packageName", new C0667g.a("packageName", "TEXT", true, 1, null, 1));
                C0667g c0667g12 = new C0667g("aptoideinstallapp", map12, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a12 = C0667g.m4682a(interfaceC1008b, "aptoideinstallapp");
                if (!c0667g12.equals(c0667gM4682a12)) {
                    return new C0653l.b(false, "aptoideinstallapp(cm.aptoide.pt.database.room.RoomAptoideInstallApp).\n Expected:\n" + c0667g12 + "\n Found:\n" + c0667gM4682a12);
                }
                HashMap map13 = new HashMap(1);
                map13.put("packageName", new C0667g.a("packageName", "TEXT", true, 1, null, 1));
                C0667g c0667g13 = new C0667g("appComingSoonRegistration", map13, new HashSet(0), new HashSet(0));
                C0667g c0667gM4682a13 = C0667g.m4682a(interfaceC1008b, "appComingSoonRegistration");
                if (c0667g13.equals(c0667gM4682a13)) {
                    return new C0653l.b(true, null);
                }
                return new C0653l.b(false, "appComingSoonRegistration(cm.aptoide.pt.database.room.RoomAppComingSoonRegistration).\n Expected:\n" + c0667g13 + "\n Found:\n" + c0667gM4682a13);
            }
        }, "7e316c0a1665c11b439c50fb81744638", "d37fe27d97b8305241dccf817ceb2c1d")).m6466a());
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public DownloadDAO downloadDAO() {
        DownloadDAO downloadDAO;
        if (this._downloadDAO != null) {
            return this._downloadDAO;
        }
        synchronized (this) {
            if (this._downloadDAO == null) {
                this._downloadDAO = new DownloadDAO_Impl(this);
            }
            downloadDAO = this._downloadDAO;
        }
        return downloadDAO;
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public EventDAO eventDAO() {
        EventDAO eventDAO;
        if (this._eventDAO != null) {
            return this._eventDAO;
        }
        synchronized (this) {
            if (this._eventDAO == null) {
                this._eventDAO = new EventDAO_Impl(this);
            }
            eventDAO = this._eventDAO;
        }
        return eventDAO;
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public ExperimentDAO experimentDAO() {
        ExperimentDAO experimentDAO;
        if (this._experimentDAO != null) {
            return this._experimentDAO;
        }
        synchronized (this) {
            if (this._experimentDAO == null) {
                this._experimentDAO = new ExperimentDAO_Impl(this);
            }
            experimentDAO = this._experimentDAO;
        }
        return experimentDAO;
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public InstallationDao installationDao() {
        InstallationDao installationDao;
        if (this._installationDao != null) {
            return this._installationDao;
        }
        synchronized (this) {
            if (this._installationDao == null) {
                this._installationDao = new InstallationDao_Impl(this);
            }
            installationDao = this._installationDao;
        }
        return installationDao;
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public InstalledDao installedDao() {
        InstalledDao installedDao;
        if (this._installedDao != null) {
            return this._installedDao;
        }
        synchronized (this) {
            if (this._installedDao == null) {
                this._installedDao = new InstalledDao_Impl(this);
            }
            installedDao = this._installedDao;
        }
        return installedDao;
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public LocalNotificationSyncDao localNotificationSyncDao() {
        LocalNotificationSyncDao localNotificationSyncDao;
        if (this._localNotificationSyncDao != null) {
            return this._localNotificationSyncDao;
        }
        synchronized (this) {
            if (this._localNotificationSyncDao == null) {
                this._localNotificationSyncDao = new LocalNotificationSyncDao_Impl(this);
            }
            localNotificationSyncDao = this._localNotificationSyncDao;
        }
        return localNotificationSyncDao;
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public MigratedAppDAO migratedAppDAO() {
        MigratedAppDAO migratedAppDAO;
        if (this._migratedAppDAO != null) {
            return this._migratedAppDAO;
        }
        synchronized (this) {
            if (this._migratedAppDAO == null) {
                this._migratedAppDAO = new MigratedAppDAO_Impl(this);
            }
            migratedAppDAO = this._migratedAppDAO;
        }
        return migratedAppDAO;
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public NotificationDao notificationDao() {
        NotificationDao notificationDao;
        if (this._notificationDao != null) {
            return this._notificationDao;
        }
        synchronized (this) {
            if (this._notificationDao == null) {
                this._notificationDao = new NotificationDao_Impl(this);
            }
            notificationDao = this._notificationDao;
        }
        return notificationDao;
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public StoreDao storeDao() {
        StoreDao storeDao;
        if (this._storeDao != null) {
            return this._storeDao;
        }
        synchronized (this) {
            if (this._storeDao == null) {
                this._storeDao = new StoreDao_Impl(this);
            }
            storeDao = this._storeDao;
        }
        return storeDao;
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public StoredMinimalAdDAO storeMinimalAdDAO() {
        StoredMinimalAdDAO storedMinimalAdDAO;
        if (this._storedMinimalAdDAO != null) {
            return this._storedMinimalAdDAO;
        }
        synchronized (this) {
            if (this._storedMinimalAdDAO == null) {
                this._storedMinimalAdDAO = new StoredMinimalAdDAO_Impl(this);
            }
            storedMinimalAdDAO = this._storedMinimalAdDAO;
        }
        return storedMinimalAdDAO;
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideDatabase
    public UpdateDao updateDao() {
        UpdateDao updateDao;
        if (this._updateDao != null) {
            return this._updateDao;
        }
        synchronized (this) {
            if (this._updateDao == null) {
                this._updateDao = new UpdateDao_Impl(this);
            }
            updateDao = this._updateDao;
        }
        return updateDao;
    }
}
