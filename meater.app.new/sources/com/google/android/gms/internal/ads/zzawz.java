package com.google.android.gms.internal.ads;

import android.util.Log;

@zzard
/* loaded from: classes2.dex */
public final class zzawz extends zzbad {
    /* renamed from: l */
    public static void m17081l(String str, Throwable th) {
        if (m17083n()) {
            Log.v("Ads", str, th);
        }
    }

    /* renamed from: m */
    public static void m17082m(String str) {
        if (m17083n()) {
            Log.v("Ads", str);
        }
    }

    /* renamed from: n */
    public static boolean m17083n() {
        if (zzbad.m17345a(2)) {
            return ((Boolean) zzyt.m20848e().m16421c(zzacu.f21672N1)).booleanValue();
        }
        return false;
    }
}
