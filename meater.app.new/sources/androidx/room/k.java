package androidx.room;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: EntityInsertionAdapter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H$¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/room/k;", "T", "Landroidx/room/F;", "Landroidx/room/w;", "database", "<init>", "(Landroidx/room/w;)V", "Lu3/k;", "statement", "entity", "Loa/F;", "i", "(Lu3/k;Ljava/lang/Object;)V", "j", "(Ljava/lang/Object;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class k<T> extends F {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(w database) {
        super(database);
        C3862t.g(database, "database");
    }

    protected abstract void i(u3.k statement, T entity);

    public final void j(T entity) {
        u3.k kVarB = b();
        try {
            i(kVarB, entity);
            kVarB.w1();
        } finally {
            h(kVarB);
        }
    }
}
