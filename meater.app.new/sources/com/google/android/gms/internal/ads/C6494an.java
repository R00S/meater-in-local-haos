package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.an */
/* loaded from: classes2.dex */
final class C6494an implements zzban<zzbnf> {

    /* renamed from: a */
    private final /* synthetic */ zzboc f18173a;

    /* renamed from: b */
    private final /* synthetic */ zzcpt f18174b;

    C6494an(zzcpt zzcptVar, zzboc zzbocVar) {
        this.f18174b = zzcptVar;
        this.f18173a = zzbocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        synchronized (this.f18174b) {
            zzcpt.m18916i7(this.f18174b, null);
            this.f18173a.mo15070c().onAdFailedToLoad(zzcgm.m18773b(th));
            this.f18174b.f24893l.m18324i0(60);
            zzcya.m19066a(th, "BannerAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(zzbnf zzbnfVar) {
        zzbnf zzbnfVar2 = zzbnfVar;
        synchronized (this.f18174b) {
            zzcpt.m18916i7(this.f18174b, null);
            if (this.f18174b.f24896o != null) {
                this.f18174b.f24896o.mo18226a();
            }
            this.f18174b.f24896o = zzbnfVar2;
            this.f18174b.f24889h.removeAllViews();
            this.f18174b.f24889h.addView(zzbnfVar2.mo16098i());
            zzbnfVar2.mo16095c();
            this.f18174b.f24893l.m18324i0(zzbnfVar2.mo16100k());
        }
    }
}
