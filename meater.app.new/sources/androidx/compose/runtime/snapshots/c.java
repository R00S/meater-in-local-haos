package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s.C4389K;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/snapshots/c;", "Landroidx/compose/runtime/snapshots/b;", "", "id", "Landroidx/compose/runtime/snapshots/i;", "invalid", "Lkotlin/Function1;", "", "Loa/F;", "readObserver", "writeObserver", "parent", "<init>", "(ILandroidx/compose/runtime/snapshots/i;LBa/l;LBa/l;Landroidx/compose/runtime/snapshots/b;)V", "T", "()V", "d", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "s", "Landroidx/compose/runtime/snapshots/b;", "getParent", "()Landroidx/compose/runtime/snapshots/b;", "", "t", "Z", "deactivated", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final b parent;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean deactivated;

    public c(int i10, i iVar, Ba.l<Object, C4153F> lVar, Ba.l<Object, C4153F> lVar2, b bVar) {
        super(i10, iVar, lVar, lVar2);
        this.parent = bVar;
        bVar.m(this);
    }

    private final void T() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.n(this);
    }

    @Override // androidx.compose.runtime.snapshots.b
    public h C() {
        Map<n, ? extends n> mapR;
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new h.a(this);
        }
        C4389K<Z.k> c4389kE = E();
        int id2 = getId();
        if (c4389kE != null) {
            b bVar = this.parent;
            mapR = j.R(bVar, this, bVar.getInvalid());
        } else {
            mapR = null;
        }
        synchronized (j.I()) {
            try {
                j.g0(this);
                if (c4389kE == null || c4389kE.get_size() == 0) {
                    b();
                } else {
                    h hVarI = I(this.parent.getId(), mapR, this.parent.getInvalid());
                    if (!C3862t.b(hVarI, h.b.f22597a)) {
                        return hVarI;
                    }
                    C4389K<Z.k> c4389kE2 = this.parent.E();
                    if (c4389kE2 != null) {
                        c4389kE2.j(c4389kE);
                    } else {
                        this.parent.P(c4389kE);
                        P(null);
                    }
                }
                if (this.parent.getId() < id2) {
                    this.parent.B();
                }
                b bVar2 = this.parent;
                bVar2.v(bVar2.getInvalid().y(id2).x(getPreviousIds()));
                this.parent.J(id2);
                this.parent.L(y());
                this.parent.K(getPreviousIds());
                this.parent.M(getPreviousPinnedSnapshots());
                C4153F c4153f = C4153F.f46609a;
                O(true);
                T();
                return h.b.f22597a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void d() {
        if (getDisposed()) {
            return;
        }
        super.d();
        T();
    }
}
