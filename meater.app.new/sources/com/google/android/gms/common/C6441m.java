package com.google.android.gms.common;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.m */
/* loaded from: classes2.dex */
class C6441m {

    /* renamed from: a */
    private static final C6441m f17886a = new C6441m(true, 3, 1, null, null);

    /* renamed from: b */
    final boolean f17887b;

    /* renamed from: c */
    final String f17888c;

    /* renamed from: d */
    final Throwable f17889d;

    /* renamed from: e */
    final int f17890e;

    private C6441m(boolean z, int i2, int i3, String str, Throwable th) {
        this.f17887b = z;
        this.f17890e = i2;
        this.f17888c = str;
        this.f17889d = th;
    }

    @Deprecated
    /* renamed from: b */
    static C6441m m14532b() {
        return f17886a;
    }

    /* renamed from: c */
    static C6441m m14533c(String str) {
        return new C6441m(false, 1, 5, str, null);
    }

    /* renamed from: d */
    static C6441m m14534d(String str, Throwable th) {
        return new C6441m(false, 1, 5, str, th);
    }

    /* renamed from: f */
    static C6441m m14535f(int i2) {
        return new C6441m(true, i2, 1, null, null);
    }

    /* renamed from: g */
    static C6441m m14536g(int i2, int i3, String str, Throwable th) {
        return new C6441m(false, i2, i3, str, th);
    }

    /* renamed from: a */
    String mo14527a() {
        return this.f17888c;
    }

    /* renamed from: e */
    final void m14537e() {
        if (this.f17887b || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f17889d != null) {
            Log.d("GoogleCertificatesRslt", mo14527a(), this.f17889d);
        } else {
            Log.d("GoogleCertificatesRslt", mo14527a());
        }
    }
}
