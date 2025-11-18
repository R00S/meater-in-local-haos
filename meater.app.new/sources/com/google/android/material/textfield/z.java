package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a0;
import com.google.android.material.internal.CheckableImageButton;
import s1.C4462v;
import s1.X;

/* compiled from: StartCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
class z extends LinearLayout {

    /* renamed from: B, reason: collision with root package name */
    private final TextInputLayout f37454B;

    /* renamed from: C, reason: collision with root package name */
    private final TextView f37455C;

    /* renamed from: D, reason: collision with root package name */
    private CharSequence f37456D;

    /* renamed from: E, reason: collision with root package name */
    private final CheckableImageButton f37457E;

    /* renamed from: F, reason: collision with root package name */
    private ColorStateList f37458F;

    /* renamed from: G, reason: collision with root package name */
    private PorterDuff.Mode f37459G;

    /* renamed from: H, reason: collision with root package name */
    private int f37460H;

    /* renamed from: I, reason: collision with root package name */
    private ImageView.ScaleType f37461I;

    /* renamed from: J, reason: collision with root package name */
    private View.OnLongClickListener f37462J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f37463K;

    z(TextInputLayout textInputLayout, a0 a0Var) {
        super(textInputLayout.getContext());
        this.f37454B = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C7.i.f2511i, (ViewGroup) this, false);
        this.f37457E = checkableImageButton;
        t.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f37455C = appCompatTextView;
        j(a0Var);
        i(a0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void C() {
        int i10 = (this.f37456D == null || this.f37463K) ? 8 : 0;
        setVisibility((this.f37457E.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f37455C.setVisibility(i10);
        this.f37454B.o0();
    }

    private void i(a0 a0Var) {
        this.f37455C.setVisibility(8);
        this.f37455C.setId(C7.g.f2471a0);
        this.f37455C.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        X.p0(this.f37455C, 1);
        o(a0Var.n(C7.m.f2819W8, 0));
        int i10 = C7.m.f2829X8;
        if (a0Var.s(i10)) {
            p(a0Var.c(i10));
        }
        n(a0Var.p(C7.m.f2809V8));
    }

    private void j(a0 a0Var) {
        if (U7.c.j(getContext())) {
            C4462v.c((ViewGroup.MarginLayoutParams) this.f37457E.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        int i10 = C7.m.f2893d9;
        if (a0Var.s(i10)) {
            this.f37458F = U7.c.b(getContext(), a0Var, i10);
        }
        int i11 = C7.m.f2904e9;
        if (a0Var.s(i11)) {
            this.f37459G = com.google.android.material.internal.u.i(a0Var.k(i11, -1), null);
        }
        int i12 = C7.m.f2860a9;
        if (a0Var.s(i12)) {
            s(a0Var.g(i12));
            int i13 = C7.m.f2849Z8;
            if (a0Var.s(i13)) {
                r(a0Var.p(i13));
            }
            q(a0Var.a(C7.m.f2839Y8, true));
        }
        t(a0Var.f(C7.m.f2871b9, getResources().getDimensionPixelSize(C7.e.f2412q0)));
        int i14 = C7.m.f2882c9;
        if (a0Var.s(i14)) {
            w(t.b(a0Var.k(i14, -1)));
        }
    }

    void A(t1.t tVar) {
        if (this.f37455C.getVisibility() != 0) {
            tVar.R0(this.f37457E);
        } else {
            tVar.x0(this.f37455C);
            tVar.R0(this.f37455C);
        }
    }

    void B() {
        EditText editText = this.f37454B.f37251E;
        if (editText == null) {
            return;
        }
        X.C0(this.f37455C, k() ? 0 : X.E(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C7.e.f2374V), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f37456D;
    }

    ColorStateList b() {
        return this.f37455C.getTextColors();
    }

    int c() {
        return X.E(this) + X.E(this.f37455C) + (k() ? this.f37457E.getMeasuredWidth() + C4462v.a((ViewGroup.MarginLayoutParams) this.f37457E.getLayoutParams()) : 0);
    }

    TextView d() {
        return this.f37455C;
    }

    CharSequence e() {
        return this.f37457E.getContentDescription();
    }

    Drawable f() {
        return this.f37457E.getDrawable();
    }

    int g() {
        return this.f37460H;
    }

    ImageView.ScaleType h() {
        return this.f37461I;
    }

    boolean k() {
        return this.f37457E.getVisibility() == 0;
    }

    void l(boolean z10) {
        this.f37463K = z10;
        C();
    }

    void m() {
        t.d(this.f37454B, this.f37457E, this.f37458F);
    }

    void n(CharSequence charSequence) {
        this.f37456D = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f37455C.setText(charSequence);
        C();
    }

    void o(int i10) {
        androidx.core.widget.j.q(this.f37455C, i10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    void p(ColorStateList colorStateList) {
        this.f37455C.setTextColor(colorStateList);
    }

    void q(boolean z10) {
        this.f37457E.setCheckable(z10);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f37457E.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.f37457E.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f37454B, this.f37457E, this.f37458F, this.f37459G);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f37460H) {
            this.f37460H = i10;
            t.g(this.f37457E, i10);
        }
    }

    void u(View.OnClickListener onClickListener) {
        t.h(this.f37457E, onClickListener, this.f37462J);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f37462J = onLongClickListener;
        t.i(this.f37457E, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.f37461I = scaleType;
        t.j(this.f37457E, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f37458F != colorStateList) {
            this.f37458F = colorStateList;
            t.a(this.f37454B, this.f37457E, colorStateList, this.f37459G);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f37459G != mode) {
            this.f37459G = mode;
            t.a(this.f37454B, this.f37457E, this.f37458F, mode);
        }
    }

    void z(boolean z10) {
        if (k() != z10) {
            this.f37457E.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
