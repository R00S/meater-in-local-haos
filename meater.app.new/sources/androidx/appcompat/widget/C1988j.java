package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: AppCompatEmojiEditTextHelper.java */
/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1988j {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f21712a;

    /* renamed from: b, reason: collision with root package name */
    private final H1.a f21713b;

    C1988j(EditText editText) {
        this.f21712a = editText;
        this.f21713b = new H1.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f21713b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f21712a.getContext().obtainStyledAttributes(attributeSet, i.j.f42715g0, i10, 0);
        try {
            int i11 = i.j.f42785u0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f21713b.b(inputConnection, editorInfo);
    }

    void e(boolean z10) {
        this.f21713b.c(z10);
    }
}
