package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.n0 */
/* loaded from: classes2.dex */
public final class C6111n0 {

    /* renamed from: a */
    private static C6111n0 f16152a;

    /* renamed from: b */
    public String f16153b;

    /* renamed from: c */
    private String f16154c;

    /* renamed from: d */
    public String f16155d = String.format(Locale.getDefault(), "Flurry_Android_%d_%d.%d.%d%s%s", 328, 13, 0, 1, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);

    private C6111n0() {
    }

    /* renamed from: a */
    public static synchronized C6111n0 m13190a() {
        if (f16152a == null) {
            f16152a = new C6111n0();
        }
        return f16152a;
    }

    /* renamed from: c */
    private static String m13191c() {
        try {
            Context contextM12964a = C6002b0.m12964a();
            PackageInfo packageInfo = contextM12964a.getPackageManager().getPackageInfo(contextM12964a.getPackageName(), 0);
            String str = packageInfo.versionName;
            if (str != null) {
                return str;
            }
            int i2 = packageInfo.versionCode;
            return i2 != 0 ? Integer.toString(i2) : "Unknown";
        } catch (Throwable th) {
            C6021d1.m13031d(6, "VersionProvider", HttpUrl.FRAGMENT_ENCODE_SET, th);
            return "Unknown";
        }
    }

    /* renamed from: b */
    public final synchronized String m13192b() {
        if (!TextUtils.isEmpty(this.f16153b)) {
            return this.f16153b;
        }
        if (!TextUtils.isEmpty(this.f16154c)) {
            return this.f16154c;
        }
        String strM13191c = m13191c();
        this.f16154c = strM13191c;
        return strM13191c;
    }
}
