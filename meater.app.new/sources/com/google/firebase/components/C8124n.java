package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* renamed from: com.google.firebase.components.n */
/* loaded from: classes2.dex */
public final class C8124n<T> {

    /* renamed from: a */
    private final String f30701a;

    /* renamed from: b */
    private final Set<C8111b0<? super T>> f30702b;

    /* renamed from: c */
    private final Set<C8132v> f30703c;

    /* renamed from: d */
    private final int f30704d;

    /* renamed from: e */
    private final int f30705e;

    /* renamed from: f */
    private final InterfaceC8128r<T> f30706f;

    /* renamed from: g */
    private final Set<Class<?>> f30707g;

    /* renamed from: a */
    public static <T> b<T> m24984a(C8111b0<T> c8111b0) {
        return new b<>(c8111b0, new C8111b0[0]);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <T> b<T> m24985b(C8111b0<T> c8111b0, C8111b0<? super T>... c8111b0Arr) {
        return new b<>(c8111b0, c8111b0Arr);
    }

    /* renamed from: c */
    public static <T> b<T> m24986c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> b<T> m24987d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    /* renamed from: j */
    public static <T> C8124n<T> m24988j(final T t, Class<T> cls) {
        return m24989k(cls).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                Object obj = t;
                C8124n.m24990o(obj, interfaceC8126p);
                return obj;
            }
        }).m25008d();
    }

    /* renamed from: k */
    public static <T> b<T> m24989k(Class<T> cls) {
        return m24986c(cls).m25003g();
    }

    /* renamed from: o */
    static /* synthetic */ Object m24990o(Object obj, InterfaceC8126p interfaceC8126p) {
        return obj;
    }

    /* renamed from: p */
    static /* synthetic */ Object m24991p(Object obj, InterfaceC8126p interfaceC8126p) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: q */
    public static <T> C8124n<T> m24992q(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return m24987d(cls, clsArr).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.components.b
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                Object obj = t;
                C8124n.m24991p(obj, interfaceC8126p);
                return obj;
            }
        }).m25008d();
    }

    /* renamed from: e */
    public Set<C8132v> m24993e() {
        return this.f30703c;
    }

    /* renamed from: f */
    public InterfaceC8128r<T> m24994f() {
        return this.f30706f;
    }

    /* renamed from: g */
    public String m24995g() {
        return this.f30701a;
    }

    /* renamed from: h */
    public Set<C8111b0<? super T>> m24996h() {
        return this.f30702b;
    }

    /* renamed from: i */
    public Set<Class<?>> m24997i() {
        return this.f30707g;
    }

    /* renamed from: l */
    public boolean m24998l() {
        return this.f30704d == 1;
    }

    /* renamed from: m */
    public boolean m24999m() {
        return this.f30704d == 2;
    }

    /* renamed from: n */
    public boolean m25000n() {
        return this.f30705e == 0;
    }

    /* renamed from: r */
    public C8124n<T> m25001r(InterfaceC8128r<T> interfaceC8128r) {
        return new C8124n<>(this.f30701a, this.f30702b, this.f30703c, this.f30704d, this.f30705e, interfaceC8128r, this.f30707g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f30702b.toArray()) + ">{" + this.f30704d + ", type=" + this.f30705e + ", deps=" + Arrays.toString(this.f30703c.toArray()) + "}";
    }

    /* compiled from: Component.java */
    /* renamed from: com.google.firebase.components.n$b */
    public static class b<T> {

        /* renamed from: a */
        private String f30708a;

        /* renamed from: b */
        private final Set<C8111b0<? super T>> f30709b;

        /* renamed from: c */
        private final Set<C8132v> f30710c;

        /* renamed from: d */
        private int f30711d;

        /* renamed from: e */
        private int f30712e;

        /* renamed from: f */
        private InterfaceC8128r<T> f30713f;

        /* renamed from: g */
        private final Set<Class<?>> f30714g;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public b<T> m25003g() {
            this.f30712e = 1;
            return this;
        }

        /* renamed from: i */
        private b<T> m25004i(int i2) {
            C8109a0.m24970d(this.f30711d == 0, "Instantiation type has already been set.");
            this.f30711d = i2;
            return this;
        }

        /* renamed from: j */
        private void m25005j(C8111b0<?> c8111b0) {
            C8109a0.m24967a(!this.f30709b.contains(c8111b0), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public b<T> m25006b(C8132v c8132v) {
            C8109a0.m24969c(c8132v, "Null dependency");
            m25005j(c8132v.m25064c());
            this.f30710c.add(c8132v);
            return this;
        }

        /* renamed from: c */
        public b<T> m25007c() {
            return m25004i(1);
        }

        /* renamed from: d */
        public C8124n<T> m25008d() {
            C8109a0.m24970d(this.f30713f != null, "Missing required property: factory.");
            return new C8124n<>(this.f30708a, new HashSet(this.f30709b), new HashSet(this.f30710c), this.f30711d, this.f30712e, this.f30713f, this.f30714g);
        }

        /* renamed from: e */
        public b<T> m25009e() {
            return m25004i(2);
        }

        /* renamed from: f */
        public b<T> m25010f(InterfaceC8128r<T> interfaceC8128r) {
            this.f30713f = (InterfaceC8128r) C8109a0.m24969c(interfaceC8128r, "Null factory");
            return this;
        }

        /* renamed from: h */
        public b<T> m25011h(String str) {
            this.f30708a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f30708a = null;
            HashSet hashSet = new HashSet();
            this.f30709b = hashSet;
            this.f30710c = new HashSet();
            this.f30711d = 0;
            this.f30712e = 0;
            this.f30714g = new HashSet();
            C8109a0.m24969c(cls, "Null interface");
            hashSet.add(C8111b0.m24972b(cls));
            for (Class<? super T> cls2 : clsArr) {
                C8109a0.m24969c(cls2, "Null interface");
                this.f30709b.add(C8111b0.m24972b(cls2));
            }
        }

        @SafeVarargs
        private b(C8111b0<T> c8111b0, C8111b0<? super T>... c8111b0Arr) {
            this.f30708a = null;
            HashSet hashSet = new HashSet();
            this.f30709b = hashSet;
            this.f30710c = new HashSet();
            this.f30711d = 0;
            this.f30712e = 0;
            this.f30714g = new HashSet();
            C8109a0.m24969c(c8111b0, "Null interface");
            hashSet.add(c8111b0);
            for (C8111b0<? super T> c8111b02 : c8111b0Arr) {
                C8109a0.m24969c(c8111b02, "Null interface");
            }
            Collections.addAll(this.f30709b, c8111b0Arr);
        }
    }

    private C8124n(String str, Set<C8111b0<? super T>> set, Set<C8132v> set2, int i2, int i3, InterfaceC8128r<T> interfaceC8128r, Set<Class<?>> set3) {
        this.f30701a = str;
        this.f30702b = Collections.unmodifiableSet(set);
        this.f30703c = Collections.unmodifiableSet(set2);
        this.f30704d = i2;
        this.f30705e = i3;
        this.f30706f = interfaceC8128r;
        this.f30707g = Collections.unmodifiableSet(set3);
    }
}
