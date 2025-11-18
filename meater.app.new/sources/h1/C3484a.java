package h1;

import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: PackageInfoCompat.java */
/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3484a {

    /* compiled from: PackageInfoCompat.java */
    /* renamed from: h1.a$a, reason: collision with other inner class name */
    private static class C0541a {
        static long a(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0541a.a(packageInfo) : packageInfo.versionCode;
    }
}
