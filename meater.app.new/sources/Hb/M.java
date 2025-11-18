package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes3.dex */
public final class M extends K implements N0 {

    /* renamed from: E, reason: collision with root package name */
    private final K f5681E;

    /* renamed from: F, reason: collision with root package name */
    private final U f5682F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(K origin, U enhancement) {
        super(origin.W0(), origin.X0());
        C3862t.g(origin, "origin");
        C3862t.g(enhancement, "enhancement");
        this.f5681E = origin;
        this.f5682F = enhancement;
    }

    @Override // Hb.N0
    public U H() {
        return this.f5682F;
    }

    @Override // Hb.P0
    public P0 S0(boolean z10) {
        return O0.d(E0().S0(z10), H().R0().S0(z10));
    }

    @Override // Hb.P0
    public P0 U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return O0.d(E0().U0(newAttributes), H());
    }

    @Override // Hb.K
    public AbstractC1082f0 V0() {
        return E0().V0();
    }

    @Override // Hb.K
    public String Y0(sb.n renderer, sb.w options) {
        C3862t.g(renderer, "renderer");
        C3862t.g(options, "options");
        return options.g() ? renderer.U(H()) : E0().Y0(renderer, options);
    }

    @Override // Hb.N0
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public K E0() {
        return this.f5681E;
    }

    @Override // Hb.P0
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public M Y0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        U uA = kotlinTypeRefiner.a(E0());
        C3862t.e(uA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new M((K) uA, kotlinTypeRefiner.a(H()));
    }

    @Override // Hb.K
    public String toString() {
        return "[@EnhancedForWarnings(" + H() + ")] " + E0();
    }
}
