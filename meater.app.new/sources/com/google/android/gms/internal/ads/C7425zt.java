package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zt */
/* loaded from: classes2.dex */
final class C7425zt {

    /* renamed from: a */
    private static final Class<?> f21476a = m16160c("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f21477b;

    static {
        f21477b = m16160c("org.robolectric.Robolectric") != null;
    }

    /* renamed from: a */
    static boolean m16158a() {
        return (f21476a == null || f21477b) ? false : true;
    }

    /* renamed from: b */
    static Class<?> m16159b() {
        return f21476a;
    }

    /* renamed from: c */
    private static <T> Class<T> m16160c(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
