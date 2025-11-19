package androidx.room;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import ta.g;

/* compiled from: RoomDatabaseExt.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/room/G;", "Lta/g$b;", "Lta/e;", "B", "Lta/e;", "c", "()Lta/e;", "transactionDispatcher", "Lta/g$c;", "getKey", "()Lta/g$c;", "key", "C", "a", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G implements g.b {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final ta.e transactionDispatcher;

    /* compiled from: RoomDatabaseExt.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/G$a;", "Lta/g$c;", "Landroidx/room/G;", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.G$a, reason: from kotlin metadata */
    public static final class Companion implements g.c<G> {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ta.g
    public <R> R L(R r10, Ba.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // ta.g
    public ta.g N(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // ta.g.b, ta.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    /* renamed from: c, reason: from getter */
    public final ta.e getTransactionDispatcher() {
        return this.transactionDispatcher;
    }

    @Override // ta.g.b
    public g.c<G> getKey() {
        return INSTANCE;
    }

    @Override // ta.g
    public ta.g s(ta.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
