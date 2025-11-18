package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: TypeWithEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.l.p0 */
/* loaded from: classes3.dex */
public final class C10377p0 extends AbstractC10382r implements InterfaceC10375o1 {

    /* renamed from: g */
    private final AbstractC10368m0 f40162g;

    /* renamed from: h */
    private final AbstractC10344e0 f40163h;

    public C10377p0(AbstractC10368m0 abstractC10368m0, AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10368m0, "delegate");
        C9801m.m32346f(abstractC10344e0, "enhancement");
        this.f40162g = abstractC10368m0;
        this.f40163h = abstractC10344e0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10375o1
    /* renamed from: H */
    public AbstractC10344e0 mo36563H() {
        return this.f40163h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: V0 */
    public AbstractC10368m0 mo33545S0(boolean z) {
        AbstractC10381q1 abstractC10381q1M36806d = C10378p1.m36806d(mo36566v().mo33545S0(z), mo36563H().mo36635R0().mo33545S0(z));
        C9801m.m32344d(abstractC10381q1M36806d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC10368m0) abstractC10381q1M36806d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: W0 */
    public AbstractC10368m0 mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        AbstractC10381q1 abstractC10381q1M36806d = C10378p1.m36806d(mo36566v().mo33547U0(c10333a1), mo36563H());
        C9801m.m32344d(abstractC10381q1M36806d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC10368m0) abstractC10381q1M36806d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: X0 */
    protected AbstractC10368m0 mo33694X0() {
        return this.f40162g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10375o1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public AbstractC10368m0 mo36566v() {
        return mo33694X0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10377p0 mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        AbstractC10344e0 abstractC10344e0Mo36717a = abstractC10396g.mo36717a(mo33694X0());
        C9801m.m32344d(abstractC10344e0Mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C10377p0((AbstractC10368m0) abstractC10344e0Mo36717a, abstractC10396g.mo36717a(mo36563H()));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C10377p0 mo33695Z0(AbstractC10368m0 abstractC10368m0) {
        C9801m.m32346f(abstractC10368m0, "delegate");
        return new C10377p0(abstractC10368m0, mo36563H());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0
    public String toString() {
        return "[@EnhancedForWarnings(" + mo36563H() + ")] " + mo36566v();
    }
}
