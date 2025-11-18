package io.rakam.api;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: WorkerThread.java */
/* renamed from: io.rakam.api.k */
/* loaded from: classes2.dex */
public class HandlerThreadC9235k extends HandlerThread {

    /* renamed from: f */
    private Handler f35728f;

    public HandlerThreadC9235k(String str) {
        super(str);
    }

    /* renamed from: c */
    private synchronized void m29991c() {
        if (this.f35728f == null) {
            this.f35728f = new Handler(getLooper());
        }
    }

    /* renamed from: a */
    void m29992a(Runnable runnable) {
        m29991c();
        this.f35728f.post(runnable);
    }

    /* renamed from: b */
    void m29993b(Runnable runnable, long j2) {
        m29991c();
        this.f35728f.postDelayed(runnable, j2);
    }
}
