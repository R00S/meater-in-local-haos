package p241e.p294g.p295a.p305d;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* compiled from: TextViewAfterTextChangeEventOnSubscribe.java */
/* renamed from: e.g.a.d.c */
/* loaded from: classes2.dex */
final class C8983c implements C11234e.a<C8982b> {

    /* renamed from: f */
    final TextView f34545f;

    /* compiled from: TextViewAfterTextChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.d.c$a */
    class a implements TextWatcher {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f34546f;

        a(AbstractC11245j abstractC11245j) {
            this.f34546f = abstractC11245j;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.f34546f.isUnsubscribed()) {
                return;
            }
            this.f34546f.onNext(C8982b.m28583b(C8983c.this.f34545f, editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: TextViewAfterTextChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.d.c$b */
    class b extends AbstractC11247a {

        /* renamed from: f */
        final /* synthetic */ TextWatcher f34548f;

        b(TextWatcher textWatcher) {
            this.f34548f = textWatcher;
        }

        @Override // p456rx.p457l.AbstractC11247a
        protected void onUnsubscribe() {
            C8983c.this.f34545f.removeTextChangedListener(this.f34548f);
        }
    }

    C8983c(TextView textView) {
        this.f34545f = textView;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super C8982b> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        a aVar = new a(abstractC11245j);
        abstractC11245j.add(new b(aVar));
        this.f34545f.addTextChangedListener(aVar);
        TextView textView = this.f34545f;
        abstractC11245j.onNext(C8982b.m28583b(textView, textView.getEditableText()));
    }
}
