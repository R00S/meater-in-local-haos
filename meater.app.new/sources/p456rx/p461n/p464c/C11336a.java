package p456rx.p461n.p464c;

import java.lang.reflect.InvocationTargetException;
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
import p456rx.AbstractC11243h;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p461n.p466e.ThreadFactoryC11360i;
import p456rx.p474t.C11426b;
import p456rx.p474t.C11429e;

/* compiled from: CachedThreadScheduler.java */
/* renamed from: rx.n.c.a */
/* loaded from: classes3.dex */
public final class C11336a extends AbstractC11243h implements InterfaceC11346k {

    /* renamed from: f */
    private static final long f42738f;

    /* renamed from: g */
    private static final TimeUnit f42739g = TimeUnit.SECONDS;

    /* renamed from: h */
    static final c f42740h;

    /* renamed from: i */
    static final a f42741i;

    /* renamed from: j */
    final ThreadFactory f42742j;

    /* renamed from: k */
    final AtomicReference<a> f42743k = new AtomicReference<>(f42741i);

    /* compiled from: CachedThreadScheduler.java */
    /* renamed from: rx.n.c.a$a */
    static final class a {

        /* renamed from: a */
        private final ThreadFactory f42744a;

        /* renamed from: b */
        private final long f42745b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<c> f42746c;

        /* renamed from: d */
        private final C11426b f42747d;

        /* renamed from: e */
        private final ScheduledExecutorService f42748e;

        /* renamed from: f */
        private final Future<?> f42749f;

        /* compiled from: CachedThreadScheduler.java */
        /* renamed from: rx.n.c.a$a$a, reason: collision with other inner class name */
        class ThreadFactoryC11608a implements ThreadFactory {

            /* renamed from: f */
            final /* synthetic */ ThreadFactory f42750f;

            ThreadFactoryC11608a(ThreadFactory threadFactory) {
                this.f42750f = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = this.f42750f.newThread(runnable);
                threadNewThread.setName(threadNewThread.getName() + " (Evictor)");
                return threadNewThread;
            }
        }

        /* compiled from: CachedThreadScheduler.java */
        /* renamed from: rx.n.c.a$a$b */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.m40378a();
            }
        }

        a(ThreadFactory threadFactory, long j2, TimeUnit timeUnit) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            this.f42744a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0L;
            this.f42745b = nanos;
            this.f42746c = new ConcurrentLinkedQueue<>();
            this.f42747d = new C11426b();
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = null;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC11608a(threadFactory));
                C11343h.m40396m(scheduledExecutorServiceNewScheduledThreadPool);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f42748e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f42749f = scheduledFutureScheduleWithFixedDelay;
        }

        /* renamed from: a */
        void m40378a() {
            if (this.f42746c.isEmpty()) {
                return;
            }
            long jM40380c = m40380c();
            Iterator<c> it = this.f42746c.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.m40383n() > jM40380c) {
                    return;
                }
                if (this.f42746c.remove(next)) {
                    this.f42747d.m40670d(next);
                }
            }
        }

        /* renamed from: b */
        c m40379b() {
            if (this.f42747d.isUnsubscribed()) {
                return C11336a.f42740h;
            }
            while (!this.f42746c.isEmpty()) {
                c cVarPoll = this.f42746c.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f42744a);
            this.f42747d.m40667a(cVar);
            return cVar;
        }

        /* renamed from: c */
        long m40380c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        void m40381d(c cVar) {
            cVar.m40384o(m40380c() + this.f42745b);
            this.f42746c.offer(cVar);
        }

        /* renamed from: e */
        void m40382e() {
            try {
                Future<?> future = this.f42749f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f42748e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } finally {
                this.f42747d.unsubscribe();
            }
        }
    }

    /* compiled from: CachedThreadScheduler.java */
    /* renamed from: rx.n.c.a$b */
    static final class b extends AbstractC11243h.a implements InterfaceC11252a {

        /* renamed from: g */
        private final a f42754g;

        /* renamed from: h */
        private final c f42755h;

        /* renamed from: f */
        private final C11426b f42753f = new C11426b();

        /* renamed from: i */
        final AtomicBoolean f42756i = new AtomicBoolean();

        /* compiled from: CachedThreadScheduler.java */
        /* renamed from: rx.n.c.a$b$a */
        class a implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11252a f42757f;

            a(InterfaceC11252a interfaceC11252a) {
                this.f42757f = interfaceC11252a;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                if (b.this.isUnsubscribed()) {
                    return;
                }
                this.f42757f.call();
            }
        }

        b(a aVar) {
            this.f42754g = aVar;
            this.f42755h = aVar.m40379b();
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: c */
        public InterfaceC11246k mo40146c(InterfaceC11252a interfaceC11252a) {
            return mo40147d(interfaceC11252a, 0L, null);
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            this.f42754g.m40381d(this.f42755h);
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: d */
        public InterfaceC11246k mo40147d(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit) {
            if (this.f42753f.isUnsubscribed()) {
                return C11429e.m40676c();
            }
            RunnableC11345j runnableC11345jM40397j = this.f42755h.m40397j(new a(interfaceC11252a), j2, timeUnit);
            this.f42753f.m40667a(runnableC11345jM40397j);
            runnableC11345jM40397j.m40404c(this.f42753f);
            return runnableC11345jM40397j;
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42753f.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            if (this.f42756i.compareAndSet(false, true)) {
                this.f42755h.mo40146c(this);
            }
            this.f42753f.unsubscribe();
        }
    }

    /* compiled from: CachedThreadScheduler.java */
    /* renamed from: rx.n.c.a$c */
    static final class c extends C11343h {

        /* renamed from: n */
        private long f42759n;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f42759n = 0L;
        }

        /* renamed from: n */
        public long m40383n() {
            return this.f42759n;
        }

        /* renamed from: o */
        public void m40384o(long j2) {
            this.f42759n = j2;
        }
    }

    static {
        c cVar = new c(ThreadFactoryC11360i.f42888f);
        f42740h = cVar;
        cVar.unsubscribe();
        a aVar = new a(null, 0L, null);
        f42741i = aVar;
        aVar.m40382e();
        f42738f = Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue();
    }

    public C11336a(ThreadFactory threadFactory) {
        this.f42742j = threadFactory;
        start();
    }

    @Override // p456rx.AbstractC11243h
    public AbstractC11243h.a createWorker() {
        return new b(this.f42743k.get());
    }

    @Override // p456rx.p461n.p464c.InterfaceC11346k
    public void shutdown() {
        a aVar;
        a aVar2;
        do {
            aVar = this.f42743k.get();
            aVar2 = f42741i;
            if (aVar == aVar2) {
                return;
            }
        } while (!this.f42743k.compareAndSet(aVar, aVar2));
        aVar.m40382e();
    }

    @Override // p456rx.p461n.p464c.InterfaceC11346k
    public void start() {
        a aVar = new a(this.f42742j, f42738f, f42739g);
        if (this.f42743k.compareAndSet(f42741i, aVar)) {
            return;
        }
        aVar.m40382e();
    }
}
