package Ua;

import Ab.k;
import Hb.AbstractC1082f0;
import Hb.M0;
import Hb.y0;
import Ra.AbstractC1707u;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import Ra.InterfaceC1703p;
import Ra.h0;
import Ra.l0;
import Ra.m0;
import Ua.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: AbstractTypeAliasDescriptor.kt */
/* renamed from: Ua.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1768g extends AbstractC1775n implements l0 {

    /* renamed from: K, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f17801K = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(AbstractC1768g.class), "constructors", "getConstructors()Ljava/util/Collection;"))};

    /* renamed from: F, reason: collision with root package name */
    private final Gb.n f17802F;

    /* renamed from: G, reason: collision with root package name */
    private final AbstractC1707u f17803G;

    /* renamed from: H, reason: collision with root package name */
    private final Gb.i f17804H;

    /* renamed from: I, reason: collision with root package name */
    private List<? extends m0> f17805I;

    /* renamed from: J, reason: collision with root package name */
    private final a f17806J;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: Ua.g$a */
    public static final class a implements y0 {
        a() {
        }

        @Override // Hb.y0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l0 t() {
            return AbstractC1768g.this;
        }

        @Override // Hb.y0
        public List<m0> getParameters() {
            return AbstractC1768g.this.S0();
        }

        @Override // Hb.y0
        public Oa.j q() {
            return C5087e.m(t());
        }

        @Override // Hb.y0
        public y0 r(Ib.g kotlinTypeRefiner) {
            C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // Hb.y0
        public Collection<Hb.U> s() {
            Collection<Hb.U> collectionS = t().e0().O0().s();
            C3862t.f(collectionS, "getSupertypes(...)");
            return collectionS;
        }

        public String toString() {
            return "[typealias " + t().getName().j() + ']';
        }

        @Override // Hb.y0
        public boolean u() {
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1768g(Gb.n storageManager, InterfaceC1700m containingDeclaration, Sa.h annotations, qb.f name, h0 sourceElement, AbstractC1707u visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        C3862t.g(storageManager, "storageManager");
        C3862t.g(containingDeclaration, "containingDeclaration");
        C3862t.g(annotations, "annotations");
        C3862t.g(name, "name");
        C3862t.g(sourceElement, "sourceElement");
        C3862t.g(visibilityImpl, "visibilityImpl");
        this.f17802F = storageManager;
        this.f17803G = visibilityImpl;
        this.f17804H = storageManager.g(new C1765d(this));
        this.f17806J = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1082f0 O0(AbstractC1768g abstractC1768g, Ib.g gVar) {
        InterfaceC1695h interfaceC1695hF = gVar.f(abstractC1768g);
        if (interfaceC1695hF != null) {
            return interfaceC1695hF.u();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection P0(AbstractC1768g abstractC1768g) {
        return abstractC1768g.R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean U0(Ua.AbstractC1768g r1, Hb.P0 r2) {
        /*
            kotlin.jvm.internal.C3862t.d(r2)
            boolean r0 = Hb.Y.a(r2)
            if (r0 != 0) goto L23
            Hb.y0 r2 = r2.O0()
            Ra.h r2 = r2.t()
            boolean r0 = r2 instanceof Ra.m0
            if (r0 == 0) goto L23
            Ra.m0 r2 = (Ra.m0) r2
            Ra.m r2 = r2.c()
            boolean r1 = kotlin.jvm.internal.C3862t.b(r2, r1)
            if (r1 != 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.AbstractC1768g.U0(Ua.g, Hb.P0):java.lang.Boolean");
    }

    @Override // Ra.D
    public boolean D0() {
        return false;
    }

    @Override // Ra.D
    public boolean K() {
        return false;
    }

    @Override // Ra.InterfaceC1696i
    public boolean L() {
        return M0.c(e0(), new C1766e(this));
    }

    protected final AbstractC1082f0 N0() {
        Ab.k kVarC0;
        InterfaceC1692e interfaceC1692eT = t();
        if (interfaceC1692eT == null || (kVarC0 = interfaceC1692eT.C0()) == null) {
            kVarC0 = k.b.f1150b;
        }
        AbstractC1082f0 abstractC1082f0V = M0.v(this, kVarC0, new C1767f(this));
        C3862t.f(abstractC1082f0V, "makeUnsubstitutedType(...)");
        return abstractC1082f0V;
    }

    @Override // Ua.AbstractC1775n, Ua.AbstractC1774m, Ra.InterfaceC1700m
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public l0 b() {
        InterfaceC1703p interfaceC1703pB = super.b();
        C3862t.e(interfaceC1703pB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (l0) interfaceC1703pB;
    }

    public final Collection<Q> R0() {
        InterfaceC1692e interfaceC1692eT = t();
        if (interfaceC1692eT == null) {
            return kotlin.collections.r.m();
        }
        Collection<InterfaceC1691d> collectionN = interfaceC1692eT.n();
        C3862t.f(collectionN, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1691d interfaceC1691d : collectionN) {
            T.a aVar = T.f17768j0;
            Gb.n nVar = this.f17802F;
            C3862t.d(interfaceC1691d);
            Q qB = aVar.b(nVar, this, interfaceC1691d);
            if (qB != null) {
                arrayList.add(qB);
            }
        }
        return arrayList;
    }

    protected abstract List<m0> S0();

    public final void T0(List<? extends m0> declaredTypeParameters) {
        C3862t.g(declaredTypeParameters, "declaredTypeParameters");
        this.f17805I = declaredTypeParameters;
    }

    protected final Gb.n f0() {
        return this.f17802F;
    }

    @Override // Ra.D, Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        return this.f17803G;
    }

    @Override // Ra.D
    public boolean isExternal() {
        return false;
    }

    @Override // Ra.InterfaceC1695h
    public y0 l() {
        return this.f17806J;
    }

    @Override // Ua.AbstractC1774m
    public String toString() {
        return "typealias " + getName().j();
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> visitor, D d10) {
        C3862t.g(visitor, "visitor");
        return visitor.c(this, d10);
    }

    @Override // Ra.InterfaceC1696i
    public List<m0> w() {
        List list = this.f17805I;
        if (list != null) {
            return list;
        }
        C3862t.u("declaredTypeParametersImpl");
        return null;
    }
}
