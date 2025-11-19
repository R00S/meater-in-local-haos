package M6;

import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes2.dex */
class n implements Executor {

    /* renamed from: B, reason: collision with root package name */
    private final Executor f12102B;

    /* compiled from: SafeLoggingExecutor.java */
    static class a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final Runnable f12103B;

        a(Runnable runnable) {
            this.f12103B = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12103B.run();
            } catch (Exception e10) {
                Q6.a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    n(Executor executor) {
        this.f12102B = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f12102B.execute(new a(runnable));
    }
}
