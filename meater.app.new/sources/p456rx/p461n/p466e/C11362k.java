package p456rx.p461n.p466e;

import p456rx.AbstractC11243h;
import p456rx.AbstractC11244i;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p461n.p464c.C11337b;

/* compiled from: ScalarSynchronousSingle.java */
/* renamed from: rx.n.e.k */
/* loaded from: classes3.dex */
public final class C11362k<T> extends Single<T> {

    /* renamed from: b */
    final T f42910b;

    /* compiled from: ScalarSynchronousSingle.java */
    /* renamed from: rx.n.e.k$a */
    class a implements Single.InterfaceC11229j<T> {

        /* renamed from: f */
        final /* synthetic */ Object f42911f;

        a(Object obj) {
            this.f42911f = obj;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11244i<? super T> abstractC11244i) {
            abstractC11244i.mo29130c((Object) this.f42911f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ScalarSynchronousSingle.java */
    /* renamed from: rx.n.e.k$b */
    class b<R> implements Single.InterfaceC11229j<R> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11256e f42912f;

        /* compiled from: ScalarSynchronousSingle.java */
        /* renamed from: rx.n.e.k$b$a */
        class a extends AbstractC11244i<R> {

            /* renamed from: g */
            final /* synthetic */ AbstractC11244i f42914g;

            a(AbstractC11244i abstractC11244i) {
                this.f42914g = abstractC11244i;
            }

            @Override // p456rx.AbstractC11244i
            /* renamed from: c */
            public void mo29130c(R r) {
                this.f42914g.mo29130c(r);
            }

            @Override // p456rx.AbstractC11244i
            public void onError(Throwable th) {
                this.f42914g.onError(th);
            }
        }

        b(InterfaceC11256e interfaceC11256e) {
            this.f42912f = interfaceC11256e;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11244i<? super R> abstractC11244i) {
            Single single = (Single) this.f42912f.call(C11362k.this.f42910b);
            if (single instanceof C11362k) {
                abstractC11244i.mo29130c(((C11362k) single).f42910b);
                return;
            }
            a aVar = new a(abstractC11244i);
            abstractC11244i.m40149b(aVar);
            single.m39928t(aVar);
        }
    }

    /* compiled from: ScalarSynchronousSingle.java */
    /* renamed from: rx.n.e.k$c */
    static final class c<T> implements Single.InterfaceC11229j<T> {

        /* renamed from: f */
        private final C11337b f42916f;

        /* renamed from: g */
        private final T f42917g;

        c(C11337b c11337b, T t) {
            this.f42916f = c11337b;
            this.f42917g = t;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11244i<? super T> abstractC11244i) {
            abstractC11244i.m40149b(this.f42916f.m40385a(new e(abstractC11244i, this.f42917g)));
        }
    }

    /* compiled from: ScalarSynchronousSingle.java */
    /* renamed from: rx.n.e.k$d */
    static final class d<T> implements Single.InterfaceC11229j<T> {

        /* renamed from: f */
        private final AbstractC11243h f42918f;

        /* renamed from: g */
        private final T f42919g;

        d(AbstractC11243h abstractC11243h, T t) {
            this.f42918f = abstractC11243h;
            this.f42919g = t;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11244i<? super T> abstractC11244i) {
            AbstractC11243h.a aVarCreateWorker = this.f42918f.createWorker();
            abstractC11244i.m40149b(aVarCreateWorker);
            aVarCreateWorker.mo40146c(new e(abstractC11244i, this.f42919g));
        }
    }

    /* compiled from: ScalarSynchronousSingle.java */
    /* renamed from: rx.n.e.k$e */
    static final class e<T> implements InterfaceC11252a {

        /* renamed from: f */
        private final AbstractC11244i<? super T> f42920f;

        /* renamed from: g */
        private final T f42921g;

        e(AbstractC11244i<? super T> abstractC11244i, T t) {
            this.f42920f = abstractC11244i;
            this.f42921g = t;
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            try {
                this.f42920f.mo29130c(this.f42921g);
            } catch (Throwable th) {
                this.f42920f.onError(th);
            }
        }
    }

    protected C11362k(T t) {
        super(new a(t));
        this.f42910b = t;
    }

    /* renamed from: D */
    public static <T> C11362k<T> m40456D(T t) {
        return new C11362k<>(t);
    }

    /* renamed from: E */
    public <R> Single<R> m40457E(InterfaceC11256e<? super T, ? extends Single<? extends R>> interfaceC11256e) {
        return Single.m39909b(new b(interfaceC11256e));
    }

    /* renamed from: F */
    public Single<T> m40458F(AbstractC11243h abstractC11243h) {
        return abstractC11243h instanceof C11337b ? Single.m39909b(new c((C11337b) abstractC11243h, this.f42910b)) : Single.m39909b(new d(abstractC11243h, this.f42910b));
    }
}
