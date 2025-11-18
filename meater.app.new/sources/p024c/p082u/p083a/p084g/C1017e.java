package p024c.p082u.p083a.p084g;

import android.database.sqlite.SQLiteStatement;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: FrameworkSQLiteStatement.java */
/* renamed from: c.u.a.g.e */
/* loaded from: classes.dex */
class C1017e extends C1016d implements InterfaceC1012f {

    /* renamed from: g */
    private final SQLiteStatement f6718g;

    C1017e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f6718g = sQLiteStatement;
    }

    @Override // p024c.p082u.p083a.InterfaceC1012f
    /* renamed from: E */
    public int mo6470E() {
        return this.f6718g.executeUpdateDelete();
    }

    @Override // p024c.p082u.p083a.InterfaceC1012f
    /* renamed from: j1 */
    public long mo6471j1() {
        return this.f6718g.executeInsert();
    }
}
