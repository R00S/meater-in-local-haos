package p323h.p324a.p329z.p341g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9081r;
import p323h.p324a.p327x.C9088b;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.EnumC9104d;

/* compiled from: IoScheduler.java */
/* renamed from: h.a.z.g.e */
/* loaded from: classes2.dex */
public final class C9164e extends AbstractC9081r {

    /* renamed from: b */
    static final ThreadFactoryC9167h f35217b;

    /* renamed from: c */
    static final ThreadFactoryC9167h f35218c;

    /* renamed from: f */
    static final c f35221f;

    /* renamed from: g */
    static final a f35222g;

    /* renamed from: h */
    final ThreadFactory f35223h;

    /* renamed from: i */
    final AtomicReference<a> f35224i;

    /* renamed from: e */
    private static final TimeUnit f35220e = TimeUnit.SECONDS;

    /* renamed from: d */
    private static final long f35219d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* compiled from: IoScheduler.java */
    /* renamed from: h.a.z.g.e$a */
    static final class a implements Runnable {

        /* renamed from: f */
        private final long f35225f;

        /* renamed from: g */
        private final ConcurrentLinkedQueue<c> f35226g;

        /* renamed from: h */
        final C9088b f35227h;

        /* renamed from: i */
        private final ScheduledExecutorService f35228i;

        /* renamed from: j */
        private final Future<?> f35229j;

        /* renamed from: k */
        private final ThreadFactory f35230k;

        a(long j2, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0L;
            this.f35225f = nanos;
            this.f35226g = new ConcurrentLinkedQueue<>();
            this.f35227h = new C9088b();
            this.f35230k = threadFactory;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = null;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, C9164e.f35218c);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f35228i = scheduledExecutorServiceNewScheduledThreadPool;
            this.f35229j = scheduledFutureScheduleWithFixedDelay;
        }

        /* renamed from: a */
        void m29354a() {
            if (this.f35226g.isEmpty()) {
                return;
            }
            long jM29356c = m29356c();
            Iterator<c> it = this.f35226g.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.m29359g() > jM29356c) {
                    return;
                }
                if (this.f35226g.remove(next)) {
                    this.f35227h.mo29238a(next);
                }
            }
        }

        /* renamed from: b */
        c m29355b() {
            if (this.f35227h.mo29116q()) {
                return C9164e.f35221f;
            }
            while (!this.f35226g.isEmpty()) {
                c cVarPoll = this.f35226g.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f35230k);
            this.f35227h.mo29239b(cVar);
            return cVar;
        }

        /* renamed from: c */
        long m29356c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        void m29357d(c cVar) {
            cVar.m29360h(m29356c() + this.f35225f);
            this.f35226g.offer(cVar);
        }

        /* renamed from: e */
        void m29358e() {
            this.f35227h.mo29115k();
            Future<?> future = this.f35229j;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f35228i;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m29354a();
        }
    }

    /* compiled from: IoScheduler.java */
    /* renamed from: h.a.z.g.e$b */
    static final class b extends AbstractC9081r.b {

        /* renamed from: g */
        private final a f35232g;

        /* renamed from: h */
        private final c f35233h;

        /* renamed from: i */
        final AtomicBoolean f35234i = new AtomicBoolean();

        /* renamed from: f */
        private final C9088b f35231f = new C9088b();

        b(a aVar) {
            this.f35232g = aVar;
            this.f35233h = aVar.m29355b();
        }

        @Override // p323h.p324a.AbstractC9081r.b
        /* renamed from: c */
        public InterfaceC9089c mo29225c(Runnable runnable, long j2, TimeUnit timeUnit) {
            return this.f35231f.mo29116q() ? EnumC9104d.INSTANCE : this.f35233h.m29361d(runnable, j2, timeUnit, this.f35231f);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            if (this.f35234i.compareAndSet(false, true)) {
                this.f35231f.mo29115k();
                this.f35232g.m29357d(this.f35233h);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35234i.get();
        }
    }

    /* compiled from: IoScheduler.java */
    /* renamed from: h.a.z.g.e$c */
    static final class c extends C9166g {

        /* renamed from: h */
        private long f35235h;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f35235h = 0L;
        }

        /* renamed from: g */
        public long m29359g() {
            return this.f35235h;
        }

        /* renamed from: h */
        public void m29360h(long j2) {
            this.f35235h = j2;
        }
    }

    static {
        c cVar = new c(new ThreadFactoryC9167h("RxCachedThreadSchedulerShutdown"));
        f35221f = cVar;
        cVar.mo29115k();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        ThreadFactoryC9167h threadFactoryC9167h = new ThreadFactoryC9167h("RxCachedThreadScheduler", iMax);
        f35217b = threadFactoryC9167h;
        f35218c = new ThreadFactoryC9167h("RxCachedWorkerPoolEvictor", iMax);
        a aVar = new a(0L, null, threadFactoryC9167h);
        f35222g = aVar;
        aVar.m29358e();
    }

    public C9164e() {
        this(f35217b);
    }

    @Override // p323h.p324a.AbstractC9081r
    /* renamed from: a */
    public AbstractC9081r.b mo29220a() {
        return new b(this.f35224i.get());
    }

    /* renamed from: d */
    public void m29353d() {
        a aVar = new a(f35219d, f35220e, this.f35223h);
        if (this.f35224i.compareAndSet(f35222g, aVar)) {
            return;
        }
        aVar.m29358e();
    }

    public C9164e(ThreadFactory threadFactory) {
        this.f35223h = threadFactory;
        this.f35224i = new AtomicReference<>(f35222g);
        m29353d();
    }
}
