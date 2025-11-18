package p456rx.p461n.p462a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11244i;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.InterfaceC11246k;
import p456rx.Single;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p461n.p466e.EnumC11356e;
import p456rx.p461n.p466e.p467n.C11368d;
import p456rx.p461n.p466e.p468o.C11381i;
import p456rx.p461n.p466e.p468o.C11398z;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11426b;

/* compiled from: OnSubscribeFlatMapSingle.java */
/* renamed from: rx.n.a.q */
/* loaded from: classes3.dex */
public final class C11309q<T, R> implements C11234e.a<R> {

    /* renamed from: f */
    final C11234e<T> f42490f;

    /* renamed from: g */
    final InterfaceC11256e<? super T, ? extends Single<? extends R>> f42491g;

    /* renamed from: h */
    final boolean f42492h;

    /* renamed from: i */
    final int f42493i;

    /* compiled from: OnSubscribeFlatMapSingle.java */
    /* renamed from: rx.n.a.q$a */
    static final class a<T, R> extends AbstractC11245j<T> {

        /* renamed from: f */
        final AbstractC11245j<? super R> f42494f;

        /* renamed from: g */
        final InterfaceC11256e<? super T, ? extends Single<? extends R>> f42495g;

        /* renamed from: h */
        final boolean f42496h;

        /* renamed from: i */
        final int f42497i;

        /* renamed from: n */
        final Queue<Object> f42502n;

        /* renamed from: p */
        volatile boolean f42504p;

        /* renamed from: q */
        volatile boolean f42505q;

        /* renamed from: j */
        final AtomicInteger f42498j = new AtomicInteger();

        /* renamed from: m */
        final AtomicReference<Throwable> f42501m = new AtomicReference<>();

        /* renamed from: o */
        final a<T, R>.b f42503o = new b();

        /* renamed from: l */
        final C11426b f42500l = new C11426b();

        /* renamed from: k */
        final AtomicInteger f42499k = new AtomicInteger();

        /* compiled from: OnSubscribeFlatMapSingle.java */
        /* renamed from: rx.n.a.q$a$a, reason: collision with other inner class name */
        final class C11601a extends AbstractC11244i<R> {
            C11601a() {
            }

            @Override // p456rx.AbstractC11244i
            /* renamed from: c */
            public void mo29130c(R r) {
                a.this.m40278e(this, r);
            }

            @Override // p456rx.AbstractC11244i
            public void onError(Throwable th) {
                a.this.m40277d(this, th);
            }
        }

        /* compiled from: OnSubscribeFlatMapSingle.java */
        /* renamed from: rx.n.a.q$a$b */
        final class b extends AtomicLong implements InterfaceC11242g, InterfaceC11246k {
            b() {
            }

            /* renamed from: a */
            void m40279a(long j2) {
                C11261a.m40163c(this, j2);
            }

            @Override // p456rx.InterfaceC11246k
            public boolean isUnsubscribed() {
                return a.this.f42505q;
            }

            @Override // p456rx.InterfaceC11242g
            public void request(long j2) {
                if (j2 > 0) {
                    C11261a.m40162b(this, j2);
                    a.this.m40276c();
                }
            }

            @Override // p456rx.InterfaceC11246k
            public void unsubscribe() {
                a.this.f42505q = true;
                a.this.unsubscribe();
                if (a.this.f42498j.getAndIncrement() == 0) {
                    a.this.f42502n.clear();
                }
            }
        }

        a(AbstractC11245j<? super R> abstractC11245j, InterfaceC11256e<? super T, ? extends Single<? extends R>> interfaceC11256e, boolean z, int i2) {
            this.f42494f = abstractC11245j;
            this.f42495g = interfaceC11256e;
            this.f42496h = z;
            this.f42497i = i2;
            if (C11398z.m40548b()) {
                this.f42502n = new C11381i();
            } else {
                this.f42502n = new C11368d();
            }
            request(i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE);
        }

        /* renamed from: c */
        void m40276c() {
            if (this.f42498j.getAndIncrement() != 0) {
                return;
            }
            AbstractC11245j<? super R> abstractC11245j = this.f42494f;
            Queue<Object> queue = this.f42502n;
            boolean z = this.f42496h;
            AtomicInteger atomicInteger = this.f42499k;
            int iAddAndGet = 1;
            do {
                long j2 = this.f42503o.get();
                long j3 = 0;
                while (j3 != j2) {
                    if (this.f42505q) {
                        queue.clear();
                        return;
                    }
                    boolean z2 = this.f42504p;
                    if (!z && z2 && this.f42501m.get() != null) {
                        queue.clear();
                        abstractC11245j.onError(EnumC11356e.m40423q(this.f42501m));
                        return;
                    }
                    Object objPoll = queue.poll();
                    boolean z3 = objPoll == null;
                    if (z2 && atomicInteger.get() == 0 && z3) {
                        if (this.f42501m.get() != null) {
                            abstractC11245j.onError(EnumC11356e.m40423q(this.f42501m));
                            return;
                        } else {
                            abstractC11245j.onCompleted();
                            return;
                        }
                    }
                    if (z3) {
                        break;
                    }
                    abstractC11245j.onNext((Object) C11282h.m40219e(objPoll));
                    j3++;
                }
                if (j3 == j2) {
                    if (this.f42505q) {
                        queue.clear();
                        return;
                    }
                    if (this.f42504p) {
                        if (z) {
                            if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                if (this.f42501m.get() != null) {
                                    abstractC11245j.onError(EnumC11356e.m40423q(this.f42501m));
                                    return;
                                } else {
                                    abstractC11245j.onCompleted();
                                    return;
                                }
                            }
                        } else if (this.f42501m.get() != null) {
                            queue.clear();
                            abstractC11245j.onError(EnumC11356e.m40423q(this.f42501m));
                            return;
                        } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                            abstractC11245j.onCompleted();
                            return;
                        }
                    }
                }
                if (j3 != 0) {
                    this.f42503o.m40279a(j3);
                    if (!this.f42504p && this.f42497i != Integer.MAX_VALUE) {
                        request(j3);
                    }
                }
                iAddAndGet = this.f42498j.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* renamed from: d */
        void m40277d(a<T, R>.C11601a c11601a, Throwable th) {
            if (this.f42496h) {
                EnumC11356e.m40421g(this.f42501m, th);
                this.f42500l.m40670d(c11601a);
                if (!this.f42504p && this.f42497i != Integer.MAX_VALUE) {
                    request(1L);
                }
            } else {
                this.f42500l.unsubscribe();
                unsubscribe();
                if (!this.f42501m.compareAndSet(null, th)) {
                    C11409c.m40578j(th);
                    return;
                }
                this.f42504p = true;
            }
            this.f42499k.decrementAndGet();
            m40276c();
        }

        /* renamed from: e */
        void m40278e(a<T, R>.C11601a c11601a, R r) {
            this.f42502n.offer(C11282h.m40221g(r));
            this.f42500l.m40670d(c11601a);
            this.f42499k.decrementAndGet();
            m40276c();
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42504p = true;
            m40276c();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42496h) {
                EnumC11356e.m40421g(this.f42501m, th);
            } else {
                this.f42500l.unsubscribe();
                if (!this.f42501m.compareAndSet(null, th)) {
                    C11409c.m40578j(th);
                    return;
                }
            }
            this.f42504p = true;
            m40276c();
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            try {
                Single<? extends R> singleCall = this.f42495g.call(t);
                if (singleCall == null) {
                    throw new NullPointerException("The mapper returned a null Single");
                }
                C11601a c11601a = new C11601a();
                this.f42500l.m40667a(c11601a);
                this.f42499k.incrementAndGet();
                singleCall.m39928t(c11601a);
            } catch (Throwable th) {
                C11240a.m40140e(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public C11309q(C11234e<T> c11234e, InterfaceC11256e<? super T, ? extends Single<? extends R>> interfaceC11256e, boolean z, int i2) {
        if (interfaceC11256e == null) {
            throw new NullPointerException("mapper is null");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i2);
        }
        this.f42490f = c11234e;
        this.f42491g = interfaceC11256e;
        this.f42492h = z;
        this.f42493i = i2;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super R> abstractC11245j) {
        a aVar = new a(abstractC11245j, this.f42491g, this.f42492h, this.f42493i);
        abstractC11245j.add(aVar.f42500l);
        abstractC11245j.add(aVar.f42503o);
        abstractC11245j.setProducer(aVar.f42503o);
        this.f42490f.m40089c1(aVar);
    }
}
