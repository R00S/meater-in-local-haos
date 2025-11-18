package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C0168i;
import com.google.android.material.internal.C8027e;
import com.google.android.material.internal.C8032j;
import com.google.android.material.theme.p178a.C8079a;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.C8918l;

/* loaded from: classes2.dex */
public class TextInputEditText extends C0168i {

    /* renamed from: i */
    private final Rect f30505i;

    /* renamed from: j */
    private boolean f30506j;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8908b.f33826p);
    }

    /* renamed from: a */
    private String m24792a(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        boolean z3 = !TextUtils.isEmpty(helperText);
        boolean z4 = !TextUtils.isEmpty(error);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = z2 ? hint.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(((z4 || z3) && !TextUtils.isEmpty(string)) ? ", " : HttpUrl.FRAGMENT_ENCODE_SET);
        String string2 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string2);
        if (z4) {
            helperText = error;
        } else if (!z3) {
            helperText = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append((Object) helperText);
        String string3 = sb2.toString();
        if (!z) {
            return !TextUtils.isEmpty(string3) ? string3 : HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) text);
        if (!TextUtils.isEmpty(string3)) {
            str = ", " + string3;
        }
        sb3.append(str);
        return sb3.toString();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f30506j || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f30505i);
        rect.bottom = this.f30505i.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f30506j && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.f30505i, point);
            rect.bottom = this.f30505i.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.isProvidingHint()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.isProvidingHint() && super.getHint() == null && C8027e.m24662a()) {
            setHint(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    @Override // androidx.appcompat.widget.C0168i, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        accessibilityNodeInfo.setText(m24792a(textInputLayout));
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean zRequestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f30506j) {
            this.f30505i.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(C8910d.f33856J), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f30505i, true);
        }
        return zRequestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f30506j = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i2) {
        super(C8079a.m24906c(context, attributeSet, i2, 0), attributeSet, i2);
        this.f30505i = new Rect();
        TypedArray typedArrayM24694h = C8032j.m24694h(context, attributeSet, C8918l.f34082L4, i2, C8917k.f33987l, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayM24694h.getBoolean(C8918l.f34089M4, false));
        typedArrayM24694h.recycle();
    }
}
