package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzsk {
    /* renamed from: a */
    public static void m20477a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m20478b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static String m20479c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    /* renamed from: d */
    public static <T> T m20480d(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: e */
    public static void m20481e(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public static void m20482f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: g */
    public static int m20483g(int i2, int i3, int i4) {
        if (i2 < 0 || i2 >= i4) {
            throw new IndexOutOfBoundsException();
        }
        return i2;
    }
}
