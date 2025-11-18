package p317f.p318b;

/* compiled from: Preconditions.java */
/* renamed from: f.b.b */
/* loaded from: classes2.dex */
public final class C9055b {
    /* renamed from: a */
    public static <T> void m29110a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m29111b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m29112c(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
