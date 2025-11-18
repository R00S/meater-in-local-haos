package xb;

import Ab.k;
import Ba.l;
import Hb.AbstractC1082f0;
import Hb.U;
import Ia.g;
import Ib.C;
import Ib.g;
import Ib.t;
import Oa.j;
import Ra.A;
import Ra.H;
import Ra.I;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1696i;
import Ra.InterfaceC1700m;
import Ra.N;
import Ra.Y;
import Ra.Z;
import Ra.r0;
import Ra.t0;
import Rb.b;
import Tb.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.r;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.P;
import qb.f;
import tb.C4597i;

/* compiled from: DescriptorUtils.kt */
/* renamed from: xb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5087e {

    /* renamed from: a, reason: collision with root package name */
    private static final f f52916a;

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: xb.e$a */
    /* synthetic */ class a extends C3859p implements l<t0, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f52917B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 p02) {
            C3862t.g(p02, "p0");
            return Boolean.valueOf(p02.r0());
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final g getOwner() {
            return P.b(t0.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: xb.e$b */
    public static final class b extends b.AbstractC0223b<InterfaceC1689b, InterfaceC1689b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O<InterfaceC1689b> f52918a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<InterfaceC1689b, Boolean> f52919b;

        /* JADX WARN: Multi-variable type inference failed */
        b(O<InterfaceC1689b> o10, l<? super InterfaceC1689b, Boolean> lVar) {
            this.f52918a = o10;
            this.f52919b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Rb.b.AbstractC0223b, Rb.b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC1689b current) {
            C3862t.g(current, "current");
            if (this.f52918a.f43978B == null && this.f52919b.invoke(current).booleanValue()) {
                this.f52918a.f43978B = current;
            }
        }

        @Override // Rb.b.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC1689b current) {
            C3862t.g(current, "current");
            return this.f52918a.f43978B == null;
        }

        @Override // Rb.b.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC1689b a() {
            return this.f52918a.f43978B;
        }
    }

    static {
        f fVarT = f.t("value");
        C3862t.f(fVarT, "identifier(...)");
        f52916a = fVarT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h A(boolean z10, InterfaceC1689b interfaceC1689b) {
        C3862t.d(interfaceC1689b);
        return z(interfaceC1689b, z10);
    }

    public static final InterfaceC1692e B(H h10, qb.c topLevelClassFqName, Za.b location) {
        C3862t.g(h10, "<this>");
        C3862t.g(topLevelClassFqName, "topLevelClassFqName");
        C3862t.g(location, "location");
        topLevelClassFqName.d();
        qb.c cVarE = topLevelClassFqName.e();
        C3862t.f(cVarE, "parent(...)");
        k kVarS = h10.G(cVarE).s();
        f fVarG = topLevelClassFqName.g();
        C3862t.f(fVarG, "shortName(...)");
        InterfaceC1695h interfaceC1695hG = kVarS.g(fVarG, location);
        if (interfaceC1695hG instanceof InterfaceC1692e) {
            return (InterfaceC1692e) interfaceC1695hG;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1700m a(InterfaceC1700m it) {
        C3862t.g(it, "it");
        return it.c();
    }

    public static final boolean f(t0 t0Var) {
        C3862t.g(t0Var, "<this>");
        Boolean boolE = Rb.b.e(r.e(t0Var), C5083a.f52912a, a.f52917B);
        C3862t.f(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable g(t0 t0Var) {
        Collection<t0> collectionG = t0Var.g();
        ArrayList arrayList = new ArrayList(r.x(collectionG, 10));
        Iterator<T> it = collectionG.iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).b());
        }
        return arrayList;
    }

    public static final InterfaceC1689b h(InterfaceC1689b interfaceC1689b, boolean z10, l<? super InterfaceC1689b, Boolean> predicate) {
        C3862t.g(interfaceC1689b, "<this>");
        C3862t.g(predicate, "predicate");
        return (InterfaceC1689b) Rb.b.b(r.e(interfaceC1689b), new C5085c(z10), new b(new O(), predicate));
    }

    public static /* synthetic */ InterfaceC1689b i(InterfaceC1689b interfaceC1689b, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(interfaceC1689b, z10, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable j(boolean z10, InterfaceC1689b interfaceC1689b) {
        Collection<? extends InterfaceC1689b> collectionM;
        if (z10) {
            interfaceC1689b = interfaceC1689b != null ? interfaceC1689b.b() : null;
        }
        if (interfaceC1689b == null || (collectionM = interfaceC1689b.g()) == null) {
            collectionM = r.m();
        }
        return collectionM;
    }

    public static final qb.c k(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        qb.d dVarP = p(interfaceC1700m);
        if (!dVarP.f()) {
            dVarP = null;
        }
        if (dVarP != null) {
            return dVarP.l();
        }
        return null;
    }

    public static final InterfaceC1692e l(Sa.c cVar) {
        C3862t.g(cVar, "<this>");
        InterfaceC1695h interfaceC1695hT = cVar.a().O0().t();
        if (interfaceC1695hT instanceof InterfaceC1692e) {
            return (InterfaceC1692e) interfaceC1695hT;
        }
        return null;
    }

    public static final j m(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        return s(interfaceC1700m).q();
    }

    public static final qb.b n(InterfaceC1695h interfaceC1695h) {
        InterfaceC1700m interfaceC1700mC;
        qb.b bVarN;
        if (interfaceC1695h == null || (interfaceC1700mC = interfaceC1695h.c()) == null) {
            return null;
        }
        if (interfaceC1700mC instanceof N) {
            qb.c cVarF = ((N) interfaceC1700mC).f();
            f name = interfaceC1695h.getName();
            C3862t.f(name, "getName(...)");
            return new qb.b(cVarF, name);
        }
        if (!(interfaceC1700mC instanceof InterfaceC1696i) || (bVarN = n((InterfaceC1695h) interfaceC1700mC)) == null) {
            return null;
        }
        f name2 = interfaceC1695h.getName();
        C3862t.f(name2, "getName(...)");
        return bVarN.d(name2);
    }

    public static final qb.c o(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        qb.c cVarN = C4597i.n(interfaceC1700m);
        C3862t.f(cVarN, "getFqNameSafe(...)");
        return cVarN;
    }

    public static final qb.d p(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        qb.d dVarM = C4597i.m(interfaceC1700m);
        C3862t.f(dVarM, "getFqName(...)");
        return dVarM;
    }

    public static final A<AbstractC1082f0> q(InterfaceC1692e interfaceC1692e) {
        r0<AbstractC1082f0> r0VarY0 = interfaceC1692e != null ? interfaceC1692e.y0() : null;
        if (r0VarY0 instanceof A) {
            return (A) r0VarY0;
        }
        return null;
    }

    public static final Ib.g r(H h10) {
        C3862t.g(h10, "<this>");
        t tVar = (t) h10.M(Ib.h.a());
        C c10 = tVar != null ? (C) tVar.a() : null;
        return c10 instanceof C.a ? ((C.a) c10).b() : g.a.f6982a;
    }

    public static final H s(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        H hG = C4597i.g(interfaceC1700m);
        C3862t.f(hG, "getContainingModule(...)");
        return hG;
    }

    public static final I<AbstractC1082f0> t(InterfaceC1692e interfaceC1692e) {
        r0<AbstractC1082f0> r0VarY0 = interfaceC1692e != null ? interfaceC1692e.y0() : null;
        if (r0VarY0 instanceof I) {
            return (I) r0VarY0;
        }
        return null;
    }

    public static final h<InterfaceC1700m> u(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        return Tb.k.n(v(interfaceC1700m), 1);
    }

    public static final h<InterfaceC1700m> v(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        return Tb.k.i(interfaceC1700m, C5084b.f52913B);
    }

    public static final InterfaceC1689b w(InterfaceC1689b interfaceC1689b) {
        C3862t.g(interfaceC1689b, "<this>");
        if (!(interfaceC1689b instanceof Y)) {
            return interfaceC1689b;
        }
        Z zA0 = ((Y) interfaceC1689b).A0();
        C3862t.f(zA0, "getCorrespondingProperty(...)");
        return zA0;
    }

    public static final InterfaceC1692e x(InterfaceC1692e interfaceC1692e) {
        C3862t.g(interfaceC1692e, "<this>");
        for (U u10 : interfaceC1692e.u().O0().s()) {
            if (!j.b0(u10)) {
                InterfaceC1695h interfaceC1695hT = u10.O0().t();
                if (C4597i.w(interfaceC1695hT)) {
                    C3862t.e(interfaceC1695hT, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (InterfaceC1692e) interfaceC1695hT;
                }
            }
        }
        return null;
    }

    public static final boolean y(H h10) {
        C c10;
        C3862t.g(h10, "<this>");
        t tVar = (t) h10.M(Ib.h.a());
        return (tVar == null || (c10 = (C) tVar.a()) == null || !c10.a()) ? false : true;
    }

    public static final h<InterfaceC1689b> z(InterfaceC1689b interfaceC1689b, boolean z10) {
        C3862t.g(interfaceC1689b, "<this>");
        if (z10) {
            interfaceC1689b = interfaceC1689b.b();
        }
        h hVarJ = Tb.k.j(interfaceC1689b);
        Collection<? extends InterfaceC1689b> collectionG = interfaceC1689b.g();
        C3862t.f(collectionG, "getOverriddenDescriptors(...)");
        return Tb.k.C(hVarJ, Tb.k.u(r.Z(collectionG), new C5086d(z10)));
    }
}
