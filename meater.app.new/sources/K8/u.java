package K8;

import j9.InterfaceC3755b;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LazySet.java */
/* loaded from: classes2.dex */
class u<T> implements InterfaceC3755b<Set<T>> {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set<T> f8799b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set<InterfaceC3755b<T>> f8798a = Collections.newSetFromMap(new ConcurrentHashMap());

    u(Collection<InterfaceC3755b<T>> collection) {
        this.f8798a.addAll(collection);
    }

    static u<?> b(Collection<InterfaceC3755b<?>> collection) {
        return new u<>((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator<InterfaceC3755b<T>> it = this.f8798a.iterator();
            while (it.hasNext()) {
                this.f8799b.add(it.next().get());
            }
            this.f8798a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(InterfaceC3755b<T> interfaceC3755b) {
        try {
            if (this.f8799b == null) {
                this.f8798a.add(interfaceC3755b);
            } else {
                this.f8799b.add(interfaceC3755b.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // j9.InterfaceC3755b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f8799b == null) {
            synchronized (this) {
                try {
                    if (this.f8799b == null) {
                        this.f8799b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f8799b);
    }
}
