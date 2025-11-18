package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.regex.Pattern;

@zzard
/* loaded from: classes2.dex */
public final class zzacw {
    /* renamed from: a */
    public static boolean m16427a(String str) {
        return m16428b((String) zzyt.m20848e().m16421c(zzacu.f21819k4), str);
    }

    /* renamed from: b */
    private static boolean m16428b(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e2) {
                zzk.zzlk().m17052e(e2, "NonagonUtil.isPatternMatched");
            }
        }
        return false;
    }
}
