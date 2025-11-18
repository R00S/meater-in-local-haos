package com.google.crypto.tink.shaded.protobuf;

/* compiled from: ExtensionSchemas.java */
/* loaded from: classes2.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2906p<?> f37921a = new C2907q();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2906p<?> f37922b = c();

    static AbstractC2906p<?> a() {
        AbstractC2906p<?> abstractC2906p = f37922b;
        if (abstractC2906p != null) {
            return abstractC2906p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC2906p<?> b() {
        return f37921a;
    }

    private static AbstractC2906p<?> c() {
        try {
            return (AbstractC2906p) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
