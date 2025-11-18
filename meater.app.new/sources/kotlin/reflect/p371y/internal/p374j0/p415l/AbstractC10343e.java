package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10403n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10423g;

/* compiled from: StubTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.e */
/* loaded from: classes3.dex */
public abstract class AbstractC10343e extends AbstractC10368m0 {

    /* renamed from: g */
    public static final a f40073g = new a(null);

    /* renamed from: h */
    private final InterfaceC10403n f40074h;

    /* renamed from: i */
    private final boolean f40075i;

    /* renamed from: j */
    private final InterfaceC10251h f40076j;

    /* compiled from: StubTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public AbstractC10343e(InterfaceC10403n interfaceC10403n, boolean z) {
        C9801m.m32346f(interfaceC10403n, "originalTypeVariable");
        this.f40074h = interfaceC10403n;
        this.f40075i = z;
        this.f40076j = C10427k.m37052b(EnumC10423g.STUB_TYPE_SCOPE, interfaceC10403n.toString());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: M0 */
    public List<InterfaceC10351g1> mo35991M0() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: N0 */
    public C10333a1 mo35992N0() {
        return C10333a1.f40041g.m36577h();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return this.f40075i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: V0 */
    public AbstractC10368m0 mo33545S0(boolean z) {
        return z == mo33691P0() ? this : mo36632Y0(z);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: W0 */
    public AbstractC10368m0 mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return this;
    }

    /* renamed from: X0 */
    public final InterfaceC10403n m36631X0() {
        return this.f40074h;
    }

    /* renamed from: Y0 */
    public abstract AbstractC10343e mo36632Y0(boolean z);

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public AbstractC10343e mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: q */
    public InterfaceC10251h mo33553q() {
        return this.f40076j;
    }
}
