package p319g.p320a.p321a.p322a;

import p323h.p324a.InterfaceC9067d;
import p323h.p324a.InterfaceC9069f;
import p323h.p324a.p327x.InterfaceC9089c;
import p456rx.C11231b;
import p456rx.InterfaceC11232c;
import p456rx.InterfaceC11246k;

/* compiled from: CompletableV2ToCompletableV1.java */
/* renamed from: g.a.a.a.b */
/* loaded from: classes2.dex */
final class C9057b implements C11231b.w {

    /* renamed from: f */
    final InterfaceC9069f f34888f;

    /* compiled from: CompletableV2ToCompletableV1.java */
    /* renamed from: g.a.a.a.b$a */
    static final class a implements InterfaceC9067d, InterfaceC11246k {

        /* renamed from: f */
        final InterfaceC11232c f34889f;

        /* renamed from: g */
        InterfaceC9089c f34890g;

        a(InterfaceC11232c interfaceC11232c) {
            this.f34889f = interfaceC11232c;
        }

        @Override // p323h.p324a.InterfaceC9067d
        /* renamed from: a */
        public void mo29118a() {
            this.f34889f.onCompleted();
        }

        @Override // p323h.p324a.InterfaceC9067d
        /* renamed from: b */
        public void mo29119b(InterfaceC9089c interfaceC9089c) {
            this.f34890g = interfaceC9089c;
            this.f34889f.mo29114a(this);
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f34890g.mo29116q();
        }

        @Override // p323h.p324a.InterfaceC9067d
        public void onError(Throwable th) {
            this.f34889f.onError(th);
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            this.f34890g.mo29115k();
        }
    }

    C9057b(InterfaceC9069f interfaceC9069f) {
        this.f34888f = interfaceC9069f;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(InterfaceC11232c interfaceC11232c) {
        this.f34888f.mo29160b(new a(interfaceC11232c));
    }
}
