package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p470p.C11406f;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11428d;
import p456rx.p474t.C11429e;

/* compiled from: OnSubscribeDelaySubscriptionOther.java */
/* renamed from: rx.n.a.m */
/* loaded from: classes3.dex */
public final class C11297m<T, U> implements C11234e.a<T> {

    /* renamed from: f */
    final C11234e<? extends T> f42412f;

    /* renamed from: g */
    final C11234e<U> f42413g;

    /* compiled from: OnSubscribeDelaySubscriptionOther.java */
    /* renamed from: rx.n.a.m$a */
    class a extends AbstractC11245j<U> {

        /* renamed from: f */
        boolean f42414f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11245j f42415g;

        /* renamed from: h */
        final /* synthetic */ C11428d f42416h;

        a(AbstractC11245j abstractC11245j, C11428d c11428d) {
            this.f42415g = abstractC11245j;
            this.f42416h = c11428d;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42414f) {
                return;
            }
            this.f42414f = true;
            this.f42416h.m40673b(C11429e.m40676c());
            C11297m.this.f42412f.m40089c1(this.f42415g);
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42414f) {
                C11409c.m40578j(th);
            } else {
                this.f42414f = true;
                this.f42415g.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(U u) {
            onCompleted();
        }
    }

    public C11297m(C11234e<? extends T> c11234e, C11234e<U> c11234e2) {
        this.f42412f = c11234e;
        this.f42413g = c11234e2;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        C11428d c11428d = new C11428d();
        abstractC11245j.add(c11428d);
        a aVar = new a(C11406f.m40561c(abstractC11245j), c11428d);
        c11428d.m40673b(aVar);
        this.f42413g.m40089c1(aVar);
    }
}
