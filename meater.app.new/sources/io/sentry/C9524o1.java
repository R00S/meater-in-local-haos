package io.sentry;

import io.sentry.util.C9646q;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HostnameCache.java */
/* renamed from: io.sentry.o1 */
/* loaded from: classes2.dex */
final class C9524o1 {

    /* renamed from: a */
    private static final long f36522a = TimeUnit.HOURS.toMillis(5);

    /* renamed from: b */
    private static final long f36523b = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: c */
    private static C9524o1 f36524c;

    /* renamed from: d */
    private final long f36525d;

    /* renamed from: e */
    private volatile String f36526e;

    /* renamed from: f */
    private volatile long f36527f;

    /* renamed from: g */
    private final AtomicBoolean f36528g;

    /* renamed from: h */
    private final Callable<InetAddress> f36529h;

    /* renamed from: i */
    private final ExecutorService f36530i;

    /* compiled from: HostnameCache.java */
    /* renamed from: io.sentry.o1$b */
    private static final class b implements ThreadFactory {

        /* renamed from: f */
        private int f36531f;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryHostnameCache-");
            int i2 = this.f36531f;
            this.f36531f = i2 + 1;
            sb.append(i2);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private C9524o1() {
        this(f36522a);
    }

    /* renamed from: c */
    static C9524o1 m31110c() {
        if (f36524c == null) {
            f36524c = new C9524o1();
        }
        return f36524c;
    }

    /* renamed from: d */
    private void m31111d() {
        this.f36527f = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    /* renamed from: f */
    private /* synthetic */ Void m31113f() throws Exception {
        try {
            this.f36526e = this.f36529h.call().getCanonicalHostName();
            this.f36527f = System.currentTimeMillis() + this.f36525d;
            this.f36528g.set(false);
            return null;
        } catch (Throwable th) {
            this.f36528g.set(false);
            throw th;
        }
    }

    /* renamed from: h */
    private void m31114h() throws ExecutionException, InterruptedException, TimeoutException {
        try {
            this.f36530i.submit(new Callable() { // from class: io.sentry.f
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.f36315f.m31117g();
                    return null;
                }
            }).get(f36523b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            m31111d();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            m31111d();
        }
    }

    /* renamed from: a */
    void m31115a() {
        this.f36530i.shutdown();
    }

    /* renamed from: b */
    String m31116b() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f36527f < System.currentTimeMillis() && this.f36528g.compareAndSet(false, true)) {
            m31114h();
        }
        return this.f36526e;
    }

    /* renamed from: g */
    public /* synthetic */ Void m31117g() throws Exception {
        m31113f();
        return null;
    }

    C9524o1(long j2) {
        this(j2, new Callable() { // from class: io.sentry.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InetAddress.getLocalHost();
            }
        });
    }

    C9524o1(long j2, Callable<InetAddress> callable) throws ExecutionException, InterruptedException, TimeoutException {
        this.f36528g = new AtomicBoolean(false);
        this.f36530i = Executors.newSingleThreadExecutor(new b());
        this.f36525d = j2;
        this.f36529h = (Callable) C9646q.m31802c(callable, "getLocalhost is required");
        m31114h();
    }
}
