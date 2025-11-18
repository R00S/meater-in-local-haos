package p456rx.p461n.p462a;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p461n.p462a.C11321u;
import p456rx.p461n.p466e.C11359h;
import p456rx.p461n.p466e.C11361j;
import p456rx.p461n.p466e.EnumC11356e;
import p456rx.p461n.p466e.p467n.C11369e;
import p456rx.p461n.p466e.p467n.C11371g;
import p456rx.p461n.p466e.p468o.C11391s;
import p456rx.p461n.p466e.p468o.C11398z;
import p456rx.p471q.C11409c;

/* compiled from: OnSubscribeFlattenIterable.java */
/* renamed from: rx.n.a.r */
/* loaded from: classes3.dex */
public final class C11312r<T, R> implements C11234e.a<R> {

    /* renamed from: f */
    final C11234e<? extends T> f42541f;

    /* renamed from: g */
    final InterfaceC11256e<? super T, ? extends Iterable<? extends R>> f42542g;

    /* renamed from: h */
    final int f42543h;

    /* compiled from: OnSubscribeFlattenIterable.java */
    /* renamed from: rx.n.a.r$a */
    class a implements InterfaceC11242g {

        /* renamed from: f */
        final /* synthetic */ b f42544f;

        a(b bVar) {
            this.f42544f = bVar;
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            this.f42544f.m40307e(j2);
        }
    }

    /* compiled from: OnSubscribeFlattenIterable.java */
    /* renamed from: rx.n.a.r$b */
    static final class b<T, R> extends AbstractC11245j<T> {

        /* renamed from: f */
        final AbstractC11245j<? super R> f42546f;

        /* renamed from: g */
        final InterfaceC11256e<? super T, ? extends Iterable<? extends R>> f42547g;

        /* renamed from: h */
        final long f42548h;

        /* renamed from: i */
        final Queue<Object> f42549i;

        /* renamed from: m */
        volatile boolean f42553m;

        /* renamed from: n */
        long f42554n;

        /* renamed from: o */
        Iterator<? extends R> f42555o;

        /* renamed from: j */
        final AtomicReference<Throwable> f42550j = new AtomicReference<>();

        /* renamed from: l */
        final AtomicInteger f42552l = new AtomicInteger();

        /* renamed from: k */
        final AtomicLong f42551k = new AtomicLong();

        public b(AbstractC11245j<? super R> abstractC11245j, InterfaceC11256e<? super T, ? extends Iterable<? extends R>> interfaceC11256e, int i2) {
            this.f42546f = abstractC11245j;
            this.f42547g = interfaceC11256e;
            if (i2 == Integer.MAX_VALUE) {
                this.f42548h = Long.MAX_VALUE;
                this.f42549i = new C11371g(C11359h.f42884f);
            } else {
                this.f42548h = i2 - (i2 >> 2);
                if (C11398z.m40548b()) {
                    this.f42549i = new C11391s(i2);
                } else {
                    this.f42549i = new C11369e(i2);
                }
            }
            request(i2);
        }

        /* renamed from: c */
        boolean m40305c(boolean z, boolean z2, AbstractC11245j<?> abstractC11245j, Queue<?> queue) {
            if (abstractC11245j.isUnsubscribed()) {
                queue.clear();
                this.f42555o = null;
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f42550j.get() == null) {
                if (!z2) {
                    return false;
                }
                abstractC11245j.onCompleted();
                return true;
            }
            Throwable thM40423q = EnumC11356e.m40423q(this.f42550j);
            unsubscribe();
            queue.clear();
            this.f42555o = null;
            abstractC11245j.onError(thM40423q);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m40306d() {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p462a.C11312r.b.m40306d():void");
        }

        /* renamed from: e */
        void m40307e(long j2) {
            if (j2 > 0) {
                C11261a.m40162b(this.f42551k, j2);
                m40306d();
            } else {
                if (j2 >= 0) {
                    return;
                }
                throw new IllegalStateException("n >= 0 required but it was " + j2);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42553m = true;
            m40306d();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (!EnumC11356e.m40421g(this.f42550j, th)) {
                C11409c.m40578j(th);
            } else {
                this.f42553m = true;
                m40306d();
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (this.f42549i.offer(C11282h.m40221g(t))) {
                m40306d();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }
    }

    /* compiled from: OnSubscribeFlattenIterable.java */
    /* renamed from: rx.n.a.r$c */
    static final class c<T, R> implements C11234e.a<R> {

        /* renamed from: f */
        final T f42556f;

        /* renamed from: g */
        final InterfaceC11256e<? super T, ? extends Iterable<? extends R>> f42557g;

        public c(T t, InterfaceC11256e<? super T, ? extends Iterable<? extends R>> interfaceC11256e) {
            this.f42556f = t;
            this.f42557g = interfaceC11256e;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11245j<? super R> abstractC11245j) {
            try {
                Iterator<? extends R> it = this.f42557g.call(this.f42556f).iterator();
                if (it.hasNext()) {
                    abstractC11245j.setProducer(new C11321u.a(abstractC11245j, it));
                } else {
                    abstractC11245j.onCompleted();
                }
            } catch (Throwable th) {
                C11240a.m40142g(th, abstractC11245j, this.f42556f);
            }
        }
    }

    protected C11312r(C11234e<? extends T> c11234e, InterfaceC11256e<? super T, ? extends Iterable<? extends R>> interfaceC11256e, int i2) {
        this.f42541f = c11234e;
        this.f42542g = interfaceC11256e;
        this.f42543h = i2;
    }

    /* renamed from: b */
    public static <T, R> C11234e<R> m40303b(C11234e<? extends T> c11234e, InterfaceC11256e<? super T, ? extends Iterable<? extends R>> interfaceC11256e, int i2) {
        return c11234e instanceof C11361j ? C11234e.m40035b1(new c(((C11361j) c11234e).m40448h1(), interfaceC11256e)) : C11234e.m40035b1(new C11312r(c11234e, interfaceC11256e, i2));
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super R> abstractC11245j) {
        b bVar = new b(abstractC11245j, this.f42542g, this.f42543h);
        abstractC11245j.add(bVar);
        abstractC11245j.setProducer(new a(bVar));
        this.f42541f.m40089c1(bVar);
    }
}
