package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.g */
/* loaded from: classes2.dex */
final class RunnableC6692g implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzabp f18921f;

    RunnableC6692g(zzabp zzabpVar) {
        this.f18921f = zzabpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18921f.f21568f != null) {
            try {
                this.f18921f.f21568f.onAdFailedToLoad(1);
            } catch (RemoteException e2) {
                zzbad.m17348d("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
