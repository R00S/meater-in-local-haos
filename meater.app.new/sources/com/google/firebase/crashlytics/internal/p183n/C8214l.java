package com.google.firebase.crashlytics.internal.p183n;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.crashlytics.internal.C8178g;
import java.util.List;

/* compiled from: AppData.java */
/* renamed from: com.google.firebase.crashlytics.h.n.l */
/* loaded from: classes2.dex */
public class C8214l {

    /* renamed from: a */
    public final String f30933a;

    /* renamed from: b */
    public final String f30934b;

    /* renamed from: c */
    public final List<C8224q> f30935c;

    /* renamed from: d */
    public final String f30936d;

    /* renamed from: e */
    public final String f30937e;

    /* renamed from: f */
    public final String f30938f;

    /* renamed from: g */
    public final String f30939g;

    /* renamed from: h */
    public final C8178g f30940h;

    public C8214l(String str, String str2, List<C8224q> list, String str3, String str4, String str5, String str6, C8178g c8178g) {
        this.f30933a = str;
        this.f30934b = str2;
        this.f30935c = list;
        this.f30936d = str3;
        this.f30937e = str4;
        this.f30938f = str5;
        this.f30939g = str6;
        this.f30940h = c8178g;
    }

    /* renamed from: a */
    public static C8214l m25274a(Context context, C8209i0 c8209i0, String str, String str2, List<C8224q> list, C8178g c8178g) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strM25264g = c8209i0.m25264g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strM25275b = m25275b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C8214l(str, str2, list, strM25264g, packageName, strM25275b, str3, c8178g);
    }

    /* renamed from: b */
    private static String m25275b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
