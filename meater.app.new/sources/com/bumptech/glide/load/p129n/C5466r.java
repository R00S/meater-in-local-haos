package com.bumptech.glide.load.p129n;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.p145r.C5596j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: MultiModelLoaderFactory.java */
/* renamed from: com.bumptech.glide.load.n.r */
/* loaded from: classes.dex */
public class C5466r {

    /* renamed from: a */
    private static final c f13670a = new c();

    /* renamed from: b */
    private static final InterfaceC5462n<Object, Object> f13671b = new a();

    /* renamed from: c */
    private final List<b<?, ?>> f13672c;

    /* renamed from: d */
    private final c f13673d;

    /* renamed from: e */
    private final Set<b<?, ?>> f13674e;

    /* renamed from: f */
    private final InterfaceC0956f<List<Throwable>> f13675f;

    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: com.bumptech.glide.load.n.r$a */
    private static class a implements InterfaceC5462n<Object, Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
        /* renamed from: a */
        public boolean mo10508a(Object obj) {
            return false;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
        /* renamed from: b */
        public InterfaceC5462n.a<Object> mo10509b(Object obj, int i2, int i3, C5426i c5426i) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: com.bumptech.glide.load.n.r$b */
    private static class b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f13676a;

        /* renamed from: b */
        final Class<Data> f13677b;

        /* renamed from: c */
        final InterfaceC5463o<? extends Model, ? extends Data> f13678c;

        public b(Class<Model> cls, Class<Data> cls2, InterfaceC5463o<? extends Model, ? extends Data> interfaceC5463o) {
            this.f13676a = cls;
            this.f13677b = cls2;
            this.f13678c = interfaceC5463o;
        }

        /* renamed from: a */
        public boolean m10574a(Class<?> cls) {
            return this.f13676a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m10575b(Class<?> cls, Class<?> cls2) {
            return m10574a(cls) && this.f13677b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: com.bumptech.glide.load.n.r$c */
    static class c {
        c() {
        }

        /* renamed from: a */
        public <Model, Data> C5465q<Model, Data> m10576a(List<InterfaceC5462n<Model, Data>> list, InterfaceC0956f<List<Throwable>> interfaceC0956f) {
            return new C5465q<>(list, interfaceC0956f);
        }
    }

    public C5466r(InterfaceC0956f<List<Throwable>> interfaceC0956f) {
        this(interfaceC0956f, f13670a);
    }

    /* renamed from: a */
    private <Model, Data> void m10567a(Class<Model> cls, Class<Data> cls2, InterfaceC5463o<? extends Model, ? extends Data> interfaceC5463o, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, interfaceC5463o);
        List<b<?, ?>> list = this.f13672c;
        list.add(z ? list.size() : 0, bVar);
    }

    /* renamed from: c */
    private <Model, Data> InterfaceC5462n<Model, Data> m10568c(b<?, ?> bVar) {
        return (InterfaceC5462n) C5596j.m11042d(bVar.f13678c.mo10513b(this));
    }

    /* renamed from: f */
    private static <Model, Data> InterfaceC5462n<Model, Data> m10569f() {
        return (InterfaceC5462n<Model, Data>) f13671b;
    }

    /* renamed from: b */
    synchronized <Model, Data> void m10570b(Class<Model> cls, Class<Data> cls2, InterfaceC5463o<? extends Model, ? extends Data> interfaceC5463o) {
        m10567a(cls, cls2, interfaceC5463o, true);
    }

    /* renamed from: d */
    public synchronized <Model, Data> InterfaceC5462n<Model, Data> m10571d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.f13672c) {
                if (this.f13674e.contains(bVar)) {
                    z = true;
                } else if (bVar.m10575b(cls, cls2)) {
                    this.f13674e.add(bVar);
                    arrayList.add(m10568c(bVar));
                    this.f13674e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f13673d.m10576a(arrayList, this.f13675f);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC5462n) arrayList.get(0);
            }
            if (!z) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return m10569f();
        } catch (Throwable th) {
            this.f13674e.clear();
            throw th;
        }
    }

    /* renamed from: e */
    synchronized <Model> List<InterfaceC5462n<Model, ?>> m10572e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f13672c) {
                if (!this.f13674e.contains(bVar) && bVar.m10574a(cls)) {
                    this.f13674e.add(bVar);
                    arrayList.add(m10568c(bVar));
                    this.f13674e.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f13674e.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: g */
    synchronized List<Class<?>> m10573g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f13672c) {
            if (!arrayList.contains(bVar.f13677b) && bVar.m10574a(cls)) {
                arrayList.add(bVar.f13677b);
            }
        }
        return arrayList;
    }

    C5466r(InterfaceC0956f<List<Throwable>> interfaceC0956f, c cVar) {
        this.f13672c = new ArrayList();
        this.f13674e = new HashSet();
        this.f13675f = interfaceC0956f;
        this.f13673d = cVar;
    }
}
