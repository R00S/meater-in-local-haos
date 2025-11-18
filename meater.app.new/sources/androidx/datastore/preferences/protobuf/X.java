package androidx.datastore.preferences.protobuf;

/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    private static final V f24893a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final V f24894b = new W();

    static V a() {
        return f24893a;
    }

    static V b() {
        return f24894b;
    }

    private static V c() {
        try {
            return (V) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
