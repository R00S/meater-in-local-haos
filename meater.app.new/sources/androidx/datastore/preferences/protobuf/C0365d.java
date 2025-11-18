package androidx.datastore.preferences.protobuf;

/* compiled from: Android.java */
/* renamed from: androidx.datastore.preferences.protobuf.d */
/* loaded from: classes.dex */
final class C0365d {

    /* renamed from: a */
    private static final Class<?> f2706a = m2592a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f2707b;

    static {
        f2707b = m2592a("org.robolectric.Robolectric") != null;
    }

    /* renamed from: a */
    private static <T> Class<T> m2592a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static Class<?> m2593b() {
        return f2706a;
    }

    /* renamed from: c */
    static boolean m2594c() {
        return (f2706a == null || f2707b) ? false : true;
    }
}
