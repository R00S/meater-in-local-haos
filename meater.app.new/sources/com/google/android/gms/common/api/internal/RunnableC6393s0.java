package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
/* loaded from: classes2.dex */
final class RunnableC6393s0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C6391r0 f17458f;

    RunnableC6393s0(C6391r0 c6391r0) {
        this.f17458f = c6391r0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17458f.f17455r.lock();
        try {
            this.f17458f.m14092y();
        } finally {
            this.f17458f.f17455r.unlock();
        }
    }
}
