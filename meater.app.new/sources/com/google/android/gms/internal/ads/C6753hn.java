package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hn */
/* loaded from: classes2.dex */
final class C6753hn implements zzban<zzcdb> {

    /* renamed from: a */
    private final /* synthetic */ zzcdf f19239a;

    /* renamed from: b */
    private final /* synthetic */ zzcqj f19240b;

    C6753hn(zzcqj zzcqjVar, zzcdf zzcdfVar) {
        this.f19240b = zzcqjVar;
        this.f19239a = zzcdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        synchronized (this.f19240b) {
            zzcqj.m18942i7(this.f19240b, null);
            this.f19239a.mo15434b().onAdFailedToLoad(zzcgm.m18773b(th));
            zzcya.m19066a(th, "NonagonRewardedVideoAdImpl.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(zzcdb zzcdbVar) {
        zzcdb zzcdbVar2 = zzcdbVar;
        synchronized (this.f19240b) {
            zzcqj.m18942i7(this.f19240b, null);
            this.f19240b.f24931g = zzcdbVar2;
            zzcdbVar2.mo16095c();
        }
    }
}
