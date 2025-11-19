package v3;

import android.database.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import u3.k;

/* compiled from: FrameworkSQLiteStatement.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv3/h;", "Lv3/g;", "Lu3/k;", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "", "R", "()I", "", "w1", "()J", "C", "Landroid/database/sqlite/SQLiteStatement;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4821h extends C4820g implements k {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final SQLiteStatement delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4821h(SQLiteStatement delegate) {
        super(delegate);
        C3862t.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // u3.k
    public int R() {
        return this.delegate.executeUpdateDelete();
    }

    @Override // u3.k
    public long w1() {
        return this.delegate.executeInsert();
    }
}
