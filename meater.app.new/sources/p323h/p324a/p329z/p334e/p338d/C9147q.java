package p323h.p324a.p329z.p334e.p338d;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9081r;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.EnumC9103c;

/* compiled from: ObservableSubscribeOn.java */
/* renamed from: h.a.z.e.d.q */
/* loaded from: classes2.dex */
public final class C9147q<T> extends AbstractC9131a<T, T> {

    /* renamed from: g */
    final AbstractC9081r f35120g;

    /* compiled from: ObservableSubscribeOn.java */
    /* renamed from: h.a.z.e.d.q$a */
    static final class a<T> extends AtomicReference<InterfaceC9089c> implements InterfaceC9080q<T>, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9080q<? super T> f35121f;

        /* renamed from: g */
        final AtomicReference<InterfaceC9089c> f35122g = new AtomicReference<>();

        a(InterfaceC9080q<? super T> interfaceC9080q) {
            this.f35121f = interfaceC9080q;
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: a */
        public void mo29218a() {
            this.f35121f.mo29218a();
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: b */
        public void mo29219b(InterfaceC9089c interfaceC9089c) {
            EnumC9103c.m29248A(this.f35122g, interfaceC9089c);
        }

        /* renamed from: c */
        void m29311c(InterfaceC9089c interfaceC9089c) {
            EnumC9103c.m29248A(this, interfaceC9089c);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9103c.m29250g(this.f35122g);
            EnumC9103c.m29250g(this);
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onError(Throwable th) {
            this.f35121f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onNext(T t) {
            this.f35121f.onNext(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9103c.m29251u(get());
        }
    }

    /* compiled from: ObservableSubscribeOn.java */
    /* renamed from: h.a.z.e.d.q$b */
    final class b implements Runnable {

        /* renamed from: f */
        private final a<T> f35123f;

        b(a<T> aVar) {
            this.f35123f = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9147q.this.f35009f.mo29199a(this.f35123f);
        }
    }

    public C9147q(InterfaceC9079p<T> interfaceC9079p, AbstractC9081r abstractC9081r) {
        super(interfaceC9079p);
        this.f35120g = abstractC9081r;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    public void mo29214x(InterfaceC9080q<? super T> interfaceC9080q) {
        a aVar = new a(interfaceC9080q);
        interfaceC9080q.mo29219b(aVar);
        aVar.m29311c(this.f35120g.mo29221b(new b(aVar)));
    }
}
