package M0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import oa.InterfaceC4156a;

/* compiled from: RecordingInputConnection.android.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\"J\u001f\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\"J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\"J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\u0010J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u00101J\u0019\u00103\u001a\u0004\u0018\u00010\u001a2\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u00107J!\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b>\u00107J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0012H\u0016¢\u0006\u0004\b@\u00107J\u0019\u0010B\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u0011\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0012H\u0016¢\u0006\u0004\bL\u00107J\u0017\u0010N\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0006H\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u0012H\u0016¢\u0006\u0004\bQ\u0010RJ#\u0010W\u001a\u00020\u00062\b\u0010T\u001a\u0004\u0018\u00010S2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bW\u0010XJ)\u0010\\\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020Y2\u0006\u0010/\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\b\\\u0010]R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010a\u001a\u0004\bb\u0010\u0010R\u0016\u0010d\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010cR*\u0010k\u001a\u00020\u00022\u0006\u0010e\u001a\u00020\u00028\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010cR\u0016\u0010o\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010aR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\n0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010a¨\u0006v"}, d2 = {"LM0/A;", "Landroid/view/inputmethod/InputConnection;", "LM0/E;", "initState", "LM0/r;", "eventCallback", "", "autoCorrect", "<init>", "(LM0/E;LM0/r;Z)V", "LM0/n;", "editCommand", "Loa/F;", "a", "(LM0/n;)V", "b", "()Z", "c", "", "code", "d", "(I)V", "beginBatchEdit", "endBatchEdit", "closeConnection", "()V", "", "text", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "LM0/r;", "getEventCallback", "()LM0/r;", "Z", "getAutoCorrect", "I", "batchDepth", "value", "LM0/E;", "getMTextFieldValue$ui_release", "()LM0/E;", "setMTextFieldValue$ui_release", "(LM0/E;)V", "mTextFieldValue", "e", "currentExtractedTextRequestToken", "f", "extractedTextMonitorMode", "", "g", "Ljava/util/List;", "editCommands", "h", "isActive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* loaded from: classes.dex */
public final class A implements InputConnection {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r eventCallback;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean autoCorrect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int batchDepth;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue mTextFieldValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentExtractedTextRequestToken;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean extractedTextMonitorMode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<n> editCommands = new ArrayList();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isActive = true;

    public A(TextFieldValue textFieldValue, r rVar, boolean z10) {
        this.eventCallback = rVar;
        this.autoCorrect = z10;
        this.mTextFieldValue = textFieldValue;
    }

    private final void a(n editCommand) {
        b();
        try {
            this.editCommands.add(editCommand);
        } finally {
            c();
        }
    }

    private final boolean b() {
        this.batchDepth++;
        return true;
    }

    private final boolean c() {
        int i10 = this.batchDepth - 1;
        this.batchDepth = i10;
        if (i10 == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.d(kotlin.collections.r.Z0(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final void d(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.isActive;
        return z10 ? b() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo text) {
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.isActive;
        return z10 ? this.autoCorrect : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence text, int newCursorPosition) {
        boolean z10 = this.isActive;
        if (z10) {
            a(new CommitTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        a(new DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        a(new DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        a(new o());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.mTextFieldValue.d(), H0.H.j(this.mTextFieldValue.getSelection()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        boolean z10 = (flags & 1) != 0;
        this.extractedTextMonitorMode = z10;
        if (z10) {
            this.currentExtractedTextRequestToken = request != null ? request.token : 0;
        }
        return u.a(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int flags) {
        if (H0.H.f(this.mTextFieldValue.getSelection())) {
            return null;
        }
        return F.a(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return F.b(this.mTextFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return F.c(this.mTextFieldValue, maxChars).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id2) {
        boolean z10 = this.isActive;
        if (z10) {
            z10 = false;
            switch (id2) {
                case R.id.selectAll:
                    a(new SetSelectionCommand(0, this.mTextFieldValue.d().length()));
                    break;
                case R.id.cut:
                    d(277);
                    break;
                case R.id.copy:
                    d(278);
                    break;
                case R.id.paste:
                    d(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int iA;
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                    iA = p.INSTANCE.c();
                    break;
                case 3:
                    iA = p.INSTANCE.g();
                    break;
                case 4:
                    iA = p.INSTANCE.h();
                    break;
                case 5:
                    iA = p.INSTANCE.d();
                    break;
                case 6:
                    iA = p.INSTANCE.b();
                    break;
                case 7:
                    iA = p.INSTANCE.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + editorAction);
                    iA = p.INSTANCE.a();
                    break;
            }
        } else {
            iA = p.INSTANCE.a();
        }
        this.eventCallback.c(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String action, Bundle data) {
        boolean z10 = this.isActive;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.isActive;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (cursorUpdateMode & 1) != 0;
        boolean z17 = (cursorUpdateMode & 2) != 0;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            boolean z18 = (cursorUpdateMode & 16) != 0;
            boolean z19 = (cursorUpdateMode & 8) != 0;
            boolean z20 = (cursorUpdateMode & 4) != 0;
            if (i10 >= 34 && (cursorUpdateMode & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z20 || z15) {
                z11 = z15;
                z10 = z20;
                z13 = z19;
                z12 = z18;
            } else if (i10 >= 34) {
                z12 = true;
                z13 = true;
                z10 = true;
                z11 = true;
            } else {
                z11 = z15;
                z12 = true;
                z13 = true;
                z10 = true;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        this.eventCallback.b(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        this.eventCallback.a(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        boolean z10 = this.isActive;
        if (z10) {
            a(new SetComposingRegionCommand(start, end));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        boolean z10 = this.isActive;
        if (z10) {
            a(new SetComposingTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        a(new SetSelectionCommand(start, end));
        return true;
    }
}
