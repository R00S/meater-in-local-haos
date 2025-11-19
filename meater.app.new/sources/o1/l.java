package o1;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r1.InterfaceC4334a;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
class l {

    /* compiled from: RequestExecutor.java */
    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f46306a;

        /* renamed from: b, reason: collision with root package name */
        private int f46307b;

        /* compiled from: RequestExecutor.java */
        /* renamed from: o1.l$a$a, reason: collision with other inner class name */
        private static class C0634a extends Thread {

            /* renamed from: B, reason: collision with root package name */
            private final int f46308B;

            C0634a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f46308B = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f46308B);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f46306a = str;
            this.f46307b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0634a(runnable, this.f46306a, this.f46307b);
        }
    }

    /* compiled from: RequestExecutor.java */
    private static class b implements Executor {

        /* renamed from: B, reason: collision with root package name */
        private final Handler f46309B;

        b(Handler handler) {
            this.f46309B = (Handler) r1.i.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f46309B.post((Runnable) r1.i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f46309B + " is shutting down");
        }
    }

    /* compiled from: RequestExecutor.java */
    private static class c<T> implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private Callable<T> f46310B;

        /* renamed from: C, reason: collision with root package name */
        private InterfaceC4334a<T> f46311C;

        /* renamed from: D, reason: collision with root package name */
        private Handler f46312D;

        /* compiled from: RequestExecutor.java */
        class a implements Runnable {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC4334a f46313B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ Object f46314C;

            a(InterfaceC4334a interfaceC4334a, Object obj) {
                this.f46313B = interfaceC4334a;
                this.f46314C = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f46313B.accept(this.f46314C);
            }
        }

        c(Handler handler, Callable<T> callable, InterfaceC4334a<T> interfaceC4334a) {
            this.f46310B = callable;
            this.f46311C = interfaceC4334a;
            this.f46312D = handler;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            T tCall;
            try {
                tCall = this.f46310B.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f46312D.post(new a(this.f46311C, tCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static <T> void c(Executor executor, Callable<T> callable, InterfaceC4334a<T> interfaceC4334a) {
        executor.execute(new c(o1.b.a(), callable, interfaceC4334a));
    }

    static <T> T d(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
