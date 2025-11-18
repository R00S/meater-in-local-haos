package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.k1 */
/* loaded from: classes2.dex */
final class C7535k1 {

    /* renamed from: a */
    private static final Class<?> f27785a = m21166a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f27786b;

    static {
        f27786b = m21166a("org.robolectric.Robolectric") != null;
    }

    /* renamed from: a */
    private static <T> Class<T> m21166a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m21167b() {
        return (f27785a == null || f27786b) ? false : true;
    }

    /* renamed from: c */
    static Class<?> m21168c() {
        return f27785a;
    }
}
