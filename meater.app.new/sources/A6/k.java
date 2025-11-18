package A6;

import android.view.AbstractC2106m;
import android.view.F;
import android.view.InterfaceC2113u;
import android.view.InterfaceC2114v;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: LifecycleLifecycle.java */
/* loaded from: classes2.dex */
final class k implements j, InterfaceC2113u {

    /* renamed from: B, reason: collision with root package name */
    private final Set<l> f915B = new HashSet();

    /* renamed from: C, reason: collision with root package name */
    private final AbstractC2106m f916C;

    k(AbstractC2106m abstractC2106m) {
        this.f916C = abstractC2106m;
        abstractC2106m.a(this);
    }

    @Override // A6.j
    public void a(l lVar) {
        this.f915B.add(lVar);
        if (this.f916C.getState() == AbstractC2106m.b.DESTROYED) {
            lVar.e();
        } else if (this.f916C.getState().j(AbstractC2106m.b.STARTED)) {
            lVar.b();
        } else {
            lVar.a();
        }
    }

    @Override // A6.j
    public void b(l lVar) {
        this.f915B.remove(lVar);
    }

    @F(AbstractC2106m.a.ON_DESTROY)
    public void onDestroy(InterfaceC2114v interfaceC2114v) {
        Iterator it = H6.l.j(this.f915B).iterator();
        while (it.hasNext()) {
            ((l) it.next()).e();
        }
        interfaceC2114v.getLifecycle().d(this);
    }

    @F(AbstractC2106m.a.ON_START)
    public void onStart(InterfaceC2114v interfaceC2114v) {
        Iterator it = H6.l.j(this.f915B).iterator();
        while (it.hasNext()) {
            ((l) it.next()).b();
        }
    }

    @F(AbstractC2106m.a.ON_STOP)
    public void onStop(InterfaceC2114v interfaceC2114v) {
        Iterator it = H6.l.j(this.f915B).iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
    }
}
