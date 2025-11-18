package com.bumptech.glide.load.p129n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: ModelLoaderRegistry.java */
/* renamed from: com.bumptech.glide.load.n.p */
/* loaded from: classes.dex */
public class C5464p {

    /* renamed from: a */
    private final C5466r f13657a;

    /* renamed from: b */
    private final a f13658b;

    /* compiled from: ModelLoaderRegistry.java */
    /* renamed from: com.bumptech.glide.load.n.p$a */
    private static class a {

        /* renamed from: a */
        private final Map<Class<?>, C11457a<?>> f13659a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: com.bumptech.glide.load.n.p$a$a, reason: collision with other inner class name */
        private static class C11457a<Model> {

            /* renamed from: a */
            final List<InterfaceC5462n<Model, ?>> f13660a;

            public C11457a(List<InterfaceC5462n<Model, ?>> list) {
                this.f13660a = list;
            }
        }

        a() {
        }

        /* renamed from: a */
        public void m10563a() {
            this.f13659a.clear();
        }

        /* renamed from: b */
        public <Model> List<InterfaceC5462n<Model, ?>> m10564b(Class<Model> cls) {
            C11457a<?> c11457a = this.f13659a.get(cls);
            if (c11457a == null) {
                return null;
            }
            return (List<InterfaceC5462n<Model, ?>>) c11457a.f13660a;
        }

        /* renamed from: c */
        public <Model> void m10565c(Class<Model> cls, List<InterfaceC5462n<Model, ?>> list) {
            if (this.f13659a.put(cls, new C11457a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C5464p(InterfaceC0956f<List<Throwable>> interfaceC0956f) {
        this(new C5466r(interfaceC0956f));
    }

    /* renamed from: b */
    private static <A> Class<A> m10558b(A a2) {
        return (Class<A>) a2.getClass();
    }

    /* renamed from: e */
    private synchronized <A> List<InterfaceC5462n<A, ?>> m10559e(Class<A> cls) {
        List<InterfaceC5462n<A, ?>> listM10564b;
        listM10564b = this.f13658b.m10564b(cls);
        if (listM10564b == null) {
            listM10564b = Collections.unmodifiableList(this.f13657a.m10572e(cls));
            this.f13658b.m10565c(cls, listM10564b);
        }
        return listM10564b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void m10560a(Class<Model> cls, Class<Data> cls2, InterfaceC5463o<? extends Model, ? extends Data> interfaceC5463o) {
        this.f13657a.m10570b(cls, cls2, interfaceC5463o);
        this.f13658b.m10563a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> m10561c(Class<?> cls) {
        return this.f13657a.m10573g(cls);
    }

    /* renamed from: d */
    public <A> List<InterfaceC5462n<A, ?>> m10562d(A a2) {
        List<InterfaceC5462n<A, ?>> listM10559e = m10559e(m10558b(a2));
        int size = listM10559e.size();
        List<InterfaceC5462n<A, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC5462n<A, ?> interfaceC5462n = listM10559e.get(i2);
            if (interfaceC5462n.mo10508a(a2)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i2);
                    z = false;
                }
                listEmptyList.add(interfaceC5462n);
            }
        }
        return listEmptyList;
    }

    private C5464p(C5466r c5466r) {
        this.f13658b = new a();
        this.f13657a = c5466r;
    }
}
