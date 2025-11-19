package Ua;

import Hb.AbstractC1082f0;
import Hb.C1090j0;
import Hb.J0;
import Hb.Q0;
import Ra.AbstractC1707u;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.c0;
import Ra.h0;
import Ra.l0;
import Ra.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import tb.C4596h;

/* compiled from: TypeAliasConstructorDescriptor.kt */
/* loaded from: classes3.dex */
public final class T extends AbstractC1779s implements Q {

    /* renamed from: f0, reason: collision with root package name */
    private final Gb.n f17770f0;

    /* renamed from: g0, reason: collision with root package name */
    private final l0 f17771g0;

    /* renamed from: h0, reason: collision with root package name */
    private final Gb.j f17772h0;

    /* renamed from: i0, reason: collision with root package name */
    private InterfaceC1691d f17773i0;

    /* renamed from: k0, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f17769k0 = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(T.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: j0, reason: collision with root package name */
    public static final a f17768j0 = new a(null);

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final J0 c(l0 l0Var) {
            if (l0Var.t() == null) {
                return null;
            }
            return J0.f(l0Var.U());
        }

        public final Q b(Gb.n storageManager, l0 typeAliasDescriptor, InterfaceC1691d constructor) {
            InterfaceC1691d interfaceC1691dD;
            List<c0> listM;
            C3862t.g(storageManager, "storageManager");
            C3862t.g(typeAliasDescriptor, "typeAliasDescriptor");
            C3862t.g(constructor, "constructor");
            J0 j0C = c(typeAliasDescriptor);
            if (j0C == null || (interfaceC1691dD = constructor.d(j0C)) == null) {
                return null;
            }
            Sa.h annotations = constructor.getAnnotations();
            InterfaceC1689b.a aVarI = constructor.i();
            C3862t.f(aVarI, "getKind(...)");
            h0 h0VarJ = typeAliasDescriptor.j();
            C3862t.f(h0VarJ, "getSource(...)");
            T t10 = new T(storageManager, typeAliasDescriptor, interfaceC1691dD, null, annotations, aVarI, h0VarJ, null);
            List<t0> listP0 = AbstractC1779s.P0(t10, constructor.k(), j0C);
            if (listP0 == null) {
                return null;
            }
            AbstractC1082f0 abstractC1082f0C = Hb.N.c(interfaceC1691dD.getReturnType().R0());
            AbstractC1082f0 abstractC1082f0U = typeAliasDescriptor.u();
            C3862t.f(abstractC1082f0U, "getDefaultType(...)");
            AbstractC1082f0 abstractC1082f0J = C1090j0.j(abstractC1082f0C, abstractC1082f0U);
            c0 c0VarD0 = constructor.d0();
            c0 c0VarI = c0VarD0 != null ? C4596h.i(t10, j0C.n(c0VarD0.a(), Q0.f5693F), Sa.h.f15630e.b()) : null;
            InterfaceC1692e interfaceC1692eT = typeAliasDescriptor.t();
            if (interfaceC1692eT != null) {
                List<c0> listO0 = constructor.o0();
                C3862t.f(listO0, "getContextReceiverParameters(...)");
                List<c0> list = listO0;
                listM = new ArrayList<>(kotlin.collections.r.x(list, 10));
                int i10 = 0;
                for (Object obj : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        kotlin.collections.r.w();
                    }
                    c0 c0Var = (c0) obj;
                    Hb.U uN = j0C.n(c0Var.a(), Q0.f5693F);
                    Bb.g value = c0Var.getValue();
                    C3862t.e(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    listM.add(C4596h.c(interfaceC1692eT, uN, ((Bb.f) value).b(), Sa.h.f15630e.b(), i10));
                    i10 = i11;
                }
            } else {
                listM = kotlin.collections.r.m();
            }
            t10.S0(c0VarI, null, listM, typeAliasDescriptor.w(), listP0, abstractC1082f0J, Ra.E.f15106C, typeAliasDescriptor.getVisibility());
            return t10;
        }

        private a() {
        }
    }

    public /* synthetic */ T(Gb.n nVar, l0 l0Var, InterfaceC1691d interfaceC1691d, Q q10, Sa.h hVar, InterfaceC1689b.a aVar, h0 h0Var, C3854k c3854k) {
        this(nVar, l0Var, interfaceC1691d, q10, hVar, aVar, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T s1(T t10, InterfaceC1691d interfaceC1691d) {
        Gb.n nVar = t10.f17770f0;
        l0 l0VarQ1 = t10.q1();
        Sa.h annotations = interfaceC1691d.getAnnotations();
        InterfaceC1689b.a aVarI = interfaceC1691d.i();
        C3862t.f(aVarI, "getKind(...)");
        h0 h0VarJ = t10.q1().j();
        C3862t.f(h0VarJ, "getSource(...)");
        T t11 = new T(nVar, l0VarQ1, interfaceC1691d, t10, annotations, aVarI, h0VarJ);
        J0 j0C = f17768j0.c(t10.q1());
        if (j0C == null) {
            return null;
        }
        c0 c0VarD0 = interfaceC1691d.d0();
        c0 c0VarD = c0VarD0 != null ? c0VarD0.d(j0C) : null;
        List<c0> listO0 = interfaceC1691d.o0();
        C3862t.f(listO0, "getContextReceiverParameters(...)");
        List<c0> list = listO0;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c0) it.next()).d(j0C));
        }
        t11.S0(null, c0VarD, arrayList, t10.q1().w(), t10.k(), t10.getReturnType(), Ra.E.f15106C, t10.q1().getVisibility());
        return t11;
    }

    @Override // Ra.InterfaceC1699l
    public boolean A() {
        return m0().A();
    }

    @Override // Ra.InterfaceC1699l
    public InterfaceC1692e B() {
        InterfaceC1692e interfaceC1692eB = m0().B();
        C3862t.f(interfaceC1692eB, "getConstructedClass(...)");
        return interfaceC1692eB;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1688a
    public Hb.U getReturnType() {
        Hb.U returnType = super.getReturnType();
        C3862t.d(returnType);
        return returnType;
    }

    @Override // Ua.Q
    public InterfaceC1691d m0() {
        return this.f17773i0;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1689b
    /* renamed from: m1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Q a0(InterfaceC1700m newOwner, Ra.E modality, AbstractC1707u visibility, InterfaceC1689b.a kind, boolean z10) {
        C3862t.g(newOwner, "newOwner");
        C3862t.g(modality, "modality");
        C3862t.g(visibility, "visibility");
        C3862t.g(kind, "kind");
        InterfaceC1712z interfaceC1712zE = v().o(newOwner).m(modality).h(visibility).n(kind).g(z10).e();
        C3862t.e(interfaceC1712zE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (Q) interfaceC1712zE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ua.AbstractC1779s
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public T M0(InterfaceC1700m newOwner, InterfaceC1712z interfaceC1712z, InterfaceC1689b.a kind, qb.f fVar, Sa.h annotations, h0 source) {
        C3862t.g(newOwner, "newOwner");
        C3862t.g(kind, "kind");
        C3862t.g(annotations, "annotations");
        C3862t.g(source, "source");
        InterfaceC1689b.a aVar = InterfaceC1689b.a.DECLARATION;
        if (kind != aVar) {
            InterfaceC1689b.a aVar2 = InterfaceC1689b.a.SYNTHESIZED;
        }
        return new T(this.f17770f0, q1(), m0(), this, annotations, aVar, source);
    }

    @Override // Ua.AbstractC1775n, Ra.InterfaceC1700m
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public l0 c() {
        return q1();
    }

    @Override // Ua.AbstractC1779s, Ua.AbstractC1775n, Ua.AbstractC1774m, Ra.InterfaceC1700m
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public Q b() {
        InterfaceC1712z interfaceC1712zB = super.b();
        C3862t.e(interfaceC1712zB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (Q) interfaceC1712zB;
    }

    public l0 q1() {
        return this.f17771g0;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1712z, Ra.j0
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public Q d(J0 substitutor) {
        C3862t.g(substitutor, "substitutor");
        InterfaceC1712z interfaceC1712zD = super.d(substitutor);
        C3862t.e(interfaceC1712zD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        T t10 = (T) interfaceC1712zD;
        J0 j0F = J0.f(t10.getReturnType());
        C3862t.f(j0F, "create(...)");
        InterfaceC1691d interfaceC1691dD = m0().b().d(j0F);
        if (interfaceC1691dD == null) {
            return null;
        }
        t10.f17773i0 = interfaceC1691dD;
        return t10;
    }

    private T(Gb.n nVar, l0 l0Var, InterfaceC1691d interfaceC1691d, Q q10, Sa.h hVar, InterfaceC1689b.a aVar, h0 h0Var) {
        super(l0Var, q10, hVar, qb.h.f48207j, aVar, h0Var);
        this.f17770f0 = nVar;
        this.f17771g0 = l0Var;
        W0(q1().D0());
        this.f17772h0 = nVar.i(new S(this, interfaceC1691d));
        this.f17773i0 = interfaceC1691d;
    }
}
