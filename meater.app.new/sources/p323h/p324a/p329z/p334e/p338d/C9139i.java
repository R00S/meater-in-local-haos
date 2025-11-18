package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.C0000a;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.InterfaceC9074k;
import p323h.p324a.InterfaceC9075l;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.C9088b;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p328y.InterfaceC9098f;
import p323h.p324a.p329z.p330a.EnumC9103c;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p340f.C9159c;
import p323h.p324a.p329z.p344j.C9176a;

/* compiled from: ObservableFlatMapMaybe.java */
/* renamed from: h.a.z.e.d.i */
/* loaded from: classes2.dex */
public final class C9139i<T, R> extends AbstractC9131a<T, R> {

    /* renamed from: g */
    final InterfaceC9098f<? super T, ? extends InterfaceC9075l<? extends R>> f35073g;

    /* renamed from: h */
    final boolean f35074h;

    /* compiled from: ObservableFlatMapMaybe.java */
    /* renamed from: h.a.z.e.d.i$a */
    static final class a<T, R> extends AtomicInteger implements InterfaceC9080q<T>, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9080q<? super R> f35075f;

        /* renamed from: g */
        final boolean f35076g;

        /* renamed from: k */
        final InterfaceC9098f<? super T, ? extends InterfaceC9075l<? extends R>> f35080k;

        /* renamed from: m */
        InterfaceC9089c f35082m;

        /* renamed from: n */
        volatile boolean f35083n;

        /* renamed from: h */
        final C9088b f35077h = new C9088b();

        /* renamed from: j */
        final C9176a f35079j = new C9176a();

        /* renamed from: i */
        final AtomicInteger f35078i = new AtomicInteger(1);

        /* renamed from: l */
        final AtomicReference<C9159c<R>> f35081l = new AtomicReference<>();

        /* compiled from: ObservableFlatMapMaybe.java */
        /* renamed from: h.a.z.e.d.i$a$a, reason: collision with other inner class name */
        final class C11529a extends AtomicReference<InterfaceC9089c> implements InterfaceC9074k<R>, InterfaceC9089c {
            C11529a() {
            }

            @Override // p323h.p324a.InterfaceC9074k
            /* renamed from: a */
            public void mo29185a() {
                a.this.m29301g(this);
            }

            @Override // p323h.p324a.InterfaceC9074k
            /* renamed from: b */
            public void mo29186b(InterfaceC9089c interfaceC9089c) {
                EnumC9103c.m29248A(this, interfaceC9089c);
            }

            @Override // p323h.p324a.p327x.InterfaceC9089c
            /* renamed from: k */
            public void mo29115k() {
                EnumC9103c.m29250g(this);
            }

            @Override // p323h.p324a.InterfaceC9074k
            public void onError(Throwable th) {
                a.this.m29302h(this, th);
            }

            @Override // p323h.p324a.InterfaceC9074k
            public void onSuccess(R r) {
                a.this.m29303i(this, r);
            }

            @Override // p323h.p324a.p327x.InterfaceC9089c
            /* renamed from: q */
            public boolean mo29116q() {
                return EnumC9103c.m29251u(get());
            }
        }

        a(InterfaceC9080q<? super R> interfaceC9080q, InterfaceC9098f<? super T, ? extends InterfaceC9075l<? extends R>> interfaceC9098f, boolean z) {
            this.f35075f = interfaceC9080q;
            this.f35080k = interfaceC9098f;
            this.f35076g = z;
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: a */
        public void mo29218a() {
            this.f35078i.decrementAndGet();
            m29298d();
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: b */
        public void mo29219b(InterfaceC9089c interfaceC9089c) {
            if (EnumC9103c.m29249D(this.f35082m, interfaceC9089c)) {
                this.f35082m = interfaceC9089c;
                this.f35075f.mo29219b(this);
            }
        }

        /* renamed from: c */
        void m29297c() {
            C9159c<R> c9159c = this.f35081l.get();
            if (c9159c != null) {
                c9159c.clear();
            }
        }

        /* renamed from: d */
        void m29298d() {
            if (getAndIncrement() == 0) {
                m29299e();
            }
        }

        /* renamed from: e */
        void m29299e() {
            InterfaceC9080q<? super R> interfaceC9080q = this.f35075f;
            AtomicInteger atomicInteger = this.f35078i;
            AtomicReference<C9159c<R>> atomicReference = this.f35081l;
            int iAddAndGet = 1;
            while (!this.f35083n) {
                if (!this.f35076g && this.f35079j.get() != null) {
                    Throwable thM29385b = this.f35079j.m29385b();
                    m29297c();
                    interfaceC9080q.onError(thM29385b);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                C9159c<R> c9159c = atomicReference.get();
                C0000a c0000aPoll = c9159c != null ? c9159c.poll() : null;
                boolean z2 = c0000aPoll == null;
                if (z && z2) {
                    Throwable thM29385b2 = this.f35079j.m29385b();
                    if (thM29385b2 != null) {
                        interfaceC9080q.onError(thM29385b2);
                        return;
                    } else {
                        interfaceC9080q.mo29218a();
                        return;
                    }
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    interfaceC9080q.onNext(c0000aPoll);
                }
            }
            m29297c();
        }

        /* renamed from: f */
        C9159c<R> m29300f() {
            C9159c<R> c9159c;
            do {
                C9159c<R> c9159c2 = this.f35081l.get();
                if (c9159c2 != null) {
                    return c9159c2;
                }
                c9159c = new C9159c<>(AbstractC9076m.m29188b());
            } while (!this.f35081l.compareAndSet(null, c9159c));
            return c9159c;
        }

        /* renamed from: g */
        void m29301g(a<T, R>.C11529a c11529a) {
            this.f35077h.mo29240c(c11529a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z = this.f35078i.decrementAndGet() == 0;
                    C9159c<R> c9159c = this.f35081l.get();
                    if (!z || (c9159c != null && !c9159c.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        m29299e();
                        return;
                    } else {
                        Throwable thM29385b = this.f35079j.m29385b();
                        if (thM29385b != null) {
                            this.f35075f.onError(thM29385b);
                            return;
                        } else {
                            this.f35075f.mo29218a();
                            return;
                        }
                    }
                }
            }
            this.f35078i.decrementAndGet();
            m29298d();
        }

        /* renamed from: h */
        void m29302h(a<T, R>.C11529a c11529a, Throwable th) {
            this.f35077h.mo29240c(c11529a);
            if (!this.f35079j.m29384a(th)) {
                C9063a.m29147o(th);
                return;
            }
            if (!this.f35076g) {
                this.f35082m.mo29115k();
                this.f35077h.mo29115k();
            }
            this.f35078i.decrementAndGet();
            m29298d();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m29303i(p323h.p324a.p329z.p334e.p338d.C9139i.a<T, R>.C11529a r3, R r4) {
            /*
                r2 = this;
                h.a.x.b r0 = r2.f35077h
                r0.mo29240c(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L4e
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L4e
                h.a.q<? super R> r1 = r2.f35075f
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.f35078i
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = 1
            L21:
                java.util.concurrent.atomic.AtomicReference<h.a.z.f.c<R>> r4 = r2.f35081l
                java.lang.Object r4 = r4.get()
                h.a.z.f.c r4 = (p323h.p324a.p329z.p340f.C9159c) r4
                if (r3 == 0) goto L47
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L47
            L33:
                h.a.z.j.a r3 = r2.f35079j
                java.lang.Throwable r3 = r3.m29385b()
                if (r3 == 0) goto L41
                h.a.q<? super R> r4 = r2.f35075f
                r4.onError(r3)
                goto L46
            L41:
                h.a.q<? super R> r3 = r2.f35075f
                r3.mo29218a()
            L46:
                return
            L47:
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L63
                return
            L4e:
                h.a.z.f.c r3 = r2.m29300f()
                monitor-enter(r3)
                r3.offer(r4)     // Catch: java.lang.Throwable -> L67
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicInteger r3 = r2.f35078i
                r3.decrementAndGet()
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L63
                return
            L63:
                r2.m29299e()
                return
            L67:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p323h.p324a.p329z.p334e.p338d.C9139i.a.m29303i(h.a.z.e.d.i$a$a, java.lang.Object):void");
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            this.f35083n = true;
            this.f35082m.mo29115k();
            this.f35077h.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onError(Throwable th) {
            this.f35078i.decrementAndGet();
            if (!this.f35079j.m29384a(th)) {
                C9063a.m29147o(th);
                return;
            }
            if (!this.f35076g) {
                this.f35077h.mo29115k();
            }
            m29298d();
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onNext(T t) {
            try {
                InterfaceC9075l interfaceC9075l = (InterfaceC9075l) C9108b.m29271c(this.f35080k.mo4660a(t), "The mapper returned a null MaybeSource");
                this.f35078i.getAndIncrement();
                C11529a c11529a = new C11529a();
                if (this.f35083n || !this.f35077h.mo29239b(c11529a)) {
                    return;
                }
                interfaceC9075l.mo29183a(c11529a);
            } catch (Throwable th) {
                C9240a.m30000a(th);
                this.f35082m.mo29115k();
                onError(th);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35083n;
        }
    }

    public C9139i(InterfaceC9079p<T> interfaceC9079p, InterfaceC9098f<? super T, ? extends InterfaceC9075l<? extends R>> interfaceC9098f, boolean z) {
        super(interfaceC9079p);
        this.f35073g = interfaceC9098f;
        this.f35074h = z;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    protected void mo29214x(InterfaceC9080q<? super R> interfaceC9080q) {
        this.f35009f.mo29199a(new a(interfaceC9080q, this.f35073g, this.f35074h));
    }
}
