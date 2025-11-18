package La;

import java.lang.ref.SoftReference;

/* compiled from: ReflectProperties.java */
/* loaded from: classes3.dex */
public class a1 {

    /* compiled from: ReflectProperties.java */
    public static class a<T> extends b<T> implements Ba.a<T> {

        /* renamed from: C, reason: collision with root package name */
        private final Ba.a<T> f11178C;

        /* renamed from: D, reason: collision with root package name */
        private volatile SoftReference<Object> f11179D;

        public a(T t10, Ba.a<T> aVar) {
            if (aVar == null) {
                d(0);
            }
            this.f11179D = null;
            this.f11178C = aVar;
            if (t10 != null) {
                this.f11179D = new SoftReference<>(a(t10));
            }
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // La.a1.b, Ba.a
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f11179D;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            T tInvoke = this.f11178C.invoke();
            this.f11179D = new SoftReference<>(a(tInvoke));
            return tInvoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    public static abstract class b<T> {

        /* renamed from: B, reason: collision with root package name */
        private static final Object f11180B = new a();

        /* compiled from: ReflectProperties.java */
        static class a {
            a() {
            }
        }

        protected Object a(T t10) {
            return t10 == null ? f11180B : t10;
        }

        public final T b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T c(Object obj) {
            if (obj == f11180B) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    private static /* synthetic */ void a(int i10) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static <T> a<T> b(Ba.a<T> aVar) {
        if (aVar == null) {
            a(1);
        }
        return c(null, aVar);
    }

    public static <T> a<T> c(T t10, Ba.a<T> aVar) {
        if (aVar == null) {
            a(0);
        }
        return new a<>(t10, aVar);
    }
}
