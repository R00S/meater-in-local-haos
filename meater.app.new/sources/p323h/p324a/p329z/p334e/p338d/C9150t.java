package p323h.p324a.p329z.p334e.p338d;

import java.util.concurrent.atomic.AtomicBoolean;
import p323h.p324a.AbstractC9081r;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.EnumC9103c;

/* compiled from: ObservableUnsubscribeOn.java */
/* renamed from: h.a.z.e.d.t */
/* loaded from: classes2.dex */
public final class C9150t<T> extends AbstractC9131a<T, T> {

    /* renamed from: g */
    final AbstractC9081r f35134g;

    /* compiled from: ObservableUnsubscribeOn.java */
    /* renamed from: h.a.z.e.d.t$a */
    static final class a<T> extends AtomicBoolean implements InterfaceC9080q<T>, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9080q<? super T> f35135f;

        /* renamed from: g */
        final AbstractC9081r f35136g;

        /* renamed from: h */
        InterfaceC9089c f35137h;

        /* compiled from: ObservableUnsubscribeOn.java */
        /* renamed from: h.a.z.e.d.t$a$a, reason: collision with other inner class name */
        final class RunnableC11530a implements Runnable {
            RunnableC11530a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f35137h.mo29115k();
            }
        }

        a(InterfaceC9080q<? super T> interfaceC9080q, AbstractC9081r abstractC9081r) {
            this.f35135f = interfaceC9080q;
            this.f35136g = abstractC9081r;
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: a */
        public void mo29218a() {
            if (get()) {
                return;
            }
            this.f35135f.mo29218a();
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: b */
        public void mo29219b(InterfaceC9089c interfaceC9089c) {
            if (EnumC9103c.m29249D(this.f35137h, interfaceC9089c)) {
                this.f35137h = interfaceC9089c;
                this.f35135f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            if (compareAndSet(false, true)) {
                this.f35136g.mo29221b(new RunnableC11530a());
            }
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onError(Throwable th) {
            if (get()) {
                C9063a.m29147o(th);
            } else {
                this.f35135f.onError(th);
            }
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f35135f.onNext(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return get();
        }
    }

    public C9150t(InterfaceC9079p<T> interfaceC9079p, AbstractC9081r abstractC9081r) {
        super(interfaceC9079p);
        this.f35134g = abstractC9081r;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    public void mo29214x(InterfaceC9080q<? super T> interfaceC9080q) {
        this.f35009f.mo29199a(new a(interfaceC9080q, this.f35134g));
    }
}
