package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10647f;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10125d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10156h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: DeserializedMemberDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.c */
/* loaded from: classes3.dex */
public final class C10286c extends C10647f implements InterfaceC10285b {

    /* renamed from: K */
    private final C10125d f39764K;

    /* renamed from: L */
    private final InterfaceC10151c f39765L;

    /* renamed from: M */
    private final C10155g f39766M;

    /* renamed from: N */
    private final C10156h f39767N;

    /* renamed from: O */
    private final InterfaceC10289f f39768O;

    public /* synthetic */ C10286c(InterfaceC10585e interfaceC10585e, InterfaceC10606l interfaceC10606l, InterfaceC10620g interfaceC10620g, boolean z, InterfaceC10576b.a aVar, C10125d c10125d, InterfaceC10151c interfaceC10151c, C10155g c10155g, C10156h c10156h, InterfaceC10289f interfaceC10289f, InterfaceC10741z0 interfaceC10741z0, int i2, C9789g c9789g) {
        this(interfaceC10585e, interfaceC10606l, interfaceC10620g, z, aVar, c10125d, interfaceC10151c, c10155g, c10156h, interfaceC10289f, (i2 & 1024) != 0 ? null : interfaceC10741z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    /* renamed from: P */
    public boolean mo32908P() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: T */
    public C10155g mo36258T() {
        return this.f39766M;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: Z */
    public InterfaceC10151c mo36259Z() {
        return this.f39765L;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: c0 */
    public InterfaceC10289f mo36260c0() {
        return this.f39768O;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    public boolean isSuspend() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10647f
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public C10286c mo32906M0(InterfaceC10609m interfaceC10609m, InterfaceC10738y interfaceC10738y, InterfaceC10576b.a aVar, C10163f c10163f, InterfaceC10620g interfaceC10620g, InterfaceC10741z0 interfaceC10741z0) {
        C9801m.m32346f(interfaceC10609m, "newOwner");
        C9801m.m32346f(aVar, "kind");
        C9801m.m32346f(interfaceC10620g, "annotations");
        C9801m.m32346f(interfaceC10741z0, "source");
        C10286c c10286c = new C10286c((InterfaceC10585e) interfaceC10609m, (InterfaceC10606l) interfaceC10738y, interfaceC10620g, this.f40971J, aVar, mo36257E(), mo36259Z(), mo36258T(), m36263v1(), mo36260c0(), interfaceC10741z0);
        c10286c.mo33206Z0(mo33205R0());
        return c10286c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public C10125d mo36257E() {
        return this.f39764K;
    }

    /* renamed from: v1 */
    public C10156h m36263v1() {
        return this.f39767N;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: z */
    public boolean mo32885z() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10286c(InterfaceC10585e interfaceC10585e, InterfaceC10606l interfaceC10606l, InterfaceC10620g interfaceC10620g, boolean z, InterfaceC10576b.a aVar, C10125d c10125d, InterfaceC10151c interfaceC10151c, C10155g c10155g, C10156h c10156h, InterfaceC10289f interfaceC10289f, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10585e, interfaceC10606l, interfaceC10620g, z, aVar, interfaceC10741z0 == null ? InterfaceC10741z0.f41247a : interfaceC10741z0);
        C9801m.m32346f(interfaceC10585e, "containingDeclaration");
        C9801m.m32346f(interfaceC10620g, "annotations");
        C9801m.m32346f(aVar, "kind");
        C9801m.m32346f(c10125d, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        C9801m.m32346f(c10156h, "versionRequirementTable");
        this.f39764K = c10125d;
        this.f39765L = interfaceC10151c;
        this.f39766M = c10155g;
        this.f39767N = c10156h;
        this.f39768O = interfaceC10289f;
    }
}
