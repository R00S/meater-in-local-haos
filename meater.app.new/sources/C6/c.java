package C6;

import H6.j;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.q;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import s.C4391a;
import z6.g;

/* compiled from: LoadPathCache.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final q<?, ?, ?> f2256c = new q<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final C4391a<j, q<?, ?, ?>> f2257a = new C4391a<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<j> f2258b = new AtomicReference<>();

    private j b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        j andSet = this.f2258b.getAndSet(null);
        if (andSet == null) {
            andSet = new j();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> qVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f2257a) {
            qVar = (q) this.f2257a.get(jVarB);
        }
        this.f2258b.set(jVarB);
        return qVar;
    }

    public boolean c(q<?, ?, ?> qVar) {
        return f2256c.equals(qVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, q<?, ?, ?> qVar) {
        synchronized (this.f2257a) {
            C4391a<j, q<?, ?, ?>> c4391a = this.f2257a;
            j jVar = new j(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f2256c;
            }
            c4391a.put(jVar, qVar);
        }
    }
}
