package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11245j;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.InterfaceC11232c;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p461n.p466e.EnumC11356e;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11426b;

/* compiled from: OnSubscribeFlatMapCompletable.java */
/* renamed from: rx.n.a.p */
/* loaded from: classes3.dex */
public final class C11306p<T> implements C11234e.a<T> {

    /* renamed from: f */
    final C11234e<T> f42455f;

    /* renamed from: g */
    final InterfaceC11256e<? super T, ? extends C11231b> f42456g;

    /* renamed from: h */
    final boolean f42457h;

    /* renamed from: i */
    final int f42458i;

    /* compiled from: OnSubscribeFlatMapCompletable.java */
    /* renamed from: rx.n.a.p$a */
    static final class a<T> extends AbstractC11245j<T> {

        /* renamed from: f */
        final AbstractC11245j<? super T> f42459f;

        /* renamed from: g */
        final InterfaceC11256e<? super T, ? extends C11231b> f42460g;

        /* renamed from: h */
        final boolean f42461h;

        /* renamed from: i */
        final int f42462i;

        /* renamed from: j */
        final AtomicInteger f42463j = new AtomicInteger(1);

        /* renamed from: l */
        final AtomicReference<Throwable> f42465l = new AtomicReference<>();

        /* renamed from: k */
        final C11426b f42464k = new C11426b();

        /* compiled from: OnSubscribeFlatMapCompletable.java */
        /* renamed from: rx.n.a.p$a$a, reason: collision with other inner class name */
        final class C11600a extends AtomicReference<InterfaceC11246k> implements InterfaceC11232c, InterfaceC11246k {
            C11600a() {
            }

            @Override // p456rx.InterfaceC11232c
            /* renamed from: a */
            public void mo29114a(InterfaceC11246k interfaceC11246k) {
                if (compareAndSet(null, interfaceC11246k)) {
                    return;
                }
                interfaceC11246k.unsubscribe();
                if (get() != this) {
                    C11409c.m40578j(new IllegalStateException("Subscription already set!"));
                }
            }

            @Override // p456rx.InterfaceC11246k
            public boolean isUnsubscribed() {
                return get() == this;
            }

            @Override // p456rx.InterfaceC11232c
            public void onCompleted() {
                a.this.m40267d(this);
            }

            @Override // p456rx.InterfaceC11232c
            public void onError(Throwable th) {
                a.this.m40268e(this, th);
            }

            @Override // p456rx.InterfaceC11246k
            public void unsubscribe() {
                InterfaceC11246k andSet = getAndSet(this);
                if (andSet == null || andSet == this) {
                    return;
                }
                andSet.unsubscribe();
            }
        }

        a(AbstractC11245j<? super T> abstractC11245j, InterfaceC11256e<? super T, ? extends C11231b> interfaceC11256e, boolean z, int i2) {
            this.f42459f = abstractC11245j;
            this.f42460g = interfaceC11256e;
            this.f42461h = z;
            this.f42462i = i2;
            request(i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE);
        }

        /* renamed from: c */
        boolean m40266c() {
            if (this.f42463j.decrementAndGet() != 0) {
                return false;
            }
            Throwable thM40423q = EnumC11356e.m40423q(this.f42465l);
            if (thM40423q != null) {
                this.f42459f.onError(thM40423q);
                return true;
            }
            this.f42459f.onCompleted();
            return true;
        }

        /* renamed from: d */
        public void m40267d(a<T>.C11600a c11600a) {
            this.f42464k.m40670d(c11600a);
            if (m40266c() || this.f42462i == Integer.MAX_VALUE) {
                return;
            }
            request(1L);
        }

        /* renamed from: e */
        public void m40268e(a<T>.C11600a c11600a, Throwable th) {
            this.f42464k.m40670d(c11600a);
            if (this.f42461h) {
                EnumC11356e.m40421g(this.f42465l, th);
                if (m40266c() || this.f42462i == Integer.MAX_VALUE) {
                    return;
                }
                request(1L);
                return;
            }
            this.f42464k.unsubscribe();
            unsubscribe();
            if (this.f42465l.compareAndSet(null, th)) {
                this.f42459f.onError(EnumC11356e.m40423q(this.f42465l));
            } else {
                C11409c.m40578j(th);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            m40266c();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42461h) {
                EnumC11356e.m40421g(this.f42465l, th);
                onCompleted();
                return;
            }
            this.f42464k.unsubscribe();
            if (this.f42465l.compareAndSet(null, th)) {
                this.f42459f.onError(EnumC11356e.m40423q(this.f42465l));
            } else {
                C11409c.m40578j(th);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            try {
                C11231b c11231bCall = this.f42460g.call(t);
                if (c11231bCall == null) {
                    throw new NullPointerException("The mapper returned a null Completable");
                }
                C11600a c11600a = new C11600a();
                this.f42464k.m40667a(c11600a);
                this.f42463j.getAndIncrement();
                c11231bCall.m39971P(c11600a);
            } catch (Throwable th) {
                C11240a.m40140e(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public C11306p(C11234e<T> c11234e, InterfaceC11256e<? super T, ? extends C11231b> interfaceC11256e, boolean z, int i2) {
        if (interfaceC11256e == null) {
            throw new NullPointerException("mapper is null");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i2);
        }
        this.f42455f = c11234e;
        this.f42456g = interfaceC11256e;
        this.f42457h = z;
        this.f42458i = i2;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        a aVar = new a(abstractC11245j, this.f42456g, this.f42457h, this.f42458i);
        abstractC11245j.add(aVar);
        abstractC11245j.add(aVar.f42464k);
        this.f42455f.m40089c1(aVar);
    }
}
