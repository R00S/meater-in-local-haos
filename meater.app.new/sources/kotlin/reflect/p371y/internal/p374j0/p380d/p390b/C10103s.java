package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10575a1;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10117e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10310t;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.EnumC10288e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10289f;

/* compiled from: KotlinJvmBinarySourceElement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.s */
/* loaded from: classes3.dex */
public final class C10103s implements InterfaceC10289f {

    /* renamed from: b */
    private final InterfaceC10101q f38481b;

    /* renamed from: c */
    private final C10310t<C10117e> f38482c;

    /* renamed from: d */
    private final boolean f38483d;

    /* renamed from: e */
    private final EnumC10288e f38484e;

    public C10103s(InterfaceC10101q interfaceC10101q, C10310t<C10117e> c10310t, boolean z, EnumC10288e enumC10288e) {
        C9801m.m32346f(interfaceC10101q, "binaryClass");
        C9801m.m32346f(enumC10288e, "abiStability");
        this.f38481b = interfaceC10101q;
        this.f38482c = c10310t;
        this.f38483d = z;
        this.f38484e = enumC10288e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0
    /* renamed from: a */
    public InterfaceC10575a1 mo33980a() {
        InterfaceC10575a1 interfaceC10575a1 = InterfaceC10575a1.f40728a;
        C9801m.m32345e(interfaceC10575a1, "NO_SOURCE_FILE");
        return interfaceC10575a1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10289f
    /* renamed from: c */
    public String mo33981c() {
        return "Class '" + this.f38481b.mo34028e().m35409b().m35420b() + '\'';
    }

    /* renamed from: d */
    public final InterfaceC10101q m34029d() {
        return this.f38481b;
    }

    public String toString() {
        return C10103s.class.getSimpleName() + ": " + this.f38481b;
    }
}
