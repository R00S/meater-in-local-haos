package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class zzsw implements zzso {

    /* renamed from: a */
    private boolean f27020a;

    /* renamed from: b */
    private long f27021b;

    /* renamed from: c */
    private long f27022c;

    /* renamed from: d */
    private zzln f27023d = zzln.f26490a;

    /* renamed from: a */
    public final void m20531a() {
        if (this.f27020a) {
            return;
        }
        this.f27022c = SystemClock.elapsedRealtime();
        this.f27020a = true;
    }

    /* renamed from: b */
    public final void m20532b() {
        if (this.f27020a) {
            m20534g(mo20281d());
            this.f27020a = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    /* renamed from: c */
    public final zzln mo20280c(zzln zzlnVar) {
        if (this.f27020a) {
            m20534g(mo20281d());
        }
        this.f27023d = zzlnVar;
        return zzlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    /* renamed from: d */
    public final long mo20281d() {
        long j2 = this.f27021b;
        if (!this.f27020a) {
            return j2;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f27022c;
        zzln zzlnVar = this.f27023d;
        return j2 + (zzlnVar.f26491b == 1.0f ? zzkt.m20190b(jElapsedRealtime) : zzlnVar.m20211a(jElapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.zzso
    /* renamed from: e */
    public final zzln mo20282e() {
        return this.f27023d;
    }

    /* renamed from: f */
    public final void m20533f(zzso zzsoVar) {
        m20534g(zzsoVar.mo20281d());
        this.f27023d = zzsoVar.mo20282e();
    }

    /* renamed from: g */
    public final void m20534g(long j2) {
        this.f27021b = j2;
        if (this.f27020a) {
            this.f27022c = SystemClock.elapsedRealtime();
        }
    }
}
