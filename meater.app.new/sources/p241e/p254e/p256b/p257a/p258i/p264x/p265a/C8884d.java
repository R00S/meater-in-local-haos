package p241e.p254e.p256b.p257a.p258i.p264x.p265a;

/* compiled from: Preconditions.java */
/* renamed from: e.e.b.a.i.x.a.d */
/* loaded from: classes2.dex */
public final class C8884d {
    /* renamed from: a */
    public static <T> void m28187a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m28188b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m28189c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
