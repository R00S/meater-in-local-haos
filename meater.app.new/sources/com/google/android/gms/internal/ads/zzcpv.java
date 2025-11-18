package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcpv implements zzxr {

    /* renamed from: f */
    private zzyw f24898f;

    /* renamed from: a */
    public final synchronized void m18922a(zzyw zzywVar) {
        this.f24898f = zzywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final synchronized void onAdClicked() {
        zzyw zzywVar = this.f24898f;
        if (zzywVar != null) {
            try {
                zzywVar.onAdClicked();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdClicked.", e2);
            }
        }
    }
}
