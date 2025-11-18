package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcqa implements zzbrl, zzbrs {

    /* renamed from: f */
    private zzatw f24903f;

    /* renamed from: g */
    private zzaue f24904g;

    @Override // com.google.android.gms.internal.ads.zzbrs
    /* renamed from: R */
    public final synchronized void mo18300R(int i2) {
        zzatw zzatwVar = this.f24903f;
        if (zzatwVar != null) {
            try {
                zzatwVar.mo16947p6(i2);
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbrl
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo17882a(com.google.android.gms.internal.ads.zzasr r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzatw r0 = r4.f24903f     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.ads.zzaup r1 = new com.google.android.gms.internal.ads.zzaup     // Catch: android.os.RemoteException -> L16 java.lang.Throwable -> L3a
            java.lang.String r2 = r5.getType()     // Catch: android.os.RemoteException -> L16 java.lang.Throwable -> L3a
            int r3 = r5.getAmount()     // Catch: android.os.RemoteException -> L16 java.lang.Throwable -> L3a
            r1.<init>(r2, r3)     // Catch: android.os.RemoteException -> L16 java.lang.Throwable -> L3a
            r0.mo16948v0(r1)     // Catch: android.os.RemoteException -> L16 java.lang.Throwable -> L3a
            goto L1c
        L16:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.zzbad.m17350f(r1, r0)     // Catch: java.lang.Throwable -> L3a
        L1c:
            com.google.android.gms.internal.ads.zzaue r0 = r4.f24904g     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzaup r1 = new com.google.android.gms.internal.ads.zzaup     // Catch: android.os.RemoteException -> L32 java.lang.Throwable -> L3a
            java.lang.String r2 = r5.getType()     // Catch: android.os.RemoteException -> L32 java.lang.Throwable -> L3a
            int r5 = r5.getAmount()     // Catch: android.os.RemoteException -> L32 java.lang.Throwable -> L3a
            r1.<init>(r2, r5)     // Catch: android.os.RemoteException -> L32 java.lang.Throwable -> L3a
            r0.mo16952X2(r1, r6, r7)     // Catch: android.os.RemoteException -> L32 java.lang.Throwable -> L3a
            monitor-exit(r4)
            return
        L32:
            r5 = move-exception
            java.lang.String r6 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.zzbad.m17350f(r6, r5)     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r4)
            return
        L3a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqa.mo17882a(com.google.android.gms.internal.ads.zzasr, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final synchronized void m18929b(zzatw zzatwVar) {
        this.f24903f = zzatwVar;
    }

    /* renamed from: c */
    public final synchronized void m18930c(zzaue zzaueVar) {
        this.f24904g = zzaueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdClosed() {
        zzatw zzatwVar = this.f24903f;
        if (zzatwVar != null) {
            try {
                zzatwVar.mo16946o1();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdOpened() {
        zzatw zzatwVar = this.f24903f;
        if (zzatwVar != null) {
            try {
                zzatwVar.mo16945S1();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onRewardedVideoStarted() {
    }
}
