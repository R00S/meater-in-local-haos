package Pa;

import Ab.k;
import Gb.n;
import Hb.AbstractC1073b;
import Hb.AbstractC1082f0;
import Hb.G0;
import Hb.Q0;
import Hb.U;
import Hb.X;
import Hb.u0;
import Hb.y0;
import Oa.p;
import Pa.f;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.C1711y;
import Ra.E;
import Ra.EnumC1693f;
import Ra.H;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.N;
import Ra.h0;
import Ra.k0;
import Ra.m0;
import Ra.r0;
import Sa.h;
import Ua.AbstractC1762a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.J;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: FunctionClassDescriptor.kt */
/* loaded from: classes3.dex */
public final class b extends AbstractC1762a {

    /* renamed from: O, reason: collision with root package name */
    public static final a f14140O = new a(null);

    /* renamed from: P, reason: collision with root package name */
    private static final qb.b f14141P;

    /* renamed from: Q, reason: collision with root package name */
    private static final qb.b f14142Q;

    /* renamed from: G, reason: collision with root package name */
    private final n f14143G;

    /* renamed from: H, reason: collision with root package name */
    private final N f14144H;

    /* renamed from: I, reason: collision with root package name */
    private final f f14145I;

    /* renamed from: J, reason: collision with root package name */
    private final int f14146J;

    /* renamed from: K, reason: collision with root package name */
    private final C0208b f14147K;

    /* renamed from: L, reason: collision with root package name */
    private final d f14148L;

    /* renamed from: M, reason: collision with root package name */
    private final List<m0> f14149M;

    /* renamed from: N, reason: collision with root package name */
    private final c f14150N;

    /* compiled from: FunctionClassDescriptor.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: FunctionClassDescriptor.kt */
    /* renamed from: Pa.b$b, reason: collision with other inner class name */
    private final class C0208b extends AbstractC1073b {
        public C0208b() {
            super(b.this.f14143G);
        }

        @Override // Hb.AbstractC1110w, Hb.y0
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public b t() {
            return b.this;
        }

        @Override // Hb.y0
        public List<m0> getParameters() {
            return b.this.f14149M;
        }

        @Override // Hb.AbstractC1103q
        protected Collection<U> n() {
            List listP;
            f fVarV0 = b.this.V0();
            f.a aVar = f.a.f14165e;
            if (C3862t.b(fVarV0, aVar)) {
                listP = r.e(b.f14141P);
            } else if (C3862t.b(fVarV0, f.b.f14166e)) {
                listP = r.p(b.f14142Q, new qb.b(p.f13366A, aVar.c(b.this.R0())));
            } else {
                f.d dVar = f.d.f14168e;
                if (C3862t.b(fVarV0, dVar)) {
                    listP = r.e(b.f14141P);
                } else {
                    if (!C3862t.b(fVarV0, f.c.f14167e)) {
                        Sb.a.b(null, 1, null);
                        throw null;
                    }
                    listP = r.p(b.f14142Q, new qb.b(p.f13392s, dVar.c(b.this.R0())));
                }
            }
            H hC = b.this.f14144H.c();
            List<qb.b> list = listP;
            ArrayList arrayList = new ArrayList(r.x(list, 10));
            for (qb.b bVar : list) {
                InterfaceC1692e interfaceC1692eB = C1711y.b(hC, bVar);
                if (interfaceC1692eB == null) {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                List listQ0 = r.Q0(getParameters(), interfaceC1692eB.l().getParameters().size());
                ArrayList arrayList2 = new ArrayList(r.x(listQ0, 10));
                Iterator it = listQ0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new G0(((m0) it.next()).u()));
                }
                arrayList.add(X.h(u0.f5791C.j(), interfaceC1692eB, arrayList2));
            }
            return r.W0(arrayList);
        }

        public String toString() {
            return t().toString();
        }

        @Override // Hb.y0
        public boolean u() {
            return true;
        }

        @Override // Hb.AbstractC1103q
        protected k0 w() {
            return k0.a.f15161a;
        }
    }

    static {
        qb.c cVar = p.f13366A;
        qb.f fVarT = qb.f.t("Function");
        C3862t.f(fVarT, "identifier(...)");
        f14141P = new qb.b(cVar, fVarT);
        qb.c cVar2 = p.f13397x;
        qb.f fVarT2 = qb.f.t("KFunction");
        C3862t.f(fVarT2, "identifier(...)");
        f14142Q = new qb.b(cVar2, fVarT2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n storageManager, N containingDeclaration, f functionTypeKind, int i10) {
        super(storageManager, functionTypeKind.c(i10));
        C3862t.g(storageManager, "storageManager");
        C3862t.g(containingDeclaration, "containingDeclaration");
        C3862t.g(functionTypeKind, "functionTypeKind");
        this.f14143G = storageManager;
        this.f14144H = containingDeclaration;
        this.f14145I = functionTypeKind;
        this.f14146J = i10;
        this.f14147K = new C0208b();
        this.f14148L = new d(storageManager, this);
        ArrayList arrayList = new ArrayList();
        Ha.f fVar = new Ha.f(1, i10);
        ArrayList arrayList2 = new ArrayList(r.x(fVar, 10));
        Iterator<Integer> it = fVar.iterator();
        while (it.hasNext()) {
            int iB = ((J) it).b();
            Q0 q02 = Q0.f5694G;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(iB);
            L0(arrayList, this, q02, sb2.toString());
            arrayList2.add(C4153F.f46609a);
        }
        L0(arrayList, this, Q0.f5695H, "R");
        this.f14149M = r.W0(arrayList);
        this.f14150N = c.f14152B.a(this.f14145I);
    }

    private static final void L0(ArrayList<m0> arrayList, b bVar, Q0 q02, String str) {
        arrayList.add(Ua.U.S0(bVar, h.f15630e.b(), false, q02, qb.f.t(str), arrayList.size(), bVar.f14143G));
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
    public boolean J0() {
        return false;
    }

    @Override // Ra.D
    public boolean K() {
        return false;
    }

    @Override // Ra.InterfaceC1696i
    public boolean L() {
        return false;
    }

    @Override // Ra.InterfaceC1692e
    public /* bridge */ /* synthetic */ InterfaceC1691d P() {
        return (InterfaceC1691d) Z0();
    }

    public final int R0() {
        return this.f14146J;
    }

    @Override // Ra.InterfaceC1692e
    public /* bridge */ /* synthetic */ InterfaceC1692e S() {
        return (InterfaceC1692e) S0();
    }

    public Void S0() {
        return null;
    }

    @Override // Ra.InterfaceC1692e
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC1691d> n() {
        return r.m();
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1701n, Ra.InterfaceC1700m
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public N c() {
        return this.f14144H;
    }

    public final f V0() {
        return this.f14145I;
    }

    @Override // Ra.InterfaceC1692e
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC1692e> J() {
        return r.m();
    }

    @Override // Ra.InterfaceC1692e
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public k.b Q() {
        return k.b.f1150b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ua.z
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public d z0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f14148L;
    }

    public Void Z0() {
        return null;
    }

    @Override // Sa.a
    public h getAnnotations() {
        return h.f15630e.b();
    }

    @Override // Ra.InterfaceC1692e, Ra.D, Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        AbstractC1707u PUBLIC = C1706t.f15170e;
        C3862t.f(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // Ra.InterfaceC1692e
    public EnumC1693f i() {
        return EnumC1693f.f15144D;
    }

    @Override // Ra.D
    public boolean isExternal() {
        return false;
    }

    @Override // Ra.InterfaceC1692e
    public boolean isInline() {
        return false;
    }

    @Override // Ra.InterfaceC1703p
    public h0 j() {
        h0 NO_SOURCE = h0.f15158a;
        C3862t.f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // Ra.InterfaceC1695h
    public y0 l() {
        return this.f14147K;
    }

    @Override // Ra.InterfaceC1692e, Ra.D
    public E m() {
        return E.f15109F;
    }

    @Override // Ra.InterfaceC1692e
    public boolean o() {
        return false;
    }

    public String toString() {
        String strJ = getName().j();
        C3862t.f(strJ, "asString(...)");
        return strJ;
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1696i
    public List<m0> w() {
        return this.f14149M;
    }

    @Override // Ra.InterfaceC1692e
    public boolean y() {
        return false;
    }

    @Override // Ra.InterfaceC1692e
    public r0<AbstractC1082f0> y0() {
        return null;
    }
}
