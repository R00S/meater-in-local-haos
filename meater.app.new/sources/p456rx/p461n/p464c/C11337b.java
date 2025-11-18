package p456rx.p461n.p464c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11243h;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p461n.p466e.C11363l;
import p456rx.p461n.p466e.ThreadFactoryC11360i;
import p456rx.p474t.C11426b;
import p456rx.p474t.C11429e;

/* compiled from: EventLoopsScheduler.java */
/* renamed from: rx.n.c.b */
/* loaded from: classes3.dex */
public final class C11337b extends AbstractC11243h implements InterfaceC11346k {

    /* renamed from: f */
    static final int f42760f;

    /* renamed from: g */
    static final c f42761g;

    /* renamed from: h */
    static final b f42762h;

    /* renamed from: i */
    final ThreadFactory f42763i;

    /* renamed from: j */
    final AtomicReference<b> f42764j = new AtomicReference<>(f42762h);

    /* compiled from: EventLoopsScheduler.java */
    /* renamed from: rx.n.c.b$a */
    static final class a extends AbstractC11243h.a {

        /* renamed from: f */
        private final C11363l f42765f;

        /* renamed from: g */
        private final C11426b f42766g;

        /* renamed from: h */
        private final C11363l f42767h;

        /* renamed from: i */
        private final c f42768i;

        /* compiled from: EventLoopsScheduler.java */
        /* renamed from: rx.n.c.b$a$a, reason: collision with other inner class name */
        class C11609a implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11252a f42769f;

            C11609a(InterfaceC11252a interfaceC11252a) {
                this.f42769f = interfaceC11252a;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.f42769f.call();
            }
        }

        /* compiled from: EventLoopsScheduler.java */
        /* renamed from: rx.n.c.b$a$b */
        class b implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11252a f42771f;

            b(InterfaceC11252a interfaceC11252a) {
                this.f42771f = interfaceC11252a;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.f42771f.call();
            }
        }

        a(c cVar) {
            C11363l c11363l = new C11363l();
            this.f42765f = c11363l;
            C11426b c11426b = new C11426b();
            this.f42766g = c11426b;
            this.f42767h = new C11363l(c11363l, c11426b);
            this.f42768i = cVar;
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: c */
        public InterfaceC11246k mo40146c(InterfaceC11252a interfaceC11252a) {
            return isUnsubscribed() ? C11429e.m40676c() : this.f42768i.m40398k(new C11609a(interfaceC11252a), 0L, null, this.f42765f);
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: d */
        public InterfaceC11246k mo40147d(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit) {
            return isUnsubscribed() ? C11429e.m40676c() : this.f42768i.m40399l(new b(interfaceC11252a), j2, timeUnit, this.f42766g);
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42767h.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            this.f42767h.unsubscribe();
        }
    }

    /* compiled from: EventLoopsScheduler.java */
    /* renamed from: rx.n.c.b$b */
    static final class b {

        /* renamed from: a */
        final int f42773a;

        /* renamed from: b */
        final c[] f42774b;

        /* renamed from: c */
        long f42775c;

        b(ThreadFactory threadFactory, int i2) {
            this.f42773a = i2;
            this.f42774b = new c[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f42774b[i3] = new c(threadFactory);
            }
        }

        /* renamed from: a */
        public c m40386a() {
            int i2 = this.f42773a;
            if (i2 == 0) {
                return C11337b.f42761g;
            }
            c[] cVarArr = this.f42774b;
            long j2 = this.f42775c;
            this.f42775c = 1 + j2;
            return cVarArr[(int) (j2 % i2)];
        }

        /* renamed from: b */
        public void m40387b() {
            for (c cVar : this.f42774b) {
                cVar.unsubscribe();
            }
        }
    }

    /* compiled from: EventLoopsScheduler.java */
    /* renamed from: rx.n.c.b$c */
    static final class c extends C11343h {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int iIntValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iIntValue <= 0 || iIntValue > iAvailableProcessors) {
            iIntValue = iAvailableProcessors;
        }
        f42760f = iIntValue;
        c cVar = new c(ThreadFactoryC11360i.f42888f);
        f42761g = cVar;
        cVar.unsubscribe();
        f42762h = new b(null, 0);
    }

    public C11337b(ThreadFactory threadFactory) {
        this.f42763i = threadFactory;
        start();
    }

    /* renamed from: a */
    public InterfaceC11246k m40385a(InterfaceC11252a interfaceC11252a) {
        return this.f42764j.get().m40386a().m40397j(interfaceC11252a, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // p456rx.AbstractC11243h
    public AbstractC11243h.a createWorker() {
        return new a(this.f42764j.get().m40386a());
    }

    @Override // p456rx.p461n.p464c.InterfaceC11346k
    public void shutdown() {
        b bVar;
        b bVar2;
        do {
            bVar = this.f42764j.get();
            bVar2 = f42762h;
            if (bVar == bVar2) {
                return;
            }
        } while (!this.f42764j.compareAndSet(bVar, bVar2));
        bVar.m40387b();
    }

    @Override // p456rx.p461n.p464c.InterfaceC11346k
    public void start() {
        b bVar = new b(this.f42763i, f42760f);
        if (this.f42764j.compareAndSet(f42762h, bVar)) {
            return;
        }
        bVar.m40387b();
    }
}
