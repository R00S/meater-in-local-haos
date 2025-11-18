package ab;

import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1704q;
import Ra.x0;
import java.util.HashMap;
import java.util.Map;
import tb.C4597i;

/* compiled from: JavaDescriptorVisibilities.java */
/* loaded from: classes3.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1707u f20282a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1707u f20283b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1707u f20284c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<x0, AbstractC1707u> f20285d;

    /* compiled from: JavaDescriptorVisibilities.java */
    static class a extends Ra.r {
        a(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "fromPackage";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            if (interfaceC1704q == null) {
                g(0);
            }
            if (interfaceC1700m == null) {
                g(1);
            }
            return y.d(interfaceC1704q, interfaceC1700m);
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    static class b extends Ra.r {
        b(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            if (interfaceC1704q == null) {
                g(0);
            }
            if (interfaceC1700m == null) {
                g(1);
            }
            return y.e(gVar, interfaceC1704q, interfaceC1700m);
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    static class c extends Ra.r {
        c(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            if (interfaceC1704q == null) {
                g(0);
            }
            if (interfaceC1700m == null) {
                g(1);
            }
            return y.e(gVar, interfaceC1704q, interfaceC1700m);
        }
    }

    static {
        a aVar = new a(Va.a.f18233c);
        f20282a = aVar;
        b bVar = new b(Va.c.f18235c);
        f20283b = bVar;
        c cVar = new c(Va.b.f18234c);
        f20284c = cVar;
        f20285d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
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
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2) {
        if (interfaceC1700m == null) {
            a(2);
        }
        if (interfaceC1700m2 == null) {
            a(3);
        }
        Ra.N n10 = (Ra.N) C4597i.r(interfaceC1700m, Ra.N.class, false);
        Ra.N n11 = (Ra.N) C4597i.r(interfaceC1700m2, Ra.N.class, false);
        return (n11 == null || n10 == null || !n10.f().equals(n11.f())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m) {
        if (interfaceC1704q == null) {
            a(0);
        }
        if (interfaceC1700m == null) {
            a(1);
        }
        if (d(C4597i.M(interfaceC1704q), interfaceC1700m)) {
            return true;
        }
        return C1706t.f15168c.e(gVar, interfaceC1704q, interfaceC1700m, false);
    }

    private static void f(AbstractC1707u abstractC1707u) {
        f20285d.put(abstractC1707u.b(), abstractC1707u);
    }

    public static AbstractC1707u g(x0 x0Var) {
        if (x0Var == null) {
            a(4);
        }
        AbstractC1707u abstractC1707u = f20285d.get(x0Var);
        if (abstractC1707u != null) {
            return abstractC1707u;
        }
        AbstractC1707u abstractC1707uJ = C1706t.j(x0Var);
        if (abstractC1707uJ == null) {
            a(5);
        }
        return abstractC1707uJ;
    }
}
