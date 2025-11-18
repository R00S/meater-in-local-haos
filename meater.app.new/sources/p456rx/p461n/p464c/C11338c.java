package p456rx.p461n.p464c;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11243h;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11426b;
import p456rx.p474t.C11427c;
import p456rx.p474t.C11429e;

/* compiled from: ExecutorScheduler.java */
/* renamed from: rx.n.c.c */
/* loaded from: classes3.dex */
public final class C11338c extends AbstractC11243h {

    /* renamed from: a */
    final Executor f42776a;

    /* compiled from: ExecutorScheduler.java */
    /* renamed from: rx.n.c.c$a */
    static final class a extends AbstractC11243h.a implements Runnable {

        /* renamed from: f */
        final Executor f42777f;

        /* renamed from: h */
        final ConcurrentLinkedQueue<RunnableC11345j> f42779h = new ConcurrentLinkedQueue<>();

        /* renamed from: i */
        final AtomicInteger f42780i = new AtomicInteger();

        /* renamed from: g */
        final C11426b f42778g = new C11426b();

        /* renamed from: j */
        final ScheduledExecutorService f42781j = C11339d.m40388a();

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: rx.n.c.c$a$a, reason: collision with other inner class name */
        class C11610a implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ C11427c f42782f;

            C11610a(C11427c c11427c) {
                this.f42782f = c11427c;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                a.this.f42778g.m40670d(this.f42782f);
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: rx.n.c.c$a$b */
        class b implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ C11427c f42784f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC11252a f42785g;

            /* renamed from: h */
            final /* synthetic */ InterfaceC11246k f42786h;

            b(C11427c c11427c, InterfaceC11252a interfaceC11252a, InterfaceC11246k interfaceC11246k) {
                this.f42784f = c11427c;
                this.f42785g = interfaceC11252a;
                this.f42786h = interfaceC11246k;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                if (this.f42784f.isUnsubscribed()) {
                    return;
                }
                InterfaceC11246k interfaceC11246kMo40146c = a.this.mo40146c(this.f42785g);
                this.f42784f.m40671a(interfaceC11246kMo40146c);
                if (interfaceC11246kMo40146c.getClass() == RunnableC11345j.class) {
                    ((RunnableC11345j) interfaceC11246kMo40146c).m40403b(this.f42786h);
                }
            }
        }

        public a(Executor executor) {
            this.f42777f = executor;
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: c */
        public InterfaceC11246k mo40146c(InterfaceC11252a interfaceC11252a) {
            if (isUnsubscribed()) {
                return C11429e.m40676c();
            }
            RunnableC11345j runnableC11345j = new RunnableC11345j(C11409c.m40585q(interfaceC11252a), this.f42778g);
            this.f42778g.m40667a(runnableC11345j);
            this.f42779h.offer(runnableC11345j);
            if (this.f42780i.getAndIncrement() == 0) {
                try {
                    this.f42777f.execute(this);
                } catch (RejectedExecutionException e2) {
                    this.f42778g.m40670d(runnableC11345j);
                    this.f42780i.decrementAndGet();
                    C11409c.m40578j(e2);
                    throw e2;
                }
            }
            return runnableC11345j;
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: d */
        public InterfaceC11246k mo40147d(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit) {
            if (j2 <= 0) {
                return mo40146c(interfaceC11252a);
            }
            if (isUnsubscribed()) {
                return C11429e.m40676c();
            }
            InterfaceC11252a interfaceC11252aM40585q = C11409c.m40585q(interfaceC11252a);
            C11427c c11427c = new C11427c();
            C11427c c11427c2 = new C11427c();
            c11427c2.m40671a(c11427c);
            this.f42778g.m40667a(c11427c2);
            InterfaceC11246k interfaceC11246kM40674a = C11429e.m40674a(new C11610a(c11427c2));
            RunnableC11345j runnableC11345j = new RunnableC11345j(new b(c11427c2, interfaceC11252aM40585q, interfaceC11246kM40674a));
            c11427c.m40671a(runnableC11345j);
            try {
                runnableC11345j.m40402a(this.f42781j.schedule(runnableC11345j, j2, timeUnit));
                return interfaceC11246kM40674a;
            } catch (RejectedExecutionException e2) {
                C11409c.m40578j(e2);
                throw e2;
            }
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42778g.isUnsubscribed();
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f42778g.isUnsubscribed()) {
                RunnableC11345j runnableC11345jPoll = this.f42779h.poll();
                if (runnableC11345jPoll == null) {
                    return;
                }
                if (!runnableC11345jPoll.isUnsubscribed()) {
                    if (this.f42778g.isUnsubscribed()) {
                        this.f42779h.clear();
                        return;
                    }
                    runnableC11345jPoll.run();
                }
                if (this.f42780i.decrementAndGet() == 0) {
                    return;
                }
            }
            this.f42779h.clear();
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            this.f42778g.unsubscribe();
            this.f42779h.clear();
        }
    }

    public C11338c(Executor executor) {
        this.f42776a = executor;
    }

    @Override // p456rx.AbstractC11243h
    public AbstractC11243h.a createWorker() {
        return new a(this.f42776a);
    }
}
