package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: TypeWithEnhancement.kt */
/* renamed from: Hb.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1088i0 extends B implements N0 {

    /* renamed from: C, reason: collision with root package name */
    private final AbstractC1082f0 f5754C;

    /* renamed from: D, reason: collision with root package name */
    private final U f5755D;

    public C1088i0(AbstractC1082f0 delegate, U enhancement) {
        C3862t.g(delegate, "delegate");
        C3862t.g(enhancement, "enhancement");
        this.f5754C = delegate;
        this.f5755D = enhancement;
    }

    @Override // Hb.N0
    public U H() {
        return this.f5755D;
    }

    @Override // Hb.P0
    /* renamed from: V0 */
    public AbstractC1082f0 S0(boolean z10) {
        P0 p0D = O0.d(E0().S0(z10), H().R0().S0(z10));
        C3862t.e(p0D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC1082f0) p0D;
    }

    @Override // Hb.P0
    /* renamed from: W0 */
    public AbstractC1082f0 U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        P0 p0D = O0.d(E0().U0(newAttributes), H());
        C3862t.e(p0D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC1082f0) p0D;
    }

    @Override // Hb.B
    protected AbstractC1082f0 X0() {
        return this.f5754C;
    }

    @Override // Hb.N0
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 E0() {
        return X0();
    }

    @Override // Hb.B
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C1088i0 Y0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        U uA = kotlinTypeRefiner.a(X0());
        C3862t.e(uA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C1088i0((AbstractC1082f0) uA, kotlinTypeRefiner.a(H()));
    }

    @Override // Hb.B
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C1088i0 Z0(AbstractC1082f0 delegate) {
        C3862t.g(delegate, "delegate");
        return new C1088i0(delegate, H());
    }

    @Override // Hb.AbstractC1082f0
    public String toString() {
        return "[@EnhancedForWarnings(" + H() + ")] " + E0();
    }
}
