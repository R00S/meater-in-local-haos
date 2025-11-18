package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.jvm.internal.C9789g;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10407r;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i;

/* compiled from: KotlinType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.e0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10344e0 implements InterfaceC10614a, InterfaceC10442i {

    /* renamed from: f */
    private int f40077f;

    private AbstractC10344e0() {
    }

    public /* synthetic */ AbstractC10344e0(C9789g c9789g) {
        this();
    }

    /* renamed from: L0 */
    private final int m36634L0() {
        return C10350g0.m36706a(this) ? super.hashCode() : (((mo35993O0().hashCode() * 31) + mo35991M0().hashCode()) * 31) + (mo33691P0() ? 1 : 0);
    }

    /* renamed from: M0 */
    public abstract List<InterfaceC10351g1> mo35991M0();

    /* renamed from: N0 */
    public abstract C10333a1 mo35992N0();

    /* renamed from: O0 */
    public abstract InterfaceC10345e1 mo35993O0();

    /* renamed from: P0 */
    public abstract boolean mo33691P0();

    /* renamed from: Q0 */
    public abstract AbstractC10344e0 mo33544Q0(AbstractC10396g abstractC10396g);

    /* renamed from: R0 */
    public abstract AbstractC10381q1 mo36635R0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC10344e0)) {
            return false;
        }
        AbstractC10344e0 abstractC10344e0 = (AbstractC10344e0) obj;
        return mo33691P0() == abstractC10344e0.mo33691P0() && C10407r.f40210a.m36958a(mo36635R0(), abstractC10344e0.mo36635R0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        return C10361k.m36731a(mo35992N0());
    }

    public final int hashCode() {
        int i2 = this.f40077f;
        if (i2 != 0) {
            return i2;
        }
        int iM36634L0 = m36634L0();
        this.f40077f = iM36634L0;
        return iM36634L0;
    }

    /* renamed from: q */
    public abstract InterfaceC10251h mo33553q();
}
