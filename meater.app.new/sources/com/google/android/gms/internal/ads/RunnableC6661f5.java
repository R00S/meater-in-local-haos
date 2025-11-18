package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.f5 */
/* loaded from: classes2.dex */
final class RunnableC6661f5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Context f18862f;

    /* renamed from: g */
    private final /* synthetic */ zzaxi f18863g;

    RunnableC6661f5(zzaxi zzaxiVar, Context context) {
        this.f18863g = zzaxiVar;
        this.f18862f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f18863g.f22658e) {
            this.f18863g.f22659f = zzaxi.m17167w(this.f18862f);
            this.f18863g.f22658e.notifyAll();
        }
    }
}
