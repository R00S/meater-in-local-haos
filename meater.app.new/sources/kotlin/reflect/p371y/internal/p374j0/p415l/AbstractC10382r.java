package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.r */
/* loaded from: classes3.dex */
public abstract class AbstractC10382r extends AbstractC10368m0 {
    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: M0 */
    public List<InterfaceC10351g1> mo35991M0() {
        return mo33694X0().mo35991M0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: N0 */
    public C10333a1 mo35992N0() {
        return mo33694X0().mo35992N0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: O0 */
    public InterfaceC10345e1 mo35993O0() {
        return mo33694X0().mo35993O0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return mo33694X0().mo33691P0();
    }

    /* renamed from: X0 */
    protected abstract AbstractC10368m0 mo33694X0();

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: Y0 */
    public AbstractC10368m0 mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        AbstractC10344e0 abstractC10344e0Mo36717a = abstractC10396g.mo36717a(mo33694X0());
        C9801m.m32344d(abstractC10344e0Mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return mo33695Z0((AbstractC10368m0) abstractC10344e0Mo36717a);
    }

    /* renamed from: Z0 */
    public abstract AbstractC10382r mo33695Z0(AbstractC10368m0 abstractC10368m0);

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: q */
    public InterfaceC10251h mo33553q() {
        return mo33694X0().mo33553q();
    }
}
