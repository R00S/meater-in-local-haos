package ab;

import kotlin.jvm.internal.C3862t;
import qb.b;

/* compiled from: JvmAbi.kt */
/* renamed from: ab.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1927H {

    /* renamed from: a, reason: collision with root package name */
    public static final C1927H f20134a = new C1927H();

    /* renamed from: b, reason: collision with root package name */
    public static final qb.c f20135b;

    /* renamed from: c, reason: collision with root package name */
    public static final qb.b f20136c;

    /* renamed from: d, reason: collision with root package name */
    private static final qb.b f20137d;

    /* renamed from: e, reason: collision with root package name */
    private static final qb.b f20138e;

    static {
        qb.c cVar = new qb.c("kotlin.jvm.JvmField");
        f20135b = cVar;
        b.a aVar = qb.b.f48178d;
        f20136c = aVar.c(cVar);
        f20137d = aVar.c(new qb.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f20138e = b.a.b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    private C1927H() {
    }

    public static final String b(String propertyName) {
        C3862t.g(propertyName, "propertyName");
        if (f(propertyName)) {
            return propertyName;
        }
        return "get" + Pb.a.a(propertyName);
    }

    public static final boolean c(String name) {
        C3862t.g(name, "name");
        return Ub.n.G(name, "get", false, 2, null) || Ub.n.G(name, "is", false, 2, null);
    }

    public static final boolean d(String name) {
        C3862t.g(name, "name");
        return Ub.n.G(name, "set", false, 2, null);
    }

    public static final String e(String propertyName) {
        String strA;
        C3862t.g(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(propertyName)) {
            strA = propertyName.substring(2);
            C3862t.f(strA, "substring(...)");
        } else {
            strA = Pb.a.a(propertyName);
        }
        sb2.append(strA);
        return sb2.toString();
    }

    public static final boolean f(String name) {
        C3862t.g(name, "name");
        if (!Ub.n.G(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return C3862t.i(97, cCharAt) > 0 || C3862t.i(cCharAt, 122) > 0;
    }

    public final qb.b a() {
        return f20138e;
    }
}
