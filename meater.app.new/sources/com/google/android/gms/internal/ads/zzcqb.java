package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcqb implements zzbro, zzbsr {

    /* renamed from: f */
    private zzaub f24905f;

    /* renamed from: a */
    public final synchronized void m18931a(zzaub zzaubVar) {
        this.f24905f = zzaubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final synchronized void onAdFailedToLoad(int i2) {
        zzaub zzaubVar = this.f24905f;
        if (zzaubVar != null) {
            try {
                zzaubVar.mo16950R4(i2);
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final synchronized void onAdLoaded() {
        zzaub zzaubVar = this.f24905f;
        if (zzaubVar != null) {
            try {
                zzaubVar.mo16951n1();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }
}
