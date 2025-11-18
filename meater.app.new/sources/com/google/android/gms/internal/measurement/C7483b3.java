package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.b3 */
/* loaded from: classes2.dex */
final class C7483b3 {

    /* renamed from: a */
    private static final InterfaceC7477a3 f27697a = m20986c();

    /* renamed from: b */
    private static final InterfaceC7477a3 f27698b = new C7489c3();

    /* renamed from: a */
    static InterfaceC7477a3 m20984a() {
        return f27697a;
    }

    /* renamed from: b */
    static InterfaceC7477a3 m20985b() {
        return f27698b;
    }

    /* renamed from: c */
    private static InterfaceC7477a3 m20986c() {
        try {
            return (InterfaceC7477a3) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
