package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10644d0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10646e0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10647f;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10648f0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10650g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10660l0;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10259b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10260c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10261d;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;

/* compiled from: DescriptorFactory.java */
/* renamed from: kotlin.f0.y.e.j0.i.c */
/* loaded from: classes3.dex */
public class C10186c {

    /* compiled from: DescriptorFactory.java */
    /* renamed from: kotlin.f0.y.e.j0.i.c$a */
    private static class a extends C10647f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC10585e interfaceC10585e, InterfaceC10741z0 interfaceC10741z0, boolean z) {
            super(interfaceC10585e, null, InterfaceC10620g.f40808c.m37735b(), true, InterfaceC10576b.a.DECLARATION, interfaceC10741z0);
            if (interfaceC10585e == null) {
                m35799v(0);
            }
            if (interfaceC10741z0 == null) {
                m35799v(1);
            }
            m37844r1(Collections.emptyList(), C10187d.m35823k(interfaceC10585e, z));
        }

        /* renamed from: v */
        private static /* synthetic */ void m35799v(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m35783a(int i2) {
        String str = (i2 == 12 || i2 == 23 || i2 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 12 || i2 == 23 || i2 == 25) ? 2 : 3];
        switch (i2) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
            case 32:
            case 34:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
            case 31:
            case 33:
                objArr[0] = "owner";
                break;
        }
        if (i2 == 12) {
            objArr[1] = "createSetter";
        } else if (i2 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i2 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i2) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 31:
            case 32:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 33:
            case 34:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 12 && i2 != 23 && i2 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: b */
    public static InterfaceC10735w0 m35784b(InterfaceC10573a interfaceC10573a, AbstractC10344e0 abstractC10344e0, InterfaceC10620g interfaceC10620g) {
        if (interfaceC10573a == null) {
            m35783a(31);
        }
        if (interfaceC10620g == null) {
            m35783a(32);
        }
        if (abstractC10344e0 == null) {
            return null;
        }
        return new C10648f0(interfaceC10573a, new C10260c(interfaceC10573a, abstractC10344e0, null), interfaceC10620g);
    }

    /* renamed from: c */
    public static InterfaceC10735w0 m35785c(InterfaceC10585e interfaceC10585e, AbstractC10344e0 abstractC10344e0, InterfaceC10620g interfaceC10620g) {
        if (interfaceC10585e == null) {
            m35783a(33);
        }
        if (interfaceC10620g == null) {
            m35783a(34);
        }
        if (abstractC10344e0 == null) {
            return null;
        }
        return new C10648f0(interfaceC10585e, new C10259b(interfaceC10585e, abstractC10344e0, null), interfaceC10620g);
    }

    /* renamed from: d */
    public static C10644d0 m35786d(InterfaceC10729t0 interfaceC10729t0, InterfaceC10620g interfaceC10620g) {
        if (interfaceC10729t0 == null) {
            m35783a(13);
        }
        if (interfaceC10620g == null) {
            m35783a(14);
        }
        return m35791i(interfaceC10729t0, interfaceC10620g, true, false, false);
    }

    /* renamed from: e */
    public static C10646e0 m35787e(InterfaceC10729t0 interfaceC10729t0, InterfaceC10620g interfaceC10620g, InterfaceC10620g interfaceC10620g2) {
        if (interfaceC10729t0 == null) {
            m35783a(0);
        }
        if (interfaceC10620g == null) {
            m35783a(1);
        }
        if (interfaceC10620g2 == null) {
            m35783a(2);
        }
        return m35795m(interfaceC10729t0, interfaceC10620g, interfaceC10620g2, true, false, false, interfaceC10729t0.mo32883t());
    }

    /* renamed from: f */
    public static InterfaceC10739y0 m35788f(InterfaceC10585e interfaceC10585e) {
        if (interfaceC10585e == null) {
            m35783a(24);
        }
        InterfaceC10620g.a aVar = InterfaceC10620g.f40808c;
        C10650g0 c10650g0M37848m1 = C10650g0.m37848m1(interfaceC10585e, aVar.m37735b(), C9917k.f37504e, InterfaceC10576b.a.SYNTHESIZED, interfaceC10585e.mo32883t());
        C10650g0 c10650g0M37852o1 = c10650g0M37848m1.mo37850S0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new C10660l0(c10650g0M37848m1, null, 0, aVar.m37735b(), C10163f.m35454x("value"), C10235a.m36072f(interfaceC10585e).m32784W(), false, false, false, null, interfaceC10585e.mo32883t())), interfaceC10585e.mo36400s(), EnumC10583d0.FINAL, C10728t.f41220e);
        if (c10650g0M37852o1 == null) {
            m35783a(25);
        }
        return c10650g0M37852o1;
    }

    /* renamed from: g */
    public static InterfaceC10739y0 m35789g(InterfaceC10585e interfaceC10585e) {
        if (interfaceC10585e == null) {
            m35783a(22);
        }
        C10650g0 c10650g0M37852o1 = C10650g0.m37848m1(interfaceC10585e, InterfaceC10620g.f40808c.m37735b(), C9917k.f37503d, InterfaceC10576b.a.SYNTHESIZED, interfaceC10585e.mo32883t()).mo37850S0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), C10235a.m36072f(interfaceC10585e).m32794l(EnumC10384r1.INVARIANT, interfaceC10585e.mo36400s()), EnumC10583d0.FINAL, C10728t.f41220e);
        if (c10650g0M37852o1 == null) {
            m35783a(23);
        }
        return c10650g0M37852o1;
    }

    /* renamed from: h */
    public static InterfaceC10735w0 m35790h(InterfaceC10573a interfaceC10573a, AbstractC10344e0 abstractC10344e0, InterfaceC10620g interfaceC10620g) {
        if (interfaceC10573a == null) {
            m35783a(29);
        }
        if (interfaceC10620g == null) {
            m35783a(30);
        }
        if (abstractC10344e0 == null) {
            return null;
        }
        return new C10648f0(interfaceC10573a, new C10261d(interfaceC10573a, abstractC10344e0, null), interfaceC10620g);
    }

    /* renamed from: i */
    public static C10644d0 m35791i(InterfaceC10729t0 interfaceC10729t0, InterfaceC10620g interfaceC10620g, boolean z, boolean z2, boolean z3) {
        if (interfaceC10729t0 == null) {
            m35783a(15);
        }
        if (interfaceC10620g == null) {
            m35783a(16);
        }
        return m35792j(interfaceC10729t0, interfaceC10620g, z, z2, z3, interfaceC10729t0.mo32883t());
    }

    /* renamed from: j */
    public static C10644d0 m35792j(InterfaceC10729t0 interfaceC10729t0, InterfaceC10620g interfaceC10620g, boolean z, boolean z2, boolean z3, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10729t0 == null) {
            m35783a(17);
        }
        if (interfaceC10620g == null) {
            m35783a(18);
        }
        if (interfaceC10741z0 == null) {
            m35783a(19);
        }
        return new C10644d0(interfaceC10729t0, interfaceC10620g, interfaceC10729t0.mo32879j(), interfaceC10729t0.getVisibility(), z, z2, z3, InterfaceC10576b.a.DECLARATION, null, interfaceC10741z0);
    }

    /* renamed from: k */
    public static C10647f m35793k(InterfaceC10585e interfaceC10585e, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10585e == null) {
            m35783a(20);
        }
        if (interfaceC10741z0 == null) {
            m35783a(21);
        }
        return new a(interfaceC10585e, interfaceC10741z0, false);
    }

    /* renamed from: l */
    public static C10646e0 m35794l(InterfaceC10729t0 interfaceC10729t0, InterfaceC10620g interfaceC10620g, InterfaceC10620g interfaceC10620g2, boolean z, boolean z2, boolean z3, AbstractC10730u abstractC10730u, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10729t0 == null) {
            m35783a(7);
        }
        if (interfaceC10620g == null) {
            m35783a(8);
        }
        if (interfaceC10620g2 == null) {
            m35783a(9);
        }
        if (abstractC10730u == null) {
            m35783a(10);
        }
        if (interfaceC10741z0 == null) {
            m35783a(11);
        }
        C10646e0 c10646e0 = new C10646e0(interfaceC10729t0, interfaceC10620g, interfaceC10729t0.mo32879j(), abstractC10730u, z, z2, z3, InterfaceC10576b.a.DECLARATION, null, interfaceC10741z0);
        c10646e0.m37837S0(C10646e0.m37834Q0(c10646e0, interfaceC10729t0.getType(), interfaceC10620g2));
        return c10646e0;
    }

    /* renamed from: m */
    public static C10646e0 m35795m(InterfaceC10729t0 interfaceC10729t0, InterfaceC10620g interfaceC10620g, InterfaceC10620g interfaceC10620g2, boolean z, boolean z2, boolean z3, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10729t0 == null) {
            m35783a(3);
        }
        if (interfaceC10620g == null) {
            m35783a(4);
        }
        if (interfaceC10620g2 == null) {
            m35783a(5);
        }
        if (interfaceC10741z0 == null) {
            m35783a(6);
        }
        return m35794l(interfaceC10729t0, interfaceC10620g, interfaceC10620g2, z, z2, z3, interfaceC10729t0.getVisibility(), interfaceC10741z0);
    }

    /* renamed from: n */
    private static boolean m35796n(InterfaceC10738y interfaceC10738y) {
        if (interfaceC10738y == null) {
            m35783a(28);
        }
        return interfaceC10738y.mo37030i() == InterfaceC10576b.a.SYNTHESIZED && C10187d.m35800A(interfaceC10738y.mo32876b());
    }

    /* renamed from: o */
    public static boolean m35797o(InterfaceC10738y interfaceC10738y) {
        if (interfaceC10738y == null) {
            m35783a(27);
        }
        return interfaceC10738y.getName().equals(C9917k.f37504e) && m35796n(interfaceC10738y);
    }

    /* renamed from: p */
    public static boolean m35798p(InterfaceC10738y interfaceC10738y) {
        if (interfaceC10738y == null) {
            m35783a(26);
        }
        return interfaceC10738y.getName().equals(C9917k.f37503d) && m35796n(interfaceC10738y);
    }
}
