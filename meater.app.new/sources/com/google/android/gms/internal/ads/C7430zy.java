package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.zy */
/* loaded from: classes2.dex */
final class C7430zy {

    /* renamed from: a */
    private boolean f21481a;

    /* renamed from: b */
    private long f21482b;

    /* renamed from: c */
    private long f21483c;

    C7430zy() {
    }

    /* renamed from: d */
    private static long m16166d(long j2) {
        return (SystemClock.elapsedRealtime() * 1000) - j2;
    }

    /* renamed from: a */
    public final void m16167a() {
        if (this.f21481a) {
            return;
        }
        this.f21481a = true;
        this.f21483c = m16166d(this.f21482b);
    }

    /* renamed from: b */
    public final void m16168b() {
        if (this.f21481a) {
            this.f21482b = m16166d(this.f21483c);
            this.f21481a = false;
        }
    }

    /* renamed from: c */
    public final void m16169c(long j2) {
        this.f21482b = j2;
        this.f21483c = m16166d(j2);
    }

    /* renamed from: e */
    public final long m16170e() {
        return this.f21481a ? m16166d(this.f21483c) : this.f21482b;
    }
}
