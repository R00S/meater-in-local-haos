package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.ads.ok */
/* loaded from: classes2.dex */
final class BinderC7009ok extends zzaok {

    /* renamed from: f */
    private zzcjy<zzaov, zzcla> f20197f;

    /* renamed from: g */
    private final /* synthetic */ zzckm f20198g;

    private BinderC7009ok(zzckm zzckmVar, zzcjy zzcjyVar) {
        this.f20198g = zzckmVar;
        this.f20197f = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoj
    /* renamed from: c1 */
    public final void mo15687c1(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f20198g.f24444c = (View) ObjectWrapper.m14709k0(iObjectWrapper);
        ((zzcla) this.f20197f.f24423c).onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaoj
    /* renamed from: p */
    public final void mo15688p(String str) throws RemoteException {
        ((zzcla) this.f20197f.f24423c).onAdFailedToLoad(0);
    }
}
