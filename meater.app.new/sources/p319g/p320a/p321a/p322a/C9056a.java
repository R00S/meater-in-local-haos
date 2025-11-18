package p319g.p320a.p321a.p322a;

import p323h.p324a.AbstractC9064b;
import p323h.p324a.InterfaceC9067d;
import p323h.p324a.p327x.InterfaceC9089c;
import p456rx.C11231b;
import p456rx.InterfaceC11232c;
import p456rx.InterfaceC11246k;

/* compiled from: CompletableV1ToCompletableV2.java */
/* renamed from: g.a.a.a.a */
/* loaded from: classes2.dex */
final class C9056a extends AbstractC9064b {

    /* renamed from: a */
    final C11231b f34885a;

    /* compiled from: CompletableV1ToCompletableV2.java */
    /* renamed from: g.a.a.a.a$a */
    static final class a implements InterfaceC11232c, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9067d f34886f;

        /* renamed from: g */
        InterfaceC11246k f34887g;

        a(InterfaceC9067d interfaceC9067d) {
            this.f34886f = interfaceC9067d;
        }

        @Override // p456rx.InterfaceC11232c
        /* renamed from: a */
        public void mo29114a(InterfaceC11246k interfaceC11246k) {
            this.f34887g = interfaceC11246k;
            this.f34886f.mo29119b(this);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            this.f34887g.unsubscribe();
        }

        @Override // p456rx.InterfaceC11232c
        public void onCompleted() {
            this.f34886f.mo29118a();
        }

        @Override // p456rx.InterfaceC11232c
        public void onError(Throwable th) {
            this.f34886f.onError(th);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f34887g.isUnsubscribed();
        }
    }

    C9056a(C11231b c11231b) {
        this.f34885a = c11231b;
    }

    @Override // p323h.p324a.AbstractC9064b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9067d interfaceC9067d) {
        this.f34885a.m39966J(new a(interfaceC9067d));
    }
}
