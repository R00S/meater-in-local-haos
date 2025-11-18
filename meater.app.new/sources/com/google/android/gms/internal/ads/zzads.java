package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzads {
    /* renamed from: a */
    public static boolean m16458a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            for (int i2 = 0; i2 < listQueryIntentActivities.size(); i2++) {
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                    return resolveInfoResolveActivity.activityInfo.packageName.equals(zzdtv.m19885a(context));
                }
            }
        }
        return false;
    }
}
