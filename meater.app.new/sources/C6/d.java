package C6;

import H6.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import s.C4391a;

/* compiled from: ModelToResourceClassCache.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<j> f2259a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final C4391a<j, List<Class<?>>> f2260b = new C4391a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        j andSet = this.f2259a.getAndSet(null);
        if (andSet == null) {
            andSet = new j(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f2260b) {
            list = this.f2260b.get(andSet);
        }
        this.f2259a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f2260b) {
            this.f2260b.put(new j(cls, cls2, cls3), list);
        }
    }
}
