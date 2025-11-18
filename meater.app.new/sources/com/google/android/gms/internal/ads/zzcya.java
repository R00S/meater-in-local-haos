package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzcya {
    /* renamed from: a */
    public static void m19066a(Throwable th, String str) {
        int iM18773b = zzcgm.m18773b(th);
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(iM18773b);
        zzbad.m17352h(sb.toString());
        zzawz.m17081l(str, th);
        if (zzcgm.m18773b(th) == 3) {
            return;
        }
        zzk.zzlk().m17053h(th, str);
    }

    /* renamed from: b */
    public static void m19067b(Context context, boolean z) {
        if (z) {
            zzbad.m17352h("This request is sent from a test device.");
            return;
        }
        zzyt.m20844a();
        String strM17307l = zzazt.m17307l(context);
        StringBuilder sb = new StringBuilder(String.valueOf(strM17307l).length() + 71);
        sb.append("Use AdRequest.Builder.addTestDevice(\"");
        sb.append(strM17307l);
        sb.append("\") to get test ads on this device.");
        zzbad.m17352h(sb.toString());
    }
}
