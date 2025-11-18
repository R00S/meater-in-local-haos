package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcfi {

    /* renamed from: a */
    private Map<String, String> f24218a;

    public zzcfi(Context context, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f24218a = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("sdk", Build.VERSION.SDK);
        zzk.zzlg();
        linkedHashMap.put("device", zzaxi.m17159k0());
        linkedHashMap.put("app", str);
        zzk.zzlg();
        linkedHashMap.put("is_lite_sdk", zzaxi.m17125E(context) ? "1" : "0");
        linkedHashMap.put("e", TextUtils.join(",", zzacu.m16426d()));
    }

    /* renamed from: a */
    public final void m18728a(zzcxu zzcxuVar) {
        if (zzcxuVar.f25289b.f25283a.size() > 0) {
            int i2 = zzcxuVar.f25289b.f25283a.get(0).f25244b;
            if (i2 == 1) {
                this.f24218a.put("ad_format", "banner");
            } else if (i2 == 2) {
                this.f24218a.put("ad_format", "interstitial");
            } else if (i2 == 3) {
                this.f24218a.put("ad_format", "native_express");
            } else if (i2 == 4) {
                this.f24218a.put("ad_format", "native_advanced");
            } else if (i2 != 5) {
                this.f24218a.put("ad_format", "unknown");
            } else {
                this.f24218a.put("ad_format", "rewarded");
            }
            if (TextUtils.isEmpty(zzcxuVar.f25289b.f25284b.f25273b)) {
                return;
            }
            this.f24218a.put("gqi", zzcxuVar.f25289b.f25284b.f25273b);
        }
    }

    /* renamed from: b */
    public final void m18729b(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f24218a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f24218a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    /* renamed from: c */
    public final Map<String, String> m18730c() {
        return this.f24218a;
    }
}
