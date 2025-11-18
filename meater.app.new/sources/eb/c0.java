package eb;

import Hb.AbstractC1082f0;
import Hb.L0;
import Hb.Q0;
import Ra.InterfaceC1700m;
import Ra.h0;
import Ua.AbstractC1763b;
import db.C3092g;
import db.C3096k;
import fb.C3355b;
import hb.InterfaceC3517j;
import hb.InterfaceC3532y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: LazyJavaTypeParameterDescriptor.kt */
/* loaded from: classes3.dex */
public final class c0 extends AbstractC1763b {

    /* renamed from: L, reason: collision with root package name */
    private final C3096k f40887L;

    /* renamed from: M, reason: collision with root package name */
    private final InterfaceC3532y f40888M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(C3096k c10, InterfaceC3532y javaTypeParameter, int i10, InterfaceC1700m containingDeclaration) {
        super(c10.e(), containingDeclaration, new C3092g(c10, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Q0.f5693F, false, i10, h0.f15158a, c10.a().v());
        C3862t.g(c10, "c");
        C3862t.g(javaTypeParameter, "javaTypeParameter");
        C3862t.g(containingDeclaration, "containingDeclaration");
        this.f40887L = c10;
        this.f40888M = javaTypeParameter;
    }

    private final List<Hb.U> N0() {
        Collection<InterfaceC3517j> upperBounds = this.f40888M.getUpperBounds();
        if (upperBounds.isEmpty()) {
            AbstractC1082f0 abstractC1082f0I = this.f40887L.d().q().i();
            C3862t.f(abstractC1082f0I, "getAnyType(...)");
            AbstractC1082f0 abstractC1082f0I2 = this.f40887L.d().q().I();
            C3862t.f(abstractC1082f0I2, "getNullableAnyType(...)");
            return kotlin.collections.r.e(Hb.X.e(abstractC1082f0I, abstractC1082f0I2));
        }
        Collection<InterfaceC3517j> collection = upperBounds;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f40887L.g().p((InterfaceC3517j) it.next(), C3355b.b(L0.f5678C, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // Ua.AbstractC1769h
    protected List<Hb.U> F0(List<? extends Hb.U> bounds) {
        C3862t.g(bounds, "bounds");
        return this.f40887L.a().r().r(this, bounds, this.f40887L);
    }

    @Override // Ua.AbstractC1769h
    protected void L0(Hb.U type) {
        C3862t.g(type, "type");
    }

    @Override // Ua.AbstractC1769h
    protected List<Hb.U> M0() {
        return N0();
    }
}
