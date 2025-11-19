package s6;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m6.C3972g;
import r1.InterfaceC4339f;
import s6.o;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes2.dex */
public class s {

    /* renamed from: e, reason: collision with root package name */
    private static final c f49363e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final o<Object, Object> f49364f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<b<?, ?>> f49365a;

    /* renamed from: b, reason: collision with root package name */
    private final c f49366b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b<?, ?>> f49367c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4339f<List<Throwable>> f49368d;

    /* compiled from: MultiModelLoaderFactory.java */
    private static class a implements o<Object, Object> {
        a() {
        }

        @Override // s6.o
        public boolean a(Object obj) {
            return false;
        }

        @Override // s6.o
        public o.a<Object> b(Object obj, int i10, int i11, C3972g c3972g) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    private static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<Model> f49369a;

        /* renamed from: b, reason: collision with root package name */
        final Class<Data> f49370b;

        /* renamed from: c, reason: collision with root package name */
        final p<? extends Model, ? extends Data> f49371c;

        public b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
            this.f49369a = cls;
            this.f49370b = cls2;
            this.f49371c = pVar;
        }

        public boolean a(Class<?> cls) {
            return this.f49369a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f49370b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    static class c {
        c() {
        }

        public <Model, Data> r<Model, Data> a(List<o<Model, Data>> list, InterfaceC4339f<List<Throwable>> interfaceC4339f) {
            return new r<>(list, interfaceC4339f);
        }
    }

    public s(InterfaceC4339f<List<Throwable>> interfaceC4339f) {
        this(interfaceC4339f, f49363e);
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar, boolean z10) {
        b<?, ?> bVar = new b<>(cls, cls2, pVar);
        List<b<?, ?>> list = this.f49365a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private <Model, Data> o<Model, Data> e(b<?, ?> bVar) {
        return (o) H6.k.d(bVar.f49371c.c(this));
    }

    private static <Model, Data> o<Model, Data> f() {
        return (o<Model, Data>) f49364f;
    }

    synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, true);
    }

    synchronized <Model> List<o<Model, ?>> c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f49365a) {
                if (!this.f49367c.contains(bVar) && bVar.a(cls)) {
                    this.f49367c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f49367c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public synchronized <Model, Data> o<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f49365a) {
                if (this.f49367c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f49367c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f49367c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f49366b.a(arrayList, this.f49368d);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z10) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th) {
            this.f49367c.clear();
            throw th;
        }
    }

    synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f49365a) {
            if (!arrayList.contains(bVar.f49370b) && bVar.a(cls)) {
                arrayList.add(bVar.f49370b);
            }
        }
        return arrayList;
    }

    s(InterfaceC4339f<List<Throwable>> interfaceC4339f, c cVar) {
        this.f49365a = new ArrayList();
        this.f49367c = new HashSet();
        this.f49368d = interfaceC4339f;
        this.f49366b = cVar;
    }
}
