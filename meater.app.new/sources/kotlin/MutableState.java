package kotlin;

import Z.g;
import Z.l;
import androidx.compose.runtime.snapshots.j;
import androidx.compose.runtime.snapshots.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: SnapshotState.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001&B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"LO/k1;", "T", "LZ/l;", "LZ/g;", "value", "LO/l1;", "policy", "<init>", "(Ljava/lang/Object;LO/l1;)V", "Landroidx/compose/runtime/snapshots/n;", "Loa/F;", "h", "(Landroidx/compose/runtime/snapshots/n;)V", "previous", "current", "applied", "j", "(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;", "", "toString", "()Ljava/lang/String;", "C", "LO/l1;", "c", "()LO/l1;", "LO/k1$a;", "D", "LO/k1$a;", "next", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "i", "()Landroidx/compose/runtime/snapshots/n;", "firstStateRecord", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.k1, reason: from toString */
/* loaded from: classes.dex */
public class MutableState<T> extends l implements g<T> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final l1<T> policy;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private a<T> next;

    /* compiled from: SnapshotState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"LO/k1$a;", "T", "Landroidx/compose/runtime/snapshots/n;", "myValue", "<init>", "(Ljava/lang/Object;)V", "value", "Loa/F;", "c", "(Landroidx/compose/runtime/snapshots/n;)V", "d", "()Landroidx/compose/runtime/snapshots/n;", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "j", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.k1$a */
    private static final class a<T> extends n {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private T value;

        public a(T t10) {
            this.value = t10;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(n value) {
            C3862t.e(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.value = ((a) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public n d() {
            return new a(this.value);
        }

        public final T i() {
            return this.value;
        }

        public final void j(T t10) {
            this.value = t10;
        }
    }

    public MutableState(T t10, l1<T> l1Var) {
        this.policy = l1Var;
        a<T> aVar = new a<>(t10);
        if (androidx.compose.runtime.snapshots.g.INSTANCE.e()) {
            a aVar2 = new a(t10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.next = aVar;
    }

    @Override // Z.g
    public l1<T> c() {
        return this.policy;
    }

    @Override // kotlin.InterfaceC1563p0, kotlin.x1
    public T getValue() {
        return (T) ((a) j.X(this.next, this)).i();
    }

    @Override // Z.k
    public void h(n value) {
        C3862t.e(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.next = (a) value;
    }

    @Override // Z.k
    /* renamed from: i */
    public n getFirstStateRecord() {
        return this.next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z.k
    public n j(n previous, n current, n applied) {
        C3862t.e(previous, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) previous;
        C3862t.e(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) current;
        C3862t.e(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) applied;
        if (c().a(aVar2.i(), aVar3.i())) {
            return current;
        }
        Object objB = c().b(aVar.i(), aVar2.i(), aVar3.i());
        if (objB == null) {
            return null;
        }
        n nVarD = aVar3.d();
        C3862t.e(nVarD, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>");
        ((a) nVarD).j(objB);
        return nVarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.InterfaceC1563p0
    public void setValue(T t10) {
        androidx.compose.runtime.snapshots.g gVarC;
        a aVar = (a) j.F(this.next);
        if (c().a(aVar.i(), t10)) {
            return;
        }
        a<T> aVar2 = this.next;
        j.J();
        synchronized (j.I()) {
            gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
            ((a) j.S(aVar2, this, gVarC, aVar)).j(t10);
            C4153F c4153f = C4153F.f46609a;
        }
        j.Q(gVarC, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) j.F(this.next)).i() + ")@" + hashCode();
    }
}
