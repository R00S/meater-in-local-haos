package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzaht {

    /* renamed from: a */
    private final Context f22042a;

    /* renamed from: b */
    private final zzdh f22043b;

    /* renamed from: c */
    private final View f22044c;

    public zzaht(Context context, zzdh zzdhVar, View view) {
        this.f22042a = context;
        this.f22043b = zzdhVar;
        this.f22044c = view;
    }

    /* renamed from: a */
    private static Intent m16572a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    @VisibleForTesting
    /* renamed from: b */
    private final ResolveInfo m16573b(Intent intent, ArrayList<ResolveInfo> arrayList) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = this.f22042a.getPackageManager();
        } catch (Throwable th) {
            zzk.zzlk().m17052e(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= listQueryIntentActivities.size()) {
                    break;
                }
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                    resolveInfo = resolveInfoResolveActivity;
                    break;
                }
                i2++;
            }
        }
        arrayList.addAll(listQueryIntentActivities);
        return resolveInfo;
    }

    @VisibleForTesting
    /* renamed from: c */
    private final ResolveInfo m16574c(Intent intent) {
        return m16573b(intent, new ArrayList<>());
    }

    /* renamed from: e */
    private static Intent m16575e(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent m16576d(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaht.m16576d(java.util.Map):android.content.Intent");
    }
}
