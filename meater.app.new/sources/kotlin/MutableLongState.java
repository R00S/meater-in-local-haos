package kotlin;

import Z.g;
import Z.l;
import androidx.compose.runtime.snapshots.j;
import androidx.compose.runtime.snapshots.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: SnapshotLongState.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u001bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0007R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LO/j1;", "LZ/l;", "LO/n0;", "LZ/g;", "", "value", "<init>", "(J)V", "Landroidx/compose/runtime/snapshots/n;", "Loa/F;", "h", "(Landroidx/compose/runtime/snapshots/n;)V", "previous", "current", "applied", "j", "(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;", "", "toString", "()Ljava/lang/String;", "LO/j1$a;", "C", "LO/j1$a;", "next", "i", "()Landroidx/compose/runtime/snapshots/n;", "firstStateRecord", "a", "()J", "k", "longValue", "LO/l1;", "c", "()LO/l1;", "policy", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.j1, reason: from toString */
/* loaded from: classes.dex */
public class MutableLongState extends l implements InterfaceC1559n0, g<Long> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private a next;

    /* compiled from: SnapshotLongState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, d2 = {"LO/j1$a;", "Landroidx/compose/runtime/snapshots/n;", "", "value", "<init>", "(J)V", "Loa/F;", "c", "(Landroidx/compose/runtime/snapshots/n;)V", "d", "()Landroidx/compose/runtime/snapshots/n;", "J", "i", "()J", "j", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.j1$a */
    private static final class a extends n {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long value;

        public a(long j10) {
            this.value = j10;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(n value) {
            C3862t.e(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.value = ((a) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public n d() {
            return new a(this.value);
        }

        /* renamed from: i, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        public final void j(long j10) {
            this.value = j10;
        }
    }

    public MutableLongState(long j10) {
        a aVar = new a(j10);
        if (androidx.compose.runtime.snapshots.g.INSTANCE.e()) {
            a aVar2 = new a(j10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.next = aVar;
    }

    @Override // kotlin.InterfaceC1559n0, kotlin.InterfaceC1543f0
    public long a() {
        return ((a) j.X(this.next, this)).getValue();
    }

    @Override // Z.g
    public l1<Long> c() {
        return m1.o();
    }

    @Override // Z.k
    public void h(n value) {
        C3862t.e(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (a) value;
    }

    @Override // Z.k
    public n i() {
        return this.next;
    }

    @Override // Z.k
    public n j(n previous, n current, n applied) {
        C3862t.e(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        C3862t.e(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) current).getValue() == ((a) applied).getValue()) {
            return current;
        }
        return null;
    }

    @Override // kotlin.InterfaceC1559n0
    public void k(long j10) {
        androidx.compose.runtime.snapshots.g gVarC;
        a aVar = (a) j.F(this.next);
        if (aVar.getValue() != j10) {
            a aVar2 = this.next;
            j.J();
            synchronized (j.I()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                ((a) j.S(aVar2, this, gVarC, aVar)).j(j10);
                C4153F c4153f = C4153F.f46609a;
            }
            j.Q(gVarC, this);
        }
    }

    public String toString() {
        return "MutableLongState(value=" + ((a) j.F(this.next)).getValue() + ")@" + hashCode();
    }
}
