package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10140s;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10149a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10156h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10157i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10289f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: context.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.m */
/* loaded from: classes3.dex */
public final class C10303m {

    /* renamed from: a */
    private final C10301k f39933a;

    /* renamed from: b */
    private final InterfaceC10151c f39934b;

    /* renamed from: c */
    private final InterfaceC10609m f39935c;

    /* renamed from: d */
    private final C10155g f39936d;

    /* renamed from: e */
    private final C10156h f39937e;

    /* renamed from: f */
    private final AbstractC10149a f39938f;

    /* renamed from: g */
    private final InterfaceC10289f f39939g;

    /* renamed from: h */
    private final C10275d0 f39940h;

    /* renamed from: i */
    private final C10313w f39941i;

    public C10303m(C10301k c10301k, InterfaceC10151c interfaceC10151c, InterfaceC10609m interfaceC10609m, C10155g c10155g, C10156h c10156h, AbstractC10149a abstractC10149a, InterfaceC10289f interfaceC10289f, C10275d0 c10275d0, List<C10140s> list) {
        String strMo33981c;
        C9801m.m32346f(c10301k, "components");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(interfaceC10609m, "containingDeclaration");
        C9801m.m32346f(c10155g, "typeTable");
        C9801m.m32346f(c10156h, "versionRequirementTable");
        C9801m.m32346f(abstractC10149a, "metadataVersion");
        C9801m.m32346f(list, "typeParameters");
        this.f39933a = c10301k;
        this.f39934b = interfaceC10151c;
        this.f39935c = interfaceC10609m;
        this.f39936d = c10155g;
        this.f39937e = c10156h;
        this.f39938f = abstractC10149a;
        this.f39939g = interfaceC10289f;
        this.f39940h = new C10275d0(this, c10275d0, list, "Deserializer for \"" + interfaceC10609m.getName() + '\"', (interfaceC10289f == null || (strMo33981c = interfaceC10289f.mo33981c()) == null) ? "[container not found]" : strMo33981c);
        this.f39941i = new C10313w(this);
    }

    /* renamed from: b */
    public static /* synthetic */ C10303m m36450b(C10303m c10303m, InterfaceC10609m interfaceC10609m, List list, InterfaceC10151c interfaceC10151c, C10155g c10155g, C10156h c10156h, AbstractC10149a abstractC10149a, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            interfaceC10151c = c10303m.f39934b;
        }
        InterfaceC10151c interfaceC10151c2 = interfaceC10151c;
        if ((i2 & 8) != 0) {
            c10155g = c10303m.f39936d;
        }
        C10155g c10155g2 = c10155g;
        if ((i2 & 16) != 0) {
            c10156h = c10303m.f39937e;
        }
        C10156h c10156h2 = c10156h;
        if ((i2 & 32) != 0) {
            abstractC10149a = c10303m.f39938f;
        }
        return c10303m.m36451a(interfaceC10609m, list, interfaceC10151c2, c10155g2, c10156h2, abstractC10149a);
    }

    /* renamed from: a */
    public final C10303m m36451a(InterfaceC10609m interfaceC10609m, List<C10140s> list, InterfaceC10151c interfaceC10151c, C10155g c10155g, C10156h c10156h, AbstractC10149a abstractC10149a) {
        C9801m.m32346f(interfaceC10609m, "descriptor");
        C9801m.m32346f(list, "typeParameterProtos");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        C10156h c10156h2 = c10156h;
        C9801m.m32346f(c10156h2, "versionRequirementTable");
        C9801m.m32346f(abstractC10149a, "metadataVersion");
        C10301k c10301k = this.f39933a;
        if (!C10157i.m35404b(abstractC10149a)) {
            c10156h2 = this.f39937e;
        }
        return new C10303m(c10301k, interfaceC10151c, interfaceC10609m, c10155g, c10156h2, abstractC10149a, this.f39939g, this.f39940h, list);
    }

    /* renamed from: c */
    public final C10301k m36452c() {
        return this.f39933a;
    }

    /* renamed from: d */
    public final InterfaceC10289f m36453d() {
        return this.f39939g;
    }

    /* renamed from: e */
    public final InterfaceC10609m m36454e() {
        return this.f39935c;
    }

    /* renamed from: f */
    public final C10313w m36455f() {
        return this.f39941i;
    }

    /* renamed from: g */
    public final InterfaceC10151c m36456g() {
        return this.f39934b;
    }

    /* renamed from: h */
    public final InterfaceC10330n m36457h() {
        return this.f39933a.m36436u();
    }

    /* renamed from: i */
    public final C10275d0 m36458i() {
        return this.f39940h;
    }

    /* renamed from: j */
    public final C10155g m36459j() {
        return this.f39936d;
    }

    /* renamed from: k */
    public final C10156h m36460k() {
        return this.f39937e;
    }
}
