package B9;

import android.content.Context;
import android.content.pm.PackageManager;
import oc.v;
import v9.C4925a;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f1953a;

    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(Context context) {
        Boolean bool = f1953a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f1953a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            C4925a.e().a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static int c(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static String d(String str) {
        v vVarM = v.m(str);
        return vVarM != null ? vVarM.k().z("").l("").p(null).f(null).toString() : str;
    }

    public static String e(String str, int i10) {
        int iLastIndexOf;
        if (str.length() <= i10) {
            return str;
        }
        if (str.charAt(i10) == '/') {
            return str.substring(0, i10);
        }
        v vVarM = v.m(str);
        return vVarM == null ? str.substring(0, i10) : (vVarM.d().lastIndexOf(47) < 0 || (iLastIndexOf = str.lastIndexOf(47, i10 + (-1))) < 0) ? str.substring(0, i10) : str.substring(0, iLastIndexOf);
    }
}
