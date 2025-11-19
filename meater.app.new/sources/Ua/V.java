package Ua;

import Hb.J0;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import Ra.h0;
import Ra.t0;
import Ra.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;
import vb.AbstractC4943g;

/* compiled from: ValueParameterDescriptorImpl.kt */
/* loaded from: classes3.dex */
public class V extends X implements t0 {

    /* renamed from: M, reason: collision with root package name */
    public static final a f17777M = new a(null);

    /* renamed from: G, reason: collision with root package name */
    private final int f17778G;

    /* renamed from: H, reason: collision with root package name */
    private final boolean f17779H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f17780I;

    /* renamed from: J, reason: collision with root package name */
    private final boolean f17781J;

    /* renamed from: K, reason: collision with root package name */
    private final Hb.U f17782K;

    /* renamed from: L, reason: collision with root package name */
    private final t0 f17783L;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final V a(InterfaceC1688a containingDeclaration, t0 t0Var, int i10, Sa.h annotations, qb.f name, Hb.U outType, boolean z10, boolean z11, boolean z12, Hb.U u10, h0 source, Ba.a<? extends List<? extends u0>> aVar) {
            C3862t.g(containingDeclaration, "containingDeclaration");
            C3862t.g(annotations, "annotations");
            C3862t.g(name, "name");
            C3862t.g(outType, "outType");
            C3862t.g(source, "source");
            return aVar == null ? new V(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, u10, source) : new b(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, u10, source, aVar);
        }

        private a() {
        }
    }

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class b extends V {

        /* renamed from: N, reason: collision with root package name */
        private final InterfaceC4164i f17784N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1688a containingDeclaration, t0 t0Var, int i10, Sa.h annotations, qb.f name, Hb.U outType, boolean z10, boolean z11, boolean z12, Hb.U u10, h0 source, Ba.a<? extends List<? extends u0>> destructuringVariables) {
            super(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, u10, source);
            C3862t.g(containingDeclaration, "containingDeclaration");
            C3862t.g(annotations, "annotations");
            C3862t.g(name, "name");
            C3862t.g(outType, "outType");
            C3862t.g(source, "source");
            C3862t.g(destructuringVariables, "destructuringVariables");
            this.f17784N = C4165j.a(destructuringVariables);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List P0(b bVar) {
            return bVar.Q0();
        }

        public final List<u0> Q0() {
            return (List) this.f17784N.getValue();
        }

        @Override // Ua.V, Ra.t0
        public t0 t0(InterfaceC1688a newOwner, qb.f newName, int i10) {
            C3862t.g(newOwner, "newOwner");
            C3862t.g(newName, "newName");
            Sa.h annotations = getAnnotations();
            C3862t.f(annotations, "<get-annotations>(...)");
            Hb.U uA = a();
            C3862t.f(uA, "getType(...)");
            boolean zR0 = r0();
            boolean Z10 = Z();
            boolean zW = W();
            Hb.U uI0 = i0();
            h0 NO_SOURCE = h0.f15158a;
            C3862t.f(NO_SOURCE, "NO_SOURCE");
            return new b(newOwner, null, i10, annotations, newName, uA, zR0, Z10, zW, uI0, NO_SOURCE, new W(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(InterfaceC1688a containingDeclaration, t0 t0Var, int i10, Sa.h annotations, qb.f name, Hb.U outType, boolean z10, boolean z11, boolean z12, Hb.U u10, h0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        C3862t.g(containingDeclaration, "containingDeclaration");
        C3862t.g(annotations, "annotations");
        C3862t.g(name, "name");
        C3862t.g(outType, "outType");
        C3862t.g(source, "source");
        this.f17778G = i10;
        this.f17779H = z10;
        this.f17780I = z11;
        this.f17781J = z12;
        this.f17782K = u10;
        this.f17783L = t0Var == null ? this : t0Var;
    }

    public static final V L0(InterfaceC1688a interfaceC1688a, t0 t0Var, int i10, Sa.h hVar, qb.f fVar, Hb.U u10, boolean z10, boolean z11, boolean z12, Hb.U u11, h0 h0Var, Ba.a<? extends List<? extends u0>> aVar) {
        return f17777M.a(interfaceC1688a, t0Var, i10, hVar, fVar, u10, z10, z11, z12, u11, h0Var, aVar);
    }

    public Void M0() {
        return null;
    }

    @Override // Ra.j0
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public t0 d(J0 substitutor) {
        C3862t.g(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // Ra.u0
    public /* bridge */ /* synthetic */ AbstractC4943g V() {
        return (AbstractC4943g) M0();
    }

    @Override // Ra.t0
    public boolean W() {
        return this.f17781J;
    }

    @Override // Ra.t0
    public boolean Z() {
        return this.f17780I;
    }

    @Override // Ra.InterfaceC1688a
    public Collection<t0> g() {
        Collection<? extends InterfaceC1688a> collectionG = c().g();
        C3862t.f(collectionG, "getOverriddenDescriptors(...)");
        Collection<? extends InterfaceC1688a> collection = collectionG;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC1688a) it.next()).k().get(getIndex()));
        }
        return arrayList;
    }

    @Override // Ra.t0
    public int getIndex() {
        return this.f17778G;
    }

    @Override // Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        AbstractC1707u LOCAL = C1706t.f15171f;
        C3862t.f(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // Ra.u0
    public boolean h0() {
        return false;
    }

    @Override // Ra.t0
    public Hb.U i0() {
        return this.f17782K;
    }

    @Override // Ra.t0
    public boolean r0() {
        if (this.f17779H) {
            InterfaceC1688a interfaceC1688aC = c();
            C3862t.e(interfaceC1688aC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((InterfaceC1689b) interfaceC1688aC).i().c()) {
                return true;
            }
        }
        return false;
    }

    @Override // Ra.t0
    public t0 t0(InterfaceC1688a newOwner, qb.f newName, int i10) {
        C3862t.g(newOwner, "newOwner");
        C3862t.g(newName, "newName");
        Sa.h annotations = getAnnotations();
        C3862t.f(annotations, "<get-annotations>(...)");
        Hb.U uA = a();
        C3862t.f(uA, "getType(...)");
        boolean zR0 = r0();
        boolean Z10 = Z();
        boolean zW = W();
        Hb.U uI0 = i0();
        h0 NO_SOURCE = h0.f15158a;
        C3862t.f(NO_SOURCE, "NO_SOURCE");
        return new V(newOwner, null, i10, annotations, newName, uA, zR0, Z10, zW, uI0, NO_SOURCE);
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> visitor, D d10) {
        C3862t.g(visitor, "visitor");
        return visitor.e(this, d10);
    }

    @Override // Ua.AbstractC1775n, Ra.InterfaceC1700m
    public InterfaceC1688a c() {
        InterfaceC1700m interfaceC1700mC = super.c();
        C3862t.e(interfaceC1700mC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC1688a) interfaceC1700mC;
    }

    @Override // Ua.AbstractC1775n, Ua.AbstractC1774m, Ra.InterfaceC1700m
    public t0 b() {
        t0 t0Var = this.f17783L;
        return t0Var == this ? this : t0Var.b();
    }
}
