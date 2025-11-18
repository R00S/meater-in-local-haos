package p241e.p294g.p295a.p304c;

import android.view.View;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;
import p456rx.p460m.InterfaceCallableC11255d;

/* compiled from: ViewLongClickOnSubscribe.java */
/* renamed from: e.g.a.c.e */
/* loaded from: classes2.dex */
final class C8979e implements C11234e.a<Void> {

    /* renamed from: f */
    final View f34535f;

    /* renamed from: g */
    final InterfaceCallableC11255d<Boolean> f34536g;

    /* compiled from: ViewLongClickOnSubscribe.java */
    /* renamed from: e.g.a.c.e$a */
    class a implements View.OnLongClickListener {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f34537f;

        a(AbstractC11245j abstractC11245j) {
            this.f34537f = abstractC11245j;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!C8979e.this.f34536g.call().booleanValue()) {
                return false;
            }
            if (this.f34537f.isUnsubscribed()) {
                return true;
            }
            this.f34537f.onNext(null);
            return true;
        }
    }

    /* compiled from: ViewLongClickOnSubscribe.java */
    /* renamed from: e.g.a.c.e$b */
    class b extends AbstractC11247a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11247a
        protected void onUnsubscribe() {
            C8979e.this.f34535f.setOnLongClickListener(null);
        }
    }

    C8979e(View view, InterfaceCallableC11255d<Boolean> interfaceCallableC11255d) {
        this.f34535f = view;
        this.f34536g = interfaceCallableC11255d;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super Void> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        a aVar = new a(abstractC11245j);
        abstractC11245j.add(new b());
        this.f34535f.setOnLongClickListener(aVar);
    }
}
