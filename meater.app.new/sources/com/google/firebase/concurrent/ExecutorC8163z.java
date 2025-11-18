package com.google.firebase.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: SequentialExecutor.java */
/* renamed from: com.google.firebase.concurrent.z */
/* loaded from: classes2.dex */
final class ExecutorC8163z implements Executor {

    /* renamed from: f */
    private static final Logger f30816f = Logger.getLogger(ExecutorC8163z.class.getName());

    /* renamed from: g */
    private final Executor f30817g;

    /* renamed from: h */
    private final Deque<Runnable> f30818h = new ArrayDeque();

    /* renamed from: i */
    private c f30819i = c.IDLE;

    /* renamed from: j */
    private long f30820j = 0;

    /* renamed from: k */
    private final b f30821k = new b(this, null);

    /* compiled from: SequentialExecutor.java */
    /* renamed from: com.google.firebase.concurrent.z$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Runnable f30822f;

        a(Runnable runnable) {
            this.f30822f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30822f.run();
        }

        public String toString() {
            return this.f30822f.toString();
        }
    }

    /* compiled from: SequentialExecutor.java */
    /* renamed from: com.google.firebase.concurrent.z$b */
    private final class b implements Runnable {

        /* renamed from: f */
        Runnable f30824f;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        
            r8.f30824f.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        
            com.google.firebase.concurrent.ExecutorC8163z.f30816f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f30824f, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        
            r8.f30824f = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m25132a() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
            L2:
                com.google.firebase.concurrent.z r2 = com.google.firebase.concurrent.ExecutorC8163z.this     // Catch: java.lang.Throwable -> L82
                java.util.Deque r2 = com.google.firebase.concurrent.ExecutorC8163z.m25127a(r2)     // Catch: java.lang.Throwable -> L82
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L82
                if (r0 != 0) goto L2b
                com.google.firebase.concurrent.z r0 = com.google.firebase.concurrent.ExecutorC8163z.this     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.z$c r0 = com.google.firebase.concurrent.ExecutorC8163z.m25128b(r0)     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.z$c r3 = com.google.firebase.concurrent.ExecutorC8163z.c.RUNNING     // Catch: java.lang.Throwable -> L7f
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                com.google.firebase.concurrent.z r0 = com.google.firebase.concurrent.ExecutorC8163z.this     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.ExecutorC8163z.m25130d(r0)     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.z r0 = com.google.firebase.concurrent.ExecutorC8163z.this     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.ExecutorC8163z.m25129c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                r0 = 1
            L2b:
                com.google.firebase.concurrent.z r3 = com.google.firebase.concurrent.ExecutorC8163z.this     // Catch: java.lang.Throwable -> L7f
                java.util.Deque r3 = com.google.firebase.concurrent.ExecutorC8163z.m25127a(r3)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7f
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7f
                r8.f30824f = r3     // Catch: java.lang.Throwable -> L7f
                if (r3 != 0) goto L4d
                com.google.firebase.concurrent.z r0 = com.google.firebase.concurrent.ExecutorC8163z.this     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.z$c r3 = com.google.firebase.concurrent.ExecutorC8163z.c.IDLE     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.ExecutorC8163z.m25129c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L82
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f30824f     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r8.f30824f = r2     // Catch: java.lang.Throwable -> L82
                goto L2
            L5c:
                r0 = move-exception
                goto L7c
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.ExecutorC8163z.m25131e()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f30824f     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L7c:
                r8.f30824f = r2     // Catch: java.lang.Throwable -> L82
                throw r0     // Catch: java.lang.Throwable -> L82
            L7f:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                throw r0     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                goto L8e
            L8d:
                throw r0
            L8e:
                goto L8d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.ExecutorC8163z.b.m25132a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m25132a();
            } catch (Error e2) {
                synchronized (ExecutorC8163z.this.f30818h) {
                    ExecutorC8163z.this.f30819i = c.IDLE;
                    throw e2;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f30824f;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + ExecutorC8163z.this.f30819i + "}";
        }

        /* synthetic */ b(ExecutorC8163z executorC8163z, a aVar) {
            this();
        }
    }

    /* compiled from: SequentialExecutor.java */
    /* renamed from: com.google.firebase.concurrent.z$c */
    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    ExecutorC8163z(Executor executor) {
        this.f30817g = (Executor) Preconditions.m14372k(executor);
    }

    /* renamed from: d */
    static /* synthetic */ long m25130d(ExecutorC8163z executorC8163z) {
        long j2 = executorC8163z.f30820j;
        executorC8163z.f30820j = 1 + j2;
        return j2;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        Preconditions.m14372k(runnable);
        synchronized (this.f30818h) {
            c cVar2 = this.f30819i;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j2 = this.f30820j;
                a aVar = new a(runnable);
                this.f30818h.add(aVar);
                c cVar3 = c.QUEUING;
                this.f30819i = cVar3;
                try {
                    this.f30817g.execute(this.f30821k);
                    if (this.f30819i != cVar3) {
                        return;
                    }
                    synchronized (this.f30818h) {
                        if (this.f30820j == j2 && this.f30819i == cVar3) {
                            this.f30819i = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.f30818h) {
                        c cVar4 = this.f30819i;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f30818h.removeLastOccurrence(aVar)) {
                            z = false;
                        }
                        if (!(e2 instanceof RejectedExecutionException) || z) {
                            throw e2;
                        }
                    }
                    return;
                }
            }
            this.f30818h.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f30817g + "}";
    }
}
