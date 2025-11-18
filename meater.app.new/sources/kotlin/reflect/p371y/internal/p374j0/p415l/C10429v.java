package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10439f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: dynamicTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.v */
/* loaded from: classes3.dex */
public final class C10429v extends AbstractC10458y implements InterfaceC10439f {

    /* renamed from: i */
    private final C10333a1 f40362i;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10429v(AbstractC9914h abstractC9914h, C10333a1 c10333a1) {
        C9801m.m32346f(abstractC9914h, "builtIns");
        C9801m.m32346f(c10333a1, "attributes");
        AbstractC10368m0 abstractC10368m0M32773H = abstractC9914h.m32773H();
        C9801m.m32345e(abstractC10368m0M32773H, "builtIns.nothingType");
        AbstractC10368m0 abstractC10368m0M32774I = abstractC9914h.m32774I();
        C9801m.m32345e(abstractC10368m0M32774I, "builtIns.nullableAnyType");
        super(abstractC10368m0M32773H, abstractC10368m0M32774I);
        this.f40362i = c10333a1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: N0 */
    public C10333a1 mo35992N0() {
        return this.f40362i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y
    /* renamed from: V0 */
    public AbstractC10368m0 mo33548V0() {
        return m37162X0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y
    /* renamed from: Y0 */
    public String mo33549Y0(AbstractC10172c abstractC10172c, InterfaceC10175f interfaceC10175f) {
        C9801m.m32346f(abstractC10172c, "renderer");
        C9801m.m32346f(interfaceC10175f, "options");
        return "dynamic";
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C10429v mo33545S0(boolean z) {
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C10429v mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10429v mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return new C10429v(C10457a.m37142h(mo33548V0()), c10333a1);
    }
}
