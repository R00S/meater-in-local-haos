package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzsp {
    /* renamed from: a */
    private static String m20494a(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException(str.length() != 0 ? "Invalid mime type: ".concat(str) : new String("Invalid mime type: "));
        }
        return str.substring(0, iIndexOf);
    }

    /* renamed from: b */
    public static boolean m20495b(String str) {
        return "audio".equals(m20494a(str));
    }

    /* renamed from: c */
    public static boolean m20496c(String str) {
        return "video".equals(m20494a(str));
    }
}
