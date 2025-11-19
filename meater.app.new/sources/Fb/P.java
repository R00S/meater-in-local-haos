package Fb;

import Hb.AbstractC1082f0;
import Hb.I0;
import Hb.J0;
import Hb.Q0;
import Hb.U;
import Hb.Y;
import Ra.AbstractC1707u;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.h0;
import Ra.l0;
import Ra.m0;
import Ra.q0;
import Ua.AbstractC1768g;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import lb.C3938r;
import nb.InterfaceC4077c;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes3.dex */
public final class P extends AbstractC1768g implements InterfaceC1038t {

    /* renamed from: L, reason: collision with root package name */
    private final C3938r f4609L;

    /* renamed from: M, reason: collision with root package name */
    private final InterfaceC4077c f4610M;

    /* renamed from: N, reason: collision with root package name */
    private final nb.g f4611N;

    /* renamed from: O, reason: collision with root package name */
    private final nb.h f4612O;

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1037s f4613P;

    /* renamed from: Q, reason: collision with root package name */
    private AbstractC1082f0 f4614Q;

    /* renamed from: R, reason: collision with root package name */
    private AbstractC1082f0 f4615R;

    /* renamed from: S, reason: collision with root package name */
    private List<? extends m0> f4616S;

    /* renamed from: T, reason: collision with root package name */
    private AbstractC1082f0 f4617T;

    /* JADX WARN: Illegal instructions before constructor call */
    public P(Gb.n storageManager, InterfaceC1700m containingDeclaration, Sa.h annotations, qb.f name, AbstractC1707u visibility, C3938r proto, InterfaceC4077c nameResolver, nb.g typeTable, nb.h versionRequirementTable, InterfaceC1037s interfaceC1037s) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(containingDeclaration, "containingDeclaration");
        C3862t.g(annotations, "annotations");
        C3862t.g(name, "name");
        C3862t.g(visibility, "visibility");
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        C3862t.g(versionRequirementTable, "versionRequirementTable");
        h0 NO_SOURCE = h0.f15158a;
        C3862t.f(NO_SOURCE, "NO_SOURCE");
        super(storageManager, containingDeclaration, annotations, name, NO_SOURCE, visibility);
        this.f4609L = proto;
        this.f4610M = nameResolver;
        this.f4611N = typeTable;
        this.f4612O = versionRequirementTable;
        this.f4613P = interfaceC1037s;
    }

    @Override // Fb.InterfaceC1038t
    public nb.g R() {
        return this.f4611N;
    }

    @Override // Ua.AbstractC1768g
    protected List<m0> S0() {
        List list = this.f4616S;
        if (list != null) {
            return list;
        }
        C3862t.u("typeConstructorParameters");
        return null;
    }

    @Override // Ra.l0
    public AbstractC1082f0 U() {
        AbstractC1082f0 abstractC1082f0 = this.f4615R;
        if (abstractC1082f0 != null) {
            return abstractC1082f0;
        }
        C3862t.u("expandedType");
        return null;
    }

    @Override // Fb.InterfaceC1038t
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C3938r D() {
        return this.f4609L;
    }

    public nb.h W0() {
        return this.f4612O;
    }

    public final void X0(List<? extends m0> declaredTypeParameters, AbstractC1082f0 underlyingType, AbstractC1082f0 expandedType) {
        C3862t.g(declaredTypeParameters, "declaredTypeParameters");
        C3862t.g(underlyingType, "underlyingType");
        C3862t.g(expandedType, "expandedType");
        T0(declaredTypeParameters);
        this.f4614Q = underlyingType;
        this.f4615R = expandedType;
        this.f4616S = q0.g(this);
        this.f4617T = N0();
    }

    @Override // Fb.InterfaceC1038t
    public InterfaceC4077c Y() {
        return this.f4610M;
    }

    @Override // Ra.j0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public l0 d(J0 substitutor) {
        C3862t.g(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        Gb.n nVarF0 = f0();
        InterfaceC1700m interfaceC1700mC = c();
        C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
        Sa.h annotations = getAnnotations();
        C3862t.f(annotations, "<get-annotations>(...)");
        qb.f name = getName();
        C3862t.f(name, "getName(...)");
        P p10 = new P(nVarF0, interfaceC1700mC, annotations, name, getVisibility(), D(), Y(), R(), W0(), b0());
        List<m0> listW = w();
        AbstractC1082f0 abstractC1082f0E0 = e0();
        Q0 q02 = Q0.f5693F;
        U uN = substitutor.n(abstractC1082f0E0, q02);
        C3862t.f(uN, "safeSubstitute(...)");
        AbstractC1082f0 abstractC1082f0A = I0.a(uN);
        U uN2 = substitutor.n(U(), q02);
        C3862t.f(uN2, "safeSubstitute(...)");
        p10.X0(listW, abstractC1082f0A, I0.a(uN2));
        return p10;
    }

    @Override // Fb.InterfaceC1038t
    public InterfaceC1037s b0() {
        return this.f4613P;
    }

    @Override // Ra.l0
    public AbstractC1082f0 e0() {
        AbstractC1082f0 abstractC1082f0 = this.f4614Q;
        if (abstractC1082f0 != null) {
            return abstractC1082f0;
        }
        C3862t.u("underlyingType");
        return null;
    }

    @Override // Ra.l0
    public InterfaceC1692e t() {
        if (Y.a(U())) {
            return null;
        }
        InterfaceC1695h interfaceC1695hT = U().O0().t();
        if (interfaceC1695hT instanceof InterfaceC1692e) {
            return (InterfaceC1692e) interfaceC1695hT;
        }
        return null;
    }

    @Override // Ra.InterfaceC1695h
    public AbstractC1082f0 u() {
        AbstractC1082f0 abstractC1082f0 = this.f4617T;
        if (abstractC1082f0 != null) {
            return abstractC1082f0;
        }
        C3862t.u("defaultTypeImpl");
        return null;
    }
}
