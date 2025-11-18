package p319g.p320a.p321a.p322a;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.InterfaceC9084u;
import p323h.p324a.InterfaceC9086w;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.EnumC9103c;
import p456rx.AbstractC11244i;
import p456rx.InterfaceC11246k;
import p456rx.Single;

/* compiled from: SingleV2ToSingleV1.java */
/* renamed from: g.a.a.a.f */
/* loaded from: classes2.dex */
final class C9061f<T> implements Single.InterfaceC11229j<T> {

    /* renamed from: f */
    final InterfaceC9086w<T> f34896f;

    /* compiled from: SingleV2ToSingleV1.java */
    /* renamed from: g.a.a.a.f$a */
    static final class a<T> extends AtomicReference<InterfaceC9089c> implements InterfaceC9084u<T>, InterfaceC11246k {

        /* renamed from: f */
        final AbstractC11244i<? super T> f34897f;

        a(AbstractC11244i<? super T> abstractC11244i) {
            this.f34897f = abstractC11244i;
        }

        @Override // p323h.p324a.InterfaceC9084u
        /* renamed from: b */
        public void mo29132b(InterfaceC9089c interfaceC9089c) {
            EnumC9103c.m29248A(this, interfaceC9089c);
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return EnumC9103c.m29251u(get());
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onError(Throwable th) {
            this.f34897f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onSuccess(T t) {
            this.f34897f.mo29130c(t);
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            EnumC9103c.m29250g(this);
        }
    }

    C9061f(InterfaceC9086w<T> interfaceC9086w) {
        this.f34896f = interfaceC9086w;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11244i<? super T> abstractC11244i) {
        a aVar = new a(abstractC11244i);
        abstractC11244i.m40149b(aVar);
        this.f34896f.mo29228b(aVar);
    }
}
