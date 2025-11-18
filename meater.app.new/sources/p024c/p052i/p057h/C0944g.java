package p024c.p052i.p057h;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p024c.p052i.p059j.InterfaceC0951a;

/* compiled from: RequestExecutor.java */
/* renamed from: c.i.h.g */
/* loaded from: classes.dex */
class C0944g {

    /* compiled from: RequestExecutor.java */
    /* renamed from: c.i.h.g$a */
    private static class a implements ThreadFactory {

        /* renamed from: f */
        private String f6351f;

        /* renamed from: g */
        private int f6352g;

        /* compiled from: RequestExecutor.java */
        /* renamed from: c.i.h.g$a$a, reason: collision with other inner class name */
        private static class C11446a extends Thread {

            /* renamed from: f */
            private final int f6353f;

            C11446a(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f6353f = i2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f6353f);
                super.run();
            }
        }

        a(String str, int i2) {
            this.f6351f = str;
            this.f6352g = i2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C11446a(runnable, this.f6351f, this.f6352g);
        }
    }

    /* compiled from: RequestExecutor.java */
    /* renamed from: c.i.h.g$b */
    private static class b<T> implements Runnable {

        /* renamed from: f */
        private Callable<T> f6354f;

        /* renamed from: g */
        private InterfaceC0951a<T> f6355g;

        /* renamed from: h */
        private Handler f6356h;

        /* compiled from: RequestExecutor.java */
        /* renamed from: c.i.h.g$b$a */
        class a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ InterfaceC0951a f6357f;

            /* renamed from: g */
            final /* synthetic */ Object f6358g;

            a(InterfaceC0951a interfaceC0951a, Object obj) {
                this.f6357f = interfaceC0951a;
                this.f6358g = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f6357f.mo5991a(this.f6358g);
            }
        }

        b(Handler handler, Callable<T> callable, InterfaceC0951a<T> interfaceC0951a) {
            this.f6354f = callable;
            this.f6355g = interfaceC0951a;
            this.f6356h = handler;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            T tCall;
            try {
                tCall = this.f6354f.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f6356h.post(new a(this.f6355g, tCall));
        }
    }

    /* renamed from: a */
    static ThreadPoolExecutor m6006a(String str, int i2, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    static <T> void m6007b(Executor executor, Callable<T> callable, InterfaceC0951a<T> interfaceC0951a) {
        executor.execute(new b(C0939b.m5970a(), callable, interfaceC0951a));
    }

    /* renamed from: c */
    static <T> T m6008c(ExecutorService executorService, Callable<T> callable, int i2) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
