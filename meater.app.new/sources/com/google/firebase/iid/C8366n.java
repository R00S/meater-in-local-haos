package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.C8405j;
import java.util.List;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@KeepForSdk
/* renamed from: com.google.firebase.iid.n */
/* loaded from: classes2.dex */
public class C8366n {

    /* renamed from: a */
    private final Context f31746a;

    /* renamed from: b */
    private String f31747b;

    /* renamed from: c */
    private String f31748c;

    /* renamed from: d */
    private int f31749d;

    /* renamed from: e */
    private int f31750e = 0;

    public C8366n(Context context) {
        this.f31746a = context;
    }

    /* renamed from: c */
    public static String m26212c(C8405j c8405j) {
        String strM26425d = c8405j.m26406l().m26425d();
        if (strM26425d != null) {
            return strM26425d;
        }
        String strM26424c = c8405j.m26406l().m26424c();
        if (!strM26424c.startsWith("1:")) {
            return strM26424c;
        }
        String[] strArrSplit = strM26424c.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m26213f(String str) {
        try {
            return this.f31746a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m26214h() {
        PackageInfo packageInfoM26213f = m26213f(this.f31746a.getPackageName());
        if (packageInfoM26213f != null) {
            this.f31747b = Integer.toString(packageInfoM26213f.versionCode);
            this.f31748c = packageInfoM26213f.versionName;
        }
    }

    /* renamed from: a */
    public synchronized String m26215a() {
        if (this.f31747b == null) {
            m26214h();
        }
        return this.f31747b;
    }

    /* renamed from: b */
    public synchronized String m26216b() {
        if (this.f31748c == null) {
            m26214h();
        }
        return this.f31748c;
    }

    /* renamed from: d */
    public synchronized int m26217d() {
        PackageInfo packageInfoM26213f;
        if (this.f31749d == 0 && (packageInfoM26213f = m26213f("com.google.android.gms")) != null) {
            this.f31749d = packageInfoM26213f.versionCode;
        }
        return this.f31749d;
    }

    /* renamed from: e */
    public synchronized int m26218e() {
        int i2 = this.f31750e;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.f31746a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i3 = 1;
        if (!PlatformVersion.m14647k()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f31750e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f31750e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.m14647k()) {
            this.f31750e = 2;
            i3 = 2;
        } else {
            this.f31750e = 1;
        }
        return i3;
    }

    @KeepForSdk
    /* renamed from: g */
    public boolean m26219g() {
        return m26218e() != 0;
    }
}
