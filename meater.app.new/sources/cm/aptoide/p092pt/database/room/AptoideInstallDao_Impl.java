package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import android.database.SQLException;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.EmptyResultSetException;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9082s;

/* loaded from: classes.dex */
public final class AptoideInstallDao_Impl implements AptoideInstallDao {
    private final AbstractC0651j __db;
    private final AbstractC0644c<RoomAptoideInstallApp> __insertionAdapterOfRoomAptoideInstallApp;

    public AptoideInstallDao_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomAptoideInstallApp = new AbstractC0644c<RoomAptoideInstallApp>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.AptoideInstallDao_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `aptoideinstallapp` (`packageName`) VALUES (?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomAptoideInstallApp roomAptoideInstallApp) {
                if (roomAptoideInstallApp.getPackageName() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomAptoideInstallApp.getPackageName());
                }
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideInstallDao
    public AbstractC9082s<RoomAptoideInstallApp> get(String str) {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * from aptoideinstallapp where packageName = ? LIMIT 1", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        return C0655n.m4657c(new Callable<RoomAptoideInstallApp>() { // from class: cm.aptoide.pt.database.room.AptoideInstallDao_Impl.2
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomAptoideInstallApp call() throws Exception {
                Cursor cursorM4675b = C0663c.m4675b(AptoideInstallDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    RoomAptoideInstallApp roomAptoideInstallApp = cursorM4675b.moveToFirst() ? new RoomAptoideInstallApp(cursorM4675b.getString(C0662b.m4673b(cursorM4675b, "packageName"))) : null;
                    if (roomAptoideInstallApp != null) {
                        return roomAptoideInstallApp;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + c0654mM4644c.mo4648a());
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.AptoideInstallDao
    public void insert(RoomAptoideInstallApp roomAptoideInstallApp) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomAptoideInstallApp.insert((AbstractC0644c<RoomAptoideInstallApp>) roomAptoideInstallApp);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
