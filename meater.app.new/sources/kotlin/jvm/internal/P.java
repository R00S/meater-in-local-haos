package kotlin.jvm.internal;

import La.b1;

/* compiled from: Reflection.java */
/* loaded from: classes2.dex */
public class P {

    /* renamed from: a, reason: collision with root package name */
    private static final Q f43979a;

    /* renamed from: b, reason: collision with root package name */
    private static final Ia.d[] f43980b;

    static {
        Q q10 = null;
        try {
            q10 = (Q) b1.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (q10 == null) {
            q10 = new Q();
        }
        f43979a = q10;
        f43980b = new Ia.d[0];
    }

    public static Ia.h a(C3859p c3859p) {
        return f43979a.a(c3859p);
    }

    public static Ia.d b(Class cls) {
        return f43979a.b(cls);
    }

    public static Ia.g c(Class cls) {
        return f43979a.c(cls, "");
    }

    public static Ia.g d(Class cls, String str) {
        return f43979a.c(cls, str);
    }

    public static Ia.j e(AbstractC3866x abstractC3866x) {
        return f43979a.d(abstractC3866x);
    }

    public static Ia.k f(z zVar) {
        return f43979a.e(zVar);
    }

    public static Ia.n g(D d10) {
        return f43979a.f(d10);
    }

    public static Ia.o h(F f10) {
        return f43979a.g(f10);
    }

    public static Ia.p i(H h10) {
        return f43979a.h(h10);
    }

    public static String j(InterfaceC3858o interfaceC3858o) {
        return f43979a.i(interfaceC3858o);
    }

    public static String k(AbstractC3864v abstractC3864v) {
        return f43979a.j(abstractC3864v);
    }
}
