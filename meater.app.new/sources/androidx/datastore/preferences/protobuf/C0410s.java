package androidx.datastore.preferences.protobuf;

/* compiled from: ExtensionSchemas.java */
/* renamed from: androidx.datastore.preferences.protobuf.s */
/* loaded from: classes.dex */
final class C0410s {

    /* renamed from: a */
    private static final AbstractC0404q<?> f2910a = new C0407r();

    /* renamed from: b */
    private static final AbstractC0404q<?> f2911b = m3209c();

    /* renamed from: a */
    static AbstractC0404q<?> m3207a() {
        AbstractC0404q<?> abstractC0404q = f2911b;
        if (abstractC0404q != null) {
            return abstractC0404q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static AbstractC0404q<?> m3208b() {
        return f2910a;
    }

    /* renamed from: c */
    private static AbstractC0404q<?> m3209c() {
        try {
            return (AbstractC0404q) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
