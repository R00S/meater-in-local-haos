package kotlin.reflect.jvm.internal.impl.utils;

/* loaded from: classes3.dex */
public class WrappedValues {

    /* renamed from: a */
    private static final Object f41408a = new C10765a();

    /* renamed from: b */
    public static volatile boolean f41409b = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a */
    static class C10765a {
        C10765a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b */
    private static final class C10766b {

        /* renamed from: a */
        private final Throwable f41410a;

        /* synthetic */ C10766b(Throwable th, C10765a c10765a) {
            this(th);
        }

        /* renamed from: a */
        private static /* synthetic */ void m38506a(int i2) {
            String str = i2 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 1 ? 3 : 2];
            if (i2 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i2 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i2 != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        /* renamed from: b */
        public Throwable m38507b() {
            Throwable th = this.f41410a;
            if (th == null) {
                m38506a(1);
            }
            return th;
        }

        public String toString() {
            return this.f41410a.toString();
        }

        private C10766b(Throwable th) {
            if (th == null) {
                m38506a(0);
            }
            this.f41410a = th;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m38500a(int i2) {
        String str = (i2 == 1 || i2 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 1 || i2 == 2) ? 2 : 3];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i2 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i2 == 1 || i2 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i2 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: b */
    public static <V> Object m38501b(V v) {
        if (v == null && (v = (V) f41408a) == null) {
            m38500a(1);
        }
        return v;
    }

    /* renamed from: c */
    public static Object m38502c(Throwable th) {
        if (th == null) {
            m38500a(3);
        }
        return new C10766b(th, null);
    }

    /* renamed from: d */
    public static <V> V m38503d(Object obj) {
        if (obj == null) {
            m38500a(4);
        }
        return (V) m38504e(m38505f(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static <V> V m38504e(Object obj) {
        if (obj == 0) {
            m38500a(0);
        }
        if (obj == f41408a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <V> V m38505f(Object obj) {
        if (!(obj instanceof C10766b)) {
            return obj;
        }
        Throwable thM38507b = ((C10766b) obj).m38507b();
        if (f41409b && C10769c.m38523a(thM38507b)) {
            throw new WrappedProcessCanceledException(thM38507b);
        }
        throw C10769c.m38524b(thM38507b);
    }
}
