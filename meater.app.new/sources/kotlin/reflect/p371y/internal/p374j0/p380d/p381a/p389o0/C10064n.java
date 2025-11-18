package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10078x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9950d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.EnumC9946b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9981g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10007m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9999e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10378p1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10406q;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10448o;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10451r;

/* compiled from: signatureEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.n */
/* loaded from: classes3.dex */
final class C10064n extends AbstractC10051a<InterfaceC10616c> {

    /* renamed from: a */
    private final InterfaceC10614a f38285a;

    /* renamed from: b */
    private final boolean f38286b;

    /* renamed from: c */
    private final C9990g f38287c;

    /* renamed from: d */
    private final EnumC9946b f38288d;

    /* renamed from: e */
    private final boolean f38289e;

    public /* synthetic */ C10064n(InterfaceC10614a interfaceC10614a, boolean z, C9990g c9990g, EnumC9946b enumC9946b, boolean z2, int i2, C9789g c9789g) {
        this(interfaceC10614a, z, c9990g, enumC9946b, (i2 & 16) != 0 ? false : z2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: A */
    public boolean mo33644A(InterfaceC10442i interfaceC10442i) {
        C9801m.m32346f(interfaceC10442i, "<this>");
        return ((AbstractC10344e0) interfaceC10442i).mo36635R0() instanceof C10057g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C9950d mo33646h() {
        return this.f38287c.m33282a().m33241a();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public AbstractC10344e0 mo33653p(InterfaceC10442i interfaceC10442i) {
        C9801m.m32346f(interfaceC10442i, "<this>");
        return C10378p1.m36803a((AbstractC10344e0) interfaceC10442i);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean mo33655r(InterfaceC10616c interfaceC10616c) {
        C9801m.m32346f(interfaceC10616c, "<this>");
        return ((interfaceC10616c instanceof InterfaceC9981g) && ((InterfaceC9981g) interfaceC10616c).mo33163g()) || ((interfaceC10616c instanceof C9999e) && !mo33652o() && (((C9999e) interfaceC10616c).m33333k() || mo33649l() == EnumC9946b.TYPE_PARAMETER_BOUNDS));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public InterfaceC10451r mo33658v() {
        return C10406q.f40209a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: i */
    public Iterable<InterfaceC10616c> mo33647i(InterfaceC10442i interfaceC10442i) {
        C9801m.m32346f(interfaceC10442i, "<this>");
        return ((AbstractC10344e0) interfaceC10442i).getAnnotations();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: k */
    public Iterable<InterfaceC10616c> mo33648k() {
        InterfaceC10620g annotations;
        InterfaceC10614a interfaceC10614a = this.f38285a;
        return (interfaceC10614a == null || (annotations = interfaceC10614a.getAnnotations()) == null) ? C10817u.m38888j() : annotations;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: l */
    public EnumC9946b mo33649l() {
        return this.f38288d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: m */
    public C10078x mo33650m() {
        return this.f38287c.m33283b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: n */
    public boolean mo33651n() {
        InterfaceC10614a interfaceC10614a = this.f38285a;
        return (interfaceC10614a instanceof InterfaceC10599i1) && ((InterfaceC10599i1) interfaceC10614a).mo37697l0() != null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: o */
    public boolean mo33652o() {
        return this.f38287c.m33282a().m33257q().mo33267c();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: s */
    public C10161d mo33656s(InterfaceC10442i interfaceC10442i) {
        C9801m.m32346f(interfaceC10442i, "<this>");
        InterfaceC10585e interfaceC10585eM36773f = C10372n1.m36773f((AbstractC10344e0) interfaceC10442i);
        if (interfaceC10585eM36773f != null) {
            return C10187d.m35825m(interfaceC10585eM36773f);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: u */
    public boolean mo33657u() {
        return this.f38289e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: w */
    public boolean mo33659w(InterfaceC10442i interfaceC10442i) {
        C9801m.m32346f(interfaceC10442i, "<this>");
        return AbstractC9914h.m32742e0((AbstractC10344e0) interfaceC10442i);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: x */
    public boolean mo33660x() {
        return this.f38286b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: y */
    public boolean mo33661y(InterfaceC10442i interfaceC10442i, InterfaceC10442i interfaceC10442i2) {
        C9801m.m32346f(interfaceC10442i, "<this>");
        C9801m.m32346f(interfaceC10442i2, "other");
        return this.f38287c.m33282a().m33251k().mo36919b((AbstractC10344e0) interfaceC10442i, (AbstractC10344e0) interfaceC10442i2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a
    /* renamed from: z */
    public boolean mo33662z(InterfaceC10448o interfaceC10448o) {
        C9801m.m32346f(interfaceC10448o, "<this>");
        return interfaceC10448o instanceof C10007m;
    }

    public C10064n(InterfaceC10614a interfaceC10614a, boolean z, C9990g c9990g, EnumC9946b enumC9946b, boolean z2) {
        C9801m.m32346f(c9990g, "containerContext");
        C9801m.m32346f(enumC9946b, "containerApplicabilityType");
        this.f38285a = interfaceC10614a;
        this.f38286b = z;
        this.f38287c = c9990g;
        this.f38288d = enumC9946b;
        this.f38289e = z2;
    }
}
