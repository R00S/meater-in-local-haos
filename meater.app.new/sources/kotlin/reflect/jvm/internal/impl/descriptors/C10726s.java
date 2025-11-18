package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;

/* compiled from: descriptorUtil.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.s */
/* loaded from: classes2.dex */
public final class C10726s {
    /* renamed from: a */
    public static final InterfaceC10594h m38123a(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10609m.mo32876b();
        if (interfaceC10609mMo32876b == null || (interfaceC10609m instanceof InterfaceC10604k0)) {
            return null;
        }
        if (!m38124b(interfaceC10609mMo32876b)) {
            return m38123a(interfaceC10609mMo32876b);
        }
        if (interfaceC10609mMo32876b instanceof InterfaceC10594h) {
            return (InterfaceC10594h) interfaceC10609mMo32876b;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m38124b(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        return interfaceC10609m.mo32876b() instanceof InterfaceC10604k0;
    }

    /* renamed from: c */
    public static final InterfaceC10585e m38125c(InterfaceC10592g0 interfaceC10592g0, C10160c c10160c, InterfaceC9939b interfaceC9939b) {
        InterfaceC10594h interfaceC10594hMo33316f;
        InterfaceC10251h interfaceC10251hMo33348y0;
        C9801m.m32346f(interfaceC10592g0, "<this>");
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(interfaceC9939b, "lookupLocation");
        if (c10160c.m35422d()) {
            return null;
        }
        C10160c c10160cM35423e = c10160c.m35423e();
        C9801m.m32345e(c10160cM35423e, "fqName.parent()");
        InterfaceC10251h interfaceC10251hMo37751q = interfaceC10592g0.mo37018N(c10160cM35423e).mo37751q();
        C10163f c10163fM35425g = c10160c.m35425g();
        C9801m.m32345e(c10163fM35425g, "fqName.shortName()");
        InterfaceC10594h interfaceC10594hMo33316f2 = interfaceC10251hMo37751q.mo33316f(c10163fM35425g, interfaceC9939b);
        InterfaceC10585e interfaceC10585e = interfaceC10594hMo33316f2 instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10594hMo33316f2 : null;
        if (interfaceC10585e != null) {
            return interfaceC10585e;
        }
        C10160c c10160cM35423e2 = c10160c.m35423e();
        C9801m.m32345e(c10160cM35423e2, "fqName.parent()");
        InterfaceC10585e interfaceC10585eM38125c = m38125c(interfaceC10592g0, c10160cM35423e2, interfaceC9939b);
        if (interfaceC10585eM38125c == null || (interfaceC10251hMo33348y0 = interfaceC10585eM38125c.mo33348y0()) == null) {
            interfaceC10594hMo33316f = null;
        } else {
            C10163f c10163fM35425g2 = c10160c.m35425g();
            C9801m.m32345e(c10163fM35425g2, "fqName.shortName()");
            interfaceC10594hMo33316f = interfaceC10251hMo33348y0.mo33316f(c10163fM35425g2, interfaceC9939b);
        }
        if (interfaceC10594hMo33316f instanceof InterfaceC10585e) {
            return (InterfaceC10585e) interfaceC10594hMo33316f;
        }
        return null;
    }
}
