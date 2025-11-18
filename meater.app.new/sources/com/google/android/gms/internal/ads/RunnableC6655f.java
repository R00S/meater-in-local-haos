package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.f */
/* loaded from: classes2.dex */
final class RunnableC6655f implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ BinderC6618e f18844f;

    RunnableC6655f(BinderC6618e binderC6618e) {
        this.f18844f = binderC6618e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18844f.f18709f.f21567f != null) {
            try {
                this.f18844f.f18709f.f21567f.onAdFailedToLoad(1);
            } catch (RemoteException e2) {
                zzbad.m17348d("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
