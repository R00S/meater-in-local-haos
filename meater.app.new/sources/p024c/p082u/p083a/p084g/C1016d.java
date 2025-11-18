package p024c.p082u.p083a.p084g;

import android.database.sqlite.SQLiteProgram;
import p024c.p082u.p083a.InterfaceC1010d;

/* compiled from: FrameworkSQLiteProgram.java */
/* renamed from: c.u.a.g.d */
/* loaded from: classes.dex */
class C1016d implements InterfaceC1010d {

    /* renamed from: f */
    private final SQLiteProgram f6717f;

    C1016d(SQLiteProgram sQLiteProgram) {
        this.f6717f = sQLiteProgram;
    }

    @Override // p024c.p082u.p083a.InterfaceC1010d
    /* renamed from: I0 */
    public void mo4646I0(int i2) {
        this.f6717f.bindNull(i2);
    }

    @Override // p024c.p082u.p083a.InterfaceC1010d
    /* renamed from: L */
    public void mo4647L(int i2, double d2) {
        this.f6717f.bindDouble(i2, d2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6717f.close();
    }

    @Override // p024c.p082u.p083a.InterfaceC1010d
    /* renamed from: h0 */
    public void mo4652h0(int i2, long j2) {
        this.f6717f.bindLong(i2, j2);
    }

    @Override // p024c.p082u.p083a.InterfaceC1010d
    /* renamed from: o0 */
    public void mo4653o0(int i2, byte[] bArr) {
        this.f6717f.bindBlob(i2, bArr);
    }

    @Override // p024c.p082u.p083a.InterfaceC1010d
    /* renamed from: w */
    public void mo4654w(int i2, String str) {
        this.f6717f.bindString(i2, str);
    }
}
