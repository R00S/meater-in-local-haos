package p456rx.p461n.p464c;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p461n.p466e.C11363l;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11426b;

/* compiled from: ScheduledAction.java */
/* renamed from: rx.n.c.j */
/* loaded from: classes3.dex */
public final class RunnableC11345j extends AtomicReference<Thread> implements Runnable, InterfaceC11246k {

    /* renamed from: f */
    final C11363l f42818f;

    /* renamed from: g */
    final InterfaceC11252a f42819g;

    /* compiled from: ScheduledAction.java */
    /* renamed from: rx.n.c.j$a */
    final class a implements InterfaceC11246k {

        /* renamed from: f */
        private final Future<?> f42820f;

        a(Future<?> future) {
            this.f42820f = future;
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42820f.isCancelled();
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            if (RunnableC11345j.this.get() != Thread.currentThread()) {
                this.f42820f.cancel(true);
            } else {
                this.f42820f.cancel(false);
            }
        }
    }

    /* compiled from: ScheduledAction.java */
    /* renamed from: rx.n.c.j$b */
    static final class b extends AtomicBoolean implements InterfaceC11246k {

        /* renamed from: f */
        final RunnableC11345j f42822f;

        /* renamed from: g */
        final C11363l f42823g;

        public b(RunnableC11345j runnableC11345j, C11363l c11363l) {
            this.f42822f = runnableC11345j;
            this.f42823g = c11363l;
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42822f.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f42823g.m40465b(this.f42822f);
            }
        }
    }

    /* compiled from: ScheduledAction.java */
    /* renamed from: rx.n.c.j$c */
    static final class c extends AtomicBoolean implements InterfaceC11246k {

        /* renamed from: f */
        final RunnableC11345j f42824f;

        /* renamed from: g */
        final C11426b f42825g;

        public c(RunnableC11345j runnableC11345j, C11426b c11426b) {
            this.f42824f = runnableC11345j;
            this.f42825g = c11426b;
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42824f.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f42825g.m40670d(this.f42824f);
            }
        }
    }

    public RunnableC11345j(InterfaceC11252a interfaceC11252a) {
        this.f42819g = interfaceC11252a;
        this.f42818f = new C11363l();
    }

    /* renamed from: a */
    public void m40402a(Future<?> future) {
        this.f42818f.m40464a(new a(future));
    }

    /* renamed from: b */
    public void m40403b(InterfaceC11246k interfaceC11246k) {
        this.f42818f.m40464a(interfaceC11246k);
    }

    /* renamed from: c */
    public void m40404c(C11426b c11426b) {
        this.f42818f.m40464a(new c(this, c11426b));
    }

    /* renamed from: d */
    void m40405d(Throwable th) {
        C11409c.m40578j(th);
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    @Override // p456rx.InterfaceC11246k
    public boolean isUnsubscribed() {
        return this.f42818f.isUnsubscribed();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.f42819g.call();
            } catch (OnErrorNotImplementedException e2) {
                m40405d(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e2));
            } catch (Throwable th) {
                m40405d(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th));
            }
        } finally {
            unsubscribe();
        }
    }

    @Override // p456rx.InterfaceC11246k
    public void unsubscribe() {
        if (this.f42818f.isUnsubscribed()) {
            return;
        }
        this.f42818f.unsubscribe();
    }

    public RunnableC11345j(InterfaceC11252a interfaceC11252a, C11426b c11426b) {
        this.f42819g = interfaceC11252a;
        this.f42818f = new C11363l(new c(this, c11426b));
    }

    public RunnableC11345j(InterfaceC11252a interfaceC11252a, C11363l c11363l) {
        this.f42819g = interfaceC11252a;
        this.f42818f = new C11363l(new b(this, c11363l));
    }
}
