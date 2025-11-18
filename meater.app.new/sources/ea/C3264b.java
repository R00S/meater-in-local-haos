package ea;

/* compiled from: Preconditions.java */
/* renamed from: ea.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3264b {
    public static <T> void a(T t10, Class<T> cls) {
        if (t10 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T b(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T c(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
