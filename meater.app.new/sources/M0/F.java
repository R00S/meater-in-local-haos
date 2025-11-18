package M0;

import H0.C1060d;
import kotlin.Metadata;

/* compiled from: TextFieldValue.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LM0/E;", "", "maxChars", "LH0/d;", "c", "(LM0/E;I)LH0/d;", "b", "a", "(LM0/E;)LH0/d;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F {
    public static final C1060d a(TextFieldValue textFieldValue) {
        return textFieldValue.getText().q(textFieldValue.getSelection());
    }

    public static final C1060d b(TextFieldValue textFieldValue, int i10) {
        return textFieldValue.getText().subSequence(H0.H.i(textFieldValue.getSelection()), Math.min(H0.H.i(textFieldValue.getSelection()) + i10, textFieldValue.d().length()));
    }

    public static final C1060d c(TextFieldValue textFieldValue, int i10) {
        return textFieldValue.getText().subSequence(Math.max(0, H0.H.j(textFieldValue.getSelection()) - i10), H0.H.j(textFieldValue.getSelection()));
    }
}
