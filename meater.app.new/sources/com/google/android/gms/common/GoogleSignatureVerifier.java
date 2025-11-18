package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.RestrictedInheritance;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class GoogleSignatureVerifier {

    /* renamed from: a */
    private static GoogleSignatureVerifier f17222a;

    /* renamed from: b */
    private final Context f17223b;

    /* renamed from: c */
    private volatile String f17224c;

    public GoogleSignatureVerifier(Context context) {
        this.f17223b = context.getApplicationContext();
    }

    @KeepForSdk
    /* renamed from: a */
    public static GoogleSignatureVerifier m13830a(Context context) {
        Preconditions.m14372k(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (f17222a == null) {
                C6439k.m14522d(context);
                f17222a = new GoogleSignatureVerifier(context);
            }
        }
        return f17222a;
    }

    /* renamed from: d */
    static final AbstractBinderC6414g m13831d(PackageInfo packageInfo, AbstractBinderC6414g... abstractBinderC6414gArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC6415h binderC6415h = new BinderC6415h(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < abstractBinderC6414gArr.length; i2++) {
            if (abstractBinderC6414gArr[i2].equals(binderC6415h)) {
                return abstractBinderC6414gArr[i2];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m13832e(PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? m13831d(packageInfo, C6438j.f17873a) : m13831d(packageInfo, C6438j.f17873a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: f */
    private final C6441m m13833f(String str, boolean z, boolean z2) throws PackageManager.NameNotFoundException {
        C6441m c6441mM14533c;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C6441m.m14533c("null pkg");
        }
        if (str.equals(this.f17224c)) {
            return C6441m.m14532b();
        }
        if (C6439k.m14523e()) {
            c6441mM14533c = C6439k.m14520b(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.f17223b), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f17223b.getPackageManager().getPackageInfo(str, 64);
                boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.f17223b);
                if (packageInfo == null) {
                    c6441mM14533c = C6441m.m14533c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        c6441mM14533c = C6441m.m14533c("single cert required");
                    } else {
                        BinderC6415h binderC6415h = new BinderC6415h(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        C6441m c6441mM14519a = C6439k.m14519a(str2, binderC6415h, zHonorsDebugCertificates, false);
                        c6441mM14533c = (!c6441mM14519a.f17887b || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C6439k.m14519a(str2, binderC6415h, false, true).f17887b) ? c6441mM14519a : C6441m.m14533c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                return C6441m.m14534d("no pkg ".concat(str), e2);
            }
        }
        if (c6441mM14533c.f17887b) {
            this.f17224c = str;
        }
        return c6441mM14533c;
    }

    @KeepForSdk
    /* renamed from: b */
    public boolean m13834b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m13832e(packageInfo, false)) {
            return true;
        }
        if (m13832e(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.f17223b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: c */
    public boolean m13835c(int i2) throws PackageManager.NameNotFoundException {
        C6441m c6441mM14533c;
        int length;
        String[] packagesForUid = this.f17223b.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c6441mM14533c = null;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    Preconditions.m14372k(c6441mM14533c);
                    break;
                }
                c6441mM14533c = m13833f(packagesForUid[i3], false, false);
                if (c6441mM14533c.f17887b) {
                    break;
                }
                i3++;
            }
        } else {
            c6441mM14533c = C6441m.m14533c("no pkgs");
        }
        c6441mM14533c.m14537e();
        return c6441mM14533c.f17887b;
    }
}
