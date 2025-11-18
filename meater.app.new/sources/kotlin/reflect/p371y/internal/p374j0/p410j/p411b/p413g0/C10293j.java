package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10156h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: DeserializedMemberDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.j */
/* loaded from: classes3.dex */
public final class C10293j extends C10642c0 implements InterfaceC10285b {

    /* renamed from: H */
    private final C10135n f39876H;

    /* renamed from: I */
    private final InterfaceC10151c f39877I;

    /* renamed from: J */
    private final C10155g f39878J;

    /* renamed from: K */
    private final C10156h f39879K;

    /* renamed from: L */
    private final InterfaceC10289f f39880L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10293j(InterfaceC10609m interfaceC10609m, InterfaceC10729t0 interfaceC10729t0, InterfaceC10620g interfaceC10620g, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, boolean z, C10163f c10163f, InterfaceC10576b.a aVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C10135n c10135n, InterfaceC10151c interfaceC10151c, C10155g c10155g, C10156h c10156h, InterfaceC10289f interfaceC10289f) {
        super(interfaceC10609m, interfaceC10729t0, interfaceC10620g, enumC10583d0, abstractC10730u, z, c10163f, aVar, InterfaceC10741z0.f41247a, z2, z3, z6, false, z4, z5);
        C9801m.m32346f(interfaceC10609m, "containingDeclaration");
        C9801m.m32346f(interfaceC10620g, "annotations");
        C9801m.m32346f(enumC10583d0, "modality");
        C9801m.m32346f(abstractC10730u, "visibility");
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(aVar, "kind");
        C9801m.m32346f(c10135n, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        C9801m.m32346f(c10156h, "versionRequirementTable");
        this.f39876H = c10135n;
        this.f39877I = interfaceC10151c;
        this.f39878J = c10155g;
        this.f39879K = c10156h;
        this.f39880L = interfaceC10289f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0
    /* renamed from: Q0 */
    protected C10642c0 mo33222Q0(InterfaceC10609m interfaceC10609m, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, InterfaceC10729t0 interfaceC10729t0, InterfaceC10576b.a aVar, C10163f c10163f, InterfaceC10741z0 interfaceC10741z0) {
        C9801m.m32346f(interfaceC10609m, "newOwner");
        C9801m.m32346f(enumC10583d0, "newModality");
        C9801m.m32346f(abstractC10730u, "newVisibility");
        C9801m.m32346f(aVar, "kind");
        C9801m.m32346f(c10163f, "newName");
        C9801m.m32346f(interfaceC10741z0, "source");
        return new C10293j(interfaceC10609m, interfaceC10729t0, getAnnotations(), enumC10583d0, abstractC10730u, mo37031j0(), c10163f, aVar, mo37036s0(), isConst(), mo32885z(), mo37025O(), mo32863M(), mo36257E(), mo36259Z(), mo36258T(), m36387h1(), mo36260c0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: T */
    public C10155g mo36258T() {
        return this.f39878J;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: Z */
    public InterfaceC10151c mo36259Z() {
        return this.f39877I;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: c0 */
    public InterfaceC10289f mo36260c0() {
        return this.f39880L;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public C10135n mo36257E() {
        return this.f39876H;
    }

    /* renamed from: h1 */
    public C10156h m36387h1() {
        return this.f39879K;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: z */
    public boolean mo32885z() {
        Boolean boolMo35368d = C10150b.f39192D.mo35368d(mo36257E().m34885b0());
        C9801m.m32345e(boolMo35368d, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return boolMo35368d.booleanValue();
    }
}
