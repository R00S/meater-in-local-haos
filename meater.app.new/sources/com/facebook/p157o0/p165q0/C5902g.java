package com.facebook.p157o0.p165q0;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import com.facebook.C5641a0;
import com.facebook.internal.C5696p0;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;

/* compiled from: AppEventUtility.kt */
/* renamed from: com.facebook.o0.q0.g */
/* loaded from: classes2.dex */
public final class C5902g {

    /* renamed from: a */
    public static final C5902g f15370a = new C5902g();

    private C5902g() {
    }

    /* renamed from: a */
    public static final void m12624a() {
    }

    /* renamed from: b */
    public static final void m12625b() {
    }

    /* renamed from: c */
    public static final String m12626c(byte[] bArr) {
        C9801m.m32346f(bArr, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            C9801m.m32345e(str, "java.lang.String.format(format, *args)");
            stringBuffer.append(str);
        }
        String string = stringBuffer.toString();
        C9801m.m32345e(string, "sb.toString()");
        return string;
    }

    /* renamed from: d */
    public static final String m12627d() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        Context contextM11284c = C5641a0.m11284c();
        try {
            String str = contextM11284c.getPackageManager().getPackageInfo(contextM11284c.getPackageName(), 0).versionName;
            C9801m.m32345e(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: e */
    public static final View m12628e(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m12629f() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            kotlin.jvm.internal.C9801m.m32345e(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r6 = kotlin.text.C10537l.m37450E(r0, r2, r3, r4, r5)
            if (r6 != 0) goto L73
            kotlin.jvm.internal.C9801m.m32345e(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = kotlin.text.C10537l.m37450E(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.C9801m.m32345e(r0, r1)
            java.lang.String r6 = "google_sdk"
            boolean r7 = kotlin.text.C10537l.m37457J(r0, r6, r3, r4, r5)
            if (r7 != 0) goto L73
            kotlin.jvm.internal.C9801m.m32345e(r0, r1)
            java.lang.String r7 = "Emulator"
            boolean r7 = kotlin.text.C10537l.m37457J(r0, r7, r3, r4, r5)
            if (r7 != 0) goto L73
            kotlin.jvm.internal.C9801m.m32345e(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = kotlin.text.C10537l.m37457J(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.C9801m.m32345e(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = kotlin.text.C10537l.m37457J(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.C9801m.m32345e(r0, r1)
            boolean r0 = kotlin.text.C10537l.m37450E(r0, r2, r3, r4, r5)
            if (r0 == 0) goto L6b
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "DEVICE"
            kotlin.jvm.internal.C9801m.m32345e(r0, r1)
            boolean r0 = kotlin.text.C10537l.m37450E(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L73
        L6b:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = kotlin.jvm.internal.C9801m.m32341a(r6, r0)
            if (r0 == 0) goto L74
        L73:
            r3 = 1
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p165q0.C5902g.m12629f():boolean");
    }

    /* renamed from: g */
    public static final double m12630g(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            String strGroup = matcher.group(0);
            C5696p0 c5696p0 = C5696p0.f14478a;
            return NumberFormat.getNumberInstance(C5696p0.m11602y()).parse(strGroup).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
