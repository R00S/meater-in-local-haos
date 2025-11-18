package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.OnErrorThrowable;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p471q.C11409c;

/* compiled from: OnSubscribeMap.java */
/* renamed from: rx.n.a.w */
/* loaded from: classes3.dex */
public final class C11325w<T, R> implements C11234e.a<R> {

    /* renamed from: f */
    final C11234e<T> f42642f;

    /* renamed from: g */
    final InterfaceC11256e<? super T, ? extends R> f42643g;

    /* compiled from: OnSubscribeMap.java */
    /* renamed from: rx.n.a.w$a */
    static final class a<T, R> extends AbstractC11245j<T> {

        /* renamed from: f */
        final AbstractC11245j<? super R> f42644f;

        /* renamed from: g */
        final InterfaceC11256e<? super T, ? extends R> f42645g;

        /* renamed from: h */
        boolean f42646h;

        public a(AbstractC11245j<? super R> abstractC11245j, InterfaceC11256e<? super T, ? extends R> interfaceC11256e) {
            this.f42644f = abstractC11245j;
            this.f42645g = interfaceC11256e;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42646h) {
                return;
            }
            this.f42644f.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42646h) {
                C11409c.m40578j(th);
            } else {
                this.f42646h = true;
                this.f42644f.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            try {
                this.f42644f.onNext(this.f42645g.call(t));
            } catch (Throwable th) {
                C11240a.m40140e(th);
                unsubscribe();
                onError(OnErrorThrowable.m40132a(th, t));
            }
        }

        @Override // p456rx.AbstractC11245j
        public void setProducer(InterfaceC11242g interfaceC11242g) {
            this.f42644f.setProducer(interfaceC11242g);
        }
    }

    public C11325w(C11234e<T> c11234e, InterfaceC11256e<? super T, ? extends R> interfaceC11256e) {
        this.f42642f = c11234e;
        this.f42643g = interfaceC11256e;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super R> abstractC11245j) {
        a aVar = new a(abstractC11245j, this.f42643g);
        abstractC11245j.add(aVar);
        this.f42642f.m40089c1(aVar);
    }
}
