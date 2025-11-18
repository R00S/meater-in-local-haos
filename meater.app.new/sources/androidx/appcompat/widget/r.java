package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import j.C3699a;

/* compiled from: AppCompatRadioButton.java */
/* loaded from: classes.dex */
public class r extends RadioButton implements androidx.core.widget.l {

    /* renamed from: B, reason: collision with root package name */
    private final C1986h f21733B;

    /* renamed from: C, reason: collision with root package name */
    private final C1983e f21734C;

    /* renamed from: D, reason: collision with root package name */
    private final C2001x f21735D;

    /* renamed from: E, reason: collision with root package name */
    private C1989k f21736E;

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42385H);
    }

    private C1989k getEmojiTextViewHelper() {
        if (this.f21736E == null) {
            this.f21736E = new C1989k(this);
        }
        return this.f21736E;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1983e c1983e = this.f21734C;
        if (c1983e != null) {
            c1983e.b();
        }
        C2001x c2001x = this.f21735D;
        if (c2001x != null) {
            c2001x.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1983e c1983e = this.f21734C;
        if (c1983e != null) {
            return c1983e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1983e c1983e = this.f21734C;
        if (c1983e != null) {
            return c1983e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public ColorStateList getSupportButtonTintList() {
        C1986h c1986h = this.f21733B;
        if (c1986h != null) {
            return c1986h.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1986h c1986h = this.f21733B;
        if (c1986h != null) {
            return c1986h.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21735D.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21735D.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1983e c1983e = this.f21734C;
        if (c1983e != null) {
            c1983e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1983e c1983e = this.f21734C;
        if (c1983e != null) {
            c1983e.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1986h c1986h = this.f21733B;
        if (c1986h != null) {
            c1986h.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21735D;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21735D;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1983e c1983e = this.f21734C;
        if (c1983e != null) {
            c1983e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1983e c1983e = this.f21734C;
        if (c1983e != null) {
            c1983e.j(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1986h c1986h = this.f21733B;
        if (c1986h != null) {
            c1986h.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1986h c1986h = this.f21733B;
        if (c1986h != null) {
            c1986h.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f21735D.w(colorStateList);
        this.f21735D.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f21735D.x(mode);
        this.f21735D.b();
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        V.a(this, getContext());
        C1986h c1986h = new C1986h(this);
        this.f21733B = c1986h;
        c1986h.d(attributeSet, i10);
        C1983e c1983e = new C1983e(this);
        this.f21734C = c1983e;
        c1983e.e(attributeSet, i10);
        C2001x c2001x = new C2001x(this);
        this.f21735D = c2001x;
        c2001x.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C3699a.b(getContext(), i10));
    }
}
