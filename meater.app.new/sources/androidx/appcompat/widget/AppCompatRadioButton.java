package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.view.InterfaceC0310t;
import androidx.core.widget.InterfaceC0331l;
import p024c.p025a.C0823a;
import p024c.p025a.p026k.p027a.C0833a;

/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements InterfaceC0331l, InterfaceC0310t {

    /* renamed from: f */
    private final C0164g f803f;

    /* renamed from: g */
    private final C0158d f804g;

    /* renamed from: h */
    private final C0188s f805h;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5018G);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0158d c0158d = this.f804g;
        if (c0158d != null) {
            c0158d.m918b();
        }
        C0188s c0188s = this.f805h;
        if (c0188s != null) {
            c0188s.m1155b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0164g c0164g = this.f803f;
        return c0164g != null ? c0164g.m967b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.view.InterfaceC0310t
    public ColorStateList getSupportBackgroundTintList() {
        C0158d c0158d = this.f804g;
        if (c0158d != null) {
            return c0158d.m919c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0310t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0158d c0158d = this.f804g;
        if (c0158d != null) {
            return c0158d.m920d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0331l
    public ColorStateList getSupportButtonTintList() {
        C0164g c0164g = this.f803f;
        if (c0164g != null) {
            return c0164g.m968c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0164g c0164g = this.f803f;
        if (c0164g != null) {
            return c0164g.m969d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0158d c0158d = this.f804g;
        if (c0158d != null) {
            c0158d.m922f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0158d c0158d = this.f804g;
        if (c0158d != null) {
            c0158d.m923g(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) throws NoSuchFieldException {
        super.setButtonDrawable(drawable);
        C0164g c0164g = this.f803f;
        if (c0164g != null) {
            c0164g.m971f();
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0158d c0158d = this.f804g;
        if (c0158d != null) {
            c0158d.m925i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0158d c0158d = this.f804g;
        if (c0158d != null) {
            c0158d.m926j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0331l
    public void setSupportButtonTintList(ColorStateList colorStateList) throws NoSuchFieldException {
        C0164g c0164g = this.f803f;
        if (c0164g != null) {
            c0164g.m972g(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0331l
    public void setSupportButtonTintMode(PorterDuff.Mode mode) throws NoSuchFieldException {
        C0164g c0164g = this.f803f;
        if (c0164g != null) {
            c0164g.m973h(mode);
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException, IllegalArgumentException {
        super(C0179n0.m1077b(context), attributeSet, i2);
        C0175l0.m1068a(this, getContext());
        C0164g c0164g = new C0164g(this);
        this.f803f = c0164g;
        c0164g.m970e(attributeSet, i2);
        C0158d c0158d = new C0158d(this);
        this.f804g = c0158d;
        c0158d.m921e(attributeSet, i2);
        C0188s c0188s = new C0188s(this);
        this.f805h = c0188s;
        c0188s.m1165m(attributeSet, i2);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) throws NoSuchFieldException {
        setButtonDrawable(C0833a.m5262d(getContext(), i2));
    }
}
