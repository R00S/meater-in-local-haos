package com.bumptech.glide.load.p127m.p128o;

import android.net.Uri;

/* compiled from: MediaStoreUtil.java */
/* renamed from: com.bumptech.glide.load.m.o.b */
/* loaded from: classes.dex */
public final class C5445b {
    /* renamed from: a */
    public static boolean m10494a(Uri uri) {
        return m10495b(uri) && !m10498e(uri);
    }

    /* renamed from: b */
    public static boolean m10495b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m10496c(Uri uri) {
        return m10495b(uri) && m10498e(uri);
    }

    /* renamed from: d */
    public static boolean m10497d(int i2, int i3) {
        return i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && i2 <= 512 && i3 <= 384;
    }

    /* renamed from: e */
    private static boolean m10498e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
