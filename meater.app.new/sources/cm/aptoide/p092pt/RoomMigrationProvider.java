package cm.aptoide.p092pt;

import android.database.SQLException;
import android.os.Build;
import androidx.room.p009s.AbstractC0660a;
import kotlin.Metadata;
import kotlin.collections.C10795j;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p024c.p082u.p083a.InterfaceC1008b;

/* compiled from: RoomMigrationProvider.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\bR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lcm/aptoide/pt/RoomMigrationProvider;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "previousErrorMigrations", HttpUrl.FRAGMENT_ENCODE_SET, "Landroidx/room/migration/Migration;", "[Landroidx/room/migration/Migration;", "getMigrations", "()[Landroidx/room/migration/Migration;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class RoomMigrationProvider {
    private final AbstractC0660a[] previousErrorMigrations = {new AbstractC0660a() { // from class: cm.aptoide.pt.RoomMigrationProvider$previousErrorMigrations$1
        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            C9801m.m32346f(interfaceC1008b, "database");
            interfaceC1008b.mo6461v("ALTER TABLE download ADD COLUMN attributionId TEXT");
        }
    }, new AbstractC0660a() { // from class: cm.aptoide.pt.RoomMigrationProvider$previousErrorMigrations$2
        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            C9801m.m32346f(interfaceC1008b, "database");
            interfaceC1008b.mo6461v("ALTER TABLE installed ADD COLUMN enabled INTEGER DEFAULT 1 NOT NULL");
        }
    }, new AbstractC0660a() { // from class: cm.aptoide.pt.RoomMigrationProvider$previousErrorMigrations$3
        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            C9801m.m32346f(interfaceC1008b, "database");
            interfaceC1008b.mo6461v("DELETE FROM `update` WHERE appcUpgrade=1");
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS update_tmp (`packageName` TEXT NOT NULL, `appId` INTEGER NOT NULL, `label` TEXT, `icon` TEXT, `md5` TEXT, `apkPath` TEXT, `size` INTEGER NOT NULL, `updateVersionName` TEXT, `updateVersionCode` INTEGER NOT NULL, `excluded` INTEGER NOT NULL, `trustedBadge` TEXT, `alternativeApkPath` TEXT, `storeName` TEXT, `mainObbName` TEXT, `mainObbPath` TEXT, `mainObbMd5` TEXT, `patchObbName` TEXT, `patchObbPath` TEXT, `patchObbMd5` TEXT, `roomSplits` TEXT, `requiredSplits` TEXT, `hasAppc` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
            interfaceC1008b.mo6461v("INSERT INTO update_tmp (packageName, appId, label, icon, md5, apkPath, size, updateVersionName, updateVersionCode, excluded, trustedBadge, alternativeApkPath, storeName, mainObbName, mainObbPath, mainObbMd5, patchObbName, patchObbPath, patchObbMd5, roomSplits, requiredSplits, hasAppc) SELECT packageName, appId, label, icon, md5, apkPath, size, updateVersionName, updateVersionCode, excluded, trustedBadge, alternativeApkPath, storeName, mainObbName, mainObbPath, mainObbMd5, patchObbName, patchObbPath, patchObbMd5, roomSplits, requiredSplits, hasAppc FROM `update`");
            interfaceC1008b.mo6461v("DROP TABLE `update`");
            interfaceC1008b.mo6461v("ALTER TABLE update_tmp RENAME TO `update`");
        }
    }, new AbstractC0660a() { // from class: cm.aptoide.pt.RoomMigrationProvider$previousErrorMigrations$4
        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            C9801m.m32346f(interfaceC1008b, "database");
            interfaceC1008b.mo6461v("ALTER TABLE installed ADD COLUMN `appSize` INTEGER DEFAULT 1 NOT NULL");
        }
    }, new AbstractC0660a() { // from class: cm.aptoide.pt.RoomMigrationProvider$previousErrorMigrations$5
        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            C9801m.m32346f(interfaceC1008b, "database");
            interfaceC1008b.mo6461v("UPDATE download SET icon='' WHERE icon IS NULL");
        }
    }, new AbstractC0660a() { // from class: cm.aptoide.pt.RoomMigrationProvider$previousErrorMigrations$6
        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            C9801m.m32346f(interfaceC1008b, "database");
            interfaceC1008b.mo6461v("ALTER TABLE notification ADD COLUMN whitelistedPackages TEXT");
        }
    }, new AbstractC0660a() { // from class: cm.aptoide.pt.RoomMigrationProvider$previousErrorMigrations$7
        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            C9801m.m32346f(interfaceC1008b, "database");
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS appComingSoonRegistration (`packageName`TEXT NOT NULL, PRIMARY KEY(`packageName`) )");
        }
    }, new AbstractC0660a() { // from class: cm.aptoide.pt.RoomMigrationProvider$previousErrorMigrations$8
        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            C9801m.m32346f(interfaceC1008b, "database");
            interfaceC1008b.mo6461v("ALTER TABLE `update` ADD COLUMN downloadCampaigns TEXT");
        }
    }};

    public final AbstractC0660a[] getMigrations() {
        AbstractC0660a[] abstractC0660aArr = this.previousErrorMigrations;
        return Build.VERSION.SDK_INT >= 29 ? (AbstractC0660a[]) C10795j.m38689n(abstractC0660aArr, new AbstractC0660a() { // from class: cm.aptoide.pt.RoomMigrationProvider.getMigrations.1
            @Override // androidx.room.p009s.AbstractC0660a
            public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
                C9801m.m32346f(interfaceC1008b, "database");
                interfaceC1008b.mo6461v("ALTER TABLE download RENAME COLUMN downloadSpeed TO averageApkDownloadSpeed");
                interfaceC1008b.mo6461v("ALTER TABLE download ADD COLUMN averageObbDownloadSpeed INTEGER DEFAULT 0 NOT NULL");
                interfaceC1008b.mo6461v("ALTER TABLE download ADD COLUMN averageSplitsDownloadSpeed INTEGER DEFAULT 0 NOT NULL");
            }
        }) : abstractC0660aArr;
    }
}
