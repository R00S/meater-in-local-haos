package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdto {
    /* renamed from: a */
    public static <T> T m19873a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static <T> T m19874b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static <T> void m19875c(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
