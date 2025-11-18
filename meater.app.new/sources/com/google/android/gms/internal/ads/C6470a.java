package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a */
/* loaded from: classes2.dex */
final class C6470a extends zzyv {

    /* renamed from: c */
    private final /* synthetic */ zzabb f18063c;

    C6470a(zzabb zzabbVar) {
        this.f18063c = zzabbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyv, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(int i2) {
        this.f18063c.f21532d.zza(this.f18063c.m16269D());
        super.onAdFailedToLoad(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzyv, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f18063c.f21532d.zza(this.f18063c.m16269D());
        super.onAdLoaded();
    }
}
