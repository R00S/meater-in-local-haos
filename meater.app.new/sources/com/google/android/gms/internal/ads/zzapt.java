package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzapt {

    /* renamed from: a */
    private final zzbgz f22249a;

    /* renamed from: b */
    private final boolean f22250b;

    /* renamed from: c */
    private final String f22251c;

    public zzapt(zzbgz zzbgzVar, Map<String, String> map) {
        this.f22249a = zzbgzVar;
        this.f22251c = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f22250b = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.f22250b = true;
        }
    }

    /* renamed from: a */
    public final void m16843a() {
        int iMo17205s;
        if (this.f22249a == null) {
            zzbad.m17353i("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.f22251c)) {
            zzk.zzli();
            iMo17205s = 7;
        } else if ("landscape".equalsIgnoreCase(this.f22251c)) {
            zzk.zzli();
            iMo17205s = 6;
        } else {
            iMo17205s = this.f22250b ? -1 : zzk.zzli().mo17205s();
        }
        this.f22249a.setRequestedOrientation(iMo17205s);
    }
}
