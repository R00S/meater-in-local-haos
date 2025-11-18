package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import android.database.SQLException;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.AbstractC0658q;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.EmptyResultSetException;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9064b;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9082s;

/* loaded from: classes.dex */
public final class InstalledDao_Impl implements InstalledDao {
    private final AbstractC0651j __db;
    private final AbstractC0644c<RoomInstalled> __insertionAdapterOfRoomInstalled;
    private final AbstractC0658q __preparedStmtOfRemove;
    private final AbstractC0658q __preparedStmtOfRemoveAll;
    private final AbstractC0658q __preparedStmtOfRemove_1;

    public InstalledDao_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomInstalled = new AbstractC0644c<RoomInstalled>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `installed` (`packageAndVersionCode`,`icon`,`packageName`,`name`,`versionCode`,`versionName`,`signature`,`systemApp`,`storeName`,`status`,`type`,`enabled`,`appSize`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomInstalled roomInstalled) {
                if (roomInstalled.getPackageAndVersionCode() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomInstalled.getPackageAndVersionCode());
                }
                if (roomInstalled.getIcon() == null) {
                    interfaceC1012f.mo4646I0(2);
                } else {
                    interfaceC1012f.mo4654w(2, roomInstalled.getIcon());
                }
                if (roomInstalled.getPackageName() == null) {
                    interfaceC1012f.mo4646I0(3);
                } else {
                    interfaceC1012f.mo4654w(3, roomInstalled.getPackageName());
                }
                if (roomInstalled.getName() == null) {
                    interfaceC1012f.mo4646I0(4);
                } else {
                    interfaceC1012f.mo4654w(4, roomInstalled.getName());
                }
                interfaceC1012f.mo4652h0(5, roomInstalled.getVersionCode());
                if (roomInstalled.getVersionName() == null) {
                    interfaceC1012f.mo4646I0(6);
                } else {
                    interfaceC1012f.mo4654w(6, roomInstalled.getVersionName());
                }
                if (roomInstalled.getSignature() == null) {
                    interfaceC1012f.mo4646I0(7);
                } else {
                    interfaceC1012f.mo4654w(7, roomInstalled.getSignature());
                }
                interfaceC1012f.mo4652h0(8, roomInstalled.isSystemApp() ? 1L : 0L);
                if (roomInstalled.getStoreName() == null) {
                    interfaceC1012f.mo4646I0(9);
                } else {
                    interfaceC1012f.mo4654w(9, roomInstalled.getStoreName());
                }
                interfaceC1012f.mo4652h0(10, roomInstalled.getStatus());
                interfaceC1012f.mo4652h0(11, roomInstalled.getType());
                interfaceC1012f.mo4652h0(12, roomInstalled.isEnabled() ? 1L : 0L);
                interfaceC1012f.mo4652h0(13, roomInstalled.getAppSize().longValue());
            }
        };
        this.__preparedStmtOfRemove = new AbstractC0658q(abstractC0651j) { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.2
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM Installed where packageName = ? AND versionCode = ?";
            }
        };
        this.__preparedStmtOfRemove_1 = new AbstractC0658q(abstractC0651j) { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.3
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM Installed where packageName = ? ";
            }
        };
        this.__preparedStmtOfRemoveAll = new AbstractC0658q(abstractC0651j) { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.4
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM installed";
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public AbstractC9076m<RoomInstalled> get(String str, int i2) {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * FROM Installed where packageName = ? AND versionCode = ? LIMIT 1", 2);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        c0654mM4644c.mo4652h0(2, i2);
        return C0655n.m4655a(this.__db, false, new String[]{"Installed"}, new Callable<RoomInstalled>() { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.9
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomInstalled call() throws Exception {
                RoomInstalled roomInstalled = null;
                Cursor cursorM4675b = C0663c.m4675b(InstalledDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "packageAndVersionCode");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, RoomInstalled.ICON);
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "packageName");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "name");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_CODE);
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_NAME);
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, RoomInstalled.SIGNATURE);
                    int iM4673b8 = C0662b.m4673b(cursorM4675b, "systemApp");
                    int iM4673b9 = C0662b.m4673b(cursorM4675b, "storeName");
                    int iM4673b10 = C0662b.m4673b(cursorM4675b, "status");
                    int iM4673b11 = C0662b.m4673b(cursorM4675b, "type");
                    int iM4673b12 = C0662b.m4673b(cursorM4675b, "enabled");
                    int iM4673b13 = C0662b.m4673b(cursorM4675b, "appSize");
                    if (cursorM4675b.moveToFirst()) {
                        roomInstalled = new RoomInstalled();
                        roomInstalled.setPackageAndVersionCode(cursorM4675b.getString(iM4673b));
                        roomInstalled.setIcon(cursorM4675b.getString(iM4673b2));
                        roomInstalled.setPackageName(cursorM4675b.getString(iM4673b3));
                        roomInstalled.setName(cursorM4675b.getString(iM4673b4));
                        roomInstalled.setVersionCode(cursorM4675b.getInt(iM4673b5));
                        roomInstalled.setVersionName(cursorM4675b.getString(iM4673b6));
                        roomInstalled.setSignature(cursorM4675b.getString(iM4673b7));
                        boolean z = true;
                        roomInstalled.setSystemApp(cursorM4675b.getInt(iM4673b8) != 0);
                        roomInstalled.setStoreName(cursorM4675b.getString(iM4673b9));
                        roomInstalled.setStatus(cursorM4675b.getInt(iM4673b10));
                        roomInstalled.setType(cursorM4675b.getInt(iM4673b11));
                        if (cursorM4675b.getInt(iM4673b12) == 0) {
                            z = false;
                        }
                        roomInstalled.setEnabled(z);
                        roomInstalled.setAppSize(Long.valueOf(cursorM4675b.getLong(iM4673b13)));
                    }
                    return roomInstalled;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public AbstractC9076m<List<RoomInstalled>> getAll() {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * FROM Installed", 0);
        return C0655n.m4655a(this.__db, false, new String[]{"Installed"}, new Callable<List<RoomInstalled>>() { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.7
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomInstalled> call() throws Exception {
                Cursor cursorM4675b = C0663c.m4675b(InstalledDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "packageAndVersionCode");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, RoomInstalled.ICON);
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "packageName");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "name");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_CODE);
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_NAME);
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, RoomInstalled.SIGNATURE);
                    int iM4673b8 = C0662b.m4673b(cursorM4675b, "systemApp");
                    int iM4673b9 = C0662b.m4673b(cursorM4675b, "storeName");
                    int iM4673b10 = C0662b.m4673b(cursorM4675b, "status");
                    int iM4673b11 = C0662b.m4673b(cursorM4675b, "type");
                    int iM4673b12 = C0662b.m4673b(cursorM4675b, "enabled");
                    int iM4673b13 = C0662b.m4673b(cursorM4675b, "appSize");
                    ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
                    while (cursorM4675b.moveToNext()) {
                        RoomInstalled roomInstalled = new RoomInstalled();
                        ArrayList arrayList2 = arrayList;
                        roomInstalled.setPackageAndVersionCode(cursorM4675b.getString(iM4673b));
                        roomInstalled.setIcon(cursorM4675b.getString(iM4673b2));
                        roomInstalled.setPackageName(cursorM4675b.getString(iM4673b3));
                        roomInstalled.setName(cursorM4675b.getString(iM4673b4));
                        roomInstalled.setVersionCode(cursorM4675b.getInt(iM4673b5));
                        roomInstalled.setVersionName(cursorM4675b.getString(iM4673b6));
                        roomInstalled.setSignature(cursorM4675b.getString(iM4673b7));
                        roomInstalled.setSystemApp(cursorM4675b.getInt(iM4673b8) != 0);
                        roomInstalled.setStoreName(cursorM4675b.getString(iM4673b9));
                        roomInstalled.setStatus(cursorM4675b.getInt(iM4673b10));
                        roomInstalled.setType(cursorM4675b.getInt(iM4673b11));
                        roomInstalled.setEnabled(cursorM4675b.getInt(iM4673b12) != 0);
                        roomInstalled.setAppSize(Long.valueOf(cursorM4675b.getLong(iM4673b13)));
                        arrayList = arrayList2;
                        arrayList.add(roomInstalled);
                    }
                    return arrayList;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public AbstractC9076m<List<RoomInstalled>> getAllFilteringSystemApps() {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * FROM Installed where systemApp = 0 ORDER BY name ASC", 0);
        return C0655n.m4655a(this.__db, false, new String[]{"Installed"}, new Callable<List<RoomInstalled>>() { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.13
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomInstalled> call() throws Exception {
                Cursor cursorM4675b = C0663c.m4675b(InstalledDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "packageAndVersionCode");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, RoomInstalled.ICON);
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "packageName");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "name");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_CODE);
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_NAME);
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, RoomInstalled.SIGNATURE);
                    int iM4673b8 = C0662b.m4673b(cursorM4675b, "systemApp");
                    int iM4673b9 = C0662b.m4673b(cursorM4675b, "storeName");
                    int iM4673b10 = C0662b.m4673b(cursorM4675b, "status");
                    int iM4673b11 = C0662b.m4673b(cursorM4675b, "type");
                    int iM4673b12 = C0662b.m4673b(cursorM4675b, "enabled");
                    int iM4673b13 = C0662b.m4673b(cursorM4675b, "appSize");
                    ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
                    while (cursorM4675b.moveToNext()) {
                        RoomInstalled roomInstalled = new RoomInstalled();
                        ArrayList arrayList2 = arrayList;
                        roomInstalled.setPackageAndVersionCode(cursorM4675b.getString(iM4673b));
                        roomInstalled.setIcon(cursorM4675b.getString(iM4673b2));
                        roomInstalled.setPackageName(cursorM4675b.getString(iM4673b3));
                        roomInstalled.setName(cursorM4675b.getString(iM4673b4));
                        roomInstalled.setVersionCode(cursorM4675b.getInt(iM4673b5));
                        roomInstalled.setVersionName(cursorM4675b.getString(iM4673b6));
                        roomInstalled.setSignature(cursorM4675b.getString(iM4673b7));
                        roomInstalled.setSystemApp(cursorM4675b.getInt(iM4673b8) != 0);
                        roomInstalled.setStoreName(cursorM4675b.getString(iM4673b9));
                        roomInstalled.setStatus(cursorM4675b.getInt(iM4673b10));
                        roomInstalled.setType(cursorM4675b.getInt(iM4673b11));
                        roomInstalled.setEnabled(cursorM4675b.getInt(iM4673b12) != 0);
                        roomInstalled.setAppSize(Long.valueOf(cursorM4675b.getLong(iM4673b13)));
                        arrayList = arrayList2;
                        arrayList.add(roomInstalled);
                    }
                    return arrayList;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public AbstractC9076m<List<RoomInstalled>> getAllSortedAsc() {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * FROM Installed ORDER BY name ASC", 0);
        return C0655n.m4655a(this.__db, false, new String[]{"Installed"}, new Callable<List<RoomInstalled>>() { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.8
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomInstalled> call() throws Exception {
                Cursor cursorM4675b = C0663c.m4675b(InstalledDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "packageAndVersionCode");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, RoomInstalled.ICON);
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "packageName");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "name");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_CODE);
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_NAME);
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, RoomInstalled.SIGNATURE);
                    int iM4673b8 = C0662b.m4673b(cursorM4675b, "systemApp");
                    int iM4673b9 = C0662b.m4673b(cursorM4675b, "storeName");
                    int iM4673b10 = C0662b.m4673b(cursorM4675b, "status");
                    int iM4673b11 = C0662b.m4673b(cursorM4675b, "type");
                    int iM4673b12 = C0662b.m4673b(cursorM4675b, "enabled");
                    int iM4673b13 = C0662b.m4673b(cursorM4675b, "appSize");
                    ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
                    while (cursorM4675b.moveToNext()) {
                        RoomInstalled roomInstalled = new RoomInstalled();
                        ArrayList arrayList2 = arrayList;
                        roomInstalled.setPackageAndVersionCode(cursorM4675b.getString(iM4673b));
                        roomInstalled.setIcon(cursorM4675b.getString(iM4673b2));
                        roomInstalled.setPackageName(cursorM4675b.getString(iM4673b3));
                        roomInstalled.setName(cursorM4675b.getString(iM4673b4));
                        roomInstalled.setVersionCode(cursorM4675b.getInt(iM4673b5));
                        roomInstalled.setVersionName(cursorM4675b.getString(iM4673b6));
                        roomInstalled.setSignature(cursorM4675b.getString(iM4673b7));
                        roomInstalled.setSystemApp(cursorM4675b.getInt(iM4673b8) != 0);
                        roomInstalled.setStoreName(cursorM4675b.getString(iM4673b9));
                        roomInstalled.setStatus(cursorM4675b.getInt(iM4673b10));
                        roomInstalled.setType(cursorM4675b.getInt(iM4673b11));
                        roomInstalled.setEnabled(cursorM4675b.getInt(iM4673b12) != 0);
                        roomInstalled.setAppSize(Long.valueOf(cursorM4675b.getLong(iM4673b13)));
                        arrayList = arrayList2;
                        arrayList.add(roomInstalled);
                    }
                    return arrayList;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public AbstractC9076m<List<RoomInstalled>> getAsList(String str, int i2) {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * FROM Installed where packageName = ? AND versionCode = ?", 2);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        c0654mM4644c.mo4652h0(2, i2);
        return C0655n.m4655a(this.__db, false, new String[]{"Installed"}, new Callable<List<RoomInstalled>>() { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.10
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomInstalled> call() throws Exception {
                Cursor cursorM4675b = C0663c.m4675b(InstalledDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "packageAndVersionCode");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, RoomInstalled.ICON);
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "packageName");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "name");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_CODE);
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_NAME);
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, RoomInstalled.SIGNATURE);
                    int iM4673b8 = C0662b.m4673b(cursorM4675b, "systemApp");
                    int iM4673b9 = C0662b.m4673b(cursorM4675b, "storeName");
                    int iM4673b10 = C0662b.m4673b(cursorM4675b, "status");
                    int iM4673b11 = C0662b.m4673b(cursorM4675b, "type");
                    int iM4673b12 = C0662b.m4673b(cursorM4675b, "enabled");
                    int iM4673b13 = C0662b.m4673b(cursorM4675b, "appSize");
                    ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
                    while (cursorM4675b.moveToNext()) {
                        RoomInstalled roomInstalled = new RoomInstalled();
                        ArrayList arrayList2 = arrayList;
                        roomInstalled.setPackageAndVersionCode(cursorM4675b.getString(iM4673b));
                        roomInstalled.setIcon(cursorM4675b.getString(iM4673b2));
                        roomInstalled.setPackageName(cursorM4675b.getString(iM4673b3));
                        roomInstalled.setName(cursorM4675b.getString(iM4673b4));
                        roomInstalled.setVersionCode(cursorM4675b.getInt(iM4673b5));
                        roomInstalled.setVersionName(cursorM4675b.getString(iM4673b6));
                        roomInstalled.setSignature(cursorM4675b.getString(iM4673b7));
                        roomInstalled.setSystemApp(cursorM4675b.getInt(iM4673b8) != 0);
                        roomInstalled.setStoreName(cursorM4675b.getString(iM4673b9));
                        roomInstalled.setStatus(cursorM4675b.getInt(iM4673b10));
                        roomInstalled.setType(cursorM4675b.getInt(iM4673b11));
                        roomInstalled.setEnabled(cursorM4675b.getInt(iM4673b12) != 0);
                        roomInstalled.setAppSize(Long.valueOf(cursorM4675b.getLong(iM4673b13)));
                        arrayList = arrayList2;
                        arrayList.add(roomInstalled);
                    }
                    return arrayList;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public AbstractC9076m<List<RoomInstalled>> getAsListByPackageName(String str) {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * FROM Installed where packageName = ?", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        return C0655n.m4655a(this.__db, false, new String[]{"Installed"}, new Callable<List<RoomInstalled>>() { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.11
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomInstalled> call() throws Exception {
                Cursor cursorM4675b = C0663c.m4675b(InstalledDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "packageAndVersionCode");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, RoomInstalled.ICON);
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "packageName");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "name");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_CODE);
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_NAME);
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, RoomInstalled.SIGNATURE);
                    int iM4673b8 = C0662b.m4673b(cursorM4675b, "systemApp");
                    int iM4673b9 = C0662b.m4673b(cursorM4675b, "storeName");
                    int iM4673b10 = C0662b.m4673b(cursorM4675b, "status");
                    int iM4673b11 = C0662b.m4673b(cursorM4675b, "type");
                    int iM4673b12 = C0662b.m4673b(cursorM4675b, "enabled");
                    int iM4673b13 = C0662b.m4673b(cursorM4675b, "appSize");
                    ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
                    while (cursorM4675b.moveToNext()) {
                        RoomInstalled roomInstalled = new RoomInstalled();
                        ArrayList arrayList2 = arrayList;
                        roomInstalled.setPackageAndVersionCode(cursorM4675b.getString(iM4673b));
                        roomInstalled.setIcon(cursorM4675b.getString(iM4673b2));
                        roomInstalled.setPackageName(cursorM4675b.getString(iM4673b3));
                        roomInstalled.setName(cursorM4675b.getString(iM4673b4));
                        roomInstalled.setVersionCode(cursorM4675b.getInt(iM4673b5));
                        roomInstalled.setVersionName(cursorM4675b.getString(iM4673b6));
                        roomInstalled.setSignature(cursorM4675b.getString(iM4673b7));
                        roomInstalled.setSystemApp(cursorM4675b.getInt(iM4673b8) != 0);
                        roomInstalled.setStoreName(cursorM4675b.getString(iM4673b9));
                        roomInstalled.setStatus(cursorM4675b.getInt(iM4673b10));
                        roomInstalled.setType(cursorM4675b.getInt(iM4673b11));
                        roomInstalled.setEnabled(cursorM4675b.getInt(iM4673b12) != 0);
                        roomInstalled.setAppSize(Long.valueOf(cursorM4675b.getLong(iM4673b13)));
                        arrayList = arrayList2;
                        arrayList.add(roomInstalled);
                    }
                    return arrayList;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public void insert(RoomInstalled roomInstalled) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomInstalled.insert((AbstractC0644c<RoomInstalled>) roomInstalled);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public void insertAll(List<RoomInstalled> list) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomInstalled.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public AbstractC9082s<RoomInstalled> isInstalledByVersion(String str, int i2) {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * FROM installed where packageName = ? AND versionCode = ?", 2);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        c0654mM4644c.mo4652h0(2, i2);
        return C0655n.m4657c(new Callable<RoomInstalled>() { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.12
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomInstalled call() throws Exception {
                RoomInstalled roomInstalled = null;
                Cursor cursorM4675b = C0663c.m4675b(InstalledDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "packageAndVersionCode");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, RoomInstalled.ICON);
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "packageName");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "name");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_CODE);
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_NAME);
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, RoomInstalled.SIGNATURE);
                    int iM4673b8 = C0662b.m4673b(cursorM4675b, "systemApp");
                    int iM4673b9 = C0662b.m4673b(cursorM4675b, "storeName");
                    int iM4673b10 = C0662b.m4673b(cursorM4675b, "status");
                    int iM4673b11 = C0662b.m4673b(cursorM4675b, "type");
                    int iM4673b12 = C0662b.m4673b(cursorM4675b, "enabled");
                    int iM4673b13 = C0662b.m4673b(cursorM4675b, "appSize");
                    if (cursorM4675b.moveToFirst()) {
                        roomInstalled = new RoomInstalled();
                        roomInstalled.setPackageAndVersionCode(cursorM4675b.getString(iM4673b));
                        roomInstalled.setIcon(cursorM4675b.getString(iM4673b2));
                        roomInstalled.setPackageName(cursorM4675b.getString(iM4673b3));
                        roomInstalled.setName(cursorM4675b.getString(iM4673b4));
                        roomInstalled.setVersionCode(cursorM4675b.getInt(iM4673b5));
                        roomInstalled.setVersionName(cursorM4675b.getString(iM4673b6));
                        roomInstalled.setSignature(cursorM4675b.getString(iM4673b7));
                        boolean z = true;
                        roomInstalled.setSystemApp(cursorM4675b.getInt(iM4673b8) != 0);
                        roomInstalled.setStoreName(cursorM4675b.getString(iM4673b9));
                        roomInstalled.setStatus(cursorM4675b.getInt(iM4673b10));
                        roomInstalled.setType(cursorM4675b.getInt(iM4673b11));
                        if (cursorM4675b.getInt(iM4673b12) == 0) {
                            z = false;
                        }
                        roomInstalled.setEnabled(z);
                        roomInstalled.setAppSize(Long.valueOf(cursorM4675b.getLong(iM4673b13)));
                    }
                    if (roomInstalled != null) {
                        return roomInstalled;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + c0654mM4644c.mo4648a());
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public AbstractC9064b remove(final String str, final int i2) {
        return AbstractC9064b.m29158d(new Callable<Void>() { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.5
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                InterfaceC1012f interfaceC1012fAcquire = InstalledDao_Impl.this.__preparedStmtOfRemove.acquire();
                String str2 = str;
                if (str2 == null) {
                    interfaceC1012fAcquire.mo4646I0(1);
                } else {
                    interfaceC1012fAcquire.mo4654w(1, str2);
                }
                interfaceC1012fAcquire.mo4652h0(2, i2);
                InstalledDao_Impl.this.__db.beginTransaction();
                try {
                    interfaceC1012fAcquire.mo6470E();
                    InstalledDao_Impl.this.__db.setTransactionSuccessful();
                    return null;
                } finally {
                    InstalledDao_Impl.this.__db.endTransaction();
                    InstalledDao_Impl.this.__preparedStmtOfRemove.release(interfaceC1012fAcquire);
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public void removeAll() throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1012f interfaceC1012fAcquire = this.__preparedStmtOfRemoveAll.acquire();
        this.__db.beginTransaction();
        try {
            interfaceC1012fAcquire.mo6470E();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveAll.release(interfaceC1012fAcquire);
        }
    }

    @Override // cm.aptoide.p092pt.database.room.InstalledDao
    public AbstractC9064b remove(final String str) {
        return AbstractC9064b.m29158d(new Callable<Void>() { // from class: cm.aptoide.pt.database.room.InstalledDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                InterfaceC1012f interfaceC1012fAcquire = InstalledDao_Impl.this.__preparedStmtOfRemove_1.acquire();
                String str2 = str;
                if (str2 == null) {
                    interfaceC1012fAcquire.mo4646I0(1);
                } else {
                    interfaceC1012fAcquire.mo4654w(1, str2);
                }
                InstalledDao_Impl.this.__db.beginTransaction();
                try {
                    interfaceC1012fAcquire.mo6470E();
                    InstalledDao_Impl.this.__db.setTransactionSuccessful();
                    return null;
                } finally {
                    InstalledDao_Impl.this.__db.endTransaction();
                    InstalledDao_Impl.this.__preparedStmtOfRemove_1.release(interfaceC1012fAcquire);
                }
            }
        });
    }
}
