package p456rx.p461n.p462a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p461n.p463b.C11333a;
import p456rx.p461n.p466e.C11361j;
import p456rx.p461n.p466e.EnumC11356e;
import p456rx.p461n.p466e.p467n.C11369e;
import p456rx.p461n.p466e.p468o.C11391s;
import p456rx.p461n.p466e.p468o.C11398z;
import p456rx.p470p.C11405e;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11428d;

/* compiled from: OnSubscribeConcatMap.java */
/* renamed from: rx.n.a.k */
/* loaded from: classes3.dex */
public final class C11291k<T, R> implements C11234e.a<R> {

    /* renamed from: f */
    final C11234e<? extends T> f42357f;

    /* renamed from: g */
    final InterfaceC11256e<? super T, ? extends C11234e<? extends R>> f42358g;

    /* renamed from: h */
    final int f42359h;

    /* renamed from: i */
    final int f42360i;

    /* compiled from: OnSubscribeConcatMap.java */
    /* renamed from: rx.n.a.k$a */
    class a implements InterfaceC11242g {

        /* renamed from: f */
        final /* synthetic */ d f42361f;

        a(d dVar) {
            this.f42361f = dVar;
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            this.f42361f.m40245i(j2);
        }
    }

    /* compiled from: OnSubscribeConcatMap.java */
    /* renamed from: rx.n.a.k$b */
    static final class b<T, R> implements InterfaceC11242g {

        /* renamed from: f */
        final R f42363f;

        /* renamed from: g */
        final d<T, R> f42364g;

        /* renamed from: h */
        boolean f42365h;

        public b(R r, d<T, R> dVar) {
            this.f42363f = r;
            this.f42364g = dVar;
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            if (this.f42365h || j2 <= 0) {
                return;
            }
            this.f42365h = true;
            d<T, R> dVar = this.f42364g;
            dVar.m40243g(this.f42363f);
            dVar.m40241e(1L);
        }
    }

    /* compiled from: OnSubscribeConcatMap.java */
    /* renamed from: rx.n.a.k$c */
    static final class c<T, R> extends AbstractC11245j<R> {

        /* renamed from: f */
        final d<T, R> f42366f;

        /* renamed from: g */
        long f42367g;

        public c(d<T, R> dVar) {
            this.f42366f = dVar;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42366f.m40241e(this.f42367g);
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42366f.m40242f(th, this.f42367g);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(R r) {
            this.f42367g++;
            this.f42366f.m40243g(r);
        }

        @Override // p456rx.AbstractC11245j
        public void setProducer(InterfaceC11242g interfaceC11242g) {
            this.f42366f.f42371i.m40375c(interfaceC11242g);
        }
    }

    /* compiled from: OnSubscribeConcatMap.java */
    /* renamed from: rx.n.a.k$d */
    static final class d<T, R> extends AbstractC11245j<T> {

        /* renamed from: f */
        final AbstractC11245j<? super R> f42368f;

        /* renamed from: g */
        final InterfaceC11256e<? super T, ? extends C11234e<? extends R>> f42369g;

        /* renamed from: h */
        final int f42370h;

        /* renamed from: j */
        final Queue<Object> f42372j;

        /* renamed from: m */
        final C11428d f42375m;

        /* renamed from: n */
        volatile boolean f42376n;

        /* renamed from: o */
        volatile boolean f42377o;

        /* renamed from: i */
        final C11333a f42371i = new C11333a();

        /* renamed from: k */
        final AtomicInteger f42373k = new AtomicInteger();

        /* renamed from: l */
        final AtomicReference<Throwable> f42374l = new AtomicReference<>();

        public d(AbstractC11245j<? super R> abstractC11245j, InterfaceC11256e<? super T, ? extends C11234e<? extends R>> interfaceC11256e, int i2, int i3) {
            this.f42368f = abstractC11245j;
            this.f42369g = interfaceC11256e;
            this.f42370h = i3;
            this.f42372j = C11398z.m40548b() ? new C11391s<>(i2) : new C11369e<>(i2);
            this.f42375m = new C11428d();
            request(i2);
        }

        /* renamed from: c */
        void m40239c() {
            if (this.f42373k.getAndIncrement() != 0) {
                return;
            }
            int i2 = this.f42370h;
            while (!this.f42368f.isUnsubscribed()) {
                if (!this.f42377o) {
                    if (i2 == 1 && this.f42374l.get() != null) {
                        Throwable thM40423q = EnumC11356e.m40423q(this.f42374l);
                        if (EnumC11356e.m40422k(thM40423q)) {
                            return;
                        }
                        this.f42368f.onError(thM40423q);
                        return;
                    }
                    boolean z = this.f42376n;
                    Object objPoll = this.f42372j.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable thM40423q2 = EnumC11356e.m40423q(this.f42374l);
                        if (thM40423q2 == null) {
                            this.f42368f.onCompleted();
                            return;
                        } else {
                            if (EnumC11356e.m40422k(thM40423q2)) {
                                return;
                            }
                            this.f42368f.onError(thM40423q2);
                            return;
                        }
                    }
                    if (!z2) {
                        try {
                            C11234e<? extends R> c11234eCall = this.f42369g.call((Object) C11282h.m40219e(objPoll));
                            if (c11234eCall == null) {
                                m40240d(new NullPointerException("The source returned by the mapper was null"));
                                return;
                            }
                            if (c11234eCall != C11234e.m40016B()) {
                                if (c11234eCall instanceof C11361j) {
                                    this.f42377o = true;
                                    this.f42371i.m40375c(new b(((C11361j) c11234eCall).m40448h1(), this));
                                } else {
                                    c cVar = new c(this);
                                    this.f42375m.m40673b(cVar);
                                    if (cVar.isUnsubscribed()) {
                                        return;
                                    }
                                    this.f42377o = true;
                                    c11234eCall.m40089c1(cVar);
                                }
                                request(1L);
                            } else {
                                request(1L);
                            }
                        } catch (Throwable th) {
                            C11240a.m40140e(th);
                            m40240d(th);
                            return;
                        }
                    }
                }
                if (this.f42373k.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        /* renamed from: d */
        void m40240d(Throwable th) {
            unsubscribe();
            if (!EnumC11356e.m40421g(this.f42374l, th)) {
                m40244h(th);
                return;
            }
            Throwable thM40423q = EnumC11356e.m40423q(this.f42374l);
            if (EnumC11356e.m40422k(thM40423q)) {
                return;
            }
            this.f42368f.onError(thM40423q);
        }

        /* renamed from: e */
        void m40241e(long j2) {
            if (j2 != 0) {
                this.f42371i.m40374b(j2);
            }
            this.f42377o = false;
            m40239c();
        }

        /* renamed from: f */
        void m40242f(Throwable th, long j2) {
            if (!EnumC11356e.m40421g(this.f42374l, th)) {
                m40244h(th);
                return;
            }
            if (this.f42370h == 0) {
                Throwable thM40423q = EnumC11356e.m40423q(this.f42374l);
                if (!EnumC11356e.m40422k(thM40423q)) {
                    this.f42368f.onError(thM40423q);
                }
                unsubscribe();
                return;
            }
            if (j2 != 0) {
                this.f42371i.m40374b(j2);
            }
            this.f42377o = false;
            m40239c();
        }

        /* renamed from: g */
        void m40243g(R r) {
            this.f42368f.onNext(r);
        }

        /* renamed from: h */
        void m40244h(Throwable th) {
            C11409c.m40578j(th);
        }

        /* renamed from: i */
        void m40245i(long j2) {
            if (j2 > 0) {
                this.f42371i.request(j2);
            } else {
                if (j2 >= 0) {
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j2);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42376n = true;
            m40239c();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (!EnumC11356e.m40421g(this.f42374l, th)) {
                m40244h(th);
                return;
            }
            this.f42376n = true;
            if (this.f42370h != 0) {
                m40239c();
                return;
            }
            Throwable thM40423q = EnumC11356e.m40423q(this.f42374l);
            if (!EnumC11356e.m40422k(thM40423q)) {
                this.f42368f.onError(thM40423q);
            }
            this.f42375m.unsubscribe();
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (this.f42372j.offer(C11282h.m40221g(t))) {
                m40239c();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }
    }

    public C11291k(C11234e<? extends T> c11234e, InterfaceC11256e<? super T, ? extends C11234e<? extends R>> interfaceC11256e, int i2, int i3) {
        this.f42357f = c11234e;
        this.f42358g = interfaceC11256e;
        this.f42359h = i2;
        this.f42360i = i3;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super R> abstractC11245j) {
        d dVar = new d(this.f42360i == 0 ? new C11405e<>(abstractC11245j) : abstractC11245j, this.f42358g, this.f42359h, this.f42360i);
        abstractC11245j.add(dVar);
        abstractC11245j.add(dVar.f42375m);
        abstractC11245j.setProducer(new a(dVar));
        if (abstractC11245j.isUnsubscribed()) {
            return;
        }
        this.f42357f.m40089c1(dVar);
    }
}
