package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.zzb;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m14362a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static void m14363b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static void m14364c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public static void m14365d(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public static void m14366e(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    /* renamed from: f */
    public static void m14367f(String str) {
        if (!zzb.m14665a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    /* renamed from: g */
    public static String m14368g(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    /* renamed from: h */
    public static String m14369h(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @KeepForSdk
    /* renamed from: i */
    public static void m14370i() {
        m14371j("Must not be called on the main application thread");
    }

    @KeepForSdk
    /* renamed from: j */
    public static void m14371j(String str) {
        if (zzb.m14665a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    /* renamed from: k */
    public static <T> T m14372k(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    /* renamed from: l */
    public static <T> T m14373l(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    /* renamed from: m */
    public static int m14374m(int i2) {
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk
    /* renamed from: n */
    public static void m14375n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    /* renamed from: o */
    public static void m14376o(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    /* renamed from: p */
    public static void m14377p(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
