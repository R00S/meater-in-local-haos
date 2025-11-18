package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.C5641a0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10803n;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: CustomTabUtils.kt */
/* renamed from: com.facebook.internal.v */
/* loaded from: classes2.dex */
public final class C5733v {

    /* renamed from: a */
    public static final C5733v f14626a = new C5733v();

    /* renamed from: b */
    private static final String[] f14627b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private C5733v() {
    }

    /* renamed from: a */
    public static final String m11803a() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        Context contextM11284c = C5641a0.m11284c();
        List<ResolveInfo> listQueryIntentServices = contextM11284c.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        C9801m.m32345e(listQueryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
        HashSet hashSetM38739S = C10803n.m38739S(f14627b);
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && hashSetM38739S.contains(serviceInfo.packageName)) {
                return serviceInfo.packageName;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final String m11804b() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        return C9801m.m32354n("fbconnect://cct.", C5641a0.m11284c().getPackageName());
    }

    /* renamed from: c */
    public static final String m11805c(String str) {
        C9801m.m32346f(str, "developerDefinedRedirectURI");
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        return C5698q0.m11636d(C5641a0.m11284c(), str) ? str : C5698q0.m11636d(C5641a0.m11284c(), m11804b()) ? m11804b() : HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
