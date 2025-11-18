package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C10773s;
import kotlin.collections.C10782c0;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;

/* compiled from: UnsignedType.kt */
/* renamed from: kotlin.f0.y.e.j0.b.o */
/* loaded from: classes2.dex */
public final class C9921o {

    /* renamed from: a */
    public static final C9921o f37628a = new C9921o();

    /* renamed from: b */
    private static final Set<C10163f> f37629b;

    /* renamed from: c */
    private static final Set<C10163f> f37630c;

    /* renamed from: d */
    private static final HashMap<C10159b, C10159b> f37631d;

    /* renamed from: e */
    private static final HashMap<C10159b, C10159b> f37632e;

    /* renamed from: f */
    private static final HashMap<EnumC9919m, C10163f> f37633f;

    /* renamed from: g */
    private static final Set<C10163f> f37634g;

    static {
        EnumC9920n[] enumC9920nArrValues = EnumC9920n.values();
        ArrayList arrayList = new ArrayList(enumC9920nArrValues.length);
        for (EnumC9920n enumC9920n : enumC9920nArrValues) {
            arrayList.add(enumC9920n.m32843u());
        }
        f37629b = C10782c0.m38574I0(arrayList);
        EnumC9919m[] enumC9919mArrValues = EnumC9919m.values();
        ArrayList arrayList2 = new ArrayList(enumC9919mArrValues.length);
        for (EnumC9919m enumC9919m : enumC9919mArrValues) {
            arrayList2.add(enumC9919m.m32839k());
        }
        f37630c = C10782c0.m38574I0(arrayList2);
        f37631d = new HashMap<>();
        f37632e = new HashMap<>();
        f37633f = C10810q0.m38799k(C10773s.m38547a(EnumC9919m.f37613f, C10163f.m35454x("ubyteArrayOf")), C10773s.m38547a(EnumC9919m.f37614g, C10163f.m35454x("ushortArrayOf")), C10773s.m38547a(EnumC9919m.f37615h, C10163f.m35454x("uintArrayOf")), C10773s.m38547a(EnumC9919m.f37616i, C10163f.m35454x("ulongArrayOf")));
        EnumC9920n[] enumC9920nArrValues2 = EnumC9920n.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC9920n enumC9920n2 : enumC9920nArrValues2) {
            linkedHashSet.add(enumC9920n2.m32841k().m35415j());
        }
        f37634g = linkedHashSet;
        for (EnumC9920n enumC9920n3 : EnumC9920n.values()) {
            f37631d.put(enumC9920n3.m32841k(), enumC9920n3.m32842q());
            f37632e.put(enumC9920n3.m32842q(), enumC9920n3.m32841k());
        }
    }

    private C9921o() {
    }

    /* renamed from: d */
    public static final boolean m32844d(AbstractC10344e0 abstractC10344e0) {
        InterfaceC10594h interfaceC10594hMo32887c;
        C9801m.m32346f(abstractC10344e0, "type");
        if (C10372n1.m36789v(abstractC10344e0) || (interfaceC10594hMo32887c = abstractC10344e0.mo35993O0().mo32891w()) == null) {
            return false;
        }
        return f37628a.m32847c(interfaceC10594hMo32887c);
    }

    /* renamed from: a */
    public final C10159b m32845a(C10159b c10159b) {
        C9801m.m32346f(c10159b, "arrayClassId");
        return f37631d.get(c10159b);
    }

    /* renamed from: b */
    public final boolean m32846b(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        return f37634g.contains(c10163f);
    }

    /* renamed from: c */
    public final boolean m32847c(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "descriptor");
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10609m.mo32876b();
        return (interfaceC10609mMo32876b instanceof InterfaceC10604k0) && C9801m.m32341a(((InterfaceC10604k0) interfaceC10609mMo32876b).mo37712d(), C9917k.f37517r) && f37629b.contains(interfaceC10609m.getName());
    }
}
