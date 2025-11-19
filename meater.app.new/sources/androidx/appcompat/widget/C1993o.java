package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import j.C3699a;

/* compiled from: AppCompatMultiAutoCompleteTextView.java */
/* renamed from: androidx.appcompat.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1993o extends MultiAutoCompleteTextView {

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f21724E = {R.attr.popupBackground};

    /* renamed from: B, reason: collision with root package name */
    private final C1983e f21725B;

    /* renamed from: C, reason: collision with root package name */
    private final C2001x f21726C;

    /* renamed from: D, reason: collision with root package name */
    private final C1988j f21727D;

    public C1993o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42409p);
    }

    void a(C1988j c1988j) {
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
        C1983e c1983e = this.f21725B;
        if (c1983e != null) {
            c1983e.b();
        }
        C2001x c2001x = this.f21726C;
        if (c2001x != null) {
            c2001x.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1983e c1983e = this.f21725B;
        if (c1983e != null) {
            return c1983e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1983e c1983e = this.f21725B;
        if (c1983e != null) {
            return c1983e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21726C.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21726C.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f21727D.d(C1990l.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1983e c1983e = this.f21725B;
        if (c1983e != null) {
            c1983e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1983e c1983e = this.f21725B;
        if (c1983e != null) {
            c1983e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21726C;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21726C;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(C3699a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f21727D.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f21727D.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1983e c1983e = this.f21725B;
        if (c1983e != null) {
            c1983e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1983e c1983e = this.f21725B;
        if (c1983e != null) {
            c1983e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f21726C.w(colorStateList);
        this.f21726C.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f21726C.x(mode);
        this.f21726C.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2001x c2001x = this.f21726C;
        if (c2001x != null) {
            c2001x.q(context, i10);
        }
    }

    public C1993o(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        V.a(this, getContext());
        a0 a0VarV = a0.v(getContext(), attributeSet, f21724E, i10, 0);
        if (a0VarV.s(0)) {
            setDropDownBackgroundDrawable(a0VarV.g(0));
        }
        a0VarV.x();
        C1983e c1983e = new C1983e(this);
        this.f21725B = c1983e;
        c1983e.e(attributeSet, i10);
        C2001x c2001x = new C2001x(this);
        this.f21726C = c2001x;
        c2001x.m(attributeSet, i10);
        c2001x.b();
        C1988j c1988j = new C1988j(this);
        this.f21727D = c1988j;
        c1988j.c(attributeSet, i10);
        a(c1988j);
    }
}
