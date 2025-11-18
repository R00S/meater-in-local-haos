package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ml */
/* loaded from: classes2.dex */
final class BinderC6936ml extends zzaoq {

    /* renamed from: f */
    private zzcjy<zzaov, zzcla> f19929f;

    /* renamed from: g */
    private final /* synthetic */ zzcmg f19930g;

    private BinderC6936ml(zzcmg zzcmgVar, zzcjy zzcjyVar) {
        this.f19930g = zzcmgVar;
        this.f19929f = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    /* renamed from: E4 */
    public final void mo15555E4(zzang zzangVar) throws RemoteException {
        this.f19930g.f24703c = zzangVar;
        ((zzcla) this.f19929f.f24423c).onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    /* renamed from: p */
    public final void mo15556p(String str) throws RemoteException {
        ((zzcla) this.f19929f.f24423c).onAdFailedToLoad(0);
    }
}
