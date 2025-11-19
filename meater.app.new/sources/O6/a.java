package O6;

import ma.InterfaceC4015a;

/* compiled from: DoubleCheck.java */
/* loaded from: classes2.dex */
public final class a<T> implements InterfaceC4015a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f13286c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC4015a<T> f13287a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f13288b = f13286c;

    private a(InterfaceC4015a<T> interfaceC4015a) {
        this.f13287a = interfaceC4015a;
    }

    public static <P extends InterfaceC4015a<T>, T> InterfaceC4015a<T> a(P p10) {
        d.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f13286c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ma.InterfaceC4015a
    public T get() {
        T t10 = (T) this.f13288b;
        Object obj = f13286c;
        if (t10 == obj) {
            synchronized (this) {
                try {
                    t10 = (T) this.f13288b;
                    if (t10 == obj) {
                        t10 = this.f13287a.get();
                        this.f13288b = b(this.f13288b, t10);
                        this.f13287a = null;
                    }
                } finally {
                }
            }
        }
        return t10;
    }
}
