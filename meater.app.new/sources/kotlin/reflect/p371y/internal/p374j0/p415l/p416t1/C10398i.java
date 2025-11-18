package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10423g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.EnumC10435b;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10437d;

/* compiled from: NewCapturedType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.i */
/* loaded from: classes3.dex */
public final class C10398i extends AbstractC10368m0 implements InterfaceC10437d {

    /* renamed from: g */
    private final EnumC10435b f40185g;

    /* renamed from: h */
    private final C10399j f40186h;

    /* renamed from: i */
    private final AbstractC10381q1 f40187i;

    /* renamed from: j */
    private final C10333a1 f40188j;

    /* renamed from: k */
    private final boolean f40189k;

    /* renamed from: l */
    private final boolean f40190l;

    public /* synthetic */ C10398i(EnumC10435b enumC10435b, C10399j c10399j, AbstractC10381q1 abstractC10381q1, C10333a1 c10333a1, boolean z, boolean z2, int i2, C9789g c9789g) {
        this(enumC10435b, c10399j, abstractC10381q1, (i2 & 8) != 0 ? C10333a1.f40041g.m36577h() : c10333a1, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: M0 */
    public List<InterfaceC10351g1> mo35991M0() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: N0 */
    public C10333a1 mo35992N0() {
        return this.f40188j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return this.f40189k;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: W0 */
    public AbstractC10368m0 mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return new C10398i(this.f40185g, mo35993O0(), this.f40187i, c10333a1, mo33691P0(), this.f40190l);
    }

    /* renamed from: X0 */
    public final EnumC10435b m36934X0() {
        return this.f40185g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C10399j mo35993O0() {
        return this.f40186h;
    }

    /* renamed from: Z0 */
    public final AbstractC10381q1 m36936Z0() {
        return this.f40187i;
    }

    /* renamed from: a1 */
    public final boolean m36937a1() {
        return this.f40190l;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10398i mo33545S0(boolean z) {
        return new C10398i(this.f40185g, mo35993O0(), this.f40187i, mo35992N0(), z, false, 32, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C10398i mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        EnumC10435b enumC10435b = this.f40185g;
        C10399j c10399jM36944k = mo35993O0().mo35999b(abstractC10396g);
        AbstractC10381q1 abstractC10381q1 = this.f40187i;
        return new C10398i(enumC10435b, c10399jM36944k, abstractC10381q1 != null ? abstractC10396g.mo36717a(abstractC10381q1).mo36635R0() : null, mo35992N0(), mo33691P0(), false, 32, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: q */
    public InterfaceC10251h mo33553q() {
        return C10427k.m37051a(EnumC10423g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public C10398i(EnumC10435b enumC10435b, C10399j c10399j, AbstractC10381q1 abstractC10381q1, C10333a1 c10333a1, boolean z, boolean z2) {
        C9801m.m32346f(enumC10435b, "captureStatus");
        C9801m.m32346f(c10399j, "constructor");
        C9801m.m32346f(c10333a1, "attributes");
        this.f40185g = enumC10435b;
        this.f40186h = c10399j;
        this.f40187i = abstractC10381q1;
        this.f40188j = c10333a1;
        this.f40189k = z;
        this.f40190l = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10398i(EnumC10435b enumC10435b, AbstractC10381q1 abstractC10381q1, InterfaceC10351g1 interfaceC10351g1, InterfaceC10587e1 interfaceC10587e1) {
        this(enumC10435b, new C10399j(interfaceC10351g1, null, null, interfaceC10587e1, 6, null), abstractC10381q1, null, false, false, 56, null);
        C9801m.m32346f(enumC10435b, "captureStatus");
        C9801m.m32346f(interfaceC10351g1, "projection");
        C9801m.m32346f(interfaceC10587e1, "typeParameter");
    }
}
