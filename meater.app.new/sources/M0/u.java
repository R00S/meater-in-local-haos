package M0;

import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;

/* compiled from: InputState.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LM0/E;", "Landroid/view/inputmethod/ExtractedText;", "a", "(LM0/E;)Landroid/view/inputmethod/ExtractedText;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {
    public static final ExtractedText a(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.d();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.d().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = H0.H.j(textFieldValue.getSelection());
        extractedText.selectionEnd = H0.H.i(textFieldValue.getSelection());
        extractedText.flags = !Ub.n.K(textFieldValue.d(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
