package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class DeviceProperties {

    /* renamed from: a */
    private static Boolean f17980a;

    /* renamed from: b */
    private static Boolean f17981b;

    /* renamed from: c */
    private static Boolean f17982c;

    /* renamed from: d */
    private static Boolean f17983d;

    private DeviceProperties() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m14621a(Context context) {
        if (f17982c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f17982c = Boolean.valueOf(z);
        }
        return f17982c.booleanValue();
    }

    @KeepForSdk
    @TargetApi(21)
    /* renamed from: b */
    public static boolean m14622b(Context context) {
        return m14626f(context);
    }

    @KeepForSdk
    /* renamed from: c */
    public static boolean m14623c() {
        int i2 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @KeepForSdk
    @TargetApi(20)
    /* renamed from: d */
    public static boolean m14624d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f17980a == null) {
            boolean z = false;
            if (PlatformVersion.m14643g() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f17980a = Boolean.valueOf(z);
        }
        return f17980a.booleanValue();
    }

    @KeepForSdk
    @TargetApi(26)
    /* renamed from: e */
    public static boolean m14625e(Context context) {
        if (m14624d(context) && !PlatformVersion.m14646j()) {
            return true;
        }
        if (m14626f(context)) {
            return !PlatformVersion.m14647k() || PlatformVersion.m14650n();
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: f */
    public static boolean m14626f(Context context) {
        if (f17981b == null) {
            boolean z = false;
            if (PlatformVersion.m14644h() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f17981b = Boolean.valueOf(z);
        }
        return f17981b.booleanValue();
    }

    /* renamed from: g */
    public static boolean m14627g(Context context) {
        if (f17983d == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f17983d = Boolean.valueOf(z);
        }
        return f17983d.booleanValue();
    }
}
