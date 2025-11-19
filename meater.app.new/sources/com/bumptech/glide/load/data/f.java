package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final e.a<?> f33039b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f33040a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    class a implements e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e<Object> build(Object obj) {
            return new b(obj);
        }
    }

    public synchronized <T> e<T> a(T t10) {
        e.a<?> aVar;
        try {
            H6.k.d(t10);
            aVar = this.f33040a.get(t10.getClass());
            if (aVar == null) {
                Iterator<e.a<?>> it = this.f33040a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.a().isAssignableFrom(t10.getClass())) {
                        aVar = next;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f33039b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (e<T>) aVar.build(t10);
    }

    public synchronized void b(e.a<?> aVar) {
        this.f33040a.put(aVar.a(), aVar);
    }

    /* compiled from: DataRewinderRegistry.java */
    private static final class b implements e<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f33041a;

        b(Object obj) {
            this.f33041a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f33041a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }
}
