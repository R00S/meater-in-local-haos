package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.util.concurrent.a */
/* loaded from: classes2.dex */
final class RunnableC6454a implements Runnable {

    /* renamed from: f */
    private final Runnable f18009f;

    public RunnableC6454a(Runnable runnable, int i2) {
        this.f18009f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.f18009f.run();
    }
}
