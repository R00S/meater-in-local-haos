package K8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes2.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f8743a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<A<? super T>> f8744b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<q> f8745c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8746d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8747e;

    /* renamed from: f, reason: collision with root package name */
    private final g<T> f8748f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f8749g;

    public static <T> b<T> c(A<T> a10) {
        return new b<>(a10, new A[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(A<T> a10, A<? super T>... aArr) {
        return new b<>(a10, aArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> c<T> l(final T t10, Class<T> cls) {
        return m(cls).f(new g() { // from class: K8.a
            @Override // K8.g
            public final Object a(d dVar) {
                return c.q(t10, dVar);
            }
        }).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).g();
    }

    @SafeVarargs
    public static <T> c<T> s(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).f(new g() { // from class: K8.b
            @Override // K8.g
            public final Object a(d dVar) {
                return c.r(t10, dVar);
            }
        }).d();
    }

    public Set<q> g() {
        return this.f8745c;
    }

    public g<T> h() {
        return this.f8748f;
    }

    public String i() {
        return this.f8743a;
    }

    public Set<A<? super T>> j() {
        return this.f8744b;
    }

    public Set<Class<?>> k() {
        return this.f8749g;
    }

    public boolean n() {
        return this.f8746d == 1;
    }

    public boolean o() {
        return this.f8746d == 2;
    }

    public boolean p() {
        return this.f8747e == 0;
    }

    public c<T> t(g<T> gVar) {
        return new c<>(this.f8743a, this.f8744b, this.f8745c, this.f8746d, this.f8747e, gVar, this.f8749g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f8744b.toArray()) + ">{" + this.f8746d + ", type=" + this.f8747e + ", deps=" + Arrays.toString(this.f8745c.toArray()) + "}";
    }

    /* compiled from: Component.java */
    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private String f8750a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<A<? super T>> f8751b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<q> f8752c;

        /* renamed from: d, reason: collision with root package name */
        private int f8753d;

        /* renamed from: e, reason: collision with root package name */
        private int f8754e;

        /* renamed from: f, reason: collision with root package name */
        private g<T> f8755f;

        /* renamed from: g, reason: collision with root package name */
        private final Set<Class<?>> f8756g;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.f8754e = 1;
            return this;
        }

        private b<T> i(int i10) {
            z.d(this.f8753d == 0, "Instantiation type has already been set.");
            this.f8753d = i10;
            return this;
        }

        private void j(A<?> a10) {
            z.a(!this.f8751b.contains(a10), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            z.c(qVar, "Null dependency");
            j(qVar.c());
            this.f8752c.add(qVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public c<T> d() {
            z.d(this.f8755f != null, "Missing required property: factory.");
            return new c<>(this.f8750a, new HashSet(this.f8751b), new HashSet(this.f8752c), this.f8753d, this.f8754e, this.f8755f, this.f8756g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(g<T> gVar) {
            this.f8755f = (g) z.c(gVar, "Null factory");
            return this;
        }

        public b<T> h(String str) {
            this.f8750a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f8750a = null;
            HashSet hashSet = new HashSet();
            this.f8751b = hashSet;
            this.f8752c = new HashSet();
            this.f8753d = 0;
            this.f8754e = 0;
            this.f8756g = new HashSet();
            z.c(cls, "Null interface");
            hashSet.add(A.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                z.c(cls2, "Null interface");
                this.f8751b.add(A.b(cls2));
            }
        }

        @SafeVarargs
        private b(A<T> a10, A<? super T>... aArr) {
            this.f8750a = null;
            HashSet hashSet = new HashSet();
            this.f8751b = hashSet;
            this.f8752c = new HashSet();
            this.f8753d = 0;
            this.f8754e = 0;
            this.f8756g = new HashSet();
            z.c(a10, "Null interface");
            hashSet.add(a10);
            for (A<? super T> a11 : aArr) {
                z.c(a11, "Null interface");
            }
            Collections.addAll(this.f8751b, aArr);
        }
    }

    private c(String str, Set<A<? super T>> set, Set<q> set2, int i10, int i11, g<T> gVar, Set<Class<?>> set3) {
        this.f8743a = str;
        this.f8744b = Collections.unmodifiableSet(set);
        this.f8745c = Collections.unmodifiableSet(set2);
        this.f8746d = i10;
        this.f8747e = i11;
        this.f8748f = gVar;
        this.f8749g = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, d dVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, d dVar) {
        return obj;
    }
}
