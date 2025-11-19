package Q8;

import android.content.Context;

/* compiled from: InstallerPackageNameProvider.java */
/* loaded from: classes2.dex */
class N {

    /* renamed from: a, reason: collision with root package name */
    private String f14418a;

    N() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.f14418a == null) {
                this.f14418a = b(context);
            }
        } finally {
        }
        return "".equals(this.f14418a) ? null : this.f14418a;
    }
}
