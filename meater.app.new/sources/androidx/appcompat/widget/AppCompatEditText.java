package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import s1.C4427d;
import v1.C4793a;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements s1.K {

    /* renamed from: B, reason: collision with root package name */
    private final C1983e f21204B;

    /* renamed from: C, reason: collision with root package name */
    private final C2001x f21205C;

    /* renamed from: D, reason: collision with root package name */
    private final C2000w f21206D;

    /* renamed from: E, reason: collision with root package name */
    private final androidx.core.widget.k f21207E;

    /* renamed from: F, reason: collision with root package name */
    private final C1988j f21208F;

    /* renamed from: G, reason: collision with root package name */
    private a f21209G;

    class a {
        a() {
        }

        public TextClassifier a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42380C);
    }

    private a getSuperCaller() {
        if (this.f21209G == null) {
            this.f21209G = new a();
        }
        return this.f21209G;
    }

    @Override // s1.K
    public C4427d a(C4427d c4427d) {
        return this.f21207E.a(this, c4427d);
    }

    void d(C1988j c1988j) {
        KeyListener keyListener = getKeyListener();
        if (c1988j.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c1988j.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1983e c1983e = this.f21204B;
        if (c1983e != null) {
            c1983e.b();
        }
        C2001x c2001x = this.f21205C;
        if (c2001x != null) {
            c2001x.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.s(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1983e c1983e = this.f21204B;
        if (c1983e != null) {
            return c1983e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1983e c1983e = this.f21204B;
        if (c1983e != null) {
            return c1983e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21205C.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21205C.k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2000w c2000w;
        return (Build.VERSION.SDK_INT >= 28 || (c2000w = this.f21206D) == null) ? getSuperCaller().a() : c2000w.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrC;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f21205C.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = C1990l.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrC = s1.X.C(this)) != null) {
            C4793a.c(editorInfo, strArrC);
            inputConnectionA = v1.c.c(this, inputConnectionA, editorInfo);
        }
        return this.f21208F.d(inputConnectionA, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C1996s.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (C1996s.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1983e c1983e = this.f21204B;
        if (c1983e != null) {
            c1983e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1983e c1983e = this.f21204B;
        if (c1983e != null) {
            c1983e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21205C;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21205C;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.t(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f21208F.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f21208F.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1983e c1983e = this.f21204B;
        if (c1983e != null) {
            c1983e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1983e c1983e = this.f21204B;
        if (c1983e != null) {
            c1983e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f21205C.w(colorStateList);
        this.f21205C.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f21205C.x(mode);
        this.f21205C.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2001x c2001x = this.f21205C;
        if (c2001x != null) {
            c2001x.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2000w c2000w;
        if (Build.VERSION.SDK_INT >= 28 || (c2000w = this.f21206D) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            c2000w.b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        V.a(this, getContext());
        C1983e c1983e = new C1983e(this);
        this.f21204B = c1983e;
        c1983e.e(attributeSet, i10);
        C2001x c2001x = new C2001x(this);
        this.f21205C = c2001x;
        c2001x.m(attributeSet, i10);
        c2001x.b();
        this.f21206D = new C2000w(this);
        this.f21207E = new androidx.core.widget.k();
        C1988j c1988j = new C1988j(this);
        this.f21208F = c1988j;
        c1988j.c(attributeSet, i10);
        d(c1988j);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
