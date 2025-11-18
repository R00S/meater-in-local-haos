package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10422f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10428l;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.l.n0 */
/* loaded from: classes3.dex */
final class C10371n0 extends AbstractC10368m0 {

    /* renamed from: g */
    private final InterfaceC10345e1 f40147g;

    /* renamed from: h */
    private final List<InterfaceC10351g1> f40148h;

    /* renamed from: i */
    private final boolean f40149i;

    /* renamed from: j */
    private final InterfaceC10251h f40150j;

    /* renamed from: k */
    private final Function1<AbstractC10396g, AbstractC10368m0> f40151k;

    /* JADX WARN: Multi-variable type inference failed */
    public C10371n0(InterfaceC10345e1 interfaceC10345e1, List<? extends InterfaceC10351g1> list, boolean z, InterfaceC10251h interfaceC10251h, Function1<? super AbstractC10396g, ? extends AbstractC10368m0> function1) {
        C9801m.m32346f(interfaceC10345e1, "constructor");
        C9801m.m32346f(list, "arguments");
        C9801m.m32346f(interfaceC10251h, "memberScope");
        C9801m.m32346f(function1, "refinedTypeFactory");
        this.f40147g = interfaceC10345e1;
        this.f40148h = list;
        this.f40149i = z;
        this.f40150j = interfaceC10251h;
        this.f40151k = function1;
        if (!(mo33553q() instanceof C10422f) || (mo33553q() instanceof C10428l)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + mo33553q() + '\n' + mo35993O0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: M0 */
    public List<InterfaceC10351g1> mo35991M0() {
        return this.f40148h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: N0 */
    public C10333a1 mo35992N0() {
        return C10333a1.f40041g.m36577h();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: O0 */
    public InterfaceC10345e1 mo35993O0() {
        return this.f40147g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return this.f40149i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: V0 */
    public AbstractC10368m0 mo33545S0(boolean z) {
        return z == mo33691P0() ? this : z ? new C10362k0(this) : new C10356i0(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: W0 */
    public AbstractC10368m0 mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return c10333a1.isEmpty() ? this : new C10374o0(this, c10333a1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public AbstractC10368m0 mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        AbstractC10368m0 abstractC10368m0Invoke = this.f40151k.invoke(abstractC10396g);
        return abstractC10368m0Invoke == null ? this : abstractC10368m0Invoke;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: q */
    public InterfaceC10251h mo33553q() {
        return this.f40150j;
    }
}
