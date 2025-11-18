package com.google.crypto.tink.shaded.protobuf;

/* compiled from: Android.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2894d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f37786a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f37787b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f37788c;

    static {
        f37788c = (f37786a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f37787b;
    }

    static boolean c() {
        return f37786a || !(f37787b == null || f37788c);
    }
}
