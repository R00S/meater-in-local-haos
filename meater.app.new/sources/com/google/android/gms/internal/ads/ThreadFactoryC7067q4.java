package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.q4 */
/* loaded from: classes2.dex */
final class ThreadFactoryC7067q4 implements ThreadFactory {

    /* renamed from: f */
    private final AtomicInteger f20372f = new AtomicInteger(1);

    ThreadFactoryC7067q4(zzavg zzavgVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f20372f.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
