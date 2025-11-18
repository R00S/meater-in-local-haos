package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11243h;
import p456rx.AbstractC11245j;
import p456rx.C11233d;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p461n.p463b.C11333a;
import p456rx.p470p.C11406f;
import p456rx.p473s.AbstractC11420d;
import p456rx.p473s.C11417a;
import p456rx.p473s.C11419c;
import p456rx.p474t.C11428d;
import p456rx.schedulers.Schedulers;

/* compiled from: OnSubscribeRedo.java */
/* renamed from: rx.n.a.y */
/* loaded from: classes3.dex */
public final class C11329y<T> implements C11234e.a<T> {

    /* renamed from: f */
    static final InterfaceC11256e<C11234e<? extends C11233d<?>>, C11234e<?>> f42665f = new a();

    /* renamed from: g */
    final C11234e<T> f42666g;

    /* renamed from: h */
    private final InterfaceC11256e<? super C11234e<? extends C11233d<?>>, ? extends C11234e<?>> f42667h;

    /* renamed from: i */
    final boolean f42668i;

    /* renamed from: j */
    final boolean f42669j;

    /* renamed from: k */
    private final AbstractC11243h f42670k;

    /* compiled from: OnSubscribeRedo.java */
    /* renamed from: rx.n.a.y$a */
    static class a implements InterfaceC11256e<C11234e<? extends C11233d<?>>, C11234e<?>> {

        /* compiled from: OnSubscribeRedo.java */
        /* renamed from: rx.n.a.y$a$a, reason: collision with other inner class name */
        class C11605a implements InterfaceC11256e<C11233d<?>, C11233d<?>> {
            C11605a() {
            }

            @Override // p456rx.p460m.InterfaceC11256e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C11233d<?> call(C11233d<?> c11233d) {
                return C11233d.m40007c(null);
            }
        }

        a() {
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11234e<?> call(C11234e<? extends C11233d<?>> c11234e) {
            return c11234e.m40082X(new C11605a());
        }
    }

    /* compiled from: OnSubscribeRedo.java */
    /* renamed from: rx.n.a.y$b */
    class b implements InterfaceC11252a {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f42672f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11420d f42673g;

        /* renamed from: h */
        final /* synthetic */ C11333a f42674h;

        /* renamed from: i */
        final /* synthetic */ AtomicLong f42675i;

        /* renamed from: j */
        final /* synthetic */ C11428d f42676j;

        /* compiled from: OnSubscribeRedo.java */
        /* renamed from: rx.n.a.y$b$a */
        class a extends AbstractC11245j<T> {

            /* renamed from: f */
            boolean f42678f;

            a() {
            }

            /* renamed from: c */
            private void m40359c() {
                long j2;
                do {
                    j2 = b.this.f42675i.get();
                    if (j2 == Long.MAX_VALUE) {
                        return;
                    }
                } while (!b.this.f42675i.compareAndSet(j2, j2 - 1));
            }

            @Override // p456rx.InterfaceC11241f
            public void onCompleted() {
                if (this.f42678f) {
                    return;
                }
                this.f42678f = true;
                unsubscribe();
                b.this.f42673g.onNext(C11233d.m40005a());
            }

            @Override // p456rx.InterfaceC11241f
            public void onError(Throwable th) {
                if (this.f42678f) {
                    return;
                }
                this.f42678f = true;
                unsubscribe();
                b.this.f42673g.onNext(C11233d.m40006b(th));
            }

            @Override // p456rx.InterfaceC11241f
            public void onNext(T t) {
                if (this.f42678f) {
                    return;
                }
                b.this.f42672f.onNext(t);
                m40359c();
                b.this.f42674h.m40374b(1L);
            }

            @Override // p456rx.AbstractC11245j
            public void setProducer(InterfaceC11242g interfaceC11242g) {
                b.this.f42674h.m40375c(interfaceC11242g);
            }
        }

        b(AbstractC11245j abstractC11245j, AbstractC11420d abstractC11420d, C11333a c11333a, AtomicLong atomicLong, C11428d c11428d) {
            this.f42672f = abstractC11245j;
            this.f42673g = abstractC11420d;
            this.f42674h = c11333a;
            this.f42675i = atomicLong;
            this.f42676j = c11428d;
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            if (this.f42672f.isUnsubscribed()) {
                return;
            }
            a aVar = new a();
            this.f42676j.m40673b(aVar);
            C11329y.this.f42666g.m40089c1(aVar);
        }
    }

    /* compiled from: OnSubscribeRedo.java */
    /* renamed from: rx.n.a.y$c */
    class c implements C11234e.b<C11233d<?>, C11233d<?>> {

        /* compiled from: OnSubscribeRedo.java */
        /* renamed from: rx.n.a.y$c$a */
        class a extends AbstractC11245j<C11233d<?>> {

            /* renamed from: f */
            final /* synthetic */ AbstractC11245j f42681f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC11245j abstractC11245j, AbstractC11245j abstractC11245j2) {
                super(abstractC11245j);
                this.f42681f = abstractC11245j2;
            }

            @Override // p456rx.InterfaceC11241f
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onNext(C11233d<?> c11233d) {
                if (c11233d.m40013i() && C11329y.this.f42668i) {
                    this.f42681f.onCompleted();
                } else if (c11233d.m40014j() && C11329y.this.f42669j) {
                    this.f42681f.onError(c11233d.m40009e());
                } else {
                    this.f42681f.onNext(c11233d);
                }
            }

            @Override // p456rx.InterfaceC11241f
            public void onCompleted() {
                this.f42681f.onCompleted();
            }

            @Override // p456rx.InterfaceC11241f
            public void onError(Throwable th) {
                this.f42681f.onError(th);
            }

            @Override // p456rx.AbstractC11245j
            public void setProducer(InterfaceC11242g interfaceC11242g) {
                interfaceC11242g.request(Long.MAX_VALUE);
            }
        }

        c() {
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC11245j<? super C11233d<?>> call(AbstractC11245j<? super C11233d<?>> abstractC11245j) {
            return new a(abstractC11245j, abstractC11245j);
        }
    }

    /* compiled from: OnSubscribeRedo.java */
    /* renamed from: rx.n.a.y$d */
    class d implements InterfaceC11252a {

        /* renamed from: f */
        final /* synthetic */ C11234e f42683f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11245j f42684g;

        /* renamed from: h */
        final /* synthetic */ AtomicLong f42685h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11243h.a f42686i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC11252a f42687j;

        /* renamed from: k */
        final /* synthetic */ AtomicBoolean f42688k;

        /* compiled from: OnSubscribeRedo.java */
        /* renamed from: rx.n.a.y$d$a */
        class a extends AbstractC11245j<Object> {
            a(AbstractC11245j abstractC11245j) {
                super(abstractC11245j);
            }

            @Override // p456rx.InterfaceC11241f
            public void onCompleted() {
                d.this.f42684g.onCompleted();
            }

            @Override // p456rx.InterfaceC11241f
            public void onError(Throwable th) {
                d.this.f42684g.onError(th);
            }

            @Override // p456rx.InterfaceC11241f
            public void onNext(Object obj) {
                if (d.this.f42684g.isUnsubscribed()) {
                    return;
                }
                if (d.this.f42685h.get() <= 0) {
                    d.this.f42688k.compareAndSet(false, true);
                } else {
                    d dVar = d.this;
                    dVar.f42686i.mo40146c(dVar.f42687j);
                }
            }

            @Override // p456rx.AbstractC11245j
            public void setProducer(InterfaceC11242g interfaceC11242g) {
                interfaceC11242g.request(Long.MAX_VALUE);
            }
        }

        d(C11234e c11234e, AbstractC11245j abstractC11245j, AtomicLong atomicLong, AbstractC11243h.a aVar, InterfaceC11252a interfaceC11252a, AtomicBoolean atomicBoolean) {
            this.f42683f = c11234e;
            this.f42684g = abstractC11245j;
            this.f42685h = atomicLong;
            this.f42686i = aVar;
            this.f42687j = interfaceC11252a;
            this.f42688k = atomicBoolean;
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            this.f42683f.m40089c1(new a(this.f42684g));
        }
    }

    /* compiled from: OnSubscribeRedo.java */
    /* renamed from: rx.n.a.y$e */
    class e implements InterfaceC11242g {

        /* renamed from: f */
        final /* synthetic */ AtomicLong f42691f;

        /* renamed from: g */
        final /* synthetic */ C11333a f42692g;

        /* renamed from: h */
        final /* synthetic */ AtomicBoolean f42693h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11243h.a f42694i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC11252a f42695j;

        e(AtomicLong atomicLong, C11333a c11333a, AtomicBoolean atomicBoolean, AbstractC11243h.a aVar, InterfaceC11252a interfaceC11252a) {
            this.f42691f = atomicLong;
            this.f42692g = c11333a;
            this.f42693h = atomicBoolean;
            this.f42694i = aVar;
            this.f42695j = interfaceC11252a;
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            if (j2 > 0) {
                C11261a.m40162b(this.f42691f, j2);
                this.f42692g.request(j2);
                if (this.f42693h.compareAndSet(true, false)) {
                    this.f42694i.mo40146c(this.f42695j);
                }
            }
        }
    }

    private C11329y(C11234e<T> c11234e, InterfaceC11256e<? super C11234e<? extends C11233d<?>>, ? extends C11234e<?>> interfaceC11256e, boolean z, boolean z2, AbstractC11243h abstractC11243h) {
        this.f42666g = c11234e;
        this.f42667h = interfaceC11256e;
        this.f42668i = z;
        this.f42669j = z2;
        this.f42670k = abstractC11243h;
    }

    /* renamed from: b */
    public static <T> C11234e<T> m40354b(C11234e<T> c11234e) {
        return m40355c(c11234e, f42665f);
    }

    /* renamed from: c */
    public static <T> C11234e<T> m40355c(C11234e<T> c11234e, InterfaceC11256e<? super C11234e<? extends C11233d<?>>, ? extends C11234e<?>> interfaceC11256e) {
        return C11234e.m40035b1(new C11329y(c11234e, interfaceC11256e, true, false, Schedulers.trampoline()));
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        AbstractC11243h.a aVarCreateWorker = this.f42670k.createWorker();
        abstractC11245j.add(aVarCreateWorker);
        C11428d c11428d = new C11428d();
        abstractC11245j.add(c11428d);
        C11419c<T, T> c11419cM40642f1 = C11417a.m40634g1().m40642f1();
        c11419cM40642f1.m40058E0(C11406f.m40559a());
        C11333a c11333a = new C11333a();
        b bVar = new b(abstractC11245j, c11419cM40642f1, c11333a, atomicLong, c11428d);
        aVarCreateWorker.mo40146c(new d(this.f42667h.call(c11419cM40642f1.m40080W(new c())), abstractC11245j, atomicLong, aVarCreateWorker, bVar, atomicBoolean));
        abstractC11245j.setProducer(new e(atomicLong, c11333a, atomicBoolean, aVarCreateWorker, bVar));
    }
}
