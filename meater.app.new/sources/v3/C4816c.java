package v3;

import Ba.r;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import u3.C4663a;
import u3.C4664b;
import u3.InterfaceC4669g;
import u3.j;
import u3.k;

/* compiled from: FrameworkSQLiteDatabase.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 72\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010$\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"0!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010\rJ\u0015\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0013R\u0016\u0010/\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0013R(\u00106\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000603\u0018\u0001028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lv3/c;", "Lu3/g;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "sql", "Lu3/k;", "T", "(Ljava/lang/String;)Lu3/k;", "Loa/F;", "A", "()V", "x0", "F0", "u0", "", "e1", "()Z", "query", "Landroid/database/Cursor;", "D0", "(Ljava/lang/String;)Landroid/database/Cursor;", "Lu3/j;", "c1", "(Lu3/j;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "r1", "(Lu3/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "I", "(Ljava/lang/String;)V", "", "", "bindArgs", "w0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "sqLiteDatabase", "c", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "B", "Landroid/database/sqlite/SQLiteDatabase;", "isOpen", "h", "()Ljava/lang/String;", "path", "l1", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "F", "()Ljava/util/List;", "attachedDbs", "C", "a", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4816c implements InterfaceC4669g {

    /* renamed from: D, reason: collision with root package name */
    private static final String[] f51247D = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: E, reason: collision with root package name */
    private static final String[] f51248E = new String[0];

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final SQLiteDatabase delegate;

    /* compiled from: FrameworkSQLiteDatabase.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "<anonymous parameter 0>", "Landroid/database/sqlite/SQLiteCursorDriver;", "masterQuery", "", "editTable", "Landroid/database/sqlite/SQLiteQuery;", "sqLiteQuery", "Landroid/database/sqlite/SQLiteCursor;", "a", "(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/sqlite/SQLiteCursor;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v3.c$b */
    static final class b extends AbstractC3864v implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ j f51250B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.f51250B = jVar;
        }

        @Override // Ba.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor k(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f51250B;
            C3862t.d(sQLiteQuery);
            jVar.b(new C4820g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C4816c(SQLiteDatabase delegate) {
        C3862t.g(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor d(r tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C3862t.g(tmp0, "$tmp0");
        return (Cursor) tmp0.k(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor e(j query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C3862t.g(query, "$query");
        C3862t.d(sQLiteQuery);
        query.b(new C4820g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // u3.InterfaceC4669g
    public void A() {
        this.delegate.beginTransaction();
    }

    @Override // u3.InterfaceC4669g
    public Cursor D0(String query) {
        C3862t.g(query, "query");
        return c1(new C4663a(query));
    }

    @Override // u3.InterfaceC4669g
    public List<Pair<String, String>> F() {
        return this.delegate.getAttachedDbs();
    }

    @Override // u3.InterfaceC4669g
    public void F0() {
        this.delegate.endTransaction();
    }

    @Override // u3.InterfaceC4669g
    public void I(String sql) throws SQLException {
        C3862t.g(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // u3.InterfaceC4669g
    public k T(String sql) throws SQLException {
        C3862t.g(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.delegate.compileStatement(sql);
        C3862t.f(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new C4821h(sQLiteStatementCompileStatement);
    }

    public final boolean c(SQLiteDatabase sqLiteDatabase) {
        C3862t.g(sqLiteDatabase, "sqLiteDatabase");
        return C3862t.b(this.delegate, sqLiteDatabase);
    }

    @Override // u3.InterfaceC4669g
    public Cursor c1(j query) {
        C3862t.g(query, "query");
        final b bVar = new b(query);
        Cursor cursorRawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: v3.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return C4816c.d(bVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getQuery(), f51248E, null);
        C3862t.f(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // u3.InterfaceC4669g
    public boolean e1() {
        return this.delegate.inTransaction();
    }

    @Override // u3.InterfaceC4669g
    public String h() {
        return this.delegate.getPath();
    }

    @Override // u3.InterfaceC4669g
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // u3.InterfaceC4669g
    public boolean l1() {
        return C4664b.b(this.delegate);
    }

    @Override // u3.InterfaceC4669g
    public Cursor r1(final j query, CancellationSignal cancellationSignal) {
        C3862t.g(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        String query2 = query.getQuery();
        String[] strArr = f51248E;
        C3862t.d(cancellationSignal);
        return C4664b.c(sQLiteDatabase, query2, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: v3.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return C4816c.e(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // u3.InterfaceC4669g
    public void u0() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // u3.InterfaceC4669g
    public void w0(String sql, Object[] bindArgs) throws SQLException {
        C3862t.g(sql, "sql");
        C3862t.g(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // u3.InterfaceC4669g
    public void x0() {
        this.delegate.beginTransactionNonExclusive();
    }
}
