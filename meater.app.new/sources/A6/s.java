package A6;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes2.dex */
public final class s implements l {

    /* renamed from: B, reason: collision with root package name */
    private final Set<E6.i<?>> f946B = Collections.newSetFromMap(new WeakHashMap());

    @Override // A6.l
    public void a() {
        Iterator it = H6.l.j(this.f946B).iterator();
        while (it.hasNext()) {
            ((E6.i) it.next()).a();
        }
    }

    @Override // A6.l
    public void b() {
        Iterator it = H6.l.j(this.f946B).iterator();
        while (it.hasNext()) {
            ((E6.i) it.next()).b();
        }
    }

    @Override // A6.l
    public void e() {
        Iterator it = H6.l.j(this.f946B).iterator();
        while (it.hasNext()) {
            ((E6.i) it.next()).e();
        }
    }

    public void l() {
        this.f946B.clear();
    }

    public List<E6.i<?>> m() {
        return H6.l.j(this.f946B);
    }

    public void n(E6.i<?> iVar) {
        this.f946B.add(iVar);
    }

    public void o(E6.i<?> iVar) {
        this.f946B.remove(iVar);
    }
}
