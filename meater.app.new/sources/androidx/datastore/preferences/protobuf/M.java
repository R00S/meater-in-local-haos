package androidx.datastore.preferences.protobuf;

/* compiled from: MapFieldSchemas.java */
/* loaded from: classes.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    private static final K f24867a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final K f24868b = new L();

    static K a() {
        return f24867a;
    }

    static K b() {
        return f24868b;
    }

    private static K c() {
        try {
            return (K) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
