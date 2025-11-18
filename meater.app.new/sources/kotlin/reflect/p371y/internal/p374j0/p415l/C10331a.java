package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.a */
/* loaded from: classes3.dex */
public final class C10331a extends AbstractC10382r {

    /* renamed from: g */
    private final AbstractC10368m0 f40037g;

    /* renamed from: h */
    private final AbstractC10368m0 f40038h;

    public C10331a(AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02) {
        C9801m.m32346f(abstractC10368m0, "delegate");
        C9801m.m32346f(abstractC10368m02, "abbreviation");
        this.f40037g = abstractC10368m0;
        this.f40038h = abstractC10368m02;
    }

    /* renamed from: W */
    public final AbstractC10368m0 m36557W() {
        return mo33694X0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: W0 */
    public AbstractC10368m0 mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return new C10331a(mo33694X0().mo33547U0(c10333a1), this.f40038h);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: X0 */
    protected AbstractC10368m0 mo33694X0() {
        return this.f40037g;
    }

    /* renamed from: a1 */
    public final AbstractC10368m0 m36559a1() {
        return this.f40038h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10331a mo33545S0(boolean z) {
        return new C10331a(mo33694X0().mo33545S0(z), this.f40038h.mo33545S0(z));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: c1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C10331a mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        AbstractC10344e0 abstractC10344e0Mo36717a = abstractC10396g.mo36717a(mo33694X0());
        C9801m.m32344d(abstractC10344e0Mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC10344e0 abstractC10344e0Mo36717a2 = abstractC10396g.mo36717a(this.f40038h);
        C9801m.m32344d(abstractC10344e0Mo36717a2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C10331a((AbstractC10368m0) abstractC10344e0Mo36717a, (AbstractC10368m0) abstractC10344e0Mo36717a2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public C10331a mo33695Z0(AbstractC10368m0 abstractC10368m0) {
        C9801m.m32346f(abstractC10368m0, "delegate");
        return new C10331a(abstractC10368m0, this.f40038h);
    }
}
