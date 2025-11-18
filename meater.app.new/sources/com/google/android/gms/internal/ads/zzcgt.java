package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes2.dex */
public final class zzcgt {
    /* renamed from: a */
    public static PackageInfo m18779a(Context context, ApplicationInfo applicationInfo) {
        try {
            return Wrappers.m14674a(context).m14671e(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
