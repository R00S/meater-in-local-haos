package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zztl {

    /* renamed from: a */
    private final u30 f27086a;

    /* renamed from: b */
    private final boolean f27087b;

    /* renamed from: c */
    private final long f27088c;

    /* renamed from: d */
    private final long f27089d;

    /* renamed from: e */
    private long f27090e;

    /* renamed from: f */
    private long f27091f;

    /* renamed from: g */
    private long f27092g;

    /* renamed from: h */
    private boolean f27093h;

    /* renamed from: i */
    private long f27094i;

    /* renamed from: j */
    private long f27095j;

    /* renamed from: k */
    private long f27096k;

    public zztl() {
        this(-1.0d);
    }

    /* renamed from: d */
    private final boolean m20576d(long j2, long j3) {
        return Math.abs((j3 - this.f27094i) - (j2 - this.f27095j)) > 20000000;
    }

    /* renamed from: a */
    public final void m20577a() {
        if (this.f27087b) {
            this.f27086a.m15920c();
        }
    }

    /* renamed from: b */
    public final void m20578b() {
        this.f27093h = false;
        if (this.f27087b) {
            this.f27086a.m15919b();
        }
    }

    /* renamed from: c */
    public final long m20579c(long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = 1000 * j2;
        if (this.f27093h) {
            if (j2 != this.f27090e) {
                this.f27096k++;
                this.f27091f = this.f27092g;
            }
            long j8 = this.f27096k;
            if (j8 >= 6) {
                j5 = this.f27091f + ((j7 - this.f27095j) / j8);
                if (m20576d(j5, j3)) {
                    this.f27093h = false;
                } else {
                    j4 = (this.f27094i + j5) - this.f27095j;
                }
            } else if (m20576d(j7, j3)) {
                this.f27093h = false;
            }
            j4 = j3;
            j5 = j7;
        } else {
            j4 = j3;
            j5 = j7;
        }
        if (!this.f27093h) {
            this.f27095j = j7;
            this.f27094i = j3;
            this.f27096k = 0L;
            this.f27093h = true;
        }
        this.f27090e = j2;
        this.f27092g = j5;
        u30 u30Var = this.f27086a;
        if (u30Var == null || u30Var.f20609g == 0) {
            return j4;
        }
        long j9 = this.f27086a.f20609g;
        long j10 = this.f27088c;
        long j11 = j9 + (((j4 - j9) / j10) * j10);
        if (j4 <= j11) {
            j6 = j11 - j10;
        } else {
            j11 = j10 + j11;
            j6 = j11;
        }
        if (j11 - j4 >= j4 - j6) {
            j11 = j6;
        }
        return j11 - this.f27089d;
    }

    public zztl(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay() != null ? r3.getDefaultDisplay().getRefreshRate() : -1.0d);
    }

    private zztl(double d2) {
        boolean z = d2 != -1.0d;
        this.f27087b = z;
        if (z) {
            this.f27086a = u30.m15918a();
            long j2 = (long) (1.0E9d / d2);
            this.f27088c = j2;
            this.f27089d = (j2 * 80) / 100;
            return;
        }
        this.f27086a = null;
        this.f27088c = -1L;
        this.f27089d = -1L;
    }
}
