package p456rx.p461n.p466e;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import p456rx.AbstractC11243h;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p461n.p463b.C11335c;
import p456rx.p461n.p464c.C11337b;
import p456rx.p470p.C11406f;
import p456rx.p471q.C11409c;

/* compiled from: ScalarSynchronousObservable.java */
/* renamed from: rx.n.e.j */
/* loaded from: classes3.dex */
public final class C11361j<T> extends C11234e<T> {

    /* renamed from: g */
    static final boolean f42890g = Boolean.valueOf(System.getProperty("rx.just.strong-mode", AdultContentAnalytics.UNLOCK)).booleanValue();

    /* renamed from: h */
    final T f42891h;

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$a */
    class a implements InterfaceC11256e<InterfaceC11252a, InterfaceC11246k> {

        /* renamed from: f */
        final /* synthetic */ C11337b f42892f;

        a(C11337b c11337b) {
            this.f42892f = c11337b;
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC11246k call(InterfaceC11252a interfaceC11252a) {
            return this.f42892f.m40385a(interfaceC11252a);
        }
    }

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$b */
    class b implements InterfaceC11256e<InterfaceC11252a, InterfaceC11246k> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11243h f42894f;

        /* compiled from: ScalarSynchronousObservable.java */
        /* renamed from: rx.n.e.j$b$a */
        class a implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11252a f42896f;

            /* renamed from: g */
            final /* synthetic */ AbstractC11243h.a f42897g;

            a(InterfaceC11252a interfaceC11252a, AbstractC11243h.a aVar) {
                this.f42896f = interfaceC11252a;
                this.f42897g = aVar;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                try {
                    this.f42896f.call();
                } finally {
                    this.f42897g.unsubscribe();
                }
            }
        }

        b(AbstractC11243h abstractC11243h) {
            this.f42894f = abstractC11243h;
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC11246k call(InterfaceC11252a interfaceC11252a) {
            AbstractC11243h.a aVarCreateWorker = this.f42894f.createWorker();
            aVarCreateWorker.mo40146c(new a(interfaceC11252a, aVarCreateWorker));
            return aVarCreateWorker;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$c */
    class c<R> implements C11234e.a<R> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11256e f42899f;

        c(InterfaceC11256e interfaceC11256e) {
            this.f42899f = interfaceC11256e;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11245j<? super R> abstractC11245j) {
            C11234e c11234e = (C11234e) this.f42899f.call(C11361j.this.f42891h);
            if (c11234e instanceof C11361j) {
                abstractC11245j.setProducer(C11361j.m40447g1(abstractC11245j, ((C11361j) c11234e).f42891h));
            } else {
                c11234e.m40089c1(C11406f.m40561c(abstractC11245j));
            }
        }
    }

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$d */
    static final class d<T> implements C11234e.a<T> {

        /* renamed from: f */
        final T f42901f;

        d(T t) {
            this.f42901f = t;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11245j<? super T> abstractC11245j) {
            abstractC11245j.setProducer(C11361j.m40447g1(abstractC11245j, this.f42901f));
        }
    }

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$e */
    static final class e<T> implements C11234e.a<T> {

        /* renamed from: f */
        final T f42902f;

        /* renamed from: g */
        final InterfaceC11256e<InterfaceC11252a, InterfaceC11246k> f42903g;

        e(T t, InterfaceC11256e<InterfaceC11252a, InterfaceC11246k> interfaceC11256e) {
            this.f42902f = t;
            this.f42903g = interfaceC11256e;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11245j<? super T> abstractC11245j) {
            abstractC11245j.setProducer(new f(abstractC11245j, this.f42902f, this.f42903g));
        }
    }

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$f */
    static final class f<T> extends AtomicBoolean implements InterfaceC11242g, InterfaceC11252a {

        /* renamed from: f */
        final AbstractC11245j<? super T> f42904f;

        /* renamed from: g */
        final T f42905g;

        /* renamed from: h */
        final InterfaceC11256e<InterfaceC11252a, InterfaceC11246k> f42906h;

        public f(AbstractC11245j<? super T> abstractC11245j, T t, InterfaceC11256e<InterfaceC11252a, InterfaceC11246k> interfaceC11256e) {
            this.f42904f = abstractC11245j;
            this.f42905g = t;
            this.f42906h = interfaceC11256e;
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            AbstractC11245j<? super T> abstractC11245j = this.f42904f;
            if (abstractC11245j.isUnsubscribed()) {
                return;
            }
            T t = this.f42905g;
            try {
                abstractC11245j.onNext(t);
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onCompleted();
            } catch (Throwable th) {
                C11240a.m40142g(th, abstractC11245j, t);
            }
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j2);
            }
            if (j2 == 0 || !compareAndSet(false, true)) {
                return;
            }
            this.f42904f.add(this.f42906h.call(this));
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.f42905g + ", " + get() + "]";
        }
    }

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$g */
    static final class g<T> implements InterfaceC11242g {

        /* renamed from: f */
        final AbstractC11245j<? super T> f42907f;

        /* renamed from: g */
        final T f42908g;

        /* renamed from: h */
        boolean f42909h;

        public g(AbstractC11245j<? super T> abstractC11245j, T t) {
            this.f42907f = abstractC11245j;
            this.f42908g = t;
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            if (this.f42909h) {
                return;
            }
            if (j2 < 0) {
                throw new IllegalStateException("n >= required but it was " + j2);
            }
            if (j2 == 0) {
                return;
            }
            this.f42909h = true;
            AbstractC11245j<? super T> abstractC11245j = this.f42907f;
            if (abstractC11245j.isUnsubscribed()) {
                return;
            }
            T t = this.f42908g;
            try {
                abstractC11245j.onNext(t);
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onCompleted();
            } catch (Throwable th) {
                C11240a.m40142g(th, abstractC11245j, t);
            }
        }
    }

    protected C11361j(T t) {
        super(C11409c.m40576h(new d(t)));
        this.f42891h = t;
    }

    /* renamed from: f1 */
    public static <T> C11361j<T> m40446f1(T t) {
        return new C11361j<>(t);
    }

    /* renamed from: g1 */
    static <T> InterfaceC11242g m40447g1(AbstractC11245j<? super T> abstractC11245j, T t) {
        return f42890g ? new C11335c(abstractC11245j, t) : new g(abstractC11245j, t);
    }

    /* renamed from: h1 */
    public T m40448h1() {
        return this.f42891h;
    }

    /* renamed from: i1 */
    public <R> C11234e<R> m40449i1(InterfaceC11256e<? super T, ? extends C11234e<? extends R>> interfaceC11256e) {
        return C11234e.m40035b1(new c(interfaceC11256e));
    }

    /* renamed from: j1 */
    public C11234e<T> m40450j1(AbstractC11243h abstractC11243h) {
        return C11234e.m40035b1(new e(this.f42891h, abstractC11243h instanceof C11337b ? new a((C11337b) abstractC11243h) : new b(abstractC11243h)));
    }
}
