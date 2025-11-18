package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.InterfaceC0310t;
import androidx.core.widget.C0330k;
import androidx.core.widget.InterfaceC0323d;
import androidx.core.widget.InterfaceC0332m;
import java.lang.reflect.InvocationTargetException;
import p024c.p025a.C0823a;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC0310t, InterfaceC0323d, InterfaceC0332m {

    /* renamed from: f */
    private final C0158d f799f;

    /* renamed from: g */
    private final C0188s f800g;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5043q);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0158d c0158d = this.f799f;
        if (c0158d != null) {
            c0158d.m918b();
        }
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            c0188s.m1155b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0323d.f2508a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            return c0188s.m1157e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0323d.f2508a) {
            return super.getAutoSizeMinTextSize();
        }
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            return c0188s.m1158f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0323d.f2508a) {
            return super.getAutoSizeStepGranularity();
        }
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            return c0188s.m1159g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0323d.f2508a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0188s c0188s = this.f800g;
        return c0188s != null ? c0188s.m1160h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0323d.f2508a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            return c0188s.m1161i();
        }
        return 0;
    }

    @Override // androidx.core.view.InterfaceC0310t
    public ColorStateList getSupportBackgroundTintList() {
        C0158d c0158d = this.f799f;
        if (c0158d != null) {
            return c0158d.m919c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0310t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0158d c0158d = this.f799f;
        if (c0158d != null) {
            return c0158d.m920d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f800g.m1162j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f800g.m1163k();
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
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            c0188s.m1167o(z, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0188s c0188s = this.f800g;
        if (c0188s == null || InterfaceC0323d.f2508a || !c0188s.m1164l()) {
            return;
        }
        this.f800g.m1156c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (InterfaceC0323d.f2508a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            c0188s.m1171s(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) throws IllegalArgumentException {
        if (InterfaceC0323d.f2508a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            c0188s.m1172t(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) throws IllegalArgumentException {
        if (InterfaceC0323d.f2508a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            c0188s.m1173u(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0158d c0158d = this.f799f;
        if (c0158d != null) {
            c0158d.m922f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0158d c0158d = this.f799f;
        if (c0158d != null) {
            c0158d.m923g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0330k.m2335p(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            c0188s.m1170r(z);
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0158d c0158d = this.f799f;
        if (c0158d != null) {
            c0158d.m925i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0158d c0158d = this.f799f;
        if (c0158d != null) {
            c0158d.m926j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0332m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f800g.m1174v(colorStateList);
        this.f800g.m1155b();
    }

    @Override // androidx.core.widget.InterfaceC0332m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f800g.m1175w(mode);
        this.f800g.m1155b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            c0188s.m1169q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (InterfaceC0323d.f2508a) {
            super.setTextSize(i2, f2);
            return;
        }
        C0188s c0188s = this.f800g;
        if (c0188s != null) {
            c0188s.m1176z(i2, f2);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException, IllegalArgumentException {
        super(C0179n0.m1077b(context), attributeSet, i2);
        C0175l0.m1068a(this, getContext());
        C0158d c0158d = new C0158d(this);
        this.f799f = c0158d;
        c0158d.m921e(attributeSet, i2);
        C0188s c0188s = new C0188s(this);
        this.f800g = c0188s;
        c0188s.m1165m(attributeSet, i2);
        c0188s.m1155b();
    }
}
