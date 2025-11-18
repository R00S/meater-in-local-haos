package com.bumptech.glide.p145r;

import android.text.TextUtils;
import java.util.Collection;

/* compiled from: Preconditions.java */
/* renamed from: com.bumptech.glide.r.j */
/* loaded from: classes.dex */
public final class C5596j {
    /* renamed from: a */
    public static void m11039a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m11040b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m11041c(T t) {
        if (t.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t;
    }

    /* renamed from: d */
    public static <T> T m11042d(T t) {
        return (T) m11043e(t, "Argument must not be null");
    }

    /* renamed from: e */
    public static <T> T m11043e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
