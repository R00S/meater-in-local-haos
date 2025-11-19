package androidx.datastore.preferences.protobuf;

/* compiled from: ExtensionRegistryFactory.java */
/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2068n {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?> f25004a = c();

    public static C2069o a() {
        if (f25004a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C2069o.f25008e;
    }

    private static final C2069o b(String str) {
        return (C2069o) f25004a.getDeclaredMethod(str, null).invoke(null, null);
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
