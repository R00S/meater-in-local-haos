package c7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import g7.r0;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2337f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f31082a = C2339h.f31085a;

    /* renamed from: b, reason: collision with root package name */
    private static final C2337f f31083b = new C2337f();

    C2337f() {
    }

    public static C2337f f() {
        return f31083b;
    }

    public int a(Context context) {
        return C2339h.a(context);
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            int i11 = r0.f42110c;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.i.d(context)) {
            int i12 = r0.f42110c;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f31082a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(l7.c.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        int i13 = r0.f42110c;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return d(context, i10, i11, null);
    }

    public PendingIntent d(Context context, int i10, int i11, String str) {
        Intent intentB = b(context, i10, str);
        if (intentB == null) {
            return null;
        }
        return f1.t.b(context, i11, intentB, 134217728, false);
    }

    public String e(int i10) {
        return C2339h.b(i10);
    }

    public int g(Context context) {
        return h(context, f31082a);
    }

    public int h(Context context, int i10) {
        int iE = C2339h.e(context, i10);
        if (C2339h.f(context, iE)) {
            return 18;
        }
        return iE;
    }

    public boolean i(Context context, String str) {
        return C2339h.j(context, str);
    }

    public boolean j(int i10) {
        return C2339h.h(i10);
    }
}
