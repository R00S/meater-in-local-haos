package p456rx.p461n.p464c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.InterfaceC11232c;
import p456rx.InterfaceC11241f;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p461n.p462a.C11264b;
import p456rx.p470p.C11404d;
import p456rx.p473s.C11418b;
import p456rx.p474t.C11429e;

/* compiled from: SchedulerWhen.java */
/* renamed from: rx.n.c.l */
/* loaded from: classes3.dex */
public class C11347l extends AbstractC11243h implements InterfaceC11246k {

    /* renamed from: f */
    static final InterfaceC11246k f42826f = new c();

    /* renamed from: g */
    static final InterfaceC11246k f42827g = C11429e.m40676c();

    /* renamed from: h */
    private final AbstractC11243h f42828h;

    /* renamed from: i */
    private final InterfaceC11241f<C11234e<C11231b>> f42829i;

    /* renamed from: j */
    private final InterfaceC11246k f42830j;

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$a */
    class a implements InterfaceC11256e<g, C11231b> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11243h.a f42831f;

        /* compiled from: SchedulerWhen.java */
        /* renamed from: rx.n.c.l$a$a, reason: collision with other inner class name */
        class C11611a implements C11231b.w {

            /* renamed from: f */
            final /* synthetic */ g f42833f;

            C11611a(g gVar) {
                this.f42833f = gVar;
            }

            @Override // p456rx.p460m.InterfaceC11253b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(InterfaceC11232c interfaceC11232c) {
                interfaceC11232c.mo29114a(this.f42833f);
                this.f42833f.m40410b(a.this.f42831f, interfaceC11232c);
            }
        }

        a(AbstractC11243h.a aVar) {
            this.f42831f = aVar;
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11231b call(g gVar) {
            return C11231b.m39948h(new C11611a(gVar));
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$b */
    class b extends AbstractC11243h.a {

        /* renamed from: f */
        private final AtomicBoolean f42835f = new AtomicBoolean();

        /* renamed from: g */
        final /* synthetic */ AbstractC11243h.a f42836g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC11241f f42837h;

        b(AbstractC11243h.a aVar, InterfaceC11241f interfaceC11241f) {
            this.f42836g = aVar;
            this.f42837h = interfaceC11241f;
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: c */
        public InterfaceC11246k mo40146c(InterfaceC11252a interfaceC11252a) {
            e eVar = new e(interfaceC11252a);
            this.f42837h.onNext(eVar);
            return eVar;
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: d */
        public InterfaceC11246k mo40147d(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit) {
            d dVar = new d(interfaceC11252a, j2, timeUnit);
            this.f42837h.onNext(dVar);
            return dVar;
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42835f.get();
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            if (this.f42835f.compareAndSet(false, true)) {
                this.f42836g.unsubscribe();
                this.f42837h.onCompleted();
            }
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$c */
    static class c implements InterfaceC11246k {
        c() {
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return false;
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$d */
    static class d extends g {

        /* renamed from: f */
        private final InterfaceC11252a f42839f;

        /* renamed from: g */
        private final long f42840g;

        /* renamed from: h */
        private final TimeUnit f42841h;

        public d(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit) {
            this.f42839f = interfaceC11252a;
            this.f42840g = j2;
            this.f42841h = timeUnit;
        }

        @Override // p456rx.p461n.p464c.C11347l.g
        /* renamed from: c */
        protected InterfaceC11246k mo40408c(AbstractC11243h.a aVar, InterfaceC11232c interfaceC11232c) {
            return aVar.mo40147d(new f(this.f42839f, interfaceC11232c), this.f42840g, this.f42841h);
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$e */
    static class e extends g {

        /* renamed from: f */
        private final InterfaceC11252a f42842f;

        public e(InterfaceC11252a interfaceC11252a) {
            this.f42842f = interfaceC11252a;
        }

        @Override // p456rx.p461n.p464c.C11347l.g
        /* renamed from: c */
        protected InterfaceC11246k mo40408c(AbstractC11243h.a aVar, InterfaceC11232c interfaceC11232c) {
            return aVar.mo40146c(new f(this.f42842f, interfaceC11232c));
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$f */
    static class f implements InterfaceC11252a {

        /* renamed from: f */
        private InterfaceC11232c f42843f;

        /* renamed from: g */
        private InterfaceC11252a f42844g;

        public f(InterfaceC11252a interfaceC11252a, InterfaceC11232c interfaceC11232c) {
            this.f42844g = interfaceC11252a;
            this.f42843f = interfaceC11232c;
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            try {
                this.f42844g.call();
            } finally {
                this.f42843f.onCompleted();
            }
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$g */
    static abstract class g extends AtomicReference<InterfaceC11246k> implements InterfaceC11246k {
        public g() {
            super(C11347l.f42826f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m40410b(AbstractC11243h.a aVar, InterfaceC11232c interfaceC11232c) {
            InterfaceC11246k interfaceC11246k;
            InterfaceC11246k interfaceC11246k2 = get();
            if (interfaceC11246k2 != C11347l.f42827g && interfaceC11246k2 == (interfaceC11246k = C11347l.f42826f)) {
                InterfaceC11246k interfaceC11246kMo40408c = mo40408c(aVar, interfaceC11232c);
                if (compareAndSet(interfaceC11246k, interfaceC11246kMo40408c)) {
                    return;
                }
                interfaceC11246kMo40408c.unsubscribe();
            }
        }

        /* renamed from: c */
        protected abstract InterfaceC11246k mo40408c(AbstractC11243h.a aVar, InterfaceC11232c interfaceC11232c);

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return get().isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            InterfaceC11246k interfaceC11246k;
            InterfaceC11246k interfaceC11246k2 = C11347l.f42827g;
            do {
                interfaceC11246k = get();
                if (interfaceC11246k == C11347l.f42827g) {
                    return;
                }
            } while (!compareAndSet(interfaceC11246k, interfaceC11246k2));
            if (interfaceC11246k != C11347l.f42826f) {
                interfaceC11246k.unsubscribe();
            }
        }
    }

    public C11347l(InterfaceC11256e<C11234e<C11234e<C11231b>>, C11231b> interfaceC11256e, AbstractC11243h abstractC11243h) {
        this.f42828h = abstractC11243h;
        C11418b c11418bM40637g1 = C11418b.m40637g1();
        this.f42829i = new C11404d(c11418bM40637g1);
        this.f42830j = interfaceC11256e.call(c11418bM40637g1.m40100m0()).m39964H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p456rx.AbstractC11243h
    public AbstractC11243h.a createWorker() {
        AbstractC11243h.a aVarCreateWorker = this.f42828h.createWorker();
        C11264b c11264bM40182g1 = C11264b.m40182g1();
        C11404d c11404d = new C11404d(c11264bM40182g1);
        Object objM40082X = c11264bM40182g1.m40082X(new a(aVarCreateWorker));
        b bVar = new b(aVarCreateWorker, c11404d);
        this.f42829i.onNext(objM40082X);
        return bVar;
    }

    @Override // p456rx.InterfaceC11246k
    public boolean isUnsubscribed() {
        return this.f42830j.isUnsubscribed();
    }

    @Override // p456rx.InterfaceC11246k
    public void unsubscribe() {
        this.f42830j.unsubscribe();
    }
}
