package io.sentry;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryExecutorService.java */
@ApiStatus.Internal
/* renamed from: io.sentry.n4 */
/* loaded from: classes2.dex */
public final class C9520n4 implements InterfaceC9366b2 {

    /* renamed from: a */
    private final ScheduledExecutorService f36518a;

    /* compiled from: SentryExecutorService.java */
    /* renamed from: io.sentry.n4$b */
    private static final class b implements ThreadFactory {

        /* renamed from: f */
        private int f36519f;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryExecutorServiceThreadFactory-");
            int i2 = this.f36519f;
            this.f36519f = i2 + 1;
            sb.append(i2);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    C9520n4(ScheduledExecutorService scheduledExecutorService) {
        this.f36518a = scheduledExecutorService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[Catch: all -> 0x002e, DONT_GENERATE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:7:0x0010, B:9:0x001a, B:11:0x0020, B:12:0x002c), top: B:19:0x0003, inners: #0 }] */
    @Override // io.sentry.InterfaceC9366b2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo30029a(long r4) {
        /*
            r3 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r3.f36518a
            monitor-enter(r0)
            java.util.concurrent.ScheduledExecutorService r1 = r3.f36518a     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.isShutdown()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L2c
            java.util.concurrent.ScheduledExecutorService r1 = r3.f36518a     // Catch: java.lang.Throwable -> L2e
            r1.shutdown()     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ScheduledExecutorService r1 = r3.f36518a     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> L2e
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> L2e
            boolean r4 = r1.awaitTermination(r4, r2)     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> L2e
            if (r4 != 0) goto L2c
            java.util.concurrent.ScheduledExecutorService r4 = r3.f36518a     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> L2e
            r4.shutdownNow()     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> L2e
            goto L2c
        L20:
            java.util.concurrent.ScheduledExecutorService r4 = r3.f36518a     // Catch: java.lang.Throwable -> L2e
            r4.shutdownNow()     // Catch: java.lang.Throwable -> L2e
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2e
            r4.interrupt()     // Catch: java.lang.Throwable -> L2e
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C9520n4.mo30029a(long):void");
    }

    @Override // io.sentry.InterfaceC9366b2
    /* renamed from: b */
    public Future<?> mo30030b(Runnable runnable, long j2) {
        return this.f36518a.schedule(runnable, j2, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.InterfaceC9366b2
    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.f36518a) {
            zIsShutdown = this.f36518a.isShutdown();
        }
        return zIsShutdown;
    }

    @Override // io.sentry.InterfaceC9366b2
    public Future<?> submit(Runnable runnable) {
        return this.f36518a.submit(runnable);
    }

    public C9520n4() {
        this(Executors.newSingleThreadScheduledExecutor(new b()));
    }
}
