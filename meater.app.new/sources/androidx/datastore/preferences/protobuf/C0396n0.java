package androidx.datastore.preferences.protobuf;

/* compiled from: MapFieldSchemas.java */
/* renamed from: androidx.datastore.preferences.protobuf.n0 */
/* loaded from: classes.dex */
final class C0396n0 {

    /* renamed from: a */
    private static final InterfaceC0390l0 f2831a = m3051c();

    /* renamed from: b */
    private static final InterfaceC0390l0 f2832b = new C0393m0();

    /* renamed from: a */
    static InterfaceC0390l0 m3049a() {
        return f2831a;
    }

    /* renamed from: b */
    static InterfaceC0390l0 m3050b() {
        return f2832b;
    }

    /* renamed from: c */
    private static InterfaceC0390l0 m3051c() {
        try {
            return (InterfaceC0390l0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
