package androidx.datastore.preferences.protobuf;

/* compiled from: Android.java */
/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2058d {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f24906a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f24907b;

    static {
        f24907b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f24906a;
    }

    static boolean c() {
        return (f24906a == null || f24907b) ? false : true;
    }
}
