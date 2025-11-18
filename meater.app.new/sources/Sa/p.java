package Sa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C3862t;

/* compiled from: Annotations.kt */
/* loaded from: classes3.dex */
public final class p implements h {

    /* renamed from: B, reason: collision with root package name */
    private final h f15643B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f15644C;

    /* renamed from: D, reason: collision with root package name */
    private final Ba.l<qb.c, Boolean> f15645D;

    /* JADX WARN: Multi-variable type inference failed */
    public p(h delegate, boolean z10, Ba.l<? super qb.c, Boolean> fqNameFilter) {
        C3862t.g(delegate, "delegate");
        C3862t.g(fqNameFilter, "fqNameFilter");
        this.f15643B = delegate;
        this.f15644C = z10;
        this.f15645D = fqNameFilter;
    }

    private final boolean c(c cVar) {
        qb.c cVarF = cVar.f();
        return cVarF != null && this.f15645D.invoke(cVarF).booleanValue();
    }

    @Override // Sa.h
    public boolean P(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        if (this.f15645D.invoke(fqName).booleanValue()) {
            return this.f15643B.P(fqName);
        }
        return false;
    }

    @Override // Sa.h
    public boolean isEmpty() {
        boolean z10;
        h hVar = this.f15643B;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            z10 = false;
        } else {
            Iterator<c> it = hVar.iterator();
            while (it.hasNext()) {
                if (c(it.next())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        return this.f15644C ? !z10 : z10;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        h hVar = this.f15643B;
        ArrayList arrayList = new ArrayList();
        for (c cVar : hVar) {
            if (c(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    @Override // Sa.h
    public c o(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        if (this.f15645D.invoke(fqName).booleanValue()) {
            return this.f15643B.o(fqName);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(h delegate, Ba.l<? super qb.c, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        C3862t.g(delegate, "delegate");
        C3862t.g(fqNameFilter, "fqNameFilter");
    }
}
