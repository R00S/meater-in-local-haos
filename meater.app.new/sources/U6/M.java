package U6;

import M6.i;
import P6.a;
import P6.c;
import V6.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ma.InterfaceC4015a;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes2.dex */
public class M implements InterfaceC1742d, V6.a, InterfaceC1741c {

    /* renamed from: G, reason: collision with root package name */
    private static final K6.c f17574G = K6.c.b("proto");

    /* renamed from: B, reason: collision with root package name */
    private final W f17575B;

    /* renamed from: C, reason: collision with root package name */
    private final W6.a f17576C;

    /* renamed from: D, reason: collision with root package name */
    private final W6.a f17577D;

    /* renamed from: E, reason: collision with root package name */
    private final AbstractC1743e f17578E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC4015a<String> f17579F;

    /* compiled from: SQLiteEventStore.java */
    interface b<T, U> {
        U apply(T t10);
    }

    /* compiled from: SQLiteEventStore.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f17580a;

        /* renamed from: b, reason: collision with root package name */
        final String f17581b;

        private c(String str, String str2) {
            this.f17580a = str;
            this.f17581b = str2;
        }
    }

    /* compiled from: SQLiteEventStore.java */
    interface d<T> {
        T a();
    }

    M(W6.a aVar, W6.a aVar2, AbstractC1743e abstractC1743e, W w10, InterfaceC4015a<String> interfaceC4015a) {
        this.f17575B = w10;
        this.f17576C = aVar;
        this.f17577D = aVar2;
        this.f17578E = abstractC1743e;
        this.f17579F = interfaceC4015a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ P6.a B1(String str, final Map map, final a.C0207a c0207a, SQLiteDatabase sQLiteDatabase) {
        return (P6.a) U1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: U6.A
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return this.f17561a.z1(map, c0207a, (Cursor) obj);
            }
        });
    }

    private Long C0(SQLiteDatabase sQLiteDatabase, M6.p pVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(X6.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) U1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: U6.x
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.k1((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object C1(List list, M6.p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a aVarO = M6.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z10) {
                aVarO.h(new M6.h(S1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarO.h(new M6.h(S1(cursor.getString(4)), Q1(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarO.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(AbstractC1749k.a(j10, pVar, aVarO.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object D1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long E1(M6.i iVar, M6.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (L0()) {
            b(1L, c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long jF0 = f0(sQLiteDatabase, pVar);
        int iE = this.f17578E.e();
        byte[] bArrA = iVar.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jF0));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(bArrA.length / iE);
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] F1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object G1(Cursor cursor) {
        while (cursor.moveToNext()) {
            b(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object H1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        U1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: U6.u
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return this.f17637a.G1((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean I1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object J1(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (((Boolean) U1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.e())}), new b() { // from class: U6.y
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.I1((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.e())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.e()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object K1(long j10, M6.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(X6.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(X6.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private boolean L0() {
        return p0() * r0() >= this.f17578E.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object L1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f17576C.a()).execute();
        return null;
    }

    private List<AbstractC1749k> M0(List<AbstractC1749k> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC1749k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC1749k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a aVarP = next.b().p();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarP.c(cVar.f17580a, cVar.f17581b);
                }
                listIterator.set(AbstractC1749k.a(next.c(), next.d(), aVarP.d()));
            }
        }
        return list;
    }

    private List<AbstractC1749k> M1(SQLiteDatabase sQLiteDatabase, final M6.p pVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lC0 = C0(sQLiteDatabase, pVar);
        if (lC0 == null) {
            return arrayList;
        }
        U1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lC0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: U6.v
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return this.f17638a.C1(arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> N1(SQLiteDatabase sQLiteDatabase, List<AbstractC1749k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        U1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: U6.z
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.D1(map, (Cursor) obj);
            }
        });
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object O0(Cursor cursor) {
        while (cursor.moveToNext()) {
            b(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    private static byte[] O1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer P0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        U1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: U6.r
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return this.f17632a.O0((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    private void P1(a.C0207a c0207a, Map<String, List<P6.c>> map) {
        for (Map.Entry<String, List<P6.c>> entry : map.entrySet()) {
            c0207a.a(P6.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] Q1(long j10) {
        return (byte[]) U1(i0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: U6.B
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.F1((Cursor) obj);
            }
        });
    }

    private <T> T R1(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f17577D.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f17577D.a() >= this.f17578E.b() + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object S0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private static K6.c S1(String str) {
        return str == null ? f17574G : K6.c.b(str);
    }

    private static String T1(Iterable<AbstractC1749k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC1749k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object U0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    static <T> T U1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase X0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    private c.b a0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.e()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.e()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.e()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.e()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.e()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.e()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.e()) {
            return bVar7;
        }
        Q6.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    private void e0(final SQLiteDatabase sQLiteDatabase) {
        R1(new d() { // from class: U6.l
            @Override // U6.M.d
            public final Object a() {
                return M.S0(sQLiteDatabase);
            }
        }, new b() { // from class: U6.w
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.U0((Throwable) obj);
            }
        });
    }

    private long f0(SQLiteDatabase sQLiteDatabase, M6.p pVar) {
        Long lC0 = C0(sQLiteDatabase, pVar);
        if (lC0 != null) {
            return lC0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(X6.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ P6.f g1(long j10, Cursor cursor) {
        cursor.moveToNext();
        return P6.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ P6.f h1(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (P6.f) U1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: U6.D
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.g1(j10, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long k1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean n1(M6.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long lC0 = C0(sQLiteDatabase, pVar);
        return lC0 == null ? Boolean.FALSE : (Boolean) U1(i0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC0.toString()}), new b() { // from class: U6.t
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    private P6.b o0() {
        return P6.b.b().b(P6.e.c().b(h0()).c(AbstractC1743e.f17615a.f()).a()).a();
    }

    private long p0() {
        return i0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List q1(SQLiteDatabase sQLiteDatabase) {
        return (List) U1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: U6.J
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.s1((Cursor) obj);
            }
        });
    }

    private long r0() {
        return i0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List s1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(M6.p.a().b(cursor.getString(1)).d(X6.a.b(cursor.getInt(2))).c(O1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List u1(M6.p pVar, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC1749k> listM1 = M1(sQLiteDatabase, pVar, this.f17578E.d());
        for (K6.f fVar : K6.f.values()) {
            if (fVar != pVar.d()) {
                int iD = this.f17578E.d() - listM1.size();
                if (iD <= 0) {
                    break;
                }
                listM1.addAll(M1(sQLiteDatabase, pVar.f(fVar), iD));
            }
        }
        return M0(listM1, N1(sQLiteDatabase, listM1));
    }

    private P6.f v0() {
        final long jA = this.f17576C.a();
        return (P6.f) G0(new b() { // from class: U6.C
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.h1(jA, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ P6.a z1(Map map, a.C0207a c0207a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarA0 = a0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(P6.c.c().c(bVarA0).b(j10).a());
        }
        P1(c0207a, map);
        return c0207a.e(v0()).d(o0()).c(this.f17579F.get()).b();
    }

    @Override // U6.InterfaceC1742d
    public int B() {
        final long jA = this.f17576C.a() - this.f17578E.c();
        return ((Integer) G0(new b() { // from class: U6.I
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return this.f17567a.P0(jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // U6.InterfaceC1742d
    public void E(Iterable<AbstractC1749k> iterable) {
        if (iterable.iterator().hasNext()) {
            i0().compileStatement("DELETE FROM events WHERE _id in " + T1(iterable)).execute();
        }
    }

    <T> T G0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseI0 = i0();
        sQLiteDatabaseI0.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseI0);
            sQLiteDatabaseI0.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseI0.endTransaction();
        }
    }

    @Override // U6.InterfaceC1742d
    public AbstractC1749k N0(final M6.p pVar, final M6.i iVar) {
        Q6.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long jLongValue = ((Long) G0(new b() { // from class: U6.m
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return this.f17621a.E1(iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC1749k.a(jLongValue, pVar, iVar);
    }

    @Override // U6.InterfaceC1742d
    public long T0(M6.p pVar) {
        return ((Long) U1(i0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(X6.a.a(pVar.d()))}), new b() { // from class: U6.H
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.a1((Cursor) obj);
            }
        })).longValue();
    }

    @Override // U6.InterfaceC1741c
    public void a() {
        G0(new b() { // from class: U6.p
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return this.f17628a.L1((SQLiteDatabase) obj);
            }
        });
    }

    @Override // U6.InterfaceC1741c
    public void b(final long j10, final c.b bVar, final String str) {
        G0(new b() { // from class: U6.q
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.J1(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // U6.InterfaceC1741c
    public P6.a c() {
        final a.C0207a c0207aE = P6.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (P6.a) G0(new b() { // from class: U6.s
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return this.f17633a.B1(str, map, c0207aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17575B.close();
    }

    @Override // V6.a
    public <T> T d(a.InterfaceC0265a<T> interfaceC0265a) {
        SQLiteDatabase sQLiteDatabaseI0 = i0();
        e0(sQLiteDatabaseI0);
        try {
            T tExecute = interfaceC0265a.execute();
            sQLiteDatabaseI0.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseI0.endTransaction();
        }
    }

    @Override // U6.InterfaceC1742d
    public void d1(final M6.p pVar, final long j10) {
        G0(new b() { // from class: U6.o
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.K1(j10, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // U6.InterfaceC1742d
    public Iterable<M6.p> g0() {
        return (Iterable) G0(new b() { // from class: U6.G
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.q1((SQLiteDatabase) obj);
            }
        });
    }

    long h0() {
        return p0() * r0();
    }

    SQLiteDatabase i0() {
        final W w10 = this.f17575B;
        Objects.requireNonNull(w10);
        return (SQLiteDatabase) R1(new d() { // from class: U6.E
            @Override // U6.M.d
            public final Object a() {
                return w10.getWritableDatabase();
            }
        }, new b() { // from class: U6.F
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return M.X0((Throwable) obj);
            }
        });
    }

    @Override // U6.InterfaceC1742d
    public Iterable<AbstractC1749k> j0(final M6.p pVar) {
        return (Iterable) G0(new b() { // from class: U6.L
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return this.f17572a.u1(pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // U6.InterfaceC1742d
    public boolean l0(final M6.p pVar) {
        return ((Boolean) G0(new b() { // from class: U6.n
            @Override // U6.M.b
            public final Object apply(Object obj) {
                return this.f17624a.n1(pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // U6.InterfaceC1742d
    public void p1(Iterable<AbstractC1749k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + T1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            G0(new b() { // from class: U6.K
                @Override // U6.M.b
                public final Object apply(Object obj) {
                    return this.f17569a.H1(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }
}
