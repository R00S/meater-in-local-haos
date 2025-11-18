package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: TypeWithEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.l.a0 */
/* loaded from: classes3.dex */
public final class C10332a0 extends AbstractC10458y implements InterfaceC10375o1 {

    /* renamed from: i */
    private final AbstractC10458y f40039i;

    /* renamed from: j */
    private final AbstractC10344e0 f40040j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10332a0(AbstractC10458y abstractC10458y, AbstractC10344e0 abstractC10344e0) {
        super(abstractC10458y.m37161W0(), abstractC10458y.m37162X0());
        C9801m.m32346f(abstractC10458y, "origin");
        C9801m.m32346f(abstractC10344e0, "enhancement");
        this.f40039i = abstractC10458y;
        this.f40040j = abstractC10344e0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10375o1
    /* renamed from: H */
    public AbstractC10344e0 mo36563H() {
        return this.f40040j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: S0 */
    public AbstractC10381q1 mo33545S0(boolean z) {
        return C10378p1.m36806d(mo36566v().mo33545S0(z), mo36563H().mo36635R0().mo33545S0(z));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: U0 */
    public AbstractC10381q1 mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return C10378p1.m36806d(mo36566v().mo33547U0(c10333a1), mo36563H());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y
    /* renamed from: V0 */
    public AbstractC10368m0 mo33548V0() {
        return mo36566v().mo33548V0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y
    /* renamed from: Y0 */
    public String mo33549Y0(AbstractC10172c abstractC10172c, InterfaceC10175f interfaceC10175f) {
        C9801m.m32346f(abstractC10172c, "renderer");
        C9801m.m32346f(interfaceC10175f, "options");
        return interfaceC10175f.mo35639f() ? abstractC10172c.mo35505w(mo36563H()) : mo36566v().mo33549Y0(abstractC10172c, interfaceC10175f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10375o1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public AbstractC10458y mo36566v() {
        return this.f40039i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C10332a0 mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        AbstractC10344e0 abstractC10344e0Mo36717a = abstractC10396g.mo36717a(mo36566v());
        C9801m.m32344d(abstractC10344e0Mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C10332a0((AbstractC10458y) abstractC10344e0Mo36717a, abstractC10396g.mo36717a(mo36563H()));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y
    public String toString() {
        return "[@EnhancedForWarnings(" + mo36563H() + ")] " + mo36566v();
    }
}
