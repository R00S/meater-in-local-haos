package androidx.datastore.preferences.protobuf;

/* compiled from: ExtensionSchemas.java */
/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2070p<?> f25045a = new C2071q();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2070p<?> f25046b = c();

    static AbstractC2070p<?> a() {
        AbstractC2070p<?> abstractC2070p = f25046b;
        if (abstractC2070p != null) {
            return abstractC2070p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC2070p<?> b() {
        return f25045a;
    }

    private static AbstractC2070p<?> c() {
        try {
            return (AbstractC2070p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
