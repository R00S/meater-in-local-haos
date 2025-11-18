package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: flexibleTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.z */
/* loaded from: classes3.dex */
public final class C10463z extends AbstractC10458y implements InterfaceC10370n {

    /* renamed from: i */
    public static final a f40395i = new a(null);

    /* renamed from: j */
    public static boolean f40396j;

    /* renamed from: k */
    private boolean f40397k;

    /* compiled from: flexibleTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.z$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10463z(AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02) {
        super(abstractC10368m0, abstractC10368m02);
        C9801m.m32346f(abstractC10368m0, "lowerBound");
        C9801m.m32346f(abstractC10368m02, "upperBound");
    }

    /* renamed from: a1 */
    private final void m37181a1() {
        if (!f40396j || this.f40397k) {
            return;
        }
        this.f40397k = true;
        C10335b0.m36583b(m37161W0());
        C10335b0.m36583b(m37162X0());
        C9801m.m32341a(m37161W0(), m37162X0());
        InterfaceC10394e.f40181a.mo36920d(m37161W0(), m37162X0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10370n
    /* renamed from: A0 */
    public boolean mo33689A0() {
        return (m37161W0().mo35993O0().mo32891w() instanceof InterfaceC10587e1) && C9801m.m32341a(m37161W0().mo35993O0(), m37162X0().mo35993O0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10370n
    /* renamed from: K */
    public AbstractC10344e0 mo33690K(AbstractC10344e0 abstractC10344e0) {
        AbstractC10381q1 abstractC10381q1M36664d;
        C9801m.m32346f(abstractC10344e0, "replacement");
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10458y) {
            abstractC10381q1M36664d = abstractC10381q1Mo36635R0;
        } else {
            if (!(abstractC10381q1Mo36635R0 instanceof AbstractC10368m0)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC10368m0 abstractC10368m0 = (AbstractC10368m0) abstractC10381q1Mo36635R0;
            abstractC10381q1M36664d = C10347f0.m36664d(abstractC10368m0, abstractC10368m0.mo33545S0(true));
        }
        return C10378p1.m36804b(abstractC10381q1M36664d, abstractC10381q1Mo36635R0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: S0 */
    public AbstractC10381q1 mo33545S0(boolean z) {
        return C10347f0.m36664d(m37161W0().mo33545S0(z), m37162X0().mo33545S0(z));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: U0 */
    public AbstractC10381q1 mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return C10347f0.m36664d(m37161W0().mo33547U0(c10333a1), m37162X0().mo33547U0(c10333a1));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y
    /* renamed from: V0 */
    public AbstractC10368m0 mo33548V0() {
        m37181a1();
        return m37161W0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y
    /* renamed from: Y0 */
    public String mo33549Y0(AbstractC10172c abstractC10172c, InterfaceC10175f interfaceC10175f) {
        C9801m.m32346f(abstractC10172c, "renderer");
        C9801m.m32346f(interfaceC10175f, "options");
        if (!interfaceC10175f.mo35655n()) {
            return abstractC10172c.mo35502t(abstractC10172c.mo35505w(m37161W0()), abstractC10172c.mo35505w(m37162X0()), C10457a.m37142h(this));
        }
        return '(' + abstractC10172c.mo35505w(m37161W0()) + ".." + abstractC10172c.mo35505w(m37162X0()) + ')';
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public AbstractC10458y mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        AbstractC10344e0 abstractC10344e0Mo36717a = abstractC10396g.mo36717a(m37161W0());
        C9801m.m32344d(abstractC10344e0Mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC10344e0 abstractC10344e0Mo36717a2 = abstractC10396g.mo36717a(m37162X0());
        C9801m.m32344d(abstractC10344e0Mo36717a2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C10463z((AbstractC10368m0) abstractC10344e0Mo36717a, (AbstractC10368m0) abstractC10344e0Mo36717a2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y
    public String toString() {
        return '(' + m37161W0() + ".." + m37162X0() + ')';
    }
}
