package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uu */
/* loaded from: classes2.dex */
final class C7241uu {

    /* renamed from: a */
    private static final Class<?> f20657a = m15932a();

    /* renamed from: a */
    private static Class<?> m15932a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static zzdno m15933b() {
        if (f20657a != null) {
            try {
                return m15935d("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzdno.f25691c;
    }

    /* renamed from: c */
    static zzdno m15934c() {
        zzdno zzdnoVarM15935d;
        if (f20657a != null) {
            try {
                zzdnoVarM15935d = m15935d("loadGeneratedRegistry");
            } catch (Exception unused) {
            }
        } else {
            zzdnoVarM15935d = null;
        }
        if (zzdnoVarM15935d == null) {
            zzdnoVarM15935d = zzdno.m19700b();
        }
        return zzdnoVarM15935d == null ? m15933b() : zzdnoVarM15935d;
    }

    /* renamed from: d */
    private static final zzdno m15935d(String str) throws Exception {
        return (zzdno) f20657a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
