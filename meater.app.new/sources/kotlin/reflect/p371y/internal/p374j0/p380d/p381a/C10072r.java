package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10611m1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10682r;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10679a;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10680b;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10681c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10263f;

/* compiled from: JavaDescriptorVisibilities.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.r */
/* loaded from: classes2.dex */
public class C10072r {

    /* renamed from: a */
    public static final AbstractC10730u f38302a;

    /* renamed from: b */
    public static final AbstractC10730u f38303b;

    /* renamed from: c */
    public static final AbstractC10730u f38304c;

    /* renamed from: d */
    private static final Map<AbstractC10611m1, AbstractC10730u> f38305d;

    /* compiled from: JavaDescriptorVisibilities.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.r$a */
    static class a extends AbstractC10682r {
        a(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m33795g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            if (interfaceC10677q == null) {
                m33795g(0);
            }
            if (interfaceC10609m == null) {
                m33795g(1);
            }
            return C10072r.m33791d(interfaceC10677q, interfaceC10609m);
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.r$b */
    static class b extends AbstractC10682r {
        b(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m33797g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            if (interfaceC10677q == null) {
                m33797g(0);
            }
            if (interfaceC10609m == null) {
                m33797g(1);
            }
            return C10072r.m33792e(interfaceC10263f, interfaceC10677q, interfaceC10609m);
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.r$c */
    static class c extends AbstractC10682r {
        c(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m33798g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            if (interfaceC10677q == null) {
                m33798g(0);
            }
            if (interfaceC10609m == null) {
                m33798g(1);
            }
            return C10072r.m33792e(interfaceC10263f, interfaceC10677q, interfaceC10609m);
        }
    }

    static {
        a aVar = new a(C10679a.f41130c);
        f38302a = aVar;
        b bVar = new b(C10681c.f41132c);
        f38303b = bVar;
        c cVar = new c(C10680b.f41131c);
        f38304c = cVar;
        f38305d = new HashMap();
        m33793f(aVar);
        m33793f(bVar);
        m33793f(cVar);
    }

    /* renamed from: a */
    private static /* synthetic */ void m33788a(int i2) {
        String str = (i2 == 5 || i2 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 5 || i2 == 6) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i2 == 5 || i2 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i2 == 2 || i2 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i2 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i2 != 5 && i2 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 5 && i2 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m33791d(InterfaceC10609m interfaceC10609m, InterfaceC10609m interfaceC10609m2) {
        if (interfaceC10609m == null) {
            m33788a(2);
        }
        if (interfaceC10609m2 == null) {
            m33788a(3);
        }
        InterfaceC10604k0 interfaceC10604k0 = (InterfaceC10604k0) C10187d.m35830r(interfaceC10609m, InterfaceC10604k0.class, false);
        InterfaceC10604k0 interfaceC10604k02 = (InterfaceC10604k0) C10187d.m35830r(interfaceC10609m2, InterfaceC10604k0.class, false);
        return (interfaceC10604k02 == null || interfaceC10604k0 == null || !interfaceC10604k0.mo37712d().equals(interfaceC10604k02.mo37712d())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m33792e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m) {
        if (interfaceC10677q == null) {
            m33788a(0);
        }
        if (interfaceC10609m == null) {
            m33788a(1);
        }
        if (m33791d(C10187d.m35812M(interfaceC10677q), interfaceC10609m)) {
            return true;
        }
        return C10728t.f41218c.mo33796e(interfaceC10263f, interfaceC10677q, interfaceC10609m, false);
    }

    /* renamed from: f */
    private static void m33793f(AbstractC10730u abstractC10730u) {
        f38305d.put(abstractC10730u.mo38007b(), abstractC10730u);
    }

    /* renamed from: g */
    public static AbstractC10730u m33794g(AbstractC10611m1 abstractC10611m1) {
        if (abstractC10611m1 == null) {
            m33788a(4);
        }
        AbstractC10730u abstractC10730u = f38305d.get(abstractC10611m1);
        if (abstractC10730u != null) {
            return abstractC10730u;
        }
        AbstractC10730u abstractC10730uM38135j = C10728t.m38135j(abstractC10611m1);
        if (abstractC10730uM38135j == null) {
            m33788a(5);
        }
        return abstractC10730uM38135j;
    }
}
