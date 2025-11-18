package p456rx.p461n.p462a;

import p456rx.AbstractC11244i;
import p456rx.Single;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: SingleOnErrorReturn.java */
/* renamed from: rx.n.a.n1 */
/* loaded from: classes3.dex */
public final class C11302n1<T> implements Single.InterfaceC11229j<T> {

    /* renamed from: f */
    final Single.InterfaceC11229j<T> f42437f;

    /* renamed from: g */
    final InterfaceC11256e<Throwable, ? extends T> f42438g;

    /* compiled from: SingleOnErrorReturn.java */
    /* renamed from: rx.n.a.n1$a */
    static final class a<T> extends AbstractC11244i<T> {

        /* renamed from: g */
        final AbstractC11244i<? super T> f42439g;

        /* renamed from: h */
        final InterfaceC11256e<Throwable, ? extends T> f42440h;

        public a(AbstractC11244i<? super T> abstractC11244i, InterfaceC11256e<Throwable, ? extends T> interfaceC11256e) {
            this.f42439g = abstractC11244i;
            this.f42440h = interfaceC11256e;
        }

        @Override // p456rx.AbstractC11244i
        /* renamed from: c */
        public void mo29130c(T t) {
            this.f42439g.mo29130c(t);
        }

        @Override // p456rx.AbstractC11244i
        public void onError(Throwable th) {
            try {
                this.f42439g.mo29130c(this.f42440h.call(th));
            } catch (Throwable th2) {
                C11240a.m40140e(th2);
                this.f42439g.onError(th2);
            }
        }
    }

    public C11302n1(Single.InterfaceC11229j<T> interfaceC11229j, InterfaceC11256e<Throwable, ? extends T> interfaceC11256e) {
        this.f42437f = interfaceC11229j;
        this.f42438g = interfaceC11256e;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11244i<? super T> abstractC11244i) {
        a aVar = new a(abstractC11244i, this.f42438g);
        abstractC11244i.m40149b(aVar);
        this.f42437f.call(aVar);
    }
}
