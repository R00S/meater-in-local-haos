package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0240d;

/* compiled from: PermissionChecker.java */
/* renamed from: androidx.core.content.c */
/* loaded from: classes.dex */
public final class C0257c {
    /* renamed from: a */
    public static int m1700a(Context context, String str, int i2, int i3, String str2) {
        if (context.checkPermission(str, i2, i3) == -1) {
            return -1;
        }
        String strM1545b = C0240d.m1545b(str);
        if (strM1545b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i3);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0240d.m1544a(context, strM1545b, str2) != 0 ? -2 : 0;
    }

    /* renamed from: b */
    public static int m1701b(Context context, String str) {
        return m1700a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
