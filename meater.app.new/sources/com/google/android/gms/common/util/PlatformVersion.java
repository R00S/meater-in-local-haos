package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m14637a() {
        return true;
    }

    @KeepForSdk
    /* renamed from: b */
    public static boolean m14638b() {
        return Build.VERSION.SDK_INT >= 15;
    }

    @KeepForSdk
    /* renamed from: c */
    public static boolean m14639c() {
        return Build.VERSION.SDK_INT >= 16;
    }

    @KeepForSdk
    /* renamed from: d */
    public static boolean m14640d() {
        return Build.VERSION.SDK_INT >= 17;
    }

    @KeepForSdk
    /* renamed from: e */
    public static boolean m14641e() {
        return Build.VERSION.SDK_INT >= 18;
    }

    @KeepForSdk
    /* renamed from: f */
    public static boolean m14642f() {
        return Build.VERSION.SDK_INT >= 19;
    }

    @KeepForSdk
    /* renamed from: g */
    public static boolean m14643g() {
        return Build.VERSION.SDK_INT >= 20;
    }

    @KeepForSdk
    /* renamed from: h */
    public static boolean m14644h() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @KeepForSdk
    /* renamed from: i */
    public static boolean m14645i() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @KeepForSdk
    /* renamed from: j */
    public static boolean m14646j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @KeepForSdk
    /* renamed from: k */
    public static boolean m14647k() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @KeepForSdk
    /* renamed from: l */
    public static boolean m14648l() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @KeepForSdk
    /* renamed from: m */
    public static boolean m14649m() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @KeepForSdk
    /* renamed from: n */
    public static boolean m14650n() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @KeepForSdk
    /* renamed from: o */
    public static boolean m14651o() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
