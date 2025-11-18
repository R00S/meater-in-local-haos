package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wa */
/* loaded from: classes2.dex */
final class C7295wa implements com.google.android.gms.ads.internal.overlay.zzo {

    /* renamed from: f */
    private zzbgz f20843f;

    /* renamed from: g */
    private com.google.android.gms.ads.internal.overlay.zzo f20844g;

    public C7295wa(zzbgz zzbgzVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.f20843f = zzbgzVar;
        this.f20844g = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
        this.f20844g.zzsz();
        this.f20843f.mo14882J();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
        this.f20844g.zzta();
        this.f20843f.mo14902c0();
    }
}
