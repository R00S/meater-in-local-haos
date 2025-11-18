package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10440g;

/* compiled from: KotlinType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.y */
/* loaded from: classes3.dex */
public abstract class AbstractC10458y extends AbstractC10381q1 implements InterfaceC10440g {

    /* renamed from: g */
    private final AbstractC10368m0 f40386g;

    /* renamed from: h */
    private final AbstractC10368m0 f40387h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10458y(AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02) {
        super(null);
        C9801m.m32346f(abstractC10368m0, "lowerBound");
        C9801m.m32346f(abstractC10368m02, "upperBound");
        this.f40386g = abstractC10368m0;
        this.f40387h = abstractC10368m02;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: M0 */
    public List<InterfaceC10351g1> mo35991M0() {
        return mo33548V0().mo35991M0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: N0 */
    public C10333a1 mo35992N0() {
        return mo33548V0().mo35992N0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: O0 */
    public InterfaceC10345e1 mo35993O0() {
        return mo33548V0().mo35993O0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return mo33548V0().mo33691P0();
    }

    /* renamed from: V0 */
    public abstract AbstractC10368m0 mo33548V0();

    /* renamed from: W0 */
    public final AbstractC10368m0 m37161W0() {
        return this.f40386g;
    }

    /* renamed from: X0 */
    public final AbstractC10368m0 m37162X0() {
        return this.f40387h;
    }

    /* renamed from: Y0 */
    public abstract String mo33549Y0(AbstractC10172c abstractC10172c, InterfaceC10175f interfaceC10175f);

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: q */
    public InterfaceC10251h mo33553q() {
        return mo33548V0().mo33553q();
    }

    public String toString() {
        return AbstractC10172c.f39380j.mo35505w(this);
    }
}
