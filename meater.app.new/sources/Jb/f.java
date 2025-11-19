package Jb;

import Hb.J0;
import Hb.U;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.E;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import Ra.InterfaceC1709w;
import Ra.Y;
import Ra.Z;
import Ra.a0;
import Ra.b0;
import Ra.c0;
import Ra.h0;
import Ra.m0;
import Ra.t0;
import Ua.K;
import java.util.Collection;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import vb.AbstractC4943g;

/* compiled from: ErrorPropertyDescriptor.kt */
/* loaded from: classes3.dex */
public final class f implements Z {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ K f7677B;

    public f() {
        l lVar = l.f7791a;
        K kP0 = K.P0(lVar.h(), Sa.h.f15630e.b(), E.f15108E, C1706t.f15170e, true, qb.f.w(b.f7663G.j()), InterfaceC1689b.a.DECLARATION, h0.f15158a, false, false, false, false, false, false);
        kP0.c1(lVar.k(), r.m(), null, null, r.m());
        this.f7677B = kP0;
    }

    @Override // Ra.D
    public boolean D0() {
        return this.f7677B.D0();
    }

    @Override // Ra.InterfaceC1688a
    public boolean F() {
        return this.f7677B.F();
    }

    @Override // Ra.D
    public boolean K() {
        return this.f7677B.K();
    }

    @Override // Ra.v0
    public boolean N() {
        return this.f7677B.N();
    }

    @Override // Ra.u0
    public AbstractC4943g<?> V() {
        return this.f7677B.V();
    }

    @Override // Ra.s0
    public U a() {
        U uA = this.f7677B.a();
        C3862t.f(uA, "getType(...)");
        return uA;
    }

    @Override // Ra.InterfaceC1689b
    public InterfaceC1689b a0(InterfaceC1700m interfaceC1700m, E e10, AbstractC1707u abstractC1707u, InterfaceC1689b.a aVar, boolean z10) {
        Z zO0 = this.f7677B.a0(interfaceC1700m, e10, abstractC1707u, aVar, z10);
        C3862t.f(zO0, "copy(...)");
        return zO0;
    }

    @Override // Ra.InterfaceC1700m
    /* renamed from: b */
    public Z L0() {
        Z zL0 = this.f7677B.L0();
        C3862t.f(zL0, "getOriginal(...)");
        return zL0;
    }

    @Override // Ra.InterfaceC1701n, Ra.InterfaceC1700m
    public InterfaceC1700m c() {
        InterfaceC1700m interfaceC1700mC = this.f7677B.c();
        C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
        return interfaceC1700mC;
    }

    @Override // Ra.j0
    public Z d(J0 substitutor) {
        C3862t.g(substitutor, "substitutor");
        return this.f7677B.d(substitutor);
    }

    @Override // Ra.InterfaceC1688a
    public c0 d0() {
        return this.f7677B.d0();
    }

    @Override // Ra.Z
    public a0 e() {
        return this.f7677B.e();
    }

    @Override // Ra.Z, Ra.InterfaceC1689b, Ra.InterfaceC1688a
    public Collection<? extends Z> g() {
        Collection<? extends Z> collectionG = this.f7677B.g();
        C3862t.f(collectionG, "getOverriddenDescriptors(...)");
        return collectionG;
    }

    @Override // Ra.InterfaceC1688a
    public <V> V g0(InterfaceC1688a.InterfaceC0222a<V> interfaceC0222a) {
        return (V) this.f7677B.g0(interfaceC0222a);
    }

    @Override // Sa.a
    public Sa.h getAnnotations() {
        Sa.h annotations = this.f7677B.getAnnotations();
        C3862t.f(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // Ra.J
    public qb.f getName() {
        qb.f name = this.f7677B.getName();
        C3862t.f(name, "getName(...)");
        return name;
    }

    @Override // Ra.InterfaceC1688a
    public U getReturnType() {
        return this.f7677B.getReturnType();
    }

    @Override // Ra.InterfaceC1688a
    public List<m0> getTypeParameters() {
        List<m0> typeParameters = this.f7677B.getTypeParameters();
        C3862t.f(typeParameters, "getTypeParameters(...)");
        return typeParameters;
    }

    @Override // Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        AbstractC1707u visibility = this.f7677B.getVisibility();
        C3862t.f(visibility, "getVisibility(...)");
        return visibility;
    }

    @Override // Ra.Z
    public b0 h() {
        return this.f7677B.h();
    }

    @Override // Ra.u0
    public boolean h0() {
        return this.f7677B.h0();
    }

    @Override // Ra.InterfaceC1689b
    public InterfaceC1689b.a i() {
        InterfaceC1689b.a aVarI = this.f7677B.i();
        C3862t.f(aVarI, "getKind(...)");
        return aVarI;
    }

    @Override // Ra.D
    public boolean isExternal() {
        return this.f7677B.isExternal();
    }

    @Override // Ra.InterfaceC1703p
    public h0 j() {
        h0 h0VarJ = this.f7677B.j();
        C3862t.f(h0VarJ, "getSource(...)");
        return h0VarJ;
    }

    @Override // Ra.InterfaceC1688a
    public c0 j0() {
        return this.f7677B.j0();
    }

    @Override // Ra.InterfaceC1688a
    public List<t0> k() {
        List<t0> listK = this.f7677B.k();
        C3862t.f(listK, "getValueParameters(...)");
        return listK;
    }

    @Override // Ra.Z
    public InterfaceC1709w k0() {
        return this.f7677B.k0();
    }

    @Override // Ra.D
    public E m() {
        E eM = this.f7677B.m();
        C3862t.f(eM, "getModality(...)");
        return eM;
    }

    @Override // Ra.Z
    public InterfaceC1709w n0() {
        return this.f7677B.n0();
    }

    @Override // Ra.InterfaceC1688a
    public List<c0> o0() {
        List<c0> listO0 = this.f7677B.o0();
        C3862t.f(listO0, "getContextReceiverParameters(...)");
        return listO0;
    }

    @Override // Ra.u0
    public boolean p0() {
        return this.f7677B.p0();
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return (R) this.f7677B.v0(interfaceC1702o, d10);
    }

    @Override // Ra.InterfaceC1689b
    public void w0(Collection<? extends InterfaceC1689b> overriddenDescriptors) {
        C3862t.g(overriddenDescriptors, "overriddenDescriptors");
        this.f7677B.w0(overriddenDescriptors);
    }

    @Override // Ra.Z
    public List<Y> x() {
        List<Y> listX = this.f7677B.x();
        C3862t.f(listX, "getAccessors(...)");
        return listX;
    }

    @Override // Ra.u0
    public boolean z() {
        return this.f7677B.z();
    }
}
