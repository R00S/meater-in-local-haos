package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcqc implements zzbrl, zzbro, zzbsr {

    /* renamed from: f */
    private zzatb f24906f;

    /* renamed from: g */
    private zzasu f24907g;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0013 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbrl
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo17882a(com.google.android.gms.internal.ads.zzasr r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzatb r0 = r2.f24906f     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Lf
            r0.mo16935l1(r3)     // Catch: android.os.RemoteException -> L9 java.lang.Throwable -> L20
            goto Lf
        L9:
            r0 = move-exception
            java.lang.String r1 = "Remote Exception at onRewarded."
            com.google.android.gms.internal.ads.zzbad.m17348d(r1, r0)     // Catch: java.lang.Throwable -> L20
        Lf:
            com.google.android.gms.internal.ads.zzasu r0 = r2.f24907g     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1e
            r0.mo16928y3(r3, r4, r5)     // Catch: android.os.RemoteException -> L18 java.lang.Throwable -> L20
            monitor-exit(r2)
            return
        L18:
            r3 = move-exception
            java.lang.String r4 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.zzbad.m17350f(r4, r3)     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r2)
            return
        L20:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqc.mo17882a(com.google.android.gms.internal.ads.zzasr, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final synchronized void m18932b(zzasu zzasuVar) {
        this.f24907g = zzasuVar;
    }

    /* renamed from: c */
    public final synchronized void m18933c(zzatb zzatbVar) {
        this.f24906f = zzatbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdClosed() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoAdClosed();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdClosed.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final synchronized void onAdFailedToLoad(int i2) {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoAdFailedToLoad(i2);
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdFailedToLoad.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdLeftApplication() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoAdLeftApplication();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdLeftApplication.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final synchronized void onAdLoaded() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoAdLoaded();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdLoaded.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdOpened() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoAdOpened();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdOpened.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onRewardedVideoCompleted() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoCompleted();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onRewardedVideoStarted() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoStarted();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onRewardedVideoStarted.", e2);
            }
        }
    }
}
