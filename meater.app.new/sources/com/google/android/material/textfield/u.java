package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;
import s1.X;

/* compiled from: IndicatorViewController.java */
/* loaded from: classes2.dex */
final class u {

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f37404A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f37405B;

    /* renamed from: a, reason: collision with root package name */
    private final int f37406a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37407b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37408c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f37409d;

    /* renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f37410e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f37411f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f37412g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout f37413h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f37414i;

    /* renamed from: j, reason: collision with root package name */
    private int f37415j;

    /* renamed from: k, reason: collision with root package name */
    private FrameLayout f37416k;

    /* renamed from: l, reason: collision with root package name */
    private Animator f37417l;

    /* renamed from: m, reason: collision with root package name */
    private final float f37418m;

    /* renamed from: n, reason: collision with root package name */
    private int f37419n;

    /* renamed from: o, reason: collision with root package name */
    private int f37420o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f37421p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37422q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f37423r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f37424s;

    /* renamed from: t, reason: collision with root package name */
    private int f37425t;

    /* renamed from: u, reason: collision with root package name */
    private int f37426u;

    /* renamed from: v, reason: collision with root package name */
    private ColorStateList f37427v;

    /* renamed from: w, reason: collision with root package name */
    private CharSequence f37428w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f37429x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f37430y;

    /* renamed from: z, reason: collision with root package name */
    private int f37431z;

    /* compiled from: IndicatorViewController.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37432a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f37433b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37434c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f37435d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f37432a = i10;
            this.f37433b = textView;
            this.f37434c = i11;
            this.f37435d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f37419n = this.f37432a;
            u.this.f37417l = null;
            TextView textView = this.f37433b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f37434c == 1 && u.this.f37423r != null) {
                    u.this.f37423r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f37435d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f37435d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f37435d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f37435d.setAlpha(0.0f);
            }
        }
    }

    /* compiled from: IndicatorViewController.java */
    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f37413h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f37412g = context;
        this.f37413h = textInputLayout;
        this.f37418m = context.getResources().getDimensionPixelSize(C7.e.f2409p);
        int i10 = C7.c.f2289M;
        this.f37406a = R7.i.f(context, i10, 217);
        this.f37407b = R7.i.f(context, C7.c.f2285I, 167);
        this.f37408c = R7.i.f(context, i10, 167);
        int i11 = C7.c.f2291O;
        this.f37409d = R7.i.g(context, i11, D7.a.f3489d);
        TimeInterpolator timeInterpolator = D7.a.f3486a;
        this.f37410e = R7.i.g(context, i11, timeInterpolator);
        this.f37411f = R7.i.g(context, C7.c.f2293Q, timeInterpolator);
    }

    private void D(int i10, int i11) {
        TextView textViewM;
        TextView textViewM2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM2 = m(i11)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM = m(i10)) != null) {
            textViewM.setVisibility(4);
            if (i10 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f37419n = i11;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        return X.R(this.f37413h) && this.f37413h.isEnabled() && !(this.f37420o == this.f37419n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int i10, int i11, boolean z10) {
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f37417l = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f37429x, this.f37430y, 2, i10, i11);
            i(arrayList, this.f37422q, this.f37423r, 1, i10, i11);
            D7.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            D(i10, i11);
        }
        this.f37413h.p0();
        this.f37413h.u0(z10);
        this.f37413h.A0();
    }

    private boolean g() {
        return (this.f37414i == null || this.f37413h.getEditText() == null) ? false : true;
    }

    private void i(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f37408c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f37408c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f37407b : this.f37408c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f37410e : this.f37411f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f37418m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f37406a);
        objectAnimatorOfFloat.setInterpolator(this.f37409d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f37423r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f37430y;
    }

    private int v(boolean z10, int i10, int i11) {
        return z10 ? this.f37412g.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean y(int i10) {
        return (i10 != 1 || this.f37423r == null || TextUtils.isEmpty(this.f37421p)) ? false : true;
    }

    boolean A() {
        return this.f37422q;
    }

    boolean B() {
        return this.f37429x;
    }

    void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f37414i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f37416k) == null) {
            this.f37414i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f37415j - 1;
        this.f37415j = i11;
        O(this.f37414i, i11);
    }

    void E(int i10) {
        this.f37425t = i10;
        TextView textView = this.f37423r;
        if (textView != null) {
            X.p0(textView, i10);
        }
    }

    void F(CharSequence charSequence) {
        this.f37424s = charSequence;
        TextView textView = this.f37423r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z10) {
        if (this.f37422q == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f37412g);
            this.f37423r = appCompatTextView;
            appCompatTextView.setId(C7.g.f2467X);
            this.f37423r.setTextAlignment(5);
            Typeface typeface = this.f37405B;
            if (typeface != null) {
                this.f37423r.setTypeface(typeface);
            }
            H(this.f37426u);
            I(this.f37427v);
            F(this.f37424s);
            E(this.f37425t);
            this.f37423r.setVisibility(4);
            e(this.f37423r, 0);
        } else {
            w();
            C(this.f37423r, 0);
            this.f37423r = null;
            this.f37413h.p0();
            this.f37413h.A0();
        }
        this.f37422q = z10;
    }

    void H(int i10) {
        this.f37426u = i10;
        TextView textView = this.f37423r;
        if (textView != null) {
            this.f37413h.c0(textView, i10);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f37427v = colorStateList;
        TextView textView = this.f37423r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i10) {
        this.f37431z = i10;
        TextView textView = this.f37430y;
        if (textView != null) {
            androidx.core.widget.j.q(textView, i10);
        }
    }

    void K(boolean z10) {
        if (this.f37429x == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f37412g);
            this.f37430y = appCompatTextView;
            appCompatTextView.setId(C7.g.f2468Y);
            this.f37430y.setTextAlignment(5);
            Typeface typeface = this.f37405B;
            if (typeface != null) {
                this.f37430y.setTypeface(typeface);
            }
            this.f37430y.setVisibility(4);
            X.p0(this.f37430y, 1);
            J(this.f37431z);
            L(this.f37404A);
            e(this.f37430y, 1);
            this.f37430y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f37430y, 1);
            this.f37430y = null;
            this.f37413h.p0();
            this.f37413h.A0();
        }
        this.f37429x = z10;
    }

    void L(ColorStateList colorStateList) {
        this.f37404A = colorStateList;
        TextView textView = this.f37430y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.f37405B) {
            this.f37405B = typeface;
            M(this.f37423r, typeface);
            M(this.f37430y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.f37421p = charSequence;
        this.f37423r.setText(charSequence);
        int i10 = this.f37419n;
        if (i10 != 1) {
            this.f37420o = 1;
        }
        S(i10, this.f37420o, P(this.f37423r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f37428w = charSequence;
        this.f37430y.setText(charSequence);
        int i10 = this.f37419n;
        if (i10 != 2) {
            this.f37420o = 2;
        }
        S(i10, this.f37420o, P(this.f37430y, charSequence));
    }

    void e(TextView textView, int i10) {
        if (this.f37414i == null && this.f37416k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f37412g);
            this.f37414i = linearLayout;
            linearLayout.setOrientation(0);
            this.f37413h.addView(this.f37414i, -1, -2);
            this.f37416k = new FrameLayout(this.f37412g);
            this.f37414i.addView(this.f37416k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f37413h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f37416k.setVisibility(0);
            this.f37416k.addView(textView);
        } else {
            this.f37414i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f37414i.setVisibility(0);
        this.f37415j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f37413h.getEditText();
            boolean zJ = U7.c.j(this.f37412g);
            LinearLayout linearLayout = this.f37414i;
            int i10 = C7.e.f2372T;
            X.C0(linearLayout, v(zJ, i10, X.E(editText)), v(zJ, C7.e.f2373U, this.f37412g.getResources().getDimensionPixelSize(C7.e.f2371S)), v(zJ, i10, X.D(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f37417l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f37420o);
    }

    int n() {
        return this.f37425t;
    }

    CharSequence o() {
        return this.f37424s;
    }

    CharSequence p() {
        return this.f37421p;
    }

    int q() {
        TextView textView = this.f37423r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f37423r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f37428w;
    }

    View t() {
        return this.f37430y;
    }

    int u() {
        TextView textView = this.f37430y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f37421p = null;
        h();
        if (this.f37419n == 1) {
            if (!this.f37429x || TextUtils.isEmpty(this.f37428w)) {
                this.f37420o = 0;
            } else {
                this.f37420o = 2;
            }
        }
        S(this.f37419n, this.f37420o, P(this.f37423r, ""));
    }

    void x() {
        h();
        int i10 = this.f37419n;
        if (i10 == 2) {
            this.f37420o = 0;
        }
        S(i10, this.f37420o, P(this.f37430y, ""));
    }

    boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
