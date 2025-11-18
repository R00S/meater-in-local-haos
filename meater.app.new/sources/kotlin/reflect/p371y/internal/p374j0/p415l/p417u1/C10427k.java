package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.collections.C10820v0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;

/* compiled from: ErrorUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.k */
/* loaded from: classes3.dex */
public final class C10427k {

    /* renamed from: a */
    public static final C10427k f40355a = new C10427k();

    /* renamed from: b */
    private static final InterfaceC10592g0 f40356b = C10420d.f40237f;

    /* renamed from: c */
    private static final C10417a f40357c;

    /* renamed from: d */
    private static final AbstractC10344e0 f40358d;

    /* renamed from: e */
    private static final AbstractC10344e0 f40359e;

    /* renamed from: f */
    private static final InterfaceC10729t0 f40360f;

    /* renamed from: g */
    private static final Set<InterfaceC10729t0> f40361g;

    static {
        String str = String.format(EnumC10418b.ERROR_CLASS.m36988k(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        C9801m.m32345e(str, "format(this, *args)");
        C10163f c10163fM35451D = C10163f.m35451D(str);
        C9801m.m32345e(c10163fM35451D, "special(ErrorEntity.ERRO….format(\"unknown class\"))");
        f40357c = new C10417a(c10163fM35451D);
        f40358d = m37053d(EnumC10426j.f40349y, new String[0]);
        f40359e = m37053d(EnumC10426j.f40344v0, new String[0]);
        C10421e c10421e = new C10421e();
        f40360f = c10421e;
        f40361g = C10820v0.m38916c(c10421e);
    }

    private C10427k() {
    }

    /* renamed from: a */
    public static final C10422f m37051a(EnumC10423g enumC10423g, boolean z, String... strArr) {
        C9801m.m32346f(enumC10423g, "kind");
        C9801m.m32346f(strArr, "formatParams");
        return z ? new C10428l(enumC10423g, (String[]) Arrays.copyOf(strArr, strArr.length)) : new C10422f(enumC10423g, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: b */
    public static final C10422f m37052b(EnumC10423g enumC10423g, String... strArr) {
        C9801m.m32346f(enumC10423g, "kind");
        C9801m.m32346f(strArr, "formatParams");
        return m37051a(enumC10423g, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: d */
    public static final C10424h m37053d(EnumC10426j enumC10426j, String... strArr) {
        C9801m.m32346f(enumC10426j, "kind");
        C9801m.m32346f(strArr, "formatParams");
        return f40355a.m37060g(enumC10426j, C10817u.m38888j(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: m */
    public static final boolean m37054m(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m != null) {
            C10427k c10427k = f40355a;
            if (c10427k.m37055n(interfaceC10609m) || c10427k.m37055n(interfaceC10609m.mo32876b()) || interfaceC10609m == f40356b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m37055n(InterfaceC10609m interfaceC10609m) {
        return interfaceC10609m instanceof C10417a;
    }

    /* renamed from: o */
    public static final boolean m37056o(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            return false;
        }
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10344e0.mo35993O0();
        return (interfaceC10345e1Mo35993O0 instanceof C10425i) && ((C10425i) interfaceC10345e1Mo35993O0).m37046g() == EnumC10426j.f40270B;
    }

    /* renamed from: c */
    public final C10424h m37057c(EnumC10426j enumC10426j, InterfaceC10345e1 interfaceC10345e1, String... strArr) {
        C9801m.m32346f(enumC10426j, "kind");
        C9801m.m32346f(interfaceC10345e1, "typeConstructor");
        C9801m.m32346f(strArr, "formatParams");
        return m37059f(enumC10426j, C10817u.m38888j(), interfaceC10345e1, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: e */
    public final C10425i m37058e(EnumC10426j enumC10426j, String... strArr) {
        C9801m.m32346f(enumC10426j, "kind");
        C9801m.m32346f(strArr, "formatParams");
        return new C10425i(enumC10426j, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: f */
    public final C10424h m37059f(EnumC10426j enumC10426j, List<? extends InterfaceC10351g1> list, InterfaceC10345e1 interfaceC10345e1, String... strArr) {
        C9801m.m32346f(enumC10426j, "kind");
        C9801m.m32346f(list, "arguments");
        C9801m.m32346f(interfaceC10345e1, "typeConstructor");
        C9801m.m32346f(strArr, "formatParams");
        return new C10424h(interfaceC10345e1, m37052b(EnumC10423g.ERROR_TYPE_SCOPE, interfaceC10345e1.toString()), enumC10426j, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: g */
    public final C10424h m37060g(EnumC10426j enumC10426j, List<? extends InterfaceC10351g1> list, String... strArr) {
        C9801m.m32346f(enumC10426j, "kind");
        C9801m.m32346f(list, "arguments");
        C9801m.m32346f(strArr, "formatParams");
        return m37059f(enumC10426j, list, m37058e(enumC10426j, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: h */
    public final C10417a m37061h() {
        return f40357c;
    }

    /* renamed from: i */
    public final InterfaceC10592g0 m37062i() {
        return f40356b;
    }

    /* renamed from: j */
    public final Set<InterfaceC10729t0> m37063j() {
        return f40361g;
    }

    /* renamed from: k */
    public final AbstractC10344e0 m37064k() {
        return f40359e;
    }

    /* renamed from: l */
    public final AbstractC10344e0 m37065l() {
        return f40358d;
    }
}
