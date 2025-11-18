package io.rakam.api;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.database.room.RoomNotification;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DatabaseHelper.java */
/* renamed from: io.rakam.api.b */
/* loaded from: classes2.dex */
class C9226b extends SQLiteOpenHelper {

    /* renamed from: f */
    static final Map<String, C9226b> f35617f = new HashMap();

    /* renamed from: g */
    private static final C9232h f35618g = C9232h.m29964d();

    /* renamed from: h */
    File f35619h;

    /* renamed from: i */
    private String f35620i;

    /* renamed from: j */
    private boolean f35621j;

    /* renamed from: k */
    private InterfaceC9227c f35622k;

    protected C9226b(Context context, String str) {
        super(context, m29804l(str), (SQLiteDatabase.CursorFactory) null, 3);
        this.f35621j = true;
        this.f35619h = context.getDatabasePath(m29804l(str));
        this.f35620i = C9234j.m29989e(str);
    }

    /* renamed from: H */
    private synchronized long m29797H(String str, long j2) {
        long jSimpleQueryForLong;
        jSimpleQueryForLong = -1;
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                try {
                    SQLiteStatement sQLiteStatementCompileStatement = getReadableDatabase().compileStatement("SELECT id FROM " + str + " LIMIT 1 OFFSET " + (j2 - 1));
                    try {
                        jSimpleQueryForLong = sQLiteStatementCompileStatement.simpleQueryForLong();
                    } catch (SQLiteDoneException e2) {
                        f35618g.m29971h("io.rakam.api.DatabaseHelper", e2);
                    }
                    if (sQLiteStatementCompileStatement != null) {
                        sQLiteStatementCompileStatement.close();
                    }
                } catch (SQLiteException e3) {
                    f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getNthEventId from %s failed", str), e3);
                    C9229e.m29884e().m29888g(String.format("DB: Failed to getNthEventId from table %s", str), e3);
                    m29800e();
                    if (0 != 0) {
                        sQLiteStatement.close();
                    }
                }
            } catch (StackOverflowError e4) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getNthEventId from %s failed", str), e4);
                C9229e.m29884e().m29888g(String.format("DB: Failed to getNthEventId from table %s", str), e4);
                m29800e();
                if (0 != 0) {
                    sQLiteStatement.close();
                }
            }
            close();
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteStatement.close();
            }
            close();
            throw th;
        }
        return jSimpleQueryForLong;
    }

    /* renamed from: b */
    private synchronized long m29798b(String str, String str2) {
        StackOverflowError e2;
        long jM29815Q;
        SQLiteException e3;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("event", str2);
                jM29815Q = m29815Q(writableDatabase, str, contentValues);
                if (jM29815Q == -1) {
                    try {
                        f35618g.m29970g("io.rakam.api.DatabaseHelper", String.format("Insert into %s failed", str));
                    } catch (SQLiteException e4) {
                        e3 = e4;
                        f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("addEvent to %s failed", str), e3);
                        C9229e.m29884e().m29888g(String.format("DB: Failed to addEvent: %s", str2), e3);
                        m29800e();
                        return jM29815Q;
                    } catch (StackOverflowError e5) {
                        e2 = e5;
                        f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("addEvent to %s failed", str), e2);
                        C9229e.m29884e().m29888g(String.format("DB: Failed to addEvent: %s", str2), e2);
                        m29800e();
                        return jM29815Q;
                    }
                }
            } catch (SQLiteException e6) {
                e3 = e6;
                jM29815Q = -1;
            } catch (StackOverflowError e7) {
                e2 = e7;
                jM29815Q = -1;
            }
        } finally {
            close();
        }
        return jM29815Q;
    }

    /* renamed from: d */
    private static void m29799d(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (!C9234j.m29988d(message) && message.startsWith("Cursor window allocation of")) {
            throw new CursorWindowAllocationException(message);
        }
        throw runtimeException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        if (r0 != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
    
        if (r0 != 0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [io.rakam.api.e] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29800e() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.rakam.api.C9226b.m29800e():void");
    }

    /* renamed from: i0 */
    private synchronized void m29801i0(String str, long j2) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id = " + j2, null);
                } catch (StackOverflowError e2) {
                    f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("removeEvent from %s failed", str), e2);
                    C9229e.m29884e().m29888g(String.format("DB: Failed to removeEvent from table %s", str), e2);
                    m29800e();
                }
            } catch (SQLiteException e3) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("removeEvent from %s failed", str), e3);
                C9229e.m29884e().m29888g(String.format("DB: Failed to removeEvent from table %s", str), e3);
                m29800e();
            }
        } finally {
        }
    }

    @Deprecated
    /* renamed from: j */
    static C9226b m29802j(Context context) {
        return m29803k(context, null);
    }

    /* renamed from: k */
    static synchronized C9226b m29803k(Context context, String str) {
        C9226b c9226b;
        String strM29989e = C9234j.m29989e(str);
        Map<String, C9226b> map = f35617f;
        c9226b = map.get(strM29989e);
        if (c9226b == null) {
            c9226b = new C9226b(context.getApplicationContext(), strM29989e);
            map.put(strM29989e, c9226b);
        }
        return c9226b;
    }

    /* renamed from: l */
    private static String m29804l(String str) {
        if (C9234j.m29988d(str) || str.equals("$default_instance")) {
            return "io.rakam.api";
        }
        return "io.rakam.api_" + str;
    }

    /* renamed from: n0 */
    private synchronized void m29805n0(String str, long j2) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id <= " + j2, null);
                } catch (StackOverflowError e2) {
                    f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("removeEvents from %s failed", str), e2);
                    C9229e.m29884e().m29888g(String.format("DB: Failed to removeEvents from table %s", str), e2);
                    m29800e();
                }
            } catch (SQLiteException e3) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("removeEvents from %s failed", str), e3);
                C9229e.m29884e().m29888g(String.format("DB: Failed to removeEvents from table %s", str), e3);
                m29800e();
            }
        } finally {
        }
    }

    /* renamed from: p */
    private synchronized long m29806p(String str) {
        long jSimpleQueryForLong;
        SQLiteStatement sQLiteStatementCompileStatement = null;
        try {
            try {
                try {
                    sQLiteStatementCompileStatement = getReadableDatabase().compileStatement("SELECT COUNT(*) FROM " + str);
                    jSimpleQueryForLong = sQLiteStatementCompileStatement.simpleQueryForLong();
                    sQLiteStatementCompileStatement.close();
                    close();
                } catch (StackOverflowError e2) {
                    f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getNumberRows for %s failed", str), e2);
                    C9229e.m29884e().m29888g(String.format("DB: Failed to getNumberRows for table %s", str), e2);
                    m29800e();
                    jSimpleQueryForLong = 0;
                    return jSimpleQueryForLong;
                }
            } catch (SQLiteException e3) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getNumberRows for %s failed", str), e3);
                C9229e.m29884e().m29888g(String.format("DB: Failed to getNumberRows for table %s", str), e3);
                m29800e();
                if (sQLiteStatementCompileStatement != null) {
                    sQLiteStatementCompileStatement.close();
                }
                jSimpleQueryForLong = 0;
                return jSimpleQueryForLong;
            }
        } finally {
            if (0 != 0) {
                sQLiteStatementCompileStatement.close();
            }
            close();
        }
        return jSimpleQueryForLong;
    }

    /* renamed from: t0 */
    private void m29807t0(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
        onCreate(sQLiteDatabase);
    }

    /* renamed from: A */
    synchronized List<JSONObject> m29808A(long j2, long j3) throws JSONException {
        return m29832y("identifys", j2, j3);
    }

    /* renamed from: B */
    synchronized Long m29809B(String str) {
        return (Long) m29814N("long_store", str);
    }

    /* renamed from: D */
    synchronized long m29810D(long j2) {
        return m29797H("events", j2);
    }

    /* renamed from: I */
    synchronized long m29811I(long j2) {
        return m29797H("identifys", j2);
    }

    /* renamed from: J */
    synchronized long m29812J() {
        return m29826m() + m29833z();
    }

    /* renamed from: K */
    synchronized String m29813K(String str) {
        return (String) m29814N(AccountAnalytics.STORE, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ca: MOVE (r0 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:44:0x00ca */
    /* renamed from: N */
    protected synchronized Object m29814N(String str, String str2) {
        Cursor string;
        Object obj;
        Cursor cursorM29823e0;
        string = null;
        try {
            try {
                cursorM29823e0 = m29823e0(getReadableDatabase(), str, new String[]{RoomNotification.KEY, "value"}, "key = ?", new String[]{str2}, null, null, null, null);
            } catch (SQLiteException e2) {
                e = e2;
                cursorM29823e0 = null;
            } catch (RuntimeException e3) {
                e = e3;
                cursorM29823e0 = null;
            } catch (StackOverflowError e4) {
                e = e4;
                cursorM29823e0 = null;
            } catch (Throwable th) {
                th = th;
                if (string != null) {
                    string.close();
                }
                close();
                throw th;
            }
            try {
                if (cursorM29823e0.moveToFirst()) {
                    string = str.equals(AccountAnalytics.STORE) ? cursorM29823e0.getString(1) : Long.valueOf(cursorM29823e0.getLong(1));
                }
                cursorM29823e0.close();
            } catch (SQLiteException e5) {
                e = e5;
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getValue from %s failed", str), e);
                C9229e.m29884e().m29888g(String.format("DB: Failed to getValue: %s", str2), e);
                m29800e();
                if (cursorM29823e0 != null) {
                    cursorM29823e0.close();
                }
                close();
                return string;
            } catch (RuntimeException e6) {
                e = e6;
                C9229e.m29884e().m29888g(String.format("DB: Failed to getValue: %s", str2), e);
                m29799d(e);
                if (cursorM29823e0 != null) {
                    cursorM29823e0.close();
                }
                close();
                return string;
            } catch (StackOverflowError e7) {
                e = e7;
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getValue from %s failed", str), e);
                C9229e.m29884e().m29888g(String.format("DB: Failed to getValue: %s", str2), e);
                m29800e();
                if (cursorM29823e0 != null) {
                    cursorM29823e0.close();
                }
                close();
                return string;
            }
            close();
        } catch (Throwable th2) {
            th = th2;
            string = obj;
        }
        return string;
    }

    /* renamed from: Q */
    synchronized long m29815Q(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws StackOverflowError, SQLiteException {
        return sQLiteDatabase.insert(str, null, contentValues);
    }

    /* renamed from: T */
    synchronized long m29816T(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws StackOverflowError, SQLiteException {
        return sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 5);
    }

    /* renamed from: W */
    synchronized long m29817W(String str, Long l) {
        return l == null ? m29824f("long_store", str) : m29821a0("long_store", str, l);
    }

    /* renamed from: Y */
    synchronized long m29818Y(String str, String str2) {
        return str2 == null ? m29824f(AccountAnalytics.STORE, str) : m29821a0(AccountAnalytics.STORE, str, str2);
    }

    /* renamed from: Z */
    synchronized long m29819Z(SQLiteDatabase sQLiteDatabase, String str, String str2, Object obj) throws StackOverflowError, SQLiteException {
        long jM29816T;
        ContentValues contentValues = new ContentValues();
        contentValues.put(RoomNotification.KEY, str2);
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            contentValues.put("value", (String) obj);
        }
        jM29816T = m29816T(sQLiteDatabase, str, contentValues);
        if (jM29816T == -1) {
            f35618g.m29970g("io.rakam.api.DatabaseHelper", "Insert failed");
        }
        return jM29816T;
    }

    /* renamed from: a */
    synchronized long m29820a(String str) {
        return m29798b("events", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x000e, B:8:0x0014, B:29:0x0081, B:31:0x0087, B:32:0x008a, B:15:0x0042, B:17:0x0048, B:22:0x0074, B:4:0x0004, B:13:0x001b, B:20:0x004d), top: B:39:0x0004, inners: #0 }] */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    synchronized long m29821a0(java.lang.String r8, java.lang.String r9, java.lang.Object r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.getWritableDatabase()     // Catch: java.lang.Throwable -> L18 java.lang.StackOverflowError -> L1a android.database.sqlite.SQLiteException -> L4c
            long r8 = r7.m29819Z(r2, r8, r9, r10)     // Catch: java.lang.Throwable -> L18 java.lang.StackOverflowError -> L1a android.database.sqlite.SQLiteException -> L4c
            if (r2 == 0) goto L7d
            boolean r10 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r10 == 0) goto L7d
            r7.close()     // Catch: java.lang.Throwable -> L8b
            goto L7d
        L18:
            r8 = move-exception
            goto L7f
        L1a:
            r10 = move-exception
            io.rakam.api.h r3 = io.rakam.api.C9226b.f35618g     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "io.rakam.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r6[r0] = r8     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L18
            r3.m29967c(r4, r8, r10)     // Catch: java.lang.Throwable -> L18
            io.rakam.api.e r8 = io.rakam.api.C9229e.m29884e()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r1[r0] = r9     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch: java.lang.Throwable -> L18
            r8.m29888g(r9, r10)     // Catch: java.lang.Throwable -> L18
            r7.m29800e()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L7b
            boolean r8 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L7b
        L48:
            r7.close()     // Catch: java.lang.Throwable -> L8b
            goto L7b
        L4c:
            r10 = move-exception
            io.rakam.api.h r3 = io.rakam.api.C9226b.f35618g     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "io.rakam.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r6[r0] = r8     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L18
            r3.m29967c(r4, r8, r10)     // Catch: java.lang.Throwable -> L18
            io.rakam.api.e r8 = io.rakam.api.C9229e.m29884e()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r1[r0] = r9     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch: java.lang.Throwable -> L18
            r8.m29888g(r9, r10)     // Catch: java.lang.Throwable -> L18
            r7.m29800e()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L7b
            boolean r8 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L7b
            goto L48
        L7b:
            r8 = -1
        L7d:
            monitor-exit(r7)
            return r8
        L7f:
            if (r2 == 0) goto L8a
            boolean r9 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r9 == 0) goto L8a
            r7.close()     // Catch: java.lang.Throwable -> L8b
        L8a:
            throw r8     // Catch: java.lang.Throwable -> L8b
        L8b:
            r8 = move-exception
            monitor-exit(r7)
            goto L8f
        L8e:
            throw r8
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: io.rakam.api.C9226b.m29821a0(java.lang.String, java.lang.String, java.lang.Object):long");
    }

    /* renamed from: c */
    synchronized long m29822c(String str) {
        return m29798b("identifys", str);
    }

    /* renamed from: e0 */
    Cursor m29823e0(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    /* renamed from: f */
    synchronized long m29824f(String str, String str2) {
        long jDelete;
        try {
            try {
                try {
                    jDelete = getWritableDatabase().delete(str, "key=?", new String[]{str2});
                } catch (SQLiteException e2) {
                    f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("deleteKey from %s failed", str), e2);
                    C9229e.m29884e().m29888g(String.format("DB: Failed to deleteKey: %s", str2), e2);
                    m29800e();
                    close();
                    jDelete = -1;
                    return jDelete;
                }
            } catch (StackOverflowError e3) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("deleteKey from %s failed", str), e3);
                C9229e.m29884e().m29888g(String.format("DB: Failed to deleteKey: %s", str2), e3);
                m29800e();
                close();
                jDelete = -1;
                return jDelete;
            }
        } finally {
            close();
        }
        return jDelete;
    }

    /* renamed from: f0 */
    synchronized void m29825f0(long j2) {
        m29801i0("events", j2);
    }

    /* renamed from: m */
    synchronized long m29826m() {
        return m29806p("events");
    }

    /* renamed from: m0 */
    synchronized void m29827m0(long j2) {
        m29805n0("events", j2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        InterfaceC9227c interfaceC9227c = this.f35622k;
        if (interfaceC9227c == null || !this.f35621j) {
            return;
        }
        try {
            try {
                this.f35621j = false;
                interfaceC9227c.mo29834a(sQLiteDatabase);
            } catch (SQLiteException e2) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("databaseReset callback failed during onCreate", new Object[0]), e2);
                C9229e.m29884e().m29888g(String.format("DB: Failed to run databaseReset callback during onCreate", new Object[0]), e2);
            }
        } finally {
            this.f35621j = true;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) throws SQLException {
        if (i2 > i3) {
            f35618g.m29966b("io.rakam.api.DatabaseHelper", "onUpgrade() with invalid oldVersion and newVersion");
            m29807t0(sQLiteDatabase);
            return;
        }
        if (i3 <= 1) {
            return;
        }
        if (i2 == 1) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
            if (i3 <= 2) {
                return;
            }
        } else if (i2 != 2) {
            if (i2 != 3) {
                f35618g.m29966b("io.rakam.api.DatabaseHelper", "onUpgrade() with unknown oldVersion " + i2);
                m29807t0(sQLiteDatabase);
                return;
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
    }

    /* renamed from: p0 */
    synchronized void m29828p0(long j2) {
        m29801i0("identifys", j2);
    }

    /* renamed from: q0 */
    synchronized void m29829q0(long j2) {
        m29805n0("identifys", j2);
    }

    /* renamed from: x */
    synchronized List<JSONObject> m29830x(long j2, long j3) throws JSONException {
        return m29832y("events", j2, j3);
    }

    /* renamed from: x0 */
    void m29831x0(InterfaceC9227c interfaceC9227c) {
        this.f35622k = interfaceC9227c;
    }

    /* renamed from: y */
    protected synchronized List<JSONObject> m29832y(String str, long j2, long j3) throws JSONException {
        LinkedList linkedList;
        String str2;
        String str3;
        linkedList = new LinkedList();
        Cursor cursorM29823e0 = null;
        try {
            try {
                try {
                    try {
                        SQLiteDatabase readableDatabase = getReadableDatabase();
                        String[] strArr = {DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, "event"};
                        if (j2 >= 0) {
                            str2 = "id <= " + j2;
                        } else {
                            str2 = null;
                        }
                        if (j3 >= 0) {
                            str3 = HttpUrl.FRAGMENT_ENCODE_SET + j3;
                        } else {
                            str3 = null;
                        }
                        cursorM29823e0 = m29823e0(readableDatabase, str, strArr, str2, null, null, null, "id ASC", str3);
                        while (cursorM29823e0.moveToNext()) {
                            long j4 = cursorM29823e0.getLong(0);
                            String string = cursorM29823e0.getString(1);
                            if (!C9234j.m29988d(string)) {
                                JSONObject jSONObject = new JSONObject(string);
                                jSONObject.put("event_id", j4);
                                linkedList.add(jSONObject);
                            }
                        }
                        cursorM29823e0.close();
                    } catch (StackOverflowError e2) {
                        f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getEvents from %s failed", str), e2);
                        C9229e.m29884e().m29888g(String.format("DB: Failed to getEventsFromTable %s", str), e2);
                        m29800e();
                        if (cursorM29823e0 != null) {
                            cursorM29823e0.close();
                        }
                    }
                } catch (RuntimeException e3) {
                    C9229e.m29884e().m29888g(String.format("DB: Failed to getEventsFromTable %s", str), e3);
                    m29799d(e3);
                    if (cursorM29823e0 != null) {
                        cursorM29823e0.close();
                    }
                }
            } catch (SQLiteException e4) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getEvents from %s failed", str), e4);
                C9229e.m29884e().m29888g(String.format("DB: Failed to getEventsFromTable %s", str), e4);
                m29800e();
                if (cursorM29823e0 != null) {
                    cursorM29823e0.close();
                }
            }
            close();
        } catch (Throwable th) {
            if (cursorM29823e0 != null) {
                cursorM29823e0.close();
            }
            close();
            throw th;
        }
        return linkedList;
    }

    /* renamed from: z */
    synchronized long m29833z() {
        return m29806p("identifys");
    }
}
