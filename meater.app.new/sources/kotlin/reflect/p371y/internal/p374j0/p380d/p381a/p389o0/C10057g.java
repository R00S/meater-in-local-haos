package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10378p1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10359j0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.g */
/* loaded from: classes3.dex */
public final class C10057g extends AbstractC10382r implements InterfaceC10359j0 {

    /* renamed from: g */
    private final AbstractC10368m0 f38225g;

    public C10057g(AbstractC10368m0 abstractC10368m0) {
        C9801m.m32346f(abstractC10368m0, "delegate");
        this.f38225g = abstractC10368m0;
    }

    /* renamed from: a1 */
    private final AbstractC10368m0 m33688a1(AbstractC10368m0 abstractC10368m0) {
        AbstractC10368m0 abstractC10368m0Mo33545S0 = abstractC10368m0.mo33545S0(false);
        return !C10457a.m37151q(abstractC10368m0) ? abstractC10368m0Mo33545S0 : new C10057g(abstractC10368m0Mo33545S0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10370n
    /* renamed from: A0 */
    public boolean mo33689A0() {
        return true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10370n
    /* renamed from: K */
    public AbstractC10344e0 mo33690K(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "replacement");
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        if (!C10457a.m37151q(abstractC10381q1Mo36635R0) && !C10372n1.m36779l(abstractC10381q1Mo36635R0)) {
            return abstractC10381q1Mo36635R0;
        }
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10368m0) {
            return m33688a1((AbstractC10368m0) abstractC10381q1Mo36635R0);
        }
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10458y) {
            AbstractC10458y abstractC10458y = (AbstractC10458y) abstractC10381q1Mo36635R0;
            return C10378p1.m36806d(C10347f0.m36664d(m33688a1(abstractC10458y.m37161W0()), m33688a1(abstractC10458y.m37162X0())), C10378p1.m36803a(abstractC10381q1Mo36635R0));
        }
        throw new IllegalStateException(("Incorrect type: " + abstractC10381q1Mo36635R0).toString());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: V0 */
    public AbstractC10368m0 mo33545S0(boolean z) {
        return z ? mo33694X0().mo33545S0(true) : this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: X0 */
    protected AbstractC10368m0 mo33694X0() {
        return this.f38225g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10057g mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return new C10057g(mo33694X0().mo33547U0(c10333a1));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C10057g mo33695Z0(AbstractC10368m0 abstractC10368m0) {
        C9801m.m32346f(abstractC10368m0, "delegate");
        return new C10057g(abstractC10368m0);
    }
}
