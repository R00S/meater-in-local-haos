package Q8;

import android.annotation.SuppressLint;
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
/* loaded from: classes2.dex */
public final class I {

    /* compiled from: ExecutorUtils.java */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14397a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f14398b;

        /* compiled from: ExecutorUtils.java */
        /* renamed from: Q8.I$a$a, reason: collision with other inner class name */
        class C0213a extends AbstractRunnableC1617e {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Runnable f14399B;

            C0213a(Runnable runnable) {
                this.f14399B = runnable;
            }

            @Override // Q8.AbstractRunnableC1617e
            public void a() {
                this.f14399B.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f14397a = str;
            this.f14398b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0213a(runnable));
            threadNewThread.setName(this.f14397a + this.f14398b.getAndIncrement());
            return threadNewThread;
        }
    }

    /* compiled from: ExecutorUtils.java */
    class b extends AbstractRunnableC1617e {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f14401B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ ExecutorService f14402C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f14403D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ TimeUnit f14404E;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f14401B = str;
            this.f14402C = executorService;
            this.f14403D = j10;
            this.f14404E = timeUnit;
        }

        @Override // Q8.AbstractRunnableC1617e
        public void a() {
            try {
                N8.g.f().b("Executing shutdown hook for " + this.f14401B);
                this.f14402C.shutdown();
                if (this.f14402C.awaitTermination(this.f14403D, this.f14404E)) {
                    return;
                }
                N8.g.f().b(this.f14401B + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f14402C.shutdownNow();
            } catch (InterruptedException unused) {
                N8.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f14401B));
                this.f14402C.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
