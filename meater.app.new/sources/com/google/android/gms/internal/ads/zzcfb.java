package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcfb implements zzbro, zzbsr, zzbtk {

    /* renamed from: f */
    private final zzcfi f24204f;

    /* renamed from: g */
    private final String f24205g = (String) zzyt.m20848e().m16421c(zzacu.f21784f0);

    /* renamed from: h */
    private final zzdae f24206h;

    public zzcfb(zzcfi zzcfiVar, zzdae zzdaeVar) {
        this.f24204f = zzcfiVar;
        this.f24206h = zzdaeVar;
    }

    /* renamed from: a */
    private final void m18721a(Map<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f24205g).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21777e0)).booleanValue()) {
            this.f24206h.m19135e(string);
        }
        zzawz.m17082m(string);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: N */
    public final void mo15437N(zzarx zzarxVar) {
        this.f24204f.m18729b(zzarxVar.f22411f);
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void onAdFailedToLoad(int i2) {
        m18721a(this.f24204f.m18730c());
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        m18721a(this.f24204f.m18730c());
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: q */
    public final void mo15438q(zzcxu zzcxuVar) {
        this.f24204f.m18728a(zzcxuVar);
    }
}
