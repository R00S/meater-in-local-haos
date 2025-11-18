package com.bumptech.glide.p145r.p146l;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p024c.p052i.p059j.C0958h;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: FactoryPools.java */
/* renamed from: com.bumptech.glide.r.l.a */
/* loaded from: classes.dex */
public final class C5598a {

    /* renamed from: a */
    private static final g<Object> f14049a = new a();

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.r.l.a$a */
    class a implements g<Object> {
        a() {
        }

        @Override // com.bumptech.glide.p145r.p146l.C5598a.g
        /* renamed from: a */
        public void mo11071a(Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.r.l.a$b */
    class b<T> implements d<List<T>> {
        b() {
        }

        @Override // com.bumptech.glide.p145r.p146l.C5598a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> mo10211a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.r.l.a$c */
    class c<T> implements g<List<T>> {
        c() {
        }

        @Override // com.bumptech.glide.p145r.p146l.C5598a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo11071a(List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.r.l.a$d */
    public interface d<T> {
        /* renamed from: a */
        T mo10211a();
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.r.l.a$e */
    private static final class e<T> implements InterfaceC0956f<T> {

        /* renamed from: a */
        private final d<T> f14050a;

        /* renamed from: b */
        private final g<T> f14051b;

        /* renamed from: c */
        private final InterfaceC0956f<T> f14052c;

        e(InterfaceC0956f<T> interfaceC0956f, d<T> dVar, g<T> gVar) {
            this.f14052c = interfaceC0956f;
            this.f14050a = dVar;
            this.f14051b = gVar;
        }

        @Override // p024c.p052i.p059j.InterfaceC0956f
        /* renamed from: a */
        public boolean mo6060a(T t) {
            if (t instanceof f) {
                ((f) t).mo10213u().mo11079b(true);
            }
            this.f14051b.mo11071a(t);
            return this.f14052c.mo6060a(t);
        }

        @Override // p024c.p052i.p059j.InterfaceC0956f
        /* renamed from: b */
        public T mo6061b() {
            T tMo6061b = this.f14052c.mo6061b();
            if (tMo6061b == null) {
                tMo6061b = this.f14050a.mo10211a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tMo6061b.getClass());
                }
            }
            if (tMo6061b instanceof f) {
                tMo6061b.mo10213u().mo11079b(false);
            }
            return (T) tMo6061b;
        }
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.r.l.a$f */
    public interface f {
        /* renamed from: u */
        AbstractC5600c mo10213u();
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.r.l.a$g */
    public interface g<T> {
        /* renamed from: a */
        void mo11071a(T t);
    }

    /* renamed from: a */
    private static <T extends f> InterfaceC0956f<T> m11065a(InterfaceC0956f<T> interfaceC0956f, d<T> dVar) {
        return m11066b(interfaceC0956f, dVar, m11067c());
    }

    /* renamed from: b */
    private static <T> InterfaceC0956f<T> m11066b(InterfaceC0956f<T> interfaceC0956f, d<T> dVar, g<T> gVar) {
        return new e(interfaceC0956f, dVar, gVar);
    }

    /* renamed from: c */
    private static <T> g<T> m11067c() {
        return (g<T>) f14049a;
    }

    /* renamed from: d */
    public static <T extends f> InterfaceC0956f<T> m11068d(int i2, d<T> dVar) {
        return m11065a(new C0958h(i2), dVar);
    }

    /* renamed from: e */
    public static <T> InterfaceC0956f<List<T>> m11069e() {
        return m11070f(20);
    }

    /* renamed from: f */
    public static <T> InterfaceC0956f<List<T>> m11070f(int i2) {
        return m11066b(new C0958h(i2), new b(), new c());
    }
}
