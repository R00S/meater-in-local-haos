package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10773s;
import kotlin.collections.C10782c0;
import kotlin.collections.C10804n0;
import kotlin.collections.C10808p0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10813s;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10623j;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p375b.p376p.EnumC9924c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10217m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10226v;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10336b1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: functionTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.b.g */
/* loaded from: classes2.dex */
public final class C9913g {
    /* renamed from: a */
    public static final int m32705a(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        InterfaceC10616c interfaceC10616cMo33271l = abstractC10344e0.getAnnotations().mo33271l(C9917k.a.f37530D);
        if (interfaceC10616cMo33271l == null) {
            return 0;
        }
        AbstractC10211g abstractC10211g = (AbstractC10211g) C10804n0.m38779j(interfaceC10616cMo33271l.mo33159a(), C9917k.f37508i);
        C9801m.m32344d(abstractC10211g, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((C10217m) abstractC10211g).mo36023b().intValue();
    }

    /* renamed from: b */
    public static final AbstractC10368m0 m32706b(AbstractC9914h abstractC9914h, InterfaceC10620g interfaceC10620g, AbstractC10344e0 abstractC10344e0, List<? extends AbstractC10344e0> list, List<? extends AbstractC10344e0> list2, List<C10163f> list3, AbstractC10344e0 abstractC10344e02, boolean z) {
        C9801m.m32346f(abstractC9914h, "builtIns");
        C9801m.m32346f(interfaceC10620g, "annotations");
        C9801m.m32346f(list, "contextReceiverTypes");
        C9801m.m32346f(list2, "parameterTypes");
        C9801m.m32346f(abstractC10344e02, "returnType");
        List<InterfaceC10351g1> listM32711g = m32711g(abstractC10344e0, list, list2, list3, abstractC10344e02, abstractC9914h);
        InterfaceC10585e interfaceC10585eM32710f = m32710f(abstractC9914h, list2.size() + list.size() + (abstractC10344e0 == null ? 0 : 1), z);
        if (abstractC10344e0 != null) {
            interfaceC10620g = m32724t(interfaceC10620g, abstractC9914h);
        }
        if (!list.isEmpty()) {
            interfaceC10620g = m32723s(interfaceC10620g, abstractC9914h, list.size());
        }
        return C10347f0.m36667g(C10336b1.m36587b(interfaceC10620g), interfaceC10585eM32710f, listM32711g);
    }

    /* renamed from: d */
    public static final C10163f m32708d(AbstractC10344e0 abstractC10344e0) {
        String strMo36023b;
        C9801m.m32346f(abstractC10344e0, "<this>");
        InterfaceC10616c interfaceC10616cMo33271l = abstractC10344e0.getAnnotations().mo33271l(C9917k.a.f37532E);
        if (interfaceC10616cMo33271l == null) {
            return null;
        }
        Object objM38868t0 = C10813s.m38868t0(interfaceC10616cMo33271l.mo33159a().values());
        C10226v c10226v = objM38868t0 instanceof C10226v ? (C10226v) objM38868t0 : null;
        if (c10226v != null && (strMo36023b = c10226v.mo36023b()) != null) {
            if (!C10163f.m35450A(strMo36023b)) {
                strMo36023b = null;
            }
            if (strMo36023b != null) {
                return C10163f.m35454x(strMo36023b);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final List<AbstractC10344e0> m32709e(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        m32719o(abstractC10344e0);
        int iM32705a = m32705a(abstractC10344e0);
        if (iM32705a == 0) {
            return C10817u.m38888j();
        }
        List<InterfaceC10351g1> listSubList = abstractC10344e0.mo35991M0().subList(0, iM32705a);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            AbstractC10344e0 type = ((InterfaceC10351g1) it.next()).getType();
            C9801m.m32345e(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final InterfaceC10585e m32710f(AbstractC9914h abstractC9914h, int i2, boolean z) {
        C9801m.m32346f(abstractC9914h, "builtIns");
        InterfaceC10585e interfaceC10585eM32785X = z ? abstractC9914h.m32785X(i2) : abstractC9914h.m32767C(i2);
        C9801m.m32345e(interfaceC10585eM32785X, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return interfaceC10585eM32785X;
    }

    /* renamed from: g */
    public static final List<InterfaceC10351g1> m32711g(AbstractC10344e0 abstractC10344e0, List<? extends AbstractC10344e0> list, List<? extends AbstractC10344e0> list2, List<C10163f> list3, AbstractC10344e0 abstractC10344e02, AbstractC9914h abstractC9914h) {
        C10163f c10163f;
        C9801m.m32346f(list, "contextReceiverTypes");
        C9801m.m32346f(list2, "parameterTypes");
        C9801m.m32346f(abstractC10344e02, "returnType");
        C9801m.m32346f(abstractC9914h, "builtIns");
        int i2 = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (abstractC10344e0 != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(C10457a.m37135a((AbstractC10344e0) it.next()));
        }
        arrayList.addAll(arrayList2);
        C10767a.m38508a(arrayList, abstractC10344e0 != null ? C10457a.m37135a(abstractC10344e0) : null);
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C10817u.m38898t();
            }
            AbstractC10344e0 abstractC10344e0M37155u = (AbstractC10344e0) obj;
            if (list3 == null || (c10163f = list3.get(i2)) == null || c10163f.m35458y()) {
                c10163f = null;
            }
            if (c10163f != null) {
                C10160c c10160c = C9917k.a.f37532E;
                C10163f c10163fM35454x = C10163f.m35454x("name");
                String strM35455k = c10163f.m35455k();
                C9801m.m32345e(strM35455k, "name.asString()");
                abstractC10344e0M37155u = C10457a.m37155u(abstractC10344e0M37155u, InterfaceC10620g.f40808c.m37734a(C10782c0.m38608n0(abstractC10344e0M37155u.getAnnotations(), new C10623j(abstractC9914h, c10160c, C10808p0.m38794f(C10773s.m38547a(c10163fM35454x, new C10226v(strM35455k)))))));
            }
            arrayList.add(C10457a.m37135a(abstractC10344e0M37155u));
            i2 = i3;
        }
        arrayList.add(C10457a.m37135a(abstractC10344e02));
        return arrayList;
    }

    /* renamed from: h */
    public static final EnumC9924c m32712h(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        if ((interfaceC10609m instanceof InterfaceC10585e) && AbstractC9914h.m32726A0(interfaceC10609m)) {
            return m32713i(C10235a.m36075i(interfaceC10609m));
        }
        return null;
    }

    /* renamed from: i */
    private static final EnumC9924c m32713i(C10161d c10161d) {
        if (!c10161d.m35435f() || c10161d.m35434e()) {
            return null;
        }
        EnumC9924c.a aVar = EnumC9924c.f37649f;
        String strM35455k = c10161d.m35438i().m35455k();
        C9801m.m32345e(strM35455k, "shortName().asString()");
        C10160c c10160cM35423e = c10161d.m35441l().m35423e();
        C9801m.m32345e(c10160cM35423e, "toSafe().parent()");
        return aVar.m32899b(strM35455k, c10160cM35423e);
    }

    /* renamed from: j */
    public static final AbstractC10344e0 m32714j(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        m32719o(abstractC10344e0);
        if (!m32722r(abstractC10344e0)) {
            return null;
        }
        return abstractC10344e0.mo35991M0().get(m32705a(abstractC10344e0)).getType();
    }

    /* renamed from: k */
    public static final AbstractC10344e0 m32715k(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        m32719o(abstractC10344e0);
        AbstractC10344e0 type = ((InterfaceC10351g1) C10813s.m38844g0(abstractC10344e0.mo35991M0())).getType();
        C9801m.m32345e(type, "arguments.last().type");
        return type;
    }

    /* renamed from: l */
    public static final List<InterfaceC10351g1> m32716l(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        m32719o(abstractC10344e0);
        return abstractC10344e0.mo35991M0().subList(m32705a(abstractC10344e0) + (m32717m(abstractC10344e0) ? 1 : 0), r0.size() - 1);
    }

    /* renamed from: m */
    public static final boolean m32717m(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        return m32719o(abstractC10344e0) && m32722r(abstractC10344e0);
    }

    /* renamed from: n */
    public static final boolean m32718n(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        EnumC9924c enumC9924cM32712h = m32712h(interfaceC10609m);
        return enumC9924cM32712h == EnumC9924c.f37650g || enumC9924cM32712h == EnumC9924c.f37651h;
    }

    /* renamed from: o */
    public static final boolean m32719o(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
        return interfaceC10594hMo32891w != null && m32718n(interfaceC10594hMo32891w);
    }

    /* renamed from: p */
    public static final boolean m32720p(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
        return (interfaceC10594hMo32891w != null ? m32712h(interfaceC10594hMo32891w) : null) == EnumC9924c.f37650g;
    }

    /* renamed from: q */
    public static final boolean m32721q(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
        return (interfaceC10594hMo32891w != null ? m32712h(interfaceC10594hMo32891w) : null) == EnumC9924c.f37651h;
    }

    /* renamed from: r */
    private static final boolean m32722r(AbstractC10344e0 abstractC10344e0) {
        return abstractC10344e0.getAnnotations().mo33271l(C9917k.a.f37528C) != null;
    }

    /* renamed from: s */
    public static final InterfaceC10620g m32723s(InterfaceC10620g interfaceC10620g, AbstractC9914h abstractC9914h, int i2) {
        C9801m.m32346f(interfaceC10620g, "<this>");
        C9801m.m32346f(abstractC9914h, "builtIns");
        C10160c c10160c = C9917k.a.f37530D;
        return interfaceC10620g.mo33270R0(c10160c) ? interfaceC10620g : InterfaceC10620g.f40808c.m37734a(C10782c0.m38608n0(interfaceC10620g, new C10623j(abstractC9914h, c10160c, C10808p0.m38794f(C10773s.m38547a(C9917k.f37508i, new C10217m(i2))))));
    }

    /* renamed from: t */
    public static final InterfaceC10620g m32724t(InterfaceC10620g interfaceC10620g, AbstractC9914h abstractC9914h) {
        C9801m.m32346f(interfaceC10620g, "<this>");
        C9801m.m32346f(abstractC9914h, "builtIns");
        C10160c c10160c = C9917k.a.f37528C;
        return interfaceC10620g.mo33270R0(c10160c) ? interfaceC10620g : InterfaceC10620g.f40808c.m37734a(C10782c0.m38608n0(interfaceC10620g, new C10623j(abstractC9914h, c10160c, C10810q0.m38797i())));
    }
}
