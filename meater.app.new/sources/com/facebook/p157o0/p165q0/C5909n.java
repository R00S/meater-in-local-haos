package com.facebook.p157o0.p165q0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.notification.PullingContentService;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import com.facebook.EnumC5659g0;
import com.facebook.internal.C5684j0;
import com.facebook.internal.p156v0.C5735b;
import com.facebook.p157o0.C5813a0;
import com.facebook.p157o0.C5825g0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: SessionLogger.kt */
/* renamed from: com.facebook.o0.q0.n */
/* loaded from: classes2.dex */
public final class C5909n {

    /* renamed from: a */
    public static final C5909n f15400a = new C5909n();

    /* renamed from: b */
    private static final String f15401b = C5909n.class.getCanonicalName();

    /* renamed from: c */
    private static final long[] f15402c = {LocalNotificationSyncManager.FIVE_MINUTES, 900000, BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS, 3600000, 21600000, 43200000, PullingContentService.UPDATES_INTERVAL, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private C5909n() {
    }

    /* renamed from: a */
    private final String m12665a(Context context) throws PackageManager.NameNotFoundException {
        try {
            PackageManager packageManager = context.getPackageManager();
            String strM32354n = C9801m.m32354n("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(strM32354n, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            C5907l c5907l = C5907l.f15386a;
            String strM12648c = C5907l.m12648c(context, null);
            if (strM12648c == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                C9801m.m32345e(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                strM12648c = C5907l.m12647b(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(strM32354n, strM12648c).apply();
            return strM12648c;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final int m12666b(long j2) {
        int i2 = 0;
        while (true) {
            long[] jArr = f15402c;
            if (i2 >= jArr.length || jArr[i2] >= j2) {
                break;
            }
            i2++;
        }
        return i2;
    }

    /* renamed from: c */
    public static final void m12667c(String str, C5910o c5910o, String str2, Context context) {
        String string;
        C9801m.m32346f(str, "activityName");
        C9801m.m32346f(context, "context");
        String str3 = "Unclassified";
        if (c5910o != null && (string = c5910o.toString()) != null) {
            str3 = string;
        }
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", str3);
        bundle.putString("fb_mobile_pckg_fp", f15400a.m12665a(context));
        C5735b c5735b = C5735b.f14633a;
        bundle.putString("fb_mobile_app_cert_hash", C5735b.m11806a(context));
        C5825g0.a aVar = C5825g0.f14949a;
        C5825g0 c5825g0M12249a = aVar.m12249a(str, str2, null);
        c5825g0M12249a.m12242d("fb_mobile_activate_app", bundle);
        if (aVar.m12251c() != C5813a0.b.EXPLICIT_ONLY) {
            c5825g0M12249a.m12239a();
        }
    }

    /* renamed from: d */
    private final void m12668d() {
        C5684j0.a aVar = C5684j0.f14429a;
        EnumC5659g0 enumC5659g0 = EnumC5659g0.APP_EVENTS;
        String str = f15401b;
        C9801m.m32343c(str);
        aVar.m11454b(enumC5659g0, str, "Clock skew detected");
    }

    /* renamed from: e */
    public static final void m12669e(String str, C5908m c5908m, String str2) {
        long jLongValue;
        String string;
        C9801m.m32346f(str, "activityName");
        if (c5908m == null) {
            return;
        }
        Long lM12651b = c5908m.m12651b();
        if (lM12651b == null) {
            Long lM12654e = c5908m.m12654e();
            jLongValue = 0 - (lM12654e == null ? 0L : lM12654e.longValue());
        } else {
            jLongValue = lM12651b.longValue();
        }
        if (jLongValue < 0) {
            f15400a.m12668d();
            jLongValue = 0;
        }
        long jM12655f = c5908m.m12655f();
        if (jM12655f < 0) {
            f15400a.m12668d();
            jM12655f = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", c5908m.m12652c());
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str3 = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(m12666b(jLongValue))}, 1));
        C9801m.m32345e(str3, "java.lang.String.format(locale, format, *args)");
        bundle.putString("fb_mobile_time_between_sessions", str3);
        C5910o c5910oM12656g = c5908m.m12656g();
        String str4 = "Unclassified";
        if (c5910oM12656g != null && (string = c5910oM12656g.toString()) != null) {
            str4 = string;
        }
        bundle.putString("fb_mobile_launch_source", str4);
        Long lM12654e2 = c5908m.m12654e();
        bundle.putLong("_logTime", (lM12654e2 != null ? lM12654e2.longValue() : 0L) / 1000);
        C5825g0 c5825g0M12249a = C5825g0.f14949a.m12249a(str, str2, null);
        double d2 = jM12655f;
        double d3 = 1000L;
        Double.isNaN(d2);
        Double.isNaN(d3);
        c5825g0M12249a.m12241c("fb_mobile_deactivate_app", d2 / d3, bundle);
    }
}
