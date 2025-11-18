package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzbcy {

    /* renamed from: b */
    private long f22810b;

    /* renamed from: a */
    private final long f22809a = TimeUnit.MILLISECONDS.toNanos(((Long) zzyt.m20848e().m16421c(zzacu.f21658L)).longValue());

    /* renamed from: c */
    private boolean f22811c = true;

    zzbcy() {
    }

    /* renamed from: a */
    public final void m17464a(SurfaceTexture surfaceTexture, zzbcn zzbcnVar) {
        if (zzbcnVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.f22811c || Math.abs(timestamp - this.f22810b) >= this.f22809a) {
            this.f22811c = false;
            this.f22810b = timestamp;
            zzaxi.f22654a.post(new RunnableC6516b8(this, zzbcnVar));
        }
    }

    /* renamed from: b */
    public final void m17465b() {
        this.f22811c = true;
    }
}
