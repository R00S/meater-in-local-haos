package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.view.InterfaceC0310t;
import p024c.p025a.C0823a;
import p024c.p025a.p026k.p027a.C0833a;

/* compiled from: AppCompatMultiAutoCompleteTextView.java */
/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
public class C0176m extends MultiAutoCompleteTextView implements InterfaceC0310t {

    /* renamed from: f */
    private static final int[] f1215f = {R.attr.popupBackground};

    /* renamed from: g */
    private final C0158d f1216g;

    /* renamed from: h */
    private final C0188s f1217h;

    public C0176m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5042p);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0158d c0158d = this.f1216g;
        if (c0158d != null) {
            c0158d.m918b();
        }
        C0188s c0188s = this.f1217h;
        if (c0188s != null) {
            c0188s.m1155b();
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public ColorStateList getSupportBackgroundTintList() {
        C0158d c0158d = this.f1216g;
        if (c0158d != null) {
            return c0158d.m919c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0310t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0158d c0158d = this.f1216g;
        if (c0158d != null) {
            return c0158d.m920d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0170j.m1030a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0158d c0158d = this.f1216g;
        if (c0158d != null) {
            c0158d.m922f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0158d c0158d = this.f1216g;
        if (c0158d != null) {
            c0158d.m923g(i2);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(C0833a.m5262d(getContext(), i2));
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0158d c0158d = this.f1216g;
        if (c0158d != null) {
            c0158d.m925i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0158d c0158d = this.f1216g;
        if (c0158d != null) {
            c0158d.m926j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0188s c0188s = this.f1217h;
        if (c0188s != null) {
            c0188s.m1169q(context, i2);
        }
    }

    public C0176m(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException, IllegalArgumentException {
        super(C0179n0.m1077b(context), attributeSet, i2);
        C0175l0.m1068a(this, getContext());
        C0185q0 c0185q0M1091v = C0185q0.m1091v(getContext(), attributeSet, f1215f, i2, 0);
        if (c0185q0M1091v.m1110s(0)) {
            setDropDownBackgroundDrawable(c0185q0M1091v.m1098g(0));
        }
        c0185q0M1091v.m1111w();
        C0158d c0158d = new C0158d(this);
        this.f1216g = c0158d;
        c0158d.m921e(attributeSet, i2);
        C0188s c0188s = new C0188s(this);
        this.f1217h = c0188s;
        c0188s.m1165m(attributeSet, i2);
        c0188s.m1155b();
    }
}
