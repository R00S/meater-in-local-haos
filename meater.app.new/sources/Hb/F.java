package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: dynamicTypes.kt */
/* loaded from: classes3.dex */
public final class F extends K implements Lb.f {

    /* renamed from: E, reason: collision with root package name */
    private final u0 f5656E;

    /* JADX WARN: Illegal instructions before constructor call */
    public F(Oa.j builtIns, u0 attributes) {
        C3862t.g(builtIns, "builtIns");
        C3862t.g(attributes, "attributes");
        AbstractC1082f0 abstractC1082f0H = builtIns.H();
        C3862t.f(abstractC1082f0H, "getNothingType(...)");
        AbstractC1082f0 abstractC1082f0I = builtIns.I();
        C3862t.f(abstractC1082f0I, "getNullableAnyType(...)");
        super(abstractC1082f0H, abstractC1082f0I);
        this.f5656E = attributes;
    }

    @Override // Hb.K, Hb.U
    public u0 N0() {
        return this.f5656E;
    }

    @Override // Hb.K, Hb.U
    public boolean P0() {
        return false;
    }

    @Override // Hb.K
    public AbstractC1082f0 V0() {
        return X0();
    }

    @Override // Hb.K
    public String Y0(sb.n renderer, sb.w options) {
        C3862t.g(renderer, "renderer");
        C3862t.g(options, "options");
        return "dynamic";
    }

    @Override // Hb.P0
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public F Y0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // Hb.P0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public F U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return new F(Mb.d.n(V0()), newAttributes);
    }

    @Override // Hb.P0
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public F S0(boolean z10) {
        return this;
    }
}
