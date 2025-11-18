package com.bumptech.glide.load.p127m;

import com.bumptech.glide.load.p127m.InterfaceC5434e;
import com.bumptech.glide.p145r.C5596j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DataRewinderRegistry.java */
/* renamed from: com.bumptech.glide.load.m.f */
/* loaded from: classes.dex */
public class C5435f {

    /* renamed from: a */
    private static final InterfaceC5434e.a<?> f13570a = new a();

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC5434e.a<?>> f13571b = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    /* renamed from: com.bumptech.glide.load.m.f$a */
    class a implements InterfaceC5434e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5434e.a
        /* renamed from: a */
        public Class<Object> mo10470a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5434e.a
        /* renamed from: b */
        public InterfaceC5434e<Object> mo10471b(Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    /* renamed from: com.bumptech.glide.load.m.f$b */
    private static final class b implements InterfaceC5434e<Object> {

        /* renamed from: a */
        private final Object f13572a;

        b(Object obj) {
            this.f13572a = obj;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5434e
        /* renamed from: a */
        public Object mo10468a() {
            return this.f13572a;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5434e
        /* renamed from: b */
        public void mo10469b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> InterfaceC5434e<T> m10472a(T t) {
        InterfaceC5434e.a<?> aVar;
        C5596j.m11042d(t);
        aVar = this.f13571b.get(t.getClass());
        if (aVar == null) {
            Iterator<InterfaceC5434e.a<?>> it = this.f13571b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC5434e.a<?> next = it.next();
                if (next.mo10470a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f13570a;
        }
        return (InterfaceC5434e<T>) aVar.mo10471b(t);
    }

    /* renamed from: b */
    public synchronized void m10473b(InterfaceC5434e.a<?> aVar) {
        this.f13571b.put(aVar.mo10470a(), aVar);
    }
}
