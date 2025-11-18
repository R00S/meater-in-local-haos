package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cn */
/* loaded from: classes2.dex */
final class C6568cn implements zzban<zzbvx> {

    /* renamed from: a */
    private final /* synthetic */ zzbws f18460a;

    /* renamed from: b */
    private final /* synthetic */ zzcqd f18461b;

    C6568cn(zzcqd zzcqdVar, zzbws zzbwsVar) {
        this.f18461b = zzcqdVar;
        this.f18460a = zzbwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        synchronized (this.f18461b) {
            zzcqd.m18934i7(this.f18461b, null);
            this.f18460a.mo15301b().onAdFailedToLoad(zzcgm.m18773b(th));
            zzcya.m19066a(th, "InterstitialAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(zzbvx zzbvxVar) {
        zzbvx zzbvxVar2 = zzbvxVar;
        synchronized (this.f18461b) {
            zzcqd.m18934i7(this.f18461b, null);
            this.f18461b.f24916n = zzbvxVar2;
            zzbvxVar2.mo16095c();
        }
    }
}
