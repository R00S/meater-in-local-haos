package com.google.firebase.components;

/* compiled from: Preconditions.java */
/* renamed from: com.google.firebase.components.a0 */
/* loaded from: classes2.dex */
public final class C8109a0 {
    /* renamed from: a */
    public static void m24967a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m24968b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m24969c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m24970d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
