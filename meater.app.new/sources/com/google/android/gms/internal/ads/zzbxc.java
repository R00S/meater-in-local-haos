package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbxc implements zzbrl {

    /* renamed from: f */
    private final zzbrt f23675f;

    /* renamed from: g */
    private final zzcxm f23676g;

    public zzbxc(zzbrt zzbrtVar, zzcxm zzcxmVar) {
        this.f23675f = zzbrtVar;
        this.f23676g = zzcxmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    /* renamed from: a */
    public final void mo17882a(zzasr zzasrVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdOpened() {
        int i2 = this.f23676g.f25242O;
        if (i2 == 0 || i2 == 1) {
            this.f23675f.m18301Y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoStarted() {
    }
}
