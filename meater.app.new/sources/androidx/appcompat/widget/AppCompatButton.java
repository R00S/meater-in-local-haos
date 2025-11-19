package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements androidx.core.widget.b {

    /* renamed from: B, reason: collision with root package name */
    private final C1983e f21197B;

    /* renamed from: C, reason: collision with root package name */
    private final C2001x f21198C;

    /* renamed from: D, reason: collision with root package name */
    private C1989k f21199D;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42410q);
    }

    private C1989k getEmojiTextViewHelper() {
        if (this.f21199D == null) {
            this.f21199D = new C1989k(this);
        }
        return this.f21199D;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1983e c1983e = this.f21197B;
        if (c1983e != null) {
            c1983e.b();
        }
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            c2001x.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (h0.f21702c) {
            return super.getAutoSizeMaxTextSize();
        }
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            return c2001x.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (h0.f21702c) {
            return super.getAutoSizeMinTextSize();
        }
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            return c2001x.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (h0.f21702c) {
            return super.getAutoSizeStepGranularity();
        }
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            return c2001x.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (h0.f21702c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C2001x c2001x = this.f21198C;
        return c2001x != null ? c2001x.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (h0.f21702c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            return c2001x.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.s(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1983e c1983e = this.f21197B;
        if (c1983e != null) {
            return c1983e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1983e c1983e = this.f21197B;
        if (c1983e != null) {
            return c1983e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21198C.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21198C.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            c2001x.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C2001x c2001x = this.f21198C;
        if (c2001x == null || h0.f21702c || !c2001x.l()) {
            return;
        }
        this.f21198C.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (h0.f21702c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            c2001x.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (h0.f21702c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            c2001x.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (h0.f21702c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            c2001x.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1983e c1983e = this.f21197B;
        if (c1983e != null) {
            c1983e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1983e c1983e = this.f21197B;
        if (c1983e != null) {
            c1983e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.t(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            c2001x.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1983e c1983e = this.f21197B;
        if (c1983e != null) {
            c1983e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1983e c1983e = this.f21197B;
        if (c1983e != null) {
            c1983e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f21198C.w(colorStateList);
        this.f21198C.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f21198C.x(mode);
        this.f21198C.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            c2001x.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (h0.f21702c) {
            super.setTextSize(i10, f10);
            return;
        }
        C2001x c2001x = this.f21198C;
        if (c2001x != null) {
            c2001x.A(i10, f10);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        V.a(this, getContext());
        C1983e c1983e = new C1983e(this);
        this.f21197B = c1983e;
        c1983e.e(attributeSet, i10);
        C2001x c2001x = new C2001x(this);
        this.f21198C = c2001x;
        c2001x.m(attributeSet, i10);
        c2001x.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
