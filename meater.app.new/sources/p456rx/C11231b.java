package p456rx;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.CompositeException;
import p456rx.p460m.C11254c;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceCallableC11255d;
import p456rx.p461n.p462a.C11270d;
import p456rx.p461n.p462a.C11276f;
import p456rx.p461n.p466e.C11363l;
import p456rx.p461n.p466e.C11364m;
import p456rx.p470p.C11402b;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11425a;
import p456rx.p474t.C11426b;
import p456rx.p474t.C11427c;
import p456rx.p474t.C11428d;
import p456rx.p474t.C11429e;
import p456rx.schedulers.Schedulers;

/* compiled from: Completable.java */
/* renamed from: rx.b */
/* loaded from: classes.dex */
public class C11231b {

    /* renamed from: a */
    static final C11231b f42041a = new C11231b(new f(), false);

    /* renamed from: b */
    static final C11231b f42042b = new C11231b(new m(), false);

    /* renamed from: c */
    private final w f42043c;

    /* compiled from: Completable.java */
    /* renamed from: rx.b$a */
    /* loaded from: classes3.dex */
    static class a implements w {

        /* renamed from: f */
        final /* synthetic */ C11234e f42044f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$a$a, reason: collision with other inner class name */
        class C11591a extends AbstractC11245j<Object> {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11232c f42045f;

            C11591a(InterfaceC11232c interfaceC11232c) {
                this.f42045f = interfaceC11232c;
            }

            @Override // p456rx.InterfaceC11241f
            public void onCompleted() {
                this.f42045f.onCompleted();
            }

            @Override // p456rx.InterfaceC11241f
            public void onError(Throwable th) {
                this.f42045f.onError(th);
            }

            @Override // p456rx.InterfaceC11241f
            public void onNext(Object obj) {
            }
        }

        a(C11234e c11234e) {
            this.f42044f = c11234e;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            C11591a c11591a = new C11591a(interfaceC11232c);
            interfaceC11232c.mo29114a(c11591a);
            this.f42044f.m40089c1(c11591a);
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$b */
    /* loaded from: classes3.dex */
    static class b implements w {

        /* renamed from: f */
        final /* synthetic */ Single f42047f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$b$a */
        class a extends AbstractC11244i<Object> {

            /* renamed from: g */
            final /* synthetic */ InterfaceC11232c f42048g;

            a(InterfaceC11232c interfaceC11232c) {
                this.f42048g = interfaceC11232c;
            }

            @Override // p456rx.AbstractC11244i
            /* renamed from: c */
            public void mo29130c(Object obj) {
                this.f42048g.onCompleted();
            }

            @Override // p456rx.AbstractC11244i
            public void onError(Throwable th) {
                this.f42048g.onError(th);
            }
        }

        b(Single single) {
            this.f42047f = single;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            a aVar = new a(interfaceC11232c);
            interfaceC11232c.mo29114a(aVar);
            this.f42047f.m39928t(aVar);
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$c */
    /* loaded from: classes3.dex */
    class c implements InterfaceC11232c {

        /* renamed from: f */
        final /* synthetic */ CountDownLatch f42050f;

        /* renamed from: g */
        final /* synthetic */ Throwable[] f42051g;

        c(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f42050f = countDownLatch;
            this.f42051g = thArr;
        }

        @Override // p456rx.InterfaceC11232c
        /* renamed from: a */
        public void mo29114a(InterfaceC11246k interfaceC11246k) {
        }

        @Override // p456rx.InterfaceC11232c
        public void onCompleted() {
            this.f42050f.countDown();
        }

        @Override // p456rx.InterfaceC11232c
        public void onError(Throwable th) {
            this.f42051g[0] = th;
            this.f42050f.countDown();
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$d */
    /* loaded from: classes3.dex */
    class d implements w {

        /* renamed from: f */
        final /* synthetic */ AbstractC11243h f42053f;

        /* renamed from: g */
        final /* synthetic */ long f42054g;

        /* renamed from: h */
        final /* synthetic */ TimeUnit f42055h;

        /* renamed from: i */
        final /* synthetic */ boolean f42056i;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$d$a */
        class a implements InterfaceC11232c {

            /* renamed from: f */
            final /* synthetic */ C11426b f42058f;

            /* renamed from: g */
            final /* synthetic */ AbstractC11243h.a f42059g;

            /* renamed from: h */
            final /* synthetic */ InterfaceC11232c f42060h;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$d$a$a, reason: collision with other inner class name */
            class C11592a implements InterfaceC11252a {
                C11592a() {
                }

                @Override // p456rx.p460m.InterfaceC11252a
                public void call() {
                    try {
                        a.this.f42060h.onCompleted();
                    } finally {
                        a.this.f42059g.unsubscribe();
                    }
                }
            }

            /* compiled from: Completable.java */
            /* renamed from: rx.b$d$a$b */
            class b implements InterfaceC11252a {

                /* renamed from: f */
                final /* synthetic */ Throwable f42063f;

                b(Throwable th) {
                    this.f42063f = th;
                }

                @Override // p456rx.p460m.InterfaceC11252a
                public void call() {
                    try {
                        a.this.f42060h.onError(this.f42063f);
                    } finally {
                        a.this.f42059g.unsubscribe();
                    }
                }
            }

            a(C11426b c11426b, AbstractC11243h.a aVar, InterfaceC11232c interfaceC11232c) {
                this.f42058f = c11426b;
                this.f42059g = aVar;
                this.f42060h = interfaceC11232c;
            }

            @Override // p456rx.InterfaceC11232c
            /* renamed from: a */
            public void mo29114a(InterfaceC11246k interfaceC11246k) {
                this.f42058f.m40667a(interfaceC11246k);
                this.f42060h.mo29114a(this.f42058f);
            }

            @Override // p456rx.InterfaceC11232c
            public void onCompleted() {
                C11426b c11426b = this.f42058f;
                AbstractC11243h.a aVar = this.f42059g;
                C11592a c11592a = new C11592a();
                d dVar = d.this;
                c11426b.m40667a(aVar.mo40147d(c11592a, dVar.f42054g, dVar.f42055h));
            }

            @Override // p456rx.InterfaceC11232c
            public void onError(Throwable th) {
                if (!d.this.f42056i) {
                    this.f42060h.onError(th);
                    return;
                }
                C11426b c11426b = this.f42058f;
                AbstractC11243h.a aVar = this.f42059g;
                b bVar = new b(th);
                d dVar = d.this;
                c11426b.m40667a(aVar.mo40147d(bVar, dVar.f42054g, dVar.f42055h));
            }
        }

        d(AbstractC11243h abstractC11243h, long j2, TimeUnit timeUnit, boolean z) {
            this.f42053f = abstractC11243h;
            this.f42054g = j2;
            this.f42055h = timeUnit;
            this.f42056i = z;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            C11426b c11426b = new C11426b();
            AbstractC11243h.a aVarCreateWorker = this.f42053f.createWorker();
            c11426b.m40667a(aVarCreateWorker);
            C11231b.this.m39971P(new a(c11426b, aVarCreateWorker, interfaceC11232c));
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$e */
    /* loaded from: classes3.dex */
    class e implements w {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11252a f42065f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC11252a f42066g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC11253b f42067h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC11253b f42068i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC11252a f42069j;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$e$a */
        class a implements InterfaceC11232c {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11232c f42071f;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$e$a$a, reason: collision with other inner class name */
            class C11593a implements InterfaceC11252a {

                /* renamed from: f */
                final /* synthetic */ InterfaceC11246k f42073f;

                C11593a(InterfaceC11246k interfaceC11246k) {
                    this.f42073f = interfaceC11246k;
                }

                @Override // p456rx.p460m.InterfaceC11252a
                public void call() {
                    try {
                        e.this.f42069j.call();
                    } catch (Throwable th) {
                        C11409c.m40578j(th);
                    }
                    this.f42073f.unsubscribe();
                }
            }

            a(InterfaceC11232c interfaceC11232c) {
                this.f42071f = interfaceC11232c;
            }

            @Override // p456rx.InterfaceC11232c
            /* renamed from: a */
            public void mo29114a(InterfaceC11246k interfaceC11246k) {
                try {
                    e.this.f42068i.call(interfaceC11246k);
                    this.f42071f.mo29114a(C11429e.m40674a(new C11593a(interfaceC11246k)));
                } catch (Throwable th) {
                    interfaceC11246k.unsubscribe();
                    this.f42071f.mo29114a(C11429e.m40676c());
                    this.f42071f.onError(th);
                }
            }

            @Override // p456rx.InterfaceC11232c
            public void onCompleted() {
                try {
                    e.this.f42065f.call();
                    this.f42071f.onCompleted();
                    try {
                        e.this.f42066g.call();
                    } catch (Throwable th) {
                        C11409c.m40578j(th);
                    }
                } catch (Throwable th2) {
                    this.f42071f.onError(th2);
                }
            }

            @Override // p456rx.InterfaceC11232c
            public void onError(Throwable th) {
                try {
                    e.this.f42067h.call(th);
                } catch (Throwable th2) {
                    th = new CompositeException(Arrays.asList(th, th2));
                }
                this.f42071f.onError(th);
                try {
                    e.this.f42066g.call();
                } catch (Throwable th3) {
                    C11409c.m40578j(th3);
                }
            }
        }

        e(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2, InterfaceC11253b interfaceC11253b, InterfaceC11253b interfaceC11253b2, InterfaceC11252a interfaceC11252a3) {
            this.f42065f = interfaceC11252a;
            this.f42066g = interfaceC11252a2;
            this.f42067h = interfaceC11253b;
            this.f42068i = interfaceC11253b2;
            this.f42069j = interfaceC11252a3;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            C11231b.this.m39971P(new a(interfaceC11232c));
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$f */
    /* loaded from: classes3.dex */
    static class f implements w {
        f() {
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            interfaceC11232c.mo29114a(C11429e.m40676c());
            interfaceC11232c.onCompleted();
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$g */
    /* loaded from: classes3.dex */
    class g implements InterfaceC11253b<Throwable> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11252a f42075f;

        g(InterfaceC11252a interfaceC11252a) {
            this.f42075f = interfaceC11252a;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            this.f42075f.call();
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$h */
    /* loaded from: classes3.dex */
    class h implements w {

        /* renamed from: f */
        final /* synthetic */ AbstractC11243h f42077f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$h$a */
        class a implements InterfaceC11232c {

            /* renamed from: f */
            final /* synthetic */ AbstractC11243h.a f42079f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC11232c f42080g;

            /* renamed from: h */
            final /* synthetic */ C11363l f42081h;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$h$a$a, reason: collision with other inner class name */
            class C11594a implements InterfaceC11252a {
                C11594a() {
                }

                @Override // p456rx.p460m.InterfaceC11252a
                public void call() {
                    try {
                        a.this.f42080g.onCompleted();
                    } finally {
                        a.this.f42081h.unsubscribe();
                    }
                }
            }

            /* compiled from: Completable.java */
            /* renamed from: rx.b$h$a$b */
            class b implements InterfaceC11252a {

                /* renamed from: f */
                final /* synthetic */ Throwable f42084f;

                b(Throwable th) {
                    this.f42084f = th;
                }

                @Override // p456rx.p460m.InterfaceC11252a
                public void call() {
                    try {
                        a.this.f42080g.onError(this.f42084f);
                    } finally {
                        a.this.f42081h.unsubscribe();
                    }
                }
            }

            a(AbstractC11243h.a aVar, InterfaceC11232c interfaceC11232c, C11363l c11363l) {
                this.f42079f = aVar;
                this.f42080g = interfaceC11232c;
                this.f42081h = c11363l;
            }

            @Override // p456rx.InterfaceC11232c
            /* renamed from: a */
            public void mo29114a(InterfaceC11246k interfaceC11246k) {
                this.f42081h.m40464a(interfaceC11246k);
            }

            @Override // p456rx.InterfaceC11232c
            public void onCompleted() {
                this.f42079f.mo40146c(new C11594a());
            }

            @Override // p456rx.InterfaceC11232c
            public void onError(Throwable th) {
                this.f42079f.mo40146c(new b(th));
            }
        }

        h(AbstractC11243h abstractC11243h) {
            this.f42077f = abstractC11243h;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            C11363l c11363l = new C11363l();
            AbstractC11243h.a aVarCreateWorker = this.f42077f.createWorker();
            c11363l.m40464a(aVarCreateWorker);
            interfaceC11232c.mo29114a(c11363l);
            C11231b.this.m39971P(new a(aVarCreateWorker, interfaceC11232c, c11363l));
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$i */
    /* loaded from: classes3.dex */
    class i implements w {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11256e f42086f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$i$a */
        class a implements InterfaceC11232c {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11232c f42088f;

            a(InterfaceC11232c interfaceC11232c) {
                this.f42088f = interfaceC11232c;
            }

            @Override // p456rx.InterfaceC11232c
            /* renamed from: a */
            public void mo29114a(InterfaceC11246k interfaceC11246k) {
                this.f42088f.mo29114a(interfaceC11246k);
            }

            @Override // p456rx.InterfaceC11232c
            public void onCompleted() {
                this.f42088f.onCompleted();
            }

            @Override // p456rx.InterfaceC11232c
            public void onError(Throwable th) {
                boolean zBooleanValue = false;
                try {
                    zBooleanValue = ((Boolean) i.this.f42086f.call(th)).booleanValue();
                } catch (Throwable th2) {
                    C11240a.m40140e(th2);
                    th = new CompositeException(Arrays.asList(th, th2));
                }
                if (zBooleanValue) {
                    this.f42088f.onCompleted();
                } else {
                    this.f42088f.onError(th);
                }
            }
        }

        i(InterfaceC11256e interfaceC11256e) {
            this.f42086f = interfaceC11256e;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            C11231b.this.m39971P(new a(interfaceC11232c));
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$j */
    /* loaded from: classes3.dex */
    class j implements w {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11256e f42090f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$j$a */
        class a implements InterfaceC11232c {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11232c f42092f;

            /* renamed from: g */
            final /* synthetic */ C11428d f42093g;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$j$a$a, reason: collision with other inner class name */
            class C11595a implements InterfaceC11232c {
                C11595a() {
                }

                @Override // p456rx.InterfaceC11232c
                /* renamed from: a */
                public void mo29114a(InterfaceC11246k interfaceC11246k) {
                    a.this.f42093g.m40673b(interfaceC11246k);
                }

                @Override // p456rx.InterfaceC11232c
                public void onCompleted() {
                    a.this.f42092f.onCompleted();
                }

                @Override // p456rx.InterfaceC11232c
                public void onError(Throwable th) {
                    a.this.f42092f.onError(th);
                }
            }

            a(InterfaceC11232c interfaceC11232c, C11428d c11428d) {
                this.f42092f = interfaceC11232c;
                this.f42093g = c11428d;
            }

            @Override // p456rx.InterfaceC11232c
            /* renamed from: a */
            public void mo29114a(InterfaceC11246k interfaceC11246k) {
                this.f42093g.m40673b(interfaceC11246k);
            }

            @Override // p456rx.InterfaceC11232c
            public void onCompleted() {
                this.f42092f.onCompleted();
            }

            @Override // p456rx.InterfaceC11232c
            public void onError(Throwable th) {
                try {
                    C11231b c11231b = (C11231b) j.this.f42090f.call(th);
                    if (c11231b == null) {
                        this.f42092f.onError(new CompositeException(Arrays.asList(th, new NullPointerException("The completable returned is null"))));
                    } else {
                        c11231b.m39971P(new C11595a());
                    }
                } catch (Throwable th2) {
                    this.f42092f.onError(new CompositeException(Arrays.asList(th, th2)));
                }
            }
        }

        j(InterfaceC11256e interfaceC11256e) {
            this.f42090f = interfaceC11256e;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            C11428d c11428d = new C11428d();
            interfaceC11232c.mo29114a(c11428d);
            C11231b.this.m39971P(new a(interfaceC11232c, c11428d));
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$k */
    /* loaded from: classes3.dex */
    class k implements InterfaceC11232c {

        /* renamed from: f */
        final /* synthetic */ C11427c f42096f;

        k(C11427c c11427c) {
            this.f42096f = c11427c;
        }

        @Override // p456rx.InterfaceC11232c
        /* renamed from: a */
        public void mo29114a(InterfaceC11246k interfaceC11246k) {
            this.f42096f.m40671a(interfaceC11246k);
        }

        @Override // p456rx.InterfaceC11232c
        public void onCompleted() {
            this.f42096f.unsubscribe();
        }

        @Override // p456rx.InterfaceC11232c
        public void onError(Throwable th) {
            C11409c.m40578j(th);
            this.f42096f.unsubscribe();
            C11231b.m39950l(th);
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$l */
    /* loaded from: classes3.dex */
    class l implements InterfaceC11232c {

        /* renamed from: f */
        boolean f42098f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC11252a f42099g;

        /* renamed from: h */
        final /* synthetic */ C11427c f42100h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC11253b f42101i;

        l(InterfaceC11252a interfaceC11252a, C11427c c11427c, InterfaceC11253b interfaceC11253b) {
            this.f42099g = interfaceC11252a;
            this.f42100h = c11427c;
            this.f42101i = interfaceC11253b;
        }

        @Override // p456rx.InterfaceC11232c
        /* renamed from: a */
        public void mo29114a(InterfaceC11246k interfaceC11246k) {
            this.f42100h.m40671a(interfaceC11246k);
        }

        /* renamed from: b */
        void m39996b(Throwable th) {
            try {
                this.f42101i.call(th);
            } finally {
                try {
                } finally {
                }
            }
        }

        @Override // p456rx.InterfaceC11232c
        public void onCompleted() {
            if (this.f42098f) {
                return;
            }
            this.f42098f = true;
            try {
                this.f42099g.call();
                this.f42100h.unsubscribe();
            } catch (Throwable th) {
                m39996b(th);
            }
        }

        @Override // p456rx.InterfaceC11232c
        public void onError(Throwable th) {
            if (this.f42098f) {
                C11409c.m40578j(th);
                C11231b.m39950l(th);
            } else {
                this.f42098f = true;
                m39996b(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$m */
    /* loaded from: classes3.dex */
    static class m implements w {
        m() {
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            interfaceC11232c.mo29114a(C11429e.m40676c());
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$n */
    /* loaded from: classes3.dex */
    class n implements InterfaceC11232c {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f42103f;

        n(AbstractC11245j abstractC11245j) {
            this.f42103f = abstractC11245j;
        }

        @Override // p456rx.InterfaceC11232c
        /* renamed from: a */
        public void mo29114a(InterfaceC11246k interfaceC11246k) {
            this.f42103f.add(interfaceC11246k);
        }

        @Override // p456rx.InterfaceC11232c
        public void onCompleted() {
            this.f42103f.onCompleted();
        }

        @Override // p456rx.InterfaceC11232c
        public void onError(Throwable th) {
            this.f42103f.onError(th);
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$o */
    /* loaded from: classes3.dex */
    class o implements w {

        /* renamed from: f */
        final /* synthetic */ AbstractC11243h f42105f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$o$a */
        class a implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11232c f42107f;

            /* renamed from: g */
            final /* synthetic */ AbstractC11243h.a f42108g;

            a(InterfaceC11232c interfaceC11232c, AbstractC11243h.a aVar) {
                this.f42107f = interfaceC11232c;
                this.f42108g = aVar;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                try {
                    C11231b.this.m39971P(this.f42107f);
                } finally {
                    this.f42108g.unsubscribe();
                }
            }
        }

        o(AbstractC11243h abstractC11243h) {
            this.f42105f = abstractC11243h;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            AbstractC11243h.a aVarCreateWorker = this.f42105f.createWorker();
            aVarCreateWorker.mo40146c(new a(interfaceC11232c, aVarCreateWorker));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Completable.java */
    /* renamed from: rx.b$p */
    /* loaded from: classes3.dex */
    class p<T> implements C11234e.a<T> {
        p() {
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11245j<? super T> abstractC11245j) {
            C11231b.this.m39972Q(abstractC11245j);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Completable.java */
    /* renamed from: rx.b$q */
    /* loaded from: classes3.dex */
    class q<T> implements Single.InterfaceC11229j<T> {

        /* renamed from: f */
        final /* synthetic */ InterfaceCallableC11255d f42111f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$q$a */
        class a implements InterfaceC11232c {

            /* renamed from: f */
            final /* synthetic */ AbstractC11244i f42113f;

            a(AbstractC11244i abstractC11244i) {
                this.f42113f = abstractC11244i;
            }

            @Override // p456rx.InterfaceC11232c
            /* renamed from: a */
            public void mo29114a(InterfaceC11246k interfaceC11246k) {
                this.f42113f.m40149b(interfaceC11246k);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p456rx.InterfaceC11232c
            public void onCompleted() {
                try {
                    Object objCall = q.this.f42111f.call();
                    if (objCall == null) {
                        this.f42113f.onError(new NullPointerException("The value supplied is null"));
                    } else {
                        this.f42113f.mo29130c(objCall);
                    }
                } catch (Throwable th) {
                    this.f42113f.onError(th);
                }
            }

            @Override // p456rx.InterfaceC11232c
            public void onError(Throwable th) {
                this.f42113f.onError(th);
            }
        }

        q(InterfaceCallableC11255d interfaceCallableC11255d) {
            this.f42111f = interfaceCallableC11255d;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11244i<? super T> abstractC11244i) {
            C11231b.this.m39971P(new a(abstractC11244i));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Completable.java */
    /* renamed from: rx.b$r */
    /* loaded from: classes3.dex */
    class r<T> implements InterfaceCallableC11255d<T> {

        /* renamed from: f */
        final /* synthetic */ Object f42115f;

        r(Object obj) {
            this.f42115f = obj;
        }

        @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
        public T call() {
            return (T) this.f42115f;
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$s */
    /* loaded from: classes3.dex */
    static class s implements w {

        /* renamed from: f */
        final /* synthetic */ InterfaceCallableC11255d f42117f;

        s(InterfaceCallableC11255d interfaceCallableC11255d) {
            this.f42117f = interfaceCallableC11255d;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            try {
                C11231b c11231b = (C11231b) this.f42117f.call();
                if (c11231b != null) {
                    c11231b.m39971P(interfaceC11232c);
                } else {
                    interfaceC11232c.mo29114a(C11429e.m40676c());
                    interfaceC11232c.onError(new NullPointerException("The completable returned is null"));
                }
            } catch (Throwable th) {
                interfaceC11232c.mo29114a(C11429e.m40676c());
                interfaceC11232c.onError(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$t */
    /* loaded from: classes3.dex */
    static class t implements w {

        /* renamed from: f */
        final /* synthetic */ Throwable f42118f;

        t(Throwable th) {
            this.f42118f = th;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            interfaceC11232c.mo29114a(C11429e.m40676c());
            interfaceC11232c.onError(this.f42118f);
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$u */
    /* loaded from: classes3.dex */
    static class u implements w {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11252a f42119f;

        u(InterfaceC11252a interfaceC11252a) {
            this.f42119f = interfaceC11252a;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            C11425a c11425a = new C11425a();
            interfaceC11232c.mo29114a(c11425a);
            try {
                this.f42119f.call();
                if (c11425a.isUnsubscribed()) {
                    return;
                }
                interfaceC11232c.onCompleted();
            } catch (Throwable th) {
                if (c11425a.isUnsubscribed()) {
                    return;
                }
                interfaceC11232c.onError(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$v */
    /* loaded from: classes3.dex */
    static class v implements w {

        /* renamed from: f */
        final /* synthetic */ Callable f42120f;

        v(Callable callable) {
            this.f42120f = callable;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11232c interfaceC11232c) {
            C11425a c11425a = new C11425a();
            interfaceC11232c.mo29114a(c11425a);
            try {
                this.f42120f.call();
                if (c11425a.isUnsubscribed()) {
                    return;
                }
                interfaceC11232c.onCompleted();
            } catch (Throwable th) {
                if (c11425a.isUnsubscribed()) {
                    return;
                }
                interfaceC11232c.onError(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$w */
    /* loaded from: classes3.dex */
    public interface w extends InterfaceC11253b<InterfaceC11232c> {
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$x */
    /* loaded from: classes3.dex */
    public interface x extends InterfaceC11256e<InterfaceC11232c, InterfaceC11232c> {
    }

    protected C11231b(w wVar) {
        this.f42043c = C11409c.m40575g(wVar);
    }

    /* renamed from: D */
    static <T> T m39943D(T t2) {
        t2.getClass();
        return t2;
    }

    /* renamed from: L */
    static NullPointerException m39944L(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: R */
    private <T> void m39945R(AbstractC11245j<T> abstractC11245j, boolean z) {
        m39943D(abstractC11245j);
        if (z) {
            try {
                abstractC11245j.onStart();
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                C11240a.m40140e(th);
                Throwable thM40581m = C11409c.m40581m(th);
                C11409c.m40578j(thM40581m);
                throw m39944L(thM40581m);
            }
        }
        m39971P(new n(abstractC11245j));
        C11409c.m40583o(abstractC11245j);
    }

    /* renamed from: e */
    public static C11231b m39946e() {
        C11231b c11231b = f42041a;
        w wVarM40575g = C11409c.m40575g(c11231b.f42043c);
        return wVarM40575g == c11231b.f42043c ? c11231b : new C11231b(wVarM40575g, false);
    }

    /* renamed from: f */
    public static C11231b m39947f(C11231b... c11231bArr) {
        m39943D(c11231bArr);
        return c11231bArr.length == 0 ? m39946e() : c11231bArr.length == 1 ? c11231bArr[0] : m39948h(new C11270d(c11231bArr));
    }

    /* renamed from: h */
    public static C11231b m39948h(w wVar) {
        m39943D(wVar);
        try {
            return new C11231b(wVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C11409c.m40578j(th);
            throw m39944L(th);
        }
    }

    /* renamed from: i */
    public static C11231b m39949i(InterfaceCallableC11255d<? extends C11231b> interfaceCallableC11255d) {
        m39943D(interfaceCallableC11255d);
        return m39948h(new s(interfaceCallableC11255d));
    }

    /* renamed from: l */
    static void m39950l(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    /* renamed from: s */
    public static C11231b m39951s(Throwable th) {
        m39943D(th);
        return m39948h(new t(th));
    }

    /* renamed from: t */
    public static C11231b m39952t(InterfaceC11252a interfaceC11252a) {
        m39943D(interfaceC11252a);
        return m39948h(new u(interfaceC11252a));
    }

    /* renamed from: u */
    public static C11231b m39953u(Callable<?> callable) {
        m39943D(callable);
        return m39948h(new v(callable));
    }

    /* renamed from: v */
    public static C11231b m39954v(C11234e<?> c11234e) {
        m39943D(c11234e);
        return m39948h(new a(c11234e));
    }

    /* renamed from: w */
    public static C11231b m39955w(Single<?> single) {
        m39943D(single);
        return m39948h(new b(single));
    }

    /* renamed from: x */
    public static C11231b m39956x(C11231b... c11231bArr) {
        m39943D(c11231bArr);
        return m39948h(new C11276f(c11231bArr));
    }

    /* renamed from: y */
    public static C11231b m39957y() {
        C11231b c11231b = f42042b;
        w wVarM40575g = C11409c.m40575g(c11231b.f42043c);
        return wVarM40575g == c11231b.f42043c ? c11231b : new C11231b(wVarM40575g, false);
    }

    /* renamed from: A */
    public final C11231b m39958A() {
        return m39959B(C11364m.m40466a());
    }

    /* renamed from: B */
    public final C11231b m39959B(InterfaceC11256e<? super Throwable, Boolean> interfaceC11256e) {
        m39943D(interfaceC11256e);
        return m39948h(new i(interfaceC11256e));
    }

    /* renamed from: C */
    public final C11231b m39960C(InterfaceC11256e<? super Throwable, ? extends C11231b> interfaceC11256e) {
        m39943D(interfaceC11256e);
        return m39948h(new j(interfaceC11256e));
    }

    /* renamed from: E */
    public final C11231b m39961E() {
        return m39954v(m39968M().m40110s0());
    }

    /* renamed from: F */
    public final C11231b m39962F(InterfaceC11256e<? super C11234e<? extends Throwable>, ? extends C11234e<?>> interfaceC11256e) {
        return m39954v(m39968M().m40112t0(interfaceC11256e));
    }

    /* renamed from: G */
    public final C11231b m39963G(C11231b c11231b) {
        m39943D(c11231b);
        return m39947f(c11231b, this);
    }

    /* renamed from: H */
    public final InterfaceC11246k m39964H() {
        C11427c c11427c = new C11427c();
        m39971P(new k(c11427c));
        return c11427c;
    }

    /* renamed from: I */
    public final InterfaceC11246k m39965I(InterfaceC11252a interfaceC11252a, InterfaceC11253b<? super Throwable> interfaceC11253b) {
        m39943D(interfaceC11252a);
        m39943D(interfaceC11253b);
        C11427c c11427c = new C11427c();
        m39971P(new l(interfaceC11252a, c11427c, interfaceC11253b));
        return c11427c;
    }

    /* renamed from: J */
    public final void m39966J(InterfaceC11232c interfaceC11232c) {
        if (!(interfaceC11232c instanceof C11402b)) {
            interfaceC11232c = new C11402b(interfaceC11232c);
        }
        m39971P(interfaceC11232c);
    }

    /* renamed from: K */
    public final C11231b m39967K(AbstractC11243h abstractC11243h) {
        m39943D(abstractC11243h);
        return m39948h(new o(abstractC11243h));
    }

    /* renamed from: M */
    public final <T> C11234e<T> m39968M() {
        return C11234e.m40035b1(new p());
    }

    /* renamed from: N */
    public final <T> Single<T> m39969N(InterfaceCallableC11255d<? extends T> interfaceCallableC11255d) {
        m39943D(interfaceCallableC11255d);
        return Single.m39909b(new q(interfaceCallableC11255d));
    }

    /* renamed from: O */
    public final <T> Single<T> m39970O(T t2) {
        m39943D(t2);
        return m39969N(new r(t2));
    }

    /* renamed from: P */
    public final void m39971P(InterfaceC11232c interfaceC11232c) {
        m39943D(interfaceC11232c);
        try {
            C11409c.m40573e(this, this.f42043c).call(interfaceC11232c);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C11240a.m40140e(th);
            Throwable thM40572d = C11409c.m40572d(th);
            C11409c.m40578j(thM40572d);
            throw m39944L(thM40572d);
        }
    }

    /* renamed from: Q */
    public final <T> void m39972Q(AbstractC11245j<T> abstractC11245j) {
        m39945R(abstractC11245j, true);
    }

    /* renamed from: a */
    public final C11231b m39973a(C11231b c11231b) {
        return m39977g(c11231b);
    }

    /* renamed from: b */
    public final <T> C11234e<T> m39974b(C11234e<T> c11234e) {
        m39943D(c11234e);
        return c11234e.m40109s(m39968M());
    }

    /* renamed from: c */
    public final <T> Single<T> m39975c(Single<T> single) {
        m39943D(single);
        return single.m39916d(m39968M());
    }

    /* renamed from: d */
    public final void m39976d() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        m39971P(new c(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            if (thArr[0] != null) {
                C11240a.m40138c(thArr[0]);
            }
        } else {
            try {
                countDownLatch.await();
                if (thArr[0] != null) {
                    C11240a.m40138c(thArr[0]);
                }
            } catch (InterruptedException e2) {
                throw C11240a.m40138c(e2);
            }
        }
    }

    /* renamed from: g */
    public final C11231b m39977g(C11231b c11231b) {
        m39943D(c11231b);
        return m39947f(this, c11231b);
    }

    /* renamed from: j */
    public final C11231b m39978j(long j2, TimeUnit timeUnit) {
        return m39979k(j2, timeUnit, Schedulers.computation(), false);
    }

    /* renamed from: k */
    public final C11231b m39979k(long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h, boolean z) {
        m39943D(timeUnit);
        m39943D(abstractC11243h);
        return m39948h(new d(abstractC11243h, j2, timeUnit, z));
    }

    /* renamed from: m */
    public final C11231b m39980m(InterfaceC11252a interfaceC11252a) {
        return m39982o(C11254c.m40157a(), C11254c.m40157a(), interfaceC11252a, C11254c.m40157a(), C11254c.m40157a());
    }

    /* renamed from: n */
    public final C11231b m39981n(InterfaceC11253b<? super Throwable> interfaceC11253b) {
        return m39982o(C11254c.m40157a(), interfaceC11253b, C11254c.m40157a(), C11254c.m40157a(), C11254c.m40157a());
    }

    /* renamed from: o */
    protected final C11231b m39982o(InterfaceC11253b<? super InterfaceC11246k> interfaceC11253b, InterfaceC11253b<? super Throwable> interfaceC11253b2, InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2, InterfaceC11252a interfaceC11252a3) {
        m39943D(interfaceC11253b);
        m39943D(interfaceC11253b2);
        m39943D(interfaceC11252a);
        m39943D(interfaceC11252a2);
        m39943D(interfaceC11252a3);
        return m39948h(new e(interfaceC11252a, interfaceC11252a2, interfaceC11253b2, interfaceC11253b, interfaceC11252a3));
    }

    /* renamed from: p */
    public final C11231b m39983p(InterfaceC11253b<? super InterfaceC11246k> interfaceC11253b) {
        return m39982o(interfaceC11253b, C11254c.m40157a(), C11254c.m40157a(), C11254c.m40157a(), C11254c.m40157a());
    }

    /* renamed from: q */
    public final C11231b m39984q(InterfaceC11252a interfaceC11252a) {
        return m39982o(C11254c.m40157a(), new g(interfaceC11252a), interfaceC11252a, C11254c.m40157a(), C11254c.m40157a());
    }

    /* renamed from: r */
    public final C11231b m39985r(InterfaceC11252a interfaceC11252a) {
        return m39982o(C11254c.m40157a(), C11254c.m40157a(), C11254c.m40157a(), C11254c.m40157a(), interfaceC11252a);
    }

    /* renamed from: z */
    public final C11231b m39986z(AbstractC11243h abstractC11243h) {
        m39943D(abstractC11243h);
        return m39948h(new h(abstractC11243h));
    }

    protected C11231b(w wVar, boolean z) {
        this.f42043c = z ? C11409c.m40575g(wVar) : wVar;
    }
}
