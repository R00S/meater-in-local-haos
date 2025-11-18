package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzbez implements zzll {

    /* renamed from: a */
    private final zzrz f22942a;

    /* renamed from: b */
    private long f22943b;

    /* renamed from: c */
    private long f22944c;

    /* renamed from: d */
    private long f22945d;

    /* renamed from: e */
    private long f22946e;

    /* renamed from: f */
    private int f22947f;

    /* renamed from: g */
    private boolean f22948g;

    zzbez() {
        this(15000, 30000, 2500L, 5000L);
    }

    @VisibleForTesting
    /* renamed from: l */
    private final void m17567l(boolean z) {
        this.f22947f = 0;
        this.f22948g = false;
        if (z) {
            this.f22942a.m20460b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll
    /* renamed from: a */
    public final void mo17568a() {
        m17567l(false);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    /* renamed from: b */
    public final zzrt mo17569b() {
        return this.f22942a;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    /* renamed from: c */
    public final synchronized boolean mo17570c(long j2, boolean z) {
        long j3;
        j3 = z ? this.f22946e : this.f22945d;
        return j3 <= 0 || j2 >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    /* renamed from: d */
    public final synchronized boolean mo17571d(long j2) {
        boolean z;
        z = false;
        char c2 = j2 > this.f22944c ? (char) 0 : j2 < this.f22943b ? (char) 2 : (char) 1;
        boolean z2 = this.f22942a.m20462d() >= this.f22947f;
        if (c2 == 2 || (c2 == 1 && this.f22948g && !z2)) {
            z = true;
        }
        this.f22948g = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    /* renamed from: e */
    public final void mo17572e() {
        m17567l(true);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    /* renamed from: f */
    public final void mo17573f() {
        m17567l(true);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    /* renamed from: g */
    public final void mo17574g(zzlo[] zzloVarArr, zzrb zzrbVar, zzro zzroVar) {
        this.f22947f = 0;
        for (int i2 = 0; i2 < zzloVarArr.length; i2++) {
            if (zzroVar.m20448a(i2) != null) {
                this.f22947f += zzsy.m20552p(zzloVarArr[i2].mo20164E());
            }
        }
        this.f22942a.m20461c(this.f22947f);
    }

    /* renamed from: h */
    public final synchronized void m17575h(int i2) {
        this.f22945d = i2 * 1000;
    }

    /* renamed from: i */
    public final synchronized void m17576i(int i2) {
        this.f22946e = i2 * 1000;
    }

    /* renamed from: j */
    public final synchronized void m17577j(int i2) {
        this.f22943b = i2 * 1000;
    }

    /* renamed from: k */
    public final synchronized void m17578k(int i2) {
        this.f22944c = i2 * 1000;
    }

    private zzbez(int i2, int i3, long j2, long j3) {
        this.f22942a = new zzrz(true, 65536);
        this.f22943b = 15000000L;
        this.f22944c = 30000000L;
        this.f22945d = 2500000L;
        this.f22946e = 5000000L;
    }
}
