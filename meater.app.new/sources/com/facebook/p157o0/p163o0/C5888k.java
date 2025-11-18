package com.facebook.p157o0.p163o0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.facebook.C5641a0;
import com.facebook.internal.C5666a0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;

/* compiled from: InAppPurchaseManager.kt */
/* renamed from: com.facebook.o0.o0.k */
/* loaded from: classes2.dex */
public final class C5888k {

    /* renamed from: a */
    public static final C5888k f15323a = new C5888k();

    /* renamed from: b */
    private static final AtomicBoolean f15324b = new AtomicBoolean(false);

    private C5888k() {
    }

    /* renamed from: a */
    public static final void m12564a() {
        f15324b.set(true);
        m12565b();
    }

    /* renamed from: b */
    public static final void m12565b() {
        if (f15324b.get()) {
            if (f15323a.m12566c()) {
                C5666a0 c5666a0 = C5666a0.f14313a;
                if (C5666a0.m11378g(C5666a0.b.IapLoggingLib2)) {
                    C5884g c5884g = C5884g.f15284a;
                    C5641a0 c5641a0 = C5641a0.f14199a;
                    C5884g.m12509d(C5641a0.m11284c());
                    return;
                }
            }
            C5883f c5883f = C5883f.f15275a;
            C5883f.m12500g();
        }
    }

    /* renamed from: c */
    private final boolean m12566c() throws PackageManager.NameNotFoundException {
        try {
            C5641a0 c5641a0 = C5641a0.f14199a;
            Context contextM11284c = C5641a0.m11284c();
            ApplicationInfo applicationInfo = contextM11284c.getPackageManager().getApplicationInfo(contextM11284c.getPackageName(), 128);
            C9801m.m32345e(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            return Integer.parseInt((String) C10547v.m37582v0(string, new String[]{"."}, false, 3, 2, null).get(0)) >= 2;
        } catch (Exception unused) {
            return false;
        }
    }
}
