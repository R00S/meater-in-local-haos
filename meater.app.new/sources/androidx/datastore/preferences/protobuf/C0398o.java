package androidx.datastore.preferences.protobuf;

/* compiled from: ExtensionRegistryFactory.java */
/* renamed from: androidx.datastore.preferences.protobuf.o */
/* loaded from: classes.dex */
final class C0398o {

    /* renamed from: a */
    static final Class<?> f2833a = m3070c();

    /* renamed from: a */
    public static C0401p m3068a() {
        if (f2833a != null) {
            try {
                return m3069b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C0401p.f2843d;
    }

    /* renamed from: b */
    private static final C0401p m3069b(String str) throws Exception {
        return (C0401p) f2833a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    static Class<?> m3070c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
