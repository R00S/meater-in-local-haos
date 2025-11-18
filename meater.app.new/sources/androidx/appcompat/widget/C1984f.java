package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import j.C3699a;

/* compiled from: AppCompatCheckedTextView.java */
/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1984f extends CheckedTextView {

    /* renamed from: B, reason: collision with root package name */
    private final C1985g f21682B;

    /* renamed from: C, reason: collision with root package name */
    private final C1983e f21683C;

    /* renamed from: D, reason: collision with root package name */
    private final C2001x f21684D;

    /* renamed from: E, reason: collision with root package name */
    private C1989k f21685E;

    public C1984f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42412s);
    }

    private C1989k getEmojiTextViewHelper() {
        if (this.f21685E == null) {
            this.f21685E = new C1989k(this);
        }
        return this.f21685E;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2001x c2001x = this.f21684D;
        if (c2001x != null) {
            c2001x.b();
        }
        C1983e c1983e = this.f21683C;
        if (c1983e != null) {
            c1983e.b();
        }
        C1985g c1985g = this.f21682B;
        if (c1985g != null) {
            c1985g.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.s(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1983e c1983e = this.f21683C;
        if (c1983e != null) {
            return c1983e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1983e c1983e = this.f21683C;
        if (c1983e != null) {
            return c1983e.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1985g c1985g = this.f21682B;
        if (c1985g != null) {
            return c1985g.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1985g c1985g = this.f21682B;
        if (c1985g != null) {
            return c1985g.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21684D.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21684D.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1990l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1983e c1983e = this.f21683C;
        if (c1983e != null) {
            c1983e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1983e c1983e = this.f21683C;
        if (c1983e != null) {
            c1983e.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1985g c1985g = this.f21682B;
        if (c1985g != null) {
            c1985g.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21684D;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21684D;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.t(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1983e c1983e = this.f21683C;
        if (c1983e != null) {
            c1983e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1983e c1983e = this.f21683C;
        if (c1983e != null) {
            c1983e.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1985g c1985g = this.f21682B;
        if (c1985g != null) {
            c1985g.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1985g c1985g = this.f21682B;
        if (c1985g != null) {
            c1985g.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f21684D.w(colorStateList);
        this.f21684D.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f21684D.x(mode);
        this.f21684D.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2001x c2001x = this.f21684D;
        if (c2001x != null) {
            c2001x.q(context, i10);
        }
    }

    public C1984f(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        V.a(this, getContext());
        C2001x c2001x = new C2001x(this);
        this.f21684D = c2001x;
        c2001x.m(attributeSet, i10);
        c2001x.b();
        C1983e c1983e = new C1983e(this);
        this.f21683C = c1983e;
        c1983e.e(attributeSet, i10);
        C1985g c1985g = new C1985g(this);
        this.f21682B = c1985g;
        c1985g.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(C3699a.b(getContext(), i10));
    }
}
