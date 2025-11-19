package g1;

import android.content.Context;
import android.os.Process;
import f1.C3313f;
import r1.C4337d;

/* compiled from: PermissionChecker.java */
/* renamed from: g1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3380d {
    public static int a(Context context, String str, int i10, int i11, String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String strC = C3313f.c(str);
        if (strC == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i11 || !C4337d.a(context.getPackageName(), str2)) ? C3313f.b(context, strC, str2) : C3313f.a(context, i11, strC, str2)) == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
