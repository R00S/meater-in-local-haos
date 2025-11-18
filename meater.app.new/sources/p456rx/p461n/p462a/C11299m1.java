package p456rx.p461n.p462a;

import p456rx.AbstractC11243h;
import p456rx.AbstractC11244i;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: SingleObserveOn.java */
/* renamed from: rx.n.a.m1 */
/* loaded from: classes3.dex */
public final class C11299m1<T> implements Single.InterfaceC11229j<T> {

    /* renamed from: f */
    final Single.InterfaceC11229j<T> f42425f;

    /* renamed from: g */
    final AbstractC11243h f42426g;

    /* compiled from: SingleObserveOn.java */
    /* renamed from: rx.n.a.m1$a */
    static final class a<T> extends AbstractC11244i<T> implements InterfaceC11252a {

        /* renamed from: g */
        final AbstractC11244i<? super T> f42427g;

        /* renamed from: h */
        final AbstractC11243h.a f42428h;

        /* renamed from: i */
        T f42429i;

        /* renamed from: j */
        Throwable f42430j;

        public a(AbstractC11244i<? super T> abstractC11244i, AbstractC11243h.a aVar) {
            this.f42427g = abstractC11244i;
            this.f42428h = aVar;
        }

        @Override // p456rx.AbstractC11244i
        /* renamed from: c */
        public void mo29130c(T t) {
            this.f42429i = t;
            this.f42428h.mo40146c(this);
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            try {
                Throwable th = this.f42430j;
                if (th != null) {
                    this.f42430j = null;
                    this.f42427g.onError(th);
                } else {
                    T t = this.f42429i;
                    this.f42429i = null;
                    this.f42427g.mo29130c(t);
                }
            } finally {
                this.f42428h.unsubscribe();
            }
        }

        @Override // p456rx.AbstractC11244i
        public void onError(Throwable th) {
            this.f42430j = th;
            this.f42428h.mo40146c(this);
        }
    }

    public C11299m1(Single.InterfaceC11229j<T> interfaceC11229j, AbstractC11243h abstractC11243h) {
        this.f42425f = interfaceC11229j;
        this.f42426g = abstractC11243h;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11244i<? super T> abstractC11244i) {
        AbstractC11243h.a aVarCreateWorker = this.f42426g.createWorker();
        a aVar = new a(abstractC11244i, aVarCreateWorker);
        abstractC11244i.m40149b(aVarCreateWorker);
        abstractC11244i.m40149b(aVar);
        this.f42425f.call(aVar);
    }
}
