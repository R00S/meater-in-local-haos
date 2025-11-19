package Ra;

import Hb.AbstractC1082f0;
import Hb.Q0;
import Hb.y0;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: typeParameterUtils.kt */
/* renamed from: Ra.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1690c implements m0 {

    /* renamed from: B, reason: collision with root package name */
    private final m0 f15137B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC1700m f15138C;

    /* renamed from: D, reason: collision with root package name */
    private final int f15139D;

    public C1690c(m0 originalDescriptor, InterfaceC1700m declarationDescriptor, int i10) {
        C3862t.g(originalDescriptor, "originalDescriptor");
        C3862t.g(declarationDescriptor, "declarationDescriptor");
        this.f15137B = originalDescriptor;
        this.f15138C = declarationDescriptor;
        this.f15139D = i10;
    }

    @Override // Ra.m0
    public boolean E() {
        return this.f15137B.E();
    }

    @Override // Ra.InterfaceC1701n, Ra.InterfaceC1700m
    public InterfaceC1700m c() {
        return this.f15138C;
    }

    @Override // Ra.m0
    public Gb.n f0() {
        Gb.n nVarF0 = this.f15137B.f0();
        C3862t.f(nVarF0, "getStorageManager(...)");
        return nVarF0;
    }

    @Override // Sa.a
    public Sa.h getAnnotations() {
        return this.f15137B.getAnnotations();
    }

    @Override // Ra.m0
    public int getIndex() {
        return this.f15139D + this.f15137B.getIndex();
    }

    @Override // Ra.J
    public qb.f getName() {
        qb.f name = this.f15137B.getName();
        C3862t.f(name, "getName(...)");
        return name;
    }

    @Override // Ra.m0
    public List<Hb.U> getUpperBounds() {
        List<Hb.U> upperBounds = this.f15137B.getUpperBounds();
        C3862t.f(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // Ra.InterfaceC1703p
    public h0 j() {
        h0 h0VarJ = this.f15137B.j();
        C3862t.f(h0VarJ, "getSource(...)");
        return h0VarJ;
    }

    @Override // Ra.m0, Ra.InterfaceC1695h
    public y0 l() {
        y0 y0VarL = this.f15137B.l();
        C3862t.f(y0VarL, "getTypeConstructor(...)");
        return y0VarL;
    }

    @Override // Ra.m0
    public boolean l0() {
        return true;
    }

    @Override // Ra.m0
    public Q0 p() {
        Q0 q0P = this.f15137B.p();
        C3862t.f(q0P, "getVariance(...)");
        return q0P;
    }

    public String toString() {
        return this.f15137B + "[inner-copy]";
    }

    @Override // Ra.InterfaceC1695h
    public AbstractC1082f0 u() {
        AbstractC1082f0 abstractC1082f0U = this.f15137B.u();
        C3862t.f(abstractC1082f0U, "getDefaultType(...)");
        return abstractC1082f0U;
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return (R) this.f15137B.v0(interfaceC1702o, d10);
    }

    @Override // Ra.InterfaceC1700m
    /* renamed from: b */
    public m0 L0() {
        m0 m0VarB = this.f15137B.L0();
        C3862t.f(m0VarB, "getOriginal(...)");
        return m0VarB;
    }
}
