package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.bq */
/* loaded from: classes2.dex */
final class ThreadFactoryC6534bq implements ThreadFactory {

    /* renamed from: f */
    private final AtomicInteger f18352f = new AtomicInteger(1);

    ThreadFactoryC6534bq() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f18352f.getAndIncrement();
        StringBuilder sb = new StringBuilder(25);
        sb.append("AdWorker(NG) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
