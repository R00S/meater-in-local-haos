package kotlin.reflect.p371y.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* compiled from: ReflectProperties.java */
/* renamed from: kotlin.f0.y.e.a0 */
/* loaded from: classes2.dex */
public class C9879a0 {

    /* compiled from: ReflectProperties.java */
    /* renamed from: kotlin.f0.y.e.a0$a */
    public static class a<T> extends c<T> implements Function0<T> {

        /* renamed from: g */
        private final Function0<T> f37267g;

        /* renamed from: h */
        private volatile SoftReference<Object> f37268h;

        public a(T t, Function0<T> function0) {
            if (function0 == null) {
                m32481g(0);
            }
            this.f37268h = null;
            this.f37267g = function0;
            if (t != null) {
                this.f37268h = new SoftReference<>(m32483b(t));
            }
        }

        /* renamed from: g */
        private static /* synthetic */ void m32481g(int i2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // kotlin.reflect.p371y.internal.C9879a0.c, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f37268h;
            if (softReference != null && (obj = softReference.get()) != null) {
                return m32485e(obj);
            }
            T tInvoke = this.f37267g.invoke();
            this.f37268h = new SoftReference<>(m32483b(tInvoke));
            return tInvoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    /* renamed from: kotlin.f0.y.e.a0$b */
    public static class b<T> extends c<T> {

        /* renamed from: g */
        private final Function0<T> f37269g;

        /* renamed from: h */
        private volatile Object f37270h;

        public b(Function0<T> function0) {
            if (function0 == null) {
                m32482g(0);
            }
            this.f37270h = null;
            this.f37269g = function0;
        }

        /* renamed from: g */
        private static /* synthetic */ void m32482g(int i2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        @Override // kotlin.reflect.p371y.internal.C9879a0.c, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj = this.f37270h;
            if (obj != null) {
                return m32485e(obj);
            }
            T tInvoke = this.f37269g.invoke();
            this.f37270h = m32483b(tInvoke);
            return tInvoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    /* renamed from: kotlin.f0.y.e.a0$c */
    public static abstract class c<T> {

        /* renamed from: f */
        private static final Object f37271f = new a();

        /* compiled from: ReflectProperties.java */
        /* renamed from: kotlin.f0.y.e.a0$c$a */
        static class a {
            a() {
            }
        }

        /* renamed from: b */
        protected Object m32483b(T t) {
            return t == null ? f37271f : t;
        }

        /* renamed from: c */
        public final T m32484c(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        protected T m32485e(Object obj) {
            if (obj == f37271f) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    /* renamed from: a */
    private static /* synthetic */ void m32477a(int i2) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i2 == 1 || i2 == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <T> b<T> m32478b(Function0<T> function0) {
        if (function0 == null) {
            m32477a(0);
        }
        return new b<>(function0);
    }

    /* renamed from: c */
    public static <T> a<T> m32479c(T t, Function0<T> function0) {
        if (function0 == null) {
            m32477a(1);
        }
        return new a<>(t, function0);
    }

    /* renamed from: d */
    public static <T> a<T> m32480d(Function0<T> function0) {
        if (function0 == null) {
            m32477a(2);
        }
        return m32479c(null, function0);
    }
}
