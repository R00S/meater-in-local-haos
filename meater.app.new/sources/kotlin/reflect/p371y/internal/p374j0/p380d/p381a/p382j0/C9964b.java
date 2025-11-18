package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import java.util.Collection;
import java.util.Map;
import kotlin.collections.C10810q0;
import kotlin.collections.C10813s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9981g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10021b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.b */
/* loaded from: classes2.dex */
public class C9964b implements InterfaceC10616c, InterfaceC9981g {

    /* renamed from: a */
    static final /* synthetic */ KProperty<Object>[] f37899a = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9964b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: b */
    private final C10160c f37900b;

    /* renamed from: c */
    private final InterfaceC10741z0 f37901c;

    /* renamed from: d */
    private final InterfaceC10325i f37902d;

    /* renamed from: e */
    private final InterfaceC10021b f37903e;

    /* renamed from: f */
    private final boolean f37904f;

    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.b$a */
    static final class a extends Lambda implements Function0<AbstractC10368m0> {

        /* renamed from: f */
        final /* synthetic */ C9990g f37905f;

        /* renamed from: g */
        final /* synthetic */ C9964b f37906g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9990g c9990g, C9964b c9964b) {
            super(0);
            this.f37905f = c9990g;
            this.f37906g = c9964b;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10368m0 invoke() {
            AbstractC10368m0 abstractC10368m0Mo36400s = this.f37905f.m33285d().mo37021o().m32797o(this.f37906g.mo33162d()).mo36400s();
            C9801m.m32345e(abstractC10368m0Mo36400s, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return abstractC10368m0Mo36400s;
        }
    }

    public C9964b(C9990g c9990g, InterfaceC10019a interfaceC10019a, C10160c c10160c) {
        InterfaceC10741z0 interfaceC10741z0Mo33569a;
        Collection<InterfaceC10021b> collectionMo33570b;
        C9801m.m32346f(c9990g, "c");
        C9801m.m32346f(c10160c, "fqName");
        this.f37900b = c10160c;
        if (interfaceC10019a == null || (interfaceC10741z0Mo33569a = c9990g.m33282a().m33260t().mo33569a(interfaceC10019a)) == null) {
            interfaceC10741z0Mo33569a = InterfaceC10741z0.f41247a;
            C9801m.m32345e(interfaceC10741z0Mo33569a, "NO_SOURCE");
        }
        this.f37901c = interfaceC10741z0Mo33569a;
        this.f37902d = c9990g.m33286e().mo36516d(new a(c9990g, this));
        this.f37903e = (interfaceC10019a == null || (collectionMo33570b = interfaceC10019a.mo33570b()) == null) ? null : (InterfaceC10021b) C10813s.m38831V(collectionMo33570b);
        this.f37904f = interfaceC10019a != null && interfaceC10019a.mo33572g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: a */
    public Map<C10163f, AbstractC10211g<?>> mo33159a() {
        return C10810q0.m38797i();
    }

    /* renamed from: b */
    protected final InterfaceC10021b m33160b() {
        return this.f37903e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC10368m0 getType() {
        return (AbstractC10368m0) C10329m.m36555a(this.f37902d, this, f37899a[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: d */
    public C10160c mo33162d() {
        return this.f37900b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9981g
    /* renamed from: g */
    public boolean mo33163g() {
        return this.f37904f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: t */
    public InterfaceC10741z0 mo33164t() {
        return this.f37901c;
    }
}
