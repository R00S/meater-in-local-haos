package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcpw implements zzbrl, zzbro, zzbrw, zzbsr, zzxr {

    /* renamed from: f */
    private zzyz f24899f;

    @Override // com.google.android.gms.internal.ads.zzbrl
    /* renamed from: a */
    public final void mo17882a(zzasr zzasrVar, String str, String str2) {
    }

    /* renamed from: b */
    public final synchronized zzyz m18923b() {
        return this.f24899f;
    }

    /* renamed from: c */
    public final synchronized void m18924c(zzyz zzyzVar) {
        this.f24899f = zzyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final synchronized void onAdClicked() {
        zzyz zzyzVar = this.f24899f;
        if (zzyzVar != null) {
            try {
                zzyzVar.onAdClicked();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdClicked.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdClosed() {
        zzyz zzyzVar = this.f24899f;
        if (zzyzVar != null) {
            try {
                zzyzVar.onAdClosed();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdClosed.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final synchronized void onAdFailedToLoad(int i2) {
        zzyz zzyzVar = this.f24899f;
        if (zzyzVar != null) {
            try {
                zzyzVar.onAdFailedToLoad(i2);
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdFailedToLoad.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final synchronized void onAdImpression() {
        zzyz zzyzVar = this.f24899f;
        if (zzyzVar != null) {
            try {
                zzyzVar.onAdImpression();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdImpression.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdLeftApplication() {
        zzyz zzyzVar = this.f24899f;
        if (zzyzVar != null) {
            try {
                zzyzVar.onAdLeftApplication();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdLeftApplication.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final synchronized void onAdLoaded() {
        zzyz zzyzVar = this.f24899f;
        if (zzyzVar != null) {
            try {
                zzyzVar.onAdLoaded();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdLoaded.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdOpened() {
        zzyz zzyzVar = this.f24899f;
        if (zzyzVar != null) {
            try {
                zzyzVar.onAdOpened();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdOpened.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoStarted() {
    }
}
