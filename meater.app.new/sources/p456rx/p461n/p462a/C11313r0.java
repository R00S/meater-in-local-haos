package p456rx.p461n.p462a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11243h;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p461n.p464c.C11341f;
import p456rx.p461n.p464c.C11349n;
import p456rx.p461n.p466e.C11359h;
import p456rx.p461n.p466e.p467n.C11369e;
import p456rx.p461n.p466e.p468o.C11391s;
import p456rx.p461n.p466e.p468o.C11398z;
import p456rx.p471q.C11409c;

/* compiled from: OperatorObserveOn.java */
/* renamed from: rx.n.a.r0 */
/* loaded from: classes3.dex */
public final class C11313r0<T> implements C11234e.b<T, T> {

    /* renamed from: f */
    private final AbstractC11243h f42558f;

    /* renamed from: g */
    private final boolean f42559g;

    /* renamed from: h */
    private final int f42560h;

    /* compiled from: OperatorObserveOn.java */
    /* renamed from: rx.n.a.r0$a */
    static final class a<T> extends AbstractC11245j<T> implements InterfaceC11252a {

        /* renamed from: f */
        final AbstractC11245j<? super T> f42561f;

        /* renamed from: g */
        final AbstractC11243h.a f42562g;

        /* renamed from: h */
        final boolean f42563h;

        /* renamed from: i */
        final Queue<Object> f42564i;

        /* renamed from: j */
        final int f42565j;

        /* renamed from: k */
        volatile boolean f42566k;

        /* renamed from: l */
        final AtomicLong f42567l = new AtomicLong();

        /* renamed from: m */
        final AtomicLong f42568m = new AtomicLong();

        /* renamed from: n */
        Throwable f42569n;

        /* renamed from: o */
        long f42570o;

        /* compiled from: OperatorObserveOn.java */
        /* renamed from: rx.n.a.r0$a$a, reason: collision with other inner class name */
        class C11602a implements InterfaceC11242g {
            C11602a() {
            }

            @Override // p456rx.InterfaceC11242g
            public void request(long j2) {
                if (j2 > 0) {
                    C11261a.m40162b(a.this.f42567l, j2);
                    a.this.m40312e();
                }
            }
        }

        public a(AbstractC11243h abstractC11243h, AbstractC11245j<? super T> abstractC11245j, boolean z, int i2) {
            this.f42561f = abstractC11245j;
            this.f42562g = abstractC11243h.createWorker();
            this.f42563h = z;
            i2 = i2 <= 0 ? C11359h.f42884f : i2;
            this.f42565j = i2 - (i2 >> 2);
            if (C11398z.m40548b()) {
                this.f42564i = new C11391s(i2);
            } else {
                this.f42564i = new C11369e(i2);
            }
            request(i2);
        }

        /* renamed from: c */
        boolean m40310c(boolean z, boolean z2, AbstractC11245j<? super T> abstractC11245j, Queue<Object> queue) {
            if (abstractC11245j.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f42563h) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f42569n;
                try {
                    if (th != null) {
                        abstractC11245j.onError(th);
                    } else {
                        abstractC11245j.onCompleted();
                    }
                    return false;
                } finally {
                }
            }
            Throwable th2 = this.f42569n;
            if (th2 != null) {
                queue.clear();
                try {
                    abstractC11245j.onError(th2);
                    return true;
                } finally {
                }
            }
            if (!z2) {
                return false;
            }
            try {
                abstractC11245j.onCompleted();
                return true;
            } finally {
            }
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            long j2 = this.f42570o;
            Queue<Object> queue = this.f42564i;
            AbstractC11245j<? super T> abstractC11245j = this.f42561f;
            long jAddAndGet = 1;
            do {
                long jM40163c = this.f42567l.get();
                while (jM40163c != j2) {
                    boolean z = this.f42566k;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (m40310c(z, z2, abstractC11245j, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    abstractC11245j.onNext((Object) C11282h.m40219e(objPoll));
                    j2++;
                    if (j2 == this.f42565j) {
                        jM40163c = C11261a.m40163c(this.f42567l, j2);
                        request(j2);
                        j2 = 0;
                    }
                }
                if (jM40163c == j2 && m40310c(this.f42566k, queue.isEmpty(), abstractC11245j, queue)) {
                    return;
                }
                this.f42570o = j2;
                jAddAndGet = this.f42568m.addAndGet(-jAddAndGet);
            } while (jAddAndGet != 0);
        }

        /* renamed from: d */
        void m40311d() {
            AbstractC11245j<? super T> abstractC11245j = this.f42561f;
            abstractC11245j.setProducer(new C11602a());
            abstractC11245j.add(this.f42562g);
            abstractC11245j.add(this);
        }

        /* renamed from: e */
        protected void m40312e() {
            if (this.f42568m.getAndIncrement() == 0) {
                this.f42562g.mo40146c(this);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (isUnsubscribed() || this.f42566k) {
                return;
            }
            this.f42566k = true;
            m40312e();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (isUnsubscribed() || this.f42566k) {
                C11409c.m40578j(th);
                return;
            }
            this.f42569n = th;
            this.f42566k = true;
            m40312e();
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (isUnsubscribed() || this.f42566k) {
                return;
            }
            if (this.f42564i.offer(C11282h.m40221g(t))) {
                m40312e();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public C11313r0(AbstractC11243h abstractC11243h, boolean z, int i2) {
        this.f42558f = abstractC11243h;
        this.f42559g = z;
        this.f42560h = i2 <= 0 ? C11359h.f42884f : i2;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        AbstractC11243h abstractC11243h = this.f42558f;
        if ((abstractC11243h instanceof C11341f) || (abstractC11243h instanceof C11349n)) {
            return abstractC11245j;
        }
        a aVar = new a(abstractC11243h, abstractC11245j, this.f42559g, this.f42560h);
        aVar.m40311d();
        return aVar;
    }
}
