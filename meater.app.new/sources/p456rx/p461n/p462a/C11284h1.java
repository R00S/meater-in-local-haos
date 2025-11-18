package p456rx.p461n.p462a;

import p456rx.AbstractC11244i;
import p456rx.Single;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.CompositeException;
import p456rx.p460m.InterfaceC11253b;

/* compiled from: SingleDoOnEvent.java */
/* renamed from: rx.n.a.h1 */
/* loaded from: classes3.dex */
public final class C11284h1<T> implements Single.InterfaceC11229j<T> {

    /* renamed from: f */
    final Single<T> f42318f;

    /* renamed from: g */
    final InterfaceC11253b<? super T> f42319g;

    /* renamed from: h */
    final InterfaceC11253b<Throwable> f42320h;

    /* compiled from: SingleDoOnEvent.java */
    /* renamed from: rx.n.a.h1$a */
    static final class a<T> extends AbstractC11244i<T> {

        /* renamed from: g */
        final AbstractC11244i<? super T> f42321g;

        /* renamed from: h */
        final InterfaceC11253b<? super T> f42322h;

        /* renamed from: i */
        final InterfaceC11253b<Throwable> f42323i;

        a(AbstractC11244i<? super T> abstractC11244i, InterfaceC11253b<? super T> interfaceC11253b, InterfaceC11253b<Throwable> interfaceC11253b2) {
            this.f42321g = abstractC11244i;
            this.f42322h = interfaceC11253b;
            this.f42323i = interfaceC11253b2;
        }

        @Override // p456rx.AbstractC11244i
        /* renamed from: c */
        public void mo29130c(T t) {
            try {
                this.f42322h.call(t);
                this.f42321g.mo29130c(t);
            } catch (Throwable th) {
                C11240a.m40144i(th, this, t);
            }
        }

        @Override // p456rx.AbstractC11244i
        public void onError(Throwable th) {
            try {
                this.f42323i.call(th);
                this.f42321g.onError(th);
            } catch (Throwable th2) {
                C11240a.m40140e(th2);
                this.f42321g.onError(new CompositeException(th, th2));
            }
        }
    }

    public C11284h1(Single<T> single, InterfaceC11253b<? super T> interfaceC11253b, InterfaceC11253b<Throwable> interfaceC11253b2) {
        this.f42318f = single;
        this.f42319g = interfaceC11253b;
        this.f42320h = interfaceC11253b2;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11244i<? super T> abstractC11244i) {
        a aVar = new a(abstractC11244i, this.f42319g, this.f42320h);
        abstractC11244i.m40149b(aVar);
        this.f42318f.m39928t(aVar);
    }
}
