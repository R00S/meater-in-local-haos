package kotlin.jvm.internal;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes2.dex */
public class Q {
    public Ia.d b(Class cls) {
        return new C3852i(cls);
    }

    public Ia.g c(Class cls, String str) {
        return new C(cls, str);
    }

    public String i(InterfaceC3858o interfaceC3858o) {
        String string = interfaceC3858o.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(AbstractC3864v abstractC3864v) {
        return i(abstractC3864v);
    }

    public Ia.h a(C3859p c3859p) {
        return c3859p;
    }

    public Ia.j d(AbstractC3866x abstractC3866x) {
        return abstractC3866x;
    }

    public Ia.k e(z zVar) {
        return zVar;
    }

    public Ia.n f(D d10) {
        return d10;
    }

    public Ia.o g(F f10) {
        return f10;
    }

    public Ia.p h(H h10) {
        return h10;
    }
}
