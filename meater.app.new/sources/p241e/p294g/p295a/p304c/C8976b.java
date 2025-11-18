package p241e.p294g.p295a.p304c;

import android.view.View;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* compiled from: ViewClickOnSubscribe.java */
/* renamed from: e.g.a.c.b */
/* loaded from: classes2.dex */
final class C8976b implements C11234e.a<Void> {

    /* renamed from: f */
    final View f34526f;

    /* compiled from: ViewClickOnSubscribe.java */
    /* renamed from: e.g.a.c.b$a */
    class a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f34527f;

        a(AbstractC11245j abstractC11245j) {
            this.f34527f = abstractC11245j;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f34527f.isUnsubscribed()) {
                return;
            }
            this.f34527f.onNext(null);
        }
    }

    /* compiled from: ViewClickOnSubscribe.java */
    /* renamed from: e.g.a.c.b$b */
    class b extends AbstractC11247a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11247a
        protected void onUnsubscribe() {
            C8976b.this.f34526f.setOnClickListener(null);
        }
    }

    C8976b(View view) {
        this.f34526f = view;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super Void> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        a aVar = new a(abstractC11245j);
        abstractC11245j.add(new b());
        this.f34526f.setOnClickListener(aVar);
    }
}
