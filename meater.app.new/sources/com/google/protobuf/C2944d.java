package com.google.protobuf;

/* compiled from: Android.java */
/* renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2944d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f39228a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f39229b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f39230c;

    static {
        f39230c = (f39228a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f39229b;
    }

    static boolean c() {
        return f39228a || !(f39229b == null || f39230c);
    }
}
