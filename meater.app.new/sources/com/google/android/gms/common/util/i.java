package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c7.C2339h;
import com.google.android.apps.common.proguard.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f33521a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f33522b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f33523c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f33524d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f33524d == null) {
            boolean z10 = false;
            if (l.e() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f33524d = Boolean.valueOf(z10);
        }
        return f33524d.booleanValue();
    }

    public static boolean b() {
        int i10 = C2339h.f31085a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    @TargetApi(26)
    public static boolean d(Context context) {
        if (c(context) && !l.d()) {
            return true;
        }
        if (e(context)) {
            return !l.e() || l.h();
        }
        return false;
    }

    @TargetApi(21)
    public static boolean e(Context context) {
        if (f33522b == null) {
            f33522b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f33522b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f33523c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f33523c = Boolean.valueOf(z10);
        }
        return f33523c.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean g(PackageManager packageManager) {
        if (f33521a == null) {
            f33521a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f33521a.booleanValue();
    }
}
