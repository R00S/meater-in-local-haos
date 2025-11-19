package K8;

import j9.InterfaceC3755b;

/* compiled from: Lazy.java */
/* loaded from: classes2.dex */
public class t<T> implements InterfaceC3755b<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f8795c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f8796a = f8795c;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC3755b<T> f8797b;

    public t(InterfaceC3755b<T> interfaceC3755b) {
        this.f8797b = interfaceC3755b;
    }

    @Override // j9.InterfaceC3755b
    public T get() {
        T t10 = (T) this.f8796a;
        Object obj = f8795c;
        if (t10 == obj) {
            synchronized (this) {
                try {
                    t10 = (T) this.f8796a;
                    if (t10 == obj) {
                        t10 = this.f8797b.get();
                        this.f8796a = t10;
                        this.f8797b = null;
                    }
                } finally {
                }
            }
        }
        return t10;
    }
}
