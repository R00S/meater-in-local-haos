package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.l.o0 */
/* loaded from: classes3.dex */
final class C10374o0 extends AbstractC10385s {

    /* renamed from: h */
    private final C10333a1 f40158h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10374o0(AbstractC10368m0 abstractC10368m0, C10333a1 c10333a1) {
        super(abstractC10368m0);
        C9801m.m32346f(abstractC10368m0, "delegate");
        C9801m.m32346f(c10333a1, "attributes");
        this.f40158h = c10333a1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: N0 */
    public C10333a1 mo35992N0() {
        return this.f40158h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C10374o0 mo33695Z0(AbstractC10368m0 abstractC10368m0) {
        C9801m.m32346f(abstractC10368m0, "delegate");
        return new C10374o0(abstractC10368m0, mo35992N0());
    }
}
