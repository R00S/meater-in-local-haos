package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor.java */
/* renamed from: androidx.room.r */
/* loaded from: classes.dex */
class ExecutorC0659r implements Executor {

    /* renamed from: f */
    private final Executor f4356f;

    /* renamed from: g */
    private final ArrayDeque<Runnable> f4357g = new ArrayDeque<>();

    /* renamed from: h */
    private Runnable f4358h;

    /* compiled from: TransactionExecutor.java */
    /* renamed from: androidx.room.r$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Runnable f4359f;

        a(Runnable runnable) {
            this.f4359f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4359f.run();
            } finally {
                ExecutorC0659r.this.m4668a();
            }
        }
    }

    ExecutorC0659r(Executor executor) {
        this.f4356f = executor;
    }

    /* renamed from: a */
    synchronized void m4668a() {
        Runnable runnablePoll = this.f4357g.poll();
        this.f4358h = runnablePoll;
        if (runnablePoll != null) {
            this.f4356f.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f4357g.offer(new a(runnable));
        if (this.f4358h == null) {
            m4668a();
        }
    }
}
