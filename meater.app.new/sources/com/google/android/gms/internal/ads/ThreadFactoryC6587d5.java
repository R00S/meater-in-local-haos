package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.d5 */
/* loaded from: classes2.dex */
final class ThreadFactoryC6587d5 implements ThreadFactory {

    /* renamed from: f */
    private final AtomicInteger f18489f = new AtomicInteger(1);

    /* renamed from: g */
    private final /* synthetic */ String f18490g;

    ThreadFactoryC6587d5(String str) {
        this.f18490g = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f18490g;
        int andIncrement = this.f18489f.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
