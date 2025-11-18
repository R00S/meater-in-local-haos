package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ew */
/* loaded from: classes2.dex */
final class C6651ew {

    /* renamed from: a */
    private static final InterfaceC6577cw f18835a = m15116c();

    /* renamed from: b */
    private static final InterfaceC6577cw f18836b = new C6614dw();

    /* renamed from: a */
    static InterfaceC6577cw m15114a() {
        return f18835a;
    }

    /* renamed from: b */
    static InterfaceC6577cw m15115b() {
        return f18836b;
    }

    /* renamed from: c */
    private static InterfaceC6577cw m15116c() {
        try {
            return (InterfaceC6577cw) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
