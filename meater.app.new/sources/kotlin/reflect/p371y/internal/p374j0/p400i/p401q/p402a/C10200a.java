package kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a;

import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10423g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10437d;
import okhttp3.HttpUrl;

/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.i.q.a.a */
/* loaded from: classes3.dex */
public final class C10200a extends AbstractC10368m0 implements InterfaceC10437d {

    /* renamed from: g */
    private final InterfaceC10351g1 f39548g;

    /* renamed from: h */
    private final InterfaceC10201b f39549h;

    /* renamed from: i */
    private final boolean f39550i;

    /* renamed from: j */
    private final C10333a1 f39551j;

    public /* synthetic */ C10200a(InterfaceC10351g1 interfaceC10351g1, InterfaceC10201b interfaceC10201b, boolean z, C10333a1 c10333a1, int i2, C9789g c9789g) {
        this(interfaceC10351g1, (i2 & 2) != 0 ? new C10202c(interfaceC10351g1) : interfaceC10201b, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? C10333a1.f40041g.m36577h() : c10333a1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: M0 */
    public List<InterfaceC10351g1> mo35991M0() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: N0 */
    public C10333a1 mo35992N0() {
        return this.f39551j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return this.f39550i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: W0 */
    public AbstractC10368m0 mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return new C10200a(this.f39548g, mo35993O0(), mo33691P0(), c10333a1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10201b mo35993O0() {
        return this.f39549h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C10200a mo33545S0(boolean z) {
        return z == mo33691P0() ? this : new C10200a(this.f39548g, mo35993O0(), z, mo35992N0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C10200a mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        InterfaceC10351g1 interfaceC10351g1Mo36709b = this.f39548g.mo36709b(abstractC10396g);
        C9801m.m32345e(interfaceC10351g1Mo36709b, "typeProjection.refine(kotlinTypeRefiner)");
        return new C10200a(interfaceC10351g1Mo36709b, mo35993O0(), mo33691P0(), mo35992N0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: q */
    public InterfaceC10251h mo33553q() {
        return C10427k.m37051a(EnumC10423g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.f39548g);
        sb.append(')');
        sb.append(mo33691P0() ? "?" : HttpUrl.FRAGMENT_ENCODE_SET);
        return sb.toString();
    }

    public C10200a(InterfaceC10351g1 interfaceC10351g1, InterfaceC10201b interfaceC10201b, boolean z, C10333a1 c10333a1) {
        C9801m.m32346f(interfaceC10351g1, "typeProjection");
        C9801m.m32346f(interfaceC10201b, "constructor");
        C9801m.m32346f(c10333a1, "attributes");
        this.f39548g = interfaceC10351g1;
        this.f39549h = interfaceC10201b;
        this.f39550i = z;
        this.f39551j = c10333a1;
    }
}
