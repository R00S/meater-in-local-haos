package Qa;

import Ab.k;
import Db.L;
import Fb.C1032m;
import Hb.AbstractC1082f0;
import Hb.C1072a0;
import Hb.J0;
import Hb.U;
import Qa.k;
import Ra.C1705s;
import Ra.C1706t;
import Ra.C1711y;
import Ra.E;
import Ra.EnumC1693f;
import Ra.F;
import Ra.H;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.M;
import Ra.g0;
import Ra.h0;
import Ra.t0;
import Rb.b;
import Rb.l;
import Ua.C1772k;
import bb.InterfaceC2284j;
import eb.C3282n;
import eb.C3293z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jb.C3758B;
import jb.C3759C;
import jb.C3762F;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.V;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.P;
import lb.C3929i;
import oa.C4153F;
import oa.C4170o;
import tb.C4603o;
import va.C4929b;
import va.InterfaceC4928a;
import xb.C5087e;

/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes3.dex */
public final class u implements Ta.a, Ta.c {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f14636i = {P.h(new G(P.b(u.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), P.h(new G(P.b(u.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), P.h(new G(P.b(u.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a, reason: collision with root package name */
    private final H f14637a;

    /* renamed from: b, reason: collision with root package name */
    private final Qa.d f14638b;

    /* renamed from: c, reason: collision with root package name */
    private final Gb.i f14639c;

    /* renamed from: d, reason: collision with root package name */
    private final U f14640d;

    /* renamed from: e, reason: collision with root package name */
    private final Gb.i f14641e;

    /* renamed from: f, reason: collision with root package name */
    private final Gb.a<qb.c, InterfaceC1692e> f14642f;

    /* renamed from: g, reason: collision with root package name */
    private final Gb.i f14643g;

    /* renamed from: h, reason: collision with root package name */
    private final Gb.g<C4170o<String, String>, Sa.h> f14644h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    private static final class a {

        /* renamed from: B, reason: collision with root package name */
        public static final a f14645B = new a("HIDDEN", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final a f14646C = new a("VISIBLE", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final a f14647D = new a("DEPRECATED_LIST_METHODS", 2);

        /* renamed from: E, reason: collision with root package name */
        public static final a f14648E = new a("NOT_CONSIDERED", 3);

        /* renamed from: F, reason: collision with root package name */
        public static final a f14649F = new a("DROP", 4);

        /* renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ a[] f14650G;

        /* renamed from: H, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f14651H;

        static {
            a[] aVarArrC = c();
            f14650G = aVarArrC;
            f14651H = C4929b.a(aVarArrC);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] c() {
            return new a[]{f14645B, f14646C, f14647D, f14648E, f14649F};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f14650G.clone();
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14652a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f14645B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f14647D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f14648E.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f14649F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f14646C.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f14652a = iArr;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    public static final class c extends Ua.H {
        c(H h10, qb.c cVar) {
            super(h10, cVar);
        }

        @Override // Ra.N
        /* renamed from: F0, reason: merged with bridge method [inline-methods] */
        public k.b s() {
            return k.b.f1150b;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    public static final class d extends b.AbstractC0223b<InterfaceC1692e, a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14653a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O<a> f14654b;

        d(String str, O<a> o10) {
            this.f14653a = str;
            this.f14654b = o10;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [Qa.u$a, T] */
        /* JADX WARN: Type inference failed for: r0v5, types: [Qa.u$a, T] */
        /* JADX WARN: Type inference failed for: r0v6, types: [Qa.u$a, T] */
        /* JADX WARN: Type inference failed for: r0v7, types: [Qa.u$a, T] */
        @Override // Rb.b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC1692e javaClassDescriptor) {
            C3862t.g(javaClassDescriptor, "javaClassDescriptor");
            String strA = C3758B.a(C3762F.f43573a, javaClassDescriptor, this.f14653a);
            x xVar = x.f14658a;
            if (xVar.f().contains(strA)) {
                this.f14654b.f43978B = a.f14645B;
            } else if (xVar.i().contains(strA)) {
                this.f14654b.f43978B = a.f14646C;
            } else if (xVar.c().contains(strA)) {
                this.f14654b.f43978B = a.f14647D;
            } else if (xVar.d().contains(strA)) {
                this.f14654b.f43978B = a.f14649F;
            }
            return this.f14654b.f43978B == null;
        }

        @Override // Rb.b.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = this.f14654b.f43978B;
            return aVar == null ? a.f14648E : aVar;
        }
    }

    public u(H moduleDescriptor, Gb.n storageManager, Ba.a<k.b> settingsComputation) {
        C3862t.g(moduleDescriptor, "moduleDescriptor");
        C3862t.g(storageManager, "storageManager");
        C3862t.g(settingsComputation, "settingsComputation");
        this.f14637a = moduleDescriptor;
        this.f14638b = Qa.d.f14596a;
        this.f14639c = storageManager.g(settingsComputation);
        this.f14640d = q(storageManager);
        this.f14641e = storageManager.g(new l(this, storageManager));
        this.f14642f = storageManager.d();
        this.f14643g = storageManager.g(new m(this));
        this.f14644h = storageManager.h(new n(this));
    }

    private final a A(InterfaceC1712z interfaceC1712z) {
        InterfaceC1700m interfaceC1700mC = interfaceC1712z.c();
        C3862t.e(interfaceC1700mC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object objB = Rb.b.b(kotlin.collections.r.e((InterfaceC1692e) interfaceC1700mC), new t(this), new d(C3759C.c(interfaceC1712z, false, false, 3, null), new O()));
        C3862t.f(objB, "dfs(...)");
        return (a) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable B(u uVar, InterfaceC1692e interfaceC1692e) {
        Collection<U> collectionS = interfaceC1692e.l().s();
        C3862t.f(collectionS, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionS.iterator();
        while (it.hasNext()) {
            InterfaceC1695h interfaceC1695hT = ((U) it.next()).O0().t();
            C3282n c3282nZ = null;
            InterfaceC1695h interfaceC1695hB = interfaceC1695hT != null ? interfaceC1695hT.L0() : null;
            InterfaceC1692e interfaceC1692e2 = interfaceC1695hB instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hB : null;
            if (interfaceC1692e2 != null && (c3282nZ = uVar.z(interfaceC1692e2)) == null) {
                c3282nZ = interfaceC1692e2;
            }
            if (c3282nZ != null) {
                arrayList.add(c3282nZ);
            }
        }
        return arrayList;
    }

    private final Sa.h C() {
        return (Sa.h) Gb.m.a(this.f14643g, this, f14636i[2]);
    }

    private final k.b D() {
        return (k.b) Gb.m.a(this.f14639c, this, f14636i[0]);
    }

    private final boolean E(g0 g0Var, boolean z10) {
        InterfaceC1700m interfaceC1700mC = g0Var.c();
        C3862t.e(interfaceC1700mC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strC = C3759C.c(g0Var, false, false, 3, null);
        if (z10 ^ x.f14658a.g().contains(C3758B.a(C3762F.f43573a, (InterfaceC1692e) interfaceC1700mC, strC))) {
            return true;
        }
        Boolean boolE = Rb.b.e(kotlin.collections.r.e(g0Var), r.f14633a, new s(this));
        C3862t.f(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable F(InterfaceC1689b interfaceC1689b) {
        return interfaceC1689b.L0().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean G(Qa.u r2, Ra.InterfaceC1689b r3) {
        /*
            Ra.b$a r0 = r3.i()
            Ra.b$a r1 = Ra.InterfaceC1689b.a.DECLARATION
            if (r0 != r1) goto L1d
            Qa.d r2 = r2.f14638b
            Ra.m r3 = r3.c()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C3862t.e(r3, r0)
            Ra.e r3 = (Ra.InterfaceC1692e) r3
            boolean r2 = r2.c(r3)
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa.u.G(Qa.u, Ra.b):java.lang.Boolean");
    }

    private final boolean H(InterfaceC1699l interfaceC1699l, InterfaceC1692e interfaceC1692e) {
        if (interfaceC1699l.k().size() == 1) {
            List<t0> listK = interfaceC1699l.k();
            C3862t.f(listK, "getValueParameters(...)");
            InterfaceC1695h interfaceC1695hT = ((t0) kotlin.collections.r.J0(listK)).a().O0().t();
            if (C3862t.b(interfaceC1695hT != null ? C5087e.p(interfaceC1695hT) : null, C5087e.p(interfaceC1692e))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sa.h I(u uVar) {
        return Sa.h.f15630e.a(kotlin.collections.r.e(Sa.g.c(uVar.f14637a.q(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1082f0 o(u uVar, Gb.n nVar) {
        return C1711y.d(uVar.D().a(), g.f14600d.a(), new M(nVar, uVar.D().a())).u();
    }

    private final g0 p(C1032m c1032m, g0 g0Var) {
        InterfaceC1712z.a<? extends g0> aVarV = g0Var.v();
        aVarV.o(c1032m);
        aVarV.h(C1706t.f15170e);
        aVarV.s(c1032m.u());
        aVarV.u(c1032m.K0());
        InterfaceC1712z interfaceC1712zE = aVarV.e();
        C3862t.d(interfaceC1712zE);
        return (g0) interfaceC1712zE;
    }

    private final U q(Gb.n nVar) {
        C1772k c1772k = new C1772k(new c(this.f14637a, new qb.c("java.io")), qb.f.t("Serializable"), E.f15109F, EnumC1693f.f15144D, kotlin.collections.r.e(new C1072a0(nVar, new o(this))), h0.f15158a, false, nVar);
        c1772k.L0(k.b.f1150b, V.d(), null);
        AbstractC1082f0 abstractC1082f0U = c1772k.u();
        C3862t.f(abstractC1082f0U, "getDefaultType(...)");
        return abstractC1082f0U;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U r(u uVar) {
        AbstractC1082f0 abstractC1082f0I = uVar.f14637a.q().i();
        C3862t.f(abstractC1082f0I, "getAnyType(...)");
        return abstractC1082f0I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sa.h s(u uVar, C4170o c4170o) {
        C3862t.g(c4170o, "<destruct>");
        String str = (String) c4170o.a();
        String str2 = (String) c4170o.b();
        return Sa.h.f15630e.a(kotlin.collections.r.e(Sa.g.b(uVar.f14637a.q(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    private final Collection<g0> t(InterfaceC1692e interfaceC1692e, Ba.l<? super Ab.k, ? extends Collection<? extends g0>> lVar) {
        C3282n c3282nZ = z(interfaceC1692e);
        if (c3282nZ == null) {
            return kotlin.collections.r.m();
        }
        Collection<InterfaceC1692e> collectionG = this.f14638b.g(C5087e.o(c3282nZ), Qa.b.f14574h.a());
        InterfaceC1692e interfaceC1692e2 = (InterfaceC1692e) kotlin.collections.r.v0(collectionG);
        if (interfaceC1692e2 == null) {
            return kotlin.collections.r.m();
        }
        l.b bVar = Rb.l.f15221D;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collectionG, 10));
        Iterator<T> it = collectionG.iterator();
        while (it.hasNext()) {
            arrayList.add(C5087e.o((InterfaceC1692e) it.next()));
        }
        Rb.l lVarB = bVar.b(arrayList);
        boolean zC = this.f14638b.c(interfaceC1692e);
        Ab.k kVarC0 = this.f14642f.a(C5087e.o(c3282nZ), new q(c3282nZ, interfaceC1692e2)).C0();
        C3862t.f(kVarC0, "getUnsubstitutedMemberScope(...)");
        Collection<? extends g0> collectionInvoke = lVar.invoke(kVarC0);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionInvoke) {
            g0 g0Var = (g0) obj;
            if (g0Var.i() == InterfaceC1689b.a.DECLARATION && g0Var.getVisibility().d() && !Oa.j.k0(g0Var)) {
                Collection<? extends InterfaceC1712z> collectionG2 = g0Var.g();
                C3862t.f(collectionG2, "getOverriddenDescriptors(...)");
                Collection<? extends InterfaceC1712z> collection = collectionG2;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1700m interfaceC1700mC = ((InterfaceC1712z) it2.next()).c();
                        C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
                        if (lVarB.contains(C5087e.o(interfaceC1700mC))) {
                            break;
                        }
                    }
                }
                if (!E(g0Var, zC)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1692e u(C3282n c3282n, InterfaceC1692e interfaceC1692e) {
        InterfaceC2284j EMPTY = InterfaceC2284j.f30726a;
        C3862t.f(EMPTY, "EMPTY");
        return c3282n.Q0(EMPTY, interfaceC1692e);
    }

    private final AbstractC1082f0 v() {
        return (AbstractC1082f0) Gb.m.a(this.f14641e, this, f14636i[1]);
    }

    private static final boolean w(InterfaceC1699l interfaceC1699l, J0 j02, InterfaceC1699l interfaceC1699l2) {
        return C4603o.x(interfaceC1699l, interfaceC1699l2.d(j02)) == C4603o.i.a.OVERRIDABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection x(qb.f fVar, Ab.k it) {
        C3862t.g(it, "it");
        return it.b(fVar, Za.d.f19628E);
    }

    private final C3282n z(InterfaceC1692e interfaceC1692e) {
        qb.b bVarN;
        qb.c cVarA;
        if (Oa.j.a0(interfaceC1692e) || !Oa.j.B0(interfaceC1692e)) {
            return null;
        }
        qb.d dVarP = C5087e.p(interfaceC1692e);
        if (!dVarP.f() || (bVarN = Qa.c.f14576a.n(dVarP)) == null || (cVarA = bVarN.a()) == null) {
            return null;
        }
        InterfaceC1692e interfaceC1692eD = C1705s.d(D().a(), cVarA, Za.d.f19628E);
        if (interfaceC1692eD instanceof C3282n) {
            return (C3282n) interfaceC1692eD;
        }
        return null;
    }

    @Override // Ta.a
    public Collection<U> a(InterfaceC1692e classDescriptor) {
        C3862t.g(classDescriptor, "classDescriptor");
        qb.d dVarP = C5087e.p(classDescriptor);
        x xVar = x.f14658a;
        return xVar.j(dVarP) ? kotlin.collections.r.p(v(), this.f14640d) : xVar.k(dVarP) ? kotlin.collections.r.e(this.f14640d) : kotlin.collections.r.m();
    }

    @Override // Ta.a
    public Collection<InterfaceC1691d> b(InterfaceC1692e classDescriptor) {
        C3862t.g(classDescriptor, "classDescriptor");
        if (classDescriptor.i() != EnumC1693f.f15143C || !D().b()) {
            return kotlin.collections.r.m();
        }
        C3282n c3282nZ = z(classDescriptor);
        if (c3282nZ == null) {
            return kotlin.collections.r.m();
        }
        InterfaceC1692e interfaceC1692eF = Qa.d.f(this.f14638b, C5087e.o(c3282nZ), Qa.b.f14574h.a(), null, 4, null);
        if (interfaceC1692eF == null) {
            return kotlin.collections.r.m();
        }
        J0 j0C = y.a(interfaceC1692eF, c3282nZ).c();
        List<InterfaceC1691d> listS0 = c3282nZ.n();
        ArrayList<InterfaceC1691d> arrayList = new ArrayList();
        for (Object obj : listS0) {
            InterfaceC1691d interfaceC1691d = (InterfaceC1691d) obj;
            if (interfaceC1691d.getVisibility().d()) {
                Collection<InterfaceC1691d> collectionN = interfaceC1692eF.n();
                C3862t.f(collectionN, "getConstructors(...)");
                Collection<InterfaceC1691d> collection = collectionN;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (InterfaceC1691d interfaceC1691d2 : collection) {
                        C3862t.d(interfaceC1691d2);
                        if (w(interfaceC1691d2, j0C, interfaceC1691d)) {
                            break;
                        }
                    }
                }
                if (!H(interfaceC1691d, classDescriptor) && !Oa.j.k0(interfaceC1691d) && !x.f14658a.e().contains(C3758B.a(C3762F.f43573a, c3282nZ, C3759C.c(interfaceC1691d, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(arrayList, 10));
        for (InterfaceC1691d interfaceC1691d3 : arrayList) {
            InterfaceC1712z.a<? extends InterfaceC1712z> aVarV = interfaceC1691d3.v();
            aVarV.o(classDescriptor);
            aVarV.s(classDescriptor.u());
            aVarV.d();
            aVarV.r(j0C.j());
            if (!x.f14658a.h().contains(C3758B.a(C3762F.f43573a, c3282nZ, C3759C.c(interfaceC1691d3, false, false, 3, null)))) {
                aVarV.q(C());
            }
            InterfaceC1712z interfaceC1712zE = aVarV.e();
            C3862t.e(interfaceC1712zE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((InterfaceC1691d) interfaceC1712zE);
        }
        return arrayList2;
    }

    @Override // Ta.a
    public Collection<g0> d(qb.f name, InterfaceC1692e classDescriptor) {
        Sa.h hVarInvoke;
        C3862t.g(name, "name");
        C3862t.g(classDescriptor, "classDescriptor");
        if (C3862t.b(name, Qa.a.f14572e.a()) && (classDescriptor instanceof C1032m) && Oa.j.e0(classDescriptor)) {
            C1032m c1032m = (C1032m) classDescriptor;
            List<C3929i> listJ0 = c1032m.f1().J0();
            C3862t.f(listJ0, "getFunctionList(...)");
            List<C3929i> list = listJ0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (C3862t.b(L.b(c1032m.e1().g(), ((C3929i) it.next()).e0()), Qa.a.f14572e.a())) {
                        return kotlin.collections.r.m();
                    }
                }
            }
            return kotlin.collections.r.e(p(c1032m, (g0) kotlin.collections.r.I0(v().s().b(name, Za.d.f19628E))));
        }
        if (!D().b()) {
            return kotlin.collections.r.m();
        }
        Collection<g0> collectionT = t(classDescriptor, new p(name));
        ArrayList arrayList = new ArrayList();
        for (g0 g0Var : collectionT) {
            InterfaceC1700m interfaceC1700mC = g0Var.c();
            C3862t.e(interfaceC1700mC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC1712z interfaceC1712zD = g0Var.d(y.a((InterfaceC1692e) interfaceC1700mC, classDescriptor).c());
            C3862t.e(interfaceC1712zD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            InterfaceC1712z.a<? extends g0> aVarV = ((g0) interfaceC1712zD).v();
            aVarV.o(classDescriptor);
            aVarV.u(classDescriptor.K0());
            aVarV.d();
            int i10 = b.f14652a[A(g0Var).ordinal()];
            g0 g0Var2 = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    qb.f name2 = g0Var.getName();
                    if (C3862t.b(name2, v.f14655a)) {
                        hVarInvoke = this.f14644h.invoke(oa.v.a(g0Var.getName().j(), "first"));
                    } else {
                        if (!C3862t.b(name2, v.f14656b)) {
                            throw new IllegalStateException(("Unexpected name: " + g0Var.getName()).toString());
                        }
                        hVarInvoke = this.f14644h.invoke(oa.v.a(g0Var.getName().j(), "last"));
                    }
                    aVarV.q(hVarInvoke);
                } else if (i10 == 3) {
                    aVarV.q(C());
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C4153F c4153f = C4153F.f46609a;
                }
                InterfaceC1712z interfaceC1712zE = aVarV.e();
                C3862t.d(interfaceC1712zE);
                g0Var2 = (g0) interfaceC1712zE;
            } else if (!F.a(classDescriptor)) {
                aVarV.f();
                InterfaceC1712z interfaceC1712zE2 = aVarV.e();
                C3862t.d(interfaceC1712zE2);
                g0Var2 = (g0) interfaceC1712zE2;
            }
            if (g0Var2 != null) {
                arrayList.add(g0Var2);
            }
        }
        return arrayList;
    }

    @Override // Ta.c
    public boolean e(InterfaceC1692e classDescriptor, g0 functionDescriptor) {
        C3862t.g(classDescriptor, "classDescriptor");
        C3862t.g(functionDescriptor, "functionDescriptor");
        C3282n c3282nZ = z(classDescriptor);
        if (c3282nZ == null || !functionDescriptor.getAnnotations().P(Ta.d.a())) {
            return true;
        }
        if (!D().b()) {
            return false;
        }
        String strC = C3759C.c(functionDescriptor, false, false, 3, null);
        C3293z c3293zV0 = c3282nZ.C0();
        qb.f name = functionDescriptor.getName();
        C3862t.f(name, "getName(...)");
        Collection<g0> collectionB = c3293zV0.b(name, Za.d.f19628E);
        if (!(collectionB instanceof Collection) || !collectionB.isEmpty()) {
            Iterator<T> it = collectionB.iterator();
            while (it.hasNext()) {
                if (C3862t.b(C3759C.c((g0) it.next(), false, false, 3, null), strC)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Ta.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Set<qb.f> c(InterfaceC1692e classDescriptor) {
        C3293z c3293zV0;
        Set<qb.f> setA;
        C3862t.g(classDescriptor, "classDescriptor");
        if (!D().b()) {
            return V.d();
        }
        C3282n c3282nZ = z(classDescriptor);
        return (c3282nZ == null || (c3293zV0 = c3282nZ.C0()) == null || (setA = c3293zV0.a()) == null) ? V.d() : setA;
    }
}
