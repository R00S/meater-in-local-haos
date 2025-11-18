package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.el */
/* loaded from: classes2.dex */
final class BinderC6640el extends zzaon {

    /* renamed from: f */
    private zzcjy<zzaov, zzcla> f18822f;

    private BinderC6640el(zzclq zzclqVar, zzcjy zzcjyVar) {
        this.f18822f = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    /* renamed from: K0 */
    public final void mo15110K0() throws RemoteException {
        ((zzcla) this.f18822f.f24423c).onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    /* renamed from: p */
    public final void mo15111p(String str) throws RemoteException {
        ((zzcla) this.f18822f.f24423c).onAdFailedToLoad(0);
    }
}
