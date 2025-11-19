package eb;

import Db.InterfaceC1016w;
import Hb.AbstractC1073b;
import Hb.AbstractC1082f0;
import Hb.G0;
import Hb.L0;
import Hb.Q0;
import Hb.u0;
import Hb.y0;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.EnumC1693f;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.M;
import Ra.f0;
import Ra.k0;
import Ra.m0;
import Ra.q0;
import Ra.r0;
import Ra.x0;
import Ua.AbstractC1771j;
import ab.C1928I;
import ab.C1940V;
import ab.C1958r;
import bb.InterfaceC2284j;
import db.C3088c;
import db.C3093h;
import db.C3096k;
import fb.C3354a;
import fb.C3355b;
import hb.InterfaceC3508a;
import hb.InterfaceC3514g;
import hb.InterfaceC3517j;
import hb.InterfaceC3531x;
import hb.InterfaceC3532y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;
import ra.C4370a;
import xb.C5087e;

/* compiled from: LazyJavaClassDescriptor.kt */
/* renamed from: eb.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3282n extends AbstractC1771j implements cb.c {

    /* renamed from: Z, reason: collision with root package name */
    public static final a f40910Z = new a(null);

    /* renamed from: a0, reason: collision with root package name */
    private static final Set<String> f40911a0 = kotlin.collections.V.g("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* renamed from: J, reason: collision with root package name */
    private final C3096k f40912J;

    /* renamed from: K, reason: collision with root package name */
    private final InterfaceC3514g f40913K;

    /* renamed from: L, reason: collision with root package name */
    private final InterfaceC1692e f40914L;

    /* renamed from: M, reason: collision with root package name */
    private final C3096k f40915M;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC4164i f40916N;

    /* renamed from: O, reason: collision with root package name */
    private final EnumC1693f f40917O;

    /* renamed from: P, reason: collision with root package name */
    private final Ra.E f40918P;

    /* renamed from: Q, reason: collision with root package name */
    private final x0 f40919Q;

    /* renamed from: R, reason: collision with root package name */
    private final boolean f40920R;

    /* renamed from: S, reason: collision with root package name */
    private final b f40921S;

    /* renamed from: T, reason: collision with root package name */
    private final C3293z f40922T;

    /* renamed from: U, reason: collision with root package name */
    private final f0<C3293z> f40923U;

    /* renamed from: V, reason: collision with root package name */
    private final Ab.g f40924V;

    /* renamed from: W, reason: collision with root package name */
    private final a0 f40925W;

    /* renamed from: X, reason: collision with root package name */
    private final Sa.h f40926X;

    /* renamed from: Y, reason: collision with root package name */
    private final Gb.i<List<m0>> f40927Y;

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: eb.n$a */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: eb.n$b */
    final class b extends AbstractC1073b {

        /* renamed from: d, reason: collision with root package name */
        private final Gb.i<List<m0>> f40928d;

        public b() {
            super(C3282n.this.f40915M.e());
            this.f40928d = C3282n.this.f40915M.e().g(new C3283o(C3282n.this));
        }

        private final Hb.U L() {
            qb.c cVarB;
            ArrayList arrayList;
            qb.c cVarM = M();
            if (cVarM == null || cVarM.d() || !cVarM.i(Oa.p.f13399z)) {
                cVarM = null;
            }
            if (cVarM == null) {
                cVarB = C1958r.f20267a.b(C5087e.o(C3282n.this));
                if (cVarB == null) {
                    return null;
                }
            } else {
                cVarB = cVarM;
            }
            InterfaceC1692e interfaceC1692eB = C5087e.B(C3282n.this.f40915M.d(), cVarB, Za.d.f19643T);
            if (interfaceC1692eB == null) {
                return null;
            }
            int size = interfaceC1692eB.l().getParameters().size();
            List<m0> parameters = C3282n.this.l().getParameters();
            C3862t.f(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                List<m0> list = parameters;
                arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new G0(Q0.f5693F, ((m0) it.next()).u()));
                }
            } else {
                if (size2 != 1 || size <= 1 || cVarM != null) {
                    return null;
                }
                G0 g02 = new G0(Q0.f5693F, ((m0) kotlin.collections.r.J0(parameters)).u());
                Ha.f fVar = new Ha.f(1, size);
                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(fVar, 10));
                Iterator<Integer> it2 = fVar.iterator();
                while (it2.hasNext()) {
                    ((kotlin.collections.J) it2).b();
                    arrayList2.add(g02);
                }
                arrayList = arrayList2;
            }
            return Hb.X.h(u0.f5791C.j(), interfaceC1692eB, arrayList);
        }

        private final qb.c M() {
            String strB;
            Sa.h annotations = C3282n.this.getAnnotations();
            qb.c PURELY_IMPLEMENTS_ANNOTATION = C1928I.f20156r;
            C3862t.f(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            Sa.c cVarO = annotations.o(PURELY_IMPLEMENTS_ANNOTATION);
            if (cVarO == null) {
                return null;
            }
            Object objK0 = kotlin.collections.r.K0(cVarO.b().values());
            vb.y yVar = objK0 instanceof vb.y ? (vb.y) objK0 : null;
            if (yVar == null || (strB = yVar.b()) == null || !qb.e.e(strB)) {
                return null;
            }
            return new qb.c(strB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List N(C3282n c3282n) {
            return q0.g(c3282n);
        }

        @Override // Hb.AbstractC1110w, Hb.y0
        /* renamed from: J */
        public InterfaceC1692e t() {
            return C3282n.this;
        }

        @Override // Hb.y0
        public List<m0> getParameters() {
            return this.f40928d.invoke();
        }

        @Override // Hb.AbstractC1103q
        protected Collection<Hb.U> n() {
            Collection<InterfaceC3517j> collectionS = C3282n.this.T0().s();
            ArrayList arrayList = new ArrayList(collectionS.size());
            ArrayList<InterfaceC3531x> arrayList2 = new ArrayList(0);
            Hb.U uL = L();
            Iterator<InterfaceC3517j> it = collectionS.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC3517j next = it.next();
                Hb.U uQ = C3282n.this.f40915M.a().r().q(C3282n.this.f40915M.g().p(next, C3355b.b(L0.f5677B, false, false, null, 7, null)), C3282n.this.f40915M);
                if (uQ.O0().t() instanceof M.b) {
                    arrayList2.add(next);
                }
                if (!C3862t.b(uQ.O0(), uL != null ? uL.O0() : null) && !Oa.j.b0(uQ)) {
                    arrayList.add(uQ);
                }
            }
            InterfaceC1692e interfaceC1692e = C3282n.this.f40914L;
            Rb.a.a(arrayList, interfaceC1692e != null ? Qa.y.a(interfaceC1692e, C3282n.this).c().p(interfaceC1692e.u(), Q0.f5693F) : null);
            Rb.a.a(arrayList, uL);
            if (!arrayList2.isEmpty()) {
                InterfaceC1016w interfaceC1016wC = C3282n.this.f40915M.a().c();
                InterfaceC1692e interfaceC1692eT = t();
                ArrayList arrayList3 = new ArrayList(kotlin.collections.r.x(arrayList2, 10));
                for (InterfaceC3531x interfaceC3531x : arrayList2) {
                    C3862t.e(interfaceC3531x, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((InterfaceC3517j) interfaceC3531x).p());
                }
                interfaceC1016wC.a(interfaceC1692eT, arrayList3);
            }
            return !arrayList.isEmpty() ? kotlin.collections.r.W0(arrayList) : kotlin.collections.r.e(C3282n.this.f40915M.d().q().i());
        }

        public String toString() {
            String strJ = C3282n.this.getName().j();
            C3862t.f(strJ, "asString(...)");
            return strJ;
        }

        @Override // Hb.y0
        public boolean u() {
            return true;
        }

        @Override // Hb.AbstractC1103q
        protected k0 w() {
            return C3282n.this.f40915M.a().v();
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: eb.n$c */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C4370a.d(C5087e.o((InterfaceC1692e) t10).b(), C5087e.o((InterfaceC1692e) t11).b());
        }
    }

    public /* synthetic */ C3282n(C3096k c3096k, InterfaceC1700m interfaceC1700m, InterfaceC3514g interfaceC3514g, InterfaceC1692e interfaceC1692e, int i10, C3854k c3854k) {
        this(c3096k, interfaceC1700m, interfaceC3514g, (i10 & 8) != 0 ? null : interfaceC1692e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List R0(C3282n c3282n) {
        List<InterfaceC3532y> typeParameters = c3282n.f40913K.getTypeParameters();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(typeParameters, 10));
        for (InterfaceC3532y interfaceC3532y : typeParameters) {
            m0 m0VarA = c3282n.f40915M.f().a(interfaceC3532y);
            if (m0VarA == null) {
                throw new AssertionError("Parameter " + interfaceC3532y + " surely belongs to class " + c3282n.f40913K + ", so it must be resolved");
            }
            arrayList.add(m0VarA);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List X0(C3282n c3282n) {
        qb.b bVarN = C5087e.n(c3282n);
        if (bVarN != null) {
            return c3282n.f40912J.a().f().a(bVarN);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3293z Y0(C3282n c3282n, Ib.g it) {
        C3862t.g(it, "it");
        return new C3293z(c3282n.f40915M, c3282n, c3282n.f40913K, c3282n.f40914L != null, c3282n.f40922T);
    }

    @Override // Ra.InterfaceC1692e
    public boolean C() {
        return false;
    }

    @Override // Ra.D
    public boolean D0() {
        return false;
    }

    @Override // Ra.InterfaceC1692e
    public Collection<InterfaceC1692e> J() {
        if (this.f40918P != Ra.E.f15107D) {
            return kotlin.collections.r.m();
        }
        C3354a c3354aB = C3355b.b(L0.f5678C, false, false, null, 7, null);
        Tb.h<InterfaceC3517j> hVarN = this.f40913K.N();
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC3517j> it = hVarN.iterator();
        while (it.hasNext()) {
            InterfaceC1695h interfaceC1695hT = this.f40915M.g().p(it.next(), c3354aB).O0().t();
            InterfaceC1692e interfaceC1692e = interfaceC1695hT instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hT : null;
            if (interfaceC1692e != null) {
                arrayList.add(interfaceC1692e);
            }
        }
        return kotlin.collections.r.O0(arrayList, new c());
    }

    @Override // Ra.InterfaceC1692e
    public boolean J0() {
        return false;
    }

    @Override // Ra.D
    public boolean K() {
        return false;
    }

    @Override // Ra.InterfaceC1696i
    public boolean L() {
        return this.f40920R;
    }

    @Override // Ra.InterfaceC1692e
    public InterfaceC1691d P() {
        return null;
    }

    @Override // Ra.InterfaceC1692e
    public Ab.k Q() {
        return this.f40925W;
    }

    public final C3282n Q0(InterfaceC2284j javaResolverCache, InterfaceC1692e interfaceC1692e) {
        C3862t.g(javaResolverCache, "javaResolverCache");
        C3096k c3096k = this.f40915M;
        C3096k c3096kM = C3088c.m(c3096k, c3096k.a().x(javaResolverCache));
        InterfaceC1700m interfaceC1700mC = c();
        C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
        return new C3282n(c3096kM, interfaceC1700mC, this.f40913K, interfaceC1692e);
    }

    @Override // Ra.InterfaceC1692e
    public InterfaceC1692e S() {
        return null;
    }

    @Override // Ra.InterfaceC1692e
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC1691d> n() {
        return this.f40922T.a1().invoke();
    }

    public final InterfaceC3514g T0() {
        return this.f40913K;
    }

    public final List<InterfaceC3508a> U0() {
        return (List) this.f40916N.getValue();
    }

    @Override // Ua.AbstractC1762a, Ra.InterfaceC1692e
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C3293z C0() {
        Ab.k kVarC0 = super.C0();
        C3862t.e(kVarC0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (C3293z) kVarC0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ua.z
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public C3293z z0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (C3293z) this.f40923U.c(kotlinTypeRefiner);
    }

    @Override // Sa.a
    public Sa.h getAnnotations() {
        return this.f40926X;
    }

    @Override // Ra.InterfaceC1692e, Ra.D, Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        if (!C3862t.b(this.f40919Q, C1706t.f15166a) || this.f40913K.h() != null) {
            return C1940V.d(this.f40919Q);
        }
        AbstractC1707u abstractC1707u = ab.y.f20282a;
        C3862t.d(abstractC1707u);
        return abstractC1707u;
    }

    @Override // Ra.InterfaceC1692e
    public EnumC1693f i() {
        return this.f40917O;
    }

    @Override // Ra.InterfaceC1692e
    public boolean isInline() {
        return false;
    }

    @Override // Ra.InterfaceC1695h
    public y0 l() {
        return this.f40921S;
    }

    @Override // Ra.InterfaceC1692e, Ra.D
    public Ra.E m() {
        return this.f40918P;
    }

    @Override // Ra.InterfaceC1692e
    public boolean o() {
        return false;
    }

    public String toString() {
        return "Lazy Java class " + C5087e.p(this);
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1696i
    public List<m0> w() {
        return this.f40927Y.invoke();
    }

    @Override // Ua.AbstractC1762a, Ra.InterfaceC1692e
    public Ab.k x0() {
        return this.f40924V;
    }

    @Override // Ra.InterfaceC1692e
    public boolean y() {
        return false;
    }

    @Override // Ra.InterfaceC1692e
    public r0<AbstractC1082f0> y0() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3282n(C3096k outerContext, InterfaceC1700m containingDeclaration, InterfaceC3514g jClass, InterfaceC1692e interfaceC1692e) {
        Ra.E eA;
        super(outerContext.e(), containingDeclaration, jClass.getName(), outerContext.a().t().a(jClass), false);
        C3862t.g(outerContext, "outerContext");
        C3862t.g(containingDeclaration, "containingDeclaration");
        C3862t.g(jClass, "jClass");
        this.f40912J = outerContext;
        this.f40913K = jClass;
        this.f40914L = interfaceC1692e;
        C3096k c3096kF = C3088c.f(outerContext, this, jClass, 0, 4, null);
        this.f40915M = c3096kF;
        c3096kF.a().h().d(jClass, this);
        jClass.I();
        this.f40916N = C4165j.a(new C3279k(this));
        this.f40917O = jClass.q() ? EnumC1693f.f15147G : jClass.H() ? EnumC1693f.f15144D : jClass.C() ? EnumC1693f.f15145E : EnumC1693f.f15143C;
        if (jClass.q() || jClass.C()) {
            eA = Ra.E.f15106C;
        } else {
            eA = Ra.E.f15105B.a(jClass.E(), jClass.E() || jClass.isAbstract() || jClass.H(), !jClass.isFinal());
        }
        this.f40918P = eA;
        this.f40919Q = jClass.getVisibility();
        this.f40920R = (jClass.h() == null || jClass.g()) ? false : true;
        this.f40921S = new b();
        C3293z c3293z = new C3293z(c3096kF, this, jClass, interfaceC1692e != null, null, 16, null);
        this.f40922T = c3293z;
        this.f40923U = f0.f15152e.a(this, c3096kF.e(), c3096kF.a().k().d(), new C3280l(this));
        this.f40924V = new Ab.g(c3293z);
        this.f40925W = new a0(c3096kF, jClass, this);
        this.f40926X = C3093h.a(c3096kF, jClass);
        this.f40927Y = c3096kF.e().g(new C3281m(this));
    }
}
