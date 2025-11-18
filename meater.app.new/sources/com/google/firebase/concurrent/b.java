package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CustomThreadFactory.java */
/* loaded from: classes2.dex */
class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f38103e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f38104a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f38105b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38106c;

    /* renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f38107d;

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f38105b = str;
        this.f38106c = i10;
        this.f38107d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f38106c);
        StrictMode.ThreadPolicy threadPolicy = this.f38107d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f38103e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                this.f38101B.b(runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f38105b, Long.valueOf(this.f38104a.getAndIncrement())));
        return threadNewThread;
    }
}
