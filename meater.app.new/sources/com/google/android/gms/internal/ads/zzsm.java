package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzsm {

    /* renamed from: a */
    private boolean f26992a;

    /* renamed from: a */
    public final synchronized void m20488a() throws InterruptedException {
        while (!this.f26992a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized boolean m20489b() {
        if (this.f26992a) {
            return false;
        }
        this.f26992a = true;
        notifyAll();
        return true;
    }

    /* renamed from: c */
    public final synchronized boolean m20490c() {
        boolean z;
        z = this.f26992a;
        this.f26992a = false;
        return z;
    }
}
