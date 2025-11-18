package p241e.p294g.p295a.p297b.p300b.p301a;

import p024c.p085v.p086a.C1020c;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* compiled from: SwipeRefreshLayoutRefreshOnSubscribe.java */
/* renamed from: e.g.a.b.b.a.d */
/* loaded from: classes2.dex */
final class C8966d implements C11234e.a<Void> {

    /* renamed from: f */
    final C1020c f34505f;

    /* compiled from: SwipeRefreshLayoutRefreshOnSubscribe.java */
    /* renamed from: e.g.a.b.b.a.d$a */
    class a implements C1020c.j {

        /* renamed from: a */
        final /* synthetic */ AbstractC11245j f34506a;

        a(AbstractC11245j abstractC11245j) {
            this.f34506a = abstractC11245j;
        }

        @Override // p024c.p085v.p086a.C1020c.j
        /* renamed from: a */
        public void mo6522a() {
            if (this.f34506a.isUnsubscribed()) {
                return;
            }
            this.f34506a.onNext(null);
        }
    }

    /* compiled from: SwipeRefreshLayoutRefreshOnSubscribe.java */
    /* renamed from: e.g.a.b.b.a.d$b */
    class b extends AbstractC11247a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11247a
        protected void onUnsubscribe() {
            C8966d.this.f34505f.setOnRefreshListener(null);
        }
    }

    C8966d(C1020c c1020c) {
        this.f34505f = c1020c;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super Void> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        a aVar = new a(abstractC11245j);
        abstractC11245j.add(new b());
        this.f34505f.setOnRefreshListener(aVar);
    }
}
