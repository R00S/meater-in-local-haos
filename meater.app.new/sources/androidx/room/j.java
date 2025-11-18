package androidx.room;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: EntityDeletionOrUpdateAdapter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H$¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/room/j;", "T", "Landroidx/room/F;", "Landroidx/room/w;", "database", "<init>", "(Landroidx/room/w;)V", "Lu3/k;", "statement", "entity", "Loa/F;", "i", "(Lu3/k;Ljava/lang/Object;)V", "", "j", "(Ljava/lang/Object;)I", "", "entities", "k", "([Ljava/lang/Object;)I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class j<T> extends F {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w database) {
        super(database);
        C3862t.g(database, "database");
    }

    protected abstract void i(u3.k statement, T entity);

    public final int j(T entity) {
        u3.k kVarB = b();
        try {
            i(kVarB, entity);
            return kVarB.R();
        } finally {
            h(kVarB);
        }
    }

    public final int k(T[] entities) {
        C3862t.g(entities, "entities");
        u3.k kVarB = b();
        try {
            int iR = 0;
            for (T t10 : entities) {
                i(kVarB, t10);
                iR += kVarB.R();
            }
            return iR;
        } finally {
            h(kVarB);
        }
    }
}
