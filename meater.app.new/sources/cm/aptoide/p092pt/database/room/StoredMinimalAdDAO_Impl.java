package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import android.database.SQLException;
import androidx.room.AbstractC0643b;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9076m;

/* loaded from: classes.dex */
public final class StoredMinimalAdDAO_Impl implements StoredMinimalAdDAO {
    private final AbstractC0651j __db;
    private final AbstractC0643b<RoomStoredMinimalAd> __deletionAdapterOfRoomStoredMinimalAd;
    private final AbstractC0644c<RoomStoredMinimalAd> __insertionAdapterOfRoomStoredMinimalAd;

    public StoredMinimalAdDAO_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomStoredMinimalAd = new AbstractC0644c<RoomStoredMinimalAd>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.StoredMinimalAdDAO_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `storedMinimalAd` (`packageName`,`referrer`,`cpcUrl`,`cpdUrl`,`cpiUrl`,`timestamp`,`adId`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomStoredMinimalAd roomStoredMinimalAd) {
                if (roomStoredMinimalAd.getPackageName() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomStoredMinimalAd.getPackageName());
                }
                if (roomStoredMinimalAd.getReferrer() == null) {
                    interfaceC1012f.mo4646I0(2);
                } else {
                    interfaceC1012f.mo4654w(2, roomStoredMinimalAd.getReferrer());
                }
                if (roomStoredMinimalAd.getCpcUrl() == null) {
                    interfaceC1012f.mo4646I0(3);
                } else {
                    interfaceC1012f.mo4654w(3, roomStoredMinimalAd.getCpcUrl());
                }
                if (roomStoredMinimalAd.getCpdUrl() == null) {
                    interfaceC1012f.mo4646I0(4);
                } else {
                    interfaceC1012f.mo4654w(4, roomStoredMinimalAd.getCpdUrl());
                }
                if (roomStoredMinimalAd.getCpiUrl() == null) {
                    interfaceC1012f.mo4646I0(5);
                } else {
                    interfaceC1012f.mo4654w(5, roomStoredMinimalAd.getCpiUrl());
                }
                if (roomStoredMinimalAd.getTimestamp() == null) {
                    interfaceC1012f.mo4646I0(6);
                } else {
                    interfaceC1012f.mo4652h0(6, roomStoredMinimalAd.getTimestamp().longValue());
                }
                if (roomStoredMinimalAd.getAdId() == null) {
                    interfaceC1012f.mo4646I0(7);
                } else {
                    interfaceC1012f.mo4652h0(7, roomStoredMinimalAd.getAdId().longValue());
                }
            }
        };
        this.__deletionAdapterOfRoomStoredMinimalAd = new AbstractC0643b<RoomStoredMinimalAd>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.StoredMinimalAdDAO_Impl.2
            @Override // androidx.room.AbstractC0643b, androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM `storedMinimalAd` WHERE `packageName` = ?";
            }

            @Override // androidx.room.AbstractC0643b
            public void bind(InterfaceC1012f interfaceC1012f, RoomStoredMinimalAd roomStoredMinimalAd) {
                if (roomStoredMinimalAd.getPackageName() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomStoredMinimalAd.getPackageName());
                }
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.StoredMinimalAdDAO
    public void delete(RoomStoredMinimalAd roomStoredMinimalAd) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfRoomStoredMinimalAd.handle(roomStoredMinimalAd);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.StoredMinimalAdDAO
    public AbstractC9076m<RoomStoredMinimalAd> get(String str) {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * FROM storedMinimalAd WHERE packageName = ?", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        return C0655n.m4655a(this.__db, false, new String[]{"storedMinimalAd"}, new Callable<RoomStoredMinimalAd>() { // from class: cm.aptoide.pt.database.room.StoredMinimalAdDAO_Impl.3
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomStoredMinimalAd call() throws Exception {
                RoomStoredMinimalAd roomStoredMinimalAd = null;
                Long lValueOf = null;
                Cursor cursorM4675b = C0663c.m4675b(StoredMinimalAdDAO_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "packageName");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, "referrer");
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "cpcUrl");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "cpdUrl");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, "cpiUrl");
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, "timestamp");
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, "adId");
                    if (cursorM4675b.moveToFirst()) {
                        RoomStoredMinimalAd roomStoredMinimalAd2 = new RoomStoredMinimalAd(cursorM4675b.getString(iM4673b), cursorM4675b.getString(iM4673b2), cursorM4675b.getString(iM4673b3), cursorM4675b.getString(iM4673b4), cursorM4675b.getString(iM4673b5), cursorM4675b.isNull(iM4673b7) ? null : Long.valueOf(cursorM4675b.getLong(iM4673b7)));
                        if (!cursorM4675b.isNull(iM4673b6)) {
                            lValueOf = Long.valueOf(cursorM4675b.getLong(iM4673b6));
                        }
                        roomStoredMinimalAd2.setTimestamp(lValueOf);
                        roomStoredMinimalAd = roomStoredMinimalAd2;
                    }
                    return roomStoredMinimalAd;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.StoredMinimalAdDAO
    public void insert(RoomStoredMinimalAd roomStoredMinimalAd) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomStoredMinimalAd.insert((AbstractC0644c<RoomStoredMinimalAd>) roomStoredMinimalAd);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
