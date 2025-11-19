package M0;

import M0.p;
import M0.v;
import M0.w;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import v1.C4793a;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Loa/F;", "i", "(Landroid/view/inputmethod/EditorInfo;)V", "LM0/q;", "imeOptions", "LM0/E;", "textFieldValue", "h", "(Landroid/view/inputmethod/EditorInfo;LM0/q;LM0/E;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "d", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "g", "(II)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {
    public static final Executor d(final Choreographer choreographer) {
        return new Executor() { // from class: M0.I
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                K.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: M0.J
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                K.f(runnable, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j10) {
        runnable.run();
    }

    private static final boolean g(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void h(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        int imeAction = imeOptions.getImeAction();
        p.Companion companion = p.INSTANCE;
        int i10 = 6;
        if (p.l(imeAction, companion.a())) {
            if (!imeOptions.getSingleLine()) {
                i10 = 0;
            }
        } else if (p.l(imeAction, companion.e())) {
            i10 = 1;
        } else if (p.l(imeAction, companion.c())) {
            i10 = 2;
        } else if (p.l(imeAction, companion.d())) {
            i10 = 5;
        } else if (p.l(imeAction, companion.f())) {
            i10 = 7;
        } else if (p.l(imeAction, companion.g())) {
            i10 = 3;
        } else if (p.l(imeAction, companion.h())) {
            i10 = 4;
        } else if (!p.l(imeAction, companion.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        imeOptions.f();
        int keyboardType = imeOptions.getKeyboardType();
        w.Companion companion2 = w.INSTANCE;
        if (w.k(keyboardType, companion2.h())) {
            editorInfo.inputType = 1;
        } else if (w.k(keyboardType, companion2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (w.k(keyboardType, companion2.d())) {
            editorInfo.inputType = 2;
        } else if (w.k(keyboardType, companion2.g())) {
            editorInfo.inputType = 3;
        } else if (w.k(keyboardType, companion2.i())) {
            editorInfo.inputType = 17;
        } else if (w.k(keyboardType, companion2.c())) {
            editorInfo.inputType = 33;
        } else if (w.k(keyboardType, companion2.f())) {
            editorInfo.inputType = 129;
        } else if (w.k(keyboardType, companion2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!w.k(keyboardType, companion2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (p.l(imeOptions.getImeAction(), companion.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            v.Companion companion3 = v.INSTANCE;
            if (v.f(capitalization, companion3.a())) {
                editorInfo.inputType |= 4096;
            } else if (v.f(capitalization, companion3.d())) {
                editorInfo.inputType |= 8192;
            } else if (v.f(capitalization, companion3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = H0.H.k(textFieldValue.getSelection());
        editorInfo.initialSelEnd = H0.H.g(textFieldValue.getSelection());
        C4793a.e(editorInfo, textFieldValue.d());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.f.i()) {
            androidx.emoji2.text.f.c().v(editorInfo);
        }
    }
}
