package l8;

/* compiled from: Preconditions.java */
/* loaded from: classes2.dex */
public final class m {
    private static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return r.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return r.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    private static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return r.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return r.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    private static String c(int i10, int i11, int i12) {
        return (i10 < 0 || i10 > i12) ? b(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? b(i11, i12, "end index") : r.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(r.a(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void g(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(r.a(str, Long.valueOf(j10)));
        }
    }

    public static void h(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(r.a(str, obj));
        }
    }

    public static void i(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(r.a(str, obj, obj2));
        }
    }

    public static int j(int i10, int i11) {
        return k(i10, i11, "index");
    }

    public static int k(int i10, int i11, String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, str));
        }
        return i10;
    }

    public static <T> T l(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T m(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int n(int i10, int i11) {
        return o(i10, i11, "index");
    }

    public static int o(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b(i10, i11, str));
        }
        return i10;
    }

    public static void p(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(c(i10, i11, i12));
        }
    }

    public static void q(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void r(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void s(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(r.a(str, obj));
        }
    }
}
