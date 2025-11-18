package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.view.InterfaceC0310t;
import androidx.core.widget.C0330k;
import androidx.core.widget.InterfaceC0323d;
import androidx.core.widget.InterfaceC0332m;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p052i.p053e.C0926d;
import p024c.p052i.p058i.C0947c;

/* compiled from: AppCompatTextView.java */
/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
public class C0190t extends TextView implements InterfaceC0310t, InterfaceC0332m, InterfaceC0323d {

    /* renamed from: f */
    private final C0158d f1283f;

    /* renamed from: g */
    private final C0188s f1284g;

    /* renamed from: h */
    private final C0186r f1285h;

    /* renamed from: i */
    private Future<C0947c> f1286i;

    public C0190t(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m1180c() {
        Future<C0947c> future = this.f1286i;
        if (future != null) {
            try {
                this.f1286i = null;
                C0330k.m2332m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0158d c0158d = this.f1283f;
        if (c0158d != null) {
            c0158d.m918b();
        }
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            c0188s.m1155b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0323d.f2508a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0188s c0188s = this.f1284g;
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
        C0188s c0188s = this.f1284g;
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
        C0188s c0188s = this.f1284g;
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
        C0188s c0188s = this.f1284g;
        return c0188s != null ? c0188s.m1160h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0323d.f2508a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            return c0188s.m1161i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C0330k.m2321b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C0330k.m2322c(this);
    }

    @Override // androidx.core.view.InterfaceC0310t
    public ColorStateList getSupportBackgroundTintList() {
        C0158d c0158d = this.f1283f;
        if (c0158d != null) {
            return c0158d.m919c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0310t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0158d c0158d = this.f1283f;
        if (c0158d != null) {
            return c0158d.m920d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1284g.m1162j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1284g.m1163k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m1180c();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0186r c0186r;
        return (Build.VERSION.SDK_INT >= 28 || (c0186r = this.f1285h) == null) ? super.getTextClassifier() : c0186r.m1112a();
    }

    public C0947c.a getTextMetricsParamsCompat() {
        return C0330k.m2325f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0170j.m1030a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            c0188s.m1167o(z, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        m1180c();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0188s c0188s = this.f1284g;
        if (c0188s == null || InterfaceC0323d.f2508a || !c0188s.m1164l()) {
            return;
        }
        this.f1284g.m1156c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (InterfaceC0323d.f2508a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0188s c0188s = this.f1284g;
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
        C0188s c0188s = this.f1284g;
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
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            c0188s.m1173u(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0158d c0158d = this.f1283f;
        if (c0158d != null) {
            c0158d.m922f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0158d c0158d = this.f1283f;
        if (c0158d != null) {
            c0158d.m923g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            c0188s.m1168p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            c0188s.m1168p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            c0188s.m1168p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            c0188s.m1168p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0330k.m2335p(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            C0330k.m2329j(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            C0330k.m2330k(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        C0330k.m2331l(this, i2);
    }

    public void setPrecomputedText(C0947c c0947c) {
        C0330k.m2332m(this, c0947c);
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0158d c0158d = this.f1283f;
        if (c0158d != null) {
            c0158d.m925i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0158d c0158d = this.f1283f;
        if (c0158d != null) {
            c0158d.m926j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0332m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1284g.m1174v(colorStateList);
        this.f1284g.m1155b();
    }

    @Override // androidx.core.widget.InterfaceC0332m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1284g.m1175w(mode);
        this.f1284g.m1155b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            c0188s.m1169q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0186r c0186r;
        if (Build.VERSION.SDK_INT >= 28 || (c0186r = this.f1285h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0186r.m1113b(textClassifier);
        }
    }

    public void setTextFuture(Future<C0947c> future) {
        this.f1286i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0947c.a aVar) {
        C0330k.m2334o(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (InterfaceC0323d.f2508a) {
            super.setTextSize(i2, f2);
            return;
        }
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            c0188s.m1176z(i2, f2);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i2) {
        Typeface typefaceM5908a = (typeface == null || i2 <= 0) ? null : C0926d.m5908a(getContext(), typeface, i2);
        if (typefaceM5908a != null) {
            typeface = typefaceM5908a;
        }
        super.setTypeface(typeface, i2);
    }

    public C0190t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C0190t(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException, IllegalArgumentException {
        super(C0179n0.m1077b(context), attributeSet, i2);
        C0175l0.m1068a(this, getContext());
        C0158d c0158d = new C0158d(this);
        this.f1283f = c0158d;
        c0158d.m921e(attributeSet, i2);
        C0188s c0188s = new C0188s(this);
        this.f1284g = c0188s;
        c0188s.m1165m(attributeSet, i2);
        c0188s.m1155b();
        this.f1285h = new C0186r(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? C0833a.m5262d(context, i2) : null, i3 != 0 ? C0833a.m5262d(context, i3) : null, i4 != 0 ? C0833a.m5262d(context, i4) : null, i5 != 0 ? C0833a.m5262d(context, i5) : null);
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            c0188s.m1168p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? C0833a.m5262d(context, i2) : null, i3 != 0 ? C0833a.m5262d(context, i3) : null, i4 != 0 ? C0833a.m5262d(context, i4) : null, i5 != 0 ? C0833a.m5262d(context, i5) : null);
        C0188s c0188s = this.f1284g;
        if (c0188s != null) {
            c0188s.m1168p();
        }
    }
}
