package ea;

import ma.InterfaceC4015a;

/* compiled from: DoubleCheck.java */
/* renamed from: ea.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3263a<T> implements InterfaceC4015a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f40804c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC4015a<T> f40805a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f40806b = f40804c;

    private C3263a(InterfaceC4015a<T> interfaceC4015a) {
        this.f40805a = interfaceC4015a;
    }

    public static <P extends InterfaceC4015a<T>, T> InterfaceC4015a<T> a(P p10) {
        C3264b.b(p10);
        return p10 instanceof C3263a ? p10 : new C3263a(p10);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f40804c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ma.InterfaceC4015a
    public T get() {
        T t10 = (T) this.f40806b;
        Object obj = f40804c;
        if (t10 == obj) {
            synchronized (this) {
                try {
                    t10 = (T) this.f40806b;
                    if (t10 == obj) {
                        t10 = this.f40805a.get();
                        this.f40806b = b(this.f40806b, t10);
                        this.f40805a = null;
                    }
                } finally {
                }
            }
        }
        return t10;
    }
}
