package H1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import r1.i;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f5454a;

    /* renamed from: b, reason: collision with root package name */
    private int f5455b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private int f5456c = 0;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: H1.a$a, reason: collision with other inner class name */
    private static class C0100a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f5457a;

        /* renamed from: b, reason: collision with root package name */
        private final g f5458b;

        C0100a(EditText editText, boolean z10) {
            this.f5457a = editText;
            g gVar = new g(editText, z10);
            this.f5458b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(H1.b.getInstance());
        }

        @Override // H1.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // H1.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f5457a, inputConnection, editorInfo);
        }

        @Override // H1.a.b
        void c(boolean z10) {
            this.f5458b.c(z10);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            throw null;
        }

        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        void c(boolean z10) {
            throw null;
        }
    }

    public a(EditText editText, boolean z10) {
        i.h(editText, "editText cannot be null");
        this.f5454a = new C0100a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f5454a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f5454a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f5454a.c(z10);
    }
}
