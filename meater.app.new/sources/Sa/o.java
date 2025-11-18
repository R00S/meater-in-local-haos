package Sa;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: Annotations.kt */
/* loaded from: classes3.dex */
public final class o implements h {

    /* renamed from: B, reason: collision with root package name */
    private final List<h> f15642B;

    /* JADX WARN: Multi-variable type inference failed */
    public o(List<? extends h> delegates) {
        C3862t.g(delegates, "delegates");
        this.f15642B = delegates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c i(qb.c cVar, h it) {
        C3862t.g(it, "it");
        return it.o(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tb.h j(h it) {
        C3862t.g(it, "it");
        return kotlin.collections.r.Z(it);
    }

    @Override // Sa.h
    public boolean P(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        Iterator it = kotlin.collections.r.Z(this.f15642B).iterator();
        while (it.hasNext()) {
            if (((h) it.next()).P(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // Sa.h
    public boolean isEmpty() {
        List<h> list = this.f15642B;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((h) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return Tb.k.u(kotlin.collections.r.Z(this.f15642B), n.f15641B).iterator();
    }

    @Override // Sa.h
    public c o(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return (c) Tb.k.t(Tb.k.B(kotlin.collections.r.Z(this.f15642B), new m(fqName)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(h... delegates) {
        this((List<? extends h>) C3831l.I0(delegates));
        C3862t.g(delegates, "delegates");
    }
}
