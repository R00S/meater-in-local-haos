package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class ClientLibraryUtils {
    private ClientLibraryUtils() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m14605a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo packageInfoM14606b = m14606b(context, str);
        if (packageInfoM14606b == null || (applicationInfo = packageInfoM14606b.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @KeepForSdk
    /* renamed from: b */
    public static PackageInfo m14606b(Context context, String str) {
        try {
            return Wrappers.m14674a(context).m14671e(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static boolean m14607c() {
        return false;
    }
}
