package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: Metadata.java */
/* loaded from: classes2.dex */
class G {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38255a;

    /* renamed from: b, reason: collision with root package name */
    private String f38256b;

    /* renamed from: c, reason: collision with root package name */
    private String f38257c;

    /* renamed from: d, reason: collision with root package name */
    private int f38258d;

    /* renamed from: e, reason: collision with root package name */
    private int f38259e = 0;

    G(Context context) {
        this.f38255a = context;
    }

    static String c(com.google.firebase.f fVar) {
        String strD = fVar.n().d();
        if (strD != null) {
            return strD;
        }
        String strC = fVar.n().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f38255a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo packageInfoF = f(this.f38255a.getPackageName());
        if (packageInfoF != null) {
            this.f38256b = Integer.toString(packageInfoF.versionCode);
            this.f38257c = packageInfoF.versionName;
        }
    }

    synchronized String a() {
        try {
            if (this.f38256b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38256b;
    }

    synchronized String b() {
        try {
            if (this.f38257c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38257c;
    }

    synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f38258d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f38258d = packageInfoF.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38258d;
    }

    synchronized int e() {
        int i10 = this.f38259e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f38255a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.l.e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f38259e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f38259e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.l.e()) {
            this.f38259e = 2;
        } else {
            this.f38259e = 1;
        }
        return this.f38259e;
    }

    boolean g() {
        return e() != 0;
    }
}
