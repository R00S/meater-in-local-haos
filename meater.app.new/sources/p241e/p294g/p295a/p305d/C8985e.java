package p241e.p294g.p295a.p305d;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* compiled from: TextViewTextChangeEventOnSubscribe.java */
/* renamed from: e.g.a.d.e */
/* loaded from: classes2.dex */
final class C8985e implements C11234e.a<C8984d> {

    /* renamed from: f */
    final TextView f34554f;

    /* compiled from: TextViewTextChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.d.e$a */
    class a implements TextWatcher {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f34555f;

        a(AbstractC11245j abstractC11245j) {
            this.f34555f = abstractC11245j;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if (this.f34555f.isUnsubscribed()) {
                return;
            }
            this.f34555f.onNext(C8984d.m28586b(C8985e.this.f34554f, charSequence, i2, i3, i4));
        }
    }

    /* compiled from: TextViewTextChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.d.e$b */
    class b extends AbstractC11247a {

        /* renamed from: f */
        final /* synthetic */ TextWatcher f34557f;

        b(TextWatcher textWatcher) {
            this.f34557f = textWatcher;
        }

        @Override // p456rx.p457l.AbstractC11247a
        protected void onUnsubscribe() {
            C8985e.this.f34554f.removeTextChangedListener(this.f34557f);
        }
    }

    C8985e(TextView textView) {
        this.f34554f = textView;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super C8984d> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        a aVar = new a(abstractC11245j);
        abstractC11245j.add(new b(aVar));
        this.f34554f.addTextChangedListener(aVar);
        TextView textView = this.f34554f;
        abstractC11245j.onNext(C8984d.m28586b(textView, textView.getText(), 0, 0, 0));
    }
}
