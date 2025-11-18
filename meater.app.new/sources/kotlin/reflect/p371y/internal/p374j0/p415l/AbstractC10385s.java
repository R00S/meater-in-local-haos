package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.l.s */
/* loaded from: classes3.dex */
public abstract class AbstractC10385s extends AbstractC10382r {

    /* renamed from: g */
    private final AbstractC10368m0 f40174g;

    public AbstractC10385s(AbstractC10368m0 abstractC10368m0) {
        C9801m.m32346f(abstractC10368m0, "delegate");
        this.f40174g = abstractC10368m0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: V0 */
    public AbstractC10368m0 mo33545S0(boolean z) {
        return z == mo33691P0() ? this : mo33694X0().mo33545S0(z).mo33547U0(mo35992N0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: W0 */
    public AbstractC10368m0 mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return c10333a1 != mo35992N0() ? new C10374o0(this, c10333a1) : this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: X0 */
    protected AbstractC10368m0 mo33694X0() {
        return this.f40174g;
    }
}
