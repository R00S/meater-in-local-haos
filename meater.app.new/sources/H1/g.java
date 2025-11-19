package H1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: B, reason: collision with root package name */
    private final EditText f5475B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f5476C;

    /* renamed from: D, reason: collision with root package name */
    private f.AbstractC0355f f5477D;

    /* renamed from: E, reason: collision with root package name */
    private int f5478E = Integer.MAX_VALUE;

    /* renamed from: F, reason: collision with root package name */
    private int f5479F = 0;

    /* renamed from: G, reason: collision with root package name */
    private boolean f5480G = true;

    /* compiled from: EmojiTextWatcher.java */
    private static class a extends f.AbstractC0355f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<EditText> f5481a;

        a(EditText editText) {
            this.f5481a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC0355f
        public void b() {
            super.b();
            g.b(this.f5481a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f5475B = editText;
        this.f5476C = z10;
    }

    private f.AbstractC0355f a() {
        if (this.f5477D == null) {
            this.f5477D = new a(this.f5475B);
        }
        return this.f5477D;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f5480G && (this.f5476C || androidx.emoji2.text.f.i())) ? false : true;
    }

    public void c(boolean z10) {
        if (this.f5480G != z10) {
            if (this.f5477D != null) {
                androidx.emoji2.text.f.c().u(this.f5477D);
            }
            this.f5480G = z10;
            if (z10) {
                b(this.f5475B, androidx.emoji2.text.f.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f5475B.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = androidx.emoji2.text.f.c().e();
        if (iE != 0) {
            if (iE == 1) {
                androidx.emoji2.text.f.c().s((Spannable) charSequence, i10, i10 + i12, this.f5478E, this.f5479F);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
