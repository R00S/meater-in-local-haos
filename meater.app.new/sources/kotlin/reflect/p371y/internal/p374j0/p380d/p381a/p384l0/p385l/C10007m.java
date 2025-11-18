package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10815t;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10639b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9973k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9987d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10011d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10033j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10048y;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;

/* compiled from: LazyJavaTypeParameterDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.m */
/* loaded from: classes2.dex */
public final class C10007m extends AbstractC10639b {

    /* renamed from: p */
    private final C9990g f38151p;

    /* renamed from: q */
    private final InterfaceC10048y f38152q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10007m(C9990g c9990g, InterfaceC10048y interfaceC10048y, int i2, InterfaceC10609m interfaceC10609m) {
        super(c9990g.m33286e(), interfaceC10609m, new C9987d(c9990g, interfaceC10048y, false, 4, null), interfaceC10048y.getName(), EnumC10384r1.INVARIANT, false, i2, InterfaceC10741z0.f41247a, c9990g.m33282a().m33262v());
        C9801m.m32346f(c9990g, "c");
        C9801m.m32346f(interfaceC10048y, "javaTypeParameter");
        C9801m.m32346f(interfaceC10609m, "containingDeclaration");
        this.f38151p = c9990g;
        this.f38152q = interfaceC10048y;
    }

    /* renamed from: N0 */
    private final List<AbstractC10344e0> m33495N0() {
        Collection<InterfaceC10033j> upperBounds = this.f38152q.getUpperBounds();
        if (upperBounds.isEmpty()) {
            AbstractC10368m0 abstractC10368m0M32791i = this.f38151p.m33285d().mo37021o().m32791i();
            C9801m.m32345e(abstractC10368m0M32791i, "c.module.builtIns.anyType");
            AbstractC10368m0 abstractC10368m0M32774I = this.f38151p.m33285d().mo37021o().m32774I();
            C9801m.m32345e(abstractC10368m0M32774I, "c.module.builtIns.nullableAnyType");
            return C10815t.m38883e(C10347f0.m36664d(abstractC10368m0M32791i, abstractC10368m0M32774I));
        }
        ArrayList arrayList = new ArrayList(C10819v.m38911u(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f38151p.m33288g().m33525o((InterfaceC10033j) it.next(), C10011d.m33530d(EnumC9973k.COMMON, false, this, 1, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10645e
    /* renamed from: A0 */
    protected List<AbstractC10344e0> mo33496A0(List<? extends AbstractC10344e0> list) {
        C9801m.m32346f(list, "bounds");
        return this.f38151p.m33282a().m33258r().m33747i(this, list, this.f38151p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10645e
    /* renamed from: L0 */
    protected void mo33497L0(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10645e
    /* renamed from: M0 */
    protected List<AbstractC10344e0> mo33498M0() {
        return m33495N0();
    }
}
