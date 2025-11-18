package p024c.p052i.p059j;

/* compiled from: Preconditions.java */
/* renamed from: c.i.j.i */
/* loaded from: classes.dex */
public final class C0959i {
    /* renamed from: a */
    public static void m6063a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m6064b(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static <T> T m6065c(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: d */
    public static <T> T m6066d(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
