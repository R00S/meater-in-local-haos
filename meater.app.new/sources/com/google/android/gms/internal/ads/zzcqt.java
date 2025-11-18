package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public class zzcqt {

    /* renamed from: a */
    private String f24943a;

    public static class zza {

        /* renamed from: a */
        private String f24944a;

        /* renamed from: b */
        public final zza m18953b(String str) {
            this.f24944a = str;
            return this;
        }
    }

    private zzcqt(zza zzaVar) {
        this.f24943a = zzaVar.f24944a;
    }

    /* renamed from: a */
    public final Set<String> m18949a() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f24943a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    /* renamed from: b */
    public final String m18950b() {
        return this.f24943a.toLowerCase(Locale.ROOT);
    }

    /* renamed from: c */
    public final int m18951c() {
        String str = this.f24943a;
        str.hashCode();
        switch (str) {
            case "NATIVE":
                return 6;
            case "INTERSTITIAL":
                return 3;
            case "REWARDED":
                return 7;
            case "BANNER":
                return 1;
            default:
                return 0;
        }
    }
}
