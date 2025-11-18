package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wv */
/* loaded from: classes2.dex */
final class C7316wv {

    /* renamed from: a */
    private static final InterfaceC7242uv f20871a = m15983c();

    /* renamed from: b */
    private static final InterfaceC7242uv f20872b = new C7279vv();

    /* renamed from: a */
    static InterfaceC7242uv m15981a() {
        return f20871a;
    }

    /* renamed from: b */
    static InterfaceC7242uv m15982b() {
        return f20872b;
    }

    /* renamed from: c */
    private static InterfaceC7242uv m15983c() {
        try {
            return (InterfaceC7242uv) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
