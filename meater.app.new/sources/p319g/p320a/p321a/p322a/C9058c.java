package p319g.p320a.p321a.p322a;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.InterfaceC9072i;
import p323h.p324a.p329z.p343i.EnumC9175b;
import p355k.p356a.InterfaceC9728a;
import p355k.p356a.InterfaceC9730c;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.InterfaceC11246k;

/* compiled from: FlowableV2ToObservableV1.java */
/* renamed from: g.a.a.a.c */
/* loaded from: classes2.dex */
final class C9058c<T> implements C11234e.a<T> {

    /* renamed from: f */
    final InterfaceC9728a<T> f34891f;

    /* compiled from: FlowableV2ToObservableV1.java */
    /* renamed from: g.a.a.a.c$a */
    static final class a<T> extends AtomicReference<InterfaceC9730c> implements InterfaceC9072i<T>, InterfaceC11246k, InterfaceC11242g {

        /* renamed from: f */
        final AbstractC11245j<? super T> f34892f;

        /* renamed from: g */
        final AtomicLong f34893g = new AtomicLong();

        a(AbstractC11245j<? super T> abstractC11245j) {
            this.f34892f = abstractC11245j;
        }

        @Override // p355k.p356a.InterfaceC9729b
        /* renamed from: a */
        public void mo29121a() {
            this.f34892f.onCompleted();
        }

        @Override // p355k.p356a.InterfaceC9729b
        /* renamed from: b */
        public void mo29122b(InterfaceC9730c interfaceC9730c) {
            EnumC9175b.m29379q(this, this.f34893g, interfaceC9730c);
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return EnumC9175b.CANCELLED == get();
        }

        @Override // p355k.p356a.InterfaceC9729b
        public void onError(Throwable th) {
            this.f34892f.onError(th);
        }

        @Override // p355k.p356a.InterfaceC9729b
        public void onNext(T t) {
            this.f34892f.onNext(t);
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            if (j2 != 0) {
                EnumC9175b.m29378k(this, this.f34893g, j2);
            }
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            EnumC9175b.m29377g(this);
        }
    }

    C9058c(InterfaceC9728a<T> interfaceC9728a) {
        this.f34891f = interfaceC9728a;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        a aVar = new a(abstractC11245j);
        abstractC11245j.add(aVar);
        abstractC11245j.setProducer(aVar);
        this.f34891f.mo29173b(aVar);
    }
}
