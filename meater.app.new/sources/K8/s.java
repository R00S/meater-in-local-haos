package K8;

import g9.C3456a;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: EventBus.java */
/* loaded from: classes2.dex */
class s implements g9.d, g9.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<g9.b<Object>, Executor>> f8792a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue<C3456a<?>> f8793b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f8794c;

    s(Executor executor) {
        this.f8794c = executor;
    }

    private synchronized Set<Map.Entry<g9.b<Object>, Executor>> e(C3456a<?> c3456a) {
        ConcurrentHashMap<g9.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f8792a.get(c3456a.b());
        } catch (Throwable th) {
            throw th;
        }
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, C3456a c3456a) {
        ((g9.b) entry.getKey()).a(c3456a);
    }

    @Override // g9.d
    public <T> void a(Class<T> cls, g9.b<? super T> bVar) {
        b(cls, this.f8794c, bVar);
    }

    @Override // g9.d
    public synchronized <T> void b(Class<T> cls, Executor executor, g9.b<? super T> bVar) {
        try {
            z.b(cls);
            z.b(bVar);
            z.b(executor);
            if (!this.f8792a.containsKey(cls)) {
                this.f8792a.put(cls, new ConcurrentHashMap<>());
            }
            this.f8792a.get(cls).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    void d() {
        Queue<C3456a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f8793b;
                if (queue != null) {
                    this.f8793b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator<C3456a<?>> it = queue.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        }
    }

    public void g(final C3456a<?> c3456a) {
        z.b(c3456a);
        synchronized (this) {
            try {
                Queue<C3456a<?>> queue = this.f8793b;
                if (queue != null) {
                    queue.add(c3456a);
                    return;
                }
                for (final Map.Entry<g9.b<Object>, Executor> entry : e(c3456a)) {
                    entry.getValue().execute(new Runnable() { // from class: K8.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            s.f(entry, c3456a);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
