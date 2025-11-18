package p241e.p254e.p256b.p257a.p258i.p264x.p265a;

import javax.inject.Provider;

/* compiled from: DoubleCheck.java */
/* renamed from: e.e.b.a.i.x.a.a */
/* loaded from: classes2.dex */
public final class C8881a<T> implements Provider<T> {

    /* renamed from: a */
    private static final Object f33627a = new Object();

    /* renamed from: b */
    private volatile Provider<T> f33628b;

    /* renamed from: c */
    private volatile Object f33629c = f33627a;

    private C8881a(Provider<T> provider) {
        this.f33628b = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> Provider<T> m28184a(P p) {
        C8884d.m28188b(p);
        return p instanceof C8881a ? p : new C8881a(p);
    }

    /* renamed from: b */
    public static Object m28185b(Object obj, Object obj2) {
        if (!(obj != f33627a) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f33629c;
        Object obj = f33627a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f33629c;
                if (t == obj) {
                    t = this.f33628b.get();
                    this.f33629c = m28185b(this.f33629c, t);
                    this.f33628b = null;
                }
            }
        }
        return t;
    }
}
