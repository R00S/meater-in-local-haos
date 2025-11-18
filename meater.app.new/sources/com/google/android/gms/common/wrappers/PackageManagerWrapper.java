package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class PackageManagerWrapper {

    /* renamed from: a */
    protected final Context f18012a;

    public PackageManagerWrapper(Context context) {
        this.f18012a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public int m14667a(String str) {
        return this.f18012a.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    /* renamed from: b */
    public int m14668b(String str, String str2) {
        return this.f18012a.getPackageManager().checkPermission(str, str2);
    }

    @KeepForSdk
    /* renamed from: c */
    public ApplicationInfo m14669c(String str, int i2) throws PackageManager.NameNotFoundException {
        return this.f18012a.getPackageManager().getApplicationInfo(str, i2);
    }

    @KeepForSdk
    /* renamed from: d */
    public CharSequence m14670d(String str) throws PackageManager.NameNotFoundException {
        return this.f18012a.getPackageManager().getApplicationLabel(this.f18012a.getPackageManager().getApplicationInfo(str, 0));
    }

    @KeepForSdk
    /* renamed from: e */
    public PackageInfo m14671e(String str, int i2) throws PackageManager.NameNotFoundException {
        return this.f18012a.getPackageManager().getPackageInfo(str, i2);
    }

    @KeepForSdk
    /* renamed from: f */
    public boolean m14672f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.m14666a(this.f18012a);
        }
        if (!PlatformVersion.m14647k() || (nameForUid = this.f18012a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f18012a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: g */
    public final boolean m14673g(int i2, String str) {
        if (PlatformVersion.m14642f()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f18012a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i2, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f18012a.getPackageManager().getPackagesForUid(i2);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
