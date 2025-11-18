package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: ErrorType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.h */
/* loaded from: classes3.dex */
public final class C10424h extends AbstractC10368m0 {

    /* renamed from: g */
    private final InterfaceC10345e1 f40258g;

    /* renamed from: h */
    private final InterfaceC10251h f40259h;

    /* renamed from: i */
    private final EnumC10426j f40260i;

    /* renamed from: j */
    private final List<InterfaceC10351g1> f40261j;

    /* renamed from: k */
    private final boolean f40262k;

    /* renamed from: l */
    private final String[] f40263l;

    /* renamed from: m */
    private final String f40264m;

    public /* synthetic */ C10424h(InterfaceC10345e1 interfaceC10345e1, InterfaceC10251h interfaceC10251h, EnumC10426j enumC10426j, List list, boolean z, String[] strArr, int i2, C9789g c9789g) {
        this(interfaceC10345e1, interfaceC10251h, enumC10426j, (i2 & 8) != 0 ? C10817u.m38888j() : list, (i2 & 16) != 0 ? false : z, strArr);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: M0 */
    public List<InterfaceC10351g1> mo35991M0() {
        return this.f40261j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: N0 */
    public C10333a1 mo35992N0() {
        return C10333a1.f40041g.m36577h();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: O0 */
    public InterfaceC10345e1 mo35993O0() {
        return this.f40258g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return this.f40262k;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: V0 */
    public AbstractC10368m0 mo33545S0(boolean z) {
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = mo35993O0();
        InterfaceC10251h interfaceC10251hMo33553q = mo33553q();
        EnumC10426j enumC10426j = this.f40260i;
        List<InterfaceC10351g1> listMo35991M0 = mo35991M0();
        String[] strArr = this.f40263l;
        return new C10424h(interfaceC10345e1Mo35993O0, interfaceC10251hMo33553q, enumC10426j, listMo35991M0, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: W0 */
    public AbstractC10368m0 mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return this;
    }

    /* renamed from: X0 */
    public final String m37043X0() {
        return this.f40264m;
    }

    /* renamed from: Y0 */
    public final EnumC10426j m37044Y0() {
        return this.f40260i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C10424h mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: q */
    public InterfaceC10251h mo33553q() {
        return this.f40259h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10424h(InterfaceC10345e1 interfaceC10345e1, InterfaceC10251h interfaceC10251h, EnumC10426j enumC10426j, List<? extends InterfaceC10351g1> list, boolean z, String... strArr) {
        C9801m.m32346f(interfaceC10345e1, "constructor");
        C9801m.m32346f(interfaceC10251h, "memberScope");
        C9801m.m32346f(enumC10426j, "kind");
        C9801m.m32346f(list, "arguments");
        C9801m.m32346f(strArr, "formatParams");
        this.f40258g = interfaceC10345e1;
        this.f40259h = interfaceC10251h;
        this.f40260i = enumC10426j;
        this.f40261j = list;
        this.f40262k = z;
        this.f40263l = strArr;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String strM37049k = enumC10426j.m37049k();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strM37049k, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        C9801m.m32345e(str, "format(format, *args)");
        this.f40264m = str;
    }
}
