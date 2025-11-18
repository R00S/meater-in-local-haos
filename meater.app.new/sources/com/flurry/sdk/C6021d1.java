package com.flurry.sdk;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.flurry.sdk.d1 */
/* loaded from: classes2.dex */
public final class C6021d1 {

    /* renamed from: a */
    private static boolean f15785a = false;

    /* renamed from: b */
    private static int f15786b = 5;

    /* renamed from: c */
    private static boolean f15787c = false;

    /* renamed from: a */
    public static void m13028a() {
        f15785a = true;
    }

    /* renamed from: b */
    public static void m13029b(int i2) {
        f15786b = i2;
    }

    /* renamed from: c */
    public static void m13030c(int i2, String str, String str2) {
        m13040m(i2, str, str2);
    }

    /* renamed from: d */
    public static void m13031d(int i2, String str, String str2, Throwable th) {
        m13040m(i2, str, str2 + '\n' + Log.getStackTraceString(th));
    }

    /* renamed from: e */
    public static void m13032e(String str, String str2) {
        m13035h(3, str, str2);
    }

    /* renamed from: f */
    public static void m13033f(String str, String str2, Throwable th) {
        m13036i(6, str, str2, th);
    }

    /* renamed from: g */
    public static void m13034g() {
        f15785a = false;
    }

    /* renamed from: h */
    private static void m13035h(int i2, String str, String str2) {
        if (f15785a || f15786b > i2) {
            return;
        }
        m13038k(i2, str, str2);
    }

    /* renamed from: i */
    private static void m13036i(int i2, String str, String str2, Throwable th) {
        m13035h(i2, str, str2 + '\n' + Log.getStackTraceString(th));
    }

    /* renamed from: j */
    public static void m13037j(String str, String str2) {
        m13035h(6, str, str2);
    }

    /* renamed from: k */
    private static void m13038k(int i2, String str, String str2) {
        if (!f15787c) {
            str = "FlurryAgent";
        }
        int i3 = 0;
        int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
        while (i3 < length) {
            int i4 = 4000 > length - i3 ? length : i3 + 4000;
            if (Log.println(i2, str, str2.substring(i3, i4)) <= 0) {
                return;
            } else {
                i3 = i4;
            }
        }
    }

    /* renamed from: l */
    public static void m13039l(String str, String str2) {
        m13035h(4, str, str2);
    }

    /* renamed from: m */
    private static void m13040m(int i2, String str, String str2) {
        if (f15787c) {
            m13038k(i2, str, str2);
        }
    }

    /* renamed from: n */
    public static void m13041n(String str, String str2) {
        m13035h(2, str, str2);
    }

    /* renamed from: o */
    public static void m13042o(String str, String str2) {
        m13035h(5, str, str2);
    }
}
