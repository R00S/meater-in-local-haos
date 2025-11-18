package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.a2 */
/* loaded from: classes2.dex */
public final class C5995a2 {
    /* renamed from: a */
    public static String m12952a(Context context) {
        String str;
        PackageInfo packageInfoM12953b = m12953b(context);
        return (packageInfoM12953b == null || (str = packageInfoM12953b.packageName) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* renamed from: b */
    private static PackageInfo m12953b(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                C6021d1.m13032e("ContextUtil", "Cannot find package info for package: " + context.getPackageName());
            }
        }
        return null;
    }
}
