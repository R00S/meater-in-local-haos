package l8;

import java.io.Serializable;
import l8.t;

/* compiled from: Suppliers.java */
/* loaded from: classes2.dex */
public final class t {

    /* compiled from: Suppliers.java */
    static class a<T> implements s<T>, Serializable {

        /* renamed from: B, reason: collision with root package name */
        private transient Object f44466B = new Object();

        /* renamed from: C, reason: collision with root package name */
        final s<T> f44467C;

        /* renamed from: D, reason: collision with root package name */
        volatile transient boolean f44468D;

        /* renamed from: E, reason: collision with root package name */
        transient T f44469E;

        a(s<T> sVar) {
            this.f44467C = (s) m.l(sVar);
        }

        @Override // l8.s
        public T get() {
            if (!this.f44468D) {
                synchronized (this.f44466B) {
                    try {
                        if (!this.f44468D) {
                            T t10 = this.f44467C.get();
                            this.f44469E = t10;
                            this.f44468D = true;
                            return t10;
                        }
                    } finally {
                    }
                }
            }
            return (T) C3917j.a(this.f44469E);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f44468D) {
                obj = "<supplier that returned " + this.f44469E + ">";
            } else {
                obj = this.f44467C;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* compiled from: Suppliers.java */
    static class b<T> implements s<T> {

        /* renamed from: E, reason: collision with root package name */
        private static final s<Void> f44470E = new s() { // from class: l8.u
            @Override // l8.s
            public final Object get() {
                return t.b.b();
            }
        };

        /* renamed from: B, reason: collision with root package name */
        private final Object f44471B = new Object();

        /* renamed from: C, reason: collision with root package name */
        private volatile s<T> f44472C;

        /* renamed from: D, reason: collision with root package name */
        private T f44473D;

        b(s<T> sVar) {
            this.f44472C = (s) m.l(sVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void b() {
            throw new IllegalStateException();
        }

        @Override // l8.s
        public T get() {
            s<T> sVar = this.f44472C;
            s<T> sVar2 = (s<T>) f44470E;
            if (sVar != sVar2) {
                synchronized (this.f44471B) {
                    try {
                        if (this.f44472C != sVar2) {
                            T t10 = this.f44472C.get();
                            this.f44473D = t10;
                            this.f44472C = sVar2;
                            return t10;
                        }
                    } finally {
                    }
                }
            }
            return (T) C3917j.a(this.f44473D);
        }

        public String toString() {
            Object obj = this.f44472C;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f44470E) {
                obj = "<supplier that returned " + this.f44473D + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* compiled from: Suppliers.java */
    private static class c<T> implements s<T>, Serializable {

        /* renamed from: B, reason: collision with root package name */
        final T f44474B;

        c(T t10) {
            this.f44474B = t10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return C3918k.a(this.f44474B, ((c) obj).f44474B);
            }
            return false;
        }

        @Override // l8.s
        public T get() {
            return this.f44474B;
        }

        public int hashCode() {
            return C3918k.b(this.f44474B);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f44474B + ")";
        }
    }

    public static <T> s<T> a(s<T> sVar) {
        return ((sVar instanceof b) || (sVar instanceof a)) ? sVar : sVar instanceof Serializable ? new a(sVar) : new b(sVar);
    }

    public static <T> s<T> b(T t10) {
        return new c(t10);
    }
}
