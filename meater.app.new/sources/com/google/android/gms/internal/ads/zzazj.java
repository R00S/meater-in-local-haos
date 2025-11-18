package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

@zzard
/* loaded from: classes2.dex */
public final class zzazj {

    /* renamed from: a */
    private long f22714a;

    /* renamed from: b */
    private long f22715b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f22716c = new Object();

    public zzazj(long j2) {
        this.f22714a = j2;
    }

    /* renamed from: a */
    public final boolean m17278a() {
        synchronized (this.f22716c) {
            long jMo14609b = zzk.zzln().mo14609b();
            if (this.f22715b + this.f22714a > jMo14609b) {
                return false;
            }
            this.f22715b = jMo14609b;
            return true;
        }
    }

    /* renamed from: b */
    public final void m17279b(long j2) {
        synchronized (this.f22716c) {
            this.f22714a = j2;
        }
    }
}
