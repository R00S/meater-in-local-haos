package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11243h;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p461n.p463b.C11333a;
import p456rx.p461n.p465d.C11350a;
import p456rx.p471q.C11409c;

/* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
/* renamed from: rx.n.a.e0 */
/* loaded from: classes3.dex */
public final class C11274e0<T> implements C11234e.a<T> {

    /* renamed from: f */
    final C11234e<T> f42235f;

    /* renamed from: g */
    final long f42236g;

    /* renamed from: h */
    final TimeUnit f42237h;

    /* renamed from: i */
    final AbstractC11243h f42238i;

    /* renamed from: j */
    final C11234e<? extends T> f42239j;

    /* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
    /* renamed from: rx.n.a.e0$a */
    static final class a<T> extends AbstractC11245j<T> {

        /* renamed from: f */
        final AbstractC11245j<? super T> f42240f;

        /* renamed from: g */
        final C11333a f42241g;

        a(AbstractC11245j<? super T> abstractC11245j, C11333a c11333a) {
            this.f42240f = abstractC11245j;
            this.f42241g = c11333a;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42240f.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42240f.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            this.f42240f.onNext(t);
        }

        @Override // p456rx.AbstractC11245j
        public void setProducer(InterfaceC11242g interfaceC11242g) {
            this.f42241g.m40375c(interfaceC11242g);
        }
    }

    /* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
    /* renamed from: rx.n.a.e0$b */
    static final class b<T> extends AbstractC11245j<T> {

        /* renamed from: f */
        final AbstractC11245j<? super T> f42242f;

        /* renamed from: g */
        final long f42243g;

        /* renamed from: h */
        final TimeUnit f42244h;

        /* renamed from: i */
        final AbstractC11243h.a f42245i;

        /* renamed from: j */
        final C11234e<? extends T> f42246j;

        /* renamed from: k */
        final C11333a f42247k = new C11333a();

        /* renamed from: l */
        final AtomicLong f42248l = new AtomicLong();

        /* renamed from: m */
        final C11350a f42249m;

        /* renamed from: n */
        final C11350a f42250n;

        /* renamed from: o */
        long f42251o;

        /* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
        /* renamed from: rx.n.a.e0$b$a */
        final class a implements InterfaceC11252a {

            /* renamed from: f */
            final long f42252f;

            a(long j2) {
                this.f42252f = j2;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                b.this.m40199c(this.f42252f);
            }
        }

        b(AbstractC11245j<? super T> abstractC11245j, long j2, TimeUnit timeUnit, AbstractC11243h.a aVar, C11234e<? extends T> c11234e) {
            this.f42242f = abstractC11245j;
            this.f42243g = j2;
            this.f42244h = timeUnit;
            this.f42245i = aVar;
            this.f42246j = c11234e;
            C11350a c11350a = new C11350a();
            this.f42249m = c11350a;
            this.f42250n = new C11350a(this);
            add(aVar);
            add(c11350a);
        }

        /* renamed from: c */
        void m40199c(long j2) {
            if (this.f42248l.compareAndSet(j2, Long.MAX_VALUE)) {
                unsubscribe();
                if (this.f42246j == null) {
                    this.f42242f.onError(new TimeoutException());
                    return;
                }
                long j3 = this.f42251o;
                if (j3 != 0) {
                    this.f42247k.m40374b(j3);
                }
                a aVar = new a(this.f42242f, this.f42247k);
                if (this.f42250n.m40415b(aVar)) {
                    this.f42246j.m40058E0(aVar);
                }
            }
        }

        /* renamed from: d */
        void m40200d(long j2) {
            this.f42249m.m40415b(this.f42245i.mo40147d(new a(j2), this.f42243g, this.f42244h));
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42248l.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f42249m.unsubscribe();
                this.f42242f.onCompleted();
                this.f42245i.unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42248l.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C11409c.m40578j(th);
                return;
            }
            this.f42249m.unsubscribe();
            this.f42242f.onError(th);
            this.f42245i.unsubscribe();
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            long j2 = this.f42248l.get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 + 1;
                if (this.f42248l.compareAndSet(j2, j3)) {
                    InterfaceC11246k interfaceC11246k = this.f42249m.get();
                    if (interfaceC11246k != null) {
                        interfaceC11246k.unsubscribe();
                    }
                    this.f42251o++;
                    this.f42242f.onNext(t);
                    m40200d(j3);
                }
            }
        }

        @Override // p456rx.AbstractC11245j
        public void setProducer(InterfaceC11242g interfaceC11242g) {
            this.f42247k.m40375c(interfaceC11242g);
        }
    }

    public C11274e0(C11234e<T> c11234e, long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h, C11234e<? extends T> c11234e2) {
        this.f42235f = c11234e;
        this.f42236g = j2;
        this.f42237h = timeUnit;
        this.f42238i = abstractC11243h;
        this.f42239j = c11234e2;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        b bVar = new b(abstractC11245j, this.f42236g, this.f42237h, this.f42238i.createWorker(), this.f42239j);
        abstractC11245j.add(bVar.f42250n);
        abstractC11245j.setProducer(bVar.f42247k);
        bVar.m40200d(0L);
        this.f42235f.m40058E0(bVar);
    }
}
