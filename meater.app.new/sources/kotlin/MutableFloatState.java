package kotlin;

import Z.g;
import Z.l;
import androidx.compose.runtime.snapshots.j;
import androidx.compose.runtime.snapshots.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: SnapshotFloatState.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001#B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0007R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"LO/h1;", "LZ/l;", "LO/l0;", "LZ/g;", "", "value", "<init>", "(F)V", "Landroidx/compose/runtime/snapshots/n;", "Loa/F;", "h", "(Landroidx/compose/runtime/snapshots/n;)V", "previous", "current", "applied", "j", "(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;", "", "toString", "()Ljava/lang/String;", "LO/h1$a;", "C", "LO/h1$a;", "next", "i", "()Landroidx/compose/runtime/snapshots/n;", "firstStateRecord", "b", "()F", "f", "floatValue", "LO/l1;", "c", "()LO/l1;", "policy", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.h1, reason: from toString */
/* loaded from: classes.dex */
public class MutableFloatState extends l implements InterfaceC1555l0, g<Float> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private a next;

    /* compiled from: SnapshotFloatState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, d2 = {"LO/h1$a;", "Landroidx/compose/runtime/snapshots/n;", "", "value", "<init>", "(F)V", "Loa/F;", "c", "(Landroidx/compose/runtime/snapshots/n;)V", "d", "()Landroidx/compose/runtime/snapshots/n;", "F", "i", "()F", "j", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.h1$a */
    private static final class a extends n {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private float value;

        public a(float f10) {
            this.value = f10;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(n value) {
            C3862t.e(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.value = ((a) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public n d() {
            return new a(this.value);
        }

        /* renamed from: i, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public final void j(float f10) {
            this.value = f10;
        }
    }

    public MutableFloatState(float f10) {
        a aVar = new a(f10);
        if (androidx.compose.runtime.snapshots.g.INSTANCE.e()) {
            a aVar2 = new a(f10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.next = aVar;
    }

    @Override // kotlin.InterfaceC1555l0, kotlin.InterfaceC1517P
    public float b() {
        return ((a) j.X(this.next, this)).getValue();
    }

    @Override // Z.g
    public l1<Float> c() {
        return m1.o();
    }

    @Override // kotlin.InterfaceC1555l0
    public void f(float f10) {
        androidx.compose.runtime.snapshots.g gVarC;
        a aVar = (a) j.F(this.next);
        if (aVar.getValue() == f10) {
            return;
        }
        a aVar2 = this.next;
        j.J();
        synchronized (j.I()) {
            gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
            ((a) j.S(aVar2, this, gVarC, aVar)).j(f10);
            C4153F c4153f = C4153F.f46609a;
        }
        j.Q(gVarC, this);
    }

    @Override // Z.k
    public void h(n value) {
        C3862t.e(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.next = (a) value;
    }

    @Override // Z.k
    public n i() {
        return this.next;
    }

    @Override // Z.k
    public n j(n previous, n current, n applied) {
        C3862t.e(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        C3862t.e(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) current).getValue() == ((a) applied).getValue()) {
            return current;
        }
        return null;
    }

    public String toString() {
        return "MutableFloatState(value=" + ((a) j.F(this.next)).getValue() + ")@" + hashCode();
    }
}
