package ib;

import ab.AbstractC1942b;
import ab.C1924E;
import ab.C1963w;
import ab.EnumC1943c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3862t;

/* compiled from: AbstractSignatureParts.kt */
/* renamed from: ib.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3670d<TAnnotation> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: ib.d$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Lb.i f43234a;

        /* renamed from: b, reason: collision with root package name */
        private final C1924E f43235b;

        /* renamed from: c, reason: collision with root package name */
        private final Lb.n f43236c;

        public a(Lb.i iVar, C1924E c1924e, Lb.n nVar) {
            this.f43234a = iVar;
            this.f43235b = c1924e;
            this.f43236c = nVar;
        }

        public final C1924E a() {
            return this.f43235b;
        }

        public final Lb.i b() {
            return this.f43234a;
        }

        public final Lb.n c() {
            return this.f43236c;
        }
    }

    private final C3678l G(C3678l c3678l, C3678l c3678l2) {
        return c3678l == null ? c3678l2 : c3678l2 == null ? c3678l : (!c3678l.d() || c3678l2.d()) ? (c3678l.d() || !c3678l2.d()) ? (c3678l.c().compareTo(c3678l2.c()) >= 0 && c3678l.c().compareTo(c3678l2.c()) > 0) ? c3678l : c3678l2 : c3678l : c3678l2;
    }

    private final List<a> H(Lb.i iVar) {
        return j(new a(iVar, f(iVar, r()), null), new C3669c(this, A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable I(AbstractC3670d abstractC3670d, Lb.o oVar, a it) {
        Lb.i iVarB;
        Lb.m mVarD0;
        List<Lb.n> listM;
        a aVar;
        Lb.i iVarB2;
        C3862t.g(it, "it");
        if ((abstractC3670d.z() && (iVarB2 = it.b()) != null && oVar.z(iVarB2)) || (iVarB = it.b()) == null || (mVarD0 = oVar.d0(iVarB)) == null || (listM = oVar.m(mVarD0)) == null) {
            return null;
        }
        List<Lb.n> list = listM;
        List<Lb.l> listN0 = oVar.n0(it.b());
        Iterator<T> it2 = list.iterator();
        Iterator<T> it3 = listN0.iterator();
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.x(list, 10), kotlin.collections.r.x(listN0, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            Lb.l lVar = (Lb.l) it3.next();
            Lb.n nVar = (Lb.n) next;
            if (oVar.y(lVar)) {
                aVar = new a(null, it.a(), nVar);
            } else {
                Lb.i iVarH0 = oVar.H0(lVar);
                aVar = new a(iVarH0, abstractC3670d.f(iVarH0, it.a()), nVar);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3674h e(j0 j0Var, C3674h[] c3674hArr, int i10) {
        Map<Integer, C3674h> mapB;
        C3674h c3674h;
        return (j0Var == null || (mapB = j0Var.b()) == null || (c3674h = mapB.get(Integer.valueOf(i10))) == null) ? (i10 < 0 || i10 >= c3674hArr.length) ? C3674h.f43260e.a() : c3674hArr[i10] : c3674h;
    }

    private final C1924E f(Lb.i iVar, C1924E c1924e) {
        return m().d(c1924e, n(iVar));
    }

    private final C3674h g(Lb.i iVar) {
        EnumC3677k enumC3677kY;
        EnumC3677k enumC3677kY2 = y(iVar);
        EnumC3675i enumC3675i = null;
        if (enumC3677kY2 == null) {
            Lb.i iVarV = v(iVar);
            enumC3677kY = iVarV != null ? y(iVarV) : null;
        } else {
            enumC3677kY = enumC3677kY2;
        }
        Lb.o oVarA = A();
        Qa.c cVar = Qa.c.f14576a;
        if (cVar.l(x(oVarA.m0(iVar)))) {
            enumC3675i = EnumC3675i.f43271B;
        } else if (cVar.k(x(oVarA.G0(iVar)))) {
            enumC3675i = EnumC3675i.f43272C;
        }
        return new C3674h(enumC3677kY, enumC3675i, A().p(iVar) || F(iVar), enumC3677kY != enumC3677kY2);
    }

    private final C3674h h(a aVar) {
        List listM;
        C3678l c3678lO;
        Lb.i iVarB;
        Lb.m mVarD0;
        if (aVar.b() == null) {
            Lb.o oVarA = A();
            Lb.n nVarC = aVar.c();
            if ((nVarC != null ? oVarA.I0(nVarC) : null) == Lb.t.f11310C) {
                return C3674h.f43260e.a();
            }
        }
        boolean z10 = false;
        boolean z11 = aVar.c() == null;
        Lb.i iVarB2 = aVar.b();
        if (iVarB2 == null || (listM = n(iVarB2)) == null) {
            listM = kotlin.collections.r.m();
        }
        Lb.o oVarA2 = A();
        Lb.i iVarB3 = aVar.b();
        Lb.n nVarX0 = (iVarB3 == null || (mVarD0 = oVarA2.d0(iVarB3)) == null) ? null : oVarA2.x0(mVarD0);
        boolean z12 = q() == EnumC1943c.f20246G;
        if (z11) {
            if (z12 || !u() || (iVarB = aVar.b()) == null || !B(iVarB)) {
                listM = kotlin.collections.r.D0(p(), listM);
            } else {
                Iterable<TAnnotation> iterableP = p();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : iterableP) {
                    if (!m().p(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                listM = kotlin.collections.r.F0(arrayList, listM);
            }
        }
        EnumC3675i enumC3675iG = m().g(listM);
        C3678l c3678lH = m().h(listM, new C3667a(this, aVar));
        if (c3678lH != null) {
            EnumC3677k enumC3677kC = c3678lH.c();
            if (c3678lH.c() == EnumC3677k.f43279D && nVarX0 != null) {
                z10 = true;
            }
            return new C3674h(enumC3677kC, enumC3675iG, z10, c3678lH.d());
        }
        EnumC1943c enumC1943cQ = (z11 || z12) ? q() : EnumC1943c.f20245F;
        C1924E c1924eA = aVar.a();
        C1963w c1963wA = c1924eA != null ? c1924eA.a(enumC1943cQ) : null;
        C3678l c3678lO2 = nVarX0 != null ? o(nVarX0) : null;
        C3678l c3678lT = t(c3678lO2, c1963wA);
        boolean z13 = (c3678lO2 != null ? c3678lO2.c() : null) == EnumC3677k.f43279D || !(nVarX0 == null || c1963wA == null || !c1963wA.c());
        Lb.n nVarC2 = aVar.c();
        if (nVarC2 == null || (c3678lO = o(nVarC2)) == null) {
            c3678lO = null;
        } else if (c3678lO.c() == EnumC3677k.f43278C) {
            c3678lO = C3678l.b(c3678lO, EnumC3677k.f43277B, false, 2, null);
        }
        C3678l c3678lG = G(c3678lO, c3678lT);
        EnumC3677k enumC3677kC2 = c3678lG != null ? c3678lG.c() : null;
        if (c3678lG != null && c3678lG.d()) {
            z10 = true;
        }
        return new C3674h(enumC3677kC2, enumC3675iG, z13, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(AbstractC3670d abstractC3670d, a aVar, Object extractNullability) {
        C3862t.g(extractNullability, "$this$extractNullability");
        return abstractC3670d.l(extractNullability, aVar.b());
    }

    private final <T> List<T> j(T t10, Ba.l<? super T, ? extends Iterable<? extends T>> lVar) {
        ArrayList arrayList = new ArrayList(1);
        k(t10, arrayList, lVar);
        return arrayList;
    }

    private final <T> void k(T t10, List<T> list, Ba.l<? super T, ? extends Iterable<? extends T>> lVar) {
        list.add(t10);
        Iterable<? extends T> iterableInvoke = lVar.invoke(t10);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                k(it.next(), list, lVar);
            }
        }
    }

    private final C3678l o(Lb.n nVar) {
        List<Lb.i> arrayList;
        EnumC3677k enumC3677k;
        Lb.o oVarA = A();
        if (!E(nVar)) {
            return null;
        }
        List<Lb.i> listJ = oVarA.J(nVar);
        List<Lb.i> list = listJ;
        boolean z10 = list instanceof Collection;
        if (!z10 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!oVarA.f0((Lb.i) it.next())) {
                    if (!z10 || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (y((Lb.i) it2.next()) != null) {
                                arrayList = listJ;
                                break;
                            }
                        }
                    }
                    if (!z10 || !list.isEmpty()) {
                        Iterator<T> it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (v((Lb.i) it3.next()) != null) {
                                arrayList = new ArrayList<>();
                                Iterator<T> it4 = list.iterator();
                                while (it4.hasNext()) {
                                    Lb.i iVarV = v((Lb.i) it4.next());
                                    if (iVarV != null) {
                                        arrayList.add(iVarV);
                                    }
                                }
                                List<Lb.i> list2 = arrayList;
                                if ((list2 instanceof Collection) && list2.isEmpty()) {
                                    enumC3677k = EnumC3677k.f43278C;
                                } else {
                                    Iterator<T> it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        if (!oVarA.l((Lb.i) it5.next())) {
                                            enumC3677k = EnumC3677k.f43279D;
                                            break;
                                        }
                                    }
                                    enumC3677k = EnumC3677k.f43278C;
                                }
                                return new C3678l(enumC3677k, arrayList != listJ);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private final EnumC3677k y(Lb.i iVar) {
        Lb.o oVarA = A();
        if (oVarA.B(oVarA.m0(iVar))) {
            return EnumC3677k.f43278C;
        }
        if (oVarA.B(oVarA.G0(iVar))) {
            return null;
        }
        return EnumC3677k.f43279D;
    }

    public abstract Lb.o A();

    public abstract boolean B(Lb.i iVar);

    public abstract boolean C();

    public abstract boolean D(Lb.i iVar, Lb.i iVar2);

    public abstract boolean E(Lb.n nVar);

    public abstract boolean F(Lb.i iVar);

    public final Ba.l<Integer, C3674h> d(Lb.i iVar, Iterable<? extends Lb.i> overrides, j0 j0Var, boolean z10) {
        int size;
        Lb.i iVarB;
        C3862t.g(iVar, "<this>");
        C3862t.g(overrides, "overrides");
        List<a> listH = H(iVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(overrides, 10));
        Iterator<? extends Lb.i> it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(H(it.next()));
        }
        if (w()) {
            size = 1;
            break;
        }
        if (C() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
            Iterator<? extends Lb.i> it2 = overrides.iterator();
            while (it2.hasNext()) {
                if (!D(iVar, it2.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = listH.size();
        C3674h[] c3674hArr = new C3674h[size];
        int i10 = 0;
        while (i10 < size) {
            C3674h c3674hH = h(listH.get(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar = (a) kotlin.collections.r.m0((List) it3.next(), i10);
                C3674h c3674hG = (aVar == null || (iVarB = aVar.b()) == null) ? null : g(iVarB);
                if (c3674hG != null) {
                    arrayList2.add(c3674hG);
                }
            }
            c3674hArr[i10] = l0.a(c3674hH, arrayList2, i10 == 0 && C(), i10 == 0 && s(), z10);
            i10++;
        }
        return new C3668b(j0Var, c3674hArr);
    }

    public abstract boolean l(TAnnotation tannotation, Lb.i iVar);

    public abstract AbstractC1942b<TAnnotation> m();

    public abstract Iterable<TAnnotation> n(Lb.i iVar);

    public abstract Iterable<TAnnotation> p();

    public abstract EnumC1943c q();

    public abstract C1924E r();

    public abstract boolean s();

    protected abstract C3678l t(C3678l c3678l, C1963w c1963w);

    public abstract boolean u();

    public abstract Lb.i v(Lb.i iVar);

    public boolean w() {
        return false;
    }

    public abstract qb.d x(Lb.i iVar);

    public abstract boolean z();
}
