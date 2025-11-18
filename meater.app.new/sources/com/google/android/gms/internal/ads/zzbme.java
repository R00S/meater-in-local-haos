package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbme implements zzbrl, zzbrw, zzbsr, zzxr {

    /* renamed from: f */
    private final zzcxu f23222f;

    /* renamed from: g */
    private final zzcxm f23223g;

    /* renamed from: h */
    private final zzdae f23224h;

    /* renamed from: i */
    private boolean f23225i;

    /* renamed from: j */
    private boolean f23226j;

    public zzbme(zzcxu zzcxuVar, zzcxm zzcxmVar, zzdae zzdaeVar) {
        this.f23222f = zzcxuVar;
        this.f23223g = zzcxmVar;
        this.f23224h = zzdaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    /* renamed from: a */
    public final void mo17882a(zzasr zzasrVar, String str, String str2) {
        zzdae zzdaeVar = this.f23224h;
        zzcxu zzcxuVar = this.f23222f;
        zzcxm zzcxmVar = this.f23223g;
        zzdaeVar.m19133b(zzcxuVar, zzcxmVar, zzcxmVar.f25250h, zzasrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void onAdClicked() {
        zzdae zzdaeVar = this.f23224h;
        zzcxu zzcxuVar = this.f23222f;
        zzcxm zzcxmVar = this.f23223g;
        zzdaeVar.m19132a(zzcxuVar, zzcxmVar, zzcxmVar.f25245c);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final synchronized void onAdImpression() {
        if (!this.f23226j) {
            zzdae zzdaeVar = this.f23224h;
            zzcxu zzcxuVar = this.f23222f;
            zzcxm zzcxmVar = this.f23223g;
            zzdaeVar.m19132a(zzcxuVar, zzcxmVar, zzcxmVar.f25246d);
            this.f23226j = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final synchronized void onAdLoaded() {
        if (this.f23225i) {
            ArrayList arrayList = new ArrayList(this.f23223g.f25246d);
            arrayList.addAll(this.f23223g.f25248f);
            this.f23224h.m19134c(this.f23222f, this.f23223g, true, arrayList);
        } else {
            zzdae zzdaeVar = this.f23224h;
            zzcxu zzcxuVar = this.f23222f;
            zzcxm zzcxmVar = this.f23223g;
            zzdaeVar.m19132a(zzcxuVar, zzcxmVar, zzcxmVar.f25255m);
            zzdae zzdaeVar2 = this.f23224h;
            zzcxu zzcxuVar2 = this.f23222f;
            zzcxm zzcxmVar2 = this.f23223g;
            zzdaeVar2.m19132a(zzcxuVar2, zzcxmVar2, zzcxmVar2.f25248f);
        }
        this.f23225i = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoCompleted() {
        zzdae zzdaeVar = this.f23224h;
        zzcxu zzcxuVar = this.f23222f;
        zzcxm zzcxmVar = this.f23223g;
        zzdaeVar.m19132a(zzcxuVar, zzcxmVar, zzcxmVar.f25251i);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoStarted() {
        zzdae zzdaeVar = this.f23224h;
        zzcxu zzcxuVar = this.f23222f;
        zzcxm zzcxmVar = this.f23223g;
        zzdaeVar.m19132a(zzcxuVar, zzcxmVar, zzcxmVar.f25249g);
    }
}
