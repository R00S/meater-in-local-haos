package Ra;

import Ab.k;
import Hb.AbstractC1082f0;
import Hb.C1109v;
import Hb.Q0;
import Ua.AbstractC1771j;
import Ua.C1777p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: NotFoundClasses.kt */
/* loaded from: classes3.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final Gb.n f15117a;

    /* renamed from: b, reason: collision with root package name */
    private final H f15118b;

    /* renamed from: c, reason: collision with root package name */
    private final Gb.g<qb.c, N> f15119c;

    /* renamed from: d, reason: collision with root package name */
    private final Gb.g<a, InterfaceC1692e> f15120d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotFoundClasses.kt */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final qb.b f15121a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Integer> f15122b;

        public a(qb.b classId, List<Integer> typeParametersCount) {
            C3862t.g(classId, "classId");
            C3862t.g(typeParametersCount, "typeParametersCount");
            this.f15121a = classId;
            this.f15122b = typeParametersCount;
        }

        public final qb.b a() {
            return this.f15121a;
        }

        public final List<Integer> b() {
            return this.f15122b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C3862t.b(this.f15121a, aVar.f15121a) && C3862t.b(this.f15122b, aVar.f15122b);
        }

        public int hashCode() {
            return (this.f15121a.hashCode() * 31) + this.f15122b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f15121a + ", typeParametersCount=" + this.f15122b + ')';
        }
    }

    /* compiled from: NotFoundClasses.kt */
    public static final class b extends AbstractC1771j {

        /* renamed from: J, reason: collision with root package name */
        private final boolean f15123J;

        /* renamed from: K, reason: collision with root package name */
        private final List<m0> f15124K;

        /* renamed from: L, reason: collision with root package name */
        private final C1109v f15125L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Gb.n storageManager, InterfaceC1700m container, qb.f name, boolean z10, int i10) {
            super(storageManager, container, name, h0.f15158a, false);
            C3862t.g(storageManager, "storageManager");
            C3862t.g(container, "container");
            C3862t.g(name, "name");
            this.f15123J = z10;
            Ha.f fVarP = Ha.g.p(0, i10);
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(fVarP, 10));
            Iterator<Integer> it = fVarP.iterator();
            while (it.hasNext()) {
                int iB = ((kotlin.collections.J) it).b();
                Sa.h hVarB = Sa.h.f15630e.b();
                Q0 q02 = Q0.f5693F;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(iB);
                arrayList.add(Ua.U.S0(this, hVarB, false, q02, qb.f.t(sb2.toString()), iB, storageManager));
            }
            this.f15124K = arrayList;
            this.f15125L = new C1109v(this, q0.g(this), kotlin.collections.V.c(C5087e.s(this).q().i()), storageManager);
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
            return kotlin.collections.r.m();
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
            return this.f15123J;
        }

        @Override // Ra.InterfaceC1692e
        /* renamed from: L0, reason: merged with bridge method [inline-methods] */
        public k.b Q() {
            return k.b.f1150b;
        }

        @Override // Ra.InterfaceC1695h
        /* renamed from: M0, reason: merged with bridge method [inline-methods] */
        public C1109v l() {
            return this.f15125L;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ua.z
        /* renamed from: N0, reason: merged with bridge method [inline-methods] */
        public k.b z0(Ib.g kotlinTypeRefiner) {
            C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return k.b.f1150b;
        }

        @Override // Ra.InterfaceC1692e
        public InterfaceC1691d P() {
            return null;
        }

        @Override // Ra.InterfaceC1692e
        public InterfaceC1692e S() {
            return null;
        }

        @Override // Sa.a
        public Sa.h getAnnotations() {
            return Sa.h.f15630e.b();
        }

        @Override // Ra.InterfaceC1692e, Ra.D, Ra.InterfaceC1704q
        public AbstractC1707u getVisibility() {
            AbstractC1707u PUBLIC = C1706t.f15170e;
            C3862t.f(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // Ra.InterfaceC1692e
        public EnumC1693f i() {
            return EnumC1693f.f15143C;
        }

        @Override // Ua.AbstractC1771j, Ra.D
        public boolean isExternal() {
            return false;
        }

        @Override // Ra.InterfaceC1692e
        public boolean isInline() {
            return false;
        }

        @Override // Ra.InterfaceC1692e, Ra.D
        public E m() {
            return E.f15106C;
        }

        @Override // Ra.InterfaceC1692e
        public Collection<InterfaceC1691d> n() {
            return kotlin.collections.V.d();
        }

        @Override // Ra.InterfaceC1692e
        public boolean o() {
            return false;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // Ra.InterfaceC1692e, Ra.InterfaceC1696i
        public List<m0> w() {
            return this.f15124K;
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

    public M(Gb.n storageManager, H module) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(module, "module");
        this.f15117a = storageManager;
        this.f15118b = module;
        this.f15119c = storageManager.h(new K(this));
        this.f15120d = storageManager.h(new L(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1692e c(M m10, a aVar) {
        N nInvoke;
        C3862t.g(aVar, "<destruct>");
        qb.b bVarA = aVar.a();
        List<Integer> listB = aVar.b();
        if (bVarA.i()) {
            throw new UnsupportedOperationException("Unresolved local class: " + bVarA);
        }
        qb.b bVarE = bVarA.e();
        if (bVarE == null || (nInvoke = m10.d(bVarE, kotlin.collections.r.d0(listB, 1))) == null) {
            nInvoke = m10.f15119c.invoke(bVarA.f());
        }
        InterfaceC1700m interfaceC1700m = nInvoke;
        boolean zJ = bVarA.j();
        Gb.n nVar = m10.f15117a;
        qb.f fVarH = bVarA.h();
        Integer num = (Integer) kotlin.collections.r.l0(listB);
        return new b(nVar, interfaceC1700m, fVarH, zJ, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N e(M m10, qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return new C1777p(m10.f15118b, fqName);
    }

    public final InterfaceC1692e d(qb.b classId, List<Integer> typeParametersCount) {
        C3862t.g(classId, "classId");
        C3862t.g(typeParametersCount, "typeParametersCount");
        return this.f15120d.invoke(new a(classId, typeParametersCount));
    }
}
