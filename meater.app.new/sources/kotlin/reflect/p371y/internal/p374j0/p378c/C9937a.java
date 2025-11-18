package kotlin.reflect.p371y.internal.p374j0.p378c;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.C9942e;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9943f;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9938a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9940c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;

/* compiled from: utils.kt */
/* renamed from: kotlin.f0.y.e.j0.c.a */
/* loaded from: classes2.dex */
public final class C9937a {
    /* renamed from: a */
    public static final void m33013a(InterfaceC9940c interfaceC9940c, InterfaceC9939b interfaceC9939b, InterfaceC10585e interfaceC10585e, C10163f c10163f) {
        InterfaceC9938a location;
        C9801m.m32346f(interfaceC9940c, "<this>");
        C9801m.m32346f(interfaceC9939b, "from");
        C9801m.m32346f(interfaceC10585e, "scopeOwner");
        C9801m.m32346f(c10163f, "name");
        if (interfaceC9940c == InterfaceC9940c.a.f37749a || (location = interfaceC9939b.getLocation()) == null) {
            return;
        }
        C9942e position = interfaceC9940c.mo33017a() ? location.getPosition() : C9942e.f37774f.m33021a();
        String strM33016a = location.m33016a();
        String strM35432b = C10187d.m35825m(interfaceC10585e).m35432b();
        C9801m.m32345e(strM35432b, "getFqName(scopeOwner).asString()");
        EnumC9943f enumC9943f = EnumC9943f.CLASSIFIER;
        String strM35455k = c10163f.m35455k();
        C9801m.m32345e(strM35455k, "name.asString()");
        interfaceC9940c.mo33018b(strM33016a, position, strM35432b, enumC9943f, strM35455k);
    }

    /* renamed from: b */
    public static final void m33014b(InterfaceC9940c interfaceC9940c, InterfaceC9939b interfaceC9939b, InterfaceC10604k0 interfaceC10604k0, C10163f c10163f) {
        C9801m.m32346f(interfaceC9940c, "<this>");
        C9801m.m32346f(interfaceC9939b, "from");
        C9801m.m32346f(interfaceC10604k0, "scopeOwner");
        C9801m.m32346f(c10163f, "name");
        String strM35420b = interfaceC10604k0.mo37712d().m35420b();
        C9801m.m32345e(strM35420b, "scopeOwner.fqName.asString()");
        String strM35455k = c10163f.m35455k();
        C9801m.m32345e(strM35455k, "name.asString()");
        m33015c(interfaceC9940c, interfaceC9939b, strM35420b, strM35455k);
    }

    /* renamed from: c */
    public static final void m33015c(InterfaceC9940c interfaceC9940c, InterfaceC9939b interfaceC9939b, String str, String str2) {
        InterfaceC9938a location;
        C9801m.m32346f(interfaceC9940c, "<this>");
        C9801m.m32346f(interfaceC9939b, "from");
        C9801m.m32346f(str, "packageFqName");
        C9801m.m32346f(str2, "name");
        if (interfaceC9940c == InterfaceC9940c.a.f37749a || (location = interfaceC9939b.getLocation()) == null) {
            return;
        }
        interfaceC9940c.mo33018b(location.m33016a(), interfaceC9940c.mo33017a() ? location.getPosition() : C9942e.f37774f.m33021a(), str, EnumC9943f.PACKAGE, str2);
    }
}
