package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes3.dex */
public abstract class C extends B {

    /* renamed from: C, reason: collision with root package name */
    private final AbstractC1082f0 f5643C;

    public C(AbstractC1082f0 delegate) {
        C3862t.g(delegate, "delegate");
        this.f5643C = delegate;
    }

    @Override // Hb.P0
    /* renamed from: V0 */
    public AbstractC1082f0 S0(boolean z10) {
        return z10 == P0() ? this : X0().S0(z10).U0(N0());
    }

    @Override // Hb.P0
    /* renamed from: W0 */
    public AbstractC1082f0 U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return newAttributes != N0() ? new C1086h0(this, newAttributes) : this;
    }

    @Override // Hb.B
    protected AbstractC1082f0 X0() {
        return this.f5643C;
    }
}
