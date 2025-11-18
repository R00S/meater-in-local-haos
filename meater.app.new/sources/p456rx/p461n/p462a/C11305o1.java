package p456rx.p461n.p462a;

import p456rx.AbstractC11244i;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11428d;

/* compiled from: SingleOnSubscribeDelaySubscriptionOther.java */
/* renamed from: rx.n.a.o1 */
/* loaded from: classes3.dex */
public final class C11305o1<T> implements Single.InterfaceC11229j<T> {

    /* renamed from: f */
    final Single<? extends T> f42447f;

    /* renamed from: g */
    final C11234e<?> f42448g;

    /* compiled from: SingleOnSubscribeDelaySubscriptionOther.java */
    /* renamed from: rx.n.a.o1$a */
    class a extends AbstractC11244i<T> {

        /* renamed from: g */
        final /* synthetic */ AbstractC11244i f42449g;

        a(AbstractC11244i abstractC11244i) {
            this.f42449g = abstractC11244i;
        }

        @Override // p456rx.AbstractC11244i
        /* renamed from: c */
        public void mo29130c(T t) {
            this.f42449g.mo29130c(t);
        }

        @Override // p456rx.AbstractC11244i
        public void onError(Throwable th) {
            this.f42449g.onError(th);
        }
    }

    /* compiled from: SingleOnSubscribeDelaySubscriptionOther.java */
    /* renamed from: rx.n.a.o1$b */
    class b extends AbstractC11245j<Object> {

        /* renamed from: f */
        boolean f42451f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11244i f42452g;

        /* renamed from: h */
        final /* synthetic */ C11428d f42453h;

        b(AbstractC11244i abstractC11244i, C11428d c11428d) {
            this.f42452g = abstractC11244i;
            this.f42453h = c11428d;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42451f) {
                return;
            }
            this.f42451f = true;
            this.f42453h.m40673b(this.f42452g);
            C11305o1.this.f42447f.m39928t(this.f42452g);
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42451f) {
                C11409c.m40578j(th);
            } else {
                this.f42451f = true;
                this.f42452g.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(Object obj) {
            onCompleted();
        }
    }

    public C11305o1(Single<? extends T> single, C11234e<?> c11234e) {
        this.f42447f = single;
        this.f42448g = c11234e;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11244i<? super T> abstractC11244i) {
        a aVar = new a(abstractC11244i);
        C11428d c11428d = new C11428d();
        abstractC11244i.m40149b(c11428d);
        b bVar = new b(aVar, c11428d);
        c11428d.m40673b(bVar);
        this.f42448g.m40058E0(bVar);
    }
}
