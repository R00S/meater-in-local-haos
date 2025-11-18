package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import android.database.SQLException;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.p010t.C0663c;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9076m;

/* loaded from: classes.dex */
public final class MigratedAppDAO_Impl implements MigratedAppDAO {
    private final AbstractC0651j __db;
    private final AbstractC0644c<RoomMigratedApp> __insertionAdapterOfRoomMigratedApp;

    public MigratedAppDAO_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomMigratedApp = new AbstractC0644c<RoomMigratedApp>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.MigratedAppDAO_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `migratedapp` (`packageName`) VALUES (?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomMigratedApp roomMigratedApp) {
                if (roomMigratedApp.getPackageName() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomMigratedApp.getPackageName());
                }
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.MigratedAppDAO
    public AbstractC9076m<Integer> isAppMigrated(String str) {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT COUNT(*) from migratedapp where packageName like ?", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        return C0655n.m4655a(this.__db, false, new String[]{"migratedapp"}, new Callable<Integer>() { // from class: cm.aptoide.pt.database.room.MigratedAppDAO_Impl.2
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                Integer numValueOf = null;
                Cursor cursorM4675b = C0663c.m4675b(MigratedAppDAO_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    if (cursorM4675b.moveToFirst() && !cursorM4675b.isNull(0)) {
                        numValueOf = Integer.valueOf(cursorM4675b.getInt(0));
                    }
                    return numValueOf;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.MigratedAppDAO
    public void save(RoomMigratedApp roomMigratedApp) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomMigratedApp.insert((AbstractC0644c<RoomMigratedApp>) roomMigratedApp);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
