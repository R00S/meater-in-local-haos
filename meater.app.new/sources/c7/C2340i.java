package c7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2340i {

    /* renamed from: c, reason: collision with root package name */
    private static C2340i f31090c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f31091a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f31092b;

    public C2340i(Context context) {
        this.f31091a = context.getApplicationContext();
    }

    public static C2340i a(Context context) {
        C3445p.k(context);
        synchronized (C2340i.class) {
            try {
                if (f31090c == null) {
                    y.d(context);
                    f31090c = new C2340i(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f31090c;
    }

    static final u d(PackageInfo packageInfo, u... uVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            v vVar = new v(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < uVarArr.length; i10++) {
                if (uVarArr[i10].equals(vVar)) {
                    return uVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (!z10) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z10 ? d(packageInfo2, x.f31106a) : d(packageInfo2, x.f31106a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final C2330H f(String str, boolean z10, boolean z11) throws PackageManager.NameNotFoundException {
        C2330H c2330hC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C2330H.c("null pkg");
        }
        if (str.equals(this.f31092b)) {
            return C2330H.b();
        }
        if (y.e()) {
            c2330hC = y.b(str, C2339h.d(this.f31091a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f31091a.getPackageManager().getPackageInfo(str, 64);
                boolean zD = C2339h.d(this.f31091a);
                if (packageInfo == null) {
                    c2330hC = C2330H.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        c2330hC = C2330H.c("single cert required");
                    } else {
                        v vVar = new v(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        C2330H c2330hA = y.a(str2, vVar, zD, false);
                        c2330hC = (!c2330hA.f31061a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !y.a(str2, vVar, false, true).f31061a) ? c2330hA : C2330H.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                return C2330H.d("no pkg ".concat(str), e10);
            }
        }
        if (c2330hC.f31061a) {
            this.f31092b = str;
        }
        return c2330hC;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (C2339h.d(this.f31091a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) throws PackageManager.NameNotFoundException {
        C2330H c2330hC;
        int length;
        String[] packagesForUid = this.f31091a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c2330hC = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    C3445p.k(c2330hC);
                    break;
                }
                c2330hC = f(packagesForUid[i11], false, false);
                if (c2330hC.f31061a) {
                    break;
                }
                i11++;
            }
        } else {
            c2330hC = C2330H.c("no pkgs");
        }
        c2330hC.e();
        return c2330hC.f31061a;
    }
}
