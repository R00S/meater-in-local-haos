package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbqe implements zzbrl, zzbrw, zzbsr, zzbtk, zzxr {

    /* renamed from: f */
    private final Clock f23476f;

    /* renamed from: g */
    private final zzawj f23477g;

    public zzbqe(Clock clock, zzawj zzawjVar) {
        this.f23476f = clock;
        this.f23477g = zzawjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: N */
    public final void mo15437N(zzarx zzarxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    /* renamed from: a */
    public final void mo17882a(zzasr zzasrVar, String str, String str2) {
    }

    /* renamed from: b */
    public final void m18257b(zzxz zzxzVar) {
        this.f23477g.m17032d(zzxzVar);
    }

    /* renamed from: c */
    public final String m18258c() {
        return this.f23477g.m17037i();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void onAdClicked() {
        this.f23477g.m17035g();
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdClosed() {
        this.f23477g.m17036h();
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void onAdImpression() {
        this.f23477g.m17034f();
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        this.f23477g.m17031c(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: q */
    public final void mo15438q(zzcxu zzcxuVar) {
        this.f23477g.m17033e(this.f23476f.mo14609b());
    }
}
