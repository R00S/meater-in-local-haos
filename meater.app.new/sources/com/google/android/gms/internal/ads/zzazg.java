package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

@zzard
/* loaded from: classes2.dex */
public final class zzazg {

    /* renamed from: a */
    private HandlerThread f22706a = null;

    /* renamed from: b */
    private Handler f22707b = null;

    /* renamed from: c */
    private int f22708c = 0;

    /* renamed from: d */
    private final Object f22709d = new Object();

    /* renamed from: a */
    public final Handler m17275a() {
        return this.f22707b;
    }

    /* renamed from: b */
    public final Looper m17276b() {
        Looper looper;
        synchronized (this.f22709d) {
            if (this.f22708c != 0) {
                Preconditions.m14373l(this.f22706a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f22706a == null) {
                zzawz.m17082m("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f22706a = handlerThread;
                handlerThread.start();
                this.f22707b = new zzdbh(this.f22706a.getLooper());
                zzawz.m17082m("Looper thread started.");
            } else {
                zzawz.m17082m("Resuming the looper thread");
                this.f22709d.notifyAll();
            }
            this.f22708c++;
            looper = this.f22706a.getLooper();
        }
        return looper;
    }
}
