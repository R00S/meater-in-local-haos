package com.google.firebase.crashlytics.internal.p183n;

import android.content.Context;
import okhttp3.HttpUrl;

/* compiled from: InstallerPackageNameProvider.java */
/* renamed from: com.google.firebase.crashlytics.h.n.k0 */
/* loaded from: classes2.dex */
class C8213k0 {

    /* renamed from: a */
    private String f30932a;

    C8213k0() {
    }

    /* renamed from: b */
    private static String m25272b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? HttpUrl.FRAGMENT_ENCODE_SET : installerPackageName;
    }

    /* renamed from: a */
    synchronized String m25273a(Context context) {
        if (this.f30932a == null) {
            this.f30932a = m25272b(context);
        }
        return HttpUrl.FRAGMENT_ENCODE_SET.equals(this.f30932a) ? null : this.f30932a;
    }
}
