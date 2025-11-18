package p241e.p254e.p256b.p257a.p258i;

import java.util.concurrent.Executor;
import p241e.p254e.p256b.p257a.p258i.p268z.C8891a;

/* compiled from: SafeLoggingExecutor.java */
/* renamed from: e.e.b.a.i.o */
/* loaded from: classes2.dex */
class ExecutorC8872o implements Executor {

    /* renamed from: f */
    private final Executor f33607f;

    /* compiled from: SafeLoggingExecutor.java */
    /* renamed from: e.e.b.a.i.o$a */
    static class a implements Runnable {

        /* renamed from: f */
        private final Runnable f33608f;

        a(Runnable runnable) {
            this.f33608f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f33608f.run();
            } catch (Exception e2) {
                C8891a.m28232d("Executor", "Background execution failure.", e2);
            }
        }
    }

    ExecutorC8872o(Executor executor) {
        this.f33607f = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f33607f.execute(new a(runnable));
    }
}
