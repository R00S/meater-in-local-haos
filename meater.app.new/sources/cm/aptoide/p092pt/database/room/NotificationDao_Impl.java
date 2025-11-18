package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import android.database.SQLException;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.AbstractC0658q;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import androidx.room.p010t.C0666f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9082s;

/* loaded from: classes.dex */
public final class NotificationDao_Impl implements NotificationDao {
    private final AbstractC0651j __db;
    private final AbstractC0644c<RoomNotification> __insertionAdapterOfRoomNotification;
    private final AbstractC0658q __preparedStmtOfDeleteAllByType;

    public NotificationDao_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomNotification = new AbstractC0644c<RoomNotification>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `notification` (`expire`,`abTestingGroup`,`body`,`campaignId`,`img`,`lang`,`title`,`url`,`urlTrack`,`notificationCenterUrlTrack`,`type`,`timeStamp`,`appName`,`graphic`,`ownerId`,`processed`,`actionStringRes`,`whitelistedPackages`,`key`,`dismissed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomNotification roomNotification) {
                if (roomNotification.getExpire() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4652h0(1, roomNotification.getExpire().longValue());
                }
                if (roomNotification.getAbTestingGroup() == null) {
                    interfaceC1012f.mo4646I0(2);
                } else {
                    interfaceC1012f.mo4654w(2, roomNotification.getAbTestingGroup());
                }
                if (roomNotification.getBody() == null) {
                    interfaceC1012f.mo4646I0(3);
                } else {
                    interfaceC1012f.mo4654w(3, roomNotification.getBody());
                }
                interfaceC1012f.mo4652h0(4, roomNotification.getCampaignId());
                if (roomNotification.getImg() == null) {
                    interfaceC1012f.mo4646I0(5);
                } else {
                    interfaceC1012f.mo4654w(5, roomNotification.getImg());
                }
                if (roomNotification.getLang() == null) {
                    interfaceC1012f.mo4646I0(6);
                } else {
                    interfaceC1012f.mo4654w(6, roomNotification.getLang());
                }
                if (roomNotification.getTitle() == null) {
                    interfaceC1012f.mo4646I0(7);
                } else {
                    interfaceC1012f.mo4654w(7, roomNotification.getTitle());
                }
                if (roomNotification.getUrl() == null) {
                    interfaceC1012f.mo4646I0(8);
                } else {
                    interfaceC1012f.mo4654w(8, roomNotification.getUrl());
                }
                if (roomNotification.getUrlTrack() == null) {
                    interfaceC1012f.mo4646I0(9);
                } else {
                    interfaceC1012f.mo4654w(9, roomNotification.getUrlTrack());
                }
                if (roomNotification.getNotificationCenterUrlTrack() == null) {
                    interfaceC1012f.mo4646I0(10);
                } else {
                    interfaceC1012f.mo4654w(10, roomNotification.getNotificationCenterUrlTrack());
                }
                interfaceC1012f.mo4652h0(11, roomNotification.getType());
                interfaceC1012f.mo4652h0(12, roomNotification.getTimeStamp());
                if (roomNotification.getAppName() == null) {
                    interfaceC1012f.mo4646I0(13);
                } else {
                    interfaceC1012f.mo4654w(13, roomNotification.getAppName());
                }
                if (roomNotification.getGraphic() == null) {
                    interfaceC1012f.mo4646I0(14);
                } else {
                    interfaceC1012f.mo4654w(14, roomNotification.getGraphic());
                }
                if (roomNotification.getOwnerId() == null) {
                    interfaceC1012f.mo4646I0(15);
                } else {
                    interfaceC1012f.mo4654w(15, roomNotification.getOwnerId());
                }
                interfaceC1012f.mo4652h0(16, roomNotification.isProcessed() ? 1L : 0L);
                interfaceC1012f.mo4652h0(17, roomNotification.getActionStringRes());
                String strSaveList = StringTypeConverter.saveList(roomNotification.getWhitelistedPackages());
                if (strSaveList == null) {
                    interfaceC1012f.mo4646I0(18);
                } else {
                    interfaceC1012f.mo4654w(18, strSaveList);
                }
                if (roomNotification.getKey() == null) {
                    interfaceC1012f.mo4646I0(19);
                } else {
                    interfaceC1012f.mo4654w(19, roomNotification.getKey());
                }
                interfaceC1012f.mo4652h0(20, roomNotification.getDismissed());
            }
        };
        this.__preparedStmtOfDeleteAllByType = new AbstractC0658q(abstractC0651j) { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.2
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM notification where type = ?";
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public void deleteAllByType(int i2) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1012f interfaceC1012fAcquire = this.__preparedStmtOfDeleteAllByType.acquire();
        interfaceC1012fAcquire.mo4652h0(1, i2);
        this.__db.beginTransaction();
        try {
            interfaceC1012fAcquire.mo6470E();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAllByType.release(interfaceC1012fAcquire);
        }
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public void deleteAllExcluding(List<String> list) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder sbM4681b = C0666f.m4681b();
        sbM4681b.append("DELETE FROM notification where ownerId NOT IN (");
        C0666f.m4680a(sbM4681b, list.size());
        sbM4681b.append(") ");
        InterfaceC1012f interfaceC1012fCompileStatement = this.__db.compileStatement(sbM4681b.toString());
        int i2 = 1;
        for (String str : list) {
            if (str == null) {
                interfaceC1012fCompileStatement.mo4646I0(i2);
            } else {
                interfaceC1012fCompileStatement.mo4654w(i2, str);
            }
            i2++;
        }
        this.__db.beginTransaction();
        try {
            interfaceC1012fCompileStatement.mo6470E();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public void deleteByKey(List<String> list) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder sbM4681b = C0666f.m4681b();
        sbM4681b.append("DELETE FROM notification where `key` IN (");
        C0666f.m4680a(sbM4681b, list.size());
        sbM4681b.append(") ");
        InterfaceC1012f interfaceC1012fCompileStatement = this.__db.compileStatement(sbM4681b.toString());
        int i2 = 1;
        for (String str : list) {
            if (str == null) {
                interfaceC1012fCompileStatement.mo4646I0(i2);
            } else {
                interfaceC1012fCompileStatement.mo4654w(i2, str);
            }
            i2++;
        }
        this.__db.beginTransaction();
        try {
            interfaceC1012fCompileStatement.mo6470E();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public AbstractC9076m<List<RoomNotification>> getAll() {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * FROM notification", 0);
        return C0655n.m4655a(this.__db, false, new String[]{"notification"}, new Callable<List<RoomNotification>>() { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.6
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomNotification> call() throws Exception {
                int i2;
                boolean z;
                Cursor cursorM4675b = C0663c.m4675b(NotificationDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "expire");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, "abTestingGroup");
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "body");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "campaignId");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, "img");
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, "lang");
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, "title");
                    int iM4673b8 = C0662b.m4673b(cursorM4675b, "url");
                    int iM4673b9 = C0662b.m4673b(cursorM4675b, "urlTrack");
                    int iM4673b10 = C0662b.m4673b(cursorM4675b, "notificationCenterUrlTrack");
                    int iM4673b11 = C0662b.m4673b(cursorM4675b, "type");
                    int iM4673b12 = C0662b.m4673b(cursorM4675b, "timeStamp");
                    int iM4673b13 = C0662b.m4673b(cursorM4675b, "appName");
                    int iM4673b14 = C0662b.m4673b(cursorM4675b, "graphic");
                    int iM4673b15 = C0662b.m4673b(cursorM4675b, "ownerId");
                    int iM4673b16 = C0662b.m4673b(cursorM4675b, "processed");
                    int iM4673b17 = C0662b.m4673b(cursorM4675b, "actionStringRes");
                    int iM4673b18 = C0662b.m4673b(cursorM4675b, "whitelistedPackages");
                    int iM4673b19 = C0662b.m4673b(cursorM4675b, RoomNotification.KEY);
                    int iM4673b20 = C0662b.m4673b(cursorM4675b, "dismissed");
                    int i3 = iM4673b14;
                    ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
                    while (cursorM4675b.moveToNext()) {
                        Long lValueOf = cursorM4675b.isNull(iM4673b) ? null : Long.valueOf(cursorM4675b.getLong(iM4673b));
                        String string = cursorM4675b.getString(iM4673b2);
                        String string2 = cursorM4675b.getString(iM4673b3);
                        int i4 = cursorM4675b.getInt(iM4673b4);
                        String string3 = cursorM4675b.getString(iM4673b5);
                        String string4 = cursorM4675b.getString(iM4673b6);
                        String string5 = cursorM4675b.getString(iM4673b7);
                        String string6 = cursorM4675b.getString(iM4673b8);
                        String string7 = cursorM4675b.getString(iM4673b9);
                        String string8 = cursorM4675b.getString(iM4673b10);
                        int i5 = cursorM4675b.getInt(iM4673b11);
                        long j2 = cursorM4675b.getLong(iM4673b12);
                        String string9 = cursorM4675b.getString(iM4673b13);
                        int i6 = i3;
                        String string10 = cursorM4675b.getString(i6);
                        int i7 = iM4673b;
                        int i8 = iM4673b15;
                        String string11 = cursorM4675b.getString(i8);
                        iM4673b15 = i8;
                        int i9 = iM4673b16;
                        if (cursorM4675b.getInt(i9) != 0) {
                            iM4673b16 = i9;
                            i2 = iM4673b17;
                            z = true;
                        } else {
                            iM4673b16 = i9;
                            i2 = iM4673b17;
                            z = false;
                        }
                        int i10 = cursorM4675b.getInt(i2);
                        iM4673b17 = i2;
                        int i11 = iM4673b18;
                        List<String> listRestoreList = StringTypeConverter.restoreList(cursorM4675b.getString(i11));
                        iM4673b18 = i11;
                        int i12 = iM4673b20;
                        iM4673b20 = i12;
                        RoomNotification roomNotification = new RoomNotification(lValueOf, string, string2, i4, string3, string4, string5, string6, string7, string8, j2, i5, cursorM4675b.getLong(i12), string9, string10, string11, z, i10, listRestoreList);
                        int i13 = iM4673b13;
                        int i14 = iM4673b19;
                        roomNotification.setKey(cursorM4675b.getString(i14));
                        arrayList.add(roomNotification);
                        iM4673b = i7;
                        i3 = i6;
                        iM4673b19 = i14;
                        iM4673b13 = i13;
                    }
                    return arrayList;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public AbstractC9076m<List<RoomNotification>> getAllSortedDesc() {
        final C0654m c0654mM4644c = C0654m.m4644c("SELECT * from notification ORDER BY timeStamp DESC", 0);
        return C0655n.m4655a(this.__db, false, new String[]{"notification"}, new Callable<List<RoomNotification>>() { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.5
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomNotification> call() throws Exception {
                int i2;
                boolean z;
                Cursor cursorM4675b = C0663c.m4675b(NotificationDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "expire");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, "abTestingGroup");
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "body");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "campaignId");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, "img");
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, "lang");
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, "title");
                    int iM4673b8 = C0662b.m4673b(cursorM4675b, "url");
                    int iM4673b9 = C0662b.m4673b(cursorM4675b, "urlTrack");
                    int iM4673b10 = C0662b.m4673b(cursorM4675b, "notificationCenterUrlTrack");
                    int iM4673b11 = C0662b.m4673b(cursorM4675b, "type");
                    int iM4673b12 = C0662b.m4673b(cursorM4675b, "timeStamp");
                    int iM4673b13 = C0662b.m4673b(cursorM4675b, "appName");
                    int iM4673b14 = C0662b.m4673b(cursorM4675b, "graphic");
                    int iM4673b15 = C0662b.m4673b(cursorM4675b, "ownerId");
                    int iM4673b16 = C0662b.m4673b(cursorM4675b, "processed");
                    int iM4673b17 = C0662b.m4673b(cursorM4675b, "actionStringRes");
                    int iM4673b18 = C0662b.m4673b(cursorM4675b, "whitelistedPackages");
                    int iM4673b19 = C0662b.m4673b(cursorM4675b, RoomNotification.KEY);
                    int iM4673b20 = C0662b.m4673b(cursorM4675b, "dismissed");
                    int i3 = iM4673b14;
                    ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
                    while (cursorM4675b.moveToNext()) {
                        Long lValueOf = cursorM4675b.isNull(iM4673b) ? null : Long.valueOf(cursorM4675b.getLong(iM4673b));
                        String string = cursorM4675b.getString(iM4673b2);
                        String string2 = cursorM4675b.getString(iM4673b3);
                        int i4 = cursorM4675b.getInt(iM4673b4);
                        String string3 = cursorM4675b.getString(iM4673b5);
                        String string4 = cursorM4675b.getString(iM4673b6);
                        String string5 = cursorM4675b.getString(iM4673b7);
                        String string6 = cursorM4675b.getString(iM4673b8);
                        String string7 = cursorM4675b.getString(iM4673b9);
                        String string8 = cursorM4675b.getString(iM4673b10);
                        int i5 = cursorM4675b.getInt(iM4673b11);
                        long j2 = cursorM4675b.getLong(iM4673b12);
                        String string9 = cursorM4675b.getString(iM4673b13);
                        int i6 = i3;
                        String string10 = cursorM4675b.getString(i6);
                        int i7 = iM4673b;
                        int i8 = iM4673b15;
                        String string11 = cursorM4675b.getString(i8);
                        iM4673b15 = i8;
                        int i9 = iM4673b16;
                        if (cursorM4675b.getInt(i9) != 0) {
                            iM4673b16 = i9;
                            i2 = iM4673b17;
                            z = true;
                        } else {
                            iM4673b16 = i9;
                            i2 = iM4673b17;
                            z = false;
                        }
                        int i10 = cursorM4675b.getInt(i2);
                        iM4673b17 = i2;
                        int i11 = iM4673b18;
                        List<String> listRestoreList = StringTypeConverter.restoreList(cursorM4675b.getString(i11));
                        iM4673b18 = i11;
                        int i12 = iM4673b20;
                        iM4673b20 = i12;
                        RoomNotification roomNotification = new RoomNotification(lValueOf, string, string2, i4, string3, string4, string5, string6, string7, string8, j2, i5, cursorM4675b.getLong(i12), string9, string10, string11, z, i10, listRestoreList);
                        int i13 = iM4673b13;
                        int i14 = iM4673b19;
                        roomNotification.setKey(cursorM4675b.getString(i14));
                        arrayList.add(roomNotification);
                        iM4673b = i7;
                        i3 = i6;
                        iM4673b19 = i14;
                        iM4673b13 = i13;
                    }
                    return arrayList;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public AbstractC9082s<List<RoomNotification>> getAllSortedDescByType(Integer[] numArr) {
        StringBuilder sbM4681b = C0666f.m4681b();
        sbM4681b.append("SELECT ");
        sbM4681b.append("*");
        sbM4681b.append(" from notification where type IN (");
        int length = numArr.length;
        C0666f.m4680a(sbM4681b, length);
        sbM4681b.append(") ORDER BY timeStamp DESC");
        final C0654m c0654mM4644c = C0654m.m4644c(sbM4681b.toString(), length + 0);
        int i2 = 1;
        for (Integer num : numArr) {
            if (num == null) {
                c0654mM4644c.mo4646I0(i2);
            } else {
                c0654mM4644c.mo4652h0(i2, r4.intValue());
            }
            i2++;
        }
        return C0655n.m4657c(new Callable<List<RoomNotification>>() { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.4
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomNotification> call() throws Exception {
                int i3;
                boolean z;
                Cursor cursorM4675b = C0663c.m4675b(NotificationDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "expire");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, "abTestingGroup");
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "body");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "campaignId");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, "img");
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, "lang");
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, "title");
                    int iM4673b8 = C0662b.m4673b(cursorM4675b, "url");
                    int iM4673b9 = C0662b.m4673b(cursorM4675b, "urlTrack");
                    int iM4673b10 = C0662b.m4673b(cursorM4675b, "notificationCenterUrlTrack");
                    int iM4673b11 = C0662b.m4673b(cursorM4675b, "type");
                    int iM4673b12 = C0662b.m4673b(cursorM4675b, "timeStamp");
                    int iM4673b13 = C0662b.m4673b(cursorM4675b, "appName");
                    int iM4673b14 = C0662b.m4673b(cursorM4675b, "graphic");
                    int iM4673b15 = C0662b.m4673b(cursorM4675b, "ownerId");
                    int iM4673b16 = C0662b.m4673b(cursorM4675b, "processed");
                    int iM4673b17 = C0662b.m4673b(cursorM4675b, "actionStringRes");
                    int iM4673b18 = C0662b.m4673b(cursorM4675b, "whitelistedPackages");
                    int iM4673b19 = C0662b.m4673b(cursorM4675b, RoomNotification.KEY);
                    int iM4673b20 = C0662b.m4673b(cursorM4675b, "dismissed");
                    int i4 = iM4673b14;
                    ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
                    while (cursorM4675b.moveToNext()) {
                        Long lValueOf = cursorM4675b.isNull(iM4673b) ? null : Long.valueOf(cursorM4675b.getLong(iM4673b));
                        String string = cursorM4675b.getString(iM4673b2);
                        String string2 = cursorM4675b.getString(iM4673b3);
                        int i5 = cursorM4675b.getInt(iM4673b4);
                        String string3 = cursorM4675b.getString(iM4673b5);
                        String string4 = cursorM4675b.getString(iM4673b6);
                        String string5 = cursorM4675b.getString(iM4673b7);
                        String string6 = cursorM4675b.getString(iM4673b8);
                        String string7 = cursorM4675b.getString(iM4673b9);
                        String string8 = cursorM4675b.getString(iM4673b10);
                        int i6 = cursorM4675b.getInt(iM4673b11);
                        long j2 = cursorM4675b.getLong(iM4673b12);
                        String string9 = cursorM4675b.getString(iM4673b13);
                        int i7 = i4;
                        String string10 = cursorM4675b.getString(i7);
                        int i8 = iM4673b;
                        int i9 = iM4673b15;
                        String string11 = cursorM4675b.getString(i9);
                        iM4673b15 = i9;
                        int i10 = iM4673b16;
                        if (cursorM4675b.getInt(i10) != 0) {
                            iM4673b16 = i10;
                            i3 = iM4673b17;
                            z = true;
                        } else {
                            iM4673b16 = i10;
                            i3 = iM4673b17;
                            z = false;
                        }
                        int i11 = cursorM4675b.getInt(i3);
                        iM4673b17 = i3;
                        int i12 = iM4673b18;
                        List<String> listRestoreList = StringTypeConverter.restoreList(cursorM4675b.getString(i12));
                        iM4673b18 = i12;
                        int i13 = iM4673b20;
                        iM4673b20 = i13;
                        RoomNotification roomNotification = new RoomNotification(lValueOf, string, string2, i5, string3, string4, string5, string6, string7, string8, j2, i6, cursorM4675b.getLong(i13), string9, string10, string11, z, i11, listRestoreList);
                        int i14 = iM4673b13;
                        int i15 = iM4673b19;
                        roomNotification.setKey(cursorM4675b.getString(i15));
                        arrayList.add(roomNotification);
                        iM4673b = i8;
                        i4 = i7;
                        iM4673b19 = i15;
                        iM4673b13 = i14;
                    }
                    return arrayList;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public AbstractC9082s<List<RoomNotification>> getDismissed(Integer[] numArr, long j2, long j3) {
        StringBuilder sbM4681b = C0666f.m4681b();
        sbM4681b.append("SELECT ");
        sbM4681b.append("*");
        sbM4681b.append(" from notification where type IN (");
        int length = numArr.length;
        C0666f.m4680a(sbM4681b, length);
        sbM4681b.append(") AND dismissed BETWEEN ");
        sbM4681b.append("?");
        sbM4681b.append(" AND ");
        sbM4681b.append("?");
        sbM4681b.append(" ");
        int i2 = length + 2;
        final C0654m c0654mM4644c = C0654m.m4644c(sbM4681b.toString(), i2);
        int i3 = 1;
        for (Integer num : numArr) {
            if (num == null) {
                c0654mM4644c.mo4646I0(i3);
            } else {
                c0654mM4644c.mo4652h0(i3, r7.intValue());
            }
            i3++;
        }
        c0654mM4644c.mo4652h0(length + 1, j2);
        c0654mM4644c.mo4652h0(i2, j3);
        return C0655n.m4657c(new Callable<List<RoomNotification>>() { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.3
            protected void finalize() {
                c0654mM4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomNotification> call() throws Exception {
                int i4;
                boolean z;
                Cursor cursorM4675b = C0663c.m4675b(NotificationDao_Impl.this.__db, c0654mM4644c, false, null);
                try {
                    int iM4673b = C0662b.m4673b(cursorM4675b, "expire");
                    int iM4673b2 = C0662b.m4673b(cursorM4675b, "abTestingGroup");
                    int iM4673b3 = C0662b.m4673b(cursorM4675b, "body");
                    int iM4673b4 = C0662b.m4673b(cursorM4675b, "campaignId");
                    int iM4673b5 = C0662b.m4673b(cursorM4675b, "img");
                    int iM4673b6 = C0662b.m4673b(cursorM4675b, "lang");
                    int iM4673b7 = C0662b.m4673b(cursorM4675b, "title");
                    int iM4673b8 = C0662b.m4673b(cursorM4675b, "url");
                    int iM4673b9 = C0662b.m4673b(cursorM4675b, "urlTrack");
                    int iM4673b10 = C0662b.m4673b(cursorM4675b, "notificationCenterUrlTrack");
                    int iM4673b11 = C0662b.m4673b(cursorM4675b, "type");
                    int iM4673b12 = C0662b.m4673b(cursorM4675b, "timeStamp");
                    int iM4673b13 = C0662b.m4673b(cursorM4675b, "appName");
                    int iM4673b14 = C0662b.m4673b(cursorM4675b, "graphic");
                    int iM4673b15 = C0662b.m4673b(cursorM4675b, "ownerId");
                    int iM4673b16 = C0662b.m4673b(cursorM4675b, "processed");
                    int iM4673b17 = C0662b.m4673b(cursorM4675b, "actionStringRes");
                    int iM4673b18 = C0662b.m4673b(cursorM4675b, "whitelistedPackages");
                    int iM4673b19 = C0662b.m4673b(cursorM4675b, RoomNotification.KEY);
                    int iM4673b20 = C0662b.m4673b(cursorM4675b, "dismissed");
                    int i5 = iM4673b14;
                    ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
                    while (cursorM4675b.moveToNext()) {
                        Long lValueOf = cursorM4675b.isNull(iM4673b) ? null : Long.valueOf(cursorM4675b.getLong(iM4673b));
                        String string = cursorM4675b.getString(iM4673b2);
                        String string2 = cursorM4675b.getString(iM4673b3);
                        int i6 = cursorM4675b.getInt(iM4673b4);
                        String string3 = cursorM4675b.getString(iM4673b5);
                        String string4 = cursorM4675b.getString(iM4673b6);
                        String string5 = cursorM4675b.getString(iM4673b7);
                        String string6 = cursorM4675b.getString(iM4673b8);
                        String string7 = cursorM4675b.getString(iM4673b9);
                        String string8 = cursorM4675b.getString(iM4673b10);
                        int i7 = cursorM4675b.getInt(iM4673b11);
                        long j4 = cursorM4675b.getLong(iM4673b12);
                        String string9 = cursorM4675b.getString(iM4673b13);
                        int i8 = i5;
                        String string10 = cursorM4675b.getString(i8);
                        int i9 = iM4673b;
                        int i10 = iM4673b15;
                        String string11 = cursorM4675b.getString(i10);
                        iM4673b15 = i10;
                        int i11 = iM4673b16;
                        if (cursorM4675b.getInt(i11) != 0) {
                            iM4673b16 = i11;
                            i4 = iM4673b17;
                            z = true;
                        } else {
                            iM4673b16 = i11;
                            i4 = iM4673b17;
                            z = false;
                        }
                        int i12 = cursorM4675b.getInt(i4);
                        iM4673b17 = i4;
                        int i13 = iM4673b18;
                        List<String> listRestoreList = StringTypeConverter.restoreList(cursorM4675b.getString(i13));
                        iM4673b18 = i13;
                        int i14 = iM4673b20;
                        iM4673b20 = i14;
                        RoomNotification roomNotification = new RoomNotification(lValueOf, string, string2, i6, string3, string4, string5, string6, string7, string8, j4, i7, cursorM4675b.getLong(i14), string9, string10, string11, z, i12, listRestoreList);
                        int i15 = iM4673b13;
                        int i16 = iM4673b19;
                        roomNotification.setKey(cursorM4675b.getString(i16));
                        arrayList.add(roomNotification);
                        iM4673b = i9;
                        i5 = i8;
                        iM4673b19 = i16;
                        iM4673b13 = i15;
                    }
                    return arrayList;
                } finally {
                    cursorM4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public void insert(RoomNotification roomNotification) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomNotification.insert((AbstractC0644c<RoomNotification>) roomNotification);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public void insertAll(List<RoomNotification> list) throws SQLException {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomNotification.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
