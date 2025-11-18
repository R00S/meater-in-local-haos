package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: StarProjectionImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.l.r0 */
/* loaded from: classes3.dex */
public final class C10383r0 extends AbstractC10354h1 {

    /* renamed from: a */
    private final AbstractC10344e0 f40165a;

    public C10383r0(AbstractC9914h abstractC9914h) {
        C9801m.m32346f(abstractC9914h, "kotlinBuiltIns");
        AbstractC10368m0 abstractC10368m0M32774I = abstractC9914h.m32774I();
        C9801m.m32345e(abstractC10368m0M32774I, "kotlinBuiltIns.nullableAnyType");
        this.f40165a = abstractC10368m0M32774I;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1
    /* renamed from: a */
    public EnumC10384r1 mo36708a() {
        return EnumC10384r1.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1
    /* renamed from: b */
    public InterfaceC10351g1 mo36709b(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1
    /* renamed from: c */
    public boolean mo36710c() {
        return true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1
    public AbstractC10344e0 getType() {
        return this.f40165a;
    }
}
