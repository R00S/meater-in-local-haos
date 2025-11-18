package v3;

import android.database.sqlite.SQLiteProgram;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import u3.i;

/* compiled from: FrameworkSQLiteProgram.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lv3/g;", "Lu3/i;", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "", "index", "Loa/F;", "W0", "(I)V", "", "value", "s0", "(IJ)V", "", "Y", "(ID)V", "", "J", "(ILjava/lang/String;)V", "", "y0", "(I[B)V", "close", "()V", "B", "Landroid/database/sqlite/SQLiteProgram;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4820g implements i {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final SQLiteProgram delegate;

    public C4820g(SQLiteProgram delegate) {
        C3862t.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // u3.i
    public void J(int index, String value) {
        C3862t.g(value, "value");
        this.delegate.bindString(index, value);
    }

    @Override // u3.i
    public void W0(int index) {
        this.delegate.bindNull(index);
    }

    @Override // u3.i
    public void Y(int index, double value) {
        this.delegate.bindDouble(index, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // u3.i
    public void s0(int index, long value) {
        this.delegate.bindLong(index, value);
    }

    @Override // u3.i
    public void y0(int index, byte[] value) {
        C3862t.g(value, "value");
        this.delegate.bindBlob(index, value);
    }
}
