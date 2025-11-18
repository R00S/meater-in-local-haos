package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10658k0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10398i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10404o;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10403n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10438e;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.p */
/* loaded from: classes3.dex */
public final class C10376p extends AbstractC10382r implements InterfaceC10370n, InterfaceC10438e {

    /* renamed from: g */
    public static final a f40159g = new a(null);

    /* renamed from: h */
    private final AbstractC10368m0 f40160h;

    /* renamed from: i */
    private final boolean f40161i;

    /* compiled from: SpecialTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.p$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        private final boolean m36796a(AbstractC10381q1 abstractC10381q1) {
            return (abstractC10381q1.mo35993O0() instanceof InterfaceC10403n) || (abstractC10381q1.mo35993O0().mo32891w() instanceof InterfaceC10587e1) || (abstractC10381q1 instanceof C10398i) || (abstractC10381q1 instanceof C10416u0);
        }

        /* renamed from: c */
        public static /* synthetic */ C10376p m36797c(a aVar, AbstractC10381q1 abstractC10381q1, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return aVar.m36799b(abstractC10381q1, z);
        }

        /* renamed from: d */
        private final boolean m36798d(AbstractC10381q1 abstractC10381q1, boolean z) {
            boolean z2 = false;
            if (!m36796a(abstractC10381q1)) {
                return false;
            }
            if (abstractC10381q1 instanceof C10416u0) {
                return C10372n1.m36779l(abstractC10381q1);
            }
            InterfaceC10594h interfaceC10594hMo32887c = abstractC10381q1.mo35993O0().mo32891w();
            C10658k0 c10658k0 = interfaceC10594hMo32887c instanceof C10658k0 ? (C10658k0) interfaceC10594hMo32887c : null;
            if (c10658k0 != null && !c10658k0.m37880U0()) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            return (z && (abstractC10381q1.mo35993O0().mo32891w() instanceof InterfaceC10587e1)) ? C10372n1.m36779l(abstractC10381q1) : !C10404o.f40207a.m36955a(abstractC10381q1);
        }

        /* renamed from: b */
        public final C10376p m36799b(AbstractC10381q1 abstractC10381q1, boolean z) {
            C9801m.m32346f(abstractC10381q1, "type");
            C9789g c9789g = null;
            if (abstractC10381q1 instanceof C10376p) {
                return (C10376p) abstractC10381q1;
            }
            if (!m36798d(abstractC10381q1, z)) {
                return null;
            }
            if (abstractC10381q1 instanceof AbstractC10458y) {
                AbstractC10458y abstractC10458y = (AbstractC10458y) abstractC10381q1;
                C9801m.m32341a(abstractC10458y.m37161W0().mo35993O0(), abstractC10458y.m37162X0().mo35993O0());
            }
            return new C10376p(C10335b0.m36584c(abstractC10381q1).mo33545S0(false), z, c9789g);
        }
    }

    private C10376p(AbstractC10368m0 abstractC10368m0, boolean z) {
        this.f40160h = abstractC10368m0;
        this.f40161i = z;
    }

    public /* synthetic */ C10376p(AbstractC10368m0 abstractC10368m0, boolean z, C9789g c9789g) {
        this(abstractC10368m0, z);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10370n
    /* renamed from: A0 */
    public boolean mo33689A0() {
        return (mo33694X0().mo35993O0() instanceof InterfaceC10403n) || (mo33694X0().mo35993O0().mo32891w() instanceof InterfaceC10587e1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10370n
    /* renamed from: K */
    public AbstractC10344e0 mo33690K(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "replacement");
        return C10380q0.m36811e(abstractC10344e0.mo36635R0(), this.f40161i);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: V0 */
    public AbstractC10368m0 mo33545S0(boolean z) {
        return z ? mo33694X0().mo33545S0(z) : this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: W0 */
    public AbstractC10368m0 mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return new C10376p(mo33694X0().mo33547U0(c10333a1), this.f40161i);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: X0 */
    protected AbstractC10368m0 mo33694X0() {
        return this.f40160h;
    }

    /* renamed from: a1 */
    public final AbstractC10368m0 m36794a1() {
        return this.f40160h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10376p mo33695Z0(AbstractC10368m0 abstractC10368m0) {
        C9801m.m32346f(abstractC10368m0, "delegate");
        return new C10376p(abstractC10368m0, this.f40161i);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0
    public String toString() {
        return mo33694X0() + " & Any";
    }
}
