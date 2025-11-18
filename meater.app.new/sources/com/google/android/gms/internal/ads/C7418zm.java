package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zm */
/* loaded from: classes2.dex */
final class C7418zm implements zzban<zzbpc> {

    /* renamed from: a */
    private final /* synthetic */ zzbxo f21468a;

    /* renamed from: b */
    private final /* synthetic */ zzcpp f21469b;

    C7418zm(zzcpp zzcppVar, zzbxo zzbxoVar) {
        this.f21469b = zzcppVar;
        this.f21468a = zzbxoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        this.f21468a.mo16093e().onAdFailedToLoad(zzcgm.m18773b(th));
        zzcya.m19066a(th, "AdLoaderShim.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(zzbpc zzbpcVar) {
        zzbpc zzbpcVar2 = zzbpcVar;
        synchronized (this.f21469b) {
            this.f21469b.f24885m = zzbpcVar2.m18227b();
            this.f21469b.f24886n = zzbpcVar2.m18229f();
            zzbpcVar2.mo16095c();
        }
    }
}
