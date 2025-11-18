package c7;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import g7.C3445p;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2339h {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f31085a = 12451000;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f31087c = false;

    /* renamed from: d, reason: collision with root package name */
    static boolean f31088d = false;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    static final AtomicBoolean f31086b = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f31089e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String b(int i10) {
        return C2333b.O0(i10);
    }

    public static Resources c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean d(Context context) {
        try {
            if (!f31088d) {
                try {
                    PackageInfo packageInfoE = l7.c.a(context).e("com.google.android.gms", 64);
                    C2340i.a(context);
                    if (packageInfoE == null || C2340i.e(packageInfoE, false) || !C2340i.e(packageInfoE, true)) {
                        f31087c = false;
                    } else {
                        f31087c = true;
                    }
                    f31088d = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f31088d = true;
                }
            }
            return f31087c || !com.google.android.gms.common.util.i.b();
        } catch (Throwable th) {
            f31088d = true;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.C2339h.e(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean f(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return j(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean g(Context context) {
        Object systemService = context.getSystemService("user");
        C3445p.k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean h(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean i(Context context, int i10, String str) {
        return com.google.android.gms.common.util.q.b(context, i10, str);
    }

    @TargetApi(21)
    static boolean j(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !g(context);
    }
}
