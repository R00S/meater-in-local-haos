package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import android.database.SQLException;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9076m;

/* loaded from: classes.dex */
public final class InstallationDao_Impl implements InstallationDao {
    private final AbstractC0651j __db;
    private final AbstractC0644c<RoomInstallation> __insertionAdapterOfRoomInstallation;

    public InstallationDao_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomInstallation = new AbstractC0644c<RoomInstallation>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.InstallationDao_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `installation` (`packageName`,`icon`,`name`,`versionCode`,`versionName`) VALUES (?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomInstallation roomInstallation) {
                if (roomInstallation.getPackageName() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomInstallation.getPackageName());
                }
                if (roomInstallation.getIcon() == null) {
                    interfaceC1012f.mo4646I0(2);
                } else {
                    interfaceC1012f.mo4654w(2, roomInstallation.getIcon());
                }
                if (roomInstallation.getName() == null) {
                    interfaceC1012f.mo4646I0(3);
                } else {
                    interfaceC1012f.mo4654w(3, roomInstallation.getName());
                }
                interfaceC1012f.mo4652h0(4, roomInstallation.getVersionCode());
                if (roomInstallation.getVersionName() == null) {
                    interfaceC1012f.mo4646I0(5);
                } else {
                    interfaceC1012f.mo4654w(5, roomInstallation.getVersionName());
                }
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.InstallationDao
    public AbstractC9076m<List<RoomInstallation>> getAll() {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * FROM installation", 0);
        return C0655n.m4655a(this.__db, false, new String[]{"installation"}, new Callable<List<RoomInstallation>>() { // from class: cm.aptoide.pt.database.room.InstallationDao_Impl.2
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomInstallation> call() throws Exception {
                Cursor cursorM4675b = C0663c.m4675b(InstallationDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "packageName");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, RoomInstalled.ICON);
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "name");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_CODE);
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, RoomInstalled.VERSION_NAME);
                    ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
                    while (cursorM4675b.moveToNext()) {
                        arrayList.add(new RoomInstallation(cursorM4675b.getString(iM4673b), cursorM4675b.getString(iM4673b3), cursorM4675b.getString(iM4673b2), cursorM4675b.getInt(iM4673b4), cursorM4675b.getString(iM4673b5)));
                    }
                    return arrayList;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.InstallationDao
    public void insert(RoomInstallation roomInstallation) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomInstallation.insert((AbstractC0644c<RoomInstallation>) roomInstallation);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.InstallationDao
    public void insertAll(List<RoomInstallation> list) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomInstallation.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
