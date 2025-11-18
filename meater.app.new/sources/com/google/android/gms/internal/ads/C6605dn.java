package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dn */
/* loaded from: classes2.dex */
final class C6605dn implements zzban<zzcdb> {

    /* renamed from: a */
    private final /* synthetic */ zzcdf f18694a;

    /* renamed from: b */
    private final /* synthetic */ zzcqf f18695b;

    C6605dn(zzcqf zzcqfVar, zzcdf zzcdfVar) {
        this.f18695b = zzcqfVar;
        this.f18694a = zzcdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        synchronized (this.f18695b) {
            zzcqf.m18937i7(this.f18695b, null);
            this.f18694a.mo15434b().onAdFailedToLoad(zzcgm.m18773b(th));
            zzcya.m19066a(th, "NonagonRewardedAdImpl.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(zzcdb zzcdbVar) {
        zzcdb zzcdbVar2 = zzcdbVar;
        synchronized (this.f18695b) {
            zzcqf.m18937i7(this.f18695b, null);
            this.f18695b.f24920g = zzcdbVar2;
            zzcdbVar2.mo16095c();
        }
    }
}
