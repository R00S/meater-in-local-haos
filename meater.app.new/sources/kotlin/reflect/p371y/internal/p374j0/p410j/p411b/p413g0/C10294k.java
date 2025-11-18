package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10650g0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10156h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: DeserializedMemberDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.k */
/* loaded from: classes3.dex */
public final class C10294k extends C10650g0 implements InterfaceC10285b {

    /* renamed from: J */
    private final C10130i f39881J;

    /* renamed from: K */
    private final InterfaceC10151c f39882K;

    /* renamed from: L */
    private final C10155g f39883L;

    /* renamed from: M */
    private final C10156h f39884M;

    /* renamed from: N */
    private final InterfaceC10289f f39885N;

    public /* synthetic */ C10294k(InterfaceC10609m interfaceC10609m, InterfaceC10739y0 interfaceC10739y0, InterfaceC10620g interfaceC10620g, C10163f c10163f, InterfaceC10576b.a aVar, C10130i c10130i, InterfaceC10151c interfaceC10151c, C10155g c10155g, C10156h c10156h, InterfaceC10289f interfaceC10289f, InterfaceC10741z0 interfaceC10741z0, int i2, C9789g c9789g) {
        this(interfaceC10609m, interfaceC10739y0, interfaceC10620g, c10163f, aVar, c10130i, interfaceC10151c, c10155g, c10156h, interfaceC10289f, (i2 & 1024) != 0 ? null : interfaceC10741z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10650g0, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: M0 */
    protected AbstractC10666p mo32906M0(InterfaceC10609m interfaceC10609m, InterfaceC10738y interfaceC10738y, InterfaceC10576b.a aVar, C10163f c10163f, InterfaceC10620g interfaceC10620g, InterfaceC10741z0 interfaceC10741z0) {
        C10163f c10163f2;
        C9801m.m32346f(interfaceC10609m, "newOwner");
        C9801m.m32346f(aVar, "kind");
        C9801m.m32346f(interfaceC10620g, "annotations");
        C9801m.m32346f(interfaceC10741z0, "source");
        InterfaceC10739y0 interfaceC10739y0 = (InterfaceC10739y0) interfaceC10738y;
        if (c10163f == null) {
            C10163f name = getName();
            C9801m.m32345e(name, "name");
            c10163f2 = name;
        } else {
            c10163f2 = c10163f;
        }
        C10294k c10294k = new C10294k(interfaceC10609m, interfaceC10739y0, interfaceC10620g, c10163f2, aVar, mo36257E(), mo36259Z(), mo36258T(), m36389r1(), mo36260c0(), interfaceC10741z0);
        c10294k.mo33206Z0(mo33205R0());
        return c10294k;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: T */
    public C10155g mo36258T() {
        return this.f39883L;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: Z */
    public InterfaceC10151c mo36259Z() {
        return this.f39882K;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: c0 */
    public InterfaceC10289f mo36260c0() {
        return this.f39885N;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public C10130i mo36257E() {
        return this.f39881J;
    }

    /* renamed from: r1 */
    public C10156h m36389r1() {
        return this.f39884M;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10294k(InterfaceC10609m interfaceC10609m, InterfaceC10739y0 interfaceC10739y0, InterfaceC10620g interfaceC10620g, C10163f c10163f, InterfaceC10576b.a aVar, C10130i c10130i, InterfaceC10151c interfaceC10151c, C10155g c10155g, C10156h c10156h, InterfaceC10289f interfaceC10289f, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10609m, interfaceC10739y0, interfaceC10620g, c10163f, aVar, interfaceC10741z0 == null ? InterfaceC10741z0.f41247a : interfaceC10741z0);
        C9801m.m32346f(interfaceC10609m, "containingDeclaration");
        C9801m.m32346f(interfaceC10620g, "annotations");
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(aVar, "kind");
        C9801m.m32346f(c10130i, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        C9801m.m32346f(c10156h, "versionRequirementTable");
        this.f39881J = c10130i;
        this.f39882K = interfaceC10151c;
        this.f39883L = c10155g;
        this.f39884M = c10156h;
        this.f39885N = interfaceC10289f;
    }
}
