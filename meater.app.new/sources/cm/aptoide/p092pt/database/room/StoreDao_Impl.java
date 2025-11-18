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
import cm.aptoide.p092pt.account.AccountAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9082s;

/* loaded from: classes.dex */
public final class StoreDao_Impl implements StoreDao {
    private final AbstractC0651j __db;
    private final AbstractC0644c<RoomStore> __insertionAdapterOfRoomStore;
    private final AbstractC0658q __preparedStmtOfRemoveByStoreName;

    public StoreDao_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomStore = new AbstractC0644c<RoomStore>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `store` (`storeId`,`iconPath`,`theme`,`downloads`,`storeName`,`username`,`passwordSha1`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomStore roomStore) {
                interfaceC1012f.mo4652h0(1, roomStore.getStoreId());
                if (roomStore.getIconPath() == null) {
                    interfaceC1012f.mo4646I0(2);
                } else {
                    interfaceC1012f.mo4654w(2, roomStore.getIconPath());
                }
                if (roomStore.getTheme() == null) {
                    interfaceC1012f.mo4646I0(3);
                } else {
                    interfaceC1012f.mo4654w(3, roomStore.getTheme());
                }
                interfaceC1012f.mo4652h0(4, roomStore.getDownloads());
                if (roomStore.getStoreName() == null) {
                    interfaceC1012f.mo4646I0(5);
                } else {
                    interfaceC1012f.mo4654w(5, roomStore.getStoreName());
                }
                if (roomStore.getUsername() == null) {
                    interfaceC1012f.mo4646I0(6);
                } else {
                    interfaceC1012f.mo4654w(6, roomStore.getUsername());
                }
                if (roomStore.getPasswordSha1() == null) {
                    interfaceC1012f.mo4646I0(7);
                } else {
                    interfaceC1012f.mo4654w(7, roomStore.getPasswordSha1());
                }
            }
        };
        this.__preparedStmtOfRemoveByStoreName = new AbstractC0658q(abstractC0651j) { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.2
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM store where storeName = ?";
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public AbstractC9076m<List<RoomStore>> getAll() {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * from store", 0);
        return C0655n.m4655a(this.__db, false, new String[]{AccountAnalytics.STORE}, new Callable<List<RoomStore>>() { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.3
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomStore> call() throws Exception {
                Cursor cursorM4675b = C0663c.m4675b(StoreDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, RoomStore.STORE_ID);
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, RoomStore.ICON_PATH);
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, RoomStore.THEME);
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, RoomStore.DOWNLOADS);
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, "storeName");
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, "username");
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, RoomStore.PASSWORD_SHA1);
                    ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
                    while (cursorM4675b.moveToNext()) {
                        RoomStore roomStore = new RoomStore();
                        roomStore.setStoreId(cursorM4675b.getLong(iM4673b));
                        roomStore.setIconPath(cursorM4675b.getString(iM4673b2));
                        roomStore.setTheme(cursorM4675b.getString(iM4673b3));
                        roomStore.setDownloads(cursorM4675b.getLong(iM4673b4));
                        roomStore.setStoreName(cursorM4675b.getString(iM4673b5));
                        roomStore.setUsername(cursorM4675b.getString(iM4673b6));
                        roomStore.setPasswordSha1(cursorM4675b.getString(iM4673b7));
                        arrayList.add(roomStore);
                    }
                    return arrayList;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public AbstractC9082s<RoomStore> getByStoreId(long j2) {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * from store where storeId = ?", 1);
        c0654mM4644c.mo4652h0(1, j2);
        return C0655n.m4657c(new Callable<RoomStore>() { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.5
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomStore call() throws Exception {
                RoomStore roomStore = null;
                Cursor cursorM4675b = C0663c.m4675b(StoreDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, RoomStore.STORE_ID);
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, RoomStore.ICON_PATH);
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, RoomStore.THEME);
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, RoomStore.DOWNLOADS);
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, "storeName");
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, "username");
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, RoomStore.PASSWORD_SHA1);
                    if (cursorM4675b.moveToFirst()) {
                        roomStore = new RoomStore();
                        roomStore.setStoreId(cursorM4675b.getLong(iM4673b));
                        roomStore.setIconPath(cursorM4675b.getString(iM4673b2));
                        roomStore.setTheme(cursorM4675b.getString(iM4673b3));
                        roomStore.setDownloads(cursorM4675b.getLong(iM4673b4));
                        roomStore.setStoreName(cursorM4675b.getString(iM4673b5));
                        roomStore.setUsername(cursorM4675b.getString(iM4673b6));
                        roomStore.setPasswordSha1(cursorM4675b.getString(iM4673b7));
                    }
                    if (roomStore != null) {
                        return roomStore;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + c0654mM4644c.mo4648a());
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public AbstractC9082s<RoomStore> getByStoreName(String str) {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * from store where storeName = ?", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        return C0655n.m4657c(new Callable<RoomStore>() { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.4
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomStore call() throws Exception {
                RoomStore roomStore = null;
                Cursor cursorM4675b = C0663c.m4675b(StoreDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, RoomStore.STORE_ID);
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, RoomStore.ICON_PATH);
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, RoomStore.THEME);
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, RoomStore.DOWNLOADS);
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, "storeName");
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, "username");
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, RoomStore.PASSWORD_SHA1);
                    if (cursorM4675b.moveToFirst()) {
                        roomStore = new RoomStore();
                        roomStore.setStoreId(cursorM4675b.getLong(iM4673b));
                        roomStore.setIconPath(cursorM4675b.getString(iM4673b2));
                        roomStore.setTheme(cursorM4675b.getString(iM4673b3));
                        roomStore.setDownloads(cursorM4675b.getLong(iM4673b4));
                        roomStore.setStoreName(cursorM4675b.getString(iM4673b5));
                        roomStore.setUsername(cursorM4675b.getString(iM4673b6));
                        roomStore.setPasswordSha1(cursorM4675b.getString(iM4673b7));
                    }
                    if (roomStore != null) {
                        return roomStore;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + c0654mM4644c.mo4648a());
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public void insert(RoomStore roomStore) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomStore.insert((AbstractC0644c<RoomStore>) roomStore);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public AbstractC9076m<Integer> isSubscribed(long j2) {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT COUNT(*) from store where storeId = ?", 1);
        c0654mM4644c.mo4652h0(1, j2);
        return C0655n.m4655a(this.__db, false, new String[]{AccountAnalytics.STORE}, new Callable<Integer>() { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.6
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                Integer numValueOf = null;
                Cursor cursorM4675b = C0663c.m4675b(StoreDao_Impl.this.__db, c0654mM4644c, false, null);
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

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public void removeByStoreName(String str) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1012f interfaceC1012fAcquire = this.__preparedStmtOfRemoveByStoreName.acquire();
        if (str == null) {
            interfaceC1012fAcquire.mo4646I0(1);
        } else {
            interfaceC1012fAcquire.mo4654w(1, str);
        }
        this.__db.beginTransaction();
        try {
            interfaceC1012fAcquire.mo6470E();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveByStoreName.release(interfaceC1012fAcquire);
        }
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public void saveAll(List<RoomStore> list) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomStore.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
