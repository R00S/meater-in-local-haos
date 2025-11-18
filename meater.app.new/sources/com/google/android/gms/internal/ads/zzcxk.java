package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzcxk {

    /* renamed from: a */
    private final Clock f25224a;

    /* renamed from: b */
    private final Object f25225b = new Object();

    /* renamed from: c */
    private volatile int f25226c = C7310wp.f20863a;

    /* renamed from: d */
    private volatile long f25227d = 0;

    public zzcxk(Clock clock) {
        this.f25224a = clock;
    }

    /* renamed from: a */
    private final void m19016a() {
        long jMo14608a = this.f25224a.mo14608a();
        synchronized (this.f25225b) {
            if (this.f25226c == C7310wp.f20865c) {
                if (this.f25227d + ((Long) zzyt.m20848e().m16421c(zzacu.f21663L4)).longValue() <= jMo14608a) {
                    this.f25226c = C7310wp.f20863a;
                }
            }
        }
    }

    /* renamed from: e */
    private final void m19017e(int i2, int i3) {
        m19016a();
        long jMo14608a = this.f25224a.mo14608a();
        synchronized (this.f25225b) {
            if (this.f25226c != i2) {
                return;
            }
            this.f25226c = i3;
            if (this.f25226c == C7310wp.f20865c) {
                this.f25227d = jMo14608a;
            }
        }
    }

    /* renamed from: b */
    public final boolean m19018b() {
        boolean z;
        synchronized (this.f25225b) {
            m19016a();
            z = this.f25226c == C7310wp.f20864b;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean m19019c() {
        boolean z;
        synchronized (this.f25225b) {
            m19016a();
            z = this.f25226c == C7310wp.f20865c;
        }
        return z;
    }

    /* renamed from: d */
    public final void m19020d(boolean z) {
        if (z) {
            m19017e(C7310wp.f20863a, C7310wp.f20864b);
        } else {
            m19017e(C7310wp.f20864b, C7310wp.f20863a);
        }
    }

    /* renamed from: f */
    public final void m19021f() {
        m19017e(C7310wp.f20864b, C7310wp.f20865c);
    }
}
