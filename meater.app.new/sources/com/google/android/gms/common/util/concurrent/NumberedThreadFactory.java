package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class NumberedThreadFactory implements ThreadFactory {

    /* renamed from: f */
    private final String f18006f;

    /* renamed from: g */
    private final AtomicInteger f18007g = new AtomicInteger();

    /* renamed from: h */
    private final ThreadFactory f18008h = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(String str) {
        Preconditions.m14373l(str, "Name must not be null");
        this.f18006f = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f18008h.newThread(new RunnableC6454a(runnable, 0));
        threadNewThread.setName(this.f18006f + "[" + this.f18007g.getAndIncrement() + "]");
        return threadNewThread;
    }
}
