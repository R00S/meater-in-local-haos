package com.google.firebase.crashlytics.internal.p183n;

import android.annotation.SuppressLint;
import com.google.firebase.crashlytics.internal.C8179h;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils.java */
/* renamed from: com.google.firebase.crashlytics.h.n.g0 */
/* loaded from: classes2.dex */
public final class C8205g0 {

    /* compiled from: ExecutorUtils.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.g0$a */
    class a implements ThreadFactory {

        /* renamed from: f */
        final /* synthetic */ String f30907f;

        /* renamed from: g */
        final /* synthetic */ AtomicLong f30908g;

        /* compiled from: ExecutorUtils.java */
        /* renamed from: com.google.firebase.crashlytics.h.n.g0$a$a, reason: collision with other inner class name */
        class C11496a extends AbstractRunnableC8220o {

            /* renamed from: f */
            final /* synthetic */ Runnable f30909f;

            C11496a(Runnable runnable) {
                this.f30909f = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.p183n.AbstractRunnableC8220o
            /* renamed from: a */
            public void mo25249a() {
                this.f30909f.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f30907f = str;
            this.f30908g = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C11496a(runnable));
            threadNewThread.setName(this.f30907f + this.f30908g.getAndIncrement());
            return threadNewThread;
        }
    }

    /* compiled from: ExecutorUtils.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.g0$b */
    class b extends AbstractRunnableC8220o {

        /* renamed from: f */
        final /* synthetic */ String f30911f;

        /* renamed from: g */
        final /* synthetic */ ExecutorService f30912g;

        /* renamed from: h */
        final /* synthetic */ long f30913h;

        /* renamed from: i */
        final /* synthetic */ TimeUnit f30914i;

        b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
            this.f30911f = str;
            this.f30912g = executorService;
            this.f30913h = j2;
            this.f30914i = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.p183n.AbstractRunnableC8220o
        /* renamed from: a */
        public void mo25249a() {
            try {
                C8179h.m25176f().m25177b("Executing shutdown hook for " + this.f30911f);
                this.f30912g.shutdown();
                if (this.f30912g.awaitTermination(this.f30913h, this.f30914i)) {
                    return;
                }
                C8179h.m25176f().m25177b(this.f30911f + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f30912g.shutdownNow();
            } catch (InterruptedException unused) {
                C8179h.m25176f().m25177b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f30911f));
                this.f30912g.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    private static void m25244a(String str, ExecutorService executorService) {
        m25245b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: b */
    private static void m25245b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j2, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m25246c(String str) {
        ExecutorService executorServiceM25248e = m25248e(m25247d(str), new ThreadPoolExecutor.DiscardPolicy());
        m25244a(str, executorServiceM25248e);
        return executorServiceM25248e;
    }

    /* renamed from: d */
    public static ThreadFactory m25247d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: e */
    private static ExecutorService m25248e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
