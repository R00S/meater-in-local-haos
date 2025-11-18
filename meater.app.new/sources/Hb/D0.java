package Hb;

import Hb.z0;
import Ib.C1202d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.C4170o;
import oa.InterfaceC4164i;

/* compiled from: TypeParameterUpperBoundEraser.kt */
/* loaded from: classes3.dex */
public final class D0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f5645f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final H f5646a;

    /* renamed from: b, reason: collision with root package name */
    private final A0 f5647b;

    /* renamed from: c, reason: collision with root package name */
    private final Gb.f f5648c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4164i f5649d;

    /* renamed from: e, reason: collision with root package name */
    private final Gb.g<b, U> f5650e;

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01d5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final Hb.U a(Hb.U r17, Hb.J0 r18, java.util.Set<? extends Ra.m0> r19, boolean r20) {
            /*
                Method dump skipped, instructions count: 506
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Hb.D0.a.a(Hb.U, Hb.J0, java.util.Set, boolean):Hb.U");
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TypeParameterUpperBoundEraser.kt */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Ra.m0 f5651a;

        /* renamed from: b, reason: collision with root package name */
        private final I f5652b;

        public b(Ra.m0 typeParameter, I typeAttr) {
            C3862t.g(typeParameter, "typeParameter");
            C3862t.g(typeAttr, "typeAttr");
            this.f5651a = typeParameter;
            this.f5652b = typeAttr;
        }

        public final I a() {
            return this.f5652b;
        }

        public final Ra.m0 b() {
            return this.f5651a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C3862t.b(bVar.f5651a, this.f5651a) && C3862t.b(bVar.f5652b, this.f5652b);
        }

        public int hashCode() {
            int iHashCode = this.f5651a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f5652b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f5651a + ", typeAttr=" + this.f5652b + ')';
        }
    }

    public D0(H projectionComputer, A0 options) {
        C3862t.g(projectionComputer, "projectionComputer");
        C3862t.g(options, "options");
        this.f5646a = projectionComputer;
        this.f5647b = options;
        Gb.f fVar = new Gb.f("Type parameter upper bound erasure results");
        this.f5648c = fVar;
        this.f5649d = C4165j.a(new B0(this));
        Gb.g<b, U> gVarH = fVar.h(new C0(this));
        C3862t.f(gVarH, "createMemoizedFunction(...)");
        this.f5650e = gVarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Jb.i c(D0 d02) {
        return Jb.l.d(Jb.k.f7747X0, d02.toString());
    }

    private final U d(I i10) {
        U uD;
        AbstractC1082f0 abstractC1082f0A = i10.a();
        return (abstractC1082f0A == null || (uD = Mb.d.D(abstractC1082f0A)) == null) ? h() : uD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U f(D0 d02, b bVar) {
        return d02.g(bVar.b(), bVar.a());
    }

    private final U g(Ra.m0 m0Var, I i10) {
        E0 e0A;
        Set<Ra.m0> setC = i10.c();
        if (setC != null && setC.contains(m0Var.b())) {
            return d(i10);
        }
        AbstractC1082f0 abstractC1082f0U = m0Var.u();
        C3862t.f(abstractC1082f0U, "getDefaultType(...)");
        Set<Ra.m0> setL = Mb.d.l(abstractC1082f0U, setC);
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ha.g.d(kotlin.collections.M.d(kotlin.collections.r.x(setL, 10)), 16));
        for (Ra.m0 m0Var2 : setL) {
            if (setC == null || !setC.contains(m0Var2)) {
                e0A = this.f5646a.a(m0Var2, i10, this, e(m0Var2, i10.d(m0Var)));
            } else {
                e0A = M0.t(m0Var2, i10);
                C3862t.f(e0A, "makeStarProjection(...)");
            }
            C4170o c4170oA = oa.v.a(m0Var2.l(), e0A);
            linkedHashMap.put(c4170oA.c(), c4170oA.d());
        }
        J0 j0G = J0.g(z0.a.e(z0.f5820c, linkedHashMap, false, 2, null));
        C3862t.f(j0G, "create(...)");
        List<U> upperBounds = m0Var.getUpperBounds();
        C3862t.f(upperBounds, "getUpperBounds(...)");
        Set<U> setI = i(j0G, upperBounds, i10);
        if (setI.isEmpty()) {
            return d(i10);
        }
        if (!this.f5647b.a()) {
            if (setI.size() == 1) {
                return (U) kotlin.collections.r.I0(setI);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listW0 = kotlin.collections.r.W0(setI);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listW0, 10));
        Iterator it = listW0.iterator();
        while (it.hasNext()) {
            arrayList.add(((U) it.next()).R0());
        }
        return C1202d.a(arrayList);
    }

    private final Jb.i h() {
        return (Jb.i) this.f5649d.getValue();
    }

    private final Set<U> i(J0 j02, List<? extends U> list, I i10) {
        Set setB = kotlin.collections.V.b();
        for (U u10 : list) {
            InterfaceC1695h interfaceC1695hT = u10.O0().t();
            if (interfaceC1695hT instanceof InterfaceC1692e) {
                setB.add(f5645f.a(u10, j02, i10.c(), this.f5647b.b()));
            } else if (interfaceC1695hT instanceof Ra.m0) {
                Set<Ra.m0> setC = i10.c();
                if (setC == null || !setC.contains(interfaceC1695hT)) {
                    List<U> upperBounds = ((Ra.m0) interfaceC1695hT).getUpperBounds();
                    C3862t.f(upperBounds, "getUpperBounds(...)");
                    setB.addAll(i(j02, upperBounds, i10));
                } else {
                    setB.add(d(i10));
                }
            }
            if (!this.f5647b.a()) {
                break;
            }
        }
        return kotlin.collections.V.a(setB);
    }

    public final U e(Ra.m0 typeParameter, I typeAttr) {
        C3862t.g(typeParameter, "typeParameter");
        C3862t.g(typeAttr, "typeAttr");
        U uInvoke = this.f5650e.invoke(new b(typeParameter, typeAttr));
        C3862t.f(uInvoke, "invoke(...)");
        return uInvoke;
    }

    public /* synthetic */ D0(H h10, A0 a02, int i10, C3854k c3854k) {
        this(h10, (i10 & 2) != 0 ? new A0(false, false) : a02);
    }
}
