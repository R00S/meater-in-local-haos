package p319g.p320a.p321a.p322a;

import p323h.p324a.AbstractC9082s;
import p323h.p324a.InterfaceC9084u;
import p323h.p324a.p327x.InterfaceC9089c;
import p456rx.AbstractC11244i;
import p456rx.Single;

/* compiled from: SingleV1ToSingleV2.java */
/* renamed from: g.a.a.a.e */
/* loaded from: classes2.dex */
final class C9060e<T> extends AbstractC9082s<T> {

    /* renamed from: a */
    final Single<T> f34894a;

    /* compiled from: SingleV1ToSingleV2.java */
    /* renamed from: g.a.a.a.e$a */
    static final class a<T> extends AbstractC11244i<T> implements InterfaceC9089c {

        /* renamed from: g */
        final InterfaceC9084u<? super T> f34895g;

        a(InterfaceC9084u<? super T> interfaceC9084u) {
            this.f34895g = interfaceC9084u;
        }

        @Override // p456rx.AbstractC11244i
        /* renamed from: c */
        public void mo29130c(T t) {
            if (t == null) {
                this.f34895g.onError(new NullPointerException("The upstream 1.x Single signalled a null value which is not supported in 2.x"));
            } else {
                this.f34895g.onSuccess(t);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            unsubscribe();
        }

        @Override // p456rx.AbstractC11244i
        public void onError(Throwable th) {
            this.f34895g.onError(th);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return isUnsubscribed();
        }
    }

    C9060e(Single<T> single) {
        this.f34894a = single;
    }

    @Override // p323h.p324a.AbstractC9082s
    /* renamed from: h */
    protected void mo29129h(InterfaceC9084u<? super T> interfaceC9084u) {
        a aVar = new a(interfaceC9084u);
        interfaceC9084u.mo29132b(aVar);
        this.f34894a.m39928t(aVar);
    }
}
