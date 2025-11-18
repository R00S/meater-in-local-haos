package r6;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GlideExecutor.java */
/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorServiceC4354a implements ExecutorService {

    /* renamed from: C, reason: collision with root package name */
    private static final long f48407C = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: D, reason: collision with root package name */
    private static volatile int f48408D;

    /* renamed from: B, reason: collision with root package name */
    private final ExecutorService f48409B;

    /* compiled from: GlideExecutor.java */
    /* renamed from: r6.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f48410a;

        /* renamed from: b, reason: collision with root package name */
        private int f48411b;

        /* renamed from: c, reason: collision with root package name */
        private int f48412c;

        /* renamed from: d, reason: collision with root package name */
        private ThreadFactory f48413d = new c();

        /* renamed from: e, reason: collision with root package name */
        private e f48414e = e.f48428d;

        /* renamed from: f, reason: collision with root package name */
        private String f48415f;

        /* renamed from: g, reason: collision with root package name */
        private long f48416g;

        b(boolean z10) {
            this.f48410a = z10;
        }

        public ExecutorServiceC4354a a() {
            if (TextUtils.isEmpty(this.f48415f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f48415f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f48411b, this.f48412c, this.f48416g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f48413d, this.f48415f, this.f48414e, this.f48410a));
            if (this.f48416g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC4354a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f48415f = str;
            return this;
        }

        public b c(int i10) {
            this.f48411b = i10;
            this.f48412c = i10;
            return this;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* renamed from: r6.a$c */
    private static final class c implements ThreadFactory {

        /* compiled from: GlideExecutor.java */
        /* renamed from: r6.a$c$a, reason: collision with other inner class name */
        class C0677a extends Thread {
            C0677a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0677a(runnable);
        }
    }

    /* compiled from: GlideExecutor.java */
    /* renamed from: r6.a$d */
    private static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadFactory f48418a;

        /* renamed from: b, reason: collision with root package name */
        private final String f48419b;

        /* renamed from: c, reason: collision with root package name */
        final e f48420c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f48421d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicInteger f48422e = new AtomicInteger();

        /* compiled from: GlideExecutor.java */
        /* renamed from: r6.a$d$a, reason: collision with other inner class name */
        class RunnableC0678a implements Runnable {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Runnable f48423B;

            RunnableC0678a(Runnable runnable) {
                this.f48423B = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f48421d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f48423B.run();
                } catch (Throwable th) {
                    d.this.f48420c.a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f48418a = threadFactory;
            this.f48419b = str;
            this.f48420c = eVar;
            this.f48421d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f48418a.newThread(new RunnableC0678a(runnable));
            threadNewThread.setName("glide-" + this.f48419b + "-thread-" + this.f48422e.getAndIncrement());
            return threadNewThread;
        }
    }

    ExecutorServiceC4354a(ExecutorService executorService) {
        this.f48409B = executorService;
    }

    static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (f48408D == 0) {
            f48408D = Math.min(4, C4355b.a());
        }
        return f48408D;
    }

    public static b d() {
        return new b(true).c(a()).b("animation");
    }

    public static ExecutorServiceC4354a e() {
        return d().a();
    }

    public static b f() {
        return new b(true).c(1).b("disk-cache");
    }

    public static ExecutorServiceC4354a g() {
        return f().a();
    }

    public static b h() {
        return new b(false).c(b()).b("source");
    }

    public static ExecutorServiceC4354a i() {
        return h().a();
    }

    public static ExecutorServiceC4354a k() {
        return new ExecutorServiceC4354a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f48407C, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f48428d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f48409B.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f48409B.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f48409B.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f48409B.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f48409B.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f48409B.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f48409B.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f48409B.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f48409B.submit(runnable);
    }

    public String toString() {
        return this.f48409B.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f48409B.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f48409B.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f48409B.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f48409B.submit(callable);
    }

    /* compiled from: GlideExecutor.java */
    /* renamed from: r6.a$e */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f48425a = new C0679a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f48426b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f48427c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f48428d;

        /* compiled from: GlideExecutor.java */
        /* renamed from: r6.a$e$b */
        class b implements e {
            b() {
            }

            @Override // r6.ExecutorServiceC4354a.e
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* compiled from: GlideExecutor.java */
        /* renamed from: r6.a$e$c */
        class c implements e {
            c() {
            }

            @Override // r6.ExecutorServiceC4354a.e
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f48426b = bVar;
            f48427c = new c();
            f48428d = bVar;
        }

        void a(Throwable th);

        /* compiled from: GlideExecutor.java */
        /* renamed from: r6.a$e$a, reason: collision with other inner class name */
        class C0679a implements e {
            C0679a() {
            }

            @Override // r6.ExecutorServiceC4354a.e
            public void a(Throwable th) {
            }
        }
    }
}
