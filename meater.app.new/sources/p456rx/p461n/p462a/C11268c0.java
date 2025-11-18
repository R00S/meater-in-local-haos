package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.p461n.p463b.C11333a;
import p456rx.p474t.C11428d;

/* compiled from: OnSubscribeSwitchIfEmpty.java */
/* renamed from: rx.n.a.c0 */
/* loaded from: classes3.dex */
public final class C11268c0<T> implements C11234e.a<T> {

    /* renamed from: f */
    final C11234e<? extends T> f42207f;

    /* renamed from: g */
    final C11234e<? extends T> f42208g;

    /* compiled from: OnSubscribeSwitchIfEmpty.java */
    /* renamed from: rx.n.a.c0$a */
    static final class a<T> extends AbstractC11245j<T> {

        /* renamed from: f */
        private final C11333a f42209f;

        /* renamed from: g */
        private final AbstractC11245j<? super T> f42210g;

        a(AbstractC11245j<? super T> abstractC11245j, C11333a c11333a) {
            this.f42210g = abstractC11245j;
            this.f42209f = c11333a;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42210g.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42210g.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            this.f42210g.onNext(t);
            this.f42209f.m40374b(1L);
        }

        @Override // p456rx.AbstractC11245j
        public void setProducer(InterfaceC11242g interfaceC11242g) {
            this.f42209f.m40375c(interfaceC11242g);
        }
    }

    /* compiled from: OnSubscribeSwitchIfEmpty.java */
    /* renamed from: rx.n.a.c0$b */
    static final class b<T> extends AbstractC11245j<T> {

        /* renamed from: g */
        private final AbstractC11245j<? super T> f42212g;

        /* renamed from: h */
        private final C11428d f42213h;

        /* renamed from: i */
        private final C11333a f42214i;

        /* renamed from: j */
        private final C11234e<? extends T> f42215j;

        /* renamed from: l */
        volatile boolean f42217l;

        /* renamed from: f */
        private boolean f42211f = true;

        /* renamed from: k */
        final AtomicInteger f42216k = new AtomicInteger();

        b(AbstractC11245j<? super T> abstractC11245j, C11428d c11428d, C11333a c11333a, C11234e<? extends T> c11234e) {
            this.f42212g = abstractC11245j;
            this.f42213h = c11428d;
            this.f42214i = c11333a;
            this.f42215j = c11234e;
        }

        /* renamed from: c */
        void m40190c(C11234e<? extends T> c11234e) {
            if (this.f42216k.getAndIncrement() == 0) {
                while (!this.f42212g.isUnsubscribed()) {
                    if (!this.f42217l) {
                        if (c11234e == null) {
                            a aVar = new a(this.f42212g, this.f42214i);
                            this.f42213h.m40673b(aVar);
                            this.f42217l = true;
                            this.f42215j.m40089c1(aVar);
                        } else {
                            this.f42217l = true;
                            c11234e.m40089c1(this);
                            c11234e = null;
                        }
                    }
                    if (this.f42216k.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (!this.f42211f) {
                this.f42212g.onCompleted();
            } else {
                if (this.f42212g.isUnsubscribed()) {
                    return;
                }
                this.f42217l = false;
                m40190c(null);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42212g.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            this.f42211f = false;
            this.f42212g.onNext(t);
            this.f42214i.m40374b(1L);
        }

        @Override // p456rx.AbstractC11245j
        public void setProducer(InterfaceC11242g interfaceC11242g) {
            this.f42214i.m40375c(interfaceC11242g);
        }
    }

    public C11268c0(C11234e<? extends T> c11234e, C11234e<? extends T> c11234e2) {
        this.f42207f = c11234e;
        this.f42208g = c11234e2;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        C11428d c11428d = new C11428d();
        C11333a c11333a = new C11333a();
        b bVar = new b(abstractC11245j, c11428d, c11333a, this.f42208g);
        c11428d.m40673b(bVar);
        abstractC11245j.add(c11428d);
        abstractC11245j.setProducer(c11333a);
        bVar.m40190c(this.f42207f);
    }
}
