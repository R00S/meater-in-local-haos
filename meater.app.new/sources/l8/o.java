package l8;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* compiled from: Predicates.java */
/* loaded from: classes2.dex */
public final class o {

    /* compiled from: Predicates.java */
    private static class b<T> implements n<T>, Serializable {

        /* renamed from: B, reason: collision with root package name */
        private final List<? extends n<? super T>> f44446B;

        @Override // l8.n
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f44446B.size(); i10++) {
                if (!this.f44446B.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        @Override // l8.n
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f44446B.equals(((b) obj).f44446B);
            }
            return false;
        }

        public int hashCode() {
            return this.f44446B.hashCode() + 306654252;
        }

        public String toString() {
            return o.g("and", this.f44446B);
        }

        private b(List<? extends n<? super T>> list) {
            this.f44446B = list;
        }
    }

    /* compiled from: Predicates.java */
    private static class c implements n<Object>, Serializable {

        /* renamed from: B, reason: collision with root package name */
        private final Object f44447B;

        @Override // l8.n
        public boolean apply(Object obj) {
            return this.f44447B.equals(obj);
        }

        @Override // l8.n
        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f44447B.equals(((c) obj).f44447B);
            }
            return false;
        }

        public int hashCode() {
            return this.f44447B.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f44447B + ")";
        }

        private c(Object obj) {
            this.f44447B = obj;
        }

        <T> n<T> a() {
            return this;
        }
    }

    /* compiled from: Predicates.java */
    private static class d<T> implements n<T>, Serializable {

        /* renamed from: B, reason: collision with root package name */
        final n<T> f44448B;

        d(n<T> nVar) {
            this.f44448B = (n) m.l(nVar);
        }

        @Override // l8.n
        public boolean apply(T t10) {
            return !this.f44448B.apply(t10);
        }

        @Override // l8.n
        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f44448B.equals(((d) obj).f44448B);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f44448B.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f44448B + ")";
        }
    }

    public static <T> n<T> b(n<? super T> nVar, n<? super T> nVar2) {
        return new b(c((n) m.l(nVar), (n) m.l(nVar2)));
    }

    private static <T> List<n<? super T>> c(n<? super T> nVar, n<? super T> nVar2) {
        return Arrays.asList(nVar, nVar2);
    }

    public static <T> n<T> d(T t10) {
        return t10 == null ? e() : new c(t10).a();
    }

    public static <T> n<T> e() {
        return e.f44451D.j();
    }

    public static <T> n<T> f(n<T> nVar) {
        return new d(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Predicates.java */
    static abstract class e implements n<Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f44449B = new a("ALWAYS_TRUE", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final e f44450C = new b("ALWAYS_FALSE", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final e f44451D = new c("IS_NULL", 2);

        /* renamed from: E, reason: collision with root package name */
        public static final e f44452E = new d("NOT_NULL", 3);

        /* renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ e[] f44453F = c();

        /* compiled from: Predicates.java */
        enum a extends e {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // l8.n
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        /* compiled from: Predicates.java */
        enum b extends e {
            b(String str, int i10) {
                super(str, i10);
            }

            @Override // l8.n
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        /* compiled from: Predicates.java */
        enum c extends e {
            c(String str, int i10) {
                super(str, i10);
            }

            @Override // l8.n
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        /* compiled from: Predicates.java */
        enum d extends e {
            d(String str, int i10) {
                super(str, i10);
            }

            @Override // l8.n
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        private e(String str, int i10) {
        }

        private static /* synthetic */ e[] c() {
            return new e[]{f44449B, f44450C, f44451D, f44452E};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f44453F.clone();
        }

        <T> n<T> j() {
            return this;
        }
    }
}
