package Q8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;

/* compiled from: AppData.java */
/* renamed from: Q8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1614b {

    /* renamed from: a, reason: collision with root package name */
    public final String f14421a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14422b;

    /* renamed from: c, reason: collision with root package name */
    public final List<C1619g> f14423c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14424d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14425e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14426f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14427g;

    /* renamed from: h, reason: collision with root package name */
    public final N8.f f14428h;

    public C1614b(String str, String str2, List<C1619g> list, String str3, String str4, String str5, String str6, N8.f fVar) {
        this.f14421a = str;
        this.f14422b = str2;
        this.f14423c = list;
        this.f14424d = str3;
        this.f14425e = str4;
        this.f14426f = str5;
        this.f14427g = str6;
        this.f14428h = fVar;
    }

    public static C1614b a(Context context, L l10, String str, String str2, List<C1619g> list, N8.f fVar) {
        String packageName = context.getPackageName();
        String strG = l10.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C1614b(str, str2, list, strG, packageName, strB, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
