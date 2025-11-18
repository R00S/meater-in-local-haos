package p323h.p324a.p329z.p341g;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9081r;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.C9088b;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.EnumC9104d;

/* compiled from: SingleScheduler.java */
/* renamed from: h.a.z.g.l */
/* loaded from: classes2.dex */
public final class C9171l extends AbstractC9081r {

    /* renamed from: b */
    static final ThreadFactoryC9167h f35252b;

    /* renamed from: c */
    static final ScheduledExecutorService f35253c;

    /* renamed from: d */
    final ThreadFactory f35254d;

    /* renamed from: e */
    final AtomicReference<ScheduledExecutorService> f35255e;

    /* compiled from: SingleScheduler.java */
    /* renamed from: h.a.z.g.l$a */
    static final class a extends AbstractC9081r.b {

        /* renamed from: f */
        final ScheduledExecutorService f35256f;

        /* renamed from: g */
        final C9088b f35257g = new C9088b();

        /* renamed from: h */
        volatile boolean f35258h;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f35256f = scheduledExecutorService;
        }

        @Override // p323h.p324a.AbstractC9081r.b
        /* renamed from: c */
        public InterfaceC9089c mo29225c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.f35258h) {
                return EnumC9104d.INSTANCE;
            }
            RunnableC9169j runnableC9169j = new RunnableC9169j(C9063a.m29149q(runnable), this.f35257g);
            this.f35257g.mo29239b(runnableC9169j);
            try {
                runnableC9169j.m29365a(j2 <= 0 ? this.f35256f.submit((Callable) runnableC9169j) : this.f35256f.schedule((Callable) runnableC9169j, j2, timeUnit));
                return runnableC9169j;
            } catch (RejectedExecutionException e2) {
                mo29115k();
                C9063a.m29147o(e2);
                return EnumC9104d.INSTANCE;
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            if (this.f35258h) {
                return;
            }
            this.f35258h = true;
            this.f35257g.mo29115k();
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35258h;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f35253c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f35252b = new ThreadFactoryC9167h("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C9171l() {
        this(f35252b);
    }

    /* renamed from: d */
    static ScheduledExecutorService m29373d(ThreadFactory threadFactory) {
        return C9170k.m29366a(threadFactory);
    }

    @Override // p323h.p324a.AbstractC9081r
    /* renamed from: a */
    public AbstractC9081r.b mo29220a() {
        return new a(this.f35255e.get());
    }

    @Override // p323h.p324a.AbstractC9081r
    /* renamed from: c */
    public InterfaceC9089c mo29222c(Runnable runnable, long j2, TimeUnit timeUnit) {
        CallableC9168i callableC9168i = new CallableC9168i(C9063a.m29149q(runnable));
        try {
            callableC9168i.m29347a(j2 <= 0 ? this.f35255e.get().submit(callableC9168i) : this.f35255e.get().schedule(callableC9168i, j2, timeUnit));
            return callableC9168i;
        } catch (RejectedExecutionException e2) {
            C9063a.m29147o(e2);
            return EnumC9104d.INSTANCE;
        }
    }

    public C9171l(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f35255e = atomicReference;
        this.f35254d = threadFactory;
        atomicReference.lazySet(m29373d(threadFactory));
    }
}
