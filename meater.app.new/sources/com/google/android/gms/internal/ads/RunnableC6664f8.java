package com.google.android.gms.internal.ads;

import android.os.Handler;

@zzard
/* renamed from: com.google.android.gms.internal.ads.f8 */
/* loaded from: classes2.dex */
final class RunnableC6664f8 implements Runnable {

    /* renamed from: f */
    private zzbcq f18868f;

    /* renamed from: g */
    private boolean f18869g = false;

    RunnableC6664f8(zzbcq zzbcqVar) {
        this.f18868f = zzbcqVar;
    }

    /* renamed from: c */
    private final void m15138c() {
        Handler handler = zzaxi.f22654a;
        handler.removeCallbacks(this);
        handler.postDelayed(this, 250L);
    }

    /* renamed from: a */
    public final void m15139a() {
        this.f18869g = true;
        this.f18868f.m17446G();
    }

    /* renamed from: b */
    public final void m15140b() {
        this.f18869g = false;
        m15138c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18869g) {
            return;
        }
        this.f18868f.m17446G();
        m15138c();
    }
}
