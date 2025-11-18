package p456rx;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p456rx.AbstractC11243h;
import p456rx.exceptions.C11240a;
import p456rx.p460m.C11254c;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p460m.InterfaceC11258g;
import p456rx.p460m.InterfaceC11259h;
import p456rx.p460m.InterfaceCallableC11255d;
import p456rx.p461n.p462a.C11267c;
import p456rx.p461n.p462a.C11284h1;
import p456rx.p461n.p462a.C11287i1;
import p456rx.p461n.p462a.C11290j1;
import p456rx.p461n.p462a.C11299m1;
import p456rx.p461n.p462a.C11302n1;
import p456rx.p461n.p462a.C11305o1;
import p456rx.p461n.p462a.C11308p1;
import p456rx.p461n.p462a.C11311q1;
import p456rx.p461n.p462a.C11314r1;
import p456rx.p461n.p462a.C11317s1;
import p456rx.p461n.p462a.C11320t1;
import p456rx.p461n.p466e.C11362k;
import p456rx.p461n.p466e.C11364m;
import p456rx.p471q.C11409c;
import p456rx.p472r.C11416a;
import p456rx.p474t.C11429e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class Single<T> {

    /* renamed from: a */
    final InterfaceC11229j<T> f42014a;

    /* renamed from: rx.Single$a */
    /* loaded from: classes3.dex */
    class C11220a extends AbstractC11244i<T> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC11253b f42015g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC11253b f42016h;

        C11220a(InterfaceC11253b interfaceC11253b, InterfaceC11253b interfaceC11253b2) {
            this.f42015g = interfaceC11253b;
            this.f42016h = interfaceC11253b2;
        }

        @Override // p456rx.AbstractC11244i
        /* renamed from: c */
        public final void mo29130c(T t) {
            try {
                this.f42016h.call(t);
            } finally {
                unsubscribe();
            }
        }

        @Override // p456rx.AbstractC11244i
        public final void onError(Throwable th) {
            try {
                this.f42015g.call(th);
            } finally {
                unsubscribe();
            }
        }
    }

    /* renamed from: rx.Single$b */
    /* loaded from: classes3.dex */
    class C11221b implements InterfaceC11229j<T> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11243h f42018f;

        /* renamed from: rx.Single$b$a */
        class a implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ AbstractC11244i f42020f;

            /* renamed from: g */
            final /* synthetic */ AbstractC11243h.a f42021g;

            /* renamed from: rx.Single$b$a$a, reason: collision with other inner class name */
            class C11590a extends AbstractC11244i<T> {
                C11590a() {
                }

                @Override // p456rx.AbstractC11244i
                /* renamed from: c */
                public void mo29130c(T t) {
                    try {
                        a.this.f42020f.mo29130c(t);
                    } finally {
                        a.this.f42021g.unsubscribe();
                    }
                }

                @Override // p456rx.AbstractC11244i
                public void onError(Throwable th) {
                    try {
                        a.this.f42020f.onError(th);
                    } finally {
                        a.this.f42021g.unsubscribe();
                    }
                }
            }

            a(AbstractC11244i abstractC11244i, AbstractC11243h.a aVar) {
                this.f42020f = abstractC11244i;
                this.f42021g = aVar;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                C11590a c11590a = new C11590a();
                this.f42020f.m40149b(c11590a);
                Single.this.m39928t(c11590a);
            }
        }

        C11221b(AbstractC11243h abstractC11243h) {
            this.f42018f = abstractC11243h;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11244i<? super T> abstractC11244i) {
            AbstractC11243h.a aVarCreateWorker = this.f42018f.createWorker();
            abstractC11244i.m40149b(aVarCreateWorker);
            aVarCreateWorker.mo40146c(new a(abstractC11244i, aVarCreateWorker));
        }
    }

    /* renamed from: rx.Single$c */
    /* loaded from: classes3.dex */
    class C11222c implements InterfaceCallableC11255d<Single<T>> {
        C11222c() {
        }

        @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Single<T> call() {
            return Single.m39911h(new TimeoutException());
        }
    }

    /* renamed from: rx.Single$d */
    /* loaded from: classes3.dex */
    class C11223d implements InterfaceC11253b<Throwable> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11253b f42025f;

        C11223d(InterfaceC11253b interfaceC11253b) {
            this.f42025f = interfaceC11253b;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            this.f42025f.call(th);
        }
    }

    /* renamed from: rx.Single$e */
    /* loaded from: classes3.dex */
    static class C11224e implements InterfaceC11229j<T> {

        /* renamed from: f */
        final /* synthetic */ Callable f42027f;

        C11224e(Callable callable) {
            this.f42027f = callable;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11244i<? super T> abstractC11244i) {
            try {
                ((Single) this.f42027f.call()).m39928t(abstractC11244i);
            } catch (Throwable th) {
                C11240a.m40140e(th);
                abstractC11244i.onError(th);
            }
        }
    }

    /* renamed from: rx.Single$f */
    /* loaded from: classes3.dex */
    static class C11225f implements InterfaceC11229j<T> {

        /* renamed from: f */
        final /* synthetic */ Throwable f42028f;

        C11225f(Throwable th) {
            this.f42028f = th;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11244i<? super T> abstractC11244i) {
            abstractC11244i.onError(this.f42028f);
        }
    }

    /* renamed from: rx.Single$g */
    /* loaded from: classes3.dex */
    static class C11226g implements InterfaceC11229j<T> {

        /* renamed from: rx.Single$g$a */
        class a extends AbstractC11244i<Single<? extends T>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC11244i f42030g;

            a(AbstractC11244i abstractC11244i) {
                this.f42030g = abstractC11244i;
            }

            @Override // p456rx.AbstractC11244i
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo29130c(Single<? extends T> single) {
                single.m39928t(this.f42030g);
            }

            @Override // p456rx.AbstractC11244i
            public void onError(Throwable th) {
                this.f42030g.onError(th);
            }
        }

        C11226g() {
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11244i<? super T> abstractC11244i) {
            a aVar = new a(abstractC11244i);
            abstractC11244i.m40149b(aVar);
            Single.this.m39928t(aVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: rx.Single$h */
    /* loaded from: classes3.dex */
    static class C11227h<R> implements InterfaceC11259h<R> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11257f f42032a;

        C11227h(InterfaceC11257f interfaceC11257f) {
            this.f42032a = interfaceC11257f;
        }

        @Override // p456rx.p460m.InterfaceC11259h
        public R call(Object... objArr) {
            return (R) this.f42032a.mo6865a(objArr[0], objArr[1]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: rx.Single$i */
    /* loaded from: classes3.dex */
    static class C11228i<R> implements InterfaceC11259h<R> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11258g f42033a;

        C11228i(InterfaceC11258g interfaceC11258g) {
            this.f42033a = interfaceC11258g;
        }

        @Override // p456rx.p460m.InterfaceC11259h
        public R call(Object... objArr) {
            return (R) this.f42033a.mo6864a(objArr[0], objArr[1], objArr[2]);
        }
    }

    /* renamed from: rx.Single$j */
    /* loaded from: classes3.dex */
    public interface InterfaceC11229j<T> extends InterfaceC11253b<AbstractC11244i<? super T>> {
    }

    protected Single(InterfaceC11229j<T> interfaceC11229j) {
        this.f42014a = C11409c.m40577i(interfaceC11229j);
    }

    /* renamed from: B */
    public static <T1, T2, T3, R> Single<R> m39906B(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, InterfaceC11258g<? super T1, ? super T2, ? super T3, ? extends R> interfaceC11258g) {
        return C11314r1.m40313a(new Single[]{single, single2, single3}, new C11228i(interfaceC11258g));
    }

    /* renamed from: C */
    public static <T1, T2, R> Single<R> m39907C(Single<? extends T1> single, Single<? extends T2> single2, InterfaceC11257f<? super T1, ? super T2, ? extends R> interfaceC11257f) {
        return C11314r1.m40313a(new Single[]{single, single2}, new C11227h(interfaceC11257f));
    }

    /* renamed from: a */
    private static <T> C11234e<T> m39908a(Single<T> single) {
        return C11234e.m40035b1(new C11320t1(single.f42014a));
    }

    /* renamed from: b */
    public static <T> Single<T> m39909b(InterfaceC11229j<T> interfaceC11229j) {
        return new Single<>(interfaceC11229j);
    }

    /* renamed from: c */
    public static <T> Single<T> m39910c(Callable<Single<T>> callable) {
        return m39909b(new C11224e(callable));
    }

    /* renamed from: h */
    public static <T> Single<T> m39911h(Throwable th) {
        return m39909b(new C11225f(th));
    }

    /* renamed from: l */
    public static <T> Single<T> m39912l(Callable<? extends T> callable) {
        return m39909b(new C11290j1(callable));
    }

    /* renamed from: m */
    public static <T> Single<T> m39913m(T t) {
        return C11362k.m40456D(t);
    }

    /* renamed from: o */
    public static <T> Single<T> m39914o(Single<? extends Single<? extends T>> single) {
        return single instanceof C11362k ? ((C11362k) single).m40457E(C11364m.m40467b()) : m39909b(new C11226g());
    }

    /* renamed from: A */
    public final C11234e<T> m39915A() {
        return m39908a(this);
    }

    /* renamed from: d */
    public final Single<T> m39916d(C11234e<?> c11234e) {
        c11234e.getClass();
        return m39909b(new C11305o1(this, c11234e));
    }

    /* renamed from: e */
    public final Single<T> m39917e(InterfaceC11253b<Throwable> interfaceC11253b) {
        if (interfaceC11253b != null) {
            return m39909b(new C11284h1(this, C11254c.m40157a(), new C11223d(interfaceC11253b)));
        }
        throw new IllegalArgumentException("onError is null");
    }

    /* renamed from: f */
    public final Single<T> m39918f(InterfaceC11252a interfaceC11252a) {
        return m39909b(new C11287i1(this.f42014a, interfaceC11252a));
    }

    /* renamed from: g */
    public final Single<T> m39919g(InterfaceC11253b<? super T> interfaceC11253b) {
        if (interfaceC11253b != null) {
            return m39909b(new C11284h1(this, interfaceC11253b, C11254c.m40157a()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final <R> Single<R> m39920i(InterfaceC11256e<? super T, ? extends Single<? extends R>> interfaceC11256e) {
        return this instanceof C11362k ? ((C11362k) this).m40457E(interfaceC11256e) : m39914o(m39923n(interfaceC11256e));
    }

    /* renamed from: j */
    public final C11231b m39921j(InterfaceC11256e<? super T, ? extends C11231b> interfaceC11256e) {
        return C11231b.m39948h(new C11267c(this, interfaceC11256e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final <R> C11234e<R> m39922k(InterfaceC11256e<? super T, ? extends C11234e<? extends R>> interfaceC11256e) {
        return C11234e.m40032Z(m39908a(m39923n(interfaceC11256e)));
    }

    /* renamed from: n */
    public final <R> Single<R> m39923n(InterfaceC11256e<? super T, ? extends R> interfaceC11256e) {
        return m39909b(new C11308p1(this, interfaceC11256e));
    }

    /* renamed from: p */
    public final Single<T> m39924p(AbstractC11243h abstractC11243h) {
        if (this instanceof C11362k) {
            return ((C11362k) this).m40458F(abstractC11243h);
        }
        if (abstractC11243h != null) {
            return m39909b(new C11299m1(this.f42014a, abstractC11243h));
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: q */
    public final Single<T> m39925q(InterfaceC11256e<Throwable, ? extends Single<? extends T>> interfaceC11256e) {
        return new Single<>(C11311q1.m40301b(this, interfaceC11256e));
    }

    /* renamed from: r */
    public final Single<T> m39926r(InterfaceC11256e<Throwable, ? extends T> interfaceC11256e) {
        return m39909b(new C11302n1(this.f42014a, interfaceC11256e));
    }

    /* renamed from: s */
    public final Single<T> m39927s(InterfaceC11256e<C11234e<? extends Throwable>, ? extends C11234e<?>> interfaceC11256e) {
        return m39915A().m40112t0(interfaceC11256e).m40085Z0();
    }

    /* renamed from: t */
    public final InterfaceC11246k m39928t(AbstractC11244i<? super T> abstractC11244i) {
        if (abstractC11244i == null) {
            throw new IllegalArgumentException("te is null");
        }
        try {
            C11409c.m40588t(this, this.f42014a).call(abstractC11244i);
            return C11409c.m40587s(abstractC11244i);
        } catch (Throwable th) {
            C11240a.m40140e(th);
            try {
                abstractC11244i.onError(C11409c.m40586r(th));
                return C11429e.m40675b();
            } catch (Throwable th2) {
                C11240a.m40140e(th2);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                C11409c.m40586r(runtimeException);
                throw runtimeException;
            }
        }
    }

    /* renamed from: u */
    public final InterfaceC11246k m39929u(InterfaceC11253b<? super T> interfaceC11253b, InterfaceC11253b<Throwable> interfaceC11253b2) {
        if (interfaceC11253b == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        }
        if (interfaceC11253b2 != null) {
            return m39928t(new C11220a(interfaceC11253b2, interfaceC11253b));
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    /* renamed from: v */
    public final Single<T> m39930v(AbstractC11243h abstractC11243h) {
        return this instanceof C11362k ? ((C11362k) this).m40458F(abstractC11243h) : m39909b(new C11221b(abstractC11243h));
    }

    /* renamed from: w */
    public final Single<T> m39931w(long j2, TimeUnit timeUnit) {
        return m39932x(j2, timeUnit, null, Schedulers.computation());
    }

    /* renamed from: x */
    public final Single<T> m39932x(long j2, TimeUnit timeUnit, Single<? extends T> single, AbstractC11243h abstractC11243h) {
        if (single == null) {
            single = m39910c(new C11222c());
        }
        return m39909b(new C11317s1(this.f42014a, j2, timeUnit, abstractC11243h, single.f42014a));
    }

    /* renamed from: y */
    public final C11416a<T> m39933y() {
        return C11416a.m40632a(this);
    }

    /* renamed from: z */
    public final C11231b m39934z() {
        return C11231b.m39955w(this);
    }
}
