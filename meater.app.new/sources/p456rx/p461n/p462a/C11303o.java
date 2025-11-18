package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.OnErrorThrowable;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p471q.C11409c;

/* compiled from: OnSubscribeFilter.java */
/* renamed from: rx.n.a.o */
/* loaded from: classes3.dex */
public final class C11303o<T> implements C11234e.a<T> {

    /* renamed from: f */
    final C11234e<T> f42441f;

    /* renamed from: g */
    final InterfaceC11256e<? super T, Boolean> f42442g;

    /* compiled from: OnSubscribeFilter.java */
    /* renamed from: rx.n.a.o$a */
    static final class a<T> extends AbstractC11245j<T> {

        /* renamed from: f */
        final AbstractC11245j<? super T> f42443f;

        /* renamed from: g */
        final InterfaceC11256e<? super T, Boolean> f42444g;

        /* renamed from: h */
        boolean f42445h;

        public a(AbstractC11245j<? super T> abstractC11245j, InterfaceC11256e<? super T, Boolean> interfaceC11256e) {
            this.f42443f = abstractC11245j;
            this.f42444g = interfaceC11256e;
            request(0L);
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42445h) {
                return;
            }
            this.f42443f.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42445h) {
                C11409c.m40578j(th);
            } else {
                this.f42445h = true;
                this.f42443f.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            try {
                if (this.f42444g.call(t).booleanValue()) {
                    this.f42443f.onNext(t);
                } else {
                    request(1L);
                }
            } catch (Throwable th) {
                C11240a.m40140e(th);
                unsubscribe();
                onError(OnErrorThrowable.m40132a(th, t));
            }
        }

        @Override // p456rx.AbstractC11245j
        public void setProducer(InterfaceC11242g interfaceC11242g) {
            super.setProducer(interfaceC11242g);
            this.f42443f.setProducer(interfaceC11242g);
        }
    }

    public C11303o(C11234e<T> c11234e, InterfaceC11256e<? super T, Boolean> interfaceC11256e) {
        this.f42441f = c11234e;
        this.f42442g = interfaceC11256e;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        a aVar = new a(abstractC11245j, this.f42442g);
        abstractC11245j.add(aVar);
        this.f42441f.m40089c1(aVar);
    }
}
