package p241e.p294g.p295a.p304c;

import android.view.View;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* compiled from: ViewFocusChangeOnSubscribe.java */
/* renamed from: e.g.a.c.d */
/* loaded from: classes2.dex */
final class C8978d implements C11234e.a<Boolean> {

    /* renamed from: f */
    final View f34531f;

    /* compiled from: ViewFocusChangeOnSubscribe.java */
    /* renamed from: e.g.a.c.d$a */
    class a implements View.OnFocusChangeListener {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f34532f;

        a(AbstractC11245j abstractC11245j) {
            this.f34532f = abstractC11245j;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (this.f34532f.isUnsubscribed()) {
                return;
            }
            this.f34532f.onNext(Boolean.valueOf(z));
        }
    }

    /* compiled from: ViewFocusChangeOnSubscribe.java */
    /* renamed from: e.g.a.c.d$b */
    class b extends AbstractC11247a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11247a
        protected void onUnsubscribe() {
            C8978d.this.f34531f.setOnFocusChangeListener(null);
        }
    }

    C8978d(View view) {
        this.f34531f = view;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super Boolean> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        a aVar = new a(abstractC11245j);
        abstractC11245j.add(new b());
        this.f34531f.setOnFocusChangeListener(aVar);
        abstractC11245j.onNext(Boolean.valueOf(this.f34531f.hasFocus()));
    }
}
