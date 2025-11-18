package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: SpecialTypes.kt */
/* renamed from: Hb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1071a extends B {

    /* renamed from: C, reason: collision with root package name */
    private final AbstractC1082f0 f5724C;

    /* renamed from: D, reason: collision with root package name */
    private final AbstractC1082f0 f5725D;

    public C1071a(AbstractC1082f0 delegate, AbstractC1082f0 abbreviation) {
        C3862t.g(delegate, "delegate");
        C3862t.g(abbreviation, "abbreviation");
        this.f5724C = delegate;
        this.f5725D = abbreviation;
    }

    public final AbstractC1082f0 U() {
        return X0();
    }

    @Override // Hb.P0
    /* renamed from: W0 */
    public AbstractC1082f0 U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return new C1071a(X0().U0(newAttributes), this.f5725D);
    }

    @Override // Hb.B
    protected AbstractC1082f0 X0() {
        return this.f5724C;
    }

    public final AbstractC1082f0 a1() {
        return this.f5725D;
    }

    @Override // Hb.AbstractC1082f0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C1071a S0(boolean z10) {
        return new C1071a(X0().S0(z10), this.f5725D.S0(z10));
    }

    @Override // Hb.B
    /* renamed from: c1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C1071a Y0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        U uA = kotlinTypeRefiner.a(X0());
        C3862t.e(uA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        U uA2 = kotlinTypeRefiner.a(this.f5725D);
        C3862t.e(uA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C1071a((AbstractC1082f0) uA, (AbstractC1082f0) uA2);
    }

    @Override // Hb.B
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public C1071a Z0(AbstractC1082f0 delegate) {
        C3862t.g(delegate, "delegate");
        return new C1071a(delegate, this.f5725D);
    }
}
