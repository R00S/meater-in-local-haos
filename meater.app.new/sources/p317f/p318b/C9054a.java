package p317f.p318b;

import javax.inject.Provider;

/* compiled from: DoubleCheck.java */
/* renamed from: f.b.a */
/* loaded from: classes2.dex */
public final class C9054a<T> implements Provider<T> {

    /* renamed from: a */
    private static final Object f34882a = new Object();

    /* renamed from: b */
    private volatile Provider<T> f34883b;

    /* renamed from: c */
    private volatile Object f34884c = f34882a;

    private C9054a(Provider<T> provider) {
        this.f34883b = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> Provider<T> m29108a(P p) {
        C9055b.m29111b(p);
        return p instanceof C9054a ? p : new C9054a(p);
    }

    /* renamed from: b */
    private static Object m29109b(Object obj, Object obj2) {
        if (!(obj != f34882a) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f34884c;
        Object obj = f34882a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f34884c;
                if (t == obj) {
                    t = this.f34883b.get();
                    this.f34884c = m29109b(this.f34884c, t);
                    this.f34883b = null;
                }
            }
        }
        return t;
    }
}
