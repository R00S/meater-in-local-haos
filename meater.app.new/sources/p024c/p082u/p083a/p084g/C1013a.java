package p024c.p082u.p083a.p084g;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import okhttp3.HttpUrl;
import p024c.p082u.p083a.C1007a;
import p024c.p082u.p083a.InterfaceC1008b;
import p024c.p082u.p083a.InterfaceC1011e;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: FrameworkSQLiteDatabase.java */
/* renamed from: c.u.a.g.a */
/* loaded from: classes.dex */
class C1013a implements InterfaceC1008b {

    /* renamed from: f */
    private static final String[] f6698f = {HttpUrl.FRAGMENT_ENCODE_SET, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: g */
    private static final String[] f6699g = new String[0];

    /* renamed from: h */
    private final SQLiteDatabase f6700h;

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: c.u.a.g.a$a */
    class a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1011e f6701a;

        a(InterfaceC1011e interfaceC1011e) {
            this.f6701a = interfaceC1011e;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f6701a.mo4649b(new C1016d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: c.u.a.g.a$b */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1011e f6703a;

        b(InterfaceC1011e interfaceC1011e) {
            this.f6703a = interfaceC1011e;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f6703a.mo4649b(new C1016d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    C1013a(SQLiteDatabase sQLiteDatabase) {
        this.f6700h = sQLiteDatabase;
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: F */
    public InterfaceC1012f mo6451F(String str) {
        return new C1017e(this.f6700h.compileStatement(str));
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: H0 */
    public Cursor mo6452H0(InterfaceC1011e interfaceC1011e) {
        return this.f6700h.rawQueryWithFactory(new a(interfaceC1011e), interfaceC1011e.mo4648a(), f6699g, null);
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: P0 */
    public boolean mo6453P0() {
        return this.f6700h.inTransaction();
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: S */
    public Cursor mo6454S(InterfaceC1011e interfaceC1011e, CancellationSignal cancellationSignal) {
        return this.f6700h.rawQueryWithFactory(new b(interfaceC1011e), interfaceC1011e.mo4648a(), f6699g, null, cancellationSignal);
    }

    /* renamed from: a */
    boolean m6472a(SQLiteDatabase sQLiteDatabase) {
        return this.f6700h == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6700h.close();
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: g */
    public String mo6455g() {
        return this.f6700h.getPath();
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    public boolean isOpen() {
        return this.f6700h.isOpen();
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: j0 */
    public void mo6456j0() {
        this.f6700h.setTransactionSuccessful();
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: l0 */
    public void mo6457l0(String str, Object[] objArr) throws SQLException {
        this.f6700h.execSQL(str, objArr);
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: n */
    public void mo6458n() {
        this.f6700h.beginTransaction();
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: s */
    public List<Pair<String, String>> mo6459s() {
        return this.f6700h.getAttachedDbs();
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: u0 */
    public Cursor mo6460u0(String str) {
        return mo6452H0(new C1007a(str));
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: v */
    public void mo6461v(String str) throws SQLException {
        this.f6700h.execSQL(str);
    }

    @Override // p024c.p082u.p083a.InterfaceC1008b
    /* renamed from: z0 */
    public void mo6462z0() {
        this.f6700h.endTransaction();
    }
}
