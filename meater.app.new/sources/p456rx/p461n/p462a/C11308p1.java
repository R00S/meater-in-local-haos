package p456rx.p461n.p462a;

import p456rx.AbstractC11244i;
import p456rx.Single;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.OnErrorThrowable;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p471q.C11409c;

/* compiled from: SingleOnSubscribeMap.java */
/* renamed from: rx.n.a.p1 */
/* loaded from: classes3.dex */
public final class C11308p1<T, R> implements Single.InterfaceC11229j<R> {

    /* renamed from: f */
    final Single<T> f42485f;

    /* renamed from: g */
    final InterfaceC11256e<? super T, ? extends R> f42486g;

    /* compiled from: SingleOnSubscribeMap.java */
    /* renamed from: rx.n.a.p1$a */
    static final class a<T, R> extends AbstractC11244i<T> {

        /* renamed from: g */
        final AbstractC11244i<? super R> f42487g;

        /* renamed from: h */
        final InterfaceC11256e<? super T, ? extends R> f42488h;

        /* renamed from: i */
        boolean f42489i;

        public a(AbstractC11244i<? super R> abstractC11244i, InterfaceC11256e<? super T, ? extends R> interfaceC11256e) {
            this.f42487g = abstractC11244i;
            this.f42488h = interfaceC11256e;
        }

        @Override // p456rx.AbstractC11244i
        /* renamed from: c */
        public void mo29130c(T t) {
            try {
                this.f42487g.mo29130c(this.f42488h.call(t));
            } catch (Throwable th) {
                C11240a.m40140e(th);
                unsubscribe();
                onError(OnErrorThrowable.m40132a(th, t));
            }
        }

        @Override // p456rx.AbstractC11244i
        public void onError(Throwable th) {
            if (this.f42489i) {
                C11409c.m40578j(th);
            } else {
                this.f42489i = true;
                this.f42487g.onError(th);
            }
        }
    }

    public C11308p1(Single<T> single, InterfaceC11256e<? super T, ? extends R> interfaceC11256e) {
        this.f42485f = single;
        this.f42486g = interfaceC11256e;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11244i<? super R> abstractC11244i) {
        a aVar = new a(abstractC11244i, this.f42486g);
        abstractC11244i.m40149b(aVar);
        this.f42485f.m39928t(aVar);
    }
}
