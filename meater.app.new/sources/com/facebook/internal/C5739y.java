package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import kotlin.collections.C10782c0;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;

/* compiled from: FacebookSignatureValidator.kt */
/* renamed from: com.facebook.internal.y */
/* loaded from: classes2.dex */
public final class C5739y {

    /* renamed from: a */
    public static final C5739y f14647a = new C5739y();

    /* renamed from: b */
    private static final HashSet<String> f14648b = C10822w0.m38918e("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    private C5739y() {
    }

    /* renamed from: a */
    public static final boolean m11828a(Context context, String str) throws PackageManager.NameNotFoundException {
        C9801m.m32346f(context, "context");
        C9801m.m32346f(str, "packageName");
        String str2 = Build.BRAND;
        int i2 = context.getApplicationInfo().flags;
        C9801m.m32345e(str2, "brand");
        if (C10546u.m37511E(str2, "generic", false, 2, null) && (i2 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            C9801m.m32345e(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return false;
            }
            Signature[] signatureArr2 = packageInfo.signatures;
            C9801m.m32345e(signatureArr2, "packageInfo.signatures");
            for (Signature signature : signatureArr2) {
                HashSet<String> hashSet = f14648b;
                C5696p0 c5696p0 = C5696p0.f14478a;
                byte[] byteArray = signature.toByteArray();
                C9801m.m32345e(byteArray, "it.toByteArray()");
                if (!C10782c0.m38577K(hashSet, C5696p0.m11533E0(byteArray))) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
