package s6;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r1.InterfaceC4339f;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final s f49350a;

    /* renamed from: b, reason: collision with root package name */
    private final a f49351b;

    /* compiled from: ModelLoaderRegistry.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, C0699a<?>> f49352a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: s6.q$a$a, reason: collision with other inner class name */
        private static class C0699a<Model> {

            /* renamed from: a, reason: collision with root package name */
            final List<o<Model, ?>> f49353a;

            public C0699a(List<o<Model, ?>> list) {
                this.f49353a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f49352a.clear();
        }

        public <Model> List<o<Model, ?>> b(Class<Model> cls) {
            C0699a<?> c0699a = this.f49352a.get(cls);
            if (c0699a == null) {
                return null;
            }
            return (List<o<Model, ?>>) c0699a.f49353a;
        }

        public <Model> void c(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.f49352a.put(cls, new C0699a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public q(InterfaceC4339f<List<Throwable>> interfaceC4339f) {
        this(new s(interfaceC4339f));
    }

    private static <A> Class<A> b(A a10) {
        return (Class<A>) a10.getClass();
    }

    private synchronized <A> List<o<A, ?>> e(Class<A> cls) {
        List<o<A, ?>> listB;
        listB = this.f49351b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f49350a.c(cls));
            this.f49351b.c(cls, listB);
        }
        return listB;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        this.f49350a.b(cls, cls2, pVar);
        this.f49351b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.f49350a.g(cls);
    }

    public <A> List<o<A, ?>> d(A a10) {
        List<o<A, ?>> listE = e(b(a10));
        if (listE.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a10);
        }
        int size = listE.size();
        List<o<A, ?>> listEmptyList = Collections.emptyList();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            o<A, ?> oVar = listE.get(i10);
            if (oVar.a(a10)) {
                if (z10) {
                    listEmptyList = new ArrayList<>(size - i10);
                    z10 = false;
                }
                listEmptyList.add(oVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a10, listE);
        }
        return listEmptyList;
    }

    private q(s sVar) {
        this.f49351b = new a();
        this.f49350a = sVar;
    }
}
