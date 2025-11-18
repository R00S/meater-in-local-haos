package p456rx.p461n.p462a;

import p456rx.AbstractC11244i;
import p456rx.C11231b;
import p456rx.InterfaceC11232c;
import p456rx.InterfaceC11246k;
import p456rx.Single;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: CompletableFlatMapSingleToCompletable.java */
/* renamed from: rx.n.a.c */
/* loaded from: classes3.dex */
public final class C11267c<T> implements C11231b.w {

    /* renamed from: f */
    final Single<T> f42203f;

    /* renamed from: g */
    final InterfaceC11256e<? super T, ? extends C11231b> f42204g;

    /* compiled from: CompletableFlatMapSingleToCompletable.java */
    /* renamed from: rx.n.a.c$a */
    static final class a<T> extends AbstractC11244i<T> implements InterfaceC11232c {

        /* renamed from: g */
        final InterfaceC11232c f42205g;

        /* renamed from: h */
        final InterfaceC11256e<? super T, ? extends C11231b> f42206h;

        public a(InterfaceC11232c interfaceC11232c, InterfaceC11256e<? super T, ? extends C11231b> interfaceC11256e) {
            this.f42205g = interfaceC11232c;
            this.f42206h = interfaceC11256e;
        }

        @Override // p456rx.InterfaceC11232c
        /* renamed from: a */
        public void mo29114a(InterfaceC11246k interfaceC11246k) {
            m40149b(interfaceC11246k);
        }

        @Override // p456rx.AbstractC11244i
        /* renamed from: c */
        public void mo29130c(T t) {
            try {
                C11231b c11231bCall = this.f42206h.call(t);
                if (c11231bCall == null) {
                    onError(new NullPointerException("The mapper returned a null Completable"));
                } else {
                    c11231bCall.m39966J(this);
                }
            } catch (Throwable th) {
                C11240a.m40140e(th);
                onError(th);
            }
        }

        @Override // p456rx.InterfaceC11232c
        public void onCompleted() {
            this.f42205g.onCompleted();
        }

        @Override // p456rx.AbstractC11244i
        public void onError(Throwable th) {
            this.f42205g.onError(th);
        }
    }

    public C11267c(Single<T> single, InterfaceC11256e<? super T, ? extends C11231b> interfaceC11256e) {
        this.f42203f = single;
        this.f42204g = interfaceC11256e;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(InterfaceC11232c interfaceC11232c) {
        a aVar = new a(interfaceC11232c, this.f42204g);
        interfaceC11232c.mo29114a(aVar);
        this.f42203f.m39928t(aVar);
    }
}
