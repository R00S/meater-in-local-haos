package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* loaded from: classes2.dex */
final class C7500e2 {

    /* renamed from: a */
    private static final AbstractC7494d2<?> f27719a = new C7506f2();

    /* renamed from: b */
    private static final AbstractC7494d2<?> f27720b = m21046c();

    /* renamed from: a */
    static AbstractC7494d2<?> m21044a() {
        return f27719a;
    }

    /* renamed from: b */
    static AbstractC7494d2<?> m21045b() {
        AbstractC7494d2<?> abstractC7494d2 = f27720b;
        if (abstractC7494d2 != null) {
            return abstractC7494d2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    private static AbstractC7494d2<?> m21046c() {
        try {
            return (AbstractC7494d2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
