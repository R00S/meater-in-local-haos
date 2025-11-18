package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.k3 */
/* loaded from: classes2.dex */
final class C7537k3 {

    /* renamed from: a */
    private static final InterfaceC7531j3 f27789a = m21173c();

    /* renamed from: b */
    private static final InterfaceC7531j3 f27790b = new C7525i3();

    /* renamed from: a */
    static InterfaceC7531j3 m21171a() {
        return f27789a;
    }

    /* renamed from: b */
    static InterfaceC7531j3 m21172b() {
        return f27790b;
    }

    /* renamed from: c */
    private static InterfaceC7531j3 m21173c() {
        try {
            return (InterfaceC7531j3) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
