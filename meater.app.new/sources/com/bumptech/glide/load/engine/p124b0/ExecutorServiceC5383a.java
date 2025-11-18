package com.bumptech.glide.load.engine.p124b0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: GlideExecutor.java */
/* renamed from: com.bumptech.glide.load.engine.b0.a */
/* loaded from: classes.dex */
public final class ExecutorServiceC5383a implements ExecutorService {

    /* renamed from: f */
    private static final long f13287f = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: g */
    private static volatile int f13288g;

    /* renamed from: h */
    private final ExecutorService f13289h;

    /* compiled from: GlideExecutor.java */
    /* renamed from: com.bumptech.glide.load.engine.b0.a$a */
    private static final class a implements ThreadFactory {

        /* renamed from: f */
        private final String f13290f;

        /* renamed from: g */
        final b f13291g;

        /* renamed from: h */
        final boolean f13292h;

        /* renamed from: i */
        private int f13293i;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.b0.a$a$a, reason: collision with other inner class name */
        class C11453a extends Thread {
            C11453a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                if (a.this.f13292h) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    a.this.f13291g.mo10222a(th);
                }
            }
        }

        a(String str, b bVar, boolean z) {
            this.f13290f = str;
            this.f13291g = bVar;
            this.f13292h = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C11453a c11453a;
            c11453a = new C11453a(runnable, "glide-" + this.f13290f + "-thread-" + this.f13293i);
            this.f13293i = this.f13293i + 1;
            return c11453a;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* renamed from: com.bumptech.glide.load.engine.b0.a$b */
    public interface b {

        /* renamed from: a */
        public static final b f13295a = new a();

        /* renamed from: b */
        public static final b f13296b;

        /* renamed from: c */
        public static final b f13297c;

        /* renamed from: d */
        public static final b f13298d;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.b0.a$b$a */
        class a implements b {
            a() {
            }

            @Override // com.bumptech.glide.load.engine.p124b0.ExecutorServiceC5383a.b
            /* renamed from: a */
            public void mo10222a(Throwable th) {
            }
        }

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.b0.a$b$b, reason: collision with other inner class name */
        class C11454b implements b {
            C11454b() {
            }

            @Override // com.bumptech.glide.load.engine.p124b0.ExecutorServiceC5383a.b
            /* renamed from: a */
            public void mo10222a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.b0.a$b$c */
        class c implements b {
            c() {
            }

            @Override // com.bumptech.glide.load.engine.p124b0.ExecutorServiceC5383a.b
            /* renamed from: a */
            public void mo10222a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C11454b c11454b = new C11454b();
            f13296b = c11454b;
            f13297c = new c();
            f13298d = c11454b;
        }

        /* renamed from: a */
        void mo10222a(Throwable th);
    }

    ExecutorServiceC5383a(ExecutorService executorService) {
        this.f13289h = executorService;
    }

    /* renamed from: a */
    public static int m10214a() {
        if (f13288g == 0) {
            f13288g = Math.min(4, C5384b.m10223a());
        }
        return f13288g;
    }

    /* renamed from: b */
    public static ExecutorServiceC5383a m10215b() {
        return m10216c(m10214a() >= 4 ? 2 : 1, b.f13298d);
    }

    /* renamed from: c */
    public static ExecutorServiceC5383a m10216c(int i2, b bVar) {
        return new ExecutorServiceC5383a(new ThreadPoolExecutor(0, i2, f13287f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a("animation", bVar, true)));
    }

    /* renamed from: d */
    public static ExecutorServiceC5383a m10217d() {
        return m10218e(1, "disk-cache", b.f13298d);
    }

    /* renamed from: e */
    public static ExecutorServiceC5383a m10218e(int i2, String str, b bVar) {
        return new ExecutorServiceC5383a(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a(str, bVar, true)));
    }

    /* renamed from: f */
    public static ExecutorServiceC5383a m10219f() {
        return m10220g(m10214a(), "source", b.f13298d);
    }

    /* renamed from: g */
    public static ExecutorServiceC5383a m10220g(int i2, String str, b bVar) {
        return new ExecutorServiceC5383a(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a(str, bVar, false)));
    }

    /* renamed from: h */
    public static ExecutorServiceC5383a m10221h() {
        return new ExecutorServiceC5383a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f13287f, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a("source-unlimited", b.f13298d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f13289h.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f13289h.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f13289h.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f13289h.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f13289h.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f13289h.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f13289h.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f13289h.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f13289h.submit(runnable);
    }

    public String toString() {
        return this.f13289h.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f13289h.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f13289h.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f13289h.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f13289h.submit(callable);
    }
}
