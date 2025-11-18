package androidx.datastore.preferences.protobuf;

/* compiled from: NewInstanceSchemas.java */
/* renamed from: androidx.datastore.preferences.protobuf.x0 */
/* loaded from: classes.dex */
final class C0422x0 {

    /* renamed from: a */
    private static final InterfaceC0418v0 f3015a = m3328c();

    /* renamed from: b */
    private static final InterfaceC0418v0 f3016b = new C0420w0();

    /* renamed from: a */
    static InterfaceC0418v0 m3326a() {
        return f3015a;
    }

    /* renamed from: b */
    static InterfaceC0418v0 m3327b() {
        return f3016b;
    }

    /* renamed from: c */
    private static InterfaceC0418v0 m3328c() {
        try {
            return (InterfaceC0418v0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
